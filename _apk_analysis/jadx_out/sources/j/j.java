package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f71888b;

    public j(e2 e2Var) {
        this.f71888b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f71888b.f71860b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdLoaded();
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f71888b.f71861c.f71849e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdLoaded();
        }
    }
}
