package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f72040b;

    public x1(e2 e2Var) {
        this.f72040b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f72040b.f71860b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdSkipped();
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f72040b.f71861c.f71849e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdSkipped();
        }
    }
}
