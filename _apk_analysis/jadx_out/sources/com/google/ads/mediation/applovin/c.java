package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: compiled from: AppLovinBannerAd.java */
/* JADX INFO: loaded from: classes3.dex */
public class c implements MediationBannerAd, AppLovinAdLoadListener, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f19764i = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f19765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppLovinSdk f19766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f19768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.ads.mediation.applovin.a f19769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f19770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediationBannerAdCallback f19771h;

    /* JADX INFO: compiled from: AppLovinBannerAd.java */
    public class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f19772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f19773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AppLovinAdSize f19774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AdSize f19775d;

        public a(Context context, Bundle bundle, AppLovinAdSize appLovinAdSize, AdSize adSize) {
            this.f19772a = context;
            this.f19773b = bundle;
            this.f19774c = appLovinAdSize;
            this.f19775d = adSize;
        }

        @Override // com.google.ads.mediation.applovin.d.b
        public void onInitializeSuccess() {
            c cVar = c.this;
            cVar.f19766c = cVar.f19768e.c(this.f19772a);
            c.this.f19767d = AppLovinUtils.retrieveZoneId(this.f19773b);
            Log.d(c.f19764i, "Requesting banner of size " + this.f19774c + " for zone: " + c.this.f19767d);
            c cVar2 = c.this;
            cVar2.f19765b = cVar2.f19769f.a(c.this.f19766c, this.f19774c, this.f19775d, this.f19772a);
            c.this.f19765b.e(c.this);
            c.this.f19765b.d(c.this);
            c.this.f19765b.f(c.this);
            if (TextUtils.isEmpty(c.this.f19767d)) {
                c.this.f19766c.getAdService().loadNextAd(this.f19774c, c.this);
            } else {
                c.this.f19766c.getAdService().loadNextAdForZoneId(c.this.f19767d, c.this);
            }
        }
    }

    public c(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull d dVar, @NonNull com.google.ads.mediation.applovin.a aVar) {
        this.f19770g = mediationAdLoadCallback;
        this.f19768e = dVar;
        this.f19769f = aVar;
    }

    public static c k(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull d dVar, @NonNull com.google.ads.mediation.applovin.a aVar) {
        return new c(mediationAdLoadCallback, dVar, aVar);
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        Log.d(f19764i, "Banner clicked.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f19771h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f19764i, "Banner closed fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f19771h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        Log.d(f19764i, "Banner displayed.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f19771h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        Log.w(f19764i, "Banner failed to display: " + appLovinAdViewDisplayErrorCode);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        Log.d(f19764i, "Banner dismissed.");
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f19764i, "Banner left application.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f19771h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.applovin.adview.AppLovinAdViewEventListener
    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        Log.d(f19764i, "Banner opened fullscreen.");
        MediationBannerAdCallback mediationBannerAdCallback = this.f19771h;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        Log.d(f19764i, "Banner did load ad for zone: " + this.f19767d);
        this.f19765b.c(appLovinAd);
        this.f19771h = this.f19770g.onSuccess(this);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        AdError adError = AppLovinUtils.getAdError(i10);
        Log.w(f19764i, "Failed to load banner ad with error: " + i10);
        this.f19770g.onFailure(adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f19765b.a();
    }

    public void j(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, AppLovinMediationAdapter.ERROR_MSG_MISSING_SDK, AppLovinMediationAdapter.ERROR_DOMAIN);
            Log.e(f19764i, adError.getMessage());
            this.f19770g.onFailure(adError);
            return;
        }
        AppLovinAdSize appLovinAdSizeAppLovinAdSizeFromAdMobAdSize = AppLovinUtils.appLovinAdSizeFromAdMobAdSize(context, adSize);
        if (appLovinAdSizeAppLovinAdSizeFromAdMobAdSize != null) {
            this.f19768e.b(context, string, new a(context, serverParameters, appLovinAdSizeAppLovinAdSizeFromAdMobAdSize, adSize));
            return;
        }
        AdError adError2 = new AdError(101, AppLovinMediationAdapter.ERROR_MSG_BANNER_SIZE_MISMATCH, AppLovinMediationAdapter.ERROR_DOMAIN);
        Log.e(f19764i, adError2.getMessage());
        this.f19770g.onFailure(adError2);
    }
}
