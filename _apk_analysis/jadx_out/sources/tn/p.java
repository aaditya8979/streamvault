package tn;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: compiled from: Intrinsics.java */
/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: compiled from: Intrinsics.java */
    public static class a {
    }

    public static void A(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void B(String str) {
        throw ((UninitializedPropertyAccessException) r(new UninitializedPropertyAccessException(str)));
    }

    public static void C(String str) {
        B("lateinit property " + str + " has not been initialized");
    }

    public static boolean a(float f10, Float f11) {
        return f11 != null && f10 == f11.floatValue();
    }

    public static boolean b(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    public static boolean c(Double d10, Double d11) {
        if (d10 == null) {
            if (d11 == null) {
                return true;
            }
        } else if (d11 != null && d10.doubleValue() == d11.doubleValue()) {
            return true;
        }
        return false;
    }

    public static boolean d(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean e(Float f10, Float f11) {
        if (f10 == null) {
            if (f11 == null) {
                return true;
            }
        } else if (f11 != null && f10.floatValue() == f11.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean f(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) r(new IllegalStateException(str + " must not be null")));
    }

    public static void h(Object obj) {
        if (obj == null) {
            u();
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            v(str);
        }
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) r(new NullPointerException(str + " must not be null")));
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            y(str);
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            x(str);
        }
    }

    public static int m(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int n(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static String o(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = p.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void p() {
        z();
    }

    public static void q(int i10, String str) {
        z();
    }

    public static <T extends Throwable> T r(T t10) {
        return (T) s(t10, p.class.getName());
    }

    public static <T extends Throwable> T s(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static String t(String str, Object obj) {
        return str + obj;
    }

    public static void u() {
        throw ((NullPointerException) r(new NullPointerException()));
    }

    public static void v(String str) {
        throw ((NullPointerException) r(new NullPointerException(str)));
    }

    public static void w() {
        throw ((KotlinNullPointerException) r(new KotlinNullPointerException()));
    }

    public static void x(String str) {
        throw ((IllegalArgumentException) r(new IllegalArgumentException(o(str))));
    }

    public static void y(String str) {
        throw ((NullPointerException) r(new NullPointerException(o(str))));
    }

    public static void z() {
        A("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
