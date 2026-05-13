package x3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.a;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: compiled from: PangleRewardedAd.java */
/* JADX INFO: loaded from: classes11.dex */
public class f implements MediationRewardedAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f86775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f86776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w3.d f86777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w3.b f86778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationRewardedAdCallback f86779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PAGRewardedAd f86780g;

    /* JADX INFO: compiled from: PangleRewardedAd.java */
    public class a implements a.InterfaceC0282a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f86781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationRewardedAdConfiguration f86782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f86783c;

        /* JADX INFO: renamed from: x3.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleRewardedAd.java */
        public class C1098a implements PAGRewardedAdLoadListener {
            public C1098a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
                f fVar = f.this;
                fVar.f86779f = (MediationRewardedAdCallback) fVar.f86775b.onSuccess(f.this);
                f.this.f86780g = pAGRewardedAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = w3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                f.this.f86775b.onFailure(adErrorC);
            }
        }

        public a(String str, MediationRewardedAdConfiguration mediationRewardedAdConfiguration, String str2) {
            this.f86781a = str;
            this.f86782b = mediationRewardedAdConfiguration;
            this.f86783c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            f.this.f86775b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0282a
        public void onInitializeSuccess() {
            PAGRewardedRequest pAGRewardedRequestF = f.this.f86778e.f();
            pAGRewardedRequestF.setAdString(this.f86781a);
            w3.c.a(pAGRewardedRequestF, this.f86781a, this.f86782b);
            f.this.f86777d.i(this.f86783c, pAGRewardedRequestF, new C1098a());
        }
    }

    /* JADX INFO: compiled from: PangleRewardedAd.java */
    public class b implements PAGRewardedAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (f.this.f86779f != null) {
                f.this.f86779f.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (f.this.f86779f != null) {
                f.this.f86779f.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (f.this.f86779f != null) {
                f.this.f86779f.onAdOpened();
                f.this.f86779f.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
            if (f.this.f86779f != null) {
                f.this.f86779f.onUserEarnedReward();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
        public void onUserEarnedRewardFail(int i10, String str) {
            Log.d(PangleMediationAdapter.TAG, w3.a.c(i10, String.format("Failed to reward user: %s", str)).toString());
        }
    }

    public f(@NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, w3.d dVar, w3.b bVar) {
        this.f86775b = mediationAdLoadCallback;
        this.f86776c = aVar;
        this.f86777d = dVar;
        this.f86778e = bVar;
    }

    public void g(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = w3.a.a(101, "Failed to load rewarded ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f86775b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
            this.f86776c.b(mediationRewardedAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationRewardedAdConfiguration, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.f86780g.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f86780g.show((Activity) context);
        } else {
            this.f86780g.show(null);
        }
    }
}
