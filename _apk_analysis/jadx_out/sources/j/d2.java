package j;

import com.yk.e.callBack.MainThirdBannerCallBack;

/* JADX INFO: loaded from: classes9.dex */
public final class d2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k2 f71850b;

    public d2(k2 k2Var) {
        this.f71850b = k2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f71850b.f71904b;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClick();
        }
        MainThirdBannerCallBack mainThirdBannerCallBack2 = this.f71850b.f71905c.f71857e;
        if (mainThirdBannerCallBack2 != null) {
            mainThirdBannerCallBack2.onAdClick();
        }
    }
}
