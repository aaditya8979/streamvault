package l;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements PAGNativeAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f73619b;

    public x(m mVar) {
        this.f73619b = mVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    public final void onAdLoaded(PAGNativeAd pAGNativeAd) {
        int i10;
        int i11;
        PAGNativeAd pAGNativeAd2 = pAGNativeAd;
        m mVar = this.f73619b;
        i.e eVar = mVar.f71962k;
        if (eVar == null || (i10 = eVar.f63662d) == 0) {
            i10 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
        }
        if (eVar == null || (i11 = eVar.f63663e) == 0) {
            i11 = 465;
        }
        int i12 = i11;
        d.q qVar = mVar.C;
        qVar.f59510b = mVar.I;
        qVar.b(pAGNativeAd2, i10, i12, mVar.D, mVar.E);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
    public final void onError(int i10, String str) {
        this.f73619b.v(i10 + ", " + str);
    }
}
