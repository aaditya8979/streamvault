package j;

import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdInfo f72000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f72001c;

    public q2(p1 p1Var, AdInfo adInfo) {
        this.f72001c = p1Var;
        this.f72000b = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainBannerCallBack mainBannerCallBack = this.f72001c.f71991b;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdShow(this.f72000b);
        }
        MainBannerCallBack mainBannerCallBack2 = this.f72001c.f71992c.f71820e;
        if (mainBannerCallBack2 != null) {
            mainBannerCallBack2.onAdShow(this.f72000b);
        }
    }
}
