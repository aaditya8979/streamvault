package e;

import bp.w0;
import com.applovin.mediation.MaxAd;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f60015a;

    public t(p pVar) {
        this.f60015a = pVar;
    }

    @Override // bp.w0
    public final void a(String str) {
        this.f60015a.v(str);
    }

    @Override // bp.w0
    public final void b(MaxAd maxAd) {
        this.f60015a.f71977z = "applovin_" + maxAd.getNetworkName();
        this.f60015a.r(maxAd);
    }

    @Override // bp.w0
    public final void c(double d10) {
        this.f60015a.f(d10);
    }
}
