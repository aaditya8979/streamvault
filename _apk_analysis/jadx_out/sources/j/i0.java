package j;

import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f71882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f71883c;

    public i0(z1 z1Var, AdInfo adInfo) {
        this.f71883c = z1Var;
        this.f71882b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainMRECCallBack mainMRECCallBack = this.f71883c.f72049b;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdShow(this.f71882b);
        }
        MainMRECCallBack mainMRECCallBack2 = this.f71883c.f72050c.f71830e;
        if (mainMRECCallBack2 != null) {
            mainMRECCallBack2.onAdShow(this.f71882b);
        }
    }
}
