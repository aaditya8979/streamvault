package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v f40412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f40413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.thrid.okhttp.internal.connection.g f40414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f40415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f40416e;

    public j(v vVar, boolean z10) {
        this.f40412a = vVar;
        this.f40413b = z10;
    }

    private int a(a0 a0Var, int i10) {
        String strB = a0Var.b(CommonGatewayClient.HEADER_RETRY_AFTER);
        if (strB == null) {
            return i10;
        }
        if (strB.matches("\\d+")) {
            return Integer.valueOf(strB).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private com.mbridge.msdk.thrid.okhttp.a a(s sVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifierO;
        com.mbridge.msdk.thrid.okhttp.f fVarC;
        if (sVar.h()) {
            SSLSocketFactory sSLSocketFactoryB = this.f40412a.B();
            hostnameVerifierO = this.f40412a.o();
            sSLSocketFactory = sSLSocketFactoryB;
            fVarC = this.f40412a.c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifierO = null;
            fVarC = null;
        }
        return new com.mbridge.msdk.thrid.okhttp.a(sVar.g(), sVar.j(), this.f40412a.k(), this.f40412a.A(), sSLSocketFactory, hostnameVerifierO, fVarC, this.f40412a.w(), this.f40412a.v(), this.f40412a.u(), this.f40412a.g(), this.f40412a.x());
    }

    private y a(a0 a0Var, c0 c0Var) throws IOException {
        String strB;
        s sVarE;
        if (a0Var == null) {
            throw new IllegalStateException();
        }
        int iK = a0Var.k();
        String strE = a0Var.s().e();
        if (iK == 307 || iK == 308) {
            if (!strE.equals("GET") && !strE.equals("HEAD")) {
                return null;
            }
        } else {
            if (iK == 401) {
                return this.f40412a.a().a(c0Var, a0Var);
            }
            if (iK == 503) {
                if ((a0Var.q() == null || a0Var.q().k() != 503) && a(a0Var, Integer.MAX_VALUE) == 0) {
                    return a0Var.s();
                }
                return null;
            }
            if (iK == 407) {
                if (c0Var.b().type() == Proxy.Type.HTTP) {
                    return this.f40412a.w().a(c0Var, a0Var);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iK == 408) {
                if (!this.f40412a.z()) {
                    return null;
                }
                a0Var.s().a();
                if ((a0Var.q() == null || a0Var.q().k() != 408) && a(a0Var, 0) <= 0) {
                    return a0Var.s();
                }
                return null;
            }
            switch (iK) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f40412a.m() || (strB = a0Var.b("Location")) == null || (sVarE = a0Var.s().g().e(strB)) == null) {
            return null;
        }
        if (!sVarE.m().equals(a0Var.s().g().m()) && !this.f40412a.n()) {
            return null;
        }
        y.a aVarF = a0Var.s().f();
        if (f.a(strE)) {
            boolean zC = f.c(strE);
            if (f.b(strE)) {
                aVarF.a("GET", (z) null);
            } else {
                aVarF.a(strE, zC ? a0Var.s().a() : null);
            }
            if (!zC) {
                aVarF.a("Transfer-Encoding");
                aVarF.a("Content-Length");
                aVarF.a("Content-Type");
            }
        }
        if (!a(a0Var, sVarE)) {
            aVarF.a("Authorization");
        }
        return aVarF.a(sVarE).a();
    }

    private boolean a(a0 a0Var, s sVar) {
        s sVarG = a0Var.s().g();
        return sVarG.g().equals(sVar.g()) && sVarG.j() == sVar.j() && sVarG.m().equals(sVar.m());
    }

    private boolean a(IOException iOException, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, boolean z10, y yVar) {
        gVar.a(iOException);
        if (this.f40412a.z()) {
            return !(z10 && a(iOException, yVar)) && a(iOException, z10) && gVar.d();
        }
        return false;
    }

    private boolean a(IOException iOException, y yVar) {
        yVar.a();
        return iOException instanceof FileNotFoundException;
    }

    private boolean a(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        a0 a0VarA;
        y yVarA;
        y yVarD = aVar.d();
        g gVar = (g) aVar;
        com.mbridge.msdk.thrid.okhttp.d dVarE = gVar.e();
        o oVarG = gVar.g();
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar2 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.f40412a.f(), a(yVarD.g()), dVarE, oVarG, this.f40415d);
        this.f40414c = gVar2;
        int i10 = 0;
        a0 a0Var = null;
        while (!this.f40416e) {
            try {
                try {
                    a0VarA = gVar.a(yVarD, gVar2, null, null);
                    if (a0Var != null) {
                        a0VarA = a0VarA.p().d(a0Var.p().a((b0) null).a()).a();
                    }
                    try {
                        yVarA = a(a0VarA, gVar2.h());
                    } catch (IOException e10) {
                        gVar2.f();
                        throw e10;
                    }
                } catch (com.mbridge.msdk.thrid.okhttp.internal.connection.e e11) {
                    if (!a(e11.g(), gVar2, false, yVarD)) {
                        throw e11.d();
                    }
                } catch (IOException e12) {
                    if (!a(e12, gVar2, !(e12 instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a), yVarD)) {
                        throw e12;
                    }
                }
                if (yVarA == null) {
                    gVar2.f();
                    return a0VarA;
                }
                com.mbridge.msdk.thrid.okhttp.internal.c.a(a0VarA.d());
                int i11 = i10 + 1;
                if (i11 > 20) {
                    gVar2.f();
                    throw new ProtocolException("Too many follow-up requests: " + i11);
                }
                yVarA.a();
                if (!a(a0VarA, yVarA.g())) {
                    gVar2.f();
                    gVar2 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.f40412a.f(), a(yVarA.g()), dVarE, oVarG, this.f40415d);
                    this.f40414c = gVar2;
                } else if (gVar2.b() != null) {
                    throw new IllegalStateException("Closing the body of " + a0VarA + " didn't close its backing stream. Bad interceptor?");
                }
                a0Var = a0VarA;
                yVarD = yVarA;
                i10 = i11;
            } catch (Throwable th2) {
                gVar2.a((IOException) null);
                gVar2.f();
                throw th2;
            }
        }
        gVar2.f();
        throw new IOException("Canceled");
    }

    public void a() {
        this.f40416e = true;
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.f40414c;
        if (gVar != null) {
            gVar.a();
        }
    }

    public void a(Object obj) {
        this.f40415d = obj;
    }

    public boolean b() {
        return this.f40416e;
    }
}
