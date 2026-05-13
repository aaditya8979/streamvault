package e;

import android.app.Activity;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements PAGSdk.PAGInitCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f60017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f60018b;

    public w(h0 h0Var, Activity activity) {
        this.f60018b = h0Var;
        this.f60017a = activity;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void fail(int i10, String str) {
        this.f60018b.x(i10 + ", " + str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public final void success() {
        this.f60018b.N.a(this.f60017a);
        PAGNativeRequest pAGNativeRequest = new PAGNativeRequest();
        h0 h0Var = this.f60018b;
        PAGNativeAd.loadAd(h0Var.P, pAGNativeRequest, h0Var.Q);
    }
}
