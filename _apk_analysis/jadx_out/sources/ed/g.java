package ed;

import java.util.ArrayList;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: compiled from: CacheDataUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class g {
    public static boolean a(String str) {
        return i0.a(str, i0.c()) > 600000;
    }

    public static boolean b(String str) {
        return i0.a(str, i0.c()) > 21600000;
    }

    public static boolean c() {
        return l0.c0();
    }

    public static <T> List<T> d(String str, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        try {
            String strD = ld.d.d(BaseApplication.getInstance());
            return !zp.o.b(strD) ? kd.a.e(BaseApplication.getInstance()).c(strD).b(str, cls) : arrayList;
        } catch (Exception unused) {
            return arrayList;
        }
    }

    public static void e() {
        l0.v0(i0.c());
    }

    public static <T> void f(String str, List<T> list) {
        try {
            String strD = ld.d.d(BaseApplication.getInstance());
            if (zp.o.b(strD)) {
                return;
            }
            kd.a.e(BaseApplication.getInstance()).c(strD).d(str, list);
        } catch (Exception unused) {
        }
    }

    public static void g() {
        l0.G0(i0.c());
    }

    public static void h(boolean z10) {
        l0.H0(z10);
    }
}
