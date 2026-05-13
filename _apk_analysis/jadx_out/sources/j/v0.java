package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f72028b;

    public v0(b2 b2Var) {
        this.f72028b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f72028b.f71823b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdClick();
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f72028b.f71824c.f71897f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onAdClick();
        }
    }
}
