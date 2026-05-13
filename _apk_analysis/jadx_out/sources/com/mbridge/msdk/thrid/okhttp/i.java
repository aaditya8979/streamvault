package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.connection.g;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ConnectionPool.java */
/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Executor f40295g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f40296h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f40297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f40298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f40299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Deque<com.mbridge.msdk.thrid.okhttp.internal.connection.c> f40300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.connection.d f40301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40302f;

    /* JADX INFO: compiled from: ConnectionPool.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long jA = i.this.a(System.nanoTime());
                if (jA == -1) {
                    return;
                }
                if (jA > 0) {
                    long j10 = jA / 1000000;
                    long j11 = jA - (1000000 * j10);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j10, (int) j11);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public i(int i10, long j10, TimeUnit timeUnit) {
        this.f40299c = new a();
        this.f40300d = new ArrayDeque();
        this.f40301e = new com.mbridge.msdk.thrid.okhttp.internal.connection.d();
        this.f40297a = i10;
        this.f40298b = timeUnit.toNanos(j10);
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
    }

    private int a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar, long j10) {
        List<Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> list = cVar.f40358n;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("A connection to " + cVar.c().a().k() + " was leaked. Did you forget to close a response body?", ((g.a) reference).f40388a);
                list.remove(i10);
                cVar.f40355k = true;
                if (list.isEmpty()) {
                    cVar.f40359o = j10 - this.f40298b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public long a(long j10) {
        synchronized (this) {
            com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = null;
            long j11 = Long.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2 : this.f40300d) {
                if (a(cVar2, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j12 = j10 - cVar2.f40359o;
                    if (j12 > j11) {
                        cVar = cVar2;
                        j11 = j12;
                    }
                }
            }
            long j13 = this.f40298b;
            if (j11 < j13 && i10 <= this.f40297a) {
                if (i10 > 0) {
                    return j13 - j11;
                }
                if (i11 > 0) {
                    return j13;
                }
                this.f40302f = false;
                return -1L;
            }
            this.f40300d.remove(cVar);
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.g());
            return 0L;
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
        if (!f40296h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f40300d) {
            if (cVar.a(aVar, c0Var)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    public Socket a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
        if (!f40296h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f40300d) {
            if (cVar.a(aVar, null) && cVar.f() && cVar != gVar.c()) {
                return gVar.b(cVar);
            }
        }
        return null;
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f40296h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (cVar.f40355k || this.f40297a == 0) {
            this.f40300d.remove(cVar);
            return true;
        }
        notifyAll();
        return false;
    }

    public void b(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f40296h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f40302f) {
            this.f40302f = true;
            f40295g.execute(this.f40299c);
        }
        this.f40300d.add(cVar);
    }
}
