package f;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f61367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f61368b;

    public c(s sVar, Activity activity) {
        this.f61368b = sVar;
        this.f61367a = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f61368b.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.f61368b.E.a(this.f61367a);
        PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
        s sVar = this.f61368b;
        PAGNativeAd.loadAd(sVar.G, pAGNativeRequest, sVar.H);
    }
}
