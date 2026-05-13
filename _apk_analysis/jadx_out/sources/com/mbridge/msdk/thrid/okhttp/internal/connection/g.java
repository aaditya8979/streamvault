package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.connection.f;
import com.mbridge.msdk.thrid.okhttp.internal.http2.n;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* JADX INFO: compiled from: StreamAllocation.java */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ boolean f40373o = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.a f40374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f.a f40375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c0 f40376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f40377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.d f40378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f40379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f40380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f f40381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f40382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f40383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f40384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f40386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http.c f40387n;

    /* JADX INFO: compiled from: StreamAllocation.java */
    public static final class a extends WeakReference<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f40388a;

        public a(g gVar, Object obj) {
            super(gVar);
            this.f40388a = obj;
        }
    }

    public g(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, Object obj) {
        this.f40377d = iVar;
        this.f40374a = aVar;
        this.f40378e = dVar;
        this.f40379f = oVar;
        this.f40381h = new f(aVar, i(), dVar, oVar);
        this.f40380g = obj;
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10) throws Throwable {
        c cVar;
        Socket socketG;
        c cVar2;
        Socket socketA;
        c0 c0VarC;
        boolean z11;
        boolean z12;
        f.a aVar;
        synchronized (this.f40377d) {
            if (this.f40385l) {
                throw new IllegalStateException("released");
            }
            if (this.f40387n != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f40386m) {
                throw new IOException("Canceled");
            }
            cVar = this.f40383j;
            socketG = g();
            cVar2 = this.f40383j;
            socketA = null;
            if (cVar2 != null) {
                cVar = null;
            } else {
                cVar2 = null;
            }
            if (!this.f40384k) {
                cVar = null;
            }
            if (cVar2 == null) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(this.f40377d, this.f40374a, this, null);
                c cVar3 = this.f40383j;
                if (cVar3 != null) {
                    z11 = true;
                    cVar2 = cVar3;
                    c0VarC = null;
                } else {
                    c0VarC = this.f40376c;
                }
            } else {
                c0VarC = null;
            }
            z11 = false;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketG);
        if (cVar != null) {
            this.f40379f.connectionReleased(this.f40378e, cVar);
        }
        if (z11) {
            this.f40379f.connectionAcquired(this.f40378e, cVar2);
        }
        if (cVar2 != null) {
            this.f40376c = this.f40383j.c();
            return cVar2;
        }
        if (c0VarC != null || ((aVar = this.f40375b) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f40375b = this.f40381h.c();
            z12 = true;
        }
        synchronized (this.f40377d) {
            if (this.f40386m) {
                throw new IOException("Canceled");
            }
            if (z12) {
                List<c0> listA = this.f40375b.a();
                int size = listA.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    c0 c0Var = listA.get(i14);
                    com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(this.f40377d, this.f40374a, this, c0Var);
                    c cVar4 = this.f40383j;
                    if (cVar4 != null) {
                        this.f40376c = c0Var;
                        z11 = true;
                        cVar2 = cVar4;
                        break;
                    }
                    i14++;
                }
            }
            if (!z11) {
                if (c0VarC == null) {
                    c0VarC = this.f40375b.c();
                }
                this.f40376c = c0VarC;
                this.f40382i = 0;
                cVar2 = new c(this.f40377d, c0VarC);
                a(cVar2, false);
            }
        }
        if (z11) {
            this.f40379f.connectionAcquired(this.f40378e, cVar2);
            return cVar2;
        }
        cVar2.a(i10, i11, i12, i13, z10, this.f40378e, this.f40379f);
        i().a(cVar2.c());
        synchronized (this.f40377d) {
            this.f40384k = true;
            com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.b(this.f40377d, cVar2);
            if (cVar2.f()) {
                socketA = com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(this.f40377d, this.f40374a, this);
                cVar2 = this.f40383j;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        this.f40379f.connectionAcquired(this.f40378e, cVar2);
        return cVar2;
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws Throwable {
        while (true) {
            c cVarA = a(i10, i11, i12, i13, z10);
            synchronized (this.f40377d) {
                if (cVarA.f40356l == 0 && !cVarA.f()) {
                    return cVarA;
                }
                if (cVarA.a(z11)) {
                    return cVarA;
                }
                e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.Socket a(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = com.mbridge.msdk.thrid.okhttp.internal.connection.g.f40373o
            if (r0 != 0) goto L13
            com.mbridge.msdk.thrid.okhttp.i r0 = r1.f40377d
            boolean r0 = java.lang.Thread.holdsLock(r0)
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L13:
            r0 = 0
            if (r4 == 0) goto L18
            r1.f40387n = r0
        L18:
            r4 = 1
            if (r3 == 0) goto L1d
            r1.f40385l = r4
        L1d:
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r3 = r1.f40383j
            if (r3 == 0) goto L5d
            if (r2 == 0) goto L25
            r3.f40355k = r4
        L25:
            com.mbridge.msdk.thrid.okhttp.internal.http.c r2 = r1.f40387n
            if (r2 != 0) goto L5d
            boolean r2 = r1.f40385l
            if (r2 != 0) goto L31
            boolean r2 = r3.f40355k
            if (r2 == 0) goto L5d
        L31:
            r1.a(r3)
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f40383j
            java.util.List<java.lang.ref.Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> r2 = r2.f40358n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L59
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f40383j
            long r3 = java.lang.System.nanoTime()
            r2.f40359o = r3
            com.mbridge.msdk.thrid.okhttp.internal.a r2 = com.mbridge.msdk.thrid.okhttp.internal.a.f40304a
            com.mbridge.msdk.thrid.okhttp.i r3 = r1.f40377d
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r4 = r1.f40383j
            boolean r2 = r2.a(r3, r4)
            if (r2 == 0) goto L59
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f40383j
            java.net.Socket r2 = r2.g()
            goto L5a
        L59:
            r2 = r0
        L5a:
            r1.f40383j = r0
            r0 = r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.connection.g.a(boolean, boolean, boolean):java.net.Socket");
    }

    private void a(c cVar) {
        int size = cVar.f40358n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f40358n.get(i10).get() == this) {
                cVar.f40358n.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private Socket g() {
        if (!f40373o && !Thread.holdsLock(this.f40377d)) {
            throw new AssertionError();
        }
        c cVar = this.f40383j;
        if (cVar == null || !cVar.f40355k) {
            return null;
        }
        return a(false, false, true);
    }

    private d i() {
        return com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(this.f40377d);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, boolean z10) {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http.c cVarA = a(aVar.a(), aVar.b(), aVar.c(), vVar.t(), vVar.z(), z10).a(vVar, aVar, this);
            synchronized (this.f40377d) {
                this.f40387n = cVarA;
            }
            return cVarA;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    public void a() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        c cVar2;
        synchronized (this.f40377d) {
            this.f40386m = true;
            cVar = this.f40387n;
            cVar2 = this.f40383j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.d();
        }
    }

    public void a(c cVar, boolean z10) {
        if (!f40373o && !Thread.holdsLock(this.f40377d)) {
            throw new AssertionError();
        }
        if (this.f40383j != null) {
            throw new IllegalStateException();
        }
        this.f40383j = cVar;
        this.f40384k = z10;
        cVar.f40358n.add(new a(this, this.f40380g));
    }

    public void a(IOException iOException) {
        c cVar;
        boolean z10;
        Socket socketA;
        synchronized (this.f40377d) {
            cVar = null;
            if (iOException instanceof n) {
                com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = ((n) iOException).f40624a;
                if (bVar == com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM) {
                    int i10 = this.f40382i + 1;
                    this.f40382i = i10;
                    if (i10 > 1) {
                        this.f40376c = null;
                        z10 = true;
                    }
                    z10 = false;
                } else {
                    if (bVar != com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL) {
                        this.f40376c = null;
                        z10 = true;
                    }
                    z10 = false;
                }
            } else {
                c cVar2 = this.f40383j;
                if (cVar2 != null && (!cVar2.f() || (iOException instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a))) {
                    if (this.f40383j.f40356l == 0) {
                        c0 c0Var = this.f40376c;
                        if (c0Var != null && iOException != null) {
                            this.f40381h.a(c0Var, iOException);
                        }
                        this.f40376c = null;
                    }
                    z10 = true;
                }
                z10 = false;
            }
            c cVar3 = this.f40383j;
            socketA = a(z10, false, true);
            if (this.f40383j == null && this.f40384k) {
                cVar = cVar3;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f40379f.connectionReleased(this.f40378e, cVar);
        }
    }

    public void a(boolean z10, com.mbridge.msdk.thrid.okhttp.internal.http.c cVar, long j10, IOException iOException) {
        c cVar2;
        Socket socketA;
        boolean z11;
        this.f40379f.responseBodyEnd(this.f40378e, j10);
        synchronized (this.f40377d) {
            if (cVar != null) {
                if (cVar == this.f40387n) {
                    if (!z10) {
                        this.f40383j.f40356l++;
                    }
                    cVar2 = this.f40383j;
                    socketA = a(z10, false, true);
                    if (this.f40383j != null) {
                        cVar2 = null;
                    }
                    z11 = this.f40385l;
                }
            }
            throw new IllegalStateException("expected " + this.f40387n + " but was " + cVar);
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar2 != null) {
            this.f40379f.connectionReleased(this.f40378e, cVar2);
        }
        if (iOException != null) {
            this.f40379f.callFailed(this.f40378e, com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(this.f40378e, iOException));
        } else if (z11) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(this.f40378e, (IOException) null);
            this.f40379f.callEnd(this.f40378e);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c b() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        synchronized (this.f40377d) {
            cVar = this.f40387n;
        }
        return cVar;
    }

    public Socket b(c cVar) {
        if (!f40373o && !Thread.holdsLock(this.f40377d)) {
            throw new AssertionError();
        }
        if (this.f40387n != null || this.f40383j.f40358n.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<g> reference = this.f40383j.f40358n.get(0);
        Socket socketA = a(true, false, false);
        this.f40383j = cVar;
        cVar.f40358n.add(reference);
        return socketA;
    }

    public synchronized c c() {
        return this.f40383j;
    }

    public boolean d() {
        f.a aVar;
        return this.f40376c != null || ((aVar = this.f40375b) != null && aVar.b()) || this.f40381h.a();
    }

    public void e() {
        c cVar;
        Socket socketA;
        synchronized (this.f40377d) {
            cVar = this.f40383j;
            socketA = a(true, false, false);
            if (this.f40383j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f40379f.connectionReleased(this.f40378e, cVar);
        }
    }

    public void f() {
        c cVar;
        Socket socketA;
        synchronized (this.f40377d) {
            cVar = this.f40383j;
            socketA = a(false, true, false);
            if (this.f40383j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(this.f40378e, (IOException) null);
            this.f40379f.connectionReleased(this.f40378e, cVar);
            this.f40379f.callEnd(this.f40378e);
        }
    }

    public c0 h() {
        return this.f40376c;
    }

    public String toString() {
        c cVarC = c();
        return cVarC != null ? cVarC.toString() : this.f40374a.toString();
    }
}
