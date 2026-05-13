package com.moloco.sdk.publisher;

import android.content.Context;
import android.widget.FrameLayout;
import bn.r;
import com.mbridge.msdk.MBridgeConstans;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import sn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class MolocoSamplesKt {
    private static final void MolocoCreateBanner(final FrameLayout frameLayout) {
        Moloco.createBanner$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new p() { // from class: com.moloco.sdk.publisher.k
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return MolocoSamplesKt.MolocoCreateBanner$lambda$2(frameLayout, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MolocoCreateBanner$lambda$2(FrameLayout frameLayout, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            frameLayout.addView(banner);
            banner.destroy();
            frameLayout.removeView(banner);
        }
        return r.f5635a;
    }

    private static final void MolocoCreateBannerTablet(final FrameLayout frameLayout) {
        Moloco.createBannerTablet$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new p() { // from class: com.moloco.sdk.publisher.j
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return MolocoSamplesKt.MolocoCreateBannerTablet$lambda$3(frameLayout, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MolocoCreateBannerTablet$lambda$3(FrameLayout frameLayout, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            frameLayout.addView(banner);
            banner.destroy();
            frameLayout.removeView(banner);
        }
        return r.f5635a;
    }

    private static final void MolocoCreateInterstitialAd() {
        Moloco.createInterstitial$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new p() { // from class: com.moloco.sdk.publisher.g
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return MolocoSamplesKt.MolocoCreateInterstitialAd$lambda$6((InterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MolocoCreateInterstitialAd$lambda$6(InterstitialAd interstitialAd, MolocoAdError.AdCreateError adCreateError) {
        if (interstitialAd != null) {
            interstitialAd.load("bid_response", null);
            interstitialAd.show(null);
            interstitialAd.destroy();
        }
        return r.f5635a;
    }

    private static final void MolocoCreateMREC(final FrameLayout frameLayout) {
        Moloco.createMREC$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new p() { // from class: com.moloco.sdk.publisher.h
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return MolocoSamplesKt.MolocoCreateMREC$lambda$4(frameLayout, (Banner) obj, (MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MolocoCreateMREC$lambda$4(FrameLayout frameLayout, Banner banner, MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            frameLayout.addView(banner);
            banner.destroy();
            frameLayout.removeView(banner);
        }
        return r.f5635a;
    }

    private static final void MolocoCreateNativeAd(String str) {
        Moloco.createNativeAd$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new p() { // from class: com.moloco.sdk.publisher.l
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return MolocoSamplesKt.MolocoCreateNativeAd$lambda$5((NativeAd) obj, (MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MolocoCreateNativeAd$lambda$5(NativeAd nativeAd, MolocoAdError.AdCreateError adCreateError) {
        if (nativeAd != null) {
            nativeAd.load("bid_response", null);
        }
        return r.f5635a;
    }

    private static final void MolocoCreateRewardedInterstitialAd() {
        Moloco.createRewardedInterstitial$default(new MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new p() { // from class: com.moloco.sdk.publisher.m
            @Override // sn.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo2invoke(Object obj, Object obj2) {
                return MolocoSamplesKt.MolocoCreateRewardedInterstitialAd$lambda$7((RewardedInterstitialAd) obj, (MolocoAdError.AdCreateError) obj2);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MolocoCreateRewardedInterstitialAd$lambda$7(RewardedInterstitialAd rewardedInterstitialAd, MolocoAdError.AdCreateError adCreateError) {
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.load("bid_response", null);
            rewardedInterstitialAd.show(null);
            rewardedInterstitialAd.destroy();
        }
        return r.f5635a;
    }

    private static final void MolocoInitializeSample(final Context context) {
        Moloco.initialize(new MolocoInitParams(context, "YOUR_APP_KEY", new MediationInfo("<YourMediationName>")), new MolocoInitializationListener() { // from class: com.moloco.sdk.publisher.i
            @Override // com.moloco.sdk.publisher.MolocoInitializationListener
            public final void onMolocoInitializationStatus(MolocoInitStatus molocoInitStatus) {
                MolocoSamplesKt.MolocoInitializeSample$lambda$1(context, molocoInitStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MolocoInitializeSample$lambda$1(Context context, MolocoInitStatus molocoInitStatus) {
        tn.p.k(molocoInitStatus, "molocoInitStatus");
        if (molocoInitStatus.getInitialization() == Initialization.SUCCESS) {
            Moloco.getBidToken(new MediationInfo("MY_MEDIATION"), context, new MolocoBidTokenListener() { // from class: com.moloco.sdk.publisher.n
                @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
                public final void onBidTokenResult(String str, MolocoAdError.ErrorType errorType) {
                    tn.p.k(str, "bidToken");
                }
            });
        } else {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, MBridgeConstans.DYNAMIC_VIEW_WX_APP, molocoInitStatus.getDescription(), null, false, 12, null);
        }
    }

    private static final void MolocoIsInitializedSample() {
        Moloco.isInitialized();
    }
}
