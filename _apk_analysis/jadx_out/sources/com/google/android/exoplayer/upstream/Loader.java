package com.google.android.exoplayer.upstream;

import a6.h0;
import a6.k0;
import a6.m;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import y5.n;

/* JADX INFO: loaded from: classes10.dex */
public final class Loader implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f21016d = g(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21017e = g(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f21018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f21019g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f21020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public d<? extends e> f21021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IOException f21022c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public interface b<T extends e> {
        c g(T t10, long j10, long j11, IOException iOException, int i10);

        void j(T t10, long j10, long j11);

        void l(T t10, long j10, long j11, boolean z10);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f21024b;

        public c(int i10, long j10) {
            this.f21023a = i10;
            this.f21024b = j10;
        }

        public boolean c() {
            int i10 = this.f21023a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f21026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f21027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public b<T> f21028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public IOException f21029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f21030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public Thread f21031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f21032i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f21033j;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f21026c = t10;
            this.f21028e = bVar;
            this.f21025b = i10;
            this.f21027d = j10;
        }

        public void a(boolean z10) {
            this.f21033j = z10;
            this.f21029f = null;
            if (hasMessages(0)) {
                this.f21032i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f21032i = true;
                    this.f21026c.cancelLoad();
                    Thread thread = this.f21031h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) a6.a.e(this.f21028e)).l(this.f21026c, jElapsedRealtime, jElapsedRealtime - this.f21027d, true);
                this.f21028e = null;
            }
        }

        public final void b() {
            this.f21029f = null;
            Loader.this.f21020a.execute((Runnable) a6.a.e(Loader.this.f21021b));
        }

        public final void c() {
            Loader.this.f21021b = null;
        }

        public final long d() {
            return Math.min((this.f21030g - 1) * 1000, 5000);
        }

        public void f(int i10) throws IOException {
            IOException iOException = this.f21029f;
            if (iOException != null && this.f21030g > i10) {
                throw iOException;
            }
        }

        public void g(long j10) {
            a6.a.f(Loader.this.f21021b == null);
            Loader.this.f21021b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f21033j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                b();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f21027d;
            b bVar = (b) a6.a.e(this.f21028e);
            if (this.f21032i) {
                bVar.l(this.f21026c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.j(this.f21026c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    m.d("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f21022c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f21029f = iOException;
            int i12 = this.f21030g + 1;
            this.f21030g = i12;
            c cVarG = bVar.g(this.f21026c, jElapsedRealtime, j10, iOException, i12);
            if (cVarG.f21023a == 3) {
                Loader.this.f21022c = this.f21029f;
            } else if (cVarG.f21023a != 2) {
                if (cVarG.f21023a == 1) {
                    this.f21030g = 1;
                }
                g(cVarG.f21024b != -9223372036854775807L ? cVarG.f21024b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f21032i;
                    this.f21031h = Thread.currentThread();
                }
                if (z10) {
                    h0.a("load:" + this.f21026c.getClass().getSimpleName());
                    try {
                        this.f21026c.load();
                        h0.c();
                    } catch (Throwable th2) {
                        h0.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f21031h = null;
                    Thread.interrupted();
                }
                if (this.f21033j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f21033j) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Error e11) {
                m.d("LoadTask", "Unexpected error loading stream", e11);
                if (!this.f21033j) {
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (InterruptedException unused) {
                a6.a.f(this.f21032i);
                if (this.f21033j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (Exception e12) {
                m.d("LoadTask", "Unexpected exception loading stream", e12);
                if (this.f21033j) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                m.d("LoadTask", "OutOfMemory error loading stream", e13);
                if (this.f21033j) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }
    }

    public interface e {
        void cancelLoad();

        void load() throws InterruptedException, IOException;
    }

    public interface f {
        void onLoaderReleased();
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f21035b;

        public g(f fVar) {
            this.f21035b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21035b.onLoaderReleased();
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f21018f = new c(2, j10);
        f21019g = new c(3, j10);
    }

    public Loader(String str) {
        this.f21020a = k0.m0(str);
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) a6.a.h(this.f21021b)).a(false);
    }

    public void f() {
        this.f21022c = null;
    }

    public boolean h() {
        return this.f21022c != null;
    }

    public boolean i() {
        return this.f21021b != null;
    }

    public void j(int i10) throws IOException {
        IOException iOException = this.f21022c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f21021b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f21025b;
            }
            dVar.f(i10);
        }
    }

    public void k() {
        l(null);
    }

    public void l(@Nullable f fVar) {
        d<? extends e> dVar = this.f21021b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f21020a.execute(new g(fVar));
        }
        this.f21020a.shutdown();
    }

    public <T extends e> long m(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) a6.a.h(Looper.myLooper());
        this.f21022c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).g(0L);
        return jElapsedRealtime;
    }

    @Override // y5.n
    public void maybeThrowError() throws IOException {
        j(Integer.MIN_VALUE);
    }
}
