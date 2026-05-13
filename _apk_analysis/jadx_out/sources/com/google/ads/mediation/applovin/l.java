package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinAd;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: AppLovinWaterfallRewardedRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public class l extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    public static final HashMap<String, WeakReference<l>> f19797d = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19799c;

    /* JADX INFO: compiled from: AppLovinWaterfallRewardedRenderer.java */
    public class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f19800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f19801b;

        public a(Bundle bundle, Context context) {
            this.f19800a = bundle;
            this.f19801b = context;
        }

        @Override // com.google.ads.mediation.applovin.d.b
        public void onInitializeSuccess() {
            l.this.f19798b = AppLovinUtils.retrieveZoneId(this.f19800a);
            l lVar = l.this;
            lVar.appLovinSdk = lVar.appLovinInitializer.c(this.f19801b);
            boolean z10 = true;
            String str = String.format("Requesting rewarded video for zone '%s'", l.this.f19798b);
            String str2 = f.TAG;
            Log.d(str2, str);
            HashMap<String, WeakReference<l>> map = l.f19797d;
            if (!map.containsKey(l.this.f19798b)) {
                map.put(l.this.f19798b, new WeakReference<>(l.this));
                z10 = false;
            }
            if (z10) {
                AdError adError = new AdError(105, f.ERROR_MSG_MULTIPLE_REWARDED_AD, AppLovinMediationAdapter.ERROR_DOMAIN);
                Log.e(str2, adError.toString());
                l.this.adLoadCallback.onFailure(adError);
                return;
            }
            if (Objects.equals(l.this.f19798b, "")) {
                l lVar2 = l.this;
                lVar2.incentivizedInterstitial = lVar2.appLovinAdFactory.b(lVar2.appLovinSdk);
            } else {
                l lVar3 = l.this;
                lVar3.incentivizedInterstitial = lVar3.appLovinAdFactory.c(lVar3.f19798b, l.this.appLovinSdk);
            }
            l lVar4 = l.this;
            lVar4.incentivizedInterstitial.preload(lVar4);
        }
    }

    public l(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull d dVar, @NonNull com.google.ads.mediation.applovin.a aVar, @NonNull g gVar) {
        super(mediationAdLoadCallback, dVar, aVar, gVar);
        this.f19799c = false;
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(@NonNull AppLovinAd appLovinAd) {
        f19797d.remove(this.f19798b);
        super.adHidden(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(@NonNull AppLovinAd appLovinAd) {
        if (this.f19799c) {
            f19797d.remove(this.f19798b);
        }
        super.adReceived(appLovinAd);
    }

    @Override // com.google.ads.mediation.applovin.f, com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i10) {
        f19797d.remove(this.f19798b);
        super.failedToReceiveAd(i10);
    }

    @Override // com.google.ads.mediation.applovin.f
    public void loadAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(110, AppLovinMediationAdapter.ERROR_MSG_MISSING_SDK, AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN);
            Log.e(f.TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
        } else {
            if (AppLovinUtils.isMultiAdsEnabled()) {
                this.f19799c = true;
            }
            this.networkExtras = mediationRewardedAdConfiguration.getMediationExtras();
            this.appLovinInitializer.b(context, string, new a(serverParameters, context));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.appLovinSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.networkExtras));
        String str = this.f19798b;
        if (str != null) {
            Log.d(f.TAG, String.format("Showing rewarded video for zone '%s'", str));
        }
        if (this.incentivizedInterstitial.isAdReadyToDisplay()) {
            this.incentivizedInterstitial.show(context, this, this, this, this);
            return;
        }
        AdError adError = new AdError(106, f.ERROR_MSG_AD_NOT_READY, AppLovinMediationAdapter.ERROR_DOMAIN);
        Log.e(f.TAG, adError.toString());
        this.rewardedAdCallback.onAdFailedToShow(adError);
    }
}
