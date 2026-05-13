package k;

import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements InterstitialAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f72665b;

    public r0(e0 e0Var) {
        this.f72665b = e0Var;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        this.f72665b.f72641b.D.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        this.f72665b.f72641b.D.onAdClose();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdLog.e("LoadAdCallback - onError, Placement Reference ID = " + baseAd.getPlacementId() + ", Error = " + vungleError.getLocalizedMessage());
        this.f72665b.f72641b.v(vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f72665b.f72641b.v("PlayAdCallback - onError, Placement Reference ID = " + baseAd.getPlacementId() + ", Error = " + vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdImpression(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLeftApplication(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdLoaded(BaseAd baseAd) {
        AdLog.d("LoadAdCallback - onAdLoad\tPlacement Reference ID = " + baseAd.getPlacementId());
        InterstitialAd interstitialAd = this.f72665b.f72641b.I;
        if (interstitialAd == null || !interstitialAd.canPlayAd().booleanValue()) {
            this.f72665b.f72641b.v("channelAd can't play");
            return;
        }
        a0 a0Var = this.f72665b.f72641b;
        a0Var.E = true;
        if (a0Var.F) {
            return;
        }
        baseAd.getPlacementId();
        this.f72665b.f72641b.D.onAdLoaded();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
        a0 a0Var = this.f72665b.f72641b;
        a0Var.D.onAdShow(bp.r0.b(null, a0Var.f71957f));
    }
}
