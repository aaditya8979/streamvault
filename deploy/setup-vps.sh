#!/bin/bash
# ─────────────────────────────────────────────────────────────────────────────
# StreamVault P2P Server — Oracle Cloud Always Free Deployment
# ─────────────────────────────────────────────────────────────────────────────
#
# This script sets up the P2P signing server on Oracle Cloud's PERMANENT free tier:
#   • 4x ARM Ampere A1 cores
#   • 24 GB RAM
#   • 200 GB boot volume
#   • 10 TB/month outbound transfer
#   Total cost: $0/month forever (not a trial!)
#
# Prerequisites:
#   1. Create an Oracle Cloud account: https://cloud.oracle.com/
#   2. Create an ARM-based Compute instance (Ampere A1.Flex, 4 OCPU, 24GB RAM)
#   3. SSH into the instance and run this script
#
# Usage:
#   chmod +x setup-vps.sh
#   sudo ./setup-vps.sh
# ─────────────────────────────────────────────────────────────────────────────

set -euo pipefail

echo "🚀 StreamVault P2P Server — Oracle Cloud Setup"
echo "================================================"

# ── Step 1: System Deps ──────────────────────────────────────────────────────
echo ""
echo "📦 Step 1: Installing system dependencies..."
apt-get update -qq
apt-get install -y -qq \
  docker.io docker-compose-v2 \
  nginx certbot python3-certbot-nginx \
  curl wget unzip jq

# Enable Docker
systemctl enable docker
systemctl start docker

echo "✅ Docker $(docker --version | awk '{print $3}') installed"

# ── Step 2: Android Emulator Container ───────────────────────────────────────
echo ""
echo "📱 Step 2: Setting up Android emulator container..."

mkdir -p /opt/streamvault-p2p
cd /opt/streamvault-p2p

# Create docker-compose for the P2P server
cat > docker-compose.yml << 'COMPOSE_EOF'
version: "3.8"

services:
  android-p2p:
    image: budtmo/docker-android:emulator_14.0
    privileged: true
    ports:
      - "127.0.0.1:6080:6080"   # noVNC (debug)
      - "127.0.0.1:7000:7000"   # P2P signing server
      - "127.0.0.1:5555:5555"   # ADB
    environment:
      - EMULATOR_DEVICE=pixel_7
      - WEB_VNC=true
      - DATAPARTITION=4g
      - GPU_MODE=swiftshader_indirect
    volumes:
      - android-data:/root/.android
      - ./apk:/opt/apk
    healthcheck:
      test: ["CMD", "curl", "-sf", "http://localhost:7000/control?msg=verify&device_id=test&ts=0"]
      interval: 30s
      timeout: 10s
      retries: 5
      start_period: 120s
    restart: unless-stopped
    deploy:
      resources:
        limits:
          memory: 8G
          cpus: "3.0"

volumes:
  android-data:
COMPOSE_EOF

echo "✅ docker-compose.yml created"

# ── Step 3: APK Setup Script ────────────────────────────────────────────────
cat > setup-apk.sh << 'APK_EOF'
#!/bin/bash
# Run AFTER the emulator container is up and booted
set -e

echo "⏳ Waiting for emulator to boot..."
docker compose exec android-p2p bash -c '
  while [ "$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d "\r")" != "1" ]; do
    sleep 5
    echo -n "."
  done
  echo " Booted!"

  # Install Filmin APK
  if [ -f /opt/apk/filmin.apk ]; then
    echo "📲 Installing Filmin APK..."
    adb install -r /opt/apk/filmin.apk
    echo "✅ APK installed"
  else
    echo "⚠️  Place filmin.apk in /opt/streamvault-p2p/apk/"
    exit 1
  fi

  # Launch the app (starts P2P server)
  echo "🚀 Launching Filmin app..."
  adb shell am start -n com.dramarush.shortin/com.mgs.carparking.ui.MainActivity
  sleep 8

  # Forward P2P port inside container
  adb forward tcp:7000 tcp:7000

  # Get Android ID
  ANDROID_ID=$(adb shell settings get secure android_id | tr -d "\r\n")
  echo ""
  echo "🎉 P2P Server Online!"
  echo "   Android ID: $ANDROID_ID"
  echo ""
  echo "Set this in your Vercel environment:"
  echo "   FILMIN_ANDROID_ID=$ANDROID_ID"
'
APK_EOF
chmod +x setup-apk.sh

