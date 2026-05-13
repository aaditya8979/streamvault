package jh;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f72429b;

    public a(u uVar) {
        this.f72429b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        u uVar = this.f72429b;
        synchronized (uVar) {
            z10 = uVar.E == 0;
        }
        if (z10) {
            u.D(this.f72429b);
            this.f72429b.a("视频缓冲超时");
        }
    }
}
