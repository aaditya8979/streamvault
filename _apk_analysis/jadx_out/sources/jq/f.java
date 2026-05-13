package jq;

import ar.e;
import hq.j;
import hq.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: SslConnection.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends hq.b implements jq.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f72544u = new jq.c(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ThreadLocal<b> f72545v = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vq.c f72546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SSLEngine f72547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SSLSession f72548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public jq.a f72549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f72550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f72551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f72552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f72553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f72554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f72555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public hq.c f72556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f72557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f72558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f72559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f72560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f72561t;

    /* JADX INFO: compiled from: SslConnection.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f72563b;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            f72563b = iArr;
            try {
                iArr[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72563b[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72563b[SSLEngineResult.Status.OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72563b[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            f72562a = iArr2;
            try {
                iArr2[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f72562a[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f72562a[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f72562a[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f72562a[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: compiled from: SslConnection.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f72564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f72565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f72566c;

        public b(int i10, int i11) {
            this.f72564a = new jq.c(i10);
            this.f72565b = new jq.c(i10);
            this.f72566c = new jq.c(i11);
        }
    }

    /* JADX INFO: compiled from: SslConnection.java */
    public class c implements hq.c {
        public c() {
        }

        @Override // hq.c
        public void a() {
            f.this.f72556o.a();
        }

        @Override // hq.c
        public void b(e.a aVar, long j10) {
            f.this.f72556o.b(aVar, j10);
        }

        @Override // hq.k
        public int c() {
            return f.this.f72556o.c();
        }

        @Override // hq.k
        public void close() throws IOException {
            f.this.f72546e.h("{} ssl endp.close", f.this.f72548g);
            f.this.f63589c.close();
        }

        @Override // hq.k
        public int d() {
            return f.this.f72556o.d();
        }

        @Override // hq.k
        public String f() {
            return f.this.f72556o.f();
        }

        @Override // hq.k
        public void flush() throws IOException {
            f.this.G(null, null);
        }

        @Override // hq.k
        public boolean g() {
            return false;
        }

        @Override // hq.i
        public j getConnection() {
            return f.this.f72549h;
        }

        @Override // hq.k
        public String h() {
            return f.this.f72556o.h();
        }

        @Override // hq.k
        public boolean i(long j10) throws IOException {
            return f.this.f63589c.i(j10);
        }

        @Override // hq.k
        public boolean isOpen() {
            return f.this.f63589c.isOpen();
        }

        @Override // hq.k
        public int j(hq.d dVar) throws IOException {
            int length = dVar.length();
            f.this.G(dVar, null);
            int length2 = dVar.length() - length;
            if (length2 == 0 && z()) {
                return -1;
            }
            return length2;
        }

        @Override // hq.k
        public int k(hq.d dVar) throws IOException {
            int length = dVar.length();
            f.this.G(null, dVar);
            return length - dVar.length();
        }

        @Override // hq.k
        public void l() throws IOException {
            f.this.f72546e.h("{} ssl endp.ishut!", f.this.f72548g);
        }

        @Override // hq.k
        public boolean m(long j10) throws IOException {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = j10 > 0 ? j10 + jCurrentTimeMillis : Long.MAX_VALUE;
            while (jCurrentTimeMillis < j11 && !f.this.G(null, null)) {
                f.this.f63589c.m(j11 - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis < j11;
        }

        @Override // hq.c
        public void n(e.a aVar) {
            f.this.f72556o.n(aVar);
        }

        @Override // hq.k
        public void p() throws IOException {
            synchronized (f.this) {
                try {
                    f.this.f72546e.h("{} ssl endp.oshut {}", f.this.f72548g, this);
                    f.this.f72560s = true;
                    f.this.f72547f.closeOutbound();
                } catch (Exception e10) {
                    throw new IOException(e10);
                }
            }
            flush();
        }

        @Override // hq.c
        public boolean q() {
            return f.this.f72561t.getAndSet(false);
        }

        @Override // hq.k
        public int r(hq.d dVar, hq.d dVar2, hq.d dVar3) throws IOException {
            if (dVar != null && dVar.hasContent()) {
                return k(dVar);
            }
            if (dVar2 != null && dVar2.hasContent()) {
                return k(dVar2);
            }
            if (dVar3 == null || !dVar3.hasContent()) {
                return 0;
            }
            return k(dVar3);
        }

        @Override // hq.k
        public int s() {
            return f.this.f72556o.s();
        }

        public String toString() {
            d dVar = f.this.f72553l;
            d dVar2 = f.this.f72555n;
            d dVar3 = f.this.f72554m;
            return String.format("SSL %s i/o/u=%d/%d/%d ishut=%b oshut=%b {%s}", f.this.f72547f.getHandshakeStatus(), Integer.valueOf(dVar == null ? -1 : dVar.length()), Integer.valueOf(dVar2 == null ? -1 : dVar2.length()), Integer.valueOf(dVar3 != null ? dVar3.length() : -1), Boolean.valueOf(f.this.f72559r), Boolean.valueOf(f.this.f72560s), f.this.f72549h);
        }

        @Override // hq.k
        public void u(int i10) throws IOException {
            f.this.f72556o.u(i10);
        }

        @Override // hq.k
        public String v() {
            return f.this.f72556o.v();
        }

        @Override // hq.i
        public void w(j jVar) {
            f.this.f72549h = (jq.a) jVar;
        }

        @Override // hq.k
        public boolean x() {
            boolean z10;
            synchronized (f.this) {
                z10 = f.this.f72560s || !isOpen() || f.this.f72547f.isOutboundDone();
            }
            return z10;
        }

        @Override // hq.c
        public void y() {
            f.this.f72556o.y();
        }

        @Override // hq.k
        public boolean z() {
            boolean z10;
            synchronized (f.this) {
                z10 = f.this.f63589c.z() && (f.this.f72554m == null || !f.this.f72554m.hasContent()) && (f.this.f72553l == null || !f.this.f72553l.hasContent());
            }
            return z10;
        }
    }

    public f(SSLEngine sSLEngine, k kVar) {
        this(sSLEngine, kVar, System.currentTimeMillis());
    }

    public f(SSLEngine sSLEngine, k kVar, long j10) {
        super(kVar, j10);
        this.f72546e = vq.b.b("org.eclipse.jetty.io.nio.ssl");
        this.f72557p = true;
        this.f72561t = new AtomicBoolean();
        this.f72547f = sSLEngine;
        this.f72548g = sSLEngine.getSession();
        this.f72556o = (hq.c) kVar;
        this.f72550i = F();
    }

    public final void B() {
        synchronized (this) {
            int i10 = this.f72551j;
            this.f72551j = i10 + 1;
            if (i10 == 0 && this.f72552k == null) {
                ThreadLocal<b> threadLocal = f72545v;
                b bVar = threadLocal.get();
                this.f72552k = bVar;
                if (bVar == null) {
                    this.f72552k = new b(this.f72548g.getPacketBufferSize() * 2, this.f72548g.getApplicationBufferSize() * 2);
                }
                b bVar2 = this.f72552k;
                this.f72553l = bVar2.f72564a;
                this.f72555n = bVar2.f72565b;
                this.f72554m = bVar2.f72566c;
                threadLocal.set(null);
            }
        }
    }

    public final void C() {
        try {
            this.f72547f.closeInbound();
        } catch (SSLException e10) {
            this.f72546e.b(e10);
        }
    }

    public final ByteBuffer D(hq.d dVar) {
        return dVar.buffer() instanceof d ? ((d) dVar.buffer()).a0() : ByteBuffer.wrap(dVar.W());
    }

    public hq.c E() {
        return this.f72550i;
    }

    public c F() {
        return new c();
    }

    public final synchronized boolean G(hq.d dVar, hq.d dVar2) throws IOException {
        int iJ;
        boolean z10;
        int iK;
        hq.d dVar3 = dVar;
        hq.d dVar4 = dVar2;
        synchronized (this) {
            boolean z11 = false;
            try {
                B();
                if (dVar3 == null) {
                    this.f72554m.c0();
                    dVar3 = this.f72554m;
                } else {
                    if (dVar.e0() < this.f72548g.getApplicationBufferSize()) {
                        boolean zG = G(null, dVar4);
                        d dVar5 = this.f72554m;
                        if (dVar5 == null || !dVar5.hasContent()) {
                            H();
                            return zG;
                        }
                        d dVar6 = this.f72554m;
                        dVar6.skip(dVar3.k0(dVar6));
                        H();
                        return true;
                    }
                    d dVar7 = this.f72554m;
                    if (dVar7 != null && dVar7.hasContent()) {
                        d dVar8 = this.f72554m;
                        dVar8.skip(dVar3.k0(dVar8));
                        H();
                        return true;
                    }
                }
                if (dVar4 == null) {
                    dVar4 = f72544u;
                }
                boolean z12 = false;
                boolean z13 = true;
                while (z13) {
                    try {
                        if (this.f72553l.L() > 0) {
                            iJ = this.f63589c.j(this.f72553l);
                            z10 = iJ > 0;
                        } else {
                            iJ = 0;
                            z10 = false;
                        }
                        try {
                            try {
                                if (this.f72555n.hasContent()) {
                                    iK = this.f63589c.k(this.f72555n);
                                    if (iK > 0) {
                                        z10 = true;
                                    }
                                } else {
                                    iK = 0;
                                }
                                try {
                                    this.f72546e.h("{} {} {} filled={}/{} flushed={}/{}", this.f72548g, this, this.f72547f.getHandshakeStatus(), Integer.valueOf(iJ), Integer.valueOf(this.f72553l.length()), Integer.valueOf(iK), Integer.valueOf(this.f72555n.length()));
                                    int i10 = a.f72562a[this.f72547f.getHandshakeStatus().ordinal()];
                                    if (i10 == 1) {
                                        throw new IllegalStateException();
                                    }
                                    if (i10 != 2) {
                                        if (i10 == 3) {
                                            while (true) {
                                                Runnable delegatedTask = this.f72547f.getDelegatedTask();
                                                if (delegatedTask == null) {
                                                    break;
                                                }
                                                delegatedTask.run();
                                                z10 = true;
                                            }
                                        } else if (i10 != 4) {
                                            if (i10 == 5) {
                                                if (this.f72558q && !this.f72557p) {
                                                    this.f63589c.close();
                                                } else if (!this.f72553l.hasContent() && iJ == -1) {
                                                    this.f63589c.l();
                                                } else if (I(dVar3)) {
                                                    z13 = true;
                                                }
                                            }
                                        } else if (this.f72558q && !this.f72557p) {
                                            this.f63589c.close();
                                        } else if (J(dVar4)) {
                                            z13 = true;
                                        }
                                        z13 = z10;
                                    } else {
                                        if (dVar3.L() > 0 && this.f72553l.hasContent() && I(dVar3)) {
                                            z10 = true;
                                        }
                                        if (dVar4.hasContent() && this.f72555n.L() > 0 && J(dVar4)) {
                                            z13 = true;
                                        }
                                        z13 = z10;
                                    }
                                    if (this.f63589c.isOpen() && this.f63589c.z() && !this.f72553l.hasContent()) {
                                        C();
                                    }
                                    if (this.f63589c.isOpen() && this.f72547f.isOutboundDone() && !this.f72555n.hasContent()) {
                                        this.f63589c.p();
                                    }
                                    z12 |= z13;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z11 = z12;
                                    H();
                                    if (z11) {
                                        this.f72561t.set(true);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                this.f72546e.h("{} {} {} filled={}/{} flushed={}/{}", this.f72548g, this, this.f72547f.getHandshakeStatus(), Integer.valueOf(iJ), Integer.valueOf(this.f72553l.length()), 0, Integer.valueOf(this.f72555n.length()));
                                throw th;
                            }
                        } catch (IOException e10) {
                            e = e10;
                            this.f63589c.close();
                            throw e;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        iJ = 0;
                    } catch (Throwable th4) {
                        th = th4;
                        iJ = 0;
                        this.f72546e.h("{} {} {} filled={}/{} flushed={}/{}", this.f72548g, this, this.f72547f.getHandshakeStatus(), Integer.valueOf(iJ), Integer.valueOf(this.f72553l.length()), 0, Integer.valueOf(this.f72555n.length()));
                        throw th;
                    }
                }
                d dVar9 = this.f72554m;
                if (dVar3 == dVar9 && dVar9.hasContent() && !this.f72549h.b()) {
                    this.f72556o.a();
                }
                H();
                if (z12) {
                    this.f72561t.set(true);
                }
                return z12;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void H() {
        synchronized (this) {
            int i10 = this.f72551j - 1;
            this.f72551j = i10;
            if (i10 == 0 && this.f72552k != null && this.f72553l.length() == 0 && this.f72555n.length() == 0 && this.f72554m.length() == 0) {
                this.f72553l = null;
                this.f72555n = null;
                this.f72554m = null;
                f72545v.set(this.f72552k);
                this.f72552k = null;
            }
        }
    }

    public final synchronized boolean I(hq.d dVar) throws IOException {
        SSLEngineResult sSLEngineResultUnwrap;
        int iPosition;
        int iPosition2;
        int i10 = 0;
        int i11 = 0;
        if (!this.f72553l.hasContent()) {
            return false;
        }
        ByteBuffer byteBufferD = D(dVar);
        synchronized (byteBufferD) {
            ByteBuffer byteBufferA0 = this.f72553l.a0();
            synchronized (byteBufferA0) {
                try {
                    try {
                        try {
                            try {
                                byteBufferD.position(dVar.T());
                                byteBufferD.limit(dVar.e0());
                                int iPosition3 = byteBufferD.position();
                                byteBufferA0.position(this.f72553l.getIndex());
                                byteBufferA0.limit(this.f72553l.T());
                                int iPosition4 = byteBufferA0.position();
                                sSLEngineResultUnwrap = this.f72547f.unwrap(byteBufferA0, byteBufferD);
                                if (this.f72546e.isDebugEnabled()) {
                                    this.f72546e.h("{} unwrap {} {} consumed={} produced={}", this.f72548g, sSLEngineResultUnwrap.getStatus(), sSLEngineResultUnwrap.getHandshakeStatus(), Integer.valueOf(sSLEngineResultUnwrap.bytesConsumed()), Integer.valueOf(sSLEngineResultUnwrap.bytesProduced()));
                                }
                                iPosition = byteBufferA0.position() - iPosition4;
                                this.f72553l.skip(iPosition);
                                this.f72553l.c0();
                                iPosition2 = byteBufferD.position() - iPosition3;
                                dVar.X(dVar.T() + iPosition2);
                            } catch (Exception e10) {
                                throw new IOException(e10);
                            }
                        } catch (IOException e11) {
                            throw e11;
                        }
                    } catch (SSLException e12) {
                        this.f72546e.debug(String.valueOf(this.f63589c), e12);
                        this.f63589c.close();
                        throw e12;
                    }
                } finally {
                    byteBufferA0.position(0);
                    byteBufferA0.limit(byteBufferA0.capacity());
                    byteBufferD.position(0);
                    byteBufferD.limit(byteBufferD.capacity());
                }
            }
        }
        int i12 = a.f72563b[sSLEngineResultUnwrap.getStatus().ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        this.f72546e.h("{} wrap default {}", this.f72548g, sSLEngineResultUnwrap);
                        throw new IOException(sSLEngineResultUnwrap.toString());
                    }
                    this.f72546e.h("unwrap CLOSE {} {}", this, sSLEngineResultUnwrap);
                    if (sSLEngineResultUnwrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                        this.f63589c.close();
                    }
                } else if (sSLEngineResultUnwrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    this.f72558q = true;
                }
            } else if (this.f72546e.isDebugEnabled()) {
                this.f72546e.h("{} unwrap {} {}->{}", this.f72548g, sSLEngineResultUnwrap.getStatus(), this.f72553l.O(), dVar.O());
            }
        } else if (this.f63589c.z()) {
            this.f72553l.clear();
        }
        return iPosition > 0 || iPosition2 > 0;
    }

    public final synchronized boolean J(hq.d dVar) throws IOException {
        SSLEngineResult sSLEngineResultWrap;
        int iPosition;
        int iPosition2;
        ByteBuffer byteBufferD = D(dVar);
        synchronized (byteBufferD) {
            this.f72555n.c0();
            ByteBuffer byteBufferA0 = this.f72555n.a0();
            synchronized (byteBufferA0) {
                int i10 = 0;
                int i11 = 0;
                try {
                    try {
                        try {
                            byteBufferD.position(dVar.getIndex());
                            byteBufferD.limit(dVar.T());
                            int iPosition3 = byteBufferD.position();
                            byteBufferA0.position(this.f72555n.T());
                            byteBufferA0.limit(byteBufferA0.capacity());
                            int iPosition4 = byteBufferA0.position();
                            sSLEngineResultWrap = this.f72547f.wrap(byteBufferD, byteBufferA0);
                            if (this.f72546e.isDebugEnabled()) {
                                this.f72546e.h("{} wrap {} {} consumed={} produced={}", this.f72548g, sSLEngineResultWrap.getStatus(), sSLEngineResultWrap.getHandshakeStatus(), Integer.valueOf(sSLEngineResultWrap.bytesConsumed()), Integer.valueOf(sSLEngineResultWrap.bytesProduced()));
                            }
                            iPosition = byteBufferD.position() - iPosition3;
                            dVar.skip(iPosition);
                            iPosition2 = byteBufferA0.position() - iPosition4;
                            d dVar2 = this.f72555n;
                            dVar2.X(dVar2.T() + iPosition2);
                        } catch (SSLException e10) {
                            this.f72546e.debug(String.valueOf(this.f63589c), e10);
                            this.f63589c.close();
                            throw e10;
                        }
                    } catch (IOException e11) {
                        throw e11;
                    } catch (Exception e12) {
                        throw new IOException(e12);
                    }
                } finally {
                    byteBufferA0.position(0);
                    byteBufferA0.limit(byteBufferA0.capacity());
                    byteBufferD.position(0);
                    byteBufferD.limit(byteBufferD.capacity());
                }
            }
        }
        int i12 = a.f72563b[sSLEngineResultWrap.getStatus().ordinal()];
        if (i12 == 1) {
            throw new IllegalStateException();
        }
        if (i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    this.f72546e.h("{} wrap default {}", this.f72548g, sSLEngineResultWrap);
                    throw new IOException(sSLEngineResultWrap.toString());
                }
                this.f72546e.h("wrap CLOSE {} {}", this, sSLEngineResultWrap);
                if (sSLEngineResultWrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                    this.f63589c.close();
                }
            } else if (sSLEngineResultWrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.FINISHED) {
                this.f72558q = true;
            }
        }
        return iPosition > 0 || iPosition2 > 0;
    }

    @Override // hq.b, hq.j
    public void a(long j10) {
        try {
            this.f72546e.h("onIdleExpired {}ms on {}", Long.valueOf(j10), this);
            if (this.f63589c.x()) {
                this.f72550i.close();
            } else {
                this.f72550i.p();
            }
        } catch (IOException e10) {
            this.f72546e.e(e10);
            super.a(j10);
        }
    }

    @Override // hq.j
    public boolean b() {
        return false;
    }

    @Override // jq.a
    public void c() throws IOException {
    }

    @Override // hq.j
    public j e() throws IOException {
        try {
            B();
            boolean zG = true;
            while (zG) {
                zG = this.f72547f.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING ? G(null, null) : false;
                jq.a aVar = (jq.a) this.f72549h.e();
                if (aVar != this.f72549h && aVar != null) {
                    this.f72549h = aVar;
                    zG = true;
                }
                this.f72546e.h("{} handle {} progress={}", this.f72548g, this, Boolean.valueOf(zG));
            }
            return this;
        } finally {
            H();
            if (!this.f72559r && this.f72550i.z() && this.f72550i.isOpen()) {
                this.f72559r = true;
                try {
                    this.f72549h.c();
                } catch (Throwable th2) {
                    this.f72546e.d("onInputShutdown failed", th2);
                    try {
                        this.f72550i.close();
                    } catch (IOException e10) {
                        this.f72546e.g(e10);
                    }
                }
            }
        }
    }

    @Override // hq.j
    public void onClose() {
        j connection = this.f72550i.getConnection();
        if (connection == null || connection == this) {
            return;
        }
        connection.onClose();
    }

    @Override // hq.j
    public boolean p() {
        return false;
    }

    @Override // hq.b
    public String toString() {
        return String.format("%s %s", super.toString(), this.f72550i);
    }
}
