package f;

import bp.w0;
import com.applovin.mediation.MaxAd;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f61374a;

    public e0(o oVar) {
        this.f61374a = oVar;
    }

    @Override // bp.w0
    public final void a(String str) {
        this.f61374a.v(str);
    }

    @Override // bp.w0
    public final void b(MaxAd maxAd) {
        this.f61374a.f71977z = "applovin_" + maxAd.getNetworkName();
        this.f61374a.r(maxAd);
    }

    @Override // bp.w0
    public final void c(double d10) {
        this.f61374a.f(d10);
    }
}
