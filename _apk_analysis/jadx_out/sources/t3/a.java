package t3;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import s3.i;
import s3.j;

/* JADX INFO: compiled from: MintegralAppOpenAd.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a extends MBSplashLoadWithCodeListener implements MediationAppOpenAd, MBSplashShowListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f84618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f84619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationAppOpenAdCallback f84620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f84621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s3.a f84622f;

    public a(@NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, s3.a aVar) {
        this.f84618b = mediationAdLoadCallback;
        this.f84622f = aVar;
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z10) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdClicked(MBridgeIds mBridgeIds) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f84620d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onAdTick(MBridgeIds mBridgeIds, long j10) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onDismiss(MBridgeIds mBridgeIds, int i10) {
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f84620d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
        j jVar = this.f84621e;
        if (jVar != null) {
            jVar.onDestroy();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadWithCodeListener
    public void onLoadFailedWithCode(MBridgeIds mBridgeIds, int i10, String str, int i11) {
        i iVar;
        if (this.f84622f.a() && (iVar = this.f84619c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        AdError adErrorB = s3.d.b(i10, str);
        Log.d(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f84618b.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.MBSplashLoadListener
    public void onLoadSuccessed(MBridgeIds mBridgeIds, int i10) {
        this.f84620d = this.f84618b.onSuccess(this);
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowFailed(MBridgeIds mBridgeIds, String str) {
        i iVar;
        if (this.f84622f.a() && (iVar = this.f84619c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        if (this.f84620d != null) {
            AdError adErrorB = s3.d.b(100, str);
            Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
            this.f84620d.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onShowSuccessed(MBridgeIds mBridgeIds) {
        i iVar;
        if (this.f84622f.a() && (iVar = this.f84619c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f84620d;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
            this.f84620d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.MBSplashShowListener
    public void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
    }
}
