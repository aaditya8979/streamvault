package j;

import com.yk.e.callBack.MainSplashAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f72020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e2 f72022d;

    public t1(e2 e2Var, int i10, String str) {
        this.f72022d = e2Var;
        this.f72020b = i10;
        this.f72021c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e2 e2Var = this.f72022d;
        e2Var.f71861c.IL1Iii(this.f72020b, this.f72021c, e2Var.f71860b);
        MainSplashAdCallBack mainSplashAdCallBack = this.f72022d.f71861c.f71849e;
        if (mainSplashAdCallBack != null) {
            mainSplashAdCallBack.onAdFail(this.f72020b, this.f72021c);
        }
    }
}
