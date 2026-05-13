package k;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f72651b;

    public k0(x xVar) {
        this.f72651b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f72651b;
        if (xVar.K) {
            return;
        }
        xVar.L = true;
        xVar.a("视频缓冲超时");
    }
}
