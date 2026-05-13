package d;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends PAGNativeAdInteractionCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f59504b;

    public l(q qVar) {
        this.f59504b = qVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdClicked() {
        super.onAdClicked();
        k kVar = this.f59504b.f59510b;
        if (kVar != null) {
            kVar.onAdClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdDismissed() {
        super.onAdDismissed();
        k kVar = this.f59504b.f59510b;
        if (kVar != null) {
            kVar.onAdClose();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
    public final void onAdShowed() {
        super.onAdShowed();
        k kVar = this.f59504b.f59510b;
        if (kVar != null) {
            kVar.a();
        }
    }
}
