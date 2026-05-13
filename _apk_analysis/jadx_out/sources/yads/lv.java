package yads;

import com.ironsource.Q6;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class lv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f92115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f92116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final az1 f92117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io2 f92118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sx f92119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final we f92120f;

    public lv(v9 v9Var, d4 d4Var, az1 az1Var, io2 io2Var, sx sxVar, we weVar) {
        this.f92115a = v9Var;
        this.f92116b = d4Var;
        this.f92117c = az1Var;
        this.f92118d = io2Var;
        this.f92119e = sxVar;
        this.f92120f = weVar;
    }

    public final eo2 a(co2 co2Var, Map map) {
        if (!tn.y.m(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = bo2.f88105a;
        if (str == null) {
            map.put(Q6.G1, "undefined");
        } else {
            map.put(Q6.G1, str);
        }
        fo2 fo2VarA = this.f92119e.a(this.f92115a, this.f92116b);
        c cVar = fo2VarA.f89653b;
        Map mapQ = kotlin.collections.a.q(map, fo2VarA.f89652a);
        Map linkedHashMap = tn.y.m(mapQ) ? mapQ : null;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        a03 a03Var = this.f92116b.f88743d.f87866a;
        if (a03Var != null) {
            String str2 = a03Var.b().f97849b;
            if (str2 == null) {
                linkedHashMap.put("size_type", "undefined");
            } else {
                linkedHashMap.put("size_type", str2);
            }
            linkedHashMap.put("width", Integer.valueOf(a03Var.getWidth()));
            linkedHashMap.put("height", Integer.valueOf(a03Var.getHeight()));
        }
        az1 az1Var = this.f92117c;
        if (az1Var != null) {
            Map mapD = cn.p0.d();
            mapD.put("asset_name", az1Var.f87844a);
            mapD.put("action_type", az1Var.f87845b);
            i22 i22Var = az1Var.f87846c;
            if (i22Var != null) {
                mapD.putAll(i22Var.a().f89652a);
            }
            Map map2 = az1Var.f87847d.f97113a;
            if (map2 != null) {
                mapD.putAll(map2);
            }
            linkedHashMap.putAll(cn.p0.c(mapD));
        }
        return new eo2(co2Var.f88557b, kotlin.collections.a.C(linkedHashMap), cVar);
    }
}
