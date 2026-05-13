package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f71906b;

    public l(z zVar) {
        this.f71906b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f71906b.f72045b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClick();
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f71906b.f72046c.f72014e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdClick();
        }
    }
}
