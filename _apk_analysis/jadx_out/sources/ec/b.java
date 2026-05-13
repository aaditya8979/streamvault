package ec;

import android.util.Log;
import zp.o;

/* JADX INFO: compiled from: ELog.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f60956a = "ELog";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f60957b = true;

    public static void a(String str) {
        b(f60956a, str);
    }

    public static void b(String str, String str2) {
        h(str, str2, 3);
    }

    public static void c(String str) {
        d(f60956a, str);
    }

    public static void d(String str, String str2) {
        h(str, str2, 2);
    }

    public static void e(String str, Throwable th2) {
    }

    public static void f(String str) {
        g(f60956a, str);
    }

    public static void g(String str, String str2) {
        h(str, str2, 1);
    }

    public static void h(String str, String str2, int i10) {
        String strD = o.d(str2);
        if (f60957b) {
            if (i10 == 1) {
                Log.i(str, strD);
                return;
            }
            if (i10 == 2) {
                Log.e(str, strD);
                return;
            }
            if (i10 == 3) {
                Log.d(str, strD);
            } else if (i10 != 4) {
                Log.v(str, strD);
            } else {
                Log.v(str, strD);
            }
        }
    }
}
