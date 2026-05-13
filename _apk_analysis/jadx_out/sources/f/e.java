package f;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements PAGNativeAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f61373b;

    public e(s sVar) {
        this.f61373b = sVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        int i10;
        int i11;
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        s sVar = this.f61373b;
        i.e eVar = sVar.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = 1000;
        }
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 570;
        }
        int i12 = i11;
        d.q qVar = sVar.E;
        qVar.f59510b = sVar.I;
        qVar.b(pAGNativeAd2, i10, i12, sVar.B, sVar.C);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i10, String str) {
        this.f61373b.v(i10 + ", " + str);
    }
}
