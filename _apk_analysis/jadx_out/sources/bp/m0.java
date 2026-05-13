package bp;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5814b;

    public m0(j jVar) {
        this.f5814b = jVar;
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public final void onAdRevenuePaid(MaxAd maxAd) {
        n0 n0Var = this.f5814b.f5785b;
        n0Var.f5834o.onAdShow(r0.b(maxAd, n0Var.f5821b));
    }
}
