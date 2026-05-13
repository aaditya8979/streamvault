package mq;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.Z7;
import gq.k;
import hq.e;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: AbstractHttpConnection.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class b extends hq.b {
    public static final vq.c C = vq.b.a(b.class);
    public static final ThreadLocal<b> D = new ThreadLocal<>();
    public boolean A;
    public boolean B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f74863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f74864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gq.n f74865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gq.q f74866i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final org.eclipse.jetty.http.a f74867j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f74868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile zm.m f74869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gq.c f74870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final org.eclipse.jetty.http.a f74871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o f74872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile C0890b f74873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile c f74874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile PrintWriter f74875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f74876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f74877t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f74878u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f74879v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f74880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f74881x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f74882y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f74883z;

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class a extends PrintWriter {
        public a(Writer writer) {
            super(writer);
        }

        @Override // java.io.PrintWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (((PrintWriter) this).lock) {
                try {
                    ((PrintWriter) this).out.close();
                } catch (IOException unused) {
                    setError();
                }
            }
        }
    }

    /* JADX INFO: renamed from: mq.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class C0890b extends l {
        public C0890b() {
            super(b.this);
        }

        @Override // zm.n
        public void b(String str) throws IOException {
            if (isClosed()) {
                throw new IOException("Closed");
            }
            b.this.v(null).print(str);
        }

        @Override // mq.l, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (isClosed()) {
                return;
            }
            if (b.this.J() || this.f74929d.b()) {
                b.this.m();
            } else {
                b.this.i(true);
            }
            super.close();
        }

        @Override // mq.l, java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            if (!this.f74929d.b()) {
                b.this.i(false);
            }
            super.flush();
        }

        public void l(Object obj) throws IOException {
            boolean z10;
            if (isClosed()) {
                throw new IOException("Closed");
            }
            if (this.f74929d.z()) {
                throw new IllegalStateException("!empty");
            }
            wq.e eVar = null;
            if (obj instanceof gq.f) {
                gq.f fVar = (gq.f) obj;
                hq.d contentType = fVar.getContentType();
                if (contentType != null) {
                    org.eclipse.jetty.http.a aVar = b.this.f74871n;
                    hq.d dVar = gq.i.f62841z;
                    if (!aVar.i(dVar)) {
                        String strV = b.this.f74872o.v();
                        if (strV == null) {
                            b.this.f74871n.d(dVar, contentType);
                        } else if (contentType instanceof e.a) {
                            e.a aVarD = ((e.a) contentType).d(strV);
                            if (aVarD != null) {
                                b.this.f74871n.B(dVar, aVarD);
                            } else {
                                b.this.f74871n.C(dVar, contentType + ";charset=" + sq.m.c(strV, ";= "));
                            }
                        } else {
                            b.this.f74871n.C(dVar, contentType + ";charset=" + sq.m.c(strV, ";= "));
                        }
                    }
                }
                if (fVar.d() > 0) {
                    b.this.f74871n.G(gq.i.f62821j, fVar.d());
                }
                hq.d lastModified = fVar.getLastModified();
                long jD = fVar.getResource().d();
                if (lastModified != null) {
                    b.this.f74871n.B(gq.i.B, lastModified);
                } else if (fVar.getResource() != null && jD != -1) {
                    b.this.f74871n.E(gq.i.B, jD);
                }
                hq.d eTag = fVar.getETag();
                if (eTag != null) {
                    b.this.f74871n.B(gq.i.Z, eTag);
                }
                f fVar2 = b.this.f74863f;
                if ((fVar2 instanceof pq.a) && ((pq.a) fVar2).a()) {
                    f fVar3 = b.this.f74863f;
                    z10 = true;
                } else {
                    z10 = false;
                }
                hq.d dVarE = z10 ? fVar.e() : fVar.c();
                obj = dVarE == null ? fVar.b() : dVarE;
            } else if (obj instanceof wq.e) {
                eVar = (wq.e) obj;
                b.this.f74871n.E(gq.i.B, eVar.d());
                obj = eVar.c();
            }
            if (obj instanceof hq.d) {
                this.f74929d.g((hq.d) obj, true);
                b.this.i(true);
                return;
            }
            if (!(obj instanceof InputStream)) {
                throw new IllegalArgumentException("unknown content type?");
            }
            InputStream inputStream = (InputStream) obj;
            try {
                int iK = this.f74929d.u().K(inputStream, this.f74929d.A());
                while (iK >= 0 && !b.this.f63589c.x()) {
                    this.f74929d.r();
                    b.this.f74873p.flush();
                    iK = this.f74929d.u().K(inputStream, this.f74929d.A());
                }
                this.f74929d.r();
                b.this.f74873p.flush();
                if (eVar != null) {
                    eVar.i();
                } else {
                    inputStream.close();
                }
            } catch (Throwable th2) {
                if (eVar != null) {
                    eVar.i();
                } else {
                    inputStream.close();
                }
                throw th2;
            }
        }

        public void m(hq.d dVar) throws IOException {
            ((org.eclipse.jetty.http.b) this.f74929d).H(dVar);
        }
    }

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class c extends m {
        public c() {
            super(b.this.f74873p);
        }
    }

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class d extends k.a {
        public d() {
        }

        public /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        @Override // gq.k.a
        public void a(hq.d dVar) throws Throwable {
            b.this.k(dVar);
        }

        @Override // gq.k.a
        public void b() {
            b.this.l();
        }

        @Override // gq.k.a
        public void c() throws Throwable {
            b.this.F();
        }

        @Override // gq.k.a
        public void d(long j10) throws Throwable {
            b.this.L(j10);
        }

        @Override // gq.k.a
        public void e(hq.d dVar, hq.d dVar2) throws IOException {
            b.this.O(dVar, dVar2);
        }

        @Override // gq.k.a
        public void f(hq.d dVar, hq.d dVar2, hq.d dVar3) throws IOException {
            b.this.R(dVar, dVar2, dVar3);
        }

        @Override // gq.k.a
        public void g(hq.d dVar, int i10, hq.d dVar2) {
            if (b.C.isDebugEnabled()) {
                b.C.h("Bad request!: " + dVar + Z7.f30794r + i10 + Z7.f30794r + dVar2, new Object[0]);
            }
        }
    }

    public b(f fVar, hq.k kVar, p pVar) {
        super(kVar);
        this.f74877t = -2;
        this.f74879v = false;
        this.f74880w = false;
        this.f74881x = false;
        this.f74882y = false;
        this.f74883z = false;
        this.A = false;
        this.B = false;
        String str = sq.q.f84560b;
        this.f74865h = "UTF-8".equals(str) ? new gq.n() : new gq.b(str);
        this.f74863f = fVar;
        gq.d dVar = (gq.d) fVar;
        this.f74866i = N(dVar.L(), kVar, new d(this, null));
        this.f74867j = new org.eclipse.jetty.http.a();
        this.f74871n = new org.eclipse.jetty.http.a();
        this.f74868k = new n(this);
        this.f74872o = new o(this);
        org.eclipse.jetty.http.b bVarM = M(dVar.W(), kVar);
        this.f74870m = bVarM;
        bVarM.i(pVar.G0());
        this.f74864g = pVar;
    }

    public static void Q(b bVar) {
        D.set(bVar);
    }

    public static b o() {
        return D.get();
    }

    public boolean A() {
        return this.f74863f.n();
    }

    public o B() {
        return this.f74872o;
    }

    public org.eclipse.jetty.http.a C() {
        return this.f74871n;
    }

    public p D() {
        return this.f74864g;
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x036c A[Catch: all -> 0x0375, TryCatch #7 {all -> 0x0375, blocks: (B:201:0x034a, B:203:0x0352, B:204:0x035b, B:206:0x036c, B:208:0x0372, B:209:0x0374), top: B:281:0x034a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x034a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[ADDED_TO_REGION, Catch: all -> 0x0375, REMOVE, SYNTHETIC, TRY_LEAVE, TryCatch #7 {all -> 0x0375, blocks: (B:201:0x034a, B:203:0x0352, B:204:0x035b, B:206:0x036c, B:208:0x0372, B:209:0x0374), top: B:281:0x034a }] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.b.E():void");
    }

    public void F() throws Throwable {
        if (this.f63589c.x()) {
            this.f63589c.close();
            return;
        }
        this.f74862e++;
        this.f74870m.setVersion(this.f74877t);
        int i10 = this.f74877t;
        if (i10 == 10) {
            this.f74870m.h(this.f74882y);
            if (this.f74866i.e()) {
                this.f74871n.d(gq.i.f62823k, gq.h.f62799i);
                this.f74870m.d(true);
            } else if ("CONNECT".equals(this.f74868k.getMethod())) {
                this.f74870m.d(true);
                this.f74866i.d(true);
                gq.q qVar = this.f74866i;
                if (qVar instanceof gq.k) {
                    ((gq.k) qVar).q(0);
                }
            }
            if (this.f74864g.F0()) {
                this.f74870m.j(this.f74868k.U());
            }
        } else if (i10 == 11) {
            this.f74870m.h(this.f74882y);
            if (!this.f74866i.e()) {
                this.f74871n.d(gq.i.f62823k, gq.h.f62795e);
                this.f74870m.d(false);
            }
            if (this.f74864g.F0()) {
                this.f74870m.j(this.f74868k.U());
            }
            if (!this.f74883z) {
                C.h("!host {}", this);
                this.f74870m.f(400, null);
                this.f74871n.B(gq.i.f62823k, gq.h.f62795e);
                this.f74870m.m(this.f74871n, true);
                this.f74870m.complete();
                return;
            }
            if (this.f74879v) {
                C.h("!expectation {}", this);
                this.f74870m.f(TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, null);
                this.f74871n.B(gq.i.f62823k, gq.h.f62795e);
                this.f74870m.m(this.f74871n, true);
                this.f74870m.complete();
                return;
            }
        }
        String str = this.f74878u;
        if (str != null) {
            this.f74868k.h0(str);
        }
        if ((((gq.k) this.f74866i).h() > 0 || ((gq.k) this.f74866i).k()) && !this.f74880w) {
            this.A = true;
        } else {
            E();
        }
    }

    public boolean G(n nVar) {
        f fVar = this.f74863f;
        return fVar != null && fVar.C(nVar);
    }

    public boolean H() {
        return this.B;
    }

    public boolean I() {
        return this.f74881x;
    }

    public boolean J() {
        return this.f74876s > 0;
    }

    public boolean K() {
        return this.f74870m.b();
    }

    public void L(long j10) throws Throwable {
        if (this.A) {
            this.A = false;
            E();
        }
    }

    public org.eclipse.jetty.http.b M(Buffers buffers, hq.k kVar) {
        return new org.eclipse.jetty.http.b(buffers, kVar);
    }

    public gq.k N(Buffers buffers, hq.k kVar, k.a aVar) {
        return new gq.k(buffers, kVar, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O(hq.d r8, hq.d r9) throws java.io.IOException {
        /*
            r7 = this;
            gq.i r0 = gq.i.f62809d
            int r0 = r0.e(r8)
            r1 = 16
            if (r0 == r1) goto L88
            r1 = 21
            if (r0 == r1) goto L81
            r1 = 24
            r2 = 1
            if (r0 == r1) goto L21
            r1 = 27
            if (r0 == r1) goto L1d
            r1 = 40
            if (r0 == r1) goto L81
            goto L94
        L1d:
            r7.f74883z = r2
            goto L94
        L21:
            int r0 = r7.f74877t
            r1 = 11
            if (r0 < r1) goto L94
            gq.h r0 = gq.h.f62794d
            hq.d r9 = r0.g(r9)
            int r0 = r0.e(r9)
            r1 = 6
            if (r0 == r1) goto L7a
            r3 = 7
            if (r0 == r3) goto L73
            java.lang.String r0 = r9.toString()
            java.lang.String r4 = ","
            java.lang.String[] r0 = r0.split(r4)
            r4 = 0
        L42:
            if (r0 == 0) goto L94
            int r5 = r0.length
            if (r4 >= r5) goto L94
            gq.h r5 = gq.h.f62794d
            r6 = r0[r4]
            java.lang.String r6 = r6.trim()
            hq.e$a r5 = r5.c(r6)
            if (r5 != 0) goto L58
            r7.f74879v = r2
            goto L70
        L58:
            int r5 = r5.e()
            if (r5 == r1) goto L6a
            if (r5 == r3) goto L63
            r7.f74879v = r2
            goto L70
        L63:
            gq.c r5 = r7.f74870m
            boolean r5 = r5 instanceof org.eclipse.jetty.http.b
            r7.f74881x = r5
            goto L70
        L6a:
            gq.c r5 = r7.f74870m
            boolean r5 = r5 instanceof org.eclipse.jetty.http.b
            r7.f74880w = r5
        L70:
            int r4 = r4 + 1
            goto L42
        L73:
            gq.c r0 = r7.f74870m
            boolean r0 = r0 instanceof org.eclipse.jetty.http.b
            r7.f74881x = r0
            goto L94
        L7a:
            gq.c r0 = r7.f74870m
            boolean r0 = r0 instanceof org.eclipse.jetty.http.b
            r7.f74880w = r0
            goto L94
        L81:
            gq.h r0 = gq.h.f62794d
            hq.d r9 = r0.g(r9)
            goto L94
        L88:
            hq.e r0 = gq.p.f62900c
            hq.d r9 = r0.g(r9)
            java.lang.String r0 = gq.p.a(r9)
            r7.f74878u = r0
        L94:
            org.eclipse.jetty.http.a r0 = r7.f74867j
            r0.d(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.b.O(hq.d, hq.d):void");
    }

    public void P() {
        this.f74866i.reset();
        this.f74866i.a();
        this.f74867j.h();
        this.f74868k.b0();
        this.f74870m.reset();
        this.f74870m.a();
        this.f74871n.h();
        this.f74872o.y();
        this.f74865h.a();
        this.f74874q = null;
        this.B = false;
    }

    public void R(hq.d dVar, hq.d dVar2, hq.d dVar3) throws IOException {
        hq.d dVarM0 = dVar2.m0();
        this.f74883z = false;
        this.f74879v = false;
        this.f74880w = false;
        this.f74881x = false;
        this.A = false;
        this.f74878u = null;
        if (this.f74868k.T() == 0) {
            this.f74868k.E0(System.currentTimeMillis());
        }
        this.f74868k.n0(dVar.toString());
        try {
            this.f74882y = false;
            int iE = gq.j.f62842a.e(dVar);
            if (iE == 3) {
                this.f74882y = true;
                this.f74865h.p(dVarM0.W(), dVarM0.getIndex(), dVarM0.length());
            } else if (iE != 8) {
                this.f74865h.p(dVarM0.W(), dVarM0.getIndex(), dVarM0.length());
            } else {
                this.f74865h.r(dVarM0.W(), dVarM0.getIndex(), dVarM0.length());
            }
            this.f74868k.F0(this.f74865h);
            if (dVar3 == null) {
                this.f74868k.q0("");
                this.f74877t = 9;
                return;
            }
            hq.e eVar = gq.o.f62894a;
            e.a aVarB = eVar.b(dVar3);
            if (aVarB == null) {
                throw new HttpException(400, null);
            }
            int iE2 = eVar.e(aVarB);
            this.f74877t = iE2;
            if (iE2 <= 0) {
                this.f74877t = 10;
            }
            this.f74868k.q0(aVarB.toString());
        } catch (Exception e10) {
            C.b(e10);
            if (!(e10 instanceof HttpException)) {
                throw new HttpException(400, null, e10);
            }
            throw ((HttpException) e10);
        }
    }

    public void i(boolean z10) throws IOException {
        if (!this.f74870m.b()) {
            this.f74870m.f(this.f74872o.w(), this.f74872o.u());
            try {
                if (this.f74880w && this.f74872o.w() != 100) {
                    this.f74870m.d(false);
                }
                this.f74870m.m(this.f74871n, z10);
            } catch (RuntimeException e10) {
                C.f("header full: " + e10, new Object[0]);
                this.f74872o.z();
                this.f74870m.reset();
                this.f74870m.f(500, null);
                this.f74870m.m(this.f74871n, true);
                this.f74870m.complete();
                throw new HttpException(500);
            }
        }
        if (z10) {
            this.f74870m.complete();
        }
    }

    public void j() throws IOException {
        if (!this.f74870m.b()) {
            this.f74870m.f(this.f74872o.w(), this.f74872o.u());
            try {
                this.f74870m.m(this.f74871n, true);
            } catch (RuntimeException e10) {
                vq.c cVar = C;
                cVar.f("header full: " + e10, new Object[0]);
                cVar.b(e10);
                this.f74872o.z();
                this.f74870m.reset();
                this.f74870m.f(500, null);
                this.f74870m.m(this.f74871n, true);
                this.f74870m.complete();
                throw new HttpException(500);
            }
        }
        this.f74870m.complete();
    }

    public void k(hq.d dVar) throws Throwable {
        if (this.A) {
            this.A = false;
            E();
        }
    }

    public void l() {
        this.B = true;
    }

    public void m() throws IOException {
        try {
            i(false);
            this.f74870m.l();
        } catch (IOException e10) {
            if (!(e10 instanceof EofException)) {
                throw new EofException(e10);
            }
        }
    }

    public f n() {
        return this.f74863f;
    }

    @Override // hq.j
    public void onClose() {
        C.h("closed {}", this);
    }

    @Override // hq.j
    public boolean p() {
        return this.f74870m.p() && (this.f74866i.p() || this.A);
    }

    public gq.c q() {
        return this.f74870m;
    }

    public zm.m r() throws IOException {
        if (this.f74880w) {
            if (((gq.k) this.f74866i).i() == null || ((gq.k) this.f74866i).i().length() < 2) {
                if (this.f74870m.b()) {
                    throw new IllegalStateException("Committed before 100 Continues");
                }
                ((org.eclipse.jetty.http.b) this.f74870m).G(100);
            }
            this.f74880w = false;
        }
        if (this.f74869l == null) {
            this.f74869l = new k(this);
        }
        return this.f74869l;
    }

    public int s() {
        return (this.f74863f.E() && this.f63589c.d() == this.f74863f.d()) ? this.f74863f.P() : this.f63589c.d() > 0 ? this.f63589c.d() : this.f74863f.d();
    }

    public zm.n t() {
        if (this.f74873p == null) {
            this.f74873p = new C0890b();
        }
        return this.f74873p;
    }

    @Override // hq.b
    public String toString() {
        return String.format("%s,g=%s,p=%s,r=%d", super.toString(), this.f74870m, this.f74866i, Integer.valueOf(this.f74862e));
    }

    public gq.q u() {
        return this.f74866i;
    }

    public PrintWriter v(String str) {
        t();
        if (this.f74874q == null) {
            this.f74874q = new c();
            if (this.f74864g.P0()) {
                this.f74875r = new hq.l(this.f74874q);
            } else {
                this.f74875r = new a(this.f74874q);
            }
        }
        this.f74874q.e(str);
        return this.f74875r;
    }

    public n x() {
        return this.f74868k;
    }

    public org.eclipse.jetty.http.a y() {
        return this.f74867j;
    }

    public int z() {
        return this.f74862e;
    }
}
