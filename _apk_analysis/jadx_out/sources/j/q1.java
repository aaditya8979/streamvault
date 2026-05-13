package j;

import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f71999b;

    public q1(x0 x0Var) {
        this.f71999b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback = this.f71999b.f72038b;
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdHide();
        }
    }
}
