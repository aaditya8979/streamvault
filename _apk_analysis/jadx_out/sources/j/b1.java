package j;

import com.yk.e.callBack.MainThirdBannerCallBack;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f71821b;

    public b1(k2 k2Var) {
        this.f71821b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f71821b.f71904b;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClose();
        }
        MainThirdBannerCallBack mainThirdBannerCallBack2 = this.f71821b.f71905c.f71857e;
        if (mainThirdBannerCallBack2 != null) {
            mainThirdBannerCallBack2.onAdClose();
        }
    }
}
