#!/bin/bash
# Filmin CDN URL Extraction via Android Emulator + MITM
# This script:
# 1. Creates an Android AVD
# 2. Starts the emulator with proxy settings
# 3. Installs the Filmin APK
# 4. Captures network traffic to extract CDN URLs

set -e

export ANDROID_HOME=/opt/homebrew/share/android-commandlinetools
export ANDROID_SDK_ROOT=$ANDROID_HOME
export PATH="$ANDROID_HOME/platform-tools:$ANDROID_HOME/emulator:$ANDROID_HOME/cmdline-tools/latest/bin:$PATH"

APK_PATH="$(cd "$(dirname "$0")" && pwd)/filmin.apk"
AVD_NAME="filmin_mitm"

echo "=== Step 1: Create AVD ==="
echo "no" | avdmanager create avd -n "$AVD_NAME" -k "system-images;android-33;google_apis;arm64-v8a" --force
echo "AVD created: $AVD_NAME"

echo ""
echo "=== Step 2: Start Emulator ==="
# Start emulator in background with writable system and no snapshot
emulator -avd "$AVD_NAME" -writable-system -no-snapshot -no-audio -no-window -gpu swiftshader_indirect &
EMU_PID=$!
echo "Emulator PID: $EMU_PID"

# Wait for boot
echo "Waiting for emulator to boot..."
adb wait-for-device
sleep 5

# Wait for boot_completed
while [ "$(adb shell getprop sys.boot_completed 2>/dev/null | tr -d '\r')" != "1" ]; do
  sleep 2
  echo -n "."
done
echo ""
echo "Emulator booted!"

echo ""
echo "=== Step 3: Install APK ==="
adb install -r "$APK_PATH"
echo "APK installed!"

echo ""
echo "=== Step 4: Start Traffic Capture ==="
# We'll use tcpdump on the emulator to capture traffic
adb shell "tcpdump -i any -w /sdcard/capture.pcap -c 1000 &" &

echo ""
echo "=== Step 5: Launch App ==="
adb shell am start -n com.mgs.carparking/.ui.MainActivity
sleep 10

echo ""
echo "=== Step 6: Monitor Network Traffic ==="
echo "Watching for CloudFront URLs..."

# Monitor logcat for URLs
adb logcat -v time | grep -iE "cloudfront|\.m3u8|\.mp4|cdn|setasetaseta|wangyi" &
LOG_PID=$!

echo "Monitoring... Press Ctrl+C to stop."
echo "Look for URLs containing 'cloudfront.net' or '.m3u8'"

# Keep running until user stops
wait $LOG_PID
