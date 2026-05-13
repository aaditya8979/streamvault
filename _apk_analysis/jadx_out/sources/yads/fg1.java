package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes12.dex */
public final class fg1 implements gg1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zf1 f89569d = new zf1(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zf1 f89570e = new zf1(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f89571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ag1 f89572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f89573c;

    public fg1(String str) {
        this.f89571a = ib3.d("ExoPlayer:Loader:".concat(str));
    }

    public final long a(bg1 bg1Var, yf1 yf1Var, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException();
        }
        this.f89573c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ag1 ag1Var = new ag1(this, looperMyLooper, bg1Var, yf1Var, i10, jElapsedRealtime);
        if (this.f89572b != null) {
            throw new IllegalStateException();
        }
        this.f89572b = ag1Var;
        ag1Var.f87688f = null;
        this.f89571a.execute(ag1Var);
        return jElapsedRealtime;
    }

    @Override // yads.gg1
    public final void a() throws IOException {
        a(Integer.MIN_VALUE);
    }

    public final void a(int i10) throws IOException {
        IOException iOException = this.f89573c;
        if (iOException != null) {
            throw iOException;
        }
        ag1 ag1Var = this.f89572b;
        if (ag1Var != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = ag1Var.f87684b;
            }
            IOException iOException2 = ag1Var.f87688f;
            if (iOException2 != null && ag1Var.f87689g > i10) {
                throw iOException2;
            }
        }
    }

    public final void a(cg1 cg1Var) {
        ag1 ag1Var = this.f89572b;
        if (ag1Var != null) {
            ag1Var.a(true);
        }
        if (cg1Var != null) {
            this.f89571a.execute(new dg1(cg1Var));
        }
        this.f89571a.shutdown();
    }

    public final boolean b() {
        return this.f89572b != null;
    }
}
