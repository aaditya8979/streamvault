package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes9.dex */
public final class e1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f71858b;

    public e1(z zVar) {
        this.f71858b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f71858b.f72045b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdVideoComplete();
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f71858b.f72046c.f72014e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdVideoComplete();
        }
    }
}
