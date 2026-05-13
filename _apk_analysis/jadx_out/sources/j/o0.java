package j;

import com.yk.e.callBack.MainBannerCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f71983b;

    public o0(p1 p1Var) {
        this.f71983b = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainBannerCallBack mainBannerCallBack = this.f71983b.f71991b;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClose();
        }
        MainBannerCallBack mainBannerCallBack2 = this.f71983b.f71992c.f71820e;
        if (mainBannerCallBack2 != null) {
            mainBannerCallBack2.onAdClose();
        }
    }
}
