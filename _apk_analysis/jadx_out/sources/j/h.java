package j;

import com.yk.e.callBack.MainWdNativeAdCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f71875b;

    public h(d0 d0Var) {
        this.f71875b = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f71875b.f71843b;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClose();
        }
        MainWdNativeAdCallback mainWdNativeAdCallback2 = this.f71875b.f71844c.f71943e;
        if (mainWdNativeAdCallback2 != null) {
            mainWdNativeAdCallback2.onAdClose();
        }
    }
}
