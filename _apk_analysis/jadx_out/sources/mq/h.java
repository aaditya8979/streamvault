package mq;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import org.eclipse.jetty.util.MultiMap;

/* JADX INFO: compiled from: Dispatcher.java */
/* JADX INFO: loaded from: classes9.dex */
public class h implements zm.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oq.c f74914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f74917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f74918e = null;

    /* JADX INFO: compiled from: Dispatcher.java */
    public class a implements sq.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final sq.b f74919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f74920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f74921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f74922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f74923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f74924g;

        public a(sq.b bVar) {
            this.f74919b = bVar;
        }

        @Override // sq.b
        public void a(String str, Object obj) {
            if (h.this.f74918e != null || !str.startsWith("javax.servlet.")) {
                if (obj == null) {
                    this.f74919b.removeAttribute(str);
                    return;
                } else {
                    this.f74919b.a(str, obj);
                    return;
                }
            }
            if (str.equals("javax.servlet.forward.path_info")) {
                this.f74923f = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.request_uri")) {
                this.f74920c = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.servlet_path")) {
                this.f74922e = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.context_path")) {
                this.f74921d = (String) obj;
                return;
            }
            if (str.equals("javax.servlet.forward.query_string")) {
                this.f74924g = (String) obj;
            } else if (obj == null) {
                this.f74919b.removeAttribute(str);
            } else {
                this.f74919b.a(str, obj);
            }
        }

        @Override // sq.b
        public Object getAttribute(String str) {
            if (h.this.f74918e == null) {
                if (str.equals("javax.servlet.forward.path_info")) {
                    return this.f74923f;
                }
                if (str.equals("javax.servlet.forward.request_uri")) {
                    return this.f74920c;
                }
                if (str.equals("javax.servlet.forward.servlet_path")) {
                    return this.f74922e;
                }
                if (str.equals("javax.servlet.forward.context_path")) {
                    return this.f74921d;
                }
                if (str.equals("javax.servlet.forward.query_string")) {
                    return this.f74924g;
                }
            }
            if (str.startsWith("javax.servlet.include.")) {
                return null;
            }
            return this.f74919b.getAttribute(str);
        }

        @Override // sq.b
        public void removeAttribute(String str) {
            a(str, null);
        }

        public String toString() {
            return "FORWARD+" + this.f74919b.toString();
        }

        @Override // sq.b
        public void u() {
            throw new IllegalStateException();
        }
    }

    public h(oq.c cVar, String str, String str2, String str3) {
        this.f74914a = cVar;
        this.f74915b = str;
        this.f74916c = str2;
        this.f74917d = str3;
    }

    @Override // zm.h
    public void a(zm.p pVar, zm.t tVar) throws ServletException, IOException {
        e(pVar, tVar, DispatcherType.FORWARD);
    }

    public final void c(zm.t tVar, n nVar) throws IOException {
        if (nVar.M().x()) {
            try {
                tVar.h().close();
            } catch (IllegalStateException unused) {
                tVar.e().close();
            }
        } else {
            try {
                tVar.e().close();
            } catch (IllegalStateException unused2) {
                tVar.h().close();
            }
        }
    }

    public void d(zm.p pVar, zm.t tVar) throws ServletException, IOException {
        e(pVar, tVar, DispatcherType.ERROR);
    }

    public void e(zm.p pVar, zm.t tVar, DispatcherType dispatcherType) throws ServletException, IOException {
        n nVarX = pVar instanceof n ? (n) pVar : b.o().x();
        o oVarM = nVarX.M();
        tVar.c();
        oVarM.t();
        if (!(pVar instanceof an.a)) {
            pVar = new q(pVar);
        }
        if (!(tVar instanceof an.c)) {
            tVar = new r(tVar);
        }
        boolean zX = nVarX.X();
        String strV = nVarX.v();
        String strE = nVarX.e();
        String strT = nVarX.t();
        String strL = nVarX.l();
        String strI = nVarX.i();
        sq.b bVarZ = nVarX.z();
        DispatcherType dispatcherTypeF = nVarX.F();
        MultiMap<String> multiMapI = nVarX.I();
        try {
            nVarX.m0(false);
            nVarX.l0(dispatcherType);
            String str = this.f74918e;
            if (str != null) {
                this.f74914a.a0(str, nVarX, (an.a) pVar, (an.c) tVar);
            } else {
                String str2 = this.f74917d;
                if (str2 != null) {
                    if (multiMapI == null) {
                        nVarX.x();
                        multiMapI = nVarX.I();
                    }
                    nVarX.Z(str2);
                }
                a aVar = new a(bVarZ);
                if (bVarZ.getAttribute("javax.servlet.forward.request_uri") != null) {
                    aVar.f74923f = (String) bVarZ.getAttribute("javax.servlet.forward.path_info");
                    aVar.f74924g = (String) bVarZ.getAttribute("javax.servlet.forward.query_string");
                    aVar.f74920c = (String) bVarZ.getAttribute("javax.servlet.forward.request_uri");
                    aVar.f74921d = (String) bVarZ.getAttribute("javax.servlet.forward.context_path");
                    aVar.f74922e = (String) bVarZ.getAttribute("javax.servlet.forward.servlet_path");
                } else {
                    aVar.f74923f = strL;
                    aVar.f74924g = strI;
                    aVar.f74920c = strV;
                    aVar.f74921d = strE;
                    aVar.f74922e = strT;
                }
                nVarX.v0(this.f74915b);
                nVarX.k0(this.f74914a.U0());
                nVarX.B0(null);
                nVarX.p0(this.f74915b);
                nVarX.f0(aVar);
                this.f74914a.a0(this.f74916c, nVarX, (an.a) pVar, (an.c) tVar);
                if (!nVarX.y().p()) {
                    c(tVar, nVarX);
                }
            }
        } finally {
            nVarX.m0(zX);
            nVarX.v0(strV);
            nVarX.k0(strE);
            nVarX.B0(strT);
            nVarX.p0(strL);
            nVarX.f0(bVarZ);
            nVarX.o0(multiMapI);
            nVarX.s0(strI);
            nVarX.l0(dispatcherTypeF);
        }
    }
}
