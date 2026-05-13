package j;

import android.view.View;
import com.yk.e.callBack.MainThirdBannerCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f72031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k2 f72032c;

    public w0(k2 k2Var, View view) {
        this.f72032c = k2Var;
        this.f72031b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f72032c.f71904b;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdLoaded(this.f72031b);
        }
        MainThirdBannerCallBack mainThirdBannerCallBack2 = this.f72032c.f71905c.f71857e;
        if (mainThirdBannerCallBack2 != null) {
            mainThirdBannerCallBack2.onAdLoaded(this.f72031b);
        }
    }
}
