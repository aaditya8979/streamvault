package uh;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalRewardedAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;

/* JADX INFO: compiled from: GAMRewardedAd.java */
/* JADX INFO: loaded from: classes11.dex */
public class t extends l {

    @Nullable
    @VisibleForTesting
    public g0 listener;

    /* JADX INFO: compiled from: GAMRewardedAd.java */
    @VisibleForTesting
    public static final class a extends m<InternalRewardedAd> implements g0 {
        public a(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull l lVar) {
            super(unifiedFullscreenAdCallback, lVar);
        }
    }

    public t(@NonNull o oVar) {
        super(oVar);
    }

    @Override // uh.l
    @Nullable
    public InternalFullscreenAdPresentListener getPresentListener() {
        return this.listener;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        a aVar = new a(unifiedFullscreenAdCallback, this);
        this.listener = aVar;
        this.gamNetwork.loadRewarded(networkAdUnit, aVar);
    }

    @Override // uh.l, io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        super.onDestroy();
    }
}
