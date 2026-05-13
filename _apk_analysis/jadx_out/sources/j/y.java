package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f72041b;

    public y(e2 e2Var) {
        this.f72041b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f72041b.f71860b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdClick();
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f72041b.f71861c.f71849e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdClick();
        }
    }
}
