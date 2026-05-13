package ga;

import ga.i;
import ha.b;
import ia.c;
import z9.c;

/* JADX INFO: compiled from: DownloadMgrInitialParams.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f62257a;

    /* JADX INFO: compiled from: DownloadMgrInitialParams.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.InterfaceC0786c f62258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f62259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.e f62260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.b f62261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.a f62262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c.d f62263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public i f62264g;

        public String toString() {
            return ia.f.o("component: database[%s], maxNetworkCount[%s], outputStream[%s], connection[%s], connectionCountAdapter[%s]", this.f62258a, this.f62259b, this.f62260c, this.f62261d, this.f62262e);
        }
    }

    public c() {
        this.f62257a = null;
    }

    public c(a aVar) {
        this.f62257a = aVar;
    }

    public c.a a() {
        c.a aVar;
        a aVar2 = this.f62257a;
        if (aVar2 != null && (aVar = aVar2.f62262e) != null) {
            if (ia.d.f64033a) {
                ia.d.a(this, "initial FileDownloader manager with the customize connection count adapter: %s", aVar);
            }
            return aVar;
        }
        return d();
    }

    public c.b b() {
        c.b bVar;
        a aVar = this.f62257a;
        if (aVar != null && (bVar = aVar.f62261d) != null) {
            if (ia.d.f64033a) {
                ia.d.a(this, "initial FileDownloader manager with the customize connection creator: %s", bVar);
            }
            return bVar;
        }
        return e();
    }

    public aa.a c() {
        c.InterfaceC0786c interfaceC0786c;
        a aVar = this.f62257a;
        if (aVar == null || (interfaceC0786c = aVar.f62258a) == null) {
            return f();
        }
        aa.a aVarA = interfaceC0786c.a();
        if (aVarA == null) {
            return f();
        }
        if (ia.d.f64033a) {
            ia.d.a(this, "initial FileDownloader manager with the customize database: %s", aVarA);
        }
        return aVarA;
    }

    public final c.a d() {
        return new z9.a();
    }

    public final c.b e() {
        return new c.b();
    }

    public final aa.a f() {
        return new aa.c();
    }

    public final i g() {
        return new i.b().b(true).a();
    }

    public final c.d h() {
        return new b();
    }

    public final c.e i() {
        return new b.a();
    }

    public i j() {
        i iVar;
        a aVar = this.f62257a;
        if (aVar != null && (iVar = aVar.f62264g) != null) {
            if (ia.d.f64033a) {
                ia.d.a(this, "initial FileDownloader manager with the customize foreground service config: %s", iVar);
            }
            return iVar;
        }
        return g();
    }

    public c.d k() {
        c.d dVar;
        a aVar = this.f62257a;
        if (aVar != null && (dVar = aVar.f62263f) != null) {
            if (ia.d.f64033a) {
                ia.d.a(this, "initial FileDownloader manager with the customize id generator: %s", dVar);
            }
            return dVar;
        }
        return h();
    }

    public c.e l() {
        c.e eVar;
        a aVar = this.f62257a;
        if (aVar != null && (eVar = aVar.f62260c) != null) {
            if (ia.d.f64033a) {
                ia.d.a(this, "initial FileDownloader manager with the customize output stream: %s", eVar);
            }
            return eVar;
        }
        return i();
    }

    public final int m() {
        return ia.e.a().f64038e;
    }

    public int n() {
        Integer num;
        a aVar = this.f62257a;
        if (aVar != null && (num = aVar.f62259b) != null) {
            if (ia.d.f64033a) {
                ia.d.a(this, "initial FileDownloader manager with the customize maxNetworkThreadCount: %d", num);
            }
            return ia.e.b(num.intValue());
        }
        return m();
    }
}
