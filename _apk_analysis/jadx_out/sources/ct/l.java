package ct;

import bp.w0;
import com.applovin.mediation.MaxAd;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f59456a;

    public l(g gVar) {
        this.f59456a = gVar;
    }

    @Override // bp.w0
    public final void a(String str) {
        this.f59456a.v(str);
    }

    @Override // bp.w0
    public final void b(MaxAd maxAd) {
        this.f59456a.f71977z = "applovin_" + maxAd.getNetworkName();
        this.f59456a.r(maxAd);
    }

    @Override // bp.w0
    public final void c(double d10) {
        this.f59456a.f(d10);
    }
}
