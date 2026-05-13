package lq;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import kq.l;
import mq.d;
import mq.v;
import org.eclipse.jetty.security.ServerAuthException;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Password;
import zm.p;
import zm.t;

/* JADX INFO: compiled from: ClientCertAuthenticator.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f73891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f73892e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Password f73894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f73895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f73896i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f73893f = "JKS";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f73897j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f73898k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f73899l = false;

    @Override // kq.a
    public mq.d a(p pVar, t tVar, boolean z10) throws ServerAuthException {
        if (!z10) {
            return new c(this);
        }
        an.c cVar = (an.c) tVar;
        X509Certificate[] x509CertificateArr = (X509Certificate[]) ((an.a) pVar).getAttribute("javax.servlet.request.X509Certificate");
        if (x509CertificateArr != null) {
            try {
                if (x509CertificateArr.length > 0) {
                    if (this.f73895h) {
                        String str = this.f73891d;
                        String str2 = this.f73893f;
                        String str3 = this.f73892e;
                        Password password = this.f73894g;
                        new xq.b(g(null, str, str2, str3, password == null ? null : password.toString()), h(this.f73896i)).f(x509CertificateArr);
                    }
                    for (X509Certificate x509Certificate : x509CertificateArr) {
                        if (x509Certificate != null) {
                            Principal subjectDN = x509Certificate.getSubjectDN();
                            if (subjectDN == null) {
                                subjectDN = x509Certificate.getIssuerDN();
                            }
                            v vVarE = e(subjectDN == null ? "clientcert" : subjectDN.getName(), sq.d.e(x509Certificate.getSignature()), pVar);
                            if (vVarE != null) {
                                return new l(getAuthMethod(), vVarE);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                throw new ServerAuthException(e10.getMessage());
            }
        }
        if (c.c(cVar)) {
            return mq.d.I8;
        }
        cVar.o(403);
        return mq.d.L8;
    }

    @Override // kq.a
    public boolean c(p pVar, t tVar, boolean z10, d.h hVar) throws ServerAuthException {
        return true;
    }

    public KeyStore g(InputStream inputStream, String str, String str2, String str3, String str4) throws Exception {
        return xq.a.a(inputStream, str, str2, str3, str4);
    }

    @Override // kq.a
    public String getAuthMethod() {
        return Constraint.__CERT_AUTH;
    }

    public Collection<? extends CRL> h(String str) throws Exception {
        return xq.a.b(str);
    }
}
