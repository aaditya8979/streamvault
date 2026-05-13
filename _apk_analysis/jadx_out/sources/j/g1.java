package j;

import android.view.View;
import com.yk.e.callBack.MainWdNativeAdCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class g1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f71871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f71872c;

    public g1(d0 d0Var, View view) {
        this.f71872c = d0Var;
        this.f71871b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f71872c.f71843b;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdLoaded(this.f71871b);
        }
        MainWdNativeAdCallback mainWdNativeAdCallback2 = this.f71872c.f71844c.f71943e;
        if (mainWdNativeAdCallback2 != null) {
            mainWdNativeAdCallback2.onAdLoaded(this.f71871b);
        }
    }
}
