package yads;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class y52 implements fg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f97008a;

    public y52(d4 d4Var) {
        this.f97008a = d4Var;
    }

    @Override // yads.fg3
    public final Map a() {
        Pair[] pairArr = new Pair[2];
        String str = this.f97008a.f88742c.f90339a;
        if (str == null || bo.d0.u0(str)) {
            str = "undefined";
        }
        pairArr[0] = bn.h.a("ad_unit_id", str);
        pairArr[1] = bn.h.a("ad_type", this.f97008a.f88740a.f89049b);
        return kotlin.collections.a.m(pairArr);
    }
}
