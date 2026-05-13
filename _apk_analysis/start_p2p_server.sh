#!/bin/bash
# StreamVault Filmin P2P Server — Start the Android emulator for direct CDN streaming
#
# This script starts the Android emulator which runs the P2P signing server.
# The server provides authenticated CDN access for Filmin video content.
#
# The emulator runs in the background with the Filmin APK installed.
# The P2P server listens on port 7000 and provides:
#   - /control?msg=verify&device_id={id}{vodId}&ts={ts} → returns sign for API auth
#   - /resource.m3u8?src={base64(cdnUrl)} → proxied HLS stream
#
# Usage:
#   ./start_p2p_server.sh        # Start the server
#   ./start_p2p_server.sh stop   # Stop the server
#   ./start_p2p_server.sh status # Check server status

set -e

export ANDROID_HOME=/opt/homebrew/share/android-commandlinetools
export ANDROID_SDK_ROOT=$ANDROID_HOME
export PATH="$ANDROID_HOME/platform-tools:$ANDROID_HOME/emulator:$ANDROID_HOME/cmdline-tools/latest/bin:$PATH"

AVD_NAME="filmin_mitm"
P2P_PORT=7000

case "${1:-start}" in
  start)
    echo "🚀 Starting Filmin P2P server..."
    
    # Check if emulator is already running
    if adb devices 2>/dev/null | grep -q "emulator"; then
      echo "✅ Emulator already running"
      # Forward port
      adb forward tcp:$P2P_PORT tcp:$P2P_PORT 2>/dev/null || true
      
      # Verify P2P server
      SIGN=$(curl -s "http://127.0.0.1:$P2P_PORT/control?msg=verify&device_id=test&ts=0" 2>/dev/null)
      if [ -n "$SIGN" ]; then
        echo "✅ P2P server online (sign: $SIGN)"
        echo ""
        echo "StreamVault is ready for direct streaming!"
        echo "  Port: $P2P_PORT"
        echo "  Android ID: $(adb shell settings get secure android_id | tr -d '\r\n')"
      else
        echo "⚠️  P2P server not responding. Launching Filmin app..."
        adb shell am start -n com.dramarush.shortin/com.mgs.carparking.ui.MainActivity 2>/dev/null
        sleep 8
        adb forward tcp:$P2P_PORT tcp:$P2P_PORT 2>/dev/null || true
      fi
      exit 0
    fi
    
    # Start emulator
    echo "📱 Launching Android emulator..."
    emulator -avd "$AVD_NAME" -no-audio -no-window -gpu swiftshader_indirect -writable-system -no-snapshot &
    EMU_PID=$!
    echo "   PID: $EMU_PID"
    
    # Wait for boot
    echo "⏳ Waiting for boot..."
    adb wait-for-device
    while [ "$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')" != "1" ]; do
      sleep 5
      echo -n "."
    done
    echo " Booted!"
    
    # Launch Filmin app (starts P2P server)
    echo "📲 Launching Filmin app..."
    adb shell am start -n com.dramarush.shortin/com.mgs.carparking.ui.MainActivity 2>/dev/null
    sleep 8
    
    # Forward P2P port
    echo "🔗 Forwarding port $P2P_PORT..."
    adb forward tcp:$P2P_PORT tcp:$P2P_PORT
    
    # Verify
    SIGN=$(curl -s "http://127.0.0.1:$P2P_PORT/control?msg=verify&device_id=test&ts=0" 2>/dev/null)
    if [ -n "$SIGN" ]; then
      ANDROID_ID=$(adb shell settings get secure android_id | tr -d '\r\n')
      echo ""
      echo "🎉 P2P server ONLINE!"
      echo "   Port: $P2P_PORT"
      echo "   Android ID: $ANDROID_ID"
      echo ""
      echo "Set environment variables for StreamVault:"
      echo "  export FILMIN_ANDROID_ID=$ANDROID_ID"
      echo "  export FILMIN_P2P_PORT=$P2P_PORT"
      echo ""
      echo "Test: curl http://127.0.0.1:$P2P_PORT/control?msg=verify&device_id=${ANDROID_ID}555064&ts=$(date +%s%N | cut -b1-13)"
    else
      echo "❌ P2P server failed to start"
      exit 1
    fi
    ;;
    
  stop)
    echo "🛑 Stopping Filmin P2P server..."
    adb emu kill 2>/dev/null || true
    echo "✅ Emulator stopped"
    ;;
    
  status)
    if ! adb devices 2>/dev/null | grep -q "emulator"; then
      echo "❌ Emulator not running"
      exit 1
    fi
    
    adb forward tcp:$P2P_PORT tcp:$P2P_PORT 2>/dev/null || true
    SIGN=$(curl -s "http://127.0.0.1:$P2P_PORT/control?msg=verify&device_id=test&ts=0" 2>/dev/null)
    if [ -n "$SIGN" ]; then
      ANDROID_ID=$(adb shell settings get secure android_id | tr -d '\r\n')
      echo "✅ P2P server ONLINE"
      echo "   Port: $P2P_PORT"
      echo "   Android ID: $ANDROID_ID"
    else
      echo "⚠️  Emulator running but P2P server not responding"
    fi
    ;;
    
  *)
    echo "Usage: $0 [start|stop|status]"
    exit 1
    ;;
esac
