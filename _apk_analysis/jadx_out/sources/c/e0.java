package c;

import bp.r0;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements PAGRewardedAdInteractionListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f6464b;

    public e0(t tVar) {
        this.f6464b = tVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        this.f6464b.C.onAdClick();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        this.f6464b.C.onAdClose();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        t tVar = this.f6464b;
        tVar.C.onAdShow(r0.b(null, tVar.f71957f));
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public final void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
        this.f6464b.C.onReward("");
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public final void onUserEarnedRewardFail(int i10, String str) {
        AdLog.e("pangle UserEarnedRewardFail " + i10 + ", " + str);
    }
}
