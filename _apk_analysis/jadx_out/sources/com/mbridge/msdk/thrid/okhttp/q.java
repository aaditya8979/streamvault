package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: compiled from: Handshake.java */
/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f40708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f40709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Certificate> f40710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Certificate> f40711d;

    private q(d0 d0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f40708a = d0Var;
        this.f40709b = gVar;
        this.f40710c = list;
        this.f40711d = list2;
    }

    public static q a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        g gVarA = g.a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (Constraint.NONE.equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        d0 d0VarA = d0.a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listA = peerCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new q(d0VarA, gVarA, listA, localCertificates != null ? com.mbridge.msdk.thrid.okhttp.internal.c.a(localCertificates) : Collections.emptyList());
    }

    public g a() {
        return this.f40709b;
    }

    public List<Certificate> b() {
        return this.f40710c;
    }

    public d0 c() {
        return this.f40708a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f40708a.equals(qVar.f40708a) && this.f40709b.equals(qVar.f40709b) && this.f40710c.equals(qVar.f40710c) && this.f40711d.equals(qVar.f40711d);
    }

    public int hashCode() {
        return ((((((this.f40708a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f40709b.hashCode()) * 31) + this.f40710c.hashCode()) * 31) + this.f40711d.hashCode();
    }
}
