package dq;

import ar.e;
import gq.k;
import gq.o;
import hq.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jetty.client.HttpDestination;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: AbstractHttpConnection.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends hq.b implements uq.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final vq.c f59919p = vq.b.a(a.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HttpDestination f59920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public org.eclipse.jetty.http.b f59921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public k f59922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f59924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hq.d f59925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f59926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile i f59927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f59928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e.a f59929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AtomicBoolean f59930o;

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class b extends e.a {
        public b() {
        }

        @Override // ar.e.a
        public void f() {
            if (a.this.f59930o.compareAndSet(true, false)) {
                a aVar = a.this;
                aVar.f59920e.t(aVar);
            }
        }
    }

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class c extends k.a {
        public c() {
        }

        @Override // gq.k.a
        public void a(hq.d dVar) throws IOException {
            i iVar = a.this.f59927l;
            if (iVar != null) {
                iVar.k().g(dVar);
            }
        }

        @Override // gq.k.a
        public void b() {
            i iVar = a.this.f59927l;
            if (iVar == null || iVar.w() || !iVar.Y(9)) {
                return;
            }
            iVar.k().f(new EofException("early EOF"));
        }

        @Override // gq.k.a
        public void c() throws IOException {
            i iVar = a.this.f59927l;
            if (iVar != null) {
                iVar.Y(6);
                if ("CONNECT".equalsIgnoreCase(iVar.l())) {
                    a.this.f59922g.d(true);
                }
            }
        }

        @Override // gq.k.a
        public void d(long j10) throws IOException {
            i iVar = a.this.f59927l;
            if (iVar != null) {
                iVar.Y(7);
            }
        }

        @Override // gq.k.a
        public void e(hq.d dVar, hq.d dVar2) throws IOException {
            i iVar = a.this.f59927l;
            if (iVar != null) {
                if (gq.i.f62809d.e(dVar) == 1) {
                    a.this.f59925j = gq.h.f62794d.g(dVar2);
                }
                iVar.k().c(dVar, dVar2);
            }
        }

        @Override // gq.k.a
        public void f(hq.d dVar, hq.d dVar2, hq.d dVar3) throws IOException {
        }

        @Override // gq.k.a
        public void g(hq.d dVar, int i10, hq.d dVar2) throws IOException {
            i iVar = a.this.f59927l;
            if (iVar == null) {
                a.f59919p.f("No exchange for response", new Object[0]);
                a.this.f63589c.close();
                return;
            }
            if (i10 == 100 || i10 == 102) {
                iVar.N(a.this.new d(iVar));
            } else if (i10 == 200 && "CONNECT".equalsIgnoreCase(iVar.l())) {
                a.this.f59922g.o(true);
            }
            a.this.f59923h = o.f62897d.equals(dVar);
            a.this.f59924i = i10;
            iVar.k().e(dVar, i10, dVar2);
            iVar.Y(5);
        }
    }

    /* JADX INFO: compiled from: AbstractHttpConnection.java */
    public class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f59933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f59934b;

        public d(i iVar) {
            this.f59933a = iVar;
            this.f59934b = iVar.k();
        }

        @Override // dq.g
        public void a(Throwable th2) {
            this.f59933a.N(this.f59934b);
            this.f59934b.a(th2);
        }

        @Override // dq.g
        public void b() {
            this.f59933a.N(this.f59934b);
            this.f59934b.b();
        }

        @Override // dq.g
        public void c(hq.d dVar, hq.d dVar2) throws IOException {
            this.f59934b.c(dVar, dVar2);
        }

        @Override // dq.g
        public void d() throws IOException {
            this.f59934b.d();
        }

        @Override // dq.g
        public void e(hq.d dVar, int i10, hq.d dVar2) throws IOException {
        }

        @Override // dq.g
        public void f(Throwable th2) {
            this.f59933a.N(this.f59934b);
            this.f59934b.f(th2);
        }

        @Override // dq.g
        public void g(hq.d dVar) throws IOException {
        }

        @Override // dq.g
        public void h() {
            this.f59933a.N(this.f59934b);
            this.f59934b.h();
        }

        @Override // dq.g
        public void i() throws IOException {
        }

        @Override // dq.g
        public void j() throws IOException {
            this.f59933a.N(this.f59934b);
            this.f59933a.Y(4);
            a.this.f59922g.reset();
        }

        @Override // dq.g
        public void onRequestComplete() throws IOException {
        }
    }

    public a(Buffers buffers, Buffers buffers2, hq.k kVar) {
        super(kVar);
        this.f59923h = true;
        this.f59929n = new b();
        this.f59930o = new AtomicBoolean(false);
        this.f59921f = new org.eclipse.jetty.http.b(buffers, kVar);
        this.f59922g = new k(buffers2, kVar, new c());
    }

    @Override // hq.j
    public boolean b() {
        return false;
    }

    public final void j() throws IOException {
        long jT = this.f59927l.t();
        if (jT <= 0) {
            jT = this.f59920e.h().K0();
        }
        long jD = this.f63589c.d();
        if (jT <= 0 || jT <= jD) {
            return;
        }
        this.f63589c.u(((int) jT) * 2);
    }

    public boolean k() {
        synchronized (this) {
            if (!this.f59930o.compareAndSet(true, false)) {
                return false;
            }
            this.f59920e.h().z0(this.f59929n);
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() throws java.io.IOException {
        /*
            r6 = this;
            dq.i r0 = r6.f59927l
            r1 = 1
            if (r0 == 0) goto L63
            boolean r2 = r0.w()
            if (r2 != 0) goto L63
            int r2 = r0.s()
            switch(r2) {
                case 6: goto L13;
                case 7: goto L63;
                case 8: goto L63;
                case 9: goto L63;
                case 10: goto L63;
                case 11: goto L63;
                default: goto L12;
            }
        L12:
            goto L24
        L13:
            hq.k r2 = r6.f63589c
            boolean r2 = r2.z()
            if (r2 == 0) goto L24
            gq.k r2 = r6.f59922g
            boolean r2 = r2.m(r1)
            if (r2 == 0) goto L24
            goto L63
        L24:
            java.lang.String r2 = r0.toString()
            hq.k r3 = r6.f63589c
            boolean r3 = r3.isOpen()
            if (r3 == 0) goto L3e
            hq.k r3 = r6.f63589c
            boolean r3 = r3.z()
            if (r3 == 0) goto L3b
            java.lang.String r3 = "half closed: "
            goto L40
        L3b:
            java.lang.String r3 = "local close: "
            goto L40
        L3e:
            java.lang.String r3 = "closed: "
        L40:
            r4 = 9
            boolean r4 = r0.Y(r4)
            if (r4 == 0) goto L63
            dq.g r0 = r0.k()
            org.eclipse.jetty.io.EofException r4 = new org.eclipse.jetty.io.EofException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            r0.f(r4)
        L63:
            hq.k r0 = r6.f63589c
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L75
            hq.k r0 = r6.f63589c
            r0.close()
            org.eclipse.jetty.client.HttpDestination r0 = r6.f59920e
            r0.s(r6, r1)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.a.l():void");
    }

    public void m() throws IOException {
        synchronized (this) {
            this.f59924i = 0;
            if (this.f59927l.s() != 2) {
                throw new IllegalStateException();
            }
            this.f59927l.Y(3);
            this.f59921f.setVersion(this.f59927l.v());
            String strL = this.f59927l.l();
            String strQ = this.f59927l.q();
            if (this.f59920e.m()) {
                if (!"CONNECT".equals(strL) && strQ.startsWith("/")) {
                    boolean zN = this.f59920e.n();
                    String strA = this.f59920e.f().a();
                    int iB = this.f59920e.f().b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(zN ? "https" : "http");
                    sb2.append("://");
                    sb2.append(strA);
                    if ((!zN || iB != 443) && (zN || iB != 80)) {
                        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                        sb2.append(iB);
                    }
                    sb2.append(strQ);
                    strQ = sb2.toString();
                }
                eq.a aVarK = this.f59920e.k();
                if (aVarK != null) {
                    aVarK.a(this.f59927l);
                }
            }
            this.f59921f.B(strL, strQ);
            this.f59922g.o("HEAD".equalsIgnoreCase(strL));
            org.eclipse.jetty.http.a aVarP = this.f59927l.p();
            if (this.f59927l.v() >= 11) {
                hq.d dVar = gq.i.f62811e;
                if (!aVarP.i(dVar)) {
                    aVarP.d(dVar, this.f59920e.g());
                }
            }
            hq.d dVarM = this.f59927l.m();
            if (dVarM != null) {
                aVarP.H("Content-Length", dVarM.length());
                this.f59921f.m(aVarP, false);
                this.f59921f.g(new m(dVarM), true);
                this.f59927l.Y(4);
            } else if (this.f59927l.o() != null) {
                this.f59921f.m(aVarP, false);
            } else {
                aVarP.J("Content-Length");
                this.f59921f.m(aVarP, true);
                this.f59927l.Y(4);
            }
        }
    }

    public void n(i iVar) {
        synchronized (this) {
            if (this.f59927l == iVar) {
                try {
                    this.f59920e.s(this, true);
                } catch (IOException e10) {
                    f59919p.g(e10);
                }
            }
        }
    }

    public boolean o() {
        return this.f59926k;
    }

    @Override // hq.j
    public void onClose() {
    }

    @Override // hq.j
    public boolean p() {
        boolean z10;
        synchronized (this) {
            z10 = this.f59927l == null;
        }
        return z10;
    }

    public void q() throws IOException {
        this.f59925j = null;
        this.f59922g.reset();
        this.f59921f.reset();
        this.f59923h = true;
    }

    public boolean r(i iVar) throws IOException {
        f59919p.h("Send {} on {}", iVar, this);
        synchronized (this) {
            if (this.f59927l != null) {
                if (this.f59928m == null) {
                    this.f59928m = iVar;
                    return true;
                }
                throw new IllegalStateException(this + " PIPELINED!!!  _exchange=" + this.f59927l);
            }
            this.f59927l = iVar;
            this.f59927l.d(this);
            if (this.f63589c.isOpen()) {
                this.f59927l.Y(2);
                j();
                return true;
            }
            this.f59927l.g();
            this.f59927l = null;
            return false;
        }
    }

    public void s(HttpDestination httpDestination) {
        this.f59920e = httpDestination;
    }

    public void t() {
        synchronized (this) {
            if (!this.f59930o.compareAndSet(false, true)) {
                throw new IllegalStateException();
            }
            this.f59920e.h().S0(this.f59929n);
        }
    }

    @Override // hq.b
    public String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = super.toString();
        HttpDestination httpDestination = this.f59920e;
        objArr[1] = httpDestination == null ? "?.?.?.?:??" : httpDestination.f();
        objArr[2] = this.f59921f;
        objArr[3] = this.f59922g;
        return String.format("%s %s g=%s p=%s", objArr);
    }

    public void u(boolean z10) {
        this.f59926k = z10;
    }

    @Override // uq.e
    public void w(Appendable appendable, String str) throws IOException {
        synchronized (this) {
            appendable.append(String.valueOf(this)).append("\n");
            uq.b.p0(appendable, str, Collections.singletonList(this.f63589c));
        }
    }
}
