package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: NpthBus.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f7169a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f7170b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f7171c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f7172d = "default";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f7173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static com.apm.insight.nativecrash.b f7174f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile ConcurrentHashMap<Integer, String> f7177i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile String f7182n;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConfigManager f7175g = new ConfigManager();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f7176h = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static g f7178j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile String f7179k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Object f7180l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile int f7181m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f7183o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static boolean f7184p = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static boolean f7185q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static boolean f7186r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f7187s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static boolean f7188t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static boolean f7189u = true;

    public static com.apm.insight.nativecrash.b a() {
        if (f7174f == null) {
            f7174f = g.a(f7169a);
        }
        return f7174f;
    }

    public static String a(long j10, CrashType crashType, boolean z10, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j10);
        sb2.append("_");
        sb2.append(crashType.getName());
        sb2.append('_');
        sb2.append(f());
        sb2.append('_');
        sb2.append(z10 ? "oom_" : "normal_");
        sb2.append(f7171c);
        sb2.append('_');
        sb2.append(z11 ? "ignore_" : "normal_");
        sb2.append(Long.toHexString(new Random().nextLong()));
        sb2.append(RequestConfiguration.MAX_AD_CONTENT_RATING_G);
        return sb2.toString();
    }

    public static void a(int i10, String str) {
        if (f7177i == null) {
            synchronized (e.class) {
                if (f7177i == null) {
                    f7177i = new ConcurrentHashMap<>();
                }
            }
        }
        f7177i.put(Integer.valueOf(i10), str);
    }

    public static void a(Application application) {
        if (application != null) {
            f7170b = application;
        }
    }

    public static void a(Application application, Context context) {
        if (f7170b == null) {
            f7171c = System.currentTimeMillis();
            f7169a = context;
            f7170b = application;
            f7179k = Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
        }
    }

    public static void a(Application application, Context context, ICommonParams iCommonParams) {
        a(application, context);
        f7174f = new com.apm.insight.nativecrash.b(f7169a, iCommonParams, a());
    }

    public static void a(com.apm.insight.nativecrash.b bVar) {
        f7174f = bVar;
    }

    public static void a(String str) {
        f7172d = str;
    }

    public static void a(boolean z10) {
        f7184p = z10;
    }

    public static a b() {
        return f7176h;
    }

    public static void b(int i10, String str) {
        f7181m = i10;
        f7182n = str;
    }

    public static void b(boolean z10) {
        f7185q = z10;
    }

    public static g c() {
        if (f7178j == null) {
            synchronized (e.class) {
                f7178j = new g();
            }
        }
        return f7178j;
    }

    public static void c(boolean z10) {
        f7186r = z10;
    }

    public static void d(boolean z10) {
        f7187s = z10;
    }

    public static boolean d() {
        if (!f7175g.isDebugMode()) {
            return false;
        }
        Object obj = a().a().get("channel");
        return (obj == null ? "unknown" : String.valueOf(obj)).contains("local_test");
    }

    public static String e() {
        return f() + '_' + Long.toHexString(new Random().nextLong()) + RequestConfiguration.MAX_AD_CONTENT_RATING_G;
    }

    public static void e(boolean z10) {
        f7189u = z10;
    }

    public static String f() {
        if (f7179k == null) {
            synchronized (f7180l) {
                if (f7179k == null) {
                    f7179k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f7179k;
    }

    public static void f(boolean z10) {
        f7188t = z10;
    }

    public static Context g() {
        return f7169a;
    }

    public static Application h() {
        return f7170b;
    }

    public static ConfigManager i() {
        return f7175g;
    }

    public static long j() {
        return f7171c;
    }

    public static String k() {
        return f7172d;
    }

    public static void l() {
        f7183o = 1;
    }

    public static int m() {
        return f7183o;
    }

    public static boolean n() {
        return f7173e;
    }

    public static void o() {
        f7173e = true;
    }

    public static ConcurrentHashMap<Integer, String> p() {
        return f7177i;
    }

    public static int q() {
        return f7181m;
    }

    public static String r() {
        return f7182n;
    }

    public static boolean s() {
        return f7184p;
    }

    public static boolean t() {
        return f7185q;
    }

    public static boolean u() {
        return f7186r;
    }

    public static boolean v() {
        return f7187s;
    }

    public static boolean w() {
        return f7189u;
    }

    public static boolean x() {
        return f7188t;
    }
}
