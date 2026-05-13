package mq;

import ar.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.c;
import org.eclipse.jetty.continuation.ContinuationThrowable;

/* JADX INFO: compiled from: AsyncContinuation.java */
/* JADX INFO: loaded from: classes7.dex */
public class c implements zm.a, fq.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final vq.c f74888n = vq.b.a(c.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ContinuationThrowable f74889o = new ContinuationThrowable();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mq.b f74890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<zm.c> f74891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<zm.c> f74892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<fq.b> f74893d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f74896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f74897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f74898i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f74900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f74901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f74902m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f74899j = 30000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f74894e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f74895f = true;

    /* JADX INFO: compiled from: AsyncContinuation.java */
    public class a extends zm.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final zm.k f74903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public zm.k f74904f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f74905g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public e.a f74906h;

        public a(zm.k kVar, zm.p pVar, zm.t tVar) {
            super(c.this, pVar, tVar);
            this.f74906h = c.this.new b();
            this.f74903e = kVar;
            n nVarX = c.this.f74890a.x();
            if (nVarX.getAttribute("javax.servlet.async.request_uri") == null) {
                String str = (String) nVarX.getAttribute("javax.servlet.forward.request_uri");
                if (str != null) {
                    nVarX.a("javax.servlet.async.request_uri", str);
                    nVarX.a("javax.servlet.async.context_path", nVarX.getAttribute("javax.servlet.forward.context_path"));
                    nVarX.a("javax.servlet.async.servlet_path", nVarX.getAttribute("javax.servlet.forward.servlet_path"));
                    nVarX.a("javax.servlet.async.path_info", nVarX.getAttribute("javax.servlet.forward.path_info"));
                    nVarX.a("javax.servlet.async.query_string", nVarX.getAttribute("javax.servlet.forward.query_string"));
                    return;
                }
                nVarX.a("javax.servlet.async.request_uri", nVarX.v());
                nVarX.a("javax.servlet.async.context_path", nVarX.e());
                nVarX.a("javax.servlet.async.servlet_path", nVarX.t());
                nVarX.a("javax.servlet.async.path_info", nVarX.l());
                nVarX.a("javax.servlet.async.query_string", nVarX.i());
            }
        }

        public String g() {
            return this.f74905g;
        }

        public zm.k h() {
            zm.k kVar = this.f74904f;
            return kVar == null ? this.f74903e : kVar;
        }

        public void i(String str) {
            this.f74905g = str;
        }
    }

    /* JADX INFO: compiled from: AsyncContinuation.java */
    public class b extends e.a implements Runnable {
        public b() {
        }

        @Override // ar.e.a
        public void f() {
            c.this.i();
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.i();
        }
    }

    public boolean A() {
        synchronized (this) {
            int i10 = this.f74894e;
            if (i10 == 0) {
                throw new IllegalStateException(m());
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f74895f = false;
                    this.f74894e = 4;
                    x();
                    int i11 = this.f74894e;
                    if (i11 == 4) {
                        return true;
                    }
                    if (i11 == 7) {
                        this.f74894e = 8;
                        return true;
                    }
                    this.f74895f = false;
                    this.f74894e = 6;
                    return false;
                }
                if (i10 == 3) {
                    this.f74895f = false;
                    this.f74894e = 6;
                    return false;
                }
                if (i10 != 6) {
                    if (i10 != 7) {
                        throw new IllegalStateException(m());
                    }
                    this.f74895f = false;
                    this.f74894e = 8;
                    return true;
                }
            }
            this.f74894e = 8;
            return true;
        }
    }

    @Override // zm.a
    public void a(long j10) {
        synchronized (this) {
            this.f74899j = j10;
        }
    }

    @Override // zm.a
    public void b(zm.c cVar) {
        synchronized (this) {
            if (this.f74892c == null) {
                this.f74892c = new ArrayList();
            }
            this.f74892c.add(cVar);
        }
    }

    public void c() {
        synchronized (this) {
            d();
            this.f74893d = null;
        }
    }

    @Override // zm.a
    public void complete() {
        synchronized (this) {
            int i10 = this.f74894e;
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f74894e = 7;
                    return;
                }
                if (i10 == 4) {
                    this.f74894e = 7;
                    boolean z10 = !this.f74897h;
                    if (z10) {
                        d();
                        w();
                        return;
                    }
                    return;
                }
                if (i10 != 6) {
                    throw new IllegalStateException(m());
                }
            }
            throw new IllegalStateException(m());
        }
    }

    public void d() {
        hq.k kVarF = this.f74890a.f();
        if (kVarF.g()) {
            synchronized (this) {
                this.f74901l = 0L;
                notifyAll();
            }
        } else {
            a aVar = this.f74900k;
            if (aVar != null) {
                ((hq.c) kVarF).n(aVar.f74906h);
            }
        }
    }

    public void e() {
        synchronized (this) {
            int i10 = this.f74894e;
            if (i10 == 2) {
                this.f74894e = 3;
                this.f74896g = true;
                return;
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new IllegalStateException(m());
                }
                return;
            }
            boolean z10 = !this.f74897h;
            this.f74894e = 5;
            this.f74896g = true;
            if (z10) {
                d();
                w();
            }
        }
    }

    public void f(Throwable th2) {
        List<fq.b> list;
        List<zm.c> list2;
        synchronized (this) {
            if (this.f74894e != 8) {
                throw new IllegalStateException(m());
            }
            this.f74894e = 9;
            list = this.f74893d;
            list2 = this.f74892c;
        }
        if (list2 != null) {
            for (zm.c cVar : list2) {
                if (th2 != null) {
                    try {
                        this.f74900k.a().a("javax.servlet.error.exception", th2);
                        this.f74900k.a().a("javax.servlet.error.message", th2.getMessage());
                        cVar.y(this.f74900k);
                    } catch (Exception e10) {
                        f74888n.e(e10);
                    }
                } else {
                    cVar.i(this.f74900k);
                }
            }
        }
        if (list != null) {
            Iterator<fq.b> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().x(this);
                } catch (Exception e11) {
                    f74888n.e(e11);
                }
            }
        }
    }

    public final void g(zm.k kVar, zm.p pVar, zm.t tVar) {
        synchronized (this) {
            int i10 = this.f74894e;
            if (i10 != 1 && i10 != 6) {
                throw new IllegalStateException(m());
            }
            this.f74896g = false;
            this.f74897h = false;
            a aVar = this.f74900k;
            if (aVar != null && pVar == aVar.a() && tVar == this.f74900k.b() && kVar == this.f74900k.h()) {
                this.f74900k.f74904f = null;
                this.f74900k.f74905g = null;
            } else {
                this.f74900k = new a(kVar, pVar, tVar);
            }
            this.f74894e = 2;
            List<zm.c> list = this.f74891b;
            this.f74891b = this.f74892c;
            this.f74892c = list;
            if (list != null) {
                list.clear();
            }
        }
        List<zm.c> list2 = this.f74891b;
        if (list2 != null) {
            Iterator<zm.c> it = list2.iterator();
            while (it.hasNext()) {
                try {
                    it.next().f(this.f74900k);
                } catch (Exception e10) {
                    f74888n.e(e10);
                }
            }
        }
    }

    @Override // zm.a
    public zm.t getResponse() {
        a aVar;
        return (!this.f74898i || (aVar = this.f74900k) == null || aVar.b() == null) ? this.f74890a.B() : this.f74900k.b();
    }

    public void h() {
        synchronized (this) {
            int i10 = this.f74894e;
            if (i10 == 2 || i10 == 3) {
                this.f74894e = 7;
                this.f74896g = false;
            } else if (i10 != 7) {
                throw new IllegalStateException(m());
            }
        }
    }

    public void i() {
        synchronized (this) {
            int i10 = this.f74894e;
            if (i10 == 2 || i10 == 4) {
                List<fq.b> list = this.f74893d;
                List<zm.c> list2 = this.f74892c;
                this.f74897h = true;
                if (list2 != null) {
                    Iterator<zm.c> it = list2.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().p(this.f74900k);
                        } catch (Exception e10) {
                            f74888n.b(e10);
                            this.f74890a.x().a("javax.servlet.error.exception", e10);
                        }
                    }
                }
                if (list != null) {
                    Iterator<fq.b> it2 = list.iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().b(this);
                        } catch (Exception e11) {
                            f74888n.e(e11);
                        }
                    }
                }
                synchronized (this) {
                    int i11 = this.f74894e;
                    if (i11 == 2 || i11 == 4) {
                        e();
                    } else if (!this.f74902m) {
                        this.f74897h = false;
                    }
                }
                w();
            }
        }
    }

    public a j() {
        a aVar;
        synchronized (this) {
            aVar = this.f74900k;
        }
        return aVar;
    }

    public oq.c k() {
        a aVar = this.f74900k;
        if (aVar != null) {
            return ((c.d) aVar.h()).b();
        }
        return null;
    }

    public zm.p l() {
        a aVar = this.f74900k;
        return aVar != null ? aVar.a() : this.f74890a.x();
    }

    public String m() {
        String str;
        String string;
        synchronized (this) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = this.f74894e;
            if (i10 == 0) {
                str = "IDLE";
            } else if (i10 == 1) {
                str = "DISPATCHED";
            } else if (i10 == 2) {
                str = "ASYNCSTARTED";
            } else if (i10 == 4) {
                str = "ASYNCWAIT";
            } else if (i10 == 3) {
                str = "REDISPATCHING";
            } else if (i10 == 5) {
                str = "REDISPATCH";
            } else if (i10 == 6) {
                str = "REDISPATCHED";
            } else if (i10 == 7) {
                str = "COMPLETING";
            } else if (i10 == 8) {
                str = "UNCOMPLETED";
            } else if (i10 == 9) {
                str = "COMPLETE";
            } else {
                str = "UNKNOWN?" + this.f74894e;
            }
            sb2.append(str);
            sb2.append(this.f74895f ? ",initial" : "");
            sb2.append(this.f74896g ? ",resumed" : "");
            sb2.append(this.f74897h ? ",expired" : "");
            string = sb2.toString();
        }
        return string;
    }

    public boolean n() {
        synchronized (this) {
            this.f74902m = false;
            int i10 = this.f74894e;
            if (i10 != 0) {
                if (i10 == 7) {
                    this.f74894e = 8;
                    return false;
                }
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 5) {
                    throw new IllegalStateException(m());
                }
                this.f74894e = 6;
                return true;
            }
            this.f74895f = true;
            this.f74894e = 1;
            List<zm.c> list = this.f74891b;
            if (list != null) {
                list.clear();
            }
            List<zm.c> list2 = this.f74892c;
            if (list2 != null) {
                list2.clear();
            } else {
                this.f74892c = this.f74891b;
                this.f74891b = null;
            }
            return true;
        }
    }

    public boolean o() {
        synchronized (this) {
            int i10 = this.f74894e;
            return (i10 == 0 || i10 == 1 || i10 == 8 || i10 == 9) ? false : true;
        }
    }

    public boolean p() {
        synchronized (this) {
            int i10 = this.f74894e;
            return i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
        }
    }

    public boolean q() {
        return this.f74902m;
    }

    public boolean r() {
        boolean z10;
        synchronized (this) {
            z10 = this.f74897h;
        }
        return z10;
    }

    public boolean s() {
        boolean z10;
        synchronized (this) {
            z10 = this.f74895f;
        }
        return z10;
    }

    public boolean t() {
        synchronized (this) {
            int i10 = this.f74894e;
            return i10 == 2 || i10 == 3 || i10 == 4 || i10 == 7;
        }
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = super.toString() + "@" + m();
        }
        return str;
    }

    public boolean u() {
        boolean z10;
        synchronized (this) {
            z10 = this.f74894e == 8;
        }
        return z10;
    }

    public void v() {
        synchronized (this) {
            int i10 = this.f74894e;
            if (i10 == 1 || i10 == 6) {
                throw new IllegalStateException(m());
            }
            this.f74894e = 0;
            this.f74895f = true;
            this.f74896g = false;
            this.f74897h = false;
            this.f74898i = false;
            d();
            this.f74899j = 30000L;
            this.f74893d = null;
        }
    }

    public void w() {
        hq.k kVarF = this.f74890a.f();
        if (kVarF.g()) {
            return;
        }
        ((hq.c) kVarF).y();
    }

    public void x() {
        hq.k kVarF = this.f74890a.f();
        if (this.f74899j > 0) {
            if (!kVarF.g()) {
                ((hq.c) kVarF).b(this.f74900k.f74906h, this.f74899j);
                return;
            }
            synchronized (this) {
                this.f74901l = System.currentTimeMillis() + this.f74899j;
                long jCurrentTimeMillis = this.f74899j;
                while (this.f74901l > 0 && jCurrentTimeMillis > 0 && this.f74890a.D().isRunning()) {
                    try {
                        wait(jCurrentTimeMillis);
                    } catch (InterruptedException e10) {
                        f74888n.g(e10);
                    }
                    jCurrentTimeMillis = this.f74901l - System.currentTimeMillis();
                }
                if (this.f74901l > 0 && jCurrentTimeMillis <= 0 && this.f74890a.D().isRunning()) {
                    i();
                }
            }
        }
    }

    public void y(mq.b bVar) {
        synchronized (this) {
            this.f74890a = bVar;
        }
    }

    public void z() {
        this.f74898i = false;
        this.f74902m = false;
        g(this.f74890a.x().getServletContext(), this.f74890a.x(), this.f74890a.B());
    }
}
