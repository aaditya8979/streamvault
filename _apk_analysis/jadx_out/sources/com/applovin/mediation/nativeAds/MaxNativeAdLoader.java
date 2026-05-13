package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.sdk.k;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MaxNativeAdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f11158a;

    public MaxNativeAdLoader(String str) {
        this(str, k.o());
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        com.applovin.impl.mediation.ads.a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f11158a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f11158a.logApiCall("a()");
        this.f11158a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f11158a.logApiCall("b()");
        this.f11158a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f11158a.logApiCall("destroy()");
        this.f11158a.destroy();
    }

    public void destroy(MaxAd maxAd) {
        this.f11158a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f11158a.destroy(maxAd);
    }

    public String getAdUnitId() {
        return this.f11158a.getAdUnitId();
    }

    public String getPlacement() {
        this.f11158a.logApiCall("getPlacement()");
        return this.f11158a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f11158a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f11158a.loadAd(maxNativeAdView);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdLoader;->render(Lcom/applovin/mediation/nativeAds/MaxNativeAdView;Lcom/applovin/mediation/MaxAd;)Z");
        CreativeInfoManager.onMaxNativeAdLoaded(maxNativeAdView, maxAd);
        return safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(maxNativeAdView, maxAd);
    }

    public boolean safedk_MaxNativeAdLoader_render_15e187b196d84406225bb047dba3a142(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f11158a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f11158a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f11158a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f11158a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f11158a.logApiCall("setCustomData(value=" + str + ")");
        this.f11158a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f11158a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f11158a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f11158a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f11158a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f11158a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f11158a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f11158a.logApiCall("setPlacement(placement=" + str + ")");
        this.f11158a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f11158a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f11158a.setRevenueListener(maxAdRevenueListener);
    }
}
