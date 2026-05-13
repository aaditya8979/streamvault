package org.eclipse.jetty.client;

import dq.d;
import hq.j;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import javax.net.SocketFactory;
import org.eclipse.jetty.client.a;

/* JADX INFO: compiled from: SocketConnector.java */
/* JADX INFO: loaded from: classes7.dex */
public class c extends uq.a implements a.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final vq.c f76603l = vq.b.a(c.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final org.eclipse.jetty.client.a f76604k;

    /* JADX INFO: compiled from: SocketConnector.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dq.a f76605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ HttpDestination f76606c;

        public a(dq.a aVar, HttpDestination httpDestination) {
            this.f76605b = aVar;
            this.f76606c = httpDestination;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        j jVar = this.f76605b;
                        while (true) {
                            j jVarE = jVar.e();
                            if (jVarE == jVar) {
                                break;
                            } else {
                                jVar = jVarE;
                            }
                        }
                        this.f76606c.s(this.f76605b, true);
                    } catch (IOException e10) {
                        c.f76603l.b(e10);
                    }
                } catch (IOException e11) {
                    if (e11 instanceof InterruptedIOException) {
                        c.f76603l.g(e11);
                    } else {
                        c.f76603l.b(e11);
                        this.f76606c.p(e11);
                    }
                    this.f76606c.s(this.f76605b, true);
                }
            } catch (Throwable th2) {
                try {
                    this.f76606c.s(this.f76605b, true);
                } catch (IOException e12) {
                    c.f76603l.b(e12);
                }
                throw th2;
            }
        }
    }

    public c(org.eclipse.jetty.client.a aVar) {
        this.f76604k = aVar;
    }

    @Override // org.eclipse.jetty.client.a.b
    public void G(HttpDestination httpDestination) throws IOException {
        Socket socketZ0 = httpDestination.n() ? httpDestination.l().z0() : SocketFactory.getDefault().createSocket();
        socketZ0.setSoTimeout(0);
        socketZ0.setTcpNoDelay(true);
        socketZ0.connect((httpDestination.m() ? httpDestination.j() : httpDestination.f()).c(), this.f76604k.A0());
        d dVar = new d(this.f76604k.L(), this.f76604k.W(), new iq.a(socketZ0));
        dVar.s(httpDestination);
        httpDestination.q(dVar);
        this.f76604k.J0().Z(new a(dVar, httpDestination));
    }
}
