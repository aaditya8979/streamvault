package j;

import com.yk.e.callBack.MainThirdBannerCallBack;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f72015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k2 f72017d;

    public s1(k2 k2Var, int i10, String str) {
        this.f72017d = k2Var;
        this.f72015b = i10;
        this.f72016c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k2 k2Var = this.f72017d;
        k2Var.f71905c.IL1Iii(this.f72015b, this.f72016c, k2Var.f71904b);
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f72017d.f71905c.f71857e;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdFail(this.f72015b, this.f72016c);
        }
    }
}
