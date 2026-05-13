package qq;

import java.io.IOException;
import java.util.EnumSet;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.Cookie;
import mq.i;
import mq.n;
import mq.p;
import mq.t;
import oq.h;

/* JADX INFO: compiled from: SessionHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class g extends h {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final vq.c f78415u = vq.b.b("org.eclipse.jetty.server.session");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final EnumSet<SessionTrackingMode> f78416v = EnumSet.of(SessionTrackingMode.COOKIE, SessionTrackingMode.URL);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f78417t;

    public g() {
        this(new e());
    }

    public g(t tVar) {
        J0(tVar);
    }

    @Override // oq.h
    public void C0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException {
        if (E0()) {
            F0(str, nVar, aVar, cVar);
            return;
        }
        h hVar = this.f76548r;
        if (hVar != null && hVar == this.f76545p) {
            hVar.C0(str, nVar, aVar, cVar);
            return;
        }
        i iVar = this.f76545p;
        if (iVar != null) {
            iVar.a0(str, nVar, aVar, cVar);
        }
    }

    @Override // oq.h
    public void D0(String str, n nVar, an.a aVar, an.c cVar) throws Throwable {
        t tVarS;
        an.e eVarP;
        an.e eVarP2;
        an.e eVar = null;
        try {
            tVarS = nVar.S();
            try {
                eVarP = nVar.p(false);
                try {
                    t tVar = this.f78417t;
                    if (tVarS != tVar) {
                        nVar.D0(tVar);
                        nVar.C0(null);
                        H0(nVar, aVar);
                    }
                    if (this.f78417t != null) {
                        eVarP2 = nVar.p(false);
                        if (eVarP2 == null) {
                            eVarP2 = nVar.a0(this.f78417t);
                            if (eVarP2 != null) {
                                nVar.C0(eVarP2);
                            }
                        } else if (eVarP2 != eVarP) {
                            try {
                                gq.g gVarO = this.f78417t.o(eVarP2, aVar.c());
                                if (gVarO != null) {
                                    nVar.M().q(gVarO);
                                }
                                eVar = eVarP2;
                            } catch (Throwable th2) {
                                th = th2;
                                eVar = eVarP2;
                                if (eVar != null) {
                                    this.f78417t.l(eVar);
                                }
                                an.e eVarP3 = nVar.p(false);
                                if (eVarP3 != null && eVarP == null && eVarP3 != eVar) {
                                    this.f78417t.l(eVarP3);
                                }
                                if (tVarS != null && tVarS != this.f78417t) {
                                    nVar.D0(tVarS);
                                    nVar.C0(eVarP);
                                }
                                throw th;
                            }
                        }
                        an.e eVar2 = eVarP2;
                        eVarP2 = null;
                        eVar = eVar2;
                    } else {
                        eVarP2 = null;
                    }
                    vq.c cVar2 = f78415u;
                    if (cVar2.isDebugEnabled()) {
                        cVar2.h("sessionManager=" + this.f78417t, new Object[0]);
                        cVar2.h("session=" + eVar, new Object[0]);
                    }
                    h hVar = this.f76548r;
                    if (hVar != null) {
                        hVar.D0(str, nVar, aVar, cVar);
                    } else {
                        h hVar2 = this.f76547q;
                        if (hVar2 != null) {
                            hVar2.C0(str, nVar, aVar, cVar);
                        } else {
                            C0(str, nVar, aVar, cVar);
                        }
                    }
                    if (eVarP2 != null) {
                        this.f78417t.l(eVarP2);
                    }
                    an.e eVarP4 = nVar.p(false);
                    if (eVarP4 != null && eVarP == null && eVarP4 != eVarP2) {
                        this.f78417t.l(eVarP4);
                    }
                    if (tVarS == null || tVarS == this.f78417t) {
                        return;
                    }
                    nVar.D0(tVarS);
                    nVar.C0(eVarP);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                eVarP = null;
            }
        } catch (Throwable th5) {
            th = th5;
            tVarS = null;
            eVarP = null;
        }
    }

    public void H0(n nVar, an.a aVar) {
        boolean z10;
        int iIndexOf;
        char cCharAt;
        Cookie[] cookieArrJ;
        String strN = aVar.n();
        t tVarI0 = I0();
        if (strN != null && tVarI0 != null) {
            an.e eVarK = tVarI0.k(strN);
            if (eVarK == null || !tVarI0.y(eVarK)) {
                return;
            }
            nVar.C0(eVarK);
            return;
        }
        if (DispatcherType.REQUEST.equals(nVar.F())) {
            an.e eVarK2 = null;
            if (!this.f78417t.O() || (cookieArrJ = aVar.j()) == null || cookieArrJ.length <= 0) {
                z10 = false;
            } else {
                String name = tVarI0.x().getName();
                int i10 = 0;
                z10 = false;
                while (true) {
                    if (i10 >= cookieArrJ.length) {
                        break;
                    }
                    if (name.equalsIgnoreCase(cookieArrJ[i10].getName())) {
                        strN = cookieArrJ[i10].getValue();
                        vq.c cVar = f78415u;
                        cVar.h("Got Session ID {} from cookie", strN);
                        if (strN != null) {
                            eVarK2 = tVarI0.k(strN);
                            if (eVarK2 != null && tVarI0.y(eVarK2)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            cVar.f("null session id from cookie", new Object[0]);
                        }
                        z10 = true;
                    }
                    i10++;
                }
            }
            if (strN == null || eVarK2 == null) {
                String strV = aVar.v();
                String strY = tVarI0.Y();
                if (strY != null && (iIndexOf = strV.indexOf(strY)) >= 0) {
                    int length = iIndexOf + strY.length();
                    int i11 = length;
                    while (i11 < strV.length() && (cCharAt = strV.charAt(i11)) != ';' && cCharAt != '#' && cCharAt != '?' && cCharAt != '/') {
                        i11++;
                    }
                    strN = strV.substring(length, i11);
                    eVarK2 = tVarI0.k(strN);
                    vq.c cVar2 = f78415u;
                    if (cVar2.isDebugEnabled()) {
                        cVar2.h("Got Session ID {} from URL", strN);
                    }
                    z10 = false;
                }
            }
            nVar.w0(strN);
            nVar.x0(strN != null && z10);
            if (eVarK2 == null || !tVarI0.y(eVarK2)) {
                return;
            }
            nVar.C0(eVarK2);
        }
    }

    public t I0() {
        return this.f78417t;
    }

    public void J0(t tVar) {
        if (isStarted()) {
            throw new IllegalStateException();
        }
        t tVar2 = this.f78417t;
        if (b() != null) {
            b().E0().update((Object) this, (Object) tVar2, (Object) tVar, "sessionManager", true);
        }
        if (tVar != null) {
            tVar.T(this);
        }
        this.f78417t = tVar;
        if (tVar2 != null) {
            tVar2.T(null);
        }
    }

    @Override // oq.h, oq.g, oq.a, uq.b, uq.a
    public void d0() throws Exception {
        this.f78417t.start();
        super.d0();
    }

    @Override // oq.g, oq.a, uq.b, uq.a
    public void e0() throws Exception {
        this.f78417t.stop();
        super.e0();
    }

    @Override // oq.g, oq.a, mq.i
    public void f(p pVar) {
        p pVarB = b();
        if (pVarB != null && pVarB != pVar) {
            pVarB.E0().update((Object) this, (Object) this.f78417t, (Object) null, "sessionManager", true);
        }
        super.f(pVar);
        if (pVar == null || pVar == pVarB) {
            return;
        }
        pVar.E0().update((Object) this, (Object) null, (Object) this.f78417t, "sessionManager", true);
    }
}
