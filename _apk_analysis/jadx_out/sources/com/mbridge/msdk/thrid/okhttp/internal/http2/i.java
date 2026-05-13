package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.http2.c;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okio.s;
import com.mbridge.msdk.thrid.okio.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: compiled from: Http2Stream.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ boolean f40582l = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f40583a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f40586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<r> f40587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f40588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f40589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f40590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f40591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f40592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.mbridge.msdk.thrid.okhttp.internal.http2.b f40593k;

    /* JADX INFO: compiled from: Http2Stream.java */
    public final class a implements com.mbridge.msdk.thrid.okio.r {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ boolean f40594e = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f40595a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f40596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f40597c;

        public a() {
        }

        private void a(boolean z10) throws IOException {
            i iVar;
            long jMin;
            i iVar2;
            synchronized (i.this) {
                i.this.f40592j.h();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f40584b > 0 || this.f40597c || this.f40596b || iVar.f40593k != null) {
                            break;
                        } else {
                            iVar.k();
                        }
                    } finally {
                    }
                }
                iVar.f40592j.k();
                i.this.b();
                jMin = Math.min(i.this.f40584b, this.f40595a.size());
                iVar2 = i.this;
                iVar2.f40584b -= jMin;
            }
            iVar2.f40592j.h();
            try {
                i iVar3 = i.this;
                iVar3.f40586d.a(iVar3.f40585c, z10 && jMin == this.f40595a.size(), this.f40595a, jMin);
            } finally {
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            if (!f40594e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            this.f40595a.a(cVar, j10);
            while (this.f40595a.size() >= 16384) {
                a(false);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return i.this.f40592j;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f40594e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                if (this.f40596b) {
                    return;
                }
                if (!i.this.f40590h.f40597c) {
                    if (this.f40595a.size() > 0) {
                        while (this.f40595a.size() > 0) {
                            a(true);
                        }
                    } else {
                        i iVar = i.this;
                        iVar.f40586d.a(iVar.f40585c, true, (com.mbridge.msdk.thrid.okio.c) null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f40596b = true;
                }
                i.this.f40586d.flush();
                i.this.a();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            if (!f40594e && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            synchronized (i.this) {
                i.this.b();
            }
            while (this.f40595a.size() > 0) {
                a(false);
                i.this.f40586d.flush();
            }
        }
    }

    /* JADX INFO: compiled from: Http2Stream.java */
    public final class b implements s {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ boolean f40599g = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f40600a = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f40601b = new com.mbridge.msdk.thrid.okio.c();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f40602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f40603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f40604e;

        public b(long j10) {
            this.f40602c = j10;
        }

        private void f(long j10) {
            if (!f40599g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            i.this.f40586d.g(j10);
        }

        public void a(com.mbridge.msdk.thrid.okio.e eVar, long j10) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long size;
            if (!f40599g && Thread.holdsLock(i.this)) {
                throw new AssertionError();
            }
            while (j10 > 0) {
                synchronized (i.this) {
                    z10 = this.f40604e;
                    z11 = true;
                    z12 = this.f40601b.size() + j10 > this.f40602c;
                }
                if (z12) {
                    eVar.skip(j10);
                    i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    eVar.skip(j10);
                    return;
                }
                long jB = eVar.b(this.f40600a, j10);
                if (jB == -1) {
                    throw new EOFException();
                }
                j10 -= jB;
                synchronized (i.this) {
                    if (this.f40603d) {
                        size = this.f40600a.size();
                        this.f40600a.k();
                    } else {
                        if (this.f40601b.size() != 0) {
                            z11 = false;
                        }
                        this.f40601b.a(this.f40600a);
                        if (z11) {
                            i.this.notifyAll();
                        }
                        size = 0;
                    }
                }
                if (size > 0) {
                    f(size);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
        @Override // com.mbridge.msdk.thrid.okio.s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long b(com.mbridge.msdk.thrid.okio.c r12, long r13) throws java.io.IOException {
            /*
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Laf
            L6:
                r2 = 0
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r3 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this
                monitor-enter(r3)
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r4 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r4 = r4.f40591i     // Catch: java.lang.Throwable -> Lac
                r4.h()     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r4 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.b r5 = r4.f40593k     // Catch: java.lang.Throwable -> La3
                if (r5 == 0) goto L18
                r2 = r5
            L18:
                boolean r5 = r11.f40603d     // Catch: java.lang.Throwable -> La3
                if (r5 != 0) goto L9b
                java.util.Deque r4 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.a(r4)     // Catch: java.lang.Throwable -> La3
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La3
                if (r4 != 0) goto L2b
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r4 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.i.b(r4)     // Catch: java.lang.Throwable -> La3
            L2b:
                com.mbridge.msdk.thrid.okio.c r4 = r11.f40601b     // Catch: java.lang.Throwable -> La3
                long r4 = r4.size()     // Catch: java.lang.Throwable -> La3
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                r5 = -1
                if (r4 <= 0) goto L6d
                com.mbridge.msdk.thrid.okio.c r4 = r11.f40601b     // Catch: java.lang.Throwable -> La3
                long r7 = r4.size()     // Catch: java.lang.Throwable -> La3
                long r13 = java.lang.Math.min(r13, r7)     // Catch: java.lang.Throwable -> La3
                long r12 = r4.b(r12, r13)     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                long r7 = r14.f40583a     // Catch: java.lang.Throwable -> La3
                long r7 = r7 + r12
                r14.f40583a = r7     // Catch: java.lang.Throwable -> La3
                if (r2 != 0) goto L82
                com.mbridge.msdk.thrid.okhttp.internal.http2.g r14 = r14.f40586d     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.m r14 = r14.f40521t     // Catch: java.lang.Throwable -> La3
                int r14 = r14.c()     // Catch: java.lang.Throwable -> La3
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> La3
                int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r14 < 0) goto L82
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.g r4 = r14.f40586d     // Catch: java.lang.Throwable -> La3
                int r7 = r14.f40585c     // Catch: java.lang.Throwable -> La3
                long r8 = r14.f40583a     // Catch: java.lang.Throwable -> La3
                r4.a(r7, r8)     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                r14.f40583a = r0     // Catch: java.lang.Throwable -> La3
                goto L82
            L6d:
                boolean r4 = r11.f40604e     // Catch: java.lang.Throwable -> La3
                if (r4 != 0) goto L81
                if (r2 != 0) goto L81
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r2 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> La3
                r2.k()     // Catch: java.lang.Throwable -> La3
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r2 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r2 = r2.f40591i     // Catch: java.lang.Throwable -> Lac
                r2.k()     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                goto L6
            L81:
                r12 = r5
            L82:
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r14 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r14 = r14.f40591i     // Catch: java.lang.Throwable -> Lac
                r14.k()     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r14 == 0) goto L92
                r11.f(r12)
                return r12
            L92:
                if (r2 != 0) goto L95
                return r5
            L95:
                com.mbridge.msdk.thrid.okhttp.internal.http2.n r12 = new com.mbridge.msdk.thrid.okhttp.internal.http2.n
                r12.<init>(r2)
                throw r12
            L9b:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> La3
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> La3
                throw r12     // Catch: java.lang.Throwable -> La3
            La3:
                r12 = move-exception
                com.mbridge.msdk.thrid.okhttp.internal.http2.i r13 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.this     // Catch: java.lang.Throwable -> Lac
                com.mbridge.msdk.thrid.okhttp.internal.http2.i$c r13 = r13.f40591i     // Catch: java.lang.Throwable -> Lac
                r13.k()     // Catch: java.lang.Throwable -> Lac
                throw r12     // Catch: java.lang.Throwable -> Lac
            Lac:
                r12 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                throw r12
            Laf:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.b.b(com.mbridge.msdk.thrid.okio.c, long):long");
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return i.this.f40591i;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                this.f40603d = true;
                size = this.f40601b.size();
                this.f40601b.k();
                if (!i.this.f40587e.isEmpty()) {
                    i.b(i.this);
                }
                i.this.notifyAll();
            }
            if (size > 0) {
                f(size);
            }
            i.this.a();
        }
    }

    /* JADX INFO: compiled from: Http2Stream.java */
    public class c extends com.mbridge.msdk.thrid.okio.a {
        public c() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            i.this.c(com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL);
            i.this.f40586d.l();
        }

        public void k() throws IOException {
            if (i()) {
                throw b((IOException) null);
            }
        }
    }

    public i(int i10, g gVar, boolean z10, boolean z11, r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f40587e = arrayDeque;
        this.f40591i = new c();
        this.f40592j = new c();
        this.f40593k = null;
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f40585c = i10;
        this.f40586d = gVar;
        this.f40584b = gVar.f40522u.c();
        b bVar = new b(gVar.f40521t.c());
        this.f40589g = bVar;
        a aVar = new a();
        this.f40590h = aVar;
        bVar.f40604e = z11;
        aVar.f40597c = z10;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (f() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!f() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public static /* synthetic */ c.a b(i iVar) {
        iVar.getClass();
        return null;
    }

    private boolean b(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (!f40582l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.f40593k != null) {
                return false;
            }
            if (this.f40589g.f40604e && this.f40590h.f40597c) {
                return false;
            }
            this.f40593k = bVar;
            notifyAll();
            this.f40586d.c(this.f40585c);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() throws java.io.IOException {
        /*
            r2 = this;
            boolean r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.i.f40582l
            if (r0 != 0) goto L11
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L11:
            monitor-enter(r2)
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$b r0 = r2.f40589g     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0.f40604e     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L28
            boolean r0 = r0.f40603d     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L28
            com.mbridge.msdk.thrid.okhttp.internal.http2.i$a r0 = r2.f40590h     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0.f40597c     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L26
            boolean r0 = r0.f40596b     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L28
        L26:
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            boolean r1 = r2.g()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L36
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r0 = com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL
            r2.a(r0)
            goto L3f
        L36:
            if (r1 != 0) goto L3f
            com.mbridge.msdk.thrid.okhttp.internal.http2.g r0 = r2.f40586d
            int r1 = r2.f40585c
            r0.c(r1)
        L3f:
            return
        L40:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L40
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.i.a():void");
    }

    public void a(long j10) {
        this.f40584b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) throws IOException {
        if (b(bVar)) {
            this.f40586d.b(this.f40585c, bVar);
        }
    }

    public void a(com.mbridge.msdk.thrid.okio.e eVar, int i10) throws IOException {
        if (!f40582l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f40589g.a(eVar, i10);
    }

    public void a(List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> list) {
        boolean zG;
        if (!f40582l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f40588f = true;
            this.f40587e.add(com.mbridge.msdk.thrid.okhttp.internal.c.b(list));
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f40586d.c(this.f40585c);
    }

    public void b() throws IOException {
        a aVar = this.f40590h;
        if (aVar.f40596b) {
            throw new IOException("stream closed");
        }
        if (aVar.f40597c) {
            throw new IOException("stream finished");
        }
        if (this.f40593k != null) {
            throw new n(this.f40593k);
        }
    }

    public int c() {
        return this.f40585c;
    }

    public void c(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (b(bVar)) {
            this.f40586d.c(this.f40585c, bVar);
        }
    }

    public com.mbridge.msdk.thrid.okio.r d() {
        synchronized (this) {
            if (!this.f40588f && !f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f40590h;
    }

    public synchronized void d(com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar) {
        if (this.f40593k == null) {
            this.f40593k = bVar;
            notifyAll();
        }
    }

    public s e() {
        return this.f40589g;
    }

    public boolean f() {
        return this.f40586d.f40502a == ((this.f40585c & 1) == 1);
    }

    public synchronized boolean g() {
        if (this.f40593k != null) {
            return false;
        }
        b bVar = this.f40589g;
        if (bVar.f40604e || bVar.f40603d) {
            a aVar = this.f40590h;
            if (aVar.f40597c || aVar.f40596b) {
                if (this.f40588f) {
                    return false;
                }
            }
        }
        return true;
    }

    public t h() {
        return this.f40591i;
    }

    public void i() {
        boolean zG;
        if (!f40582l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f40589g.f40604e = true;
            zG = g();
            notifyAll();
        }
        if (zG) {
            return;
        }
        this.f40586d.c(this.f40585c);
    }

    public synchronized r j() throws IOException {
        this.f40591i.h();
        while (this.f40587e.isEmpty() && this.f40593k == null) {
            try {
                k();
            } catch (Throwable th2) {
                this.f40591i.k();
                throw th2;
            }
        }
        this.f40591i.k();
        if (this.f40587e.isEmpty()) {
            throw new n(this.f40593k);
        }
        return this.f40587e.removeFirst();
    }

    public void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public t l() {
        return this.f40592j;
    }
}
