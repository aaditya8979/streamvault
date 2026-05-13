package org.eclipse.jetty.client;

import ar.e;
import dq.i;
import gq.d;
import gq.l;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.eclipse.jetty.io.Buffers;
import uq.f;

/* JADX INFO: compiled from: HttpClient.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends uq.b implements d, sq.b {
    public e A;
    public dq.b B;
    public eq.a C;
    public Set<String> D;
    public int E;
    public int F;
    public LinkedList<String> G;
    public final yq.b H;
    public eq.e I;
    public sq.c J;
    public final gq.e K;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f76578n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f76579o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f76580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f76581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f76582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f76583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ConcurrentMap<dq.b, HttpDestination> f76584t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ar.d f76585u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f76586v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f76587w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f76588x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f76589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f76590z;

    /* JADX INFO: renamed from: org.eclipse.jetty.client.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpClient.java */
    public class RunnableC0912a implements Runnable {
        public RunnableC0912a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (a.this.isRunning()) {
                a.this.f76590z.m(System.currentTimeMillis());
                a.this.A.m(a.this.f76590z.e());
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: HttpClient.java */
    public interface b extends f {
        void G(HttpDestination httpDestination) throws IOException;
    }

    /* JADX INFO: compiled from: HttpClient.java */
    public static class c extends ar.b {
        public c() {
        }

        public /* synthetic */ c(RunnableC0912a runnableC0912a) {
            this();
        }
    }

    public a() {
        this(new yq.b());
    }

    public a(yq.b bVar) {
        this.f76578n = 2;
        this.f76579o = true;
        this.f76580p = true;
        this.f76581q = false;
        this.f76582r = Integer.MAX_VALUE;
        this.f76583s = Integer.MAX_VALUE;
        this.f76584t = new ConcurrentHashMap();
        this.f76587w = 20000L;
        this.f76588x = 320000L;
        this.f76589y = 75000;
        this.f76590z = new e();
        this.A = new e();
        this.E = 3;
        this.F = 20;
        this.J = new sq.c();
        gq.e eVar = new gq.e();
        this.K = eVar;
        this.H = bVar;
        m0(bVar);
        m0(eVar);
    }

    public int A0() {
        return this.f76589y;
    }

    public HttpDestination B0(dq.b bVar, boolean z10) throws IOException {
        return C0(bVar, z10, I0());
    }

    public HttpDestination C0(dq.b bVar, boolean z10, yq.b bVar2) throws IOException {
        Set<String> set;
        if (bVar == null) {
            throw new UnknownHostException("Remote socket address cannot be null.");
        }
        HttpDestination httpDestination = this.f76584t.get(bVar);
        if (httpDestination != null) {
            return httpDestination;
        }
        HttpDestination httpDestination2 = new HttpDestination(this, bVar, z10, bVar2);
        if (this.B != null && ((set = this.D) == null || !set.contains(bVar.a()))) {
            httpDestination2.x(this.B);
            eq.a aVar = this.C;
            if (aVar != null) {
                httpDestination2.y(aVar);
            }
        }
        HttpDestination httpDestinationPutIfAbsent = this.f76584t.putIfAbsent(bVar, httpDestination2);
        return httpDestinationPutIfAbsent != null ? httpDestinationPutIfAbsent : httpDestination2;
    }

    public long D0() {
        return this.f76587w;
    }

    public int E0() {
        return this.f76582r;
    }

    public int F0() {
        return this.f76583s;
    }

    public eq.e G0() {
        return this.I;
    }

    public LinkedList<String> H0() {
        return this.G;
    }

    public yq.b I0() {
        return this.H;
    }

    public ar.d J0() {
        return this.f76585u;
    }

    public long K0() {
        return this.f76588x;
    }

    @Override // gq.d
    public Buffers L() {
        return this.K.L();
    }

    public boolean L0() {
        return this.I != null;
    }

    public boolean M0() {
        return this.f76580p;
    }

    public boolean N0() {
        return this.f76581q;
    }

    public int O0() {
        return this.E;
    }

    public void P0(HttpDestination httpDestination) {
        this.f76584t.remove(httpDestination.f(), httpDestination);
    }

    public void Q0(e.a aVar) {
        this.f76590z.g(aVar);
    }

    public void R0(e.a aVar, long j10) {
        e eVar = this.f76590z;
        eVar.h(aVar, j10 - eVar.d());
    }

    public void S0(e.a aVar) {
        this.A.g(aVar);
    }

    public void T0(i iVar) throws IOException {
        B0(iVar.j(), l.f62876b.R(iVar.r())).v(iVar);
    }

    public final void U0() {
        if (this.f76578n == 0) {
            gq.e eVar = this.K;
            Buffers.Type type = Buffers.Type.BYTE_ARRAY;
            eVar.n0(type);
            this.K.o0(type);
            this.K.p0(type);
            this.K.q0(type);
            return;
        }
        gq.e eVar2 = this.K;
        Buffers.Type type2 = Buffers.Type.DIRECT;
        eVar2.n0(type2);
        this.K.o0(this.f76579o ? type2 : Buffers.Type.INDIRECT);
        this.K.p0(type2);
        gq.e eVar3 = this.K;
        if (!this.f76579o) {
            type2 = Buffers.Type.INDIRECT;
        }
        eVar3.q0(type2);
    }

    public void V0(int i10) {
        this.f76589y = i10;
    }

    @Override // gq.d
    public Buffers W() {
        return this.K.W();
    }

    public void W0(int i10) {
        this.E = i10;
    }

    public void X0(ar.d dVar) {
        w0(this.f76585u);
        this.f76585u = dVar;
        m0(dVar);
    }

    public void Y0(long j10) {
        this.f76588x = j10;
    }

    @Override // sq.b
    public void a(String str, Object obj) {
        this.J.a(str, obj);
    }

    @Override // uq.b, uq.a
    public void d0() throws Exception {
        U0();
        this.f76590z.i(this.f76588x);
        this.f76590z.j();
        this.A.i(this.f76587w);
        this.A.j();
        if (this.f76585u == null) {
            c cVar = new c(null);
            cVar.D0(16);
            cVar.C0(true);
            cVar.E0("HttpClient");
            this.f76585u = cVar;
            n0(cVar, true);
        }
        b bVar = this.f76578n == 2 ? new org.eclipse.jetty.client.b(this) : new org.eclipse.jetty.client.c(this);
        this.f76586v = bVar;
        n0(bVar, true);
        super.d0();
        this.f76585u.Z(new RunnableC0912a());
    }

    @Override // uq.b, uq.a
    public void e0() throws Exception {
        Iterator<HttpDestination> it = this.f76584t.values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f76590z.b();
        this.A.b();
        super.e0();
        ar.d dVar = this.f76585u;
        if (dVar instanceof c) {
            w0(dVar);
            this.f76585u = null;
        }
        w0(this.f76586v);
    }

    @Override // sq.b
    public Object getAttribute(String str) {
        return this.J.getAttribute(str);
    }

    @Override // sq.b
    public void removeAttribute(String str) {
        this.J.removeAttribute(str);
    }

    @Override // sq.b
    public void u() {
        this.J.u();
    }

    public void z0(e.a aVar) {
        aVar.c();
    }
}
