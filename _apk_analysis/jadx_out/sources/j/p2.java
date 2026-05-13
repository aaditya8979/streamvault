package j;

import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f71993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f71994c;

    public p2(p pVar, AdInfo adInfo) {
        this.f71994c = pVar;
        this.f71993b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f71994c.f71987b;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdShow(this.f71993b);
        }
        MainInterstitialAdCallBack mainInterstitialAdCallBack2 = this.f71994c.f71988c.f71810d;
        if (mainInterstitialAdCallBack2 != null) {
            mainInterstitialAdCallBack2.onAdShow(this.f71993b);
        }
    }
}
