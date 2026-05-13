package uh;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;

/* JADX INFO: compiled from: GAMFullscreenAdListener.java */
/* JADX INFO: loaded from: classes3.dex */
public class m<InternalAdType extends InternalFullscreenAd> extends i<InternalAdType, UnifiedFullscreenAdCallback> implements InternalFullscreenAdPresentListener {

    @NonNull
    private final l gamFullscreenAd;

    public m(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull l lVar) {
        super(unifiedFullscreenAdCallback);
        this.gamFullscreenAd = lVar;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    public void onAdClosed() {
        getCallback().onAdClosed();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    public void onAdComplete() {
        getCallback().onAdFinished();
    }

    @Override // uh.i, uh.c0
    public void onAdLoaded(@NonNull InternalAdType internaladtype) {
        this.gamFullscreenAd.internalFullscreenAd = internaladtype;
        getCallback().onAdLoaded();
    }
}
