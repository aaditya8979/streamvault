package ct;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements d.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f59465a;

    public q(n nVar) {
        this.f59465a = nVar;
    }

    public final /* synthetic */ void a() {
        MainMaterialCallback mainMaterialCallback = this.f59465a.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClick();
        }
    }

    public final void b() {
        this.f59465a.F.onAdVideoStart();
        this.f59465a.o(new Runnable() { // from class: ct.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f59462b.a();
            }
        });
    }
}
