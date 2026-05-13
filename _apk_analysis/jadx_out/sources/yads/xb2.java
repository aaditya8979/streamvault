package yads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes11.dex */
public final class xb2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zb2 f96704b;

    public xb2(zb2 zb2Var) {
        this.f96704b = zb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb2 zb2Var = this.f96704b;
        zb2Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - zb2Var.f97489h;
        zb2Var.f97489h = jElapsedRealtime;
        long j11 = zb2Var.f97487f - j10;
        zb2Var.f97487f = j11;
        long jMax = (long) Math.max(0.0d, j11);
        w63 w63Var = zb2Var.f97486e;
        if (w63Var != null) {
            w63Var.a(jMax, zb2Var.f97488g - jMax);
        }
        this.f96704b.c();
    }
}
