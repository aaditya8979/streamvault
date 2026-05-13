package sg.bigo.ads.common.aa;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.Y1;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.d.e;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f81953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<a> f81954b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f81955c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f81956d = Y1.f30690f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f81957e = Y1.f30690f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f81958f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f81959g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f81960h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static sg.bigo.ads.common.b f81961i = new sg.bigo.ads.common.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f81962j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static BroadcastReceiver f81963k = new BroadcastReceiver() { // from class: sg.bigo.ads.common.aa.b.3
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (b.f81960h <= 0 || System.currentTimeMillis() - b.f81960h >= r.f82514a.a(10)) {
                long unused = b.f81960h = System.currentTimeMillis();
                if (intent != null) {
                    try {
                        b.f81961i.f81973a = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                        b.f81961i.f81974b = intent.getIntExtra("scale", -1);
                        b.f81961i.f81975c = intent.getIntExtra("status", -1);
                    } catch (Throwable unused2) {
                        b.f81961i.f81973a = -1;
                        b.f81961i.f81974b = -1;
                        b.f81961i.f81975c = -1;
                    }
                }
            }
        }
    };

    public interface a {
        void a(int i10);
    }

    public static int a(@NonNull Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i10 = activity.getResources().getConfiguration().orientation;
        if (1 == i10) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i10) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "Unknown orientation. return portrait by default");
        return 9;
    }

    public static void a() {
        f81956d = Y1.f30690f;
        f81957e = Y1.f30690f;
    }

    public static synchronized void a(Context context, @NonNull a aVar) {
        if (context != null) {
            List<a> list = f81954b;
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
            if (!f81955c) {
                f81955c = true;
                sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "registerScreenListener");
                sg.bigo.ads.common.d.a.a().a(context, new e() { // from class: sg.bigo.ads.common.aa.b.1
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[ORIG_RETURN, RETURN] */
                    @Override // sg.bigo.ads.common.d.b
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a(android.content.Context r5, android.content.Intent r6) {
                        /*
                            r4 = this;
                            java.lang.String r5 = r6.getAction()
                            boolean r6 = sg.bigo.ads.common.utils.q.a(r5)
                            if (r6 == 0) goto Lb
                            return
                        Lb:
                            int r6 = sg.bigo.ads.common.aa.b.e()
                            java.lang.String r0 = java.lang.String.valueOf(r5)
                            java.lang.String r1 = "action = "
                            java.lang.String r0 = r1.concat(r0)
                            r1 = 0
                            r2 = 3
                            java.lang.String r3 = "DeviceUtil"
                            sg.bigo.ads.common.t.a.a(r1, r2, r3, r0)
                            r5.hashCode()
                            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                            boolean r0 = r5.equals(r0)
                            if (r0 != 0) goto L39
                            java.lang.String r0 = "android.intent.action.USER_PRESENT"
                            boolean r5 = r5.equals(r0)
                            if (r5 != 0) goto L34
                            goto L3b
                        L34:
                            r5 = 1
                        L35:
                            sg.bigo.ads.common.aa.b.a(r5)
                            goto L3b
                        L39:
                            r5 = 2
                            goto L35
                        L3b:
                            int r5 = sg.bigo.ads.common.aa.b.e()
                            if (r6 == r5) goto L5d
                            java.util.List r5 = sg.bigo.ads.common.aa.b.f()
                            java.util.Iterator r5 = r5.iterator()
                        L49:
                            boolean r6 = r5.hasNext()
                            if (r6 == 0) goto L5d
                            java.lang.Object r6 = r5.next()
                            sg.bigo.ads.common.aa.b$a r6 = (sg.bigo.ads.common.aa.b.a) r6
                            int r0 = sg.bigo.ads.common.aa.b.e()
                            r6.a(r0)
                            goto L49
                        L5d:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.aa.b.AnonymousClass1.a(android.content.Context, android.content.Intent):void");
                    }
                });
            }
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (f81953a == 0) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            f81953a = powerManager == null || powerManager.isScreenOn() ? 1 : 2;
        }
        return f81953a == 1;
    }

    public static String b(Context context) {
        Resources resources;
        Locale locale;
        if (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) {
            return Locale.US.getLanguage();
        }
        String language = locale.getLanguage();
        return language.equals("iw") ? "he" : language.equals(ScarConstants.IN_SIGNAL_KEY) ? "id" : language.equals("ji") ? "yi" : language;
    }

    public static boolean b() {
        return j() && f81958f == 1;
    }

    public static String c(Context context) {
        Resources resources;
        Locale locale;
        return (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) ? "zz" : locale.getCountry();
    }

    public static boolean c() {
        boolean z10;
        try {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su"};
            int i10 = 0;
            while (true) {
                if (i10 >= 6) {
                    z10 = false;
                    break;
                }
                if (new File(strArr[i10]).exists()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (!z10) {
                String str = Build.TAGS;
                if (!(str != null && str.contains("test-keys"))) {
                    if (!k()) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        if (Y1.f30690f.equals(f81956d)) {
            f81956d = "";
            if (!sg.bigo.ads.common.utils.c.a(context, "android.permission.READ_PHONE_STATE")) {
                return f81956d;
            }
            try {
                f81956d = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
            } catch (Exception unused) {
            }
        }
        return f81956d;
    }

    public static boolean d() {
        return true;
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        if (Y1.f30690f.equals(f81957e)) {
            f81957e = "";
            if (!sg.bigo.ads.common.utils.c.a(context, "android.permission.READ_PHONE_STATE")) {
                return f81957e;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                f81957e = networkCountryIso;
                if (TextUtils.isEmpty(networkCountryIso)) {
                    f81957e = telephonyManager.getSimCountryIso();
                }
            } catch (Exception unused) {
            }
        }
        return f81957e;
    }

    public static String f(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            return !TextUtils.isEmpty(defaultUserAgent) ? defaultUserAgent.substring(defaultUserAgent.indexOf("Chrome/") + 7, defaultUserAgent.indexOf("Mobile")).trim() : defaultUserAgent;
        } catch (Exception unused2) {
            return str;
        }
    }

    @WorkerThread
    public static void g(Context context) {
        if (f81959g.getAndSet(true) || context == null || !j()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "Register display listener");
        final DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: sg.bigo.ads.common.aa.b.2
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i10) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i10) {
                if (i10 == 0) {
                    try {
                        int unused = b.f81958f = displayManager.getDisplay(i10).getState();
                    } catch (Throwable unused2) {
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "onDisplayChanged: " + i10 + ", sDefaultDisplayState: " + b.f81958f);
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i10) {
            }
        }, null);
    }

    public static sg.bigo.ads.common.b h(Context context) {
        if (!f81962j) {
            i(context);
        }
        return f81961i;
    }

    public static void i(Context context) {
        if (context == null || f81962j) {
            return;
        }
        context.registerReceiver(f81963k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        f81962j = true;
    }

    public static void j(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (context == null || (broadcastReceiver = f81963k) == null || !f81962j) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        f81963k = null;
        f81962j = false;
    }

    private static boolean j() {
        return true;
    }

    private static boolean k() {
        for (String str : System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH).split(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            File file = new File(str);
            if (file.isDirectory() && new File(file, "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(Context context) {
        PowerManager powerManager;
        return (context == null || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isPowerSaveMode()) ? false : true;
    }

    public static int l(Context context) {
        int i10 = 4;
        if (context == null) {
            return 4;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager.isActiveNetworkMetered()) {
            int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            i10 = 3;
            if (restrictBackgroundStatus != 1) {
                if (restrictBackgroundStatus != 2) {
                    return restrictBackgroundStatus != 3 ? 0 : 1;
                }
                return 2;
            }
        }
        return i10;
    }

    public static float m(Context context) {
        if (context == null) {
            return 0.0f;
        }
        try {
            if (((AudioManager) context.getSystemService("audio")) != null) {
                return r3.getStreamVolume(3) / r3.getStreamMaxVolume(3);
            }
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getVolume exception: " + e10.getMessage());
        }
        return 0.0f;
    }

    public static boolean n(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null) {
                if (accessibilityManager.isEnabled()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "isAccessibilityServiceEnabled exception: " + e10.getMessage());
            return false;
        }
    }

    public static int o(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getRingerMode();
            }
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getNotificationMode exception: " + e10.getMessage());
        }
        return 0;
    }

    public static float p(Context context) {
        if (context == null) {
            return 1.0f;
        }
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.fontScale;
            }
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getFontScale exception: " + e10.getMessage());
        }
        return 1.0f;
    }

    public static int q(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            int i10 = context.getResources().getDisplayMetrics().densityDpi;
            int i11 = DisplayMetrics.DENSITY_DEVICE_STABLE;
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 0 : 2;
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getDisplayScale exception: " + e10.getMessage());
            return -1;
        }
    }

    public static int r(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int i10 = context.getResources().getConfiguration().uiMode & 48;
            if (i10 != 16) {
                return i10 != 32 ? 0 : 2;
            }
            return 1;
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getThemeMode exception: " + e10.getMessage());
            return 0;
        }
    }

    public static int s(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getTargetSdkVersion exception: " + th2.getMessage());
            return 0;
        }
    }

    public static int t(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getMinSdkVersion exception: " + th2.getMessage());
            return 0;
        }
    }

    public static boolean u(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable unused) {
            sg.bigo.ads.common.t.a.b("DeviceUtil", "Unexpected exception from Play services lib.");
            return false;
        }
    }

    public static long v(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            return new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir).length();
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getApkSize exception: " + th2.getMessage());
            return 0L;
        }
    }

    public static boolean w(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            return true;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "isUnityEnvironment exception: " + th2.getMessage());
            return false;
        }
    }
}
