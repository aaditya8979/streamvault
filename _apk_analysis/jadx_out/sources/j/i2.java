package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes9.dex */
public final class i2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f71886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f71887d;

    public i2(p pVar, int i10, String str) {
        this.f71887d = pVar;
        this.f71885b = i10;
        this.f71886c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f71887d;
        a0 a0Var = pVar.f71988c;
        if (!a0Var.iIi1) {
            a0Var.iIi1 = true;
            a0Var.IL1Iii(this.f71885b, this.f71886c, pVar.f71987b);
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f71887d.f71988c.f71810d;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdFail(this.f71885b, this.f71886c);
        }
    }
}
