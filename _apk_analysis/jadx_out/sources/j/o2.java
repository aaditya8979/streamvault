package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class o2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f71985b;

    public o2(p pVar) {
        this.f71985b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f71985b.f71987b;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClick();
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack2 = this.f71985b.f71988c.f71810d;
        if (mainInterstitialAdCallBack2 != null) {
            mainInterstitialAdCallBack2.onAdClick();
        }
    }
}
