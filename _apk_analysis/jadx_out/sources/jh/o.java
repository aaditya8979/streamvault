package jh;

import bp.r0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements NewInterstitialListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f72455b;

    public o(m mVar) {
        this.f72455b = mVar;
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClicked(MBridgeIds mBridgeIds) {
        this.f72455b.C.onAdClick();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        this.f72455b.C.onAdClose();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdCloseWithNIReward(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        m mVar = this.f72455b;
        mVar.C.onAdShow(r0.b(mBridgeIds, mVar.f71957f));
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onLoadCampaignSuccess(MBridgeIds mBridgeIds) {
        AdLog.d("MintegralInterstitial onLoadCampaignSuccess");
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onResourceLoadFail(MBridgeIds mBridgeIds, String str) {
        this.f72455b.v(str);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onResourceLoadSuccess(MBridgeIds mBridgeIds) {
        this.f72455b.C.onAdLoaded();
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        this.f72455b.v(str);
    }

    @Override // com.mbridge.msdk.newinterstitial.out.NewInterstitialListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
    }
}
