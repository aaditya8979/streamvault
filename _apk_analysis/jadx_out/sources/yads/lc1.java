package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public abstract class lc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bv1 f91930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f91931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f91932c;

    static {
        bv1 bv1Var = bv1.f88154b;
        f91930a = av1.a();
        f91931b = "YandexAds";
        f91932c = true;
    }

    public static String a(String str) {
        return "[Integration] " + str;
    }

    public static final void a(String str, Object... objArr) {
        boolean z10;
        if (!f91932c) {
            synchronized (eu1.f89373a) {
                z10 = eu1.f89374b;
            }
            if (!z10) {
                return;
            }
        }
        tn.x xVar = tn.x.f85368a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        tn.p.j(str2, "format(...)");
        String strA = a(str2);
        if (f91932c) {
            Log.e(f91931b, strA);
        }
        if (eu1.f89374b) {
            f91930a.a(du1.f88979d, f91931b, strA);
        }
    }

    public static final void b(String str, Object... objArr) {
        boolean z10;
        if (!f91932c) {
            synchronized (eu1.f89373a) {
                z10 = eu1.f89374b;
            }
            if (!z10) {
                return;
            }
        }
        tn.x xVar = tn.x.f85368a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        tn.p.j(str2, "format(...)");
        String strA = a(str2);
        if (f91932c) {
            Log.i(f91931b, strA);
        }
        if (eu1.f89374b) {
            f91930a.a(du1.f88977b, f91931b, strA);
        }
    }

    public static final void c(String str, Object... objArr) {
        boolean z10;
        if (!f91932c) {
            synchronized (eu1.f89373a) {
                z10 = eu1.f89374b;
            }
            if (!z10) {
                return;
            }
        }
        tn.x xVar = tn.x.f85368a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        tn.p.j(str2, "format(...)");
        String strA = a(str2);
        if (f91932c) {
            Log.w(f91931b, strA);
        }
        if (eu1.f89374b) {
            f91930a.a(du1.f88978c, f91931b, strA);
        }
    }
}
