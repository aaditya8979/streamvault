package p000do;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.d1;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class n0 extends d1 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final n0 f59868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f59869i;

    static {
        Long l10;
        n0 n0Var = new n0();
        f59868h = n0Var;
        c1.R(n0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f59869i = timeUnit.toNanos(l10.longValue());
    }

    @Override // p000do.d1, p000do.r0
    @NotNull
    public y0 A(long j10, @NotNull Runnable runnable, @NotNull d dVar) {
        return r0(j10, runnable);
    }

    @Override // p000do.e1
    @NotNull
    public Thread X() {
        Thread thread = _thread;
        return thread == null ? v0() : thread;
    }

    @Override // p000do.e1
    public void Y(long j10, @NotNull d1.c cVar) {
        z0();
    }

    @Override // p000do.d1
    public void d0(@NotNull Runnable runnable) {
        if (w0()) {
            z0();
        }
        super.d0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM0;
        m2.f59866a.d(this);
        b.a();
        try {
            if (!y0()) {
                if (zM0) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jU = U();
                if (jU == Long.MAX_VALUE) {
                    b.a();
                    long jNanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f59869i + jNanoTime;
                    }
                    long j11 = j10 - jNanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        u0();
                        b.a();
                        if (m0()) {
                            return;
                        }
                        X();
                        return;
                    }
                    jU = n.k(jU, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (jU > 0) {
                    if (x0()) {
                        _thread = null;
                        u0();
                        b.a();
                        if (m0()) {
                            return;
                        }
                        X();
                        return;
                    }
                    b.a();
                    LockSupport.parkNanos(this, jU);
                }
            }
        } finally {
            _thread = null;
            u0();
            b.a();
            if (!m0()) {
                X();
            }
        }
    }

    @Override // p000do.d1, p000do.c1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000do.h0
    @NotNull
    public String toString() {
        return "DefaultExecutor";
    }

    public final synchronized void u0() {
        if (x0()) {
            debugStatus = 3;
            o0();
            p.i(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread v0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f59868h.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean w0() {
        return debugStatus == 4;
    }

    public final boolean x0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    public final synchronized boolean y0() {
        if (x0()) {
            return false;
        }
        debugStatus = 1;
        p.i(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void z0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
