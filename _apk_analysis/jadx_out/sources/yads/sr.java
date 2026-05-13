package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class sr implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po2 f94917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f94918c;

    public sr(tr trVar, po2 po2Var) {
        this.f94918c = trVar;
        this.f94917b = po2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f94918c.f95326c.put(this.f94917b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
