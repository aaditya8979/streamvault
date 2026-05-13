package nq;

import hq.d;
import hq.i;
import hq.j;
import hq.k;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import mq.e;
import mq.n;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.io.EofException;
import vq.b;
import vq.c;

/* JADX INFO: compiled from: SocketConnector.java */
/* JADX INFO: loaded from: classes.dex */
public class a extends mq.a {
    public static final c W = b.a(a.class);
    public ServerSocket T;
    public volatile int V = -1;
    public final Set<k> U = new HashSet();

    /* JADX INFO: renamed from: nq.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SocketConnector.java */
    public class RunnableC0901a extends iq.a implements Runnable, i {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile j f75959k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Socket f75960l;

        public RunnableC0901a(Socket socket) throws IOException {
            super(socket, a.this.J);
            this.f75959k = a.this.Y0(this);
            this.f75960l = socket;
        }

        public void a() throws IOException {
            if (a.this.R0() == null || !a.this.R0().Z(this)) {
                a.W.f("dispatch failed for {}", this.f75959k);
                close();
            }
        }

        @Override // iq.a, iq.b, hq.k
        public void close() throws IOException {
            if (this.f75959k instanceof mq.b) {
                ((mq.b) this.f75959k).x().y().c();
            }
            super.close();
        }

        @Override // iq.b, hq.k
        public int j(d dVar) throws IOException {
            int iJ = super.j(dVar);
            if (iJ < 0) {
                if (!z()) {
                    l();
                }
                if (x()) {
                    close();
                }
            }
            return iJ;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        try {
                            a.this.E0(this.f75959k);
                            synchronized (a.this.U) {
                                a.this.U.add(this);
                            }
                            while (a.this.isStarted() && !C()) {
                                if (this.f75959k.p() && a.this.E()) {
                                    u(a.this.O0());
                                }
                                this.f75959k = this.f75959k.e();
                            }
                            a.this.D0(this.f75959k);
                            synchronized (a.this.U) {
                                a.this.U.remove(this);
                            }
                            if (this.f75960l.isClosed()) {
                                return;
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int iD = d();
                            this.f75960l.setSoTimeout(d());
                            while (this.f75960l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis < iD) {
                            }
                            if (this.f75960l.isClosed()) {
                                return;
                            }
                            this.f75960l.close();
                        } catch (IOException e10) {
                            a.W.g(e10);
                        }
                    } catch (SocketException e11) {
                        a.W.debug("EOF", e11);
                        try {
                            close();
                        } catch (IOException e12) {
                            a.W.g(e12);
                        }
                        a.this.D0(this.f75959k);
                        synchronized (a.this.U) {
                            a.this.U.remove(this);
                            if (this.f75960l.isClosed()) {
                                return;
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            int iD2 = d();
                            this.f75960l.setSoTimeout(d());
                            while (this.f75960l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis2 < iD2) {
                            }
                            if (this.f75960l.isClosed()) {
                                return;
                            }
                            this.f75960l.close();
                        }
                    } catch (HttpException e13) {
                        a.W.debug("BAD", e13);
                        try {
                            close();
                        } catch (IOException e14) {
                            a.W.g(e14);
                        }
                        a.this.D0(this.f75959k);
                        synchronized (a.this.U) {
                            a.this.U.remove(this);
                            if (this.f75960l.isClosed()) {
                                return;
                            }
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            int iD3 = d();
                            this.f75960l.setSoTimeout(d());
                            while (this.f75960l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis3 < iD3) {
                            }
                            if (this.f75960l.isClosed()) {
                                return;
                            }
                            this.f75960l.close();
                        }
                    }
                } catch (EofException e15) {
                    a.W.debug("EOF", e15);
                    try {
                        close();
                    } catch (IOException e16) {
                        a.W.g(e16);
                    }
                    a.this.D0(this.f75959k);
                    synchronized (a.this.U) {
                        a.this.U.remove(this);
                        if (this.f75960l.isClosed()) {
                            return;
                        }
                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                        int iD4 = d();
                        this.f75960l.setSoTimeout(d());
                        while (this.f75960l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis4 < iD4) {
                        }
                        if (this.f75960l.isClosed()) {
                            return;
                        }
                        this.f75960l.close();
                    }
                } catch (Exception e17) {
                    a.W.d("handle failed?", e17);
                    try {
                        close();
                    } catch (IOException e18) {
                        a.W.g(e18);
                    }
                    a.this.D0(this.f75959k);
                    synchronized (a.this.U) {
                        a.this.U.remove(this);
                        if (this.f75960l.isClosed()) {
                            return;
                        }
                        long jCurrentTimeMillis5 = System.currentTimeMillis();
                        int iD5 = d();
                        this.f75960l.setSoTimeout(d());
                        while (this.f75960l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis5 < iD5) {
                        }
                        if (this.f75960l.isClosed()) {
                            return;
                        }
                        this.f75960l.close();
                    }
                }
            } catch (Throwable th2) {
                a.this.D0(this.f75959k);
                synchronized (a.this.U) {
                    a.this.U.remove(this);
                    try {
                        if (!this.f75960l.isClosed()) {
                            long jCurrentTimeMillis6 = System.currentTimeMillis();
                            int iD6 = d();
                            this.f75960l.setSoTimeout(d());
                            while (this.f75960l.getInputStream().read() >= 0 && System.currentTimeMillis() - jCurrentTimeMillis6 < iD6) {
                            }
                            if (!this.f75960l.isClosed()) {
                                this.f75960l.close();
                            }
                        }
                    } catch (IOException e19) {
                        a.W.g(e19);
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // mq.a, mq.f
    public void K(k kVar, n nVar) throws IOException {
        ((RunnableC0901a) kVar).u(E() ? this.K : this.J);
        super.K(kVar, nVar);
    }

    public j Y0(k kVar) {
        return new e(this, kVar, b());
    }

    public ServerSocket Z0(String str, int i10, int i11) throws IOException {
        return str == null ? new ServerSocket(i10, i11) : new ServerSocket(i10, i11, InetAddress.getByName(str));
    }

    @Override // mq.f
    public int c() {
        return this.V;
    }

    @Override // mq.f
    public void close() throws IOException {
        ServerSocket serverSocket = this.T;
        if (serverSocket != null) {
            serverSocket.close();
        }
        this.T = null;
        this.V = -2;
    }

    @Override // mq.a, uq.b, uq.a
    public void d0() throws Exception {
        this.U.clear();
        super.d0();
    }

    @Override // mq.a, uq.b, uq.a
    public void e0() throws Exception {
        super.e0();
        HashSet hashSet = new HashSet();
        synchronized (this.U) {
            hashSet.addAll(this.U);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((RunnableC0901a) ((k) it.next())).close();
        }
    }

    @Override // mq.f
    public Object getConnection() {
        return this.T;
    }

    @Override // mq.f
    public void open() throws IOException {
        ServerSocket serverSocket = this.T;
        if (serverSocket == null || serverSocket.isClosed()) {
            this.T = Z0(H(), P0(), F0());
        }
        this.T.setReuseAddress(Q0());
        this.V = this.T.getLocalPort();
        if (this.V > 0) {
            return;
        }
        throw new IllegalStateException("port not allocated for " + this);
    }

    @Override // uq.b, uq.e
    public void w(Appendable appendable, String str) throws IOException {
        super.w(appendable, str);
        HashSet hashSet = new HashSet();
        synchronized (this.U) {
            hashSet.addAll(this.U);
        }
        uq.b.p0(appendable, str, hashSet);
    }

    @Override // mq.a
    public void x0(int i10) throws InterruptedException, IOException {
        Socket socketAccept = this.T.accept();
        C0(socketAccept);
        new RunnableC0901a(socketAccept).a();
    }
}
