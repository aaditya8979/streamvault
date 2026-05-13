package c;

import bp.r0;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 implements RewardedVideoAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6461b;

    public d0(w wVar) {
        this.f6461b = wVar;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f6461b.B.onAdClick();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f6461b.B.onAdVideoCache();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        this.f6461b.v(adError.getErrorCode() + ",  " + adError.getErrorMessage());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
        w wVar = this.f6461b;
        wVar.B.onAdShow(r0.b(ad2, wVar.f71957f));
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.f6461b.B.onAdClose();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.f6461b.B.onReward("");
        this.f6461b.B.onAdVideoComplete();
    }
}
