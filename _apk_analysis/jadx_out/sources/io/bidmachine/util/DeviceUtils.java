package io.bidmachine.util;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.ironsource.C3978d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DeviceUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0015\u001a\u00020\u0006H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\rH\u0007J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0007J\b\u0010\u001f\u001a\u00020\u0006H\u0007J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010!\u001a\u00020\u0006H\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0012J\u0010\u0010'\u001a\u00020(2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u0010,\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0017\u0010.\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0017\u0010/\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0010\u00100\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0017\u00101\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0010\u00102\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u00103\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u00104\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0010\u00105\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u00066"}, d2 = {"Lio/bidmachine/util/DeviceUtils;", "", "()V", "MIN_TABLET_DP", "", "hwv", "", "isDeviceRooted", "", "Ljava/lang/Boolean;", "getActiveNetworkCapabilities", "Landroid/net/NetworkCapabilities;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getActiveNetworkInfo", "Landroid/net/NetworkInfo;", "getBatteryLevel", "", "(Landroid/content/Context;)Ljava/lang/Double;", "getBluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBuildId", "getConfiguration", "Landroid/content/res/Configuration;", "getDeviceName", "getDisplayMetrics", "Landroid/util/DisplayMetrics;", "getHWV", "getKernelVersionThroughProcVersion", "getKernelVersionThroughUName", "getManufacturer", "getModel", "getOrientation", "getOsVersion", "getPhoneMCCMNC", "getPhoneOperatorName", "getScreenBrightness", "(Landroid/content/Context;)Ljava/lang/Integer;", "getScreenBrightnessRatio", "getScreenDensity", "", "getScreenOrientation", "getScreenSize", "Landroid/graphics/Point;", "isAirplaneModeOn", "(Landroid/content/Context;)Ljava/lang/Boolean;", "isBatterySaverEnabled", C3978d4.j.f31398k0, "isDarkModeEnabled", "isDoNotDisturbOn", "isLandscapeOrientation", "isNetworkAvailable", "isRingMuted", "isTablet", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceUtils {

    @NotNull
    public static final DeviceUtils INSTANCE = new DeviceUtils();
    private static final int MIN_TABLET_DP = 600;

    @Nullable
    private static String hwv;

    @Nullable
    private static Boolean isDeviceRooted;

    private DeviceUtils() {
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_NETWORK_STATE")
    @RequiresApi(api = 23)
    @Nullable
    public static final NetworkCapabilities getActiveNetworkCapabilities(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getActiveNetworkCapabilities(context);
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_NETWORK_STATE")
    @Nullable
    public static final NetworkInfo getActiveNetworkInfo(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getActiveNetworkInfo(context);
    }

    @Nullable
    public static final Double getBatteryLevel(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getBatteryLevel(context);
    }

    @RequiresPermission(conditional = true, value = "android.permission.BLUETOOTH_CONNECT")
    @Nullable
    public static final BluetoothAdapter getBluetoothAdapter(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getBluetoothAdapter(context);
    }

    @NotNull
    public static final String getBuildId() {
        String str = Build.ID;
        p.j(str, "ID");
        return str;
    }

    @NotNull
    public static final Configuration getConfiguration(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getConfiguration(context);
    }

    @RequiresPermission(conditional = true, value = "android.permission.BLUETOOTH_CONNECT")
    @Nullable
    public static final String getDeviceName(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getDeviceName(context);
    }

    @NotNull
    public static final DisplayMetrics getDisplayMetrics(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getDisplayMetrics(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getHWV() throws java.lang.Throwable {
        /*
            java.lang.String r0 = io.bidmachine.util.DeviceUtils.hwv
            if (r0 == 0) goto L5
            return r0
        L5:
            io.bidmachine.util.DeviceUtils r0 = io.bidmachine.util.DeviceUtils.INSTANCE
            java.lang.String r1 = r0.getKernelVersionThroughProcVersion()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            int r4 = r1.length()
            if (r4 <= 0) goto L17
            r4 = r2
            goto L18
        L17:
            r4 = r3
        L18:
            if (r4 != r2) goto L1b
            goto L1c
        L1b:
            r2 = r3
        L1c:
            if (r2 == 0) goto L1f
            goto L23
        L1f:
            java.lang.String r1 = r0.getKernelVersionThroughUName()
        L23:
            io.bidmachine.util.DeviceUtils.hwv = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.util.DeviceUtils.getHWV():java.lang.String");
    }

    private final String getKernelVersionThroughProcVersion() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
            try {
                String line = randomAccessFile.readLine();
                UtilsKt.closeSafely(randomAccessFile);
                return line;
            } catch (Exception unused) {
                UtilsKt.closeSafely(randomAccessFile);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                UtilsKt.closeSafely(randomAccessFile);
                throw th2;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th4) {
            randomAccessFile = null;
            th2 = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getKernelVersionThroughUName() throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L48
            java.lang.String r2 = "uname -a"
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L48
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.lang.Exception -> L35
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2e
            java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L4b
            io.bidmachine.util.UtilsKt.closeSafely(r3)
            io.bidmachine.util.UtilsKt.closeSafely(r2)
            r1.destroy()
            return r0
        L27:
            r0 = move-exception
            goto L3c
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
            goto L3c
        L2e:
            r3 = r0
            goto L4b
        L30:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L3c
        L35:
            r2 = r0
            goto L4a
        L37:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
        L3c:
            io.bidmachine.util.UtilsKt.closeSafely(r3)
            io.bidmachine.util.UtilsKt.closeSafely(r2)
            if (r1 == 0) goto L47
            r1.destroy()
        L47:
            throw r0
        L48:
            r1 = r0
            r2 = r1
        L4a:
            r3 = r2
        L4b:
            io.bidmachine.util.UtilsKt.closeSafely(r3)
            io.bidmachine.util.UtilsKt.closeSafely(r2)
            if (r1 == 0) goto L56
            r1.destroy()
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.util.DeviceUtils.getKernelVersionThroughUName():java.lang.String");
    }

    @NotNull
    public static final String getManufacturer() {
        String str = Build.MANUFACTURER;
        p.j(str, "MANUFACTURER");
        return str;
    }

    @NotNull
    public static final String getModel() {
        String str = Build.MODEL;
        p.j(str, "MODEL");
        return str;
    }

    public static final int getOrientation(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getOrientation(context);
    }

    @NotNull
    public static final String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        p.j(str, "RELEASE");
        return str;
    }

    @Nullable
    public static final String getPhoneMCCMNC(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getPhoneMCCMNC(context);
    }

    @Nullable
    public static final String getPhoneOperatorName(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getPhoneOperatorName(context);
    }

    @Nullable
    public static final Integer getScreenBrightness(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenBrightness(context);
    }

    @Nullable
    public static final Double getScreenBrightnessRatio(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenBrightnessRatio(context);
    }

    public static final float getScreenDensity(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenDensity(context);
    }

    public static final int getScreenOrientation(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenOrientation(context);
    }

    @NotNull
    public static final Point getScreenSize(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenSize(context);
    }

    @Nullable
    public static final Boolean isAirplaneModeOn(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isAirplaneModeOn(context);
    }

    @Nullable
    public static final Boolean isBatterySaverEnabled(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isBatterySaverEnabled(context);
    }

    @Nullable
    public static final Boolean isCharging(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isCharging(context);
    }

    public static final boolean isDarkModeEnabled(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isDarkModeEnabled(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isDeviceRooted() {
        /*
            java.lang.Boolean r0 = io.bidmachine.util.DeviceUtils.isDeviceRooted
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            r0 = 8
            r1 = 1
            r2 = 0
            java.lang.String r3 = "/sbin/su"
            java.lang.String r4 = "/system/bin/su"
            java.lang.String r5 = "/system/xbin/su"
            java.lang.String r6 = "/data/local/xbin/su"
            java.lang.String r7 = "/data/local/bin/su"
            java.lang.String r8 = "/system/sd/xbin/su"
            java.lang.String r9 = "/system/bin/failsafe/su"
            java.lang.String r10 = "/data/local/su"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Exception -> L39
            r4 = r2
        L22:
            if (r4 >= r0) goto L39
            r5 = r3[r4]     // Catch: java.lang.Exception -> L39
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L39
            r6.<init>(r5)     // Catch: java.lang.Exception -> L39
            boolean r5 = io.bidmachine.util.file.FileUtilsKt.existsSafely(r6)     // Catch: java.lang.Exception -> L39
            if (r5 == 0) goto L36
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L39
            io.bidmachine.util.DeviceUtils.isDeviceRooted = r0     // Catch: java.lang.Exception -> L39
            return r1
        L36:
            int r4 = r4 + 1
            goto L22
        L39:
            r0 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.lang.String r4 = "/system/xbin/which"
            java.lang.String r5 = "su"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.lang.Process r0 = r3.exec(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.io.InputStream r5 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            java.lang.String r3 = r3.readLine()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            if (r3 == 0) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            io.bidmachine.util.DeviceUtils.isDeviceRooted = r3     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L71
            r0.destroy()
            return r1
        L6a:
            r1 = move-exception
            if (r0 == 0) goto L70
            r0.destroy()
        L70:
            throw r1
        L71:
            if (r0 == 0) goto L76
            r0.destroy()
        L76:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            io.bidmachine.util.DeviceUtils.isDeviceRooted = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.util.DeviceUtils.isDeviceRooted():boolean");
    }

    @Nullable
    public static final Boolean isDoNotDisturbOn(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isDoNotDisturbOn(context);
    }

    public static final boolean isLandscapeOrientation(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isLandscapeOrientation(context);
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_NETWORK_STATE")
    public static final boolean isNetworkAvailable(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isNetworkAvailable(context);
    }

    @Nullable
    public static final Boolean isRingMuted(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isRingMuted(context);
    }

    public static final boolean isTablet(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getConfiguration(context).smallestScreenWidthDp >= 600;
    }
}
