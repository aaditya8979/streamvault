package com.safedk.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.StatsReporter;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.InterstitialFinder;
import com.safedk.android.analytics.brandsafety.NativeFinder;
import com.safedk.android.analytics.brandsafety.b;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.g;
import com.safedk.android.analytics.brandsafety.q;
import com.safedk.android.analytics.reporters.CrashReporter;
import com.safedk.android.internal.DeviceData;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.annotations.Api;
import com.safedk.android.utils.i;
import com.safedk.android.utils.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class SafeDK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f51475a = "com.safedk";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f51476c = "SafeDKMain";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f51477d = "SafeDK";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f51478e = "https://config.safedk.com/";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f51479f = "com.safedk.AppID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f51480g = "com.safedk.ConfigPrefix";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f51481h = "com.safedk.APIPrefix";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f51482i = "com.safedk.DebugMode";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f51483j = "com.safedk.MaximumStatsSetSize";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f51484k = "com.safedk.AggregationThreshold";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f51487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f51488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f51489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f51490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f51491r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f51492t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Context f51494v;
    private i B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f51498s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private DeviceData f51500z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<String> f51485l = Arrays.asList("com.android.vending", "com.amazon.venezia", "com.sec.android.app.samsungapps");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f51486m = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static SafeDK f51493u = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static d f51495w = new d();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static AtomicBoolean f51496x = new AtomicBoolean(false);
    private static AtomicBoolean F = new AtomicBoolean(false);
    private static AtomicBoolean G = new AtomicBoolean(false);
    private static Boolean H = false;
    private static Boolean I = false;
    private static Boolean J = false;
    private static final ExecutorService K = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f51499y = null;
    private final Map<BrandSafetyUtils.AdType, b> A = new HashMap();
    private AtomicBoolean C = new AtomicBoolean(false);
    private int D = 0;
    private int E = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.safedk.android.analytics.brandsafety.i f51497b = null;

    private SafeDK(Context context) {
        Logger.d(f51476c, "SafeDK ctor started");
        f51494v = context;
        AppLovinBridge.init(context);
        if (c()) {
            Logger.d(f51476c, "Before reading shared prefs");
            this.f51500z = new DeviceData(context, this.B);
        }
    }

    public static boolean P() {
        return a.f51503a.contains(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT);
    }

    public static boolean Y() {
        return H.booleanValue();
    }

    public static void Z() {
        Logger.d(f51476c, "setMaxInitialized started");
        H = true;
        if (!b()) {
            ah();
        }
        CreativeInfoManager.b();
    }

    public static synchronized SafeDK a(Context context) {
        Logger.d(f51476c, "start started");
        if (f51493u == null) {
            f51493u = new SafeDK(context);
            f51493u.a(false);
            f51493u.b(true);
        } else {
            Logger.d(f51476c, "SafeDK already started");
        }
        return f51493u;
    }

    public static void a(Application application) {
        if (getInstance() == null || !getInstance().o() || Build.VERSION.SDK_INT < 14) {
            return;
        }
        application.registerActivityLifecycleCallbacks(com.safedk.android.internal.b.getInstance());
    }

    private void a(ApplicationInfo applicationInfo) {
        try {
            try {
                PackageInfo packageInfo = f51494v.getPackageManager().getPackageInfo(f51494v.getPackageName(), 0);
                Logger.d(f51476c, "package is: " + packageInfo.packageName + ", Installer Package Name is " + f51494v.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                f51492t = f51485l.contains(f51494v.getPackageManager().getInstallerPackageName(packageInfo.packageName));
                f51491r = (applicationInfo.flags & 2) != 0;
                f51489p = extractAppIdentifier(applicationInfo.metaData);
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendPath("apps").appendPath("cfg").appendPath(f51489p).appendPath(String.valueOf(packageInfo.versionCode)).appendQueryParameter(C3978d4.i.U, String.valueOf(f51492t));
                if (f51492t) {
                    builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("versionName", packageInfo.versionName);
                }
                String string = builderAppendQueryParameter.build().toString();
                f51488o = extractUrlPrefix(applicationInfo.metaData);
                if (f51488o == null || f51488o.length() <= 0) {
                    Logger.d(f51476c, "no apiURL Value in manifest");
                } else {
                    Logger.d(f51476c, "apiURL Value from manifest is " + f51488o + ". Setting new edge urls");
                    AppLovinBridge.receiveEdgeUrls(f51488o, f51488o);
                }
                f51490q = packageInfo.versionCode;
                String string2 = applicationInfo.metaData.getString(f51480g);
                if (string2 == null) {
                    f51487n = getDefaultConfig() + string;
                    return;
                }
                if (!string2.endsWith(File.separator)) {
                    string2 = string2 + File.separator;
                }
                if (string.startsWith(File.separator)) {
                    string = string.substring(1);
                }
                f51487n = string2 + string;
                Logger.d(f51476c, "basePrefix != null, configUrl:" + f51487n);
            } catch (PackageManager.NameNotFoundException e10) {
                Logger.d(f51476c, "Bad URL; won't update toggles");
            }
        } catch (Throwable th2) {
            Logger.e(f51476c, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    private void a(Bundle bundle) {
        if (this.B != null) {
            Logger.d(f51476c, "Writing to shared preferences: " + bundle.toString());
            this.B.a(bundle);
        }
    }

    public static boolean a() {
        return f51492t;
    }

    public static boolean aa() {
        boolean z10 = f51493u != null && f51495w != null && f51495w.x() && H.booleanValue();
        if (!z10) {
            Logger.d(f51476c, "isSafeDKFullyInitialized returned false , instance = " + f51493u + ",config = " + f51495w + ", config.isActive() = " + f51495w.x() + ", SafeDK.isMaxInitialized = " + H);
        }
        return z10;
    }

    private synchronized void ac() {
        Logger.d(f51476c, C3978d4.a.f31210f);
        if (!r()) {
            Iterator<b> it = this.A.values().iterator();
            while (it.hasNext()) {
                it.next().a((String) null);
            }
            this.A.clear();
        }
    }

    private void ad() {
        try {
            ApplicationInfo applicationInfo = f51494v.getPackageManager().getApplicationInfo(f51494v.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                a(applicationInfo);
                b(applicationInfo);
                c(applicationInfo);
                d(applicationInfo);
            } else {
                Logger.e(f51476c, "SafeDK meta data is missing from manifest file");
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Logger.d(f51476c, "Couldn't get application's meta data");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        if (this.B != null) {
            this.f51499y = UUID.randomUUID().toString();
            this.B.a(this.f51499y);
        }
    }

    private void af() {
        try {
            Logger.d(f51476c, "setIsFirstSession started");
            if (G.get() || this.B == null) {
                Logger.d(f51476c, "setIsFirstSession already executed, value is " + this.f51498s);
                return;
            }
            String strP = this.B.p();
            Logger.d(f51476c, "setIsFirstSession Current safedk version : 5.4.0 , stored version is " + strP);
            if (strP == null || !a.f51503a.equals(strP)) {
                Logger.d(f51476c, "setIsFirstSession setting is_first_session to true");
                this.f51498s = true;
            }
            this.B.c(a.f51503a);
            G.set(true);
        } catch (Throwable th2) {
            Logger.d(f51476c, "setIsFirstSession Exception : " + th2.getMessage(), th2);
        }
    }

    private synchronized void ag() {
        if (!this.A.containsKey(BrandSafetyUtils.AdType.INTERSTITIAL)) {
            this.A.put(BrandSafetyUtils.AdType.INTERSTITIAL, new InterstitialFinder());
        }
        if (!this.A.containsKey(BrandSafetyUtils.AdType.BANNER) && p()) {
            this.A.put(BrandSafetyUtils.AdType.BANNER, new BannerFinder(getInstance().V()));
        }
        if (!this.A.containsKey(BrandSafetyUtils.AdType.MREC) && p()) {
            this.A.put(BrandSafetyUtils.AdType.MREC, new q(getInstance().V()));
        }
        if (!this.A.containsKey(BrandSafetyUtils.AdType.NATIVE)) {
            this.A.put(BrandSafetyUtils.AdType.NATIVE, new NativeFinder(getInstance().V()));
        }
    }

    private static void ah() {
        if (f51496x.get()) {
            Logger.d(f51476c, "Reporter thread already initialized, skipping");
            return;
        }
        Logger.d(f51476c, "Starting reporter thread");
        StatsCollector.a(true);
        int iZ = f51495w.z();
        int iC = f51495w.C();
        StatsReporter.a();
        StatsCollector.c().a(iZ, com.safedk.android.internal.b.getInstance().isInBackground(), iC, StatsReporter.b());
        StatsCollector.a(false);
        StatsCollector.b(getInstance().r());
        f51496x.set(true);
        Logger.d(f51476c, "Reporter thread started");
    }

    private boolean ai() {
        try {
            Set<String> setG = f51495w.G();
            if (!setG.contains("*")) {
                if (!setG.contains(this.f51499y)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            Logger.e(f51476c, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
            return false;
        }
    }

    private void b(ApplicationInfo applicationInfo) {
        boolean z10 = false;
        if (f51495w.x() && (applicationInfo.metaData.getBoolean(f51482i, false) || ai())) {
            z10 = true;
        }
        Logger.setDebugMode(z10);
    }

    private void b(boolean z10) {
        boolean zR = r();
        Logger.d(f51476c, "notifyMonitorUserActivityUpdate shouldMonitorUser is " + zR);
        CreativeInfoManager.a(zR);
        com.safedk.android.internal.b.setActiveMode(zR);
        com.safedk.android.analytics.brandsafety.i.a(zR);
        if (z10) {
            ac();
        }
    }

    public static synchronized boolean b() {
        return f51496x.get();
    }

    private void c(ApplicationInfo applicationInfo) {
        f51495w.a(applicationInfo.metaData.getInt(f51483j, 5000));
    }

    private void d(ApplicationInfo applicationInfo) {
        f51495w.b(applicationInfo.metaData.getInt(f51484k, 500));
    }

    private static String extractAppIdentifier(Bundle bundle) {
        return bundle.getString(f51479f);
    }

    private static String extractUrlPrefix(Bundle bundle) {
        return bundle.getString(f51481h, "https://edge.safedk.com");
    }

    private static String getDefaultConfig() {
        return f51478e;
    }

    public static SafeDK getInstance() {
        return f51493u;
    }

    public static String getProguardMD5() {
        return "";
    }

    public static String getSdkKey() {
        return "XMOKPK68yLQGgahbxRXybdKoZ1X02LDTUEhyDpkappkcveLd72eJHzxshASma_freMh1T21LxIFyznJFDdmvFm";
    }

    public static String getVersion() {
        return a.f51503a;
    }

    public static int k() {
        return f51490q;
    }

    public static boolean t() {
        return f51495w.B();
    }

    public q A() {
        return (q) a(BrandSafetyUtils.AdType.MREC);
    }

    public NativeFinder B() {
        return (NativeFinder) a(BrandSafetyUtils.AdType.NATIVE);
    }

    public int C() {
        return this.E;
    }

    public int D() {
        return this.D;
    }

    public int E() {
        return f51495w.d();
    }

    public int F() {
        return f51495w.e();
    }

    public float G() {
        return f51495w.f();
    }

    public float H() {
        return f51495w.g();
    }

    public boolean I() {
        return f51495w.h();
    }

    public int J() {
        return f51495w.i();
    }

    public long K() {
        return f51495w.j();
    }

    public int L() {
        return f51495w.k();
    }

    public int M() {
        return f51495w.l();
    }

    public int N() {
        return f51495w.m();
    }

    public JSONObject O() {
        if (this.B == null) {
            return null;
        }
        return this.B.j();
    }

    public long Q() {
        return f51495w.J();
    }

    public int R() {
        return f51495w.K();
    }

    public ArrayList<String> S() {
        return f51495w.L();
    }

    public float T() {
        return f51495w.n();
    }

    public float U() {
        return f51495w.o();
    }

    public int V() {
        return f51495w.p();
    }

    public int W() {
        return f51495w.q();
    }

    public int X() {
        return f51495w.r();
    }

    public com.safedk.android.analytics.brandsafety.a a(BrandSafetyUtils.AdType adType) {
        return this.A.get(adType);
    }

    public void a(Bundle bundle, boolean z10) {
        Logger.d(f51476c, "Updating configuration");
        boolean zA = f51495w.a(bundle, true);
        if (zA) {
            a(bundle);
        }
        a(zA, z10);
    }

    public synchronized void a(String str) {
        Iterator<b> it = this.A.values().iterator();
        while (it.hasNext()) {
            it.next().c(str);
        }
    }

    public void a(final boolean z10) {
        try {
            K.execute(new Runnable() { // from class: com.safedk.android.SafeDK.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Logger.d(SafeDK.f51476c, "Reading configuration from shared preferences");
                        if (SafeDK.this.B != null) {
                            SafeDK.this.f51499y = SafeDK.this.B.a();
                            if (SafeDK.this.f51499y == null) {
                                SafeDK.this.ae();
                            }
                            Bundle bundleE = SafeDK.this.B.e();
                            Logger.d(SafeDK.f51476c, "configurationBundle loaded : " + bundleE.toString());
                            if (bundleE == null || bundleE.isEmpty()) {
                                Logger.d(SafeDK.f51476c, "Configuration bundle from storage is empty");
                            } else {
                                Logger.d(SafeDK.f51476c, "Parsing configuration from shared preferences");
                                SafeDK.f51495w.a(bundleE, false);
                            }
                            SafeDK.this.a(false, z10);
                        }
                    } catch (Throwable th2) {
                        Logger.e(SafeDK.f51476c, th2.getMessage(), th2);
                        new CrashReporter().caughtException(th2);
                    }
                }
            });
        } catch (Throwable th2) {
            Logger.e(f51476c, "Caught exception", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public synchronized void a(boolean z10, boolean z11) {
        try {
            if (f51495w.x()) {
                Logger.i("SafeDK", "SafeDK Device ID: " + f51493u.f51499y);
                Logger.i("SafeDK", "SafeDK version: " + getVersion());
            }
            Logger.d(f51476c, "configurationDownloadCompleted isOnUiThread = " + k.c());
            if (f51493u == null) {
                Logger.d(f51476c, "instance is null, existing");
            } else {
                f51493u.b(false);
                if (f51495w.x()) {
                    ad();
                    if (ai()) {
                        Logger.setDebugMode(true);
                    }
                    Logger.d(f51476c, "Configuration download completed, configurationDownloadedSuccessfully=" + z10);
                    Logger.d(f51476c, "configurationDownloadCompleted isMaxProcess " + z11);
                    Logger.d(f51476c, "configurationDownloadCompleted isActive " + f51495w.x() + ", packageId = " + getInstance().l().getPackageName());
                    if (f51495w.x() && z11 && !F.get()) {
                        F.set(true);
                        CreativeInfoManager.g();
                        CreativeInfoManager.d();
                        ah();
                        if (z10) {
                            Logger.d(f51476c, "Will attempt to load events from storage");
                            StatsCollector.c().d();
                        } else {
                            af();
                        }
                        af();
                        Logger.d(f51476c, "Loading singletons");
                        g.a();
                        com.safedk.android.analytics.brandsafety.k.a();
                        if (this.f51497b == null) {
                            this.f51497b = com.safedk.android.analytics.brandsafety.i.a();
                        }
                        ag();
                    }
                    this.C.set(true);
                } else {
                    Logger.d(f51476c, "SafeDK is disabled.");
                    Logger.setDebugMode(false);
                    com.safedk.android.internal.b.getInstance().clearBackgroundForegroundListeners();
                }
            }
        } catch (Throwable th2) {
            Logger.e(f51476c, "Exception handling configuration event", th2);
            new CrashReporter().caughtException(th2);
        }
    }

    public synchronized boolean a(Activity activity) {
        boolean z10;
        Logger.d(f51476c, "Starting interstitial finder in activity " + activity.getClass().getName());
        InterstitialFinder interstitialFinder = (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
        if (interstitialFinder != null) {
            interstitialFinder.c(activity);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public String b(String str) {
        JSONObject jSONObject;
        String string = null;
        if (this.B != null) {
            Logger.d(f51476c, "getSdkVersion getSdkVersion: " + str);
            JSONObject jSONObjectJ = this.B.j();
            if (jSONObjectJ != null) {
                Logger.d(f51476c, "getSdkVersion sdkVersionsJson=" + jSONObjectJ.toString());
            }
            try {
                jSONObject = jSONObjectJ.getJSONObject(str);
            } catch (Throwable th2) {
            }
            if (jSONObject == null) {
                Logger.d(f51476c, "getSdkVersion sdkData is null");
            } else {
                Logger.d(f51476c, "getSdkVersion sdkData : " + jSONObject.toString());
                string = jSONObject.getString("sdk_version");
                Logger.d(f51476c, "getSdkVersion version : " + string);
                Logger.d(f51476c, "return sdk version: " + string);
            }
        }
        return string;
    }

    public synchronized void b(Activity activity) {
        Logger.d(f51476c, "Stopping interstitial finder in activity " + activity.getClass().getName());
        InterstitialFinder interstitialFinder = (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
        if (interstitialFinder != null) {
            interstitialFinder.e(activity);
        }
    }

    public synchronized void c(Activity activity) {
        Logger.d(f51476c, "Starting redirect monitoring in activity " + activity.getClass().getName());
        BannerFinder bannerFinder = (BannerFinder) a(BrandSafetyUtils.AdType.BANNER);
        if (bannerFinder != null) {
            bannerFinder.c(activity);
        }
    }

    public boolean c() {
        try {
            if (!J.booleanValue() && F != null && !F.get()) {
                Logger.d(f51476c, "loading config from prefs");
                this.B = new i(f51494v.getSharedPreferences("SafeDKToggles", 0), f51486m);
            }
            J = true;
        } catch (IllegalStateException e10) {
            Logger.d(f51476c, "IllegalStateException caught during loading of configuration from prefs, device may be locked", e10);
        } catch (Throwable th2) {
            Logger.d(f51476c, "Exception during loading of configuration from prefs : " + th2.getMessage(), th2);
        }
        return J.booleanValue();
    }

    public synchronized void d(Activity activity) {
        if (o()) {
            Logger.d(f51476c, "onForegroundActivity " + activity.getClass().getName());
            if (getInstance().c() && this.f51500z == null) {
                Logger.d(f51476c, "Before reading shared prefs");
                this.f51500z = new DeviceData(f51494v, this.B);
            }
        }
    }

    public boolean d() {
        try {
            ApplicationInfo applicationInfo = SafeDKApplication.getAppContext().getPackageManager().getApplicationInfo(f51494v.getPackageName(), 128);
            if (f51495w.x()) {
                return applicationInfo.metaData.getBoolean(f51482i, false) || ai();
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            return false;
        }
    }

    public synchronized void e(Activity activity) {
        if (o()) {
            Logger.d(f51476c, "onBackgroundActivity " + activity.getClass().getName());
        }
    }

    public boolean e() {
        return this.f51498s;
    }

    public int f() {
        return f51495w.a();
    }

    public int g() {
        return f51495w.b();
    }

    @Api
    public String getUserId() {
        return this.f51499y;
    }

    public boolean h() {
        return f51495w.c();
    }

    public synchronized void i() {
        F.set(true);
        CreativeInfoManager.g();
        ah();
        af();
        Logger.d(f51476c, "Loading singletons");
        g.a();
        com.safedk.android.analytics.brandsafety.k.a();
        if (this.f51497b == null) {
            this.f51497b = com.safedk.android.analytics.brandsafety.i.a();
        }
        ag();
        this.C.set(true);
    }

    public synchronized void j() {
        if (StatsCollector.b()) {
            for (b bVar : this.A.values()) {
                if (bVar.b() > 0) {
                    bVar.c();
                }
            }
        }
    }

    public Context l() {
        return f51494v;
    }

    public boolean m() {
        return f51495w.y() || ai();
    }

    public boolean n() {
        return f51491r;
    }

    public boolean o() {
        return f51495w.x();
    }

    public boolean p() {
        return f51495w.s();
    }

    public boolean q() {
        return f51495w.t();
    }

    public boolean r() {
        return !s() && f51495w.x();
    }

    public boolean s() {
        if (this.B == null) {
            return true;
        }
        return this.B.b();
    }

    public List<String> u() {
        return f51495w.u();
    }

    public List<String> v() {
        return f51495w.v();
    }

    public DeviceData w() {
        return this.f51500z;
    }

    public Map<BrandSafetyUtils.AdType, b> x() {
        return this.A;
    }

    public InterstitialFinder y() {
        return (InterstitialFinder) a(BrandSafetyUtils.AdType.INTERSTITIAL);
    }

    public BannerFinder z() {
        return (BannerFinder) a(BrandSafetyUtils.AdType.BANNER);
    }
}
