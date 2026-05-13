package j;

import com.yk.e.callBack.MainRewardVideoAdCallBack;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f71864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2 f71865d;

    public f0(b2 b2Var, int i10, String str) {
        this.f71865d = b2Var;
        this.f71863b = i10;
        this.f71864c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b2 b2Var = this.f71865d;
        j1 j1Var = b2Var.f71824c;
        if (!j1Var.f3396ILl) {
            j1Var.IL1Iii(this.f71863b, this.f71864c, b2Var.f71823b);
            return;
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = b2Var.f71823b;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdFail(this.f71863b, this.f71864c);
        }
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack2 = this.f71865d.f71824c.f71897f;
        if (mainRewardVideoAdCallBack2 != null) {
            mainRewardVideoAdCallBack2.onAdFail(this.f71863b, this.f71864c);
        }
    }
}
