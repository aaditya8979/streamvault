package qh;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMBannerAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: InternalGAMBannerAdListener.java */
/* JADX INFO: loaded from: classes7.dex */
public interface y extends x<InternalGAMBannerAd>, InternalGAMAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // qh.x
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    @Override // 
    /* synthetic */ void onAdLoaded(@NonNull InternalGAMAd internalGAMAd);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShown();
}
