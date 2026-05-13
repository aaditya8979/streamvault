package x3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: compiled from: PangleBannerAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class b implements MediationBannerAd, PAGBannerAdInteractionListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f86734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f86735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.d f86736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w3.b f86737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationBannerAdCallback f86738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    public FrameLayout f86739g;

    /* JADX INFO: compiled from: PangleBannerAd.java */
    public class a implements a.InterfaceC0282a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f86740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f86741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f86742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f86743d;

        /* JADX INFO: renamed from: x3.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleBannerAd.java */
        public class C1094a implements PAGBannerAdLoadListener {
            public C1094a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                pAGBannerAd.setAdInteractionListener(b.this);
                b.this.f86739g.addView(pAGBannerAd.getBannerView());
                b bVar = b.this;
                bVar.f86738f = (MediationBannerAdCallback) bVar.f86734b.onSuccess(b.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = w3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                b.this.f86734b.onFailure(adErrorC);
            }
        }

        public a(MediationBannerAdConfiguration mediationBannerAdConfiguration, Context context, String str, String str2) {
            this.f86740a = mediationBannerAdConfiguration;
            this.f86741b = context;
            this.f86742c = str;
            this.f86743d = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            b.this.f86734b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeSuccess() {
            PAGBannerSize pAGBannerSizeE = b.e(this.f86741b, this.f86740a.getAdSize());
            if (pAGBannerSizeE == null) {
                AdError adErrorA = w3.a.a(102, "Failed to request banner ad from Pangle. Invalid banner size.");
                Log.w(PangleMediationAdapter.TAG, adErrorA.toString());
                b.this.f86734b.onFailure(adErrorA);
            } else {
                b.this.f86739g = new FrameLayout(this.f86741b);
                PAGBannerRequest pAGBannerRequestC = b.this.f86737e.c(pAGBannerSizeE);
                pAGBannerRequestC.setAdString(this.f86742c);
                w3.c.a(pAGBannerRequestC, this.f86742c, this.f86740a);
                b.this.f86736d.f(this.f86743d, pAGBannerRequestC, new C1094a());
            }
        }
    }

    public b(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, @NonNull w3.d dVar, @NonNull w3.b bVar) {
        this.f86734b = mediationAdLoadCallback;
        this.f86735c = aVar;
        this.f86736d = dVar;
        this.f86737e = bVar;
    }

    public static PAGBannerSize e(Context context, AdSize adSize) {
        if (adSize == null) {
            return null;
        }
        int width = adSize.getWidth();
        PAGBannerSize pAGBannerSize = PAGBannerSize.BANNER_W_320_H_50;
        if (width == pAGBannerSize.getWidth() && adSize.getHeight() == pAGBannerSize.getHeight()) {
            return pAGBannerSize;
        }
        int width2 = adSize.getWidth();
        PAGBannerSize pAGBannerSize2 = PAGBannerSize.BANNER_W_300_H_250;
        if (width2 == pAGBannerSize2.getWidth() && adSize.getHeight() == pAGBannerSize2.getHeight()) {
            return pAGBannerSize2;
        }
        int width3 = adSize.getWidth();
        PAGBannerSize pAGBannerSize3 = PAGBannerSize.BANNER_W_728_H_90;
        if (width3 == pAGBannerSize3.getWidth() && adSize.getHeight() == pAGBannerSize3.getHeight()) {
            return pAGBannerSize3;
        }
        PAGBannerSize currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adSize.getWidth());
        return (adSize.getWidth() == currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() && adSize.getHeight() == currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) ? currentOrientationAnchoredAdaptiveBannerAdSize : PAGBannerSize.getInlineAdaptiveBannerAdSize(adSize.getWidth(), adSize.getHeight());
    }

    public void f(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = w3.a.a(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f86734b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            Context context = mediationBannerAdConfiguration.getContext();
            this.f86735c.b(context, serverParameters.getString("appid"), new a(mediationBannerAdConfiguration, context, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f86739g;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f86738f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f86738f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }
}
