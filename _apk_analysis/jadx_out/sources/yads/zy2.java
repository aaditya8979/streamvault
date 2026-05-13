package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class zy2 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ az2 f97841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy2(fz2 fz2Var) {
        super("ExoPlayer:SimpleDecoder");
        this.f97841b = fz2Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        az2 az2Var = this.f97841b;
        az2Var.getClass();
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (az2Var.e());
    }
}
