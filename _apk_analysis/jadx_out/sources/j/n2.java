package j;

import com.yk.e.callBack.MainBannerCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f71980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f71981d;

    public n2(p1 p1Var, int i10, String str) {
        this.f71981d = p1Var;
        this.f71979b = i10;
        this.f71980c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p1 p1Var = this.f71981d;
        p1Var.f71992c.IL1Iii(this.f71979b, this.f71980c, p1Var.f71991b);
        MainBannerCallBack mainBannerCallBack = this.f71981d.f71992c.f71820e;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdFail(this.f71979b, this.f71980c);
        }
    }
}
