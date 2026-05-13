package tn;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import un.e;

/* JADX INFO: compiled from: TypeIntrinsics.java */
/* JADX INFO: loaded from: classes2.dex */
public class y {
    public static Collection a(Object obj) {
        if ((obj instanceof un.a) && !(obj instanceof un.b)) {
            r(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof un.a) && !(obj instanceof un.c)) {
            r(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof un.a) && !(obj instanceof un.d)) {
            r(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof un.a) && !(obj instanceof un.e)) {
            r(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            r(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw q(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).getArity();
        }
        if (obj instanceof sn.a) {
            return 0;
        }
        if (obj instanceof sn.l) {
            return 1;
        }
        if (obj instanceof sn.p) {
            return 2;
        }
        if (obj instanceof sn.q) {
            return 3;
        }
        if (obj instanceof sn.r) {
            return 4;
        }
        if (obj instanceof sn.s) {
            return 5;
        }
        if (obj instanceof sn.t) {
            return 6;
        }
        if (obj instanceof sn.u) {
            return 7;
        }
        if (obj instanceof sn.v) {
            return 8;
        }
        if (obj instanceof sn.w) {
            return 9;
        }
        if (obj instanceof sn.b) {
            return 10;
        }
        if (obj instanceof sn.c) {
            return 11;
        }
        if (obj instanceof sn.d) {
            return 12;
        }
        if (obj instanceof sn.e) {
            return 13;
        }
        if (obj instanceof sn.f) {
            return 14;
        }
        if (obj instanceof sn.g) {
            return 15;
        }
        if (obj instanceof sn.h) {
            return 16;
        }
        if (obj instanceof sn.i) {
            return 17;
        }
        if (obj instanceof sn.j) {
            return 18;
        }
        if (obj instanceof sn.k) {
            return 19;
        }
        if (obj instanceof sn.m) {
            return 20;
        }
        if (obj instanceof sn.n) {
            return 21;
        }
        return obj instanceof sn.o ? 22 : -1;
    }

    public static boolean k(Object obj, int i10) {
        return (obj instanceof bn.e) && j(obj) == i10;
    }

    public static boolean l(Object obj) {
        return (obj instanceof List) && (!(obj instanceof un.a) || (obj instanceof un.d));
    }

    public static boolean m(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof un.a) || (obj instanceof un.e));
    }

    public static boolean n(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof un.a) || (obj instanceof e.a));
    }

    public static boolean o(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof un.a) || (obj instanceof un.f));
    }

    public static <T extends Throwable> T p(T t10) {
        return (T) p.s(t10, y.class.getName());
    }

    public static ClassCastException q(ClassCastException classCastException) {
        throw ((ClassCastException) p(classCastException));
    }

    public static void r(Object obj, String str) {
        s((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void s(String str) {
        throw q(new ClassCastException(str));
    }
}
