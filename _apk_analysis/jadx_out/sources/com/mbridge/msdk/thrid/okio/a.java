package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: AsyncTimeout.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f40824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f40825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static a f40826j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f40827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private a f40828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f40829g;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncTimeout.java */
    public class C0509a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f40830a;

        public C0509a(r rVar) {
            this.f40830a = rVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f40838b, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                o oVar = cVar.f40837a;
                while (true) {
                    if (j11 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j11 += (long) (oVar.f40872c - oVar.f40871b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    oVar = oVar.f40875f;
                }
                a.this.h();
                try {
                    try {
                        this.f40830a.a(cVar, j11);
                        j10 -= j11;
                        a.this.a(true);
                    } catch (IOException e10) {
                        throw a.this.a(e10);
                    }
                } catch (Throwable th2) {
                    a.this.a(false);
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.h();
            try {
                try {
                    this.f40830a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.h();
            try {
                try {
                    this.f40830a.flush();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f40830a + ")";
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.java */
    public class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f40832a;

        public b(s sVar) {
            this.f40832a = sVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            a.this.h();
            try {
                try {
                    long jB = this.f40832a.b(cVar, j10);
                    a.this.a(true);
                    return jB;
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f40832a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f40832a + ")";
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.java */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
        
            r1.j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.mbridge.msdk.thrid.okio.a> r0 = com.mbridge.msdk.thrid.okio.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.mbridge.msdk.thrid.okio.a r1 = com.mbridge.msdk.thrid.okio.a.g()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                com.mbridge.msdk.thrid.okio.a r2 = com.mbridge.msdk.thrid.okio.a.f40826j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                com.mbridge.msdk.thrid.okio.a.f40826j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.j()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f40824h = millis;
        f40825i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private static synchronized void a(a aVar, long j10, boolean z10) {
        if (f40826j == null) {
            f40826j = new a();
            new c().start();
        }
        long jNanoTime = System.nanoTime();
        if (j10 != 0 && z10) {
            aVar.f40829g = Math.min(j10, aVar.c() - jNanoTime) + jNanoTime;
        } else if (j10 != 0) {
            aVar.f40829g = j10 + jNanoTime;
        } else {
            if (!z10) {
                throw new AssertionError();
            }
            aVar.f40829g = aVar.c();
        }
        long jB = aVar.b(jNanoTime);
        a aVar2 = f40826j;
        while (true) {
            a aVar3 = aVar2.f40828f;
            if (aVar3 == null || jB < aVar3.b(jNanoTime)) {
                break;
            } else {
                aVar2 = aVar2.f40828f;
            }
        }
        aVar.f40828f = aVar2.f40828f;
        aVar2.f40828f = aVar;
        if (aVar2 == f40826j) {
            a.class.notify();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        r1.f40828f = r3.f40828f;
        r3.f40828f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized boolean a(com.mbridge.msdk.thrid.okio.a r3) {
        /*
            java.lang.Class<com.mbridge.msdk.thrid.okio.a> r0 = com.mbridge.msdk.thrid.okio.a.class
            monitor-enter(r0)
            com.mbridge.msdk.thrid.okio.a r1 = com.mbridge.msdk.thrid.okio.a.f40826j     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            com.mbridge.msdk.thrid.okio.a r2 = r1.f40828f     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L15
            com.mbridge.msdk.thrid.okio.a r2 = r3.f40828f     // Catch: java.lang.Throwable -> L19
            r1.f40828f = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f40828f = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r1 = r2
            goto L5
        L17:
            r3 = 1
            goto L13
        L19:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.a.a(com.mbridge.msdk.thrid.okio.a):boolean");
    }

    private long b(long j10) {
        return this.f40829g - j10;
    }

    @Nullable
    public static a g() throws InterruptedException {
        a aVar = f40826j.f40828f;
        if (aVar == null) {
            long jNanoTime = System.nanoTime();
            a.class.wait(f40824h);
            if (f40826j.f40828f != null || System.nanoTime() - jNanoTime < f40825i) {
                return null;
            }
            return f40826j;
        }
        long jB = aVar.b(System.nanoTime());
        if (jB > 0) {
            long j10 = jB / 1000000;
            a.class.wait(j10, (int) (jB - (1000000 * j10)));
            return null;
        }
        f40826j.f40828f = aVar.f40828f;
        aVar.f40828f = null;
        return aVar;
    }

    public final r a(r rVar) {
        return new C0509a(rVar);
    }

    public final s a(s sVar) {
        return new b(sVar);
    }

    public final IOException a(IOException iOException) throws IOException {
        return !i() ? iOException : b(iOException);
    }

    public final void a(boolean z10) throws IOException {
        if (i() && z10) {
            throw b((IOException) null);
        }
    }

    public IOException b(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void h() {
        if (this.f40827e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jF = f();
        boolean zD = d();
        if (jF != 0 || zD) {
            this.f40827e = true;
            a(this, jF, zD);
        }
    }

    public final boolean i() {
        if (!this.f40827e) {
            return false;
        }
        this.f40827e = false;
        return a(this);
    }

    public void j() {
    }
}
