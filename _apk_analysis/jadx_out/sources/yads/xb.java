package yads;

import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class xb implements yb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f96699b = {wb.a(xb.class, "adViewReference", "getAdViewReference()Lcom/monetization/ads/banner/InternalAdView;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f96700a;

    public xb(tc1 tc1Var) {
        this.f96700a = mm2.a(tc1Var);
    }

    @Override // yads.yb
    public final boolean a() {
        lm2 lm2Var = this.f96700a;
        KProperty kProperty = f96699b[0];
        tc1 tc1Var = (tc1) lm2Var.f92035a.get();
        return tc1Var != null && kl3.f91651a.a(tc1Var).f96809a >= 1;
    }
}