echo "✅ setup-apk.sh created"

# ── Step 4: Nginx Reverse Proxy ─────────────────────────────────────────────
echo ""
echo "🔧 Step 4: Configuring Nginx reverse proxy..."

# The user should set their domain here
DOMAIN="${P2P_DOMAIN:-p2p.streamvault.app}"

cat > /etc/nginx/sites-available/streamvault-p2p << NGINX_EOF
server {
    listen 80;
    server_name ${DOMAIN};

    # API key validation (set via header from Vercel)
    set \$api_key "${P2P_API_KEY:-changeme_$(openssl rand -hex 16)}";

    location / {
        # Validate API key
        if (\$http_x_p2p_key != \$api_key) {
            return 403;
        }

        proxy_pass http://127.0.0.1:7000;
        proxy_set_header Host \$host;
        proxy_set_header X-Real-IP \$remote_addr;
        proxy_buffering off;
        proxy_read_timeout 120s;
        proxy_connect_timeout 30s;

        # Large buffer for HLS segments
        proxy_buffer_size 128k;
        proxy_buffers 4 256k;

        # CORS for StreamVault frontend
        add_header Access-Control-Allow-Origin "*" always;
        add_header Access-Control-Allow-Methods "GET, OPTIONS" always;
        add_header Access-Control-Allow-Headers "X-P2P-Key" always;

        if (\$request_method = OPTIONS) {
            return 204;
        }
    }

    # Rate limiting
    limit_req_zone \$binary_remote_addr zone=p2p:10m rate=30r/s;
    limit_req zone=p2p burst=50 nodelay;
}
NGINX_EOF

ln -sf /etc/nginx/sites-available/streamvault-p2p /etc/nginx/sites-enabled/
rm -f /etc/nginx/sites-enabled/default
nginx -t && systemctl restart nginx

echo "✅ Nginx configured for ${DOMAIN}"

# ── Step 5: SSL with Let's Encrypt ───────────────────────────────────────────
echo ""
echo "🔒 Step 5: SSL certificate..."
echo "Run: sudo certbot --nginx -d ${DOMAIN}"
echo "(Skipping in script — requires DNS to be pointed first)"

# ── Step 6: Firewall ─────────────────────────────────────────────────────────
echo ""
echo "🛡️  Step 6: Configuring firewall..."
# Oracle Cloud uses iptables, not ufw
iptables -I INPUT -p tcp --dport 80 -j ACCEPT
iptables -I INPUT -p tcp --dport 443 -j ACCEPT
# Block direct access to P2P port from outside
iptables -D INPUT -p tcp --dport 7000 -j ACCEPT 2>/dev/null || true

echo "✅ Firewall configured"

# ── Step 7: Auto-restart on boot ─────────────────────────────────────────────
cat > /etc/systemd/system/streamvault-p2p.service << SYSTEMD_EOF
[Unit]
Description=StreamVault P2P Server (Android Emulator)
Requires=docker.service
After=docker.service

[Service]
Type=oneshot
RemainAfterExit=yes
WorkingDirectory=/opt/streamvault-p2p
ExecStart=/usr/bin/docker compose up -d
ExecStop=/usr/bin/docker compose down
TimeoutStartSec=180

[Install]
WantedBy=multi-user.target
SYSTEMD_EOF

systemctl daemon-reload
systemctl enable streamvault-p2p

echo "✅ Systemd service created (auto-starts on boot)"

# ── Done ─────────────────────────────────────────────────────────────────────
echo ""
echo "═══════════════════════════════════════════════════════════════"
echo "🎉 StreamVault P2P Server Setup Complete!"
echo "═══════════════════════════════════════════════════════════════"
echo ""
echo "Next steps:"
echo "  1. Copy your Filmin APK to /opt/streamvault-p2p/apk/filmin.apk"
echo "  2. Start the container:  docker compose up -d"
echo "  3. Wait ~2min for boot, then run: ./setup-apk.sh"
echo "  4. Point DNS ${DOMAIN} → this server's IP"
echo "  5. Run: sudo certbot --nginx -d ${DOMAIN}"
echo ""
echo "Environment variables for Vercel:"
echo "  FILMIN_P2P_HOST=${DOMAIN}"
echo "  FILMIN_P2P_PORT=443"
echo "  FILMIN_P2P_PROTOCOL=https"
echo "  FILMIN_ANDROID_ID=<from setup-apk.sh output>"
echo ""
