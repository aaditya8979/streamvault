package c;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 implements PAGRewardedAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6478b;

    public n0(t tVar) {
        this.f6478b = tVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
        PAGRewardedAd pAGRewardedAd2 = pAGRewardedAd;
        t tVar = this.f6478b;
        tVar.D = pAGRewardedAd2;
        pAGRewardedAd2.setAdInteractionListener(tVar.H);
        this.f6478b.C.onAdVideoCache();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i10, String str) {
        this.f6478b.v(i10 + ", " + str);
    }
}
