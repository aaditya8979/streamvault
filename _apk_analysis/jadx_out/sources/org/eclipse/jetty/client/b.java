package org.eclipse.jetty.client;

import ar.e;
import hq.d;
import hq.i;
import hq.j;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnresolvedAddressException;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLEngine;
import jq.f;
import org.eclipse.jetty.client.a;
import org.eclipse.jetty.io.nio.SelectChannelEndPoint;
import org.eclipse.jetty.io.nio.b;

/* JADX INFO: compiled from: SelectConnector.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends uq.b implements a.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final vq.c f76592q = vq.b.a(b.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final org.eclipse.jetty.client.a f76593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0913b f76594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map<SocketChannel, e.a> f76595p;

    /* JADX INFO: compiled from: SelectConnector.java */
    public class a extends e.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SocketChannel f76596h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final HttpDestination f76597i;

        public a(SocketChannel socketChannel, HttpDestination httpDestination) {
            this.f76596h = socketChannel;
            this.f76597i = httpDestination;
        }

        @Override // ar.e.a
        public void f() {
            if (this.f76596h.isConnectionPending()) {
                b.f76592q.h("Channel {} timed out while connecting, closing it", this.f76596h);
                i();
                b.this.f76595p.remove(this.f76596h);
                this.f76597i.o(new SocketTimeoutException());
            }
        }

        public final void i() {
            try {
                this.f76596h.close();
            } catch (IOException e10) {
                b.f76592q.g(e10);
            }
        }
    }

    /* JADX INFO: renamed from: org.eclipse.jetty.client.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SelectConnector.java */
    public class C0913b extends org.eclipse.jetty.io.nio.b {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public vq.c f76599x = b.f76592q;

        public C0913b() {
        }

        @Override // org.eclipse.jetty.io.nio.b
        public jq.a B0(SocketChannel socketChannel, hq.c cVar, Object obj) {
            return new dq.c(b.this.f76593n.L(), b.this.f76593n.W(), cVar);
        }

        @Override // org.eclipse.jetty.io.nio.b
        public SelectChannelEndPoint C0(SocketChannel socketChannel, b.d dVar, SelectionKey selectionKey) throws IOException {
            hq.c cVar;
            e.a aVar = (e.a) b.this.f76595p.remove(socketChannel);
            if (aVar != null) {
                aVar.c();
            }
            if (this.f76599x.isDebugEnabled()) {
                this.f76599x.h("Channels with connection pending: {}", Integer.valueOf(b.this.f76595p.size()));
            }
            HttpDestination httpDestination = (HttpDestination) selectionKey.attachment();
            SelectChannelEndPoint selectChannelEndPoint = new SelectChannelEndPoint(socketChannel, dVar, selectionKey, (int) b.this.f76593n.D0());
            if (httpDestination.n()) {
                this.f76599x.h("secure to {}, proxied={}", socketChannel, Boolean.valueOf(httpDestination.m()));
                cVar = new c(selectChannelEndPoint, E0(httpDestination.l(), socketChannel));
            } else {
                cVar = selectChannelEndPoint;
            }
            j jVarB0 = dVar.j().B0(socketChannel, cVar, selectionKey.attachment());
            cVar.w(jVarB0);
            dq.a aVar2 = (dq.a) jVarB0;
            aVar2.s(httpDestination);
            if (httpDestination.n() && !httpDestination.m()) {
                ((c) cVar).e();
            }
            httpDestination.q(aVar2);
            return selectChannelEndPoint;
        }

        public final synchronized SSLEngine E0(yq.b bVar, SocketChannel socketChannel) throws IOException {
            SSLEngine sSLEngineY0;
            sSLEngineY0 = socketChannel != null ? bVar.y0(socketChannel.socket().getInetAddress().getHostAddress(), socketChannel.socket().getPort()) : bVar.x0();
            sSLEngineY0.setUseClientMode(true);
            sSLEngineY0.beginHandshake();
            return sSLEngineY0;
        }

        @Override // org.eclipse.jetty.io.nio.b
        public boolean Z(Runnable runnable) {
            return b.this.f76593n.f76585u.Z(runnable);
        }

        @Override // org.eclipse.jetty.io.nio.b
        public void u0(SocketChannel socketChannel, Throwable th2, Object obj) {
            e.a aVar = (e.a) b.this.f76595p.remove(socketChannel);
            if (aVar != null) {
                aVar.c();
            }
            if (obj instanceof HttpDestination) {
                ((HttpDestination) obj).o(th2);
            } else {
                super.u0(socketChannel, th2, obj);
            }
        }

        @Override // org.eclipse.jetty.io.nio.b
        public void v0(SelectChannelEndPoint selectChannelEndPoint) {
        }

        @Override // org.eclipse.jetty.io.nio.b
        public void w0(SelectChannelEndPoint selectChannelEndPoint) {
        }

        @Override // org.eclipse.jetty.io.nio.b
        public void x0(i iVar, j jVar) {
        }
    }

    /* JADX INFO: compiled from: SelectConnector.java */
    public static class c implements hq.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public hq.c f76601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SSLEngine f76602c;

        public c(hq.c cVar, SSLEngine sSLEngine) throws IOException {
            this.f76602c = sSLEngine;
            this.f76601b = cVar;
        }

        @Override // hq.c
        public void a() {
            this.f76601b.y();
        }

        @Override // hq.c
        public void b(e.a aVar, long j10) {
            this.f76601b.b(aVar, j10);
        }

        @Override // hq.k
        public int c() {
            return this.f76601b.c();
        }

        @Override // hq.k
        public void close() throws IOException {
            this.f76601b.close();
        }

        @Override // hq.k
        public int d() {
            return this.f76601b.d();
        }

        public void e() {
            dq.c cVar = (dq.c) this.f76601b.getConnection();
            f fVar = new f(this.f76602c, this.f76601b);
            this.f76601b.w(fVar);
            this.f76601b = fVar.E();
            fVar.E().w(cVar);
            b.f76592q.h("upgrade {} to {} for {}", this, fVar, cVar);
        }

        @Override // hq.k
        public String f() {
            return this.f76601b.f();
        }

        @Override // hq.k
        public void flush() throws IOException {
            this.f76601b.flush();
        }

        @Override // hq.k
        public boolean g() {
            return this.f76601b.g();
        }

        @Override // hq.i
        public j getConnection() {
            return this.f76601b.getConnection();
        }

        @Override // hq.k
        public String h() {
            return this.f76601b.h();
        }

        @Override // hq.k
        public boolean i(long j10) throws IOException {
            return this.f76601b.i(j10);
        }

        @Override // hq.k
        public boolean isOpen() {
            return this.f76601b.isOpen();
        }

        @Override // hq.k
        public int j(d dVar) throws IOException {
            return this.f76601b.j(dVar);
        }

        @Override // hq.k
        public int k(d dVar) throws IOException {
            return this.f76601b.k(dVar);
        }

        @Override // hq.k
        public void l() throws IOException {
            this.f76601b.l();
        }

        @Override // hq.k
        public boolean m(long j10) throws IOException {
            return this.f76601b.m(j10);
        }

        @Override // hq.c
        public void n(e.a aVar) {
            this.f76601b.n(aVar);
        }

        @Override // hq.k
        public void p() throws IOException {
            this.f76601b.p();
        }

        @Override // hq.c
        public boolean q() {
            return this.f76601b.q();
        }

        @Override // hq.k
        public int r(d dVar, d dVar2, d dVar3) throws IOException {
            return this.f76601b.r(dVar, dVar2, dVar3);
        }

        @Override // hq.k
        public int s() {
            return this.f76601b.s();
        }

        public String toString() {
            return "Upgradable:" + this.f76601b.toString();
        }

        @Override // hq.k
        public void u(int i10) throws IOException {
            this.f76601b.u(i10);
        }

        @Override // hq.k
        public String v() {
            return this.f76601b.v();
        }

        @Override // hq.i
        public void w(j jVar) {
            this.f76601b.w(jVar);
        }

        @Override // hq.k
        public boolean x() {
            return this.f76601b.x();
        }

        @Override // hq.c
        public void y() {
            this.f76601b.y();
        }

        @Override // hq.k
        public boolean z() {
            return this.f76601b.z();
        }
    }

    public b(org.eclipse.jetty.client.a aVar) {
        C0913b c0913b = new C0913b();
        this.f76594o = c0913b;
        this.f76595p = new ConcurrentHashMap();
        this.f76593n = aVar;
        n0(aVar, false);
        n0(c0913b, true);
    }

    @Override // org.eclipse.jetty.client.a.b
    public void G(HttpDestination httpDestination) throws IOException {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            SocketChannel socketChannelOpen = SocketChannel.open();
            dq.b bVarJ = httpDestination.m() ? httpDestination.j() : httpDestination.f();
            socketChannelOpen.socket().setTcpNoDelay(true);
            if (this.f76593n.M0()) {
                socketChannelOpen.socket().connect(bVarJ.c(), this.f76593n.A0());
                socketChannelOpen.configureBlocking(false);
                this.f76594o.D0(socketChannelOpen, httpDestination);
                return;
            }
            socketChannelOpen.configureBlocking(false);
            socketChannelOpen.connect(bVarJ.c());
            this.f76594o.D0(socketChannelOpen, httpDestination);
            a aVar = new a(socketChannelOpen, httpDestination);
            this.f76593n.R0(aVar, r2.A0());
            this.f76595p.put(socketChannelOpen, aVar);
        } catch (IOException e10) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            httpDestination.o(e10);
        } catch (UnresolvedAddressException e11) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            httpDestination.o(e11);
        }
    }
}
