package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class qw3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vw3 f94196b;

    public qw3(vw3 vw3Var) {
        this.f94196b = vw3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vw3 vw3Var = this.f94196b;
        int streamVolume = vw3Var.f96214c.getStreamVolume(3);
        int streamMaxVolume = vw3Var.f96214c.getStreamMaxVolume(3);
        vw3Var.f96215d.getClass();
        float f10 = 1.0f;
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            f10 = 0.0f;
        } else {
            float f11 = streamVolume / streamMaxVolume;
            if (f11 <= 1.0f) {
                f10 = f11;
            }
        }
        this.f94196b.f96218g.set(false);
        if (((Float) this.f94196b.f96217f.getAndSet(Float.valueOf(f10))).floatValue() != f10) {
            this.f94196b.f96212a.post(new ow3(this, f10));
        }
    }
}
