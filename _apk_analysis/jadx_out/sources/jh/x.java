package jh;

/* JADX INFO: loaded from: classes10.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f72464b;

    public x(t tVar) {
        this.f72464b = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar = this.f72464b;
        if (tVar.E) {
            return;
        }
        tVar.v("load ad time out!");
        this.f72464b.F = true;
    }
}
