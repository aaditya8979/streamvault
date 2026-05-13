package j;

import com.yk.e.callBack.MainNativeAdCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f72024b;

    public u0(z zVar) {
        this.f72024b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f72024b.f72045b;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClose();
        }
        MainNativeAdCallBack mainNativeAdCallBack2 = this.f72024b.f72046c.f72014e;
        if (mainNativeAdCallBack2 != null) {
            mainNativeAdCallBack2.onAdClose();
        }
    }
}
