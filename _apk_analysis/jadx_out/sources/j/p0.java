package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f71989b;

    public p0(z zVar) {
        this.f71989b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f71989b.f72045b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdVideoStart();
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f71989b.f72046c.f72014e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdVideoStart();
        }
    }
}
