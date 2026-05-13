package jh;

import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f72453a;

    public m0(z zVar) {
        this.f72453a = zVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f72453a.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
        z zVar = this.f72453a;
        PAGInterstitialAd.loadAd(zVar.G, pAGInterstitialRequest, zVar.H);
    }
}
