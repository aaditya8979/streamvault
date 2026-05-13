package k;

import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAdInteractionListener;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements SplashAdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f72650a;

    public j0(k kVar) {
        this.f72650a = kVar;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f72650a.D.onAdClick();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        this.f72650a.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public final void onAdFinished() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        k kVar = this.f72650a;
        kVar.D.onAdShow(bp.r0.b(null, kVar.f71957f));
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public final void onAdSkipped() {
        this.f72650a.D.onAdClose();
    }
}
