package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class fp1 implements cy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f89654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hq1 f89655b;

    public fp1(v9 v9Var, hq1 hq1Var) {
        this.f89654a = v9Var;
        this.f89655b = hq1Var;
    }

    @Override // yads.cy0
    public final by0 b(fy0 fy0Var) {
        return new yp1(fy0Var, this.f89654a, this.f89655b);
    }

    @Override // yads.cy0
    public final by0 c(fy0 fy0Var) {
        return new com.monetization.ads.mediation.interstitial.c(fy0Var, this.f89654a, this.f89655b);
    }
}
