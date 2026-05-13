package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.google.ads.mediation.applovin.d;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AppLovinWaterfallAppOpenAd.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements MediationAppOpenAd, MaxAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f19786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f19787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f19788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MaxAppOpenAd f19789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public MediationAppOpenAdCallback f19790f;

    public j(@NotNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, @NotNull d dVar, @NotNull a aVar) {
        p.k(mediationAdLoadCallback, "loadCallback");
        p.k(dVar, "appLovinInitializer");
        p.k(aVar, "appLovinAdFactory");
        this.f19786b = mediationAdLoadCallback;
        this.f19787c = dVar;
        this.f19788d = aVar;
    }

    public static final void c(j jVar, String str) {
        MaxAppOpenAd maxAppOpenAdE = jVar.f19788d.e(str);
        jVar.f19789e = maxAppOpenAdE;
        if (maxAppOpenAdE != null) {
            maxAppOpenAdE.setListener(jVar);
        }
        MaxAppOpenAd maxAppOpenAd = jVar.f19789e;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.loadAd();
        }
    }

    public final void b(@NotNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.k(mediationAppOpenAdConfiguration, "appOpenAdConfiguration");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        p.j(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (string == null || string.length() == 0) {
            this.f19786b.onFailure(new AdError(110, AppLovinMediationAdapter.ERROR_MSG_MISSING_SDK, AppLovinMediationAdapter.ERROR_DOMAIN));
            return;
        }
        final String string2 = serverParameters.getString("ad_unit_id");
        if (string2 == null || string2.length() == 0) {
            this.f19786b.onFailure(new AdError(113, "Ad Unit ID is missing.", AppLovinMediationAdapter.ERROR_DOMAIN));
        } else {
            this.f19787c.b(mediationAppOpenAdConfiguration.getContext(), string, new d.b() { // from class: com.google.ads.mediation.applovin.i
                @Override // com.google.ads.mediation.applovin.d.b
                public final void onInitializeSuccess() {
                    j.c(this.f19784a, string2);
                }
            });
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NotNull MaxAd maxAd) {
        p.k(maxAd, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19790f;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NotNull MaxAd maxAd, @NotNull MaxError maxError) {
        p.k(maxAd, "ad");
        p.k(maxError, "appLovinError");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19790f;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(new AdError(maxError.getCode(), maxError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NotNull MaxAd maxAd) {
        p.k(maxAd, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19790f;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback2 = this.f19790f;
        if (mediationAppOpenAdCallback2 != null) {
            mediationAppOpenAdCallback2.reportAdImpression();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NotNull MaxAd maxAd) {
        p.k(maxAd, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19790f;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NotNull String str, @NotNull MaxError maxError) {
        p.k(str, "p0");
        p.k(maxError, "appLovinError");
        this.f19786b.onFailure(new AdError(maxError.getCode(), maxError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NotNull MaxAd maxAd) {
        p.k(maxAd, "ad");
        this.f19790f = this.f19786b.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        MaxAppOpenAd maxAppOpenAd = this.f19789e;
        if (maxAppOpenAd != null) {
            if (maxAppOpenAd != null && maxAppOpenAd.isReady()) {
                MaxAppOpenAd maxAppOpenAd2 = this.f19789e;
                if (maxAppOpenAd2 != null) {
                    maxAppOpenAd2.showAd();
                    return;
                }
                return;
            }
            MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f19790f;
            if (mediationAppOpenAdCallback != null) {
                mediationAppOpenAdCallback.onAdFailedToShow(new AdError(106, "Ad is not ready to be displayed", AppLovinMediationAdapter.ERROR_DOMAIN));
            }
        }
    }
}
