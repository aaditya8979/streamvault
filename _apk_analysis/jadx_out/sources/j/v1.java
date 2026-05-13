package j;

import com.yk.e.callBack.MainBannerCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f72029b;

    public v1(p1 p1Var) {
        this.f72029b = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainBannerCallBack mainBannerCallBack = this.f72029b.f71991b;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClick();
        }
        MainBannerCallBack mainBannerCallBack2 = this.f72029b.f71992c.f71820e;
        if (mainBannerCallBack2 != null) {
            mainBannerCallBack2.onAdClick();
        }
    }
}
