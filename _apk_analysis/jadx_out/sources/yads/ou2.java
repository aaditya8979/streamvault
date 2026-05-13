package yads;

import android.util.Log;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class ou2 extends X509ExtendedTrustManager implements hw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw2 f93333a;

    public ou2(u20 u20Var) {
        this.f93333a = new jw2(u20Var);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ((X509TrustManager) this.f93333a.f91399b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) throws CertificateException {
        jw2 jw2Var = this.f93333a;
        jw2Var.getClass();
        if (b93.a()) {
            yf.a((X509TrustManager) jw2Var.f91399b.getValue(), x509CertificateArr, str, socket);
        } else {
            ((X509TrustManager) jw2Var.f91399b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) throws CertificateException {
        jw2 jw2Var = this.f93333a;
        jw2Var.getClass();
        if (b93.a()) {
            yf.a((X509TrustManager) jw2Var.f91399b.getValue(), x509CertificateArr, str, sSLEngine);
        } else {
            ((X509TrustManager) jw2Var.f91399b.getValue()).checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.f93333a.a(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        bn.r rVar;
        jw2 jw2Var = this.f93333a;
        jw2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) jw2Var.f91399b.getValue();
            if (b93.a()) {
                yf.b(x509TrustManager, x509CertificateArr, str, socket);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            synchronized (jw2Var.f91402e) {
                jw2Var.a();
                jw2Var.b();
                X509TrustManager x509TrustManager2 = jw2Var.f91401d;
                if (x509TrustManager2 != null) {
                    if (b93.a()) {
                        yf.b(x509TrustManager2, x509CertificateArr, str, socket);
                    } else {
                        x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                    }
                    rVar = bn.r.f5635a;
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    bn.r rVar2 = bn.r.f5635a;
                } else {
                    Log.w("SdkTrustManager", "Custom TrustManager is null");
                    throw e10;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        bn.r rVar;
        jw2 jw2Var = this.f93333a;
        jw2Var.getClass();
        try {
            X509TrustManager x509TrustManager = (X509TrustManager) jw2Var.f91399b.getValue();
            if (b93.a()) {
                yf.b(x509TrustManager, x509CertificateArr, str, sSLEngine);
            } else {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        } catch (CertificateException e10) {
            synchronized (jw2Var.f91402e) {
                jw2Var.a();
                jw2Var.b();
                X509TrustManager x509TrustManager2 = jw2Var.f91401d;
                if (x509TrustManager2 != null) {
                    if (b93.a()) {
                        yf.b(x509TrustManager2, x509CertificateArr, str, sSLEngine);
                    } else {
                        x509TrustManager2.checkServerTrusted(x509CertificateArr, str);
                    }
                    rVar = bn.r.f5635a;
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    bn.r rVar2 = bn.r.f5635a;
                } else {
                    Log.w("SdkTrustManager", "Custom TrustManager is null");
                    throw e10;
                }
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.f93333a.f91399b.getValue()).getAcceptedIssuers();
    }
}
