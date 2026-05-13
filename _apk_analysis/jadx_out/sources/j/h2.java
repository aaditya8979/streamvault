package j;

import com.yk.e.callBack.MainWdNativeAdCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f71880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f71881d;

    public h2(d0 d0Var, int i10, String str) {
        this.f71881d = d0Var;
        this.f71879b = i10;
        this.f71880c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var = this.f71881d;
        d0Var.f71844c.IL1Iii(this.f71879b, this.f71880c, d0Var.f71843b);
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f71881d.f71844c.f71943e;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdFail(this.f71879b, this.f71880c);
        }
    }
}
