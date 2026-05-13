package y3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import com.google.ads.mediation.unity.UnityMediationBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: compiled from: UnityRewardedAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class i implements MediationRewardedAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f87235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f87236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y3.a f87237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MediationRewardedAdCallback f87238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f87239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f87240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f87241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @VisibleForTesting
    public final IUnityAdsLoadListener f87242i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @VisibleForTesting
    public final IUnityAdsShowListener f87243j = new b();

    /* JADX INFO: compiled from: UnityRewardedAd.java */
    public class a implements IUnityAdsLoadListener {
        public a() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", str));
            i.this.f87239f = str;
            i iVar = i.this;
            iVar.f87238e = (MediationRewardedAdCallback) iVar.f87235b.onSuccess(i.this);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            i.this.f87239f = str;
            AdError adErrorD = UnityAdsAdapterUtils.d(unityAdsLoadError, str2);
            Log.w(UnityMediationAdapter.TAG, adErrorD.toString());
            i.this.f87235b.onFailure(adErrorD);
        }
    }

    /* JADX INFO: compiled from: UnityRewardedAd.java */
    public class b implements IUnityAdsShowListener {
        public b() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            if (i.this.f87238e != null) {
                i.this.f87238e.reportAdClicked();
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            if (i.this.f87238e == null) {
                return;
            }
            if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                i.this.f87238e.onVideoComplete();
                i.this.f87238e.onUserEarnedReward();
            }
            i.this.f87238e.onAdClosed();
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            if (i.this.f87238e != null) {
                i.this.f87238e.onAdFailedToShow(UnityAdsAdapterUtils.e(unityAdsShowError, str2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            if (i.this.f87238e == null) {
                return;
            }
            i.this.f87238e.onAdOpened();
            i.this.f87238e.reportAdImpression();
            i.this.f87238e.onVideoStart();
        }
    }

    /* JADX INFO: compiled from: UnityRewardedAd.java */
    public class c implements IUnityAdsInitializationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f87246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f87248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f87249d;

        public c(Context context, String str, String str2, @Nullable String str3) {
            this.f87246a = context;
            this.f87247b = str;
            this.f87248c = str2;
            this.f87249d = str3;
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationComplete() throws JSONException {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", this.f87247b, this.f87248c));
            UnityAdsAdapterUtils.l(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment(), this.f87246a);
            i.this.f87240g = UUID.randomUUID().toString();
            UnityAdsLoadOptions unityAdsLoadOptionsA = i.this.f87237d.a(i.this.f87240g);
            String str = this.f87249d;
            if (str != null) {
                unityAdsLoadOptionsA.setAdMarkup(str);
            }
            i.this.f87237d.c(this.f87248c, unityAdsLoadOptionsA, i.this.f87242i);
        }

        @Override // com.unity3d.ads.IUnityAdsInitializationListener
        public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
            AdError adErrorC = UnityAdsAdapterUtils.c(unityAdsInitializationError, String.format(UnityMediationBannerAd.ERROR_MSG_INITIALIZATION_FAILED_FOR_GAME_ID, this.f87247b, str));
            Log.w(UnityMediationAdapter.TAG, adErrorC.toString());
            i.this.f87235b.onFailure(adErrorC);
        }
    }

    public i(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, @NonNull e eVar, @NonNull y3.a aVar) {
        this.f87241h = mediationRewardedAdConfiguration.getWatermark();
        this.f87235b = mediationAdLoadCallback;
        this.f87236c = eVar;
        this.f87237d = aVar;
    }

    public void h(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) throws JSONException {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString("gameId");
        String string2 = serverParameters.getString(UnityMediationAdapter.KEY_PLACEMENT_ID);
        if (UnityAdsAdapterUtils.a(string, string2)) {
            this.f87236c.b(context, string, new c(context, string, string2, mediationRewardedAdConfiguration.getBidResponse()));
        } else {
            AdError adError = new AdError(101, UnityMediationAdapter.ERROR_MSG_MISSING_PARAMETERS, UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
            Log.w(UnityMediationAdapter.TAG, adError.toString());
            this.f87235b.onFailure(adError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (this.f87239f == null) {
                Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
            }
            UnityAdsShowOptions unityAdsShowOptionsB = this.f87237d.b(this.f87240g);
            unityAdsShowOptionsB.set("watermark", this.f87241h);
            this.f87237d.d(activity, this.f87239f, unityAdsShowOptionsB, this.f87243j);
            return;
        }
        AdError adError = new AdError(105, UnityMediationAdapter.ERROR_MSG_NON_ACTIVITY, UnityMediationAdapter.ADAPTER_ERROR_DOMAIN);
        Log.e(UnityMediationAdapter.TAG, adError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f87238e;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adError);
        }
    }
}
