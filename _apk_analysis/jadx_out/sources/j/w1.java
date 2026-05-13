package j;

import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f72033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f72034c;

    public w1(x0 x0Var, AdInfo adInfo) {
        this.f72034c = x0Var;
        this.f72033b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainFloatViewCallback mainFloatViewCallback = this.f72034c.f72038b;
        if (mainFloatViewCallback != null) {
            mainFloatViewCallback.onAdShow(this.f72033b);
        }
    }
}
