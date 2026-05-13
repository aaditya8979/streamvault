package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes10.dex */
public final class i1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f71884b;

    public i1(y0 y0Var) {
        this.f71884b = y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f71884b.f72042a.f71823b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onReward("");
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f71884b.f72042a.f71824c.f71897f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onReward("");
        }
    }
}
