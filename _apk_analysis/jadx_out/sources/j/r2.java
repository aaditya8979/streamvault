package j;

import com.yk.e.callBack.MainMRECCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1 f72006b;

    public r2(z1 z1Var) {
        this.f72006b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMRECCallBack mainMRECCallBack = this.f72006b.f72049b;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
        MainMRECCallBack mainMRECCallBack2 = this.f72006b.f72050c.f71830e;
        if (mainMRECCallBack2 != null) {
            mainMRECCallBack2.onAdClick();
        }
    }
}
