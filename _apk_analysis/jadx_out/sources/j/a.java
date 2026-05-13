package j;

import android.view.View;
import com.yk.e.callBack.MainBannerCallBack;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f71805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f71806c;

    public a(p1 p1Var, View view) {
        this.f71806c = p1Var;
        this.f71805b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainBannerCallBack mainBannerCallBack = this.f71806c.f71991b;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdLoaded(this.f71805b);
        }
        MainBannerCallBack mainBannerCallBack2 = this.f71806c.f71992c.f71820e;
        if (mainBannerCallBack2 != null) {
            mainBannerCallBack2.onAdLoaded(this.f71805b);
        }
    }
}
