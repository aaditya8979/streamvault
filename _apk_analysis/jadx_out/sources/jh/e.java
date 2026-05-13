package jh;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f72438a;

    public e(r rVar) {
        this.f72438a = rVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        InterstitialAd interstitialAd = (InterstitialAd) ad2;
        g gVar = this.f72438a.f72462a;
        gVar.D = interstitialAd;
        interstitialAd.setAdInteractionListener(gVar.F);
        this.f72438a.f72462a.C.onAdLoaded();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f72438a.f72462a.v(adError.getCode() + ", " + adError.getMessage());
    }
}
