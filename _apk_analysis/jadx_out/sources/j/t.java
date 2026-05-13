package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f72018b;

    public t(p pVar) {
        this.f72018b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f72018b.f71987b;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdLoaded();
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack2 = this.f72018b.f71988c.f71810d;
        if (mainInterstitialAdCallBack2 != null) {
            mainInterstitialAdCallBack2.onAdLoaded();
        }
    }
}
