package j;

import com.yk.e.callBack.MainWdNativeAdCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f71862b;

    public f(d0 d0Var) {
        this.f71862b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f71862b.f71843b;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClick();
        }
        MainWdNativeAdCallback mainWdNativeAdCallback2 = this.f71862b.f71844c.f71943e;
        if (mainWdNativeAdCallback2 != null) {
            mainWdNativeAdCallback2.onAdClick();
        }
    }
}
