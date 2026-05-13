package org.eclipse.jetty.client;

import dq.f;
import dq.i;
import gq.g;
import hq.d;
import hq.h;
import hq.k;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import org.eclipse.jetty.client.a;
import org.eclipse.jetty.client.b;
import org.eclipse.jetty.http.PathMap;
import uq.e;

/* JADX INFO: loaded from: classes11.dex */
public class HttpDestination implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final vq.c f76560s = vq.b.a(HttpDestination.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final org.eclipse.jetty.client.a f76565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dq.b f76566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f76567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yq.b f76568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f76569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile int f76570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f76571l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile dq.b f76574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public eq.a f76575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PathMap f76576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List<g> f76577r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<i> f76561b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<dq.a> f76562c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue<Object> f76563d = new ArrayBlockingQueue(10, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<dq.a> f76564e = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f76572m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f76573n = 0;

    public class a extends f {
        public final b.c E;

        public a(dq.b bVar, b.c cVar) {
            this.E = cVar;
            O("CONNECT");
            String string = bVar.toString();
            U(string);
            c("Host", string);
            c("Proxy-Connection", "keep-alive");
            c("User-Agent", "Jetty-Client");
        }

        @Override // dq.i
        public void A() {
            i iVar;
            synchronized (HttpDestination.this) {
                iVar = !HttpDestination.this.f76561b.isEmpty() ? (i) HttpDestination.this.f76561b.remove(0) : null;
            }
            if (iVar == null || !iVar.Y(8)) {
                return;
            }
            iVar.k().h();
        }

        @Override // dq.i
        public void D() throws IOException {
            int iF0 = f0();
            if (iF0 == 200) {
                this.E.e();
                return;
            }
            if (iF0 == 504) {
                A();
                return;
            }
            z(new ProtocolException("Proxy: " + this.E.f() + StringUtils.PROCESS_POSTFIX_DELIMITER + this.E.s() + " didn't return http return code 200, but " + iF0));
        }

        @Override // dq.i
        public void y(Throwable th2) {
            HttpDestination.this.o(th2);
        }

        @Override // dq.i
        public void z(Throwable th2) {
            i iVar;
            synchronized (HttpDestination.this) {
                iVar = !HttpDestination.this.f76561b.isEmpty() ? (i) HttpDestination.this.f76561b.remove(0) : null;
            }
            if (iVar == null || !iVar.Y(9)) {
                return;
            }
            iVar.k().f(th2);
        }
    }

    public HttpDestination(org.eclipse.jetty.client.a aVar, dq.b bVar, boolean z10, yq.b bVar2) {
        this.f76565f = aVar;
        this.f76566g = bVar;
        this.f76567h = z10;
        this.f76568i = bVar2;
        this.f76570k = aVar.E0();
        this.f76571l = aVar.F0();
        String strA = bVar.a();
        if (bVar.b() != (z10 ? 443 : 80)) {
            strA = strA + StringUtils.PROCESS_POSTFIX_DELIMITER + bVar.b();
        }
        this.f76569j = new h(strA);
    }

    public void b(String str, eq.a aVar) {
        synchronized (this) {
            if (this.f76576q == null) {
                this.f76576q = new PathMap();
            }
            this.f76576q.put(str, aVar);
        }
    }

    public void c() throws IOException {
        synchronized (this) {
            Iterator<dq.a> it = this.f76562c.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
        }
    }

    public void d(i iVar) throws IOException {
        boolean z10;
        eq.a aVar;
        synchronized (this) {
            List<g> list = this.f76577r;
            if (list != null) {
                StringBuilder sb2 = null;
                for (g gVar : list) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                    } else {
                        sb2.append("; ");
                    }
                    sb2.append(gVar.d());
                    sb2.append("=");
                    sb2.append(gVar.f());
                }
                if (sb2 != null) {
                    iVar.c("Cookie", sb2.toString());
                }
            }
        }
        PathMap pathMap = this.f76576q;
        if (pathMap != null && (aVar = (eq.a) pathMap.match(iVar.q())) != null) {
            aVar.a(iVar);
        }
        iVar.L(this);
        dq.a aVarI = i();
        if (aVarI != null) {
            u(aVarI, iVar);
            return;
        }
        synchronized (this) {
            if (this.f76561b.size() == this.f76571l) {
                throw new RejectedExecutionException("Queue full for address " + this.f76566g);
            }
            this.f76561b.add(iVar);
            z10 = this.f76562c.size() + this.f76572m < this.f76570k;
        }
        if (z10) {
            z();
        }
    }

    public void e(i iVar) {
        synchronized (this) {
            this.f76561b.remove(iVar);
        }
    }

    public dq.b f() {
        return this.f76566g;
    }

    public d g() {
        return this.f76569j;
    }

    public org.eclipse.jetty.client.a h() {
        return this.f76565f;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[Catch: all -> 0x002f, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000e, B:8:0x0016, B:9:0x0024), top: B:18:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dq.a i() throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            monitor-enter(r3)
            if (r1 == 0) goto Le
            java.util.List<dq.a> r2 = r3.f76562c     // Catch: java.lang.Throwable -> L2f
            r2.remove(r1)     // Catch: java.lang.Throwable -> L2f
            r1.l()     // Catch: java.lang.Throwable -> L2f
            r1 = r0
        Le:
            java.util.List<dq.a> r2 = r3.f76564e     // Catch: java.lang.Throwable -> L2f
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2f
            if (r2 <= 0) goto L24
            java.util.List<dq.a> r1 = r3.f76564e     // Catch: java.lang.Throwable -> L2f
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L2f
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> L2f
            dq.a r1 = (dq.a) r1     // Catch: java.lang.Throwable -> L2f
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L28
            return r0
        L28:
            boolean r2 = r1.k()
            if (r2 == 0) goto L2
            return r1
        L2f:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.client.HttpDestination.i():dq.a");
    }

    public dq.b j() {
        return this.f76574o;
    }

    public eq.a k() {
        return this.f76575p;
    }

    public yq.b l() {
        return this.f76568i;
    }

    public boolean m() {
        return this.f76574o != null;
    }

    public boolean n() {
        return this.f76567h;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(java.lang.Throwable r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f76572m     // Catch: java.lang.Throwable -> L59
            r1 = 1
            int r0 = r0 - r1
            r5.f76572m = r0     // Catch: java.lang.Throwable -> L59
            int r0 = r5.f76573n     // Catch: java.lang.Throwable -> L59
            r2 = 0
            r3 = 0
            if (r0 <= 0) goto L12
            int r0 = r0 - r1
            r5.f76573n = r0     // Catch: java.lang.Throwable -> L59
            r1 = r2
            goto L44
        L12:
            java.util.List<dq.i> r0 = r5.f76561b     // Catch: java.lang.Throwable -> L59
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L59
            if (r0 <= 0) goto L42
            java.util.List<dq.i> r0 = r5.f76561b     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r0.remove(r2)     // Catch: java.lang.Throwable -> L59
            dq.i r0 = (dq.i) r0     // Catch: java.lang.Throwable -> L59
            r4 = 9
            boolean r4 = r0.Y(r4)     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L31
            dq.g r0 = r0.k()     // Catch: java.lang.Throwable -> L59
            r0.a(r6)     // Catch: java.lang.Throwable -> L59
        L31:
            java.util.List<dq.i> r6 = r5.f76561b     // Catch: java.lang.Throwable -> L59
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r6 != 0) goto L42
            org.eclipse.jetty.client.a r6 = r5.f76565f     // Catch: java.lang.Throwable -> L59
            boolean r6 = r6.isStarted()     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L42
            goto L43
        L42:
            r1 = r2
        L43:
            r6 = r3
        L44:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L4a
            r5.z()
        L4a:
            if (r6 == 0) goto L58
            java.util.concurrent.BlockingQueue<java.lang.Object> r0 = r5.f76563d     // Catch: java.lang.InterruptedException -> L52
            r0.put(r6)     // Catch: java.lang.InterruptedException -> L52
            goto L58
        L52:
            r6 = move-exception
            vq.c r0 = org.eclipse.jetty.client.HttpDestination.f76560s
            r0.g(r6)
        L58:
            return
        L59:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L59
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.client.HttpDestination.o(java.lang.Throwable):void");
    }

    public void p(Throwable th2) {
        synchronized (this) {
            this.f76572m--;
            if (this.f76561b.size() > 0) {
                i iVarRemove = this.f76561b.remove(0);
                if (iVarRemove.Y(9)) {
                    iVarRemove.k().f(th2);
                }
            }
        }
    }

    public void q(dq.a aVar) throws IOException {
        synchronized (this) {
            this.f76572m--;
            this.f76562c.add(aVar);
            int i10 = this.f76573n;
            if (i10 > 0) {
                this.f76573n = i10 - 1;
            } else {
                k kVarF = aVar.f();
                if (m() && (kVarF instanceof b.c)) {
                    a aVar2 = new a(f(), (b.c) kVarF);
                    aVar2.M(j());
                    f76560s.h("Establishing tunnel to {} via {}", f(), j());
                    u(aVar, aVar2);
                } else if (this.f76561b.size() == 0) {
                    f76560s.h("No exchanges for new connection {}", aVar);
                    aVar.t();
                    this.f76564e.add(aVar);
                } else {
                    u(aVar, this.f76561b.remove(0));
                }
                aVar = null;
            }
        }
        if (aVar != null) {
            try {
                this.f76563d.put(aVar);
            } catch (InterruptedException e10) {
                f76560s.g(e10);
            }
        }
    }

    public void r(i iVar) throws IOException {
        iVar.k().b();
        iVar.K();
        d(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(dq.a r5, boolean r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r5.o()
            r1 = 0
            if (r0 == 0) goto La
            r5.u(r1)
        La:
            if (r6 == 0) goto L16
            r5.l()     // Catch: java.io.IOException -> L10
            goto L16
        L10:
            r0 = move-exception
            vq.c r2 = org.eclipse.jetty.client.HttpDestination.f76560s
            r2.g(r0)
        L16:
            org.eclipse.jetty.client.a r0 = r4.f76565f
            boolean r0 = r0.isStarted()
            if (r0 != 0) goto L1f
            return
        L1f:
            if (r6 != 0) goto L50
            hq.k r6 = r5.f()
            boolean r6 = r6.isOpen()
            if (r6 == 0) goto L50
            monitor-enter(r4)
            java.util.List<dq.i> r6 = r4.f76561b     // Catch: java.lang.Throwable -> L4d
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L4d
            if (r6 != 0) goto L3d
            r5.t()     // Catch: java.lang.Throwable -> L4d
            java.util.List<dq.a> r6 = r4.f76564e     // Catch: java.lang.Throwable -> L4d
            r6.add(r5)     // Catch: java.lang.Throwable -> L4d
            goto L48
        L3d:
            java.util.List<dq.i> r6 = r4.f76561b     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r6 = r6.remove(r1)     // Catch: java.lang.Throwable -> L4d
            dq.i r6 = (dq.i) r6     // Catch: java.lang.Throwable -> L4d
            r4.u(r5, r6)     // Catch: java.lang.Throwable -> L4d
        L48:
            r4.notifyAll()     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4d
            goto L9c
        L4d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4d
            throw r5
        L50:
            monitor-enter(r4)
            java.util.List<dq.a> r6 = r4.f76562c     // Catch: java.lang.Throwable -> L9d
            r6.remove(r5)     // Catch: java.lang.Throwable -> L9d
            java.util.List<dq.i> r5 = r4.f76561b     // Catch: java.lang.Throwable -> L9d
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L9d
            r6 = 1
            if (r5 == 0) goto L82
            org.eclipse.jetty.client.a r5 = r4.f76565f     // Catch: java.lang.Throwable -> L9d
            boolean r5 = r5.N0()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L8e
            java.util.List<gq.g> r5 = r4.f76577r     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L71
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L8e
        L71:
            java.util.List<dq.a> r5 = r4.f76562c     // Catch: java.lang.Throwable -> L9d
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L8e
            java.util.List<dq.a> r5 = r4.f76564e     // Catch: java.lang.Throwable -> L9d
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L8e
            goto L8f
        L82:
            org.eclipse.jetty.client.a r5 = r4.f76565f     // Catch: java.lang.Throwable -> L9d
            boolean r5 = r5.isStarted()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L8e
            r3 = r1
            r1 = r6
            r6 = r3
            goto L8f
        L8e:
            r6 = r1
        L8f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L95
            r4.z()
        L95:
            if (r6 == 0) goto L9c
            org.eclipse.jetty.client.a r5 = r4.f76565f
            r5.P0(r4)
        L9c:
            return
        L9d:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.client.HttpDestination.s(dq.a, boolean):void");
    }

    public void t(dq.a aVar) {
        boolean z10;
        boolean z11;
        List<g> list;
        aVar.a(aVar.f() != null ? aVar.f().d() : -1L);
        synchronized (this) {
            this.f76564e.remove(aVar);
            this.f76562c.remove(aVar);
            z10 = true;
            z11 = false;
            if (this.f76561b.isEmpty()) {
                if (!this.f76565f.N0() || (((list = this.f76577r) != null && !list.isEmpty()) || !this.f76562c.isEmpty() || !this.f76564e.isEmpty())) {
                    z10 = false;
                }
                z11 = z10;
                z10 = false;
            } else if (!this.f76565f.isStarted()) {
                z10 = false;
            }
        }
        if (z10) {
            z();
        }
        if (z11) {
            this.f76565f.P0(this);
        }
    }

    public synchronized String toString() {
        return String.format("HttpDestination@%x//%s:%d(%d/%d,%d,%d/%d)%n", Integer.valueOf(hashCode()), this.f76566g.a(), Integer.valueOf(this.f76566g.b()), Integer.valueOf(this.f76562c.size()), Integer.valueOf(this.f76570k), Integer.valueOf(this.f76564e.size()), Integer.valueOf(this.f76561b.size()), Integer.valueOf(this.f76571l));
    }

    public void u(dq.a aVar, i iVar) throws IOException {
        synchronized (this) {
            if (!aVar.r(iVar)) {
                if (iVar.s() <= 1) {
                    this.f76561b.add(0, iVar);
                }
                t(aVar);
            }
        }
    }

    public void v(i iVar) throws IOException {
        iVar.Y(1);
        LinkedList<String> linkedListH0 = this.f76565f.H0();
        if (linkedListH0 != null) {
            for (int size = linkedListH0.size(); size > 0; size--) {
                String str = linkedListH0.get(size - 1);
                try {
                    iVar.N((dq.g) Class.forName(str).getDeclaredConstructor(HttpDestination.class, i.class).newInstance(this, iVar));
                } catch (Exception e10) {
                    throw new IOException("Unable to instantiate registered listener for destination: " + str, e10) { // from class: org.eclipse.jetty.client.HttpDestination.1
                        public final /* synthetic */ Exception val$e;

                        {
                            this.val$e = e10;
                            initCause(e10);
                        }
                    };
                }
            }
        }
        if (this.f76565f.L0()) {
            iVar.N(new eq.f(this, iVar));
        }
        d(iVar);
    }

    @Override // uq.e
    public void w(Appendable appendable, String str) throws IOException {
        synchronized (this) {
            appendable.append(String.valueOf(this));
            appendable.append("idle=");
            appendable.append(String.valueOf(this.f76564e.size()));
            appendable.append(" pending=");
            appendable.append(String.valueOf(this.f76572m));
            appendable.append("\n");
            uq.b.p0(appendable, str, this.f76562c);
        }
    }

    public void x(dq.b bVar) {
        this.f76574o = bVar;
    }

    public void y(eq.a aVar) {
        this.f76575p = aVar;
    }

    public void z() {
        try {
            synchronized (this) {
                this.f76572m++;
            }
            a.b bVar = this.f76565f.f76586v;
            if (bVar != null) {
                bVar.G(this);
            }
        } catch (Exception e10) {
            f76560s.b(e10);
            o(e10);
        }
    }
}
