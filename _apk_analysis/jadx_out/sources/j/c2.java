package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes9.dex */
public final class c2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f71834b;

    public c2(e2 e2Var) {
        this.f71834b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f71834b.f71860b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdComplete();
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f71834b.f71861c.f71849e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdComplete();
        }
    }
}
