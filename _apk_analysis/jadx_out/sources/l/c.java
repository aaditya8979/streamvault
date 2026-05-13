package l;

import bp.r0;
import com.yk.e.callBack.MainNativeAdCallBack;
import j.l2;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f73584a;

    public c(e0 e0Var) {
        this.f73584a = e0Var;
    }

    @Override // j.l2
    public final void a() {
        e0 e0Var = this.f73584a;
        e0Var.B.onAdShow(r0.b(null, e0Var.f71957f));
        this.f73584a.o(new Runnable() { // from class: l.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f73582b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        MainNativeAdCallBack mainNativeAdCallBack = this.f73584a.B;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClick();
        }
    }
}
