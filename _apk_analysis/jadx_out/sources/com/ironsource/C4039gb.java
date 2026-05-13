package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4039gb {

    /* JADX INFO: renamed from: com.ironsource.gb$a */
    public static final class a implements InterfaceC3985db {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LevelPlayInterstitialAdListener f31813a;

        public a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
            this.f31813a = levelPlayInterstitialAdListener;
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdClicked(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClicked() adInfo: " + levelPlayAdInfo);
            this.f31813a.onAdClicked(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdClosed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdClosed() adInfo: " + levelPlayAdInfo);
            this.f31813a.onAdClosed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdDisplayFailed(@NotNull LevelPlayAdError levelPlayAdError, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdError, "error");
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayFailed() adInfo: " + levelPlayAdInfo + " error: " + levelPlayAdError);
            this.f31813a.onAdDisplayFailed(levelPlayAdError, levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdDisplayed() adInfo: " + levelPlayAdInfo);
            this.f31813a.onAdDisplayed(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdInfoChanged() adInfo: " + levelPlayAdInfo);
            this.f31813a.onAdInfoChanged(levelPlayAdInfo);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
            tn.p.k(levelPlayAdError, "error");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() error: " + levelPlayAdError);
            this.f31813a.onAdLoadFailed(levelPlayAdError);
        }

        @Override // com.ironsource.InterfaceC3985db
        public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
            tn.p.k(levelPlayAdInfo, "adInfo");
            IronLog.CALLBACK.info("LevelPlayInterstitialAdListener.onAdLoaded() adInfo: " + levelPlayAdInfo);
            this.f31813a.onAdLoaded(levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3985db b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener) {
        return new a(levelPlayInterstitialAdListener);
    }
}
