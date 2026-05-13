package f;

import bp.r0;
import com.yk.e.callBack.MainBannerCallBack;
import j.l2;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f61380a;

    public j0(g gVar) {
        this.f61380a = gVar;
    }

    @Override // j.l2
    public final void a() {
        g gVar = this.f61380a;
        gVar.D.onAdShow(r0.b(null, gVar.f71957f));
        this.f61380a.o(new Runnable() { // from class: f.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f61379b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        MainBannerCallBack mainBannerCallBack = this.f61380a.D;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClick();
        }
    }
}
