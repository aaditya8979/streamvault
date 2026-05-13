package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j9 implements ep2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f91128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9 f91129b = new n9();

    public j9(d4 d4Var) {
        this.f91128a = d4Var;
    }

    @Override // yads.ep2
    public final Map a() {
        Map mapO = kotlin.collections.a.o(bn.h.a("ad_type", this.f91128a.f88740a.f89049b));
        String str = this.f91128a.f88742c.f90339a;
        if (str != null) {
            mapO.put("ad_unit_id", str);
        }
        mapO.putAll(this.f91129b.a(this.f91128a.f88744e).f89652a);
        return mapO;
    }
}
