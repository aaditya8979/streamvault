package e;

import bp.r0;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f59996c;

    public d(b0 b0Var) {
        this.f59996c = b0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f59996c.L.onAdClick();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f59996c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        b0 b0Var = this.f59996c;
        b0Var.L.onAdShow(r0.b(b0Var.P, b0Var.f71957f));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        d.b bVar = this.f59996c.N;
        if (bVar != null) {
            bp.h.a(bVar.f59482a);
            b0 b0Var = this.f59996c;
            b0Var.L.onAdLoaded(b0Var.N.f59482a);
        }
    }
}
