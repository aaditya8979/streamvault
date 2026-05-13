package sg.bigo.ads.ad.interstitial;

import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f80788a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f80789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sg.bigo.ads.common.utils.n f80790c;

    public interface a {
        boolean a(Runnable runnable);
    }

    public final void a() {
        this.f80788a = true;
        sg.bigo.ads.common.utils.n nVar = this.f80790c;
        if (nVar != null) {
            nVar.b();
        }
    }

    public final void a(int i10, final Runnable runnable) {
        sg.bigo.ads.common.utils.n nVar = this.f80790c;
        if (nVar != null) {
            nVar.b();
        }
        this.f80788a = false;
        sg.bigo.ads.common.utils.n nVar2 = new sg.bigo.ads.common.utils.n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.interstitial.e.1
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                Runnable runnable2;
                e eVar = e.this;
                if (eVar.f80788a || (runnable2 = runnable) == null) {
                    return;
                }
                a aVar = eVar.f80789b;
                if (aVar != null) {
                    aVar.a(runnable2);
                } else {
                    runnable2.run();
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
        this.f80790c = nVar2;
        nVar2.c();
    }

    @CallSuper
    public void b() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f80788a || (nVar = this.f80790c) == null || nVar.f82503i) {
            return;
        }
        nVar.c();
    }

    @CallSuper
    public void c() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f80788a || (nVar = this.f80790c) == null || nVar.f82503i) {
            return;
        }
        nVar.d();
    }
}
