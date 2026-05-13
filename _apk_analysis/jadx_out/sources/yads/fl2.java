package yads;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public abstract class fl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bv1 f89616a;

    static {
        bv1 bv1Var = bv1.f88154b;
        f89616a = av1.a();
    }

    public static void a(String str, Object... objArr) {
        boolean z10;
        if (!ad1.f87661a) {
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
        if (ad1.f87661a) {
            Log.w("Yandex Mobile Ads", str2);
        }
        if (eu1.f89374b) {
            f89616a.a(du1.f88978c, "Yandex Mobile Ads", str2);
        }
    }
}
