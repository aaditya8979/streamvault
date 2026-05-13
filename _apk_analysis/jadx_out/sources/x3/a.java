package x3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;

/* JADX INFO: compiled from: PangleAppOpenAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements MediationAppOpenAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f86722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f86723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.d f86724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w3.b f86725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationAppOpenAdCallback f86726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PAGAppOpenAd f86727g;

    /* JADX INFO: renamed from: x3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PangleAppOpenAd.java */
    public class C1092a implements a.InterfaceC0282a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f86728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationAppOpenAdConfiguration f86729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f86730c;

        /* JADX INFO: renamed from: x3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleAppOpenAd.java */
        public class C1093a implements PAGAppOpenAdLoadListener {
            public C1093a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
                a aVar = a.this;
                aVar.f86726f = (MediationAppOpenAdCallback) aVar.f86722b.onSuccess(a.this);
                a.this.f86727g = pAGAppOpenAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = w3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                a.this.f86722b.onFailure(adErrorC);
            }
        }

        public C1092a(String str, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, String str2) {
            this.f86728a = str;
            this.f86729b = mediationAppOpenAdConfiguration;
            this.f86730c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            a.this.f86722b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeSuccess() {
            PAGAppOpenRequest pAGAppOpenRequestB = a.this.f86725e.b();
            pAGAppOpenRequestB.setAdString(this.f86728a);
            w3.c.a(pAGAppOpenRequestB, this.f86728a, this.f86729b);
            a.this.f86724d.e(this.f86730c, pAGAppOpenRequestB, new C1093a());
        }
    }

    /* JADX INFO: compiled from: PangleAppOpenAd.java */
    public class b implements PAGAppOpenAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (a.this.f86726f != null) {
                a.this.f86726f.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (a.this.f86726f != null) {
                a.this.f86726f.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (a.this.f86726f != null) {
                a.this.f86726f.onAdOpened();
                a.this.f86726f.reportAdImpression();
            }
        }
    }

    public a(@NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, @NonNull w3.d dVar, @NonNull w3.b bVar) {
        this.f86722b = mediationAdLoadCallback;
        this.f86723c = aVar;
        this.f86724d = dVar;
        this.f86725e = bVar;
    }

    public void g(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = w3.a.a(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f86722b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
            this.f86723c.b(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new C1092a(bidResponse, mediationAppOpenAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NonNull Context context) {
        this.f86727g.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f86727g.show((Activity) context);
        } else {
            this.f86727g.show(null);
        }
    }
}
