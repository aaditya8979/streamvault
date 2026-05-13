package c;

import bp.r0;
import com.vungle.ads.BaseAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleError;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 implements RewardedAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f6485b;

    public q0(q qVar) {
        this.f6485b = qVar;
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdClicked(BaseAd baseAd) {
        this.f6485b.f6483b.onAdClick();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdEnd(BaseAd baseAd) {
        this.f6485b.f6483b.onAdClose();
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        AdLog.e("LoadAdCallback - onError, Placement Reference ID = " + baseAd.getPlacementId() + ", Error = " + vungleError.getLocalizedMessage());
        this.f6485b.f6484c.v(vungleError.getLocalizedMessage());
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        this.f6485b.f6484c.v("PlayAdCallback - onError, Placement Reference ID = " + baseAd.getPlacementId() + ", Error = " + vungleError.getLocalizedMessage());
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
        RewardedAd rewardedAd = this.f6485b.f6484c.G;
        if (rewardedAd == null || !rewardedAd.canPlayAd().booleanValue()) {
            this.f6485b.f6484c.v("");
            return;
        }
        d dVar = this.f6485b.f6484c;
        dVar.B = true;
        if (dVar.D) {
            return;
        }
        baseAd.getPlacementId();
        this.f6485b.f6483b.onAdVideoCache();
    }

    @Override // com.vungle.ads.RewardedAdListener
    public final void onAdRewarded(BaseAd baseAd) {
        this.f6485b.f6483b.onReward("");
    }

    @Override // com.vungle.ads.BaseAdListener
    public final void onAdStart(BaseAd baseAd) {
        q qVar = this.f6485b;
        qVar.f6483b.onAdShow(r0.b(null, qVar.f6484c.f71957f));
    }
}
