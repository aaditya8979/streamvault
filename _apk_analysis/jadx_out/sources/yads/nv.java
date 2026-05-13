package yads;

import android.content.Context;
import com.ironsource.C3978d4;
import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class nv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f92994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f92995b;

    public nv(d4 d4Var, lu2 lu2Var) {
        this.f92994a = d4Var;
        this.f92995b = lu2Var;
    }

    public final void a(Context context, e00 e00Var, ih2 ih2Var, Long l10) {
        Map mapJ = kotlin.collections.a.j();
        if (!tn.y.m(mapJ)) {
            mapJ = null;
        }
        if (mapJ == null) {
            mapJ = new LinkedHashMap();
        }
        String str = "undefined";
        if (e00Var == null) {
            mapJ.put("ad_type", "undefined");
        } else {
            mapJ.put("ad_type", e00Var);
        }
        if (l10 == null) {
            mapJ.put("duration", "undefined");
        } else {
            mapJ.put("duration", l10);
        }
        LinkedHashMap linkedHashMapA = kh2.a(ih2Var);
        mapJ.putAll(linkedHashMapA);
        String str2 = (String) linkedHashMapA.get(Q6.G1);
        aq2 aq2Var = new aq2();
        n9 n9Var = new n9();
        d4 d4Var = this.f92994a;
        fo2 fo2VarB = aq2Var.b(null, d4Var);
        fo2 fo2VarA = n9Var.a(d4Var.f88744e);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!tn.y.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        int i10 = d4Var.f88753n;
        if (i10 == 1) {
            str = C3978d4.i.D;
        } else if (i10 == 2) {
            str = C3978d4.i.C;
        }
        linkedHashMap.put("orientation", str);
        fo2 fo2VarA2 = go2.a(fo2VarB, fo2VarA);
        c cVar = fo2VarA2.f89653b;
        if (cVar == null) {
            cVar = null;
        }
        fo2 fo2Var = new fo2(kotlin.collections.a.q(fo2VarA2.f89652a, linkedHashMap), cVar);
        c cVar2 = fo2Var.f89653b;
        Map mapQ = kotlin.collections.a.q(mapJ, fo2Var.f89652a);
        if (!tn.y.m(mapQ)) {
            mapQ = null;
        }
        if (mapQ == null) {
            mapQ = new LinkedHashMap();
        }
        co2 co2Var = co2.I;
        Map mapC = kotlin.collections.a.C(mapQ);
        eo2 eo2Var = new eo2("client_bidding_loading_result", mapC, cVar2);
        ((iu3) this.f92995b).getClass();
        pu3 pu3Var = pu3.f93787a;
        cf.a(context, new cq3(((iu3) this.f92995b).f90998a)).a(eo2Var);
        new we(context).a(co2Var, mapC, str2, null);
    }
}
