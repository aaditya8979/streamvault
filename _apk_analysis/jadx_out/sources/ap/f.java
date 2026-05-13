package ap;

import bp.r0;
import com.yk.e.callBack.MainThirdBannerCallBack;
import j.l2;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f5244a;

    public f(i iVar) {
        this.f5244a = iVar;
    }

    @Override // j.l2
    public final void a() {
        i iVar = this.f5244a;
        iVar.E.onAdShow(r0.b(null, iVar.f71957f));
        this.f5244a.o(new Runnable() { // from class: ap.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f5243b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        MainThirdBannerCallBack mainThirdBannerCallBack = this.f5244a.E;
        if (mainThirdBannerCallBack != null) {
            mainThirdBannerCallBack.onAdClick();
        }
    }
}
