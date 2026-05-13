package x3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: compiled from: PangleInterstitialAd.java */
/* JADX INFO: loaded from: classes7.dex */
public class c implements MediationInterstitialAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f86746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f86747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.d f86748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w3.b f86749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationInterstitialAdCallback f86750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PAGInterstitialAd f86751g;

    /* JADX INFO: compiled from: PangleInterstitialAd.java */
    public class a implements a.InterfaceC0282a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f86752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialAdConfiguration f86753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f86754c;

        /* JADX INFO: renamed from: x3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleInterstitialAd.java */
        public class C1095a implements PAGInterstitialAdLoadListener {
            public C1095a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
                c cVar = c.this;
                cVar.f86750f = (MediationInterstitialAdCallback) cVar.f86746b.onSuccess(c.this);
                c.this.f86751g = pAGInterstitialAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = w3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                c.this.f86746b.onFailure(adErrorC);
            }
        }

        public a(String str, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, String str2) {
            this.f86752a = str;
            this.f86753b = mediationInterstitialAdConfiguration;
            this.f86754c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            c.this.f86746b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeSuccess() {
            PAGInterstitialRequest pAGInterstitialRequestD = c.this.f86749e.d();
            pAGInterstitialRequestD.setAdString(this.f86752a);
            w3.c.a(pAGInterstitialRequestD, this.f86752a, this.f86753b);
            c.this.f86748d.g(this.f86754c, pAGInterstitialRequestD, new C1095a());
        }
    }

    /* JADX INFO: compiled from: PangleInterstitialAd.java */
    public class b implements PAGInterstitialAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (c.this.f86750f != null) {
                c.this.f86750f.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (c.this.f86750f != null) {
                c.this.f86750f.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (c.this.f86750f != null) {
                c.this.f86750f.onAdOpened();
                c.this.f86750f.reportAdImpression();
            }
        }
    }

    public c(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, w3.d dVar, w3.b bVar) {
        this.f86746b = mediationAdLoadCallback;
        this.f86747c = aVar;
        this.f86748d = dVar;
        this.f86749e = bVar;
    }

    public void g(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = w3.a.a(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f86746b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
            this.f86747c.b(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationInterstitialAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.f86751g.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f86751g.show((Activity) context);
        } else {
            this.f86751g.show(null);
        }
    }
}
