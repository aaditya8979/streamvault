package h;

import bp.r0;
import com.yk.e.callBack.MainMRECCallBack;
import j.l2;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f62945a;

    public f(i iVar) {
        this.f62945a = iVar;
    }

    @Override // j.l2
    public final void a() {
        i iVar = this.f62945a;
        iVar.E.onAdShow(r0.b(null, iVar.f71957f));
        this.f62945a.o(new Runnable() { // from class: h.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f62944b.b();
            }
        });
    }

    public final /* synthetic */ void b() {
        MainMRECCallBack mainMRECCallBack = this.f62945a.E;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
    }
}
