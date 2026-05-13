package qh;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMInterstitialAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: InternalGAMInterstitialAdListener.java */
/* JADX INFO: loaded from: classes4.dex */
public interface a0 extends x<InternalGAMInterstitialAd>, InternalGAMFullscreenAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    /* synthetic */ void onAdClosed();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    /* synthetic */ void onAdComplete();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // qh.x
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    @Override // qh.x, qh.y
    /* synthetic */ void onAdLoaded(@NonNull InternalGAMAd internalGAMAd);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShown();
}
