package ct;

import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements AdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f59471a;

    public t(i0 i0Var) {
        this.f59471a = i0Var;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f59471a.F.onAdClick();
        i0 i0Var = this.f59471a;
        if (i0Var.D) {
            i0Var.C();
            this.f59471a.F.onAdClose();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        this.f59471a.F.onAdClose();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        this.f59471a.v(adError.getCode() + ", " + adError.getMessage());
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        i0 i0Var = this.f59471a;
        i0Var.F.onAdShow(bp.r0.b(null, i0Var.f71957f));
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }
}
