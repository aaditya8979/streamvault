package yads;

import android.content.Context;
import com.ironsource.C3978d4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class oy1 extends p32 implements w02 {
    public final fy1 P;
    public final s02 Q;
    public final mi2 R;
    public final i22 S;

    public oy1(Context context, fy1 fy1Var, s02 s02Var, mi2 mi2Var, up upVar, fz1 fz1Var) {
        super(context, upVar, fz1Var);
        this.P = fy1Var;
        this.Q = s02Var;
        this.R = mi2Var;
        d4 d4Var = upVar.f95737a.f94649c;
        cq2 cq2Var = fy1Var.f89726a;
        i22 i22Var = new i22(d4Var, cq2Var.f88588b, this.f93404i, this.f93405j, new oz2(fy1Var, new aq2(), new n9(), new wy()));
        this.S = i22Var;
        a(i22Var);
    }

    @Override // yads.w02
    public final gc a() {
        return this.Q.f94663a.f89734i;
    }

    @Override // yads.w02
    public final void a(b10 b10Var) {
        this.Q.f94669g.remove(b10Var);
    }

    @Override // yads.w02
    public final void a(r12 r12Var) throws j02 {
        this.S.f90644f = r12Var.f94255e;
        a(r12Var.f94253c, this.R, new z12(r12Var));
    }

    @Override // yads.w02
    public final void a(r12 r12Var, pu puVar) {
        a(r12Var.f94253c, this.R, new z12(r12Var), puVar);
    }

    @Override // yads.w02
    public final void b(b10 b10Var) {
        this.Q.f94669g.add(b10Var);
    }

    @Override // yads.w02
    public final y00 getAdAssets() {
        h10 h10Var;
        fw fwVar;
        n10 n10Var;
        h10 h10Var2;
        List list;
        s02 s02Var = this.Q;
        my1 my1Var = s02Var.f94668f;
        fy1 fy1Var = s02Var.f94663a;
        my1Var.getClass();
        List<oi> list2 = fy1Var.f89727b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(list2, 10)), 16));
        for (oi oiVar : list2) {
            Pair pairA = bn.h.a(oiVar.f93229a, oiVar.f93231c);
            linkedHashMap.put(pairA.getFirst(), pairA.getSecond());
        }
        Object obj = linkedHashMap.get(C3978d4.i.I0);
        o10 o10Var = null;
        on1 on1Var = obj instanceof on1 ? (on1) obj : null;
        Object obj2 = linkedHashMap.get("favicon");
        u41 u41Var = obj2 instanceof u41 ? (u41) obj2 : null;
        Object obj3 = linkedHashMap.get("icon");
        u41 u41Var2 = obj3 instanceof u41 ? (u41) obj3 : null;
        Object obj4 = linkedHashMap.get("close_button");
        gw gwVar = obj4 instanceof gw ? (gw) obj4 : null;
        Object obj5 = linkedHashMap.get("age");
        String str = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = linkedHashMap.get("body");
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = linkedHashMap.get("call_to_action");
        String str3 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = linkedHashMap.get(C3978d4.j.D);
        String str4 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = linkedHashMap.get("price");
        String str5 = obj9 instanceof String ? (String) obj9 : null;
        Object obj10 = linkedHashMap.get("rating");
        String str6 = obj10 instanceof String ? (String) obj10 : null;
        Object obj11 = linkedHashMap.get("review_count");
        String str7 = obj11 instanceof String ? (String) obj11 : null;
        Object obj12 = linkedHashMap.get("sponsored");
        String str8 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = linkedHashMap.get("title");
        String str9 = obj13 instanceof String ? (String) obj13 : null;
        Object obj14 = linkedHashMap.get("warning");
        String str10 = obj14 instanceof String ? (String) obj14 : null;
        boolean z10 = linkedHashMap.get("feedback") != null;
        u41 u41Var3 = (on1Var == null || (list = on1Var.f93293c) == null) ? null : (u41) cn.f0.v0(list);
        g02 g02Var = my1Var.f92640b;
        mi2 mi2Var = my1Var.f92639a;
        g02Var.getClass();
        a10 a10VarA = g02.a(mi2Var, u41Var3);
        g02 g02Var2 = my1Var.f92640b;
        mi2 mi2Var2 = my1Var.f92639a;
        g02Var2.getClass();
        a10 a10VarA2 = g02.a(mi2Var2, u41Var);
        g02 g02Var3 = my1Var.f92640b;
        mi2 mi2Var3 = my1Var.f92639a;
        g02Var3.getClass();
        a10 a10VarA3 = g02.a(mi2Var3, u41Var2);
        t02 t02Var = my1Var.f92641c;
        t02Var.getClass();
        if (on1Var != null) {
            sd3 sd3Var = on1Var.f93292b;
            List list3 = on1Var.f93293c;
            oj1 oj1Var = on1Var.f93291a;
            if (sd3Var != null) {
                yg3 yg3Var = t02Var.f95029a;
                je3 je3Var = (je3) cn.f0.t0(sd3Var.f94800a);
                yg3Var.getClass();
                int i10 = ((n62) je3Var.f91197d).f92755c;
                h10Var2 = new h10(i10 != 0 ? r1.f92754b / i10 : 1.7777778f);
            } else if (list3 == null || list3.size() <= 1) {
                if (oj1Var != null) {
                    h10Var2 = new h10(oj1Var.f93236b);
                }
                h10Var = null;
            } else {
                t02Var.f95030b.getClass();
                h10Var2 = new h10((float) gx1.a(list3));
            }
            h10Var = h10Var2;
        } else {
            h10Var = null;
        }
        my1Var.f92643e.getClass();
        if (gwVar != null && (fwVar = gwVar.f90134a) != null) {
            int iOrdinal = fwVar.ordinal();
            if (iOrdinal == 0) {
                n10Var = n10.f92688b;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                n10Var = n10.f92689c;
            }
            o10Var = new o10(n10Var, gwVar.f90135b);
        }
        my1Var.f92642d.getClass();
        return new y00(h10Var, a10VarA2, a10VarA3, a10VarA, o10Var, str, str2, str3, str4, str5, j22.a(str6), str7, str8, str9, str10, z10);
    }

    @Override // yads.w02
    public final cq2 getAdType() {
        return this.Q.f94663a.f89726a;
    }

    @Override // yads.w02
    public final String getCampaignId() {
        return this.P.f89736k;
    }

    @Override // yads.w02
    public final String getCreativeId() {
        return this.P.f89735j;
    }

    @Override // yads.w02
    public final String getInfo() {
        return this.Q.f94663a.f89729d;
    }

    @Override // yads.p32, yads.w02
    public final void loadImages() {
        s02 s02Var = this.Q;
        List listE = cn.v.e(s02Var.f94663a);
        b51 b51Var = s02Var.f94667e;
        b51Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            cn.b0.F(linkedHashSet, b51Var.a(((fy1) it.next()).f89727b));
        }
        s02Var.f94666d.a(linkedHashSet, new r02(s02Var));
    }
}
