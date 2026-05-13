package c;

import bp.r0;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.RewardAdInteractionListener;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements RewardAdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f6468a;

    public h(p pVar) {
        this.f6468a = pVar;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f6468a.B.onAdClick();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        this.f6468a.B.onAdClose();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        this.f6468a.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        p pVar = this.f6468a;
        pVar.B.onAdShow(r0.b(null, pVar.f71957f));
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    @Override // sg.bigo.ads.api.RewardAdInteractionListener
    public final void onAdRewarded() {
        this.f6468a.B.onReward("");
    }
}
