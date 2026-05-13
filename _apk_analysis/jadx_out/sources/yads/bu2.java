package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bu2 extends po {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f88148w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yo2 f88149x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Map f88150y;

    public bu2(Context context, String str, cu2 cu2Var, Map map, du2 du2Var, du2 du2Var2) {
        super(context, 0, str, du2Var2, du2Var);
        this.f88148w = context;
        this.f88149x = cu2Var;
        this.f88150y = map;
        l();
        m();
    }

    @Override // yads.po, yads.po2
    public final im3 a(im3 im3Var) {
        m4 m4Var;
        boolean z10 = ad1.f87661a;
        int i10 = h4.f90234d;
        e82 e82Var = im3Var.f90905b;
        Integer numValueOf = e82Var != null ? Integer.valueOf(e82Var.f89157a) : null;
        if (numValueOf == null) {
            m4Var = im3Var instanceof b92 ? m4.f92250l : im3Var instanceof v63 ? m4.f92251m : im3Var instanceof pl ? m4.f92252n : im3Var instanceof ov ? m4.f92253o : im3Var instanceof mb2 ? m4.f92254p : m4.f92255q;
        } else {
            int iIntValue = numValueOf.intValue();
            m4Var = (500 > iIntValue || iIntValue > 599) ? m4.f92243e : m4.f92244f;
        }
        return new h4(m4Var, e82Var);
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        m4 m4Var;
        if (200 == e82Var.f89157a) {
            nt2 nt2Var = (nt2) this.f88149x.a(e82Var);
            if (nt2Var != null) {
                Map mapJ = e82Var.f89159c;
                if (mapJ == null) {
                    mapJ = kotlin.collections.a.j();
                }
                String strC = t01.c(mapJ, u11.R);
                if (strC != null) {
                    tx2 tx2Var = ux2.f95866a;
                    Context context = this.f93660s;
                    tx2Var.getClass();
                    ((tg1) ((vx2) tx2.a(context)).f96221b).a("ServerSideClientIP", strC);
                }
                return new vp2(nt2Var, v11.a(e82Var));
            }
            m4Var = m4.f92241c;
        } else {
            m4Var = m4.f92243e;
        }
        return new vp2(new h4(m4Var, e82Var));
    }

    @Override // yads.po2
    public final Map d() {
        HashMap map = new HashMap();
        Context context = this.f88148w;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && nt2VarA.f92986z) {
            u11 u11Var = u11.f95481c;
            map.put("encrypted-request", "1");
        }
        map.putAll(this.f88150y);
        return map;
    }
}
