package c;

import bp.r0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.out.RewardVideoListener;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements RewardVideoListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f6479b;

    public o(m mVar) {
        this.f6479b = mVar;
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        this.f6479b.B.onAdClose();
        if (rewardInfo.isCompleteView()) {
            this.f6479b.B.onReward("");
        }
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onAdShow(MBridgeIds mBridgeIds) {
        m mVar = this.f6479b;
        mVar.B.onAdShow(r0.b(null, mVar.f71957f));
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        this.f6479b.v(str);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        this.f6479b.B.onAdClick();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        this.f6479b.B.onAdVideoComplete();
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        this.f6479b.v(str);
    }

    @Override // com.mbridge.msdk.out.RewardVideoListener, com.mbridge.msdk.video.bt.module.orglistener.g
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        this.f6479b.B.onAdVideoCache();
    }
}
