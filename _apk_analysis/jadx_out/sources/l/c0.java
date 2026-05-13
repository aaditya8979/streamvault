package l;

import bp.w0;
import com.applovin.mediation.MaxAd;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f73585a;

    public c0(l lVar) {
        this.f73585a = lVar;
    }

    @Override // bp.w0
    public final void a(String str) {
        this.f73585a.v(str);
    }

    @Override // bp.w0
    public final void b(MaxAd maxAd) {
        this.f73585a.f71977z = "applovin_" + maxAd.getNetworkName();
        this.f73585a.r(maxAd);
    }

    @Override // bp.w0
    public final void c(double d10) {
        this.f73585a.f(d10);
    }
}
