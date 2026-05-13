package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class mp3 implements fp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg3 f92498a;

    public mp3(fg3 fg3Var) {
        this.f92498a = fg3Var;
    }

    @Override // yads.fp2
    public final eo2 a(Object obj) {
        Map mapA = this.f92498a.a();
        co2 co2Var = co2.f88533c;
        return new eo2("vast_wrapper_request", kotlin.collections.a.C(mapA), null);
    }

    @Override // yads.fp2
    public final eo2 a(vp2 vp2Var, int i10, Object obj) {
        List list = vp2Var != null ? (List) vp2Var.f96161a : null;
        Map mapQ = kotlin.collections.a.q(this.f92498a.a(), cn.p0.g(bn.h.a("status", (204 == i10 ? do2.f88939e : (list == null || i10 != 200) ? do2.f88938d : list.isEmpty() ? do2.f88939e : do2.f88937c).f88941b)));
        co2 co2Var = co2.f88533c;
        return new eo2("vast_wrapper_response", kotlin.collections.a.C(mapQ), null);
    }
}
