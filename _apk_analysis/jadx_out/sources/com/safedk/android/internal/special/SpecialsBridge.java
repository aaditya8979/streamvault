package com.safedk.android.internal.special;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.ironsource.C3978d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.analytics.events.RedirectEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import com.safedk.android.utils.k;

/* JADX INFO: loaded from: classes.dex */
public class SpecialsBridge {
    public static void MBridgeVideoView_videoOperate(MBridgeVideoView mBridgeVideoView, int i10) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->MBridgeVideoView_videoOperate(Lcom/mbridge/msdk/video/module/MBridgeVideoView;I)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "MBridgeVideoView_videoOperate " + mBridgeVideoView + ", isOnUiThread = " + k.c());
                String strA = BrandSafetyUtils.a(mBridgeVideoView);
                if (i10 == 1) {
                    CampaignEx campaign = mBridgeVideoView.getCampaign();
                    Logger.d("SafeDK-Special", "MBridgeVideoView_videoOperate " + mBridgeVideoView + ", request id " + campaign.getImpressionURL());
                    CreativeInfoManager.a(g.f53141o, h.r(campaign.getImpressionURL()), BrandSafetyEvent.AdFormatType.INTER, mBridgeVideoView);
                    CreativeInfoManager.a(g.f53141o, strA, false);
                } else if (i10 == 3) {
                    CreativeInfoManager.a(g.f53141o, strA, true);
                }
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "MBridgeVideoView_videoOperate error " + th2.getMessage());
            }
        }
        mBridgeVideoView.videoOperate(i10);
    }

    public static void MintegralContainerView_showPlayableView(MBridgeContainerView mBridgeContainerView) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->MintegralContainerView_showPlayableView(Lcom/mbridge/msdk/video/module/MBridgeContainerView;)V");
        mBridgeContainerView.showPlayableView();
        if (SafeDK.aa()) {
            try {
                CampaignEx campaign = mBridgeContainerView.getCampaign();
                Logger.d("SafeDK-Special", "MBridgeContainerView_showPlayableView " + mBridgeContainerView + ", request id " + campaign.getImpressionURL());
                CreativeInfoManager.a(g.f53141o, h.r(campaign.getImpressionURL()), BrandSafetyEvent.AdFormatType.INTER, mBridgeContainerView);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "MBridgeContainerView_showPlayableView error " + th2.getMessage());
            }
        }
    }

    public static void appLovinAdViewEventListenerAdOpenedFullscreen(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewEventListenerAdOpenedFullscreen(Lcom/applovin/adview/AppLovinAdViewEventListener;Lcom/applovin/sdk/AppLovinAd;Lcom/applovin/adview/AppLovinAdView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "appLovinAdViewEventListenerAdOpenedFullscreen started, ad: " + appLovinAd + ", adView: " + appLovinAdView + ", isOnUiThread = " + k.c());
                BrandSafetyUtils.a(g.f53127a, (String) null, (String) null, RedirectEvent.f52816i);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "appLovinAdViewEventListenerAdOpenedFullscreen failed", th2);
            }
        }
        appLovinAdViewEventListener.adOpenedFullscreen(appLovinAd, appLovinAdView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void appLovinAdViewRenderAd(AppLovinAdView appLovinAdView, AppLovinAd appLovinAd) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinAdViewRenderAd(Lcom/applovin/adview/AppLovinAdView;Lcom/applovin/sdk/AppLovinAd;)V");
        if (SafeDK.aa()) {
            Logger.d("SafeDK-Special", "appLovinAdViewRenderAd started, ad: " + appLovinAd);
            try {
                if (AppLovinAdSize.INTERSTITIAL.equals(appLovinAd.getSize())) {
                    String clCode = ((AppLovinAdBase) appLovinAd).getClCode();
                    BrandSafetyEvent.AdFormatType adFormatType = BrandSafetyEvent.AdFormatType.INTER;
                    Logger.d("SafeDK-Special", "appLovinAdViewRenderAd clcode:" + clCode + " ad: " + appLovinAd + " formatType: " + adFormatType);
                    CreativeInfoManager.a(g.f53127a, "clcode=" + clCode + C3978d4.j.f31381c, adFormatType, appLovinAdView);
                }
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "appLovinAdViewRenderAd failed");
            }
        }
        appLovinAdView.renderAd(appLovinAd);
    }

    public static void appLovinMaxAdViewAdListenerOnAdExpanded(MaxAdViewAdListener maxAdViewAdListener, MaxAd maxAd) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->appLovinMaxAdViewAdListenerOnAdExpanded(Lcom/applovin/mediation/MaxAdViewAdListener;Lcom/applovin/mediation/MaxAd;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded started, ad: " + maxAd + ", isOnUiThread = " + k.c());
                BrandSafetyUtils.f();
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "appLovinMaxAdViewAdListenerOnAdExpanded failed", th2);
            }
        }
        maxAdViewAdListener.onAdExpanded(maxAd);
    }

    public static void fyberOnAdExpanded(InneractiveAdViewEventsListener inneractiveAdViewEventsListener, InneractiveAdSpot inneractiveAdSpot) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->fyberOnAdExpanded(Lcom/fyber/inneractive/sdk/external/InneractiveAdViewEventsListener;Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "fyberOnAdExpanded started, isOnUiThread = " + k.c());
                BrandSafetyUtils.a(g.f53142p, (String) null, (String) null, RedirectEvent.f52816i);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "Error in fyberOnAdExpanded", th2);
            }
        }
        inneractiveAdViewEventsListener.onAdExpanded(inneractiveAdSpot);
    }

    public static void fyberOnImpression(OnGlobalImpressionDataListener onGlobalImpressionDataListener, String str, String str2, ImpressionData impressionData) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->fyberOnImpression(Lcom/fyber/inneractive/sdk/external/OnGlobalImpressionDataListener;Ljava/lang/String;Ljava/lang/String;Lcom/fyber/inneractive/sdk/external/ImpressionData;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "fyberOnImpression started, spotId=" + str + ", creativeId=" + str2 + ", impressionData = " + impressionData.toString() + ", isOnUiThread=" + k.c());
                CreativeInfoManager.b(g.f53142p, impressionData, (Object) null);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "Error in fyberOnImpression", th2);
            }
        }
        onGlobalImpressionDataListener.onImpression(str, str2, impressionData);
    }

    public static void inmobiOnInterstitialAdDisplayed(InterstitialAdEventListener interstitialAdEventListener, InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->inmobiOnInterstitialAdDisplayed(Lcom/inmobi/ads/listeners/InterstitialAdEventListener;Lcom/inmobi/ads/InMobiInterstitial;Lcom/inmobi/ads/AdMetaInfo;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "inmobiOnInterstitialAdDisplayed triggered , isOnUiThread = " + k.c());
                CreativeInfoManager.b(g.f53135i, adMetaInfo.getCreativeID(), (Object) null);
            } catch (Throwable th2) {
                Logger.e("SafeDK-Special", "Exception in inmobiOnInterstitialAdDisplayed", th2);
            }
        }
        interstitialAdEventListener.onAdDisplayed(inMobiInterstitial, adMetaInfo);
    }

    public static void maxAdViewDestroy(MaxAdView maxAdView) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxAdViewDestroy(Lcom/applovin/mediation/ads/MaxAdView;)V");
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "maxAdViewDestroy started , isOnUiThread = " + k.c());
                CreativeInfoManager.a(maxAdView);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "maxAdViewDestroy failed");
            }
        }
        maxAdView.destroy();
    }

    public static void maxNativeAdListenerOnNativeAdLoaded(MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        Logger.d("SafeDK-Special|SafeDK: Special-Specials> Lcom/safedk/android/internal/special/SpecialsBridge;->maxNativeAdListenerOnNativeAdLoaded(Lcom/applovin/mediation/nativeAds/MaxNativeAdListener;Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)V");
        maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
        if (SafeDK.aa()) {
            try {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded Impl started, nativeAdView: " + maxNativeAdView + ", ad: " + maxAd + ", isOnUiThread = " + k.c());
                CreativeInfoManager.onMaxNativeAdLoaded(maxNativeAdView, maxAd);
            } catch (Throwable th2) {
                Logger.d("SafeDK-Special", "maxNativeAdListenerOnNativeAdLoaded failed", th2);
            }
        }
    }
}
