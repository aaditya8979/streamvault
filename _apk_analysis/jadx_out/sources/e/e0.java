package e;

import bp.r0;
import com.yk.e.callBack.MainWdNativeAdCallback;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements d.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f59999a;

    public e0(a aVar) {
        this.f59999a = aVar;
    }

    public final /* synthetic */ void a() {
        MainWdNativeAdCallback mainWdNativeAdCallback = this.f59999a.L;
        if (mainWdNativeAdCallback != null) {
            mainWdNativeAdCallback.onAdClick();
        }
    }

    public final void b() {
        a aVar = this.f59999a;
        aVar.L.onAdShow(r0.b(null, aVar.f71957f));
        this.f59999a.o(new Runnable() { // from class: e.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f59997b.a();
            }
        });
    }
}
