package ct;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f59454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f59455b;

    public k0(b0 b0Var, Activity activity) {
        this.f59455b = b0Var;
        this.f59454a = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f59455b.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.f59455b.G.a(this.f59454a);
        PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
        b0 b0Var = this.f59455b;
        PAGNativeAd.loadAd(b0Var.I, pAGNativeRequest, b0Var.J);
    }
}
