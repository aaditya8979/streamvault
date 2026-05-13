package o3;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import n3.g;
import n3.m;
import n3.o;

/* JADX INFO: compiled from: InMobiNativeAd.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends NativeAdEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationNativeAdConfiguration f76022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f76023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m f76024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediationNativeAdCallback f76025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.ads.mediation.inmobi.a f76026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n3.b f76027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @VisibleForTesting
    public o f76028h;

    /* JADX INFO: compiled from: InMobiNativeAd.java */
    public class a extends VideoEventListener {
        public a() {
        }

        @Override // com.inmobi.ads.listeners.VideoEventListener
        public void onVideoCompleted(InMobiNative inMobiNative) {
            super.onVideoCompleted(inMobiNative);
            Log.d(InMobiMediationAdapter.TAG, "InMobi native ad video has completed.");
            MediationNativeAdCallback mediationNativeAdCallback = c.this.f76025e;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onVideoComplete();
            }
        }

        @Override // com.inmobi.ads.listeners.VideoEventListener
        public void onVideoSkipped(InMobiNative inMobiNative) {
            super.onVideoSkipped(inMobiNative);
            Log.d(InMobiMediationAdapter.TAG, "InMobi native ad video has been skipped.");
        }
    }

    public c(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.inmobi.a aVar, @NonNull n3.b bVar) {
        this.f76022b = mediationNativeAdConfiguration;
        this.f76023c = mediationAdLoadCallback;
        this.f76026f = aVar;
        this.f76027g = bVar;
    }

    public void a(Context context, long j10) {
        m mVarD = this.f76027g.d(context, Long.valueOf(j10), this);
        this.f76024d = mVarD;
        mVarD.n(new a());
        n3.d.h();
        n3.d.a(this.f76022b.getMediationExtras());
        b(this.f76024d);
    }

    public abstract void b(m mVar);

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdClicked(@NonNull InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has been clicked.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f76025e;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDismissed(@NonNull InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has been dismissed.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f76025e;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdClosed();
        }
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onAdFullScreenDisplayed(@NonNull InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has been displayed.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f76025e;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdOpened();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdImpression(@NonNull InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has logged an impression.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f76025e;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadFailed(@NonNull InMobiNative inMobiNative, @NonNull InMobiAdRequestStatus inMobiAdRequestStatus) {
        AdError adErrorB = g.b(n3.d.f(inMobiAdRequestStatus), inMobiAdRequestStatus.getMessage());
        Log.w(InMobiMediationAdapter.TAG, adErrorB.toString());
        this.f76023c.onFailure(adErrorB);
    }

    @Override // com.inmobi.ads.listeners.AdEventListener
    public void onAdLoadSucceeded(@NonNull InMobiNative inMobiNative, @NonNull AdMetaInfo adMetaInfo) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has been loaded.");
        NativeAdOptions nativeAdOptions = this.f76022b.getNativeAdOptions();
        o oVar = new o(this.f76027g.e(inMobiNative), Boolean.valueOf(nativeAdOptions != null ? nativeAdOptions.shouldReturnUrlsForImageAssets() : false), this.f76023c, this);
        this.f76028h = oVar;
        oVar.c(this.f76022b.getContext());
    }

    @Override // com.inmobi.ads.listeners.NativeAdEventListener
    public void onUserWillLeaveApplication(@NonNull InMobiNative inMobiNative) {
        Log.d(InMobiMediationAdapter.TAG, "InMobi native ad has caused the user to leave the application.");
        MediationNativeAdCallback mediationNativeAdCallback = this.f76025e;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }
}
