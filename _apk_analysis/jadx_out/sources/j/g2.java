package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes9.dex */
public final class g2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f71873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b2 f71874c;

    public g2(b2 b2Var, AdInfo adInfo) {
        this.f71874c = b2Var;
        this.f71873b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f71874c.f71823b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdShow(this.f71873b);
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f71874c.f71824c.f71897f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onAdShow(this.f71873b);
        }
    }
}
