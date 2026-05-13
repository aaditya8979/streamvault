package t3;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import s3.i;
import s3.k;

/* JADX INFO: compiled from: MintegralRewardedAd.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f extends RewardVideoWithCodeListener implements MediationRewardedAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f84642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f84643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationRewardedAdCallback f84644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f84645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s3.a f84646f;

    public f(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, s3.a aVar) {
        this.f84645e = k.f(mediationRewardedAdConfiguration.getMediationExtras());
        this.f84642b = mediationAdLoadCallback;
        this.f84646f = aVar;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        if (this.f84644d == null) {
            return;
        }
        if (rewardInfo == null || !rewardInfo.isCompleteView()) {
            Log.w(MintegralMediationAdapter.TAG, "Mintegral SDK failed to reward user due to missing rewarded settings or rewarded ad playback not completed.");
        } else {
            this.f84644d.onUserEarnedReward();
        }
        this.f84644d.onAdClosed();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onAdShow(MBridgeIds mBridgeIds) {
        i iVar;
        if (this.f84646f.a() && (iVar = this.f84643c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f84644d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.f84644d.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onShowFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        i iVar;
        if (this.f84646f.a() && (iVar = this.f84643c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        AdError adErrorB = s3.d.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f84644d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(adErrorB);
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoAdClicked(MBridgeIds mBridgeIds) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.f84644d;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoComplete(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoWithCodeListener
    public void onVideoLoadFailWithCode(MBridgeIds mBridgeIds, int i10, String str) {
        i iVar;
        if (this.f84646f.a() && (iVar = this.f84643c) != null) {
            MintegralMediationAdapter.loadedSlotIdentifiers.remove(iVar);
        }
        AdError adErrorB = s3.d.b(i10, str);
        Log.w(MintegralMediationAdapter.TAG, adErrorB.toString());
        this.f84642b.onFailure(adErrorB);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f84644d = this.f84642b.onSuccess(this);
    }
}
