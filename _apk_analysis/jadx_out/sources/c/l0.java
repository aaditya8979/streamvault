package c;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f6475b;

    public l0(v vVar) {
        this.f6475b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.f6475b.B;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdClick();
        }
    }
}
