package jh;

import com.yk.e.callBack.MainInterstitialAdCallBack;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f72454b;

    public n0(u uVar) {
        this.f72454b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainInterstitialAdCallBack mainInterstitialAdCallBack = this.f72454b.D;
        if (mainInterstitialAdCallBack != null) {
            mainInterstitialAdCallBack.onAdClick();
        }
    }
}
