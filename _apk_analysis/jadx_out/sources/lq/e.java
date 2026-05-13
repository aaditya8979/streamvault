package lq;

import kq.a;
import kq.g;
import mq.v;
import zm.p;

/* JADX INFO: compiled from: LoginAuthenticator.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class e implements kq.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f73912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kq.f f73913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f73914c;

    @Override // kq.a
    public void b(a.InterfaceC0866a interfaceC0866a) {
        g gVarS = interfaceC0866a.S();
        this.f73912a = gVarS;
        if (gVarS == null) {
            throw new IllegalStateException("No LoginService for " + this + " in " + interfaceC0866a);
        }
        kq.f fVarE = interfaceC0866a.e();
        this.f73913b = fVarE;
        if (fVarE != null) {
            this.f73914c = interfaceC0866a.z();
            return;
        }
        throw new IllegalStateException("No IdentityService for " + this + " in " + interfaceC0866a);
    }

    public g d() {
        return this.f73912a;
    }

    public v e(String str, Object obj, p pVar) {
        v vVarD = this.f73912a.d(str, obj);
        if (vVarD == null) {
            return null;
        }
        f((an.a) pVar, null);
        return vVarD;
    }

    public an.e f(an.a aVar, an.c cVar) {
        an.e eVarP = aVar.p(false);
        if (this.f73914c && eVarP != null && eVarP.getAttribute("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated") != Boolean.TRUE) {
            synchronized (this) {
                eVarP = qq.c.y0(aVar, eVarP, true);
            }
        }
        return eVarP;
    }
}
