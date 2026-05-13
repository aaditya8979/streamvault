package yads;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class as2 implements RunnableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vy f87794b = new vy();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vy f87795c = new vy();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f87796d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f87797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f87798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f87799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f87800h;

    public void a() {
    }

    public abstract Object b();

    public final Object c() throws ExecutionException {
        if (this.f87800h) {
            throw new CancellationException();
        }
        if (this.f87797e == null) {
            return this.f87798f;
        }
        throw new ExecutionException(this.f87797e);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f87796d) {
            if (!this.f87800h && !this.f87795c.c()) {
                this.f87800h = true;
                a();
                Thread thread = this.f87799g;
                if (thread == null) {
                    this.f87794b.d();
                    this.f87795c.d();
                } else if (z10) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.f87795c.a();
        return c();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws TimeoutException {
        boolean z10;
        long jConvert = TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        vy vyVar = this.f87795c;
        synchronized (vyVar) {
            if (jConvert <= 0) {
                z10 = vyVar.f96222a;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = jConvert + jElapsedRealtime;
                if (j11 < jElapsedRealtime) {
                    vyVar.a();
                } else {
                    while (!vyVar.f96222a && jElapsedRealtime < j11) {
                        vyVar.wait(j11 - jElapsedRealtime);
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z10 = vyVar.f96222a;
            }
        }
        if (z10) {
            return c();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f87800h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        vy vyVar = this.f87795c;
        synchronized (vyVar) {
            z10 = vyVar.f96222a;
        }
        return z10;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f87796d) {
            if (this.f87800h) {
                return;
            }
            this.f87799g = Thread.currentThread();
            this.f87794b.d();
            try {
                try {
                    this.f87798f = b();
                    synchronized (this.f87796d) {
                        this.f87795c.d();
                        this.f87799g = null;
                        Thread.interrupted();
                    }
                } catch (Exception e10) {
                    this.f87797e = e10;
                    synchronized (this.f87796d) {
                        this.f87795c.d();
                        this.f87799g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                synchronized (this.f87796d) {
                    this.f87795c.d();
                    this.f87799g = null;
                    Thread.interrupted();
                    throw th2;
                }
            }
        }
    }
}
