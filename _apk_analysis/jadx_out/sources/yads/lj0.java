package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lj0 extends Thread implements qj0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pj0 f91986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rj0 f91987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nj0 f91988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f91989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f91990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile jj0 f91991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f91992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Exception f91993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f91994j = -1;

    public lj0(pj0 pj0Var, rj0 rj0Var, nj0 nj0Var, boolean z10, int i10, jj0 jj0Var) {
        this.f91986b = pj0Var;
        this.f91987c = rj0Var;
        this.f91988d = nj0Var;
        this.f91989e = z10;
        this.f91990f = i10;
        this.f91991g = jj0Var;
    }

    public final void a(long j10, long j11, float f10) {
        this.f91988d.f92858a = j11;
        this.f91988d.f92859b = f10;
        if (j10 != this.f91994j) {
            this.f91994j = j10;
            jj0 jj0Var = this.f91991g;
            if (jj0Var != null) {
                jj0Var.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
            }
        }
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f91991g = null;
        }
        if (this.f91992h) {
            return;
        }
        this.f91992h = true;
        this.f91987c.cancel();
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f91989e) {
                this.f91987c.remove();
            } else {
                long j10 = -1;
                int i10 = 0;
                while (!this.f91992h) {
                    try {
                        this.f91987c.a(this);
                        break;
                    } catch (IOException e10) {
                        if (!this.f91992h) {
                            long j11 = this.f91988d.f92858a;
                            if (j11 != j10) {
                                i10 = 0;
                                j10 = j11;
                            }
                            int i11 = i10 + 1;
                            if (i11 > this.f91990f) {
                                throw e10;
                            }
                            Thread.sleep(Math.min(i10 * 1000, 5000));
                            i10 = i11;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e11) {
            this.f91993i = e11;
        }
        jj0 jj0Var = this.f91991g;
        if (jj0Var != null) {
            jj0Var.obtainMessage(9, this).sendToTarget();
        }
    }
}
