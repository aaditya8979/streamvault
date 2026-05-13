package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: ConnectionSpecSelector.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<j> f40342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40343b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f40344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40345d;

    public b(List<j> list) {
        this.f40342a = list;
    }

    private boolean b(SSLSocket sSLSocket) {
        for (int i10 = this.f40343b; i10 < this.f40342a.size(); i10++) {
            if (this.f40342a.get(i10).a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public j a(SSLSocket sSLSocket) throws IOException {
        j jVar;
        int i10 = this.f40343b;
        int size = this.f40342a.size();
        while (true) {
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f40342a.get(i10);
            if (jVar.a(sSLSocket)) {
                this.f40343b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar != null) {
            this.f40344c = b(sSLSocket);
            com.mbridge.msdk.thrid.okhttp.internal.a.f40304a.a(jVar, sSLSocket, this.f40345d);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f40345d + ", modes=" + this.f40342a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean a(IOException iOException) {
        this.f40345d = true;
        if (!this.f40344c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
