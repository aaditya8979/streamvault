package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class xf {
    public static void a(Context context, at1 at1Var) {
        vf vfVar;
        p000do.h0 h0VarB = p000do.w0.b();
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(p000do.j2.b(null, 1, null).plus(p000do.w0.b()).plus(new y10(at1Var)));
        jf jfVar = new jf(h0VarB, new Handler(Looper.getMainLooper()));
        pf pfVar = new pf(at1Var);
        d63 d63Var = new d63();
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || !nt2VarA.f92947f0) {
            return;
        }
        Long l10 = nt2VarA.f92949g0;
        long jLongValue = l10 != null ? l10.longValue() : 1000L;
        Long l11 = nt2VarA.f92951h0;
        long jLongValue2 = l11 != null ? l11.longValue() : 6000L;
        Set setF = nt2VarA.f92963n0;
        if (setF == null) {
            setF = cn.w0.f();
        }
        Set set = setF;
        Object obj2 = vf.f96067j;
        vf vfVar2 = vf.f96068k;
        if (vfVar2 == null) {
            synchronized (vf.f96067j) {
                vfVar = vf.f96068k;
                if (vfVar == null) {
                    vfVar = new vf(jLongValue, jLongValue2, set, l0VarA, jfVar, pfVar, d63Var);
                    vf.f96068k = vfVar;
                }
            }
            vfVar2 = vfVar;
        }
        if (vfVar2.f96077i.getAndSet(true)) {
            return;
        }
        p000do.i.d(vfVar2.f96072d, vfVar2.f96076h, null, new tf(vfVar2, null), 2, null).f(new uf(vfVar2));
    }
}
