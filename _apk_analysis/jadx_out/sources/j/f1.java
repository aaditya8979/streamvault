package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes9.dex */
public final class f1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b2 f71866b;

    public f1(b2 b2Var) {
        this.f71866b = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f71866b.f71823b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdVideoCache();
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f71866b.f71824c.f71897f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onAdVideoCache();
        }
    }
}
