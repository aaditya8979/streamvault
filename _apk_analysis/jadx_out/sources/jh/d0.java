package jh;

import bp.r0;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends PAGInterstitialAdInteractionCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f72437b;

    public d0(z zVar) {
        this.f72437b = zVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f72437b.D.onAdClick();
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        super.onAdDismissed();
        this.f72437b.D.onAdClose();
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback
    public final void onAdShowFailed(PAGErrorModel pAGErrorModel) {
        super.onAdShowFailed(pAGErrorModel);
        this.f72437b.v(pAGErrorModel.getErrorCode() + ", " + pAGErrorModel.getErrorMessage());
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        super.onAdShowed();
        z zVar = this.f72437b;
        zVar.D.onAdShow(r0.b(null, zVar.f71957f));
    }
}
