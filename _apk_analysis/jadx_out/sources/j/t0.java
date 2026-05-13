package j;

import com.yk.e.callBack.MainFloatViewCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f72019b;

    public t0(x0 x0Var) {
        this.f72019b = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback = this.f72019b.f72038b;
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdClose();
        }
    }
}
