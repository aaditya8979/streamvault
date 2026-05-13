package sg.bigo.ads.common.m;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f82235a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f82236b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f82237c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f82238d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f82239e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static SharedPreferences.OnSharedPreferenceChangeListener f82240f = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: sg.bigo.ads.common.m.b.1
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (q.a((CharSequence) str)) {
                return;
            }
            sg.bigo.ads.common.t.a.a(0, 3, "GdprManager", "Listener SharedPreferenceChanged, key: ".concat(String.valueOf(str)));
            str.hashCode();
            switch (str) {
                case "IABTCF_PurposeConsents":
                    b.a(sharedPreferences);
                    break;
                case "IABTCF_PurposeLegitimateInterests":
                    b.c(sharedPreferences);
                    break;
                case "IABTCF_gdprApplies":
                    b.b(sharedPreferences);
                    break;
                case "IABTCF_TCString":
                    b.d(sharedPreferences);
                    b.h();
                    return;
                default:
                    return;
            }
            b.h();
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Context f82241g;

    public static void a(@NonNull Context context) {
        f82241g = context;
        sg.bigo.ads.common.x.a.a(context.getPackageName(), f82240f);
    }

    public static void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f82235a = sharedPreferences.getString("IABTCF_PurposeConsents", "");
        } catch (Exception unused) {
            f82235a = "";
        }
    }

    public static boolean a() {
        return f82241g != null;
    }

    public static String b() {
        if (q.a((CharSequence) f82235a) && a()) {
            f82235a = sg.bigo.ads.common.x.a.e(f82241g.getPackageName());
        }
        return f82235a;
    }

    public static String b(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f82235a : sg.bigo.ads.common.x.a.e(context.getPackageName());
    }

    public static void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null || sharedPreferences.getAll() == null) {
            return;
        }
        Object obj = sharedPreferences.getAll().get("IABTCF_gdprApplies");
        if (obj instanceof Integer) {
            f82236b = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                f82236b = Integer.parseInt((String) obj);
            } catch (Exception unused) {
                f82236b = 0;
            }
        }
    }

    public static int c() {
        if (f82241g == null || !sg.bigo.ads.common.x.b.a()) {
            return f82236b;
        }
        f82236b = e(f82241g) ? sg.bigo.ads.common.x.a.g(f82241g.getPackageName()) : -1;
        return f82236b;
    }

    public static int c(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f82236b : sg.bigo.ads.common.x.a.g(context.getPackageName());
    }

    public static void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f82237c = sharedPreferences.getString("IABTCF_PurposeLegitimateInterests", "");
        } catch (Exception unused) {
            f82237c = "";
        }
    }

    public static String d() {
        if (q.a((CharSequence) f82237c) && a()) {
            f82237c = sg.bigo.ads.common.x.a.h(f82241g.getPackageName());
        }
        return f82237c;
    }

    public static String d(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f82237c : sg.bigo.ads.common.x.a.h(context.getPackageName());
    }

    public static void d(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f82238d = sharedPreferences.getString("IABTCF_TCString", "");
        } catch (Exception unused) {
            f82238d = "";
        }
    }

    public static String e() {
        if (q.a((CharSequence) f82238d) && a()) {
            f82238d = sg.bigo.ads.common.x.a.f(f82241g.getPackageName());
        }
        return f82238d;
    }

    public static boolean e(Context context) {
        if (context == null || !sg.bigo.ads.common.x.b.a()) {
            return false;
        }
        return sg.bigo.ads.common.x.a.a(context.getPackageName() + "_preferences", "IABTCF_gdprApplies");
    }

    public static boolean f() {
        return f82239e;
    }

    public static void g() {
        f82239e = false;
    }

    public static /* synthetic */ boolean h() {
        f82239e = true;
        return true;
    }
}
