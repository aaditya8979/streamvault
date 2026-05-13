package ct;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends AdListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f59442c;

    public f(a0 a0Var) {
        this.f59442c = a0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f59442c.F.onAdClick();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        super.onAdClosed();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f59442c.v(loadAdError.getCode() + ", " + loadAdError.getMessage());
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        super.onAdImpression();
        a0 a0Var = this.f59442c;
        a0Var.F.onAdShow(bp.r0.b(a0Var.H, a0Var.f71957f));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        d.b bVar = this.f59442c.I;
        if (bVar != null) {
            bp.h.a(bVar.f59482a);
            a0 a0Var = this.f59442c;
            a0Var.F.onAdLoaded(a0Var.I.f59482a);
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        a0 a0Var = this.f59442c;
        if (a0Var.D) {
            a0Var.C();
            this.f59442c.F.onAdClose();
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdSwipeGestureClicked() {
        super.onAdSwipeGestureClicked();
    }
}
