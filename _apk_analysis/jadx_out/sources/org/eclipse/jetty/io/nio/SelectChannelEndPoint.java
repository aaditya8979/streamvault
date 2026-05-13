package org.eclipse.jetty.io.nio;

import ar.e;
import hq.c;
import hq.d;
import hq.i;
import hq.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Locale;
import org.eclipse.jetty.io.EofException;
import org.eclipse.jetty.io.nio.b;

/* JADX INFO: loaded from: classes8.dex */
public class SelectChannelEndPoint extends org.eclipse.jetty.io.nio.a implements c, i {
    public static final vq.c B = vq.b.b("org.eclipse.jetty.io.nio");
    public boolean A;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f76674k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b.d f76675l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final org.eclipse.jetty.io.nio.b f76676m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SelectionKey f76677n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f76678o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f76679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile jq.a f76680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f76681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f76682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f76683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f76684u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f76685v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f76686w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile long f76687x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f76688y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f76689z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SelectChannelEndPoint.this.E();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f76691b;

        public b(long j10) {
            this.f76691b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SelectChannelEndPoint.this.H(this.f76691b);
            } finally {
                SelectChannelEndPoint.this.J(true);
            }
        }
    }

    public SelectChannelEndPoint(SocketChannel socketChannel, b.d dVar, SelectionKey selectionKey, int i10) throws IOException {
        super(socketChannel, i10);
        this.f76674k = System.getProperty("os.name").toLowerCase(Locale.ENGLISH).contains("win");
        this.f76678o = new a();
        this.f76683t = true;
        this.f76676m = dVar.j();
        this.f76675l = dVar;
        this.f76681r = 0;
        this.f76682s = false;
        this.f76686w = true;
        this.f76677n = selectionKey;
        J(true);
    }

    public void B(long j10) {
        if (!F() || this.f76699g <= 0) {
            return;
        }
        long j11 = j10 - this.f76687x;
        if (j11 > this.f76699g) {
            J(false);
            this.f76676m.Z(new b(j11));
        }
    }

    public void C() {
        synchronized (this) {
            if (!o().isOpen()) {
                SelectionKey selectionKey = this.f76677n;
                if (selectionKey != null && selectionKey.isValid()) {
                    this.f76677n.cancel();
                }
                if (this.f76686w) {
                    this.f76686w = false;
                    this.f76675l.g(this);
                }
                this.f76677n = null;
            } else if (this.f76679p > 0) {
                SelectionKey selectionKey2 = this.f76677n;
                if (selectionKey2 != null && selectionKey2.isValid()) {
                    this.f76677n.interestOps(this.f76679p);
                } else if (((SelectableChannel) o()).isRegistered()) {
                    L();
                } else {
                    try {
                        this.f76677n = ((SelectableChannel) o()).register(this.f76675l.l(), this.f76679p, this);
                    } catch (Exception e10) {
                        B.g(e10);
                        SelectionKey selectionKey3 = this.f76677n;
                        if (selectionKey3 != null && selectionKey3.isValid()) {
                            this.f76677n.cancel();
                        }
                        if (this.f76686w) {
                            this.f76675l.g(this);
                        }
                        this.f76686w = false;
                        this.f76677n = null;
                    }
                }
            } else {
                SelectionKey selectionKey4 = this.f76677n;
                if (selectionKey4 == null || !selectionKey4.isValid()) {
                    this.f76677n = null;
                } else {
                    this.f76677n.interestOps(0);
                }
            }
        }
    }

    public b.d D() {
        return this.f76675l;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E() {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.io.nio.SelectChannelEndPoint.E():void");
    }

    public boolean F() {
        return this.f76688y;
    }

    public void G() {
        this.f76687x = System.currentTimeMillis();
    }

    public void H(long j10) {
        try {
            synchronized (this) {
                this.f76682s = true;
            }
            this.f76680q.a(j10);
            synchronized (this) {
                this.f76682s = false;
                if (this.f76681r == -1) {
                    a();
                }
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.f76682s = false;
                if (this.f76681r == -1) {
                    a();
                }
                throw th2;
            }
        }
    }

    public void I() {
        synchronized (this) {
            SelectionKey selectionKey = this.f76677n;
            if (selectionKey != null && selectionKey.isValid()) {
                boolean z10 = this.f76684u;
                if (!z10 && !this.f76685v) {
                    if ((this.f76677n.readyOps() & 4) == 4 && (this.f76677n.interestOps() & 4) == 4) {
                        int iInterestOps = this.f76677n.interestOps() & (-5);
                        this.f76679p = iInterestOps;
                        this.f76677n.interestOps(iInterestOps);
                        this.f76683t = true;
                    }
                    if (this.f76681r >= 1) {
                        this.f76677n.interestOps(0);
                    } else {
                        a();
                        if (this.f76681r >= 1 && !this.f76675l.j().A0()) {
                            this.f76677n.interestOps(0);
                        }
                    }
                    return;
                }
                if (z10 && this.f76677n.isReadable()) {
                    this.f76684u = false;
                }
                if (this.f76685v && this.f76677n.isWritable()) {
                    this.f76685v = false;
                }
                notifyAll();
                this.f76677n.interestOps(0);
                if (this.f76681r < 1) {
                    L();
                }
                return;
            }
            this.f76684u = false;
            this.f76685v = false;
            notifyAll();
        }
    }

    public void J(boolean z10) {
        if (!z10) {
            this.f76688y = false;
        } else {
            this.f76687x = System.currentTimeMillis();
            this.f76688y = true;
        }
    }

    public boolean K() {
        synchronized (this) {
            if (this.f76681r == 2) {
                this.f76681r = 1;
                return false;
            }
            this.f76681r = 0;
            L();
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006a A[Catch: all -> 0x007d, PHI: r1
      0x006a: PHI (r1v1 int) = (r1v0 int), (r1v0 int), (r1v0 int), (r1v0 int), (r1v2 int) binds: [B:4:0x000c, B:42:0x0063, B:35:0x0051, B:37:0x0057, B:39:0x005f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0012, B:9:0x0016, B:14:0x0022, B:16:0x0026, B:18:0x002a, B:23:0x0032, B:28:0x003f, B:33:0x004c, B:34:0x004f, B:36:0x0053, B:38:0x0059, B:42:0x0063, B:43:0x006a, B:46:0x006f), top: B:53:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.nio.channels.ByteChannel r0 = r6.o()     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L7d
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L6a
            boolean r0 = r6.f76684u     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L21
            int r0 = r6.f76681r     // Catch: java.lang.Throwable -> L7d
            if (r0 >= r3) goto L1f
            jq.a r0 = r6.f76680q     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L1f
            goto L21
        L1f:
            r0 = r2
            goto L22
        L21:
            r0 = r3
        L22:
            boolean r4 = r6.f76685v     // Catch: java.lang.Throwable -> L7d
            if (r4 != 0) goto L31
            int r4 = r6.f76681r     // Catch: java.lang.Throwable -> L7d
            if (r4 >= r3) goto L2f
            boolean r4 = r6.f76683t     // Catch: java.lang.Throwable -> L7d
            if (r4 != 0) goto L2f
            goto L31
        L2f:
            r4 = r2
            goto L32
        L31:
            r4 = r3
        L32:
            java.net.Socket r5 = r6.f76696d     // Catch: java.lang.Throwable -> L7d
            boolean r5 = r5.isInputShutdown()     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L3e
            if (r0 == 0) goto L3e
            r0 = r3
            goto L3f
        L3e:
            r0 = r2
        L3f:
            java.net.Socket r5 = r6.f76696d     // Catch: java.lang.Throwable -> L7d
            boolean r5 = r5.isOutputShutdown()     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L4b
            if (r4 == 0) goto L4b
            r4 = 4
            goto L4c
        L4b:
            r4 = r2
        L4c:
            r0 = r0 | r4
            r6.f76679p = r0     // Catch: java.lang.Throwable -> L7d
            java.nio.channels.SelectionKey r0 = r6.f76677n     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7d
            if (r0 == 0) goto L6a
            boolean r0 = r0.isValid()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7d
            if (r0 == 0) goto L6a
            java.nio.channels.SelectionKey r0 = r6.f76677n     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7d
            int r0 = r0.interestOps()     // Catch: java.lang.Exception -> L61 java.lang.Throwable -> L7d
            r1 = r0
            goto L6a
        L61:
            r0 = move-exception
            r4 = 0
            r6.f76677n = r4     // Catch: java.lang.Throwable -> L7d
            vq.c r4 = org.eclipse.jetty.io.nio.SelectChannelEndPoint.B     // Catch: java.lang.Throwable -> L7d
            r4.g(r0)     // Catch: java.lang.Throwable -> L7d
        L6a:
            int r0 = r6.f76679p     // Catch: java.lang.Throwable -> L7d
            if (r0 == r1) goto L6f
            r2 = r3
        L6f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L7c
            org.eclipse.jetty.io.nio.b$d r0 = r6.f76675l
            r0.c(r6)
            org.eclipse.jetty.io.nio.b$d r0 = r6.f76675l
            r0.p()
        L7c:
            return
        L7d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.io.nio.SelectChannelEndPoint.L():void");
    }

    @Override // hq.c
    public void a() {
        synchronized (this) {
            if (this.f76681r <= 0) {
                if (this.f76682s) {
                    this.f76681r = -1;
                } else {
                    this.f76681r = 1;
                    if (!this.f76676m.Z(this.f76678o)) {
                        this.f76681r = -1;
                        B.f("Dispatched Failed! " + this + " to " + this.f76676m, new Object[0]);
                        L();
                    }
                }
            }
        }
    }

    @Override // hq.c
    public void b(e.a aVar, long j10) {
        D().n(aVar, j10);
    }

    @Override // org.eclipse.jetty.io.nio.a, hq.k
    public void close() throws IOException {
        if (this.f76674k) {
            try {
                SelectionKey selectionKey = this.f76677n;
                if (selectionKey != null) {
                    selectionKey.cancel();
                }
            } catch (Throwable th2) {
                B.g(th2);
            }
        }
        try {
            try {
                super.close();
            } finally {
                L();
            }
        } catch (IOException e10) {
            B.g(e10);
        }
    }

    @Override // hq.i
    public j getConnection() {
        return this.f76680q;
    }

    @Override // org.eclipse.jetty.io.nio.a, hq.k
    public boolean i(long j10) throws IOException {
        b.d dVar;
        synchronized (this) {
            if (x()) {
                throw new EofException();
            }
            long jK = this.f76675l.k();
            long j11 = jK + j10;
            boolean zF = F();
            J(true);
            try {
                this.f76685v = true;
                while (this.f76685v && !x()) {
                    try {
                        try {
                            L();
                            wait(j10 > 0 ? j11 - jK : 10000L);
                            dVar = this.f76675l;
                        } catch (InterruptedException e10) {
                            B.e(e10);
                            if (this.f76689z) {
                                throw new InterruptedIOException(e10) { // from class: org.eclipse.jetty.io.nio.SelectChannelEndPoint.4
                                    public final /* synthetic */ InterruptedException val$e;

                                    {
                                        this.val$e = e10;
                                        initCause(e10);
                                    }
                                };
                            }
                            dVar = this.f76675l;
                        }
                        jK = dVar.k();
                        if (this.f76685v && j10 > 0 && jK >= j11) {
                            return false;
                        }
                    } catch (Throwable th2) {
                        this.f76675l.k();
                        throw th2;
                    }
                }
                return true;
            } finally {
                this.f76685v = false;
                J(zF);
            }
        }
    }

    @Override // org.eclipse.jetty.io.nio.a, hq.k
    public int j(d dVar) throws Throwable {
        int iJ = super.j(dVar);
        if (iJ > 0) {
            G();
        }
        return iJ;
    }

    @Override // org.eclipse.jetty.io.nio.a, hq.k
    public int k(d dVar) throws IOException {
        int iK = super.k(dVar);
        if (iK == 0 && dVar != null && dVar.hasContent()) {
            synchronized (this) {
                this.f76683t = false;
                if (this.f76681r < 1) {
                    L();
                }
            }
        } else if (iK > 0) {
            this.f76683t = true;
            G();
        }
        return iK;
    }

    @Override // org.eclipse.jetty.io.nio.a, hq.k
    public boolean m(long j10) throws IOException {
        b.d dVar;
        synchronized (this) {
            if (z()) {
                throw new EofException();
            }
            long jK = this.f76675l.k();
            long j11 = jK + j10;
            boolean zF = F();
            J(true);
            try {
                this.f76684u = true;
                while (!z() && this.f76684u) {
                    try {
                        try {
                            L();
                            wait(j10 > 0 ? j11 - jK : 10000L);
                            dVar = this.f76675l;
                        } catch (InterruptedException e10) {
                            B.e(e10);
                            if (this.f76689z) {
                                throw new InterruptedIOException(e10) { // from class: org.eclipse.jetty.io.nio.SelectChannelEndPoint.3
                                    public final /* synthetic */ InterruptedException val$e;

                                    {
                                        this.val$e = e10;
                                        initCause(e10);
                                    }
                                };
                            }
                            dVar = this.f76675l;
                        }
                        jK = dVar.k();
                        if (this.f76684u && j10 > 0 && jK >= j11) {
                            return false;
                        }
                    } catch (Throwable th2) {
                        this.f76675l.k();
                        throw th2;
                    }
                }
                return true;
            } finally {
                this.f76684u = false;
                J(zF);
            }
        }
    }

    @Override // hq.c
    public void n(e.a aVar) {
        D().e(aVar);
    }

    @Override // hq.c
    public boolean q() {
        return false;
    }

    @Override // org.eclipse.jetty.io.nio.a, hq.k
    public int r(d dVar, d dVar2, d dVar3) throws IOException {
        int iR = super.r(dVar, dVar2, dVar3);
        if (iR == 0 && ((dVar != null && dVar.hasContent()) || ((dVar2 != null && dVar2.hasContent()) || (dVar3 != null && dVar3.hasContent())))) {
            synchronized (this) {
                this.f76683t = false;
                if (this.f76681r < 1) {
                    L();
                }
            }
        } else if (iR > 0) {
            this.f76683t = true;
            G();
        }
        return iR;
    }

    public String toString() {
        SelectionKey selectionKey = this.f76677n;
        String str = "";
        if (selectionKey == null) {
            str = "-";
        } else if (selectionKey.isValid()) {
            if (selectionKey.isReadable()) {
                str = "r";
            }
            if (selectionKey.isWritable()) {
                str = str + "w";
            }
        } else {
            str = "!";
        }
        return String.format("SCEP@%x{l(%s)<->r(%s),s=%d,open=%b,ishut=%b,oshut=%b,rb=%b,wb=%b,w=%b,i=%d%s}-{%s}", Integer.valueOf(hashCode()), this.f76696d.getRemoteSocketAddress(), this.f76696d.getLocalSocketAddress(), Integer.valueOf(this.f76681r), Boolean.valueOf(isOpen()), Boolean.valueOf(z()), Boolean.valueOf(x()), Boolean.valueOf(this.f76684u), Boolean.valueOf(this.f76685v), Boolean.valueOf(this.f76683t), Integer.valueOf(this.f76679p), str, this.f76680q);
    }

    @Override // org.eclipse.jetty.io.nio.a, hq.k
    public void u(int i10) throws IOException {
        this.f76699g = i10;
    }

    @Override // hq.i
    public void w(j jVar) {
        jq.a aVar = this.f76680q;
        this.f76680q = (jq.a) jVar;
        if (aVar == null || aVar == this.f76680q) {
            return;
        }
        this.f76676m.x0(this, aVar);
    }

    @Override // hq.c
    public void y() {
        synchronized (this) {
            int i10 = this.f76681r;
            if (i10 == -1 || i10 == 0) {
                a();
            } else if (i10 == 1 || i10 == 2) {
                this.f76681r = 2;
            }
        }
    }
}
