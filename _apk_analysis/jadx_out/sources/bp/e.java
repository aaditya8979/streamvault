package bp;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements MaxAdRevenueListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f5751b;

    public e(j jVar) {
        this.f5751b = jVar;
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public final void onAdRevenuePaid(MaxAd maxAd) {
        n0 n0Var = this.f5751b.f5785b;
        n0Var.f5834o.onAdShow(r0.b(maxAd, n0Var.f5821b));
    }
}
