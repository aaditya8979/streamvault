package j;

import com.yk.e.callBack.MainThirdBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f71997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f71998c;

    public q0(k2 k2Var, AdInfo adInfo) {
        this.f71998c = k2Var;
        this.f71997b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f71998c.f71904b;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdShow(this.f71997b);
        }
        MainThirdBannerCallBack mainThirdBannerCallBack2 = this.f71998c.f71905c.f71857e;
        if (mainThirdBannerCallBack2 != null) {
            mainThirdBannerCallBack2.onAdShow(this.f71997b);
        }
    }
}
