package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.http2.g;
import com.mbridge.msdk.thrid.okhttp.j;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.l;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: RealConnection.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends g.j implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f40346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f40347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Socket f40348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Socket f40349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q f40350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w f40351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http2.g f40352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.e f40353i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okio.d f40354j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40355k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f40356l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40357m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<Reference<g>> f40358n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f40359o = Long.MAX_VALUE;

    public c(i iVar, c0 c0Var) {
        this.f40346b = iVar;
        this.f40347c = c0Var;
    }

    private y a(int i10, int i11, y yVar, s sVar) throws IOException {
        String str = "CONNECT " + com.mbridge.msdk.thrid.okhttp.internal.c.a(sVar, true) + " HTTP/1.1";
        while (true) {
            com.mbridge.msdk.thrid.okhttp.internal.http1.a aVar = new com.mbridge.msdk.thrid.okhttp.internal.http1.a(null, null, this.f40353i, this.f40354j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f40353i.b().a(i10, timeUnit);
            this.f40354j.b().a(i11, timeUnit);
            aVar.a(yVar.c(), str);
            aVar.a();
            a0 a0VarA = aVar.a(false).a(yVar).a();
            long jA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a0VarA);
            if (jA == -1) {
                jA = 0;
            }
            com.mbridge.msdk.thrid.okio.s sVarB = aVar.b(jA);
            com.mbridge.msdk.thrid.okhttp.internal.c.b(sVarB, Integer.MAX_VALUE, timeUnit);
            sVarB.close();
            int iK = a0VarA.k();
            if (iK == 200) {
                if (this.f40353i.a().f() && this.f40354j.a().f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iK != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + a0VarA.k());
            }
            y yVarA = this.f40347c.a().g().a(this.f40347c, a0VarA);
            if (yVarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(a0VarA.b("Connection"))) {
                return yVarA;
            }
            yVar = yVarA;
        }
    }

    private void a(int i10) throws IOException {
        this.f40349e.setSoTimeout(0);
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVarA = new g.h(true).a(this.f40349e, this.f40347c.a().k().g(), this.f40353i, this.f40354j).a(this).a(i10).a();
        this.f40352h = gVarA;
        gVarA.m();
    }

    private void a(int i10, int i11, int i12, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        y yVarE = e();
        s sVarG = yVarE.g();
        for (int i13 = 0; i13 < 21; i13++) {
            a(i10, i11, dVar, oVar);
            yVarE = a(i11, i12, yVarE, sVarG);
            if (yVarE == null) {
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40348d);
            this.f40348d = null;
            this.f40354j = null;
            this.f40353i = null;
            oVar.connectEnd(dVar, this.f40347c.d(), this.f40347c.b(), null);
        }
    }

    private void a(int i10, int i11, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        Proxy proxyB = this.f40347c.b();
        this.f40348d = (proxyB.type() == Proxy.Type.DIRECT || proxyB.type() == Proxy.Type.HTTP) ? this.f40347c.a().i().createSocket() : new Socket(proxyB);
        oVar.connectStart(dVar, this.f40347c.d(), proxyB);
        this.f40348d.setSoTimeout(i11);
        try {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f40348d, this.f40347c.d(), i10);
            try {
                this.f40353i = l.a(l.b(this.f40348d));
                this.f40354j = l.a(l.a(this.f40348d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f40347c.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private void a(b bVar) throws Throwable {
        SSLSocket sSLSocket;
        com.mbridge.msdk.thrid.okhttp.a aVarA = this.f40347c.a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) aVarA.j().createSocket(this.f40348d, aVarA.k().g(), aVarA.k().j(), true);
            } catch (AssertionError e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            j jVarA = bVar.a(sSLSocket);
            if (jVarA.c()) {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket, aVarA.k().g(), aVarA.e());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            q qVarA = q.a(session);
            if (aVarA.d().verify(aVarA.k().g(), session)) {
                aVarA.a().a(aVarA.k().g(), qVarA.b());
                String strB = jVarA.c() ? com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(sSLSocket) : null;
                this.f40349e = sSLSocket;
                this.f40353i = l.a(l.b(sSLSocket));
                this.f40354j = l.a(l.a(this.f40349e));
                this.f40350f = qVarA;
                this.f40351g = strB != null ? w.a(strB) : w.HTTP_1_1;
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket);
                return;
            }
            List<Certificate> listB = qVarA.b();
            if (listB.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) listB.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + aVarA.k().g() + " not verified:\n    certificate: " + com.mbridge.msdk.thrid.okhttp.f.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.mbridge.msdk.thrid.okhttp.internal.tls.d.a(x509Certificate));
        } catch (AssertionError e11) {
            e = e11;
            if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2);
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a((Socket) sSLSocket2);
            throw th;
        }
    }

    private void a(b bVar, int i10, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws Throwable {
        if (this.f40347c.a().j() != null) {
            oVar.secureConnectStart(dVar);
            a(bVar);
            oVar.secureConnectEnd(dVar, this.f40350f);
            if (this.f40351g == w.HTTP_2) {
                a(i10);
                return;
            }
            return;
        }
        List<w> listE = this.f40347c.a().e();
        w wVar = w.H2_PRIOR_KNOWLEDGE;
        if (!listE.contains(wVar)) {
            this.f40349e = this.f40348d;
            this.f40351g = w.HTTP_1_1;
        } else {
            this.f40349e = this.f40348d;
            this.f40351g = wVar;
            a(i10);
        }
    }

    private y e() throws IOException {
        y yVarA = new y.a().a(this.f40347c.a().k()).a("CONNECT", (z) null).b("Host", com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40347c.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", com.mbridge.msdk.thrid.okhttp.internal.d.a()).a();
        y yVarA2 = this.f40347c.a().g().a(this.f40347c, new a0.a().a(yVarA).a(w.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.mbridge.msdk.thrid.okhttp.internal.c.f40308c).b(-1L).a(-1L).b("Proxy-Authenticate", "OkHttp-Preemptive").a());
        return yVarA2 != null ? yVarA2 : yVarA;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, g gVar) throws SocketException {
        if (this.f40352h != null) {
            return new com.mbridge.msdk.thrid.okhttp.internal.http2.f(vVar, aVar, gVar, this.f40352h);
        }
        this.f40349e.setSoTimeout(aVar.b());
        com.mbridge.msdk.thrid.okio.t tVarB = this.f40353i.b();
        long jB = aVar.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        tVarB.a(jB, timeUnit);
        this.f40354j.b().a(aVar.c(), timeUnit);
        return new com.mbridge.msdk.thrid.okhttp.internal.http1.a(vVar, gVar, this.f40353i, this.f40354j);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public w a() {
        return this.f40351g;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r17, int r18, int r19, int r20, boolean r21, com.mbridge.msdk.thrid.okhttp.d r22, com.mbridge.msdk.thrid.okhttp.o r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.connection.c.a(int, int, int, int, boolean, com.mbridge.msdk.thrid.okhttp.d, com.mbridge.msdk.thrid.okhttp.o):void");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar) {
        synchronized (this.f40346b) {
            this.f40357m = gVar.k();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
        iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, c0 c0Var) {
        if (this.f40358n.size() >= this.f40357m || this.f40355k || !com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(this.f40347c.a(), aVar)) {
            return false;
        }
        if (aVar.k().g().equals(c().a().k().g())) {
            return true;
        }
        if (this.f40352h == null || c0Var == null || c0Var.b().type() != Proxy.Type.DIRECT || this.f40347c.b().type() != Proxy.Type.DIRECT || !this.f40347c.d().equals(c0Var.d()) || c0Var.a().d() != com.mbridge.msdk.thrid.okhttp.internal.tls.d.f40663a || !a(aVar.k())) {
            return false;
        }
        try {
            aVar.a().a(aVar.k().g(), b().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(s sVar) {
        if (sVar.j() != this.f40347c.a().k().j()) {
            return false;
        }
        if (sVar.g().equals(this.f40347c.a().k().g())) {
            return true;
        }
        return this.f40350f != null && com.mbridge.msdk.thrid.okhttp.internal.tls.d.f40663a.a(sVar.g(), (X509Certificate) this.f40350f.b().get(0));
    }

    public boolean a(boolean z10) {
        if (this.f40349e.isClosed() || this.f40349e.isInputShutdown() || this.f40349e.isOutputShutdown()) {
            return false;
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar = this.f40352h;
        if (gVar != null) {
            return gVar.f(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.f40349e.getSoTimeout();
                try {
                    this.f40349e.setSoTimeout(1);
                    return !this.f40353i.f();
                } finally {
                    this.f40349e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public q b() {
        return this.f40350f;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public c0 c() {
        return this.f40347c;
    }

    public void d() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f40348d);
    }

    public boolean f() {
        return this.f40352h != null;
    }

    public Socket g() {
        return this.f40349e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f40347c.a().k().g());
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb2.append(this.f40347c.a().k().j());
        sb2.append(", proxy=");
        sb2.append(this.f40347c.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f40347c.d());
        sb2.append(" cipherSuite=");
        q qVar = this.f40350f;
        sb2.append(qVar != null ? qVar.a() : "none");
        sb2.append(" protocol=");
        sb2.append(this.f40351g);
        sb2.append('}');
        return sb2.toString();
    }
}
