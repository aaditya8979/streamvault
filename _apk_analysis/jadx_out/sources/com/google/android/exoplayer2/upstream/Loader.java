package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import s7.k0;
import s7.m0;
import s7.q;

/* JADX INFO: loaded from: classes7.dex */
public final class Loader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22855d = g(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22856e = g(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f22857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f22858g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f22859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public d<? extends e> f22860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IOException f22861c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public interface b<T extends e> {
        void c(T t10, long j10, long j11, boolean z10);

        void d(T t10, long j10, long j11);

        c g(T t10, long j10, long j11, IOException iOException, int i10);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f22863b;

        public c(int i10, long j10) {
            this.f22862a = i10;
            this.f22863b = j10;
        }

        public boolean c() {
            int i10 = this.f22862a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f22865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f22866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public b<T> f22867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public IOException f22868f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22869g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public Thread f22870h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f22871i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f22872j;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f22865c = t10;
            this.f22867e = bVar;
            this.f22864b = i10;
            this.f22866d = j10;
        }

        public void a(boolean z10) {
            this.f22872j = z10;
            this.f22868f = null;
            if (hasMessages(0)) {
                this.f22871i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f22871i = true;
                    this.f22865c.cancelLoad();
                    Thread thread = this.f22870h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) s7.a.e(this.f22867e)).c(this.f22865c, jElapsedRealtime, jElapsedRealtime - this.f22866d, true);
                this.f22867e = null;
            }
        }

        public final void b() {
            this.f22868f = null;
            Loader.this.f22859a.execute((Runnable) s7.a.e(Loader.this.f22860b));
        }

        public final void c() {
            Loader.this.f22860b = null;
        }

        public final long d() {
            return Math.min((this.f22869g - 1) * 1000, 5000);
        }

        public void f(int i10) throws IOException {
            IOException iOException = this.f22868f;
            if (iOException != null && this.f22869g > i10) {
                throw iOException;
            }
        }

        public void g(long j10) {
            s7.a.g(Loader.this.f22860b == null);
            Loader.this.f22860b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f22872j) {
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
            long j10 = jElapsedRealtime - this.f22866d;
            b bVar = (b) s7.a.e(this.f22867e);
            if (this.f22871i) {
                bVar.c(this.f22865c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.d(this.f22865c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    q.d("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f22861c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f22868f = iOException;
            int i12 = this.f22869g + 1;
            this.f22869g = i12;
            c cVarG = bVar.g(this.f22865c, jElapsedRealtime, j10, iOException, i12);
            if (cVarG.f22862a == 3) {
                Loader.this.f22861c = this.f22868f;
            } else if (cVarG.f22862a != 2) {
                if (cVarG.f22862a == 1) {
                    this.f22869g = 1;
                }
                g(cVarG.f22863b != -9223372036854775807L ? cVarG.f22863b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f22871i;
                    this.f22870h = Thread.currentThread();
                }
                if (z10) {
                    k0.a("load:" + this.f22865c.getClass().getSimpleName());
                    try {
                        this.f22865c.load();
                        k0.c();
                    } catch (Throwable th2) {
                        k0.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f22870h = null;
                    Thread.interrupted();
                }
                if (this.f22872j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f22872j) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f22872j) {
                    q.d("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f22872j) {
                    return;
                }
                q.d("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f22872j) {
                    return;
                }
                q.d("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }
    }

    public interface e {
        void cancelLoad();

        void load() throws IOException;
    }

    public interface f {
        void onLoaderReleased();
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f22874b;

        public g(f fVar) {
            this.f22874b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22874b.onLoaderReleased();
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f22857f = new c(2, j10);
        f22858g = new c(3, j10);
    }

    public Loader(String str) {
        this.f22859a = m0.x0("ExoPlayer:Loader:" + str);
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) s7.a.i(this.f22860b)).a(false);
    }

    public void f() {
        this.f22861c = null;
    }

    public boolean h() {
        return this.f22861c != null;
    }

    public boolean i() {
        return this.f22860b != null;
    }

    public void j() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void k(int i10) throws IOException {
        IOException iOException = this.f22861c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f22860b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f22864b;
            }
            dVar.f(i10);
        }
    }

    public void l() {
        m(null);
    }

    public void m(@Nullable f fVar) {
        d<? extends e> dVar = this.f22860b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f22859a.execute(new g(fVar));
        }
        this.f22859a.shutdown();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) s7.a.i(Looper.myLooper());
        this.f22861c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).g(0L);
        return jElapsedRealtime;
    }
}
