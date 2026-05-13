package j;

import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f72026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f72027c;

    public v(d0 d0Var, AdInfo adInfo) {
        this.f72027c = d0Var;
        this.f72026b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f72027c.f71843b;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdShow(this.f72026b);
        }
        MainWdNativeAdCallback mainWdNativeAdCallback2 = this.f72027c.f71844c.f71943e;
        if (mainWdNativeAdCallback2 != null) {
            mainWdNativeAdCallback2.onAdShow(this.f72026b);
        }
    }
}
