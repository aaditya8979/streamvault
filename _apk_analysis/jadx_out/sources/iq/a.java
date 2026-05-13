package iq;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import vq.c;

/* JADX INFO: compiled from: SocketEndPoint.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f71748j = vq.b.a(a.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Socket f71749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InetSocketAddress f71750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InetSocketAddress f71751i;

    public a(Socket socket) throws IOException {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f71749g = socket;
        this.f71750h = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f71751i = (InetSocketAddress) socket.getRemoteSocketAddress();
        super.u(socket.getSoTimeout());
    }

    public a(Socket socket, int i10) throws IOException {
        super(socket.getInputStream(), socket.getOutputStream());
        this.f71749g = socket;
        this.f71750h = (InetSocketAddress) socket.getLocalSocketAddress();
        this.f71751i = (InetSocketAddress) socket.getRemoteSocketAddress();
        socket.setSoTimeout(i10 > 0 ? i10 : 0);
        super.u(i10);
    }

    @Override // iq.b
    public void B() throws IOException {
        try {
            if (z()) {
                return;
            }
            l();
        } catch (IOException e10) {
            f71748j.g(e10);
            this.f71749g.close();
        }
    }

    public void D() throws IOException {
        if (this.f71749g.isClosed()) {
            return;
        }
        if (!this.f71749g.isInputShutdown()) {
            this.f71749g.shutdownInput();
        }
        if (this.f71749g.isOutputShutdown()) {
            this.f71749g.close();
        }
    }

    public final void E() throws IOException {
        if (this.f71749g.isClosed()) {
            return;
        }
        if (!this.f71749g.isOutputShutdown()) {
            this.f71749g.shutdownOutput();
        }
        if (this.f71749g.isInputShutdown()) {
            this.f71749g.close();
        }
    }

    @Override // iq.b, hq.k
    public int c() {
        InetSocketAddress inetSocketAddress = this.f71750h;
        if (inetSocketAddress == null) {
            return -1;
        }
        return inetSocketAddress.getPort();
    }

    @Override // iq.b, hq.k
    public void close() throws IOException {
        this.f71749g.close();
        this.f71752b = null;
        this.f71753c = null;
    }

    @Override // iq.b, hq.k
    public String f() {
        InetAddress address;
        InetSocketAddress inetSocketAddress = this.f71751i;
        if (inetSocketAddress == null || (address = inetSocketAddress.getAddress()) == null) {
            return null;
        }
        return address.getHostAddress();
    }

    @Override // iq.b, hq.k
    public String h() {
        InetSocketAddress inetSocketAddress = this.f71750h;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f71750h.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f71750h.getAddress().getHostAddress();
    }

    @Override // iq.b, hq.k
    public boolean isOpen() {
        Socket socket;
        return (!super.isOpen() || (socket = this.f71749g) == null || socket.isClosed()) ? false : true;
    }

    @Override // iq.b, hq.k
    public void l() throws IOException {
        if (this.f71749g instanceof SSLSocket) {
            super.l();
        } else {
            D();
        }
    }

    @Override // iq.b, hq.k
    public void p() throws IOException {
        if (this.f71749g instanceof SSLSocket) {
            super.p();
        } else {
            E();
        }
    }

    public String toString() {
        return this.f71750h + " <--> " + this.f71751i;
    }

    @Override // iq.b, hq.k
    public void u(int i10) throws IOException {
        if (i10 != d()) {
            this.f71749g.setSoTimeout(i10 > 0 ? i10 : 0);
        }
        super.u(i10);
    }

    @Override // iq.b, hq.k
    public String v() {
        InetSocketAddress inetSocketAddress = this.f71750h;
        return (inetSocketAddress == null || inetSocketAddress.getAddress() == null || this.f71750h.getAddress().isAnyLocalAddress()) ? "0.0.0.0" : this.f71750h.getAddress().getCanonicalHostName();
    }

    @Override // iq.b, hq.k
    public boolean x() {
        Socket socket = this.f71749g;
        return socket instanceof SSLSocket ? super.x() : socket.isClosed() || this.f71749g.isOutputShutdown();
    }

    @Override // iq.b, hq.k
    public boolean z() {
        Socket socket = this.f71749g;
        return socket instanceof SSLSocket ? super.z() : socket.isClosed() || this.f71749g.isInputShutdown();
    }
}
