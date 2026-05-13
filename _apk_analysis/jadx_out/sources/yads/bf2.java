package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes10.dex */
public final class bf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af2 f87983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ze2 f87984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xv f87985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f87986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f87987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f87988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f87989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f87990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f87991i;

    public bf2(go0 go0Var, af2 af2Var, s63 s63Var, int i10, xv xvVar, Looper looper) {
        this.f87984b = go0Var;
        this.f87983a = af2Var;
        this.f87988f = looper;
        this.f87985c = xvVar;
    }

    public final bf2 a() {
        if (!(!this.f87989g)) {
            throw new IllegalStateException();
        }
        this.f87989g = true;
        go0 go0Var = (go0) this.f87984b;
        synchronized (go0Var) {
            if (go0Var.A || !go0Var.f90062j.isAlive()) {
                ih1.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                a(false);
            } else {
                go0Var.f90061i.a(14, this).b();
            }
        }
        return this;
    }

    public final synchronized void a(long j10) {
        boolean z10;
        if (!this.f87989g) {
            throw new IllegalStateException();
        }
        if (this.f87988f.getThread() == Thread.currentThread()) {
            throw new IllegalStateException();
        }
        ((f53) this.f87985c).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        while (true) {
            z10 = this.f87991i;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f87985c.getClass();
            wait(j10);
            ((f53) this.f87985c).getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void a(boolean z10) {
        this.f87990h = z10 | this.f87990h;
        this.f87991i = true;
        notifyAll();
    }
}
