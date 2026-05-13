package io.bidmachine.util;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C3978d4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DeviceUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007\u001a\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002¢\u0006\u0002\u0010\u0007\u001a\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u0002H\u0007\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0002\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0002H\u0007\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0002\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\r*\u00020\u0002\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u0002\u001a\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u0002¢\u0006\u0002\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0006*\u00020\u0002¢\u0006\u0002\u0010\u0007\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0002\u001a\n\u0010\u0019\u001a\u00020\u0011*\u00020\u0002\u001a\n\u0010\u001a\u001a\u00020\u001b*\u00020\u0002\u001a\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\u0002¢\u0006\u0002\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001d*\u00020\u0002¢\u0006\u0002\u0010\u001e\u001a\u0011\u0010 \u001a\u0004\u0018\u00010\u001d*\u00020\u0002¢\u0006\u0002\u0010\u001e\u001a\n\u0010!\u001a\u00020\u001d*\u00020\u0002\u001a\u0011\u0010\"\u001a\u0004\u0018\u00010\u001d*\u00020\u0002¢\u0006\u0002\u0010\u001e\u001a\n\u0010#\u001a\u00020\u001d*\u00020\u0002\u001a\f\u0010$\u001a\u00020\u001d*\u00020\u0002H\u0007\u001a\u0011\u0010%\u001a\u0004\u0018\u00010\u001d*\u00020\u0002¢\u0006\u0002\u0010\u001e\u001a\n\u0010&\u001a\u00020\u001d*\u00020\u0002¨\u0006'"}, d2 = {"getActiveNetworkCapabilities", "Landroid/net/NetworkCapabilities;", "Landroid/content/Context;", "getActiveNetworkInfo", "Landroid/net/NetworkInfo;", "getBatteryLevel", "", "(Landroid/content/Context;)Ljava/lang/Double;", "getBluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getConfiguration", "Landroid/content/res/Configuration;", "getDeviceName", "", "getDisplayMetrics", "Landroid/util/DisplayMetrics;", "getOrientation", "", "getPhoneMCCMNC", "getPhoneOperatorName", "getScreenBrightness", "(Landroid/content/Context;)Ljava/lang/Integer;", "getScreenBrightnessRatio", "getScreenDensity", "", "getScreenOrientation", "getScreenSize", "Landroid/graphics/Point;", "isAirplaneModeOn", "", "(Landroid/content/Context;)Ljava/lang/Boolean;", "isBatterySaverEnabled", C3978d4.j.f31398k0, "isDarkModeEnabled", "isDoNotDisturbOn", "isLandscapeOrientation", "isNetworkAvailable", "isRingMuted", "isTablet", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class DeviceUtilsKt {
    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_NETWORK_STATE")
    @RequiresApi(api = 23)
    @Nullable
    public static final NetworkCapabilities getActiveNetworkCapabilities(@NotNull Context context) {
        ConnectivityManager connectivityManager;
        p.k(context, "<this>");
        if (!UtilsKt.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = UtilsKt.getConnectivityManager(context)) == null) {
            return null;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            p.j(activeNetwork, "it.activeNetwork ?: return null");
            return connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (Throwable unused) {
            return null;
        }
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_NETWORK_STATE")
    @Nullable
    public static final NetworkInfo getActiveNetworkInfo(@NotNull Context context) {
        ConnectivityManager connectivityManager;
        p.k(context, "<this>");
        if (!UtilsKt.isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = UtilsKt.getConnectivityManager(context)) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final Double getBatteryLevel(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Intent intentRegisterSystemReceiver = UtilsKt.registerSystemReceiver(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterSystemReceiver == null) {
                return null;
            }
            int intExtra = intentRegisterSystemReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intentRegisterSystemReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 <= 0) {
                return null;
            }
            return Double.valueOf(UtilsKt.toRatio(Integer.valueOf(intExtra), intExtra2));
        } catch (Exception unused) {
            return null;
        }
    }

    @RequiresPermission(conditional = true, value = "android.permission.BLUETOOTH_CONNECT")
    @Nullable
    public static final BluetoothAdapter getBluetoothAdapter(@NotNull Context context) {
        BluetoothAdapter defaultAdapter;
        p.k(context, "<this>");
        if (!UtilsKt.isPermissionGranted(context, "android.permission.BLUETOOTH_CONNECT")) {
            return null;
        }
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                BluetoothManager bluetoothManager = UtilsKt.getBluetoothManager(context);
                if (bluetoothManager == null) {
                    return null;
                }
                defaultAdapter = bluetoothManager.getAdapter();
            } else {
                defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            }
            return defaultAdapter;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final Configuration getConfiguration(@NotNull Context context) {
        p.k(context, "<this>");
        Configuration configuration = context.getResources().getConfiguration();
        p.j(configuration, "resources.configuration");
        return configuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x0006, B:5:0x0014, B:14:0x0025, B:16:0x0031, B:25:0x0042, B:27:0x0048, B:30:0x0050), top: B:41:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:3:0x0006, B:5:0x0014, B:14:0x0025, B:16:0x0031, B:25:0x0042, B:27:0x0048, B:30:0x0050), top: B:41:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    @androidx.annotation.RequiresPermission(conditional = true, value = "android.permission.BLUETOOTH_CONNECT")
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String getDeviceName(@org.jetbrains.annotations.NotNull android.content.Context r5) {
        /*
            java.lang.String r0 = "<this>"
            tn.p.k(r5, r0)
            r0 = 0
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch: java.lang.Exception -> L60
            java.lang.String r2 = "device_name"
            java.lang.String r1 = android.provider.Settings.Global.getString(r1, r2)     // Catch: java.lang.Exception -> L60
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L21
            int r4 = r1.length()     // Catch: java.lang.Exception -> L60
            if (r4 <= 0) goto L1c
            r4 = r2
            goto L1d
        L1c:
            r4 = r3
        L1d:
            if (r4 != r2) goto L21
            r4 = r2
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 == 0) goto L25
            return r1
        L25:
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = "bluetooth_name"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r4)     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L3e
            int r4 = r1.length()     // Catch: java.lang.Exception -> L60
            if (r4 <= 0) goto L39
            r4 = r2
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r4 != r2) goto L3e
            r4 = r2
            goto L3f
        L3e:
            r4 = r3
        L3f:
            if (r4 == 0) goto L42
            return r1
        L42:
            android.bluetooth.BluetoothAdapter r5 = getBluetoothAdapter(r5)     // Catch: java.lang.Exception -> L60
            if (r5 == 0) goto L4d
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Exception -> L60
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L5c
            int r1 = r5.length()     // Catch: java.lang.Exception -> L60
            if (r1 <= 0) goto L58
            r1 = r2
            goto L59
        L58:
            r1 = r3
        L59:
            if (r1 != r2) goto L5c
            goto L5d
        L5c:
            r2 = r3
        L5d:
            if (r2 == 0) goto L60
            return r5
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.util.DeviceUtilsKt.getDeviceName(android.content.Context):java.lang.String");
    }

    @NotNull
    public static final DisplayMetrics getDisplayMetrics(@NotNull Context context) {
        p.k(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        p.j(displayMetrics, "resources.displayMetrics");
        return displayMetrics;
    }

    public static final int getOrientation(@NotNull Context context) {
        p.k(context, "<this>");
        return getConfiguration(context).orientation;
    }

    @Nullable
    public static final String getPhoneMCCMNC(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            TelephonyManager telephonyManager = UtilsKt.getTelephonyManager(context);
            String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
            if (networkOperator != null && networkOperator.length() >= 3) {
                StringBuilder sb2 = new StringBuilder();
                String strSubstring = networkOperator.substring(0, 3);
                p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(strSubstring);
                sb2.append('-');
                String strSubstring2 = networkOperator.substring(3);
                p.j(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                return sb2.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Nullable
    public static final String getPhoneOperatorName(@NotNull Context context) {
        p.k(context, "<this>");
        TelephonyManager telephonyManager = UtilsKt.getTelephonyManager(context);
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperatorName();
        }
        return null;
    }

    @Nullable
    public static final Integer getScreenBrightness(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            return Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness"));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final Double getScreenBrightnessRatio(@NotNull Context context) {
        p.k(context, "<this>");
        Integer screenBrightness = getScreenBrightness(context);
        if (screenBrightness != null) {
            return Double.valueOf(UtilsKt.toRatio(screenBrightness, 255.0d));
        }
        return null;
    }

    public static final float getScreenDensity(@NotNull Context context) {
        p.k(context, "<this>");
        return getDisplayMetrics(context).density;
    }

    public static final int getScreenOrientation(@NotNull Context context) {
        Display defaultDisplay;
        p.k(context, "<this>");
        WindowManager windowManager = UtilsKt.getWindowManager(context);
        Integer numValueOf = (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? null : Integer.valueOf(defaultDisplay.getRotation());
        int orientation = getOrientation(context);
        boolean z10 = false;
        if (orientation != 1) {
            if (orientation != 2) {
                return 9;
            }
            if ((numValueOf != null && numValueOf.intValue() == 2) || (numValueOf != null && numValueOf.intValue() == 3)) {
                return 8;
            }
            if ((numValueOf == null || numValueOf.intValue() != 0) && numValueOf != null) {
                numValueOf.intValue();
            }
            return 0;
        }
        if ((numValueOf != null && numValueOf.intValue() == 2) || (numValueOf != null && numValueOf.intValue() == 3)) {
            z10 = true;
        }
        if (z10) {
            return 9;
        }
        if ((numValueOf == null || numValueOf.intValue() != 0) && numValueOf != null) {
            numValueOf.intValue();
        }
        return 1;
    }

    @NotNull
    public static final Point getScreenSize(@NotNull Context context) {
        p.k(context, "<this>");
        DisplayMetrics displayMetrics = getDisplayMetrics(context);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Nullable
    public static final Boolean isAirplaneModeOn(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on") != 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final Boolean isBatterySaverEnabled(@NotNull Context context) {
        p.k(context, "<this>");
        PowerManager powerManager = UtilsKt.getPowerManager(context);
        if (powerManager != null) {
            return Boolean.valueOf(powerManager.isPowerSaveMode());
        }
        return null;
    }

    @Nullable
    public static final Boolean isCharging(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            Intent intentRegisterSystemReceiver = UtilsKt.registerSystemReceiver(context, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterSystemReceiver == null) {
                return null;
            }
            int intExtra = intentRegisterSystemReceiver.getIntExtra("plugged", -1);
            boolean z10 = true;
            if (intExtra != 1 && intExtra != 2 && intExtra != 4) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean isDarkModeEnabled(@NotNull Context context) {
        p.k(context, "<this>");
        return (getConfiguration(context).uiMode & 48) == 32;
    }

    @Nullable
    public static final Boolean isDoNotDisturbOn(@NotNull Context context) {
        p.k(context, "<this>");
        try {
            return Boolean.valueOf(Settings.Global.getInt(context.getContentResolver(), "zen_mode") != 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean isLandscapeOrientation(@NotNull Context context) {
        p.k(context, "<this>");
        int screenOrientation = getScreenOrientation(context);
        return screenOrientation == 0 || screenOrientation == 8 || screenOrientation == 6 || screenOrientation == 11;
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_NETWORK_STATE")
    public static final boolean isNetworkAvailable(@NotNull Context context) {
        p.k(context, "<this>");
        int i10 = Build.VERSION.SDK_INT;
        NetworkCapabilities activeNetworkCapabilities = getActiveNetworkCapabilities(context);
        boolean z10 = false;
        if (activeNetworkCapabilities == null) {
            return false;
        }
        boolean z11 = activeNetworkCapabilities.hasCapability(12) && activeNetworkCapabilities.hasCapability(16);
        if (i10 < 28) {
            return z11;
        }
        if (z11 && activeNetworkCapabilities.hasCapability(21) && activeNetworkCapabilities.hasCapability(19)) {
            z10 = true;
        }
        return z10;
    }

    @Nullable
    public static final Boolean isRingMuted(@NotNull Context context) {
        p.k(context, "<this>");
        AudioManager audioManager = UtilsKt.getAudioManager(context);
        if (audioManager == null) {
            return null;
        }
        int ringerMode = audioManager.getRingerMode();
        boolean z10 = true;
        if (ringerMode != 0 && ringerMode != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static final boolean isTablet(@NotNull Context context) {
        p.k(context, "<this>");
        return DeviceUtils.isTablet(context);
    }
}
