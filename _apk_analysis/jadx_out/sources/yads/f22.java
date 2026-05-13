package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f22 implements t22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aq2 f89459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9 f89460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f89461c;

    public /* synthetic */ f22() {
        this(new aq2(), new n9(), new wy());
    }

    public f22(aq2 aq2Var, n9 n9Var, wy wyVar) {
        this.f89459a = aq2Var;
        this.f89460b = n9Var;
        this.f89461c = wyVar;
    }

    @Override // yads.t22
    public final fo2 a(v9 v9Var, d4 d4Var, d12 d12Var) {
        aq2 aq2Var = this.f89459a;
        fo2 fo2VarA = aq2Var.a(v9Var, d4Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!tn.y.m(linkedHashMap)) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (d12Var != null) {
            List listA = aq2Var.f87776b.a(d12Var);
            if (!listA.isEmpty()) {
                linkedHashMap.put("image_sizes", listA);
            }
            aq2Var.f87776b.getClass();
            List list = d12Var.f88690a;
            ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((fy1) it.next()).f89726a.f88588b);
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap.put("native_ad_types", arrayList);
            }
            aq2Var.f87776b.getClass();
            ArrayList arrayListB = g12.b(d12Var);
            Object objV0 = cn.f0.v0(arrayListB);
            if (objV0 == null) {
                linkedHashMap.put(CreativeInfo.f52474c, "undefined");
            } else {
                linkedHashMap.put(CreativeInfo.f52474c, objV0);
            }
            if (!(!arrayListB.isEmpty())) {
                arrayListB = null;
            }
            if (arrayListB == null) {
                linkedHashMap.put("ad_ids", "undefined");
            } else {
                linkedHashMap.put("ad_ids", arrayListB);
            }
        }
        c cVar = fo2VarA.f89653b;
        if (cVar == null) {
            cVar = null;
        }
        Map mapQ = kotlin.collections.a.q(fo2VarA.f89652a, linkedHashMap);
        if (!tn.y.m(mapQ)) {
            mapQ = null;
        }
        if (mapQ == null) {
            mapQ = new LinkedHashMap();
        }
        fo2 fo2VarA2 = this.f89460b.a(d4Var.f88744e);
        fo2 fo2VarA3 = this.f89461c.a(d4Var);
        if (cVar == null) {
            cVar = fo2VarA2.f89653b;
        }
        Map mapQ2 = kotlin.collections.a.q(mapQ, fo2VarA2.f89652a);
        Map linkedHashMap2 = tn.y.m(mapQ2) ? mapQ2 : null;
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        if (cVar == null) {
            cVar = fo2VarA3.f89653b;
        }
        return new fo2(kotlin.collections.a.q(linkedHashMap2, fo2VarA3.f89652a), cVar);
    }
}
