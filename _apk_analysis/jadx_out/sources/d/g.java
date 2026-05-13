package d;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements PAGVideoAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f59495b;

    public g(q qVar) {
        this.f59495b = qVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
    public final void onVideoAdComplete() {
        k kVar = this.f59495b.f59510b;
        if (kVar != null) {
            kVar.onVideoAdComplete();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
    public final void onVideoAdPaused() {
        k kVar = this.f59495b.f59510b;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
    public final void onVideoAdPlay() {
        k kVar = this.f59495b.f59510b;
        if (kVar != null) {
            kVar.onVideoAdPlay();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
    public final void onVideoError() {
        k kVar = this.f59495b.f59510b;
        if (kVar != null) {
            kVar.onVideoError();
        }
    }
}
