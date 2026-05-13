package yads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f97000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f97001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc2 f97002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final we f97003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ep2 f97004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fq2 f97005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f97006g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y5(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f93787a;
        this(d4Var, cf.a(context, iu3Var.b()), new x5(w5Var), new we(context));
    }

    public y5(d4 d4Var, io2 io2Var, qc2 qc2Var, we weVar) {
        this.f97000a = d4Var;
        this.f97001b = io2Var;
        this.f97002c = qc2Var;
        this.f97003d = weVar;
    }

    public final void a() {
        HashMap map = new HashMap();
        map.put("status", "success");
        map.put("durations", this.f97002c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f97006g));
        a(map);
    }

    public final void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("status", "error");
        map.put("failure_reason", str);
        map.put("reason", str2);
        map.put("durations", this.f97002c.a());
        map.put("load_listener_available", Boolean.valueOf(this.f97006g));
        a(map);
    }

    public final void a(HashMap map) {
        fo2 fo2Var = new fo2(map, 2);
        ep2 ep2Var = this.f97004e;
        if (ep2Var != null) {
            fo2Var.f89652a.putAll(ep2Var.a());
        }
        fq2 fq2Var = this.f97005f;
        if (fq2Var != null) {
            fo2Var = go2.a(fo2Var, ((i12) fq2Var).a());
        }
        co2 co2Var = co2.f88533c;
        Map map2 = fo2Var.f89652a;
        c cVar = fo2Var.f89653b;
        Map mapC = kotlin.collections.a.C(map2);
        this.f97001b.a(new eo2("ad_loading_result", mapC, cVar));
        if (tn.p.f(map.get("status"), "success")) {
            we weVar = this.f97003d;
            String str = this.f97000a.f88751l;
            if (str == null) {
                str = bo2.f88105a;
            }
            weVar.a(co2Var, mapC, str, null);
        }
    }

    public final void a(Object... objArr) {
        int length = objArr.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (objArr[i10] != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        this.f97006g = z10;
    }
}
