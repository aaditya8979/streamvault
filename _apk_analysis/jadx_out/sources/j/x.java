package j;

import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f72035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2 f72036c;

    public x(e2 e2Var, AdInfo adInfo) {
        this.f72036c = e2Var;
        this.f72035b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainSplashAdCallBack mainSplashAdCallBack = this.f72036c.f71860b;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdShow(this.f72035b);
        }
        MainSplashAdCallBack mainSplashAdCallBack2 = this.f72036c.f71861c.f71849e;
        if (mainSplashAdCallBack2 != null) {
            mainSplashAdCallBack2.onAdShow(this.f72035b);
        }
    }
}
