package bp;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f5727b;

    public b(a aVar) {
        this.f5727b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f5727b;
        int i10 = aVar.f5710a;
        if (i10 > 0) {
            aVar.f5710a = i10 - 1;
            aVar.f5712c.postDelayed(this, 1000L);
        } else {
            t1 t1Var = aVar.f5711b;
            if (t1Var != null) {
                t1Var.a();
            }
        }
    }
}
