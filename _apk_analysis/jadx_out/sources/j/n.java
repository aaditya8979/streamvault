package j;

import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f71952b;

    public n(x0 x0Var) {
        this.f71952b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback = this.f71952b.f72038b;
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdLoaded();
        }
    }
}
