package j;

import com.yk.e.callBack.MainMRECCallBack;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f71868b;

    public g(z1 z1Var) {
        this.f71868b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMRECCallBack mainMRECCallBack = this.f71868b.f72049b;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClose();
        }
        MainMRECCallBack mainMRECCallBack2 = this.f71868b.f72050c.f71830e;
        if (mainMRECCallBack2 != null) {
            mainMRECCallBack2.onAdClose();
        }
    }
}
