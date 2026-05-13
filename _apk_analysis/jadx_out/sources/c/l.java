package c;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f6474b;

    public l(q qVar) {
        this.f6474b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f6474b.f6484c;
        if (dVar.B) {
            return;
        }
        dVar.v("load ad time out");
        this.f6474b.f6484c.D = true;
    }
}
