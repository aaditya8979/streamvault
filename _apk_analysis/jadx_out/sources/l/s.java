package l;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f73613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f73614b;

    public s(m mVar, Activity activity) {
        this.f73614b = mVar;
        this.f73613a = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f73614b.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.f73614b.C.a(this.f73613a);
        PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
        m mVar = this.f73614b;
        PAGNativeAd.loadAd(mVar.G, pAGNativeRequest, mVar.H);
    }
}
