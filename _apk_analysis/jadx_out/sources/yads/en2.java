package yads;

import android.os.SystemClock;
import android.view.View;
import com.ironsource.Q6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class en2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e9 f89323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fn2 f89324c;

    public en2(fn2 fn2Var, e9 e9Var) {
        this.f89324c = fn2Var;
        this.f89323b = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List listP;
        pi piVarA;
        String str;
        rn1 rn1VarD;
        if (this.f89324c.f89644d) {
            return;
        }
        e9 e9Var = this.f89323b;
        if (e9Var.f89168a.a()) {
            t12 t12Var = e9Var.f89169b;
            t12Var.f95045c.getClass();
            nt2 nt2VarA = t12Var.f95046d.a(t12Var.f95043a);
            if (nt2VarA == null || !nt2VarA.A || (((ny1) t12Var.f95044b).a(false) instanceof rb3)) {
                fn2 fn2Var = this.f89324c;
                fn2Var.f89644d = true;
                in2 in2Var = fn2Var.f89642b;
                kn2 kn2Var = in2Var.f90921c;
                if (kn2Var != null) {
                    kn2Var.f91667a = Long.valueOf(SystemClock.elapsedRealtime());
                }
                hn2 hn2Var = in2Var.f90922d;
                Iterator it = hn2Var.f90469a.iterator();
                while (it.hasNext()) {
                    za.a(hn2Var.f90470b, (String) it.next(), k83.f91518i);
                }
                gn2 gn2Var = hn2Var.f90471c;
                fo2 fo2VarA = gn2Var.f90051f.a(gn2Var.f90047b, gn2Var.f90046a);
                fo2VarA.b(bo2.f88105a, Q6.G1);
                m42 m42Var = gn2Var.f90052g;
                if (m42Var != null) {
                    Map map = m42Var.f92263a.a().f89652a;
                    nj njVar = m42Var.f92264b;
                    njVar.getClass();
                    HashMap map2 = new HashMap();
                    for (oi oiVar : njVar.f92856a) {
                        String str2 = oiVar.f93229a;
                        l12 l12Var = njVar.f92857b;
                        if (l12Var != null && (piVarA = l12Var.a(oiVar)) != null && piVarA.b()) {
                            HashMap map3 = new HashMap();
                            zk3 zk3VarC = piVarA.c();
                            if (zk3VarC != null) {
                                map3.put("width", Integer.valueOf(fa3.a(zk3VarC.f97648a)));
                                map3.put("height", Integer.valueOf(fa3.a(zk3VarC.f97649b)));
                            }
                            rj1 rj1Var = piVarA instanceof rj1 ? (rj1) piVarA : null;
                            if (rj1Var != null) {
                                sn1 sn1Var = rj1Var.f94470b;
                                rn1 rn1Var = (sn1Var == null || (rn1VarD = sn1Var.d()) == null) ? rj1Var.f94469a != null ? rn1.f94525f : null : rn1VarD;
                                if (rn1Var != null && (str = rn1Var.f94528b) != null) {
                                    map3.put("value_type", str);
                                }
                            }
                            map2.put(str2, map3);
                        }
                    }
                    l12 l12Var2 = njVar.f92857b;
                    View viewA = l12Var2 != null ? l12Var2.f91863c.a() : null;
                    Map mapD = cn.p0.d();
                    if (viewA != null) {
                        mapD.put("width", Integer.valueOf(fa3.a(viewA.getWidth())));
                        mapD.put("height", Integer.valueOf(fa3.a(viewA.getHeight())));
                    }
                    Map mapC = cn.p0.c(mapD);
                    if (!mapC.isEmpty()) {
                        map2.put("superview", mapC);
                    }
                    fo2VarA.f89652a.putAll(kotlin.collections.a.q(map, cn.p0.g(bn.h.a("assets", cn.p0.g(bn.h.a("rendered", map2))))));
                }
                a03 a03Var = gn2Var.f90046a.f88743d.f87866a;
                if (a03Var != null) {
                    fo2VarA.b(a03Var.b().f97849b, "size_type");
                    fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
                    fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
                }
                nt2 nt2Var = gn2Var.f90050e;
                if (nt2Var != null) {
                    fo2VarA.b(nt2Var.O, "banner_size_calculation_type");
                }
                int iOrdinal = gn2Var.f90048c.ordinal();
                if (iOrdinal == 0) {
                    listP = cn.w.p(co2.f88544n, co2.f88543m);
                } else if (iOrdinal == 1) {
                    listP = cn.v.e(co2.f88544n);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listP = cn.v.e(co2.f88543m);
                }
                Iterator it2 = listP.iterator();
                while (it2.hasNext()) {
                    gn2Var.f90049d.a(new eo2(((co2) it2.next()).f88557b, kotlin.collections.a.C(fo2VarA.f89652a), fo2VarA.f89653b));
                }
                f5 f5Var = in2Var.f90919a;
                String str3 = f5Var.f89483a.f89055a;
                if (str3 != null && str3.length() != 0) {
                    e5 e5Var = f5Var.f89484b;
                    e5Var.getClass();
                    synchronized (e5.f89096c) {
                        e5Var.f89098a.remove(str3);
                        e5Var.f89098a.add(str3);
                    }
                }
                in2Var.f90920b.f();
                return;
            }
        }
        fn2 fn2Var2 = this.f89324c;
        fn2Var2.f89643c.postDelayed(new en2(fn2Var2, this.f89323b), 300L);
    }
}
