package k;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends PAGAppOpenAdInteractionCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f72639b;

    public e(q0 q0Var) {
        this.f72639b = q0Var;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f72639b.D.onAdClick();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        super.onAdDismissed();
        this.f72639b.D.onAdClose();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback
    public final void onAdShowFailed(PAGErrorModel pAGErrorModel) {
        super.onAdShowFailed(pAGErrorModel);
        this.f72639b.v(pAGErrorModel.getErrorCode() + ", " + pAGErrorModel.getErrorMessage());
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        super.onAdShowed();
        q0 q0Var = this.f72639b;
        q0Var.D.onAdShow(bp.r0.b(null, q0Var.f71957f));
    }
}
