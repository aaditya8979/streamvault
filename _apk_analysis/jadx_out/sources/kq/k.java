package kq;

import java.io.IOException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.DispatcherType;
import javax.servlet.http.HttpSessionEvent;
import kq.a;
import mq.d;
import mq.n;
import mq.o;
import mq.v;
import oq.c;
import org.eclipse.jetty.security.ServerAuthException;

/* JADX INFO: compiled from: SecurityHandler.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class k extends oq.g implements a.InterfaceC0866a {
    public static final vq.c A = vq.b.a(k.class);
    public static Principal B = new b();
    public static Principal C = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kq.a f73544r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f73546t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f73547u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f73549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f73550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f73551y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f73543q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a.b f73545s = new kq.d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<String, String> f73548v = new HashMap();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f73552z = true;

    /* JADX INFO: compiled from: SecurityHandler.java */
    public class a implements an.j {
        public a() {
        }

        @Override // an.j
        public void d(HttpSessionEvent httpSessionEvent) {
        }

        @Override // an.j
        public void s(HttpSessionEvent httpSessionEvent) {
            n nVarX;
            mq.b bVarO = mq.b.o();
            if (bVarO == null || (nVarX = bVarO.x()) == null || !nVarX.c()) {
                return;
            }
            httpSessionEvent.getSession().a("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated", Boolean.TRUE);
        }
    }

    /* JADX INFO: compiled from: SecurityHandler.java */
    public static class b implements Principal {
        @Override // java.security.Principal
        public String getName() {
            return null;
        }

        @Override // java.security.Principal
        public String toString() {
            return "No User";
        }
    }

    /* JADX INFO: compiled from: SecurityHandler.java */
    public static class c implements Principal {
        @Override // java.security.Principal
        public String getName() {
            return "Nobody";
        }

        @Override // java.security.Principal
        public String toString() {
            return getName();
        }
    }

    /* JADX INFO: compiled from: SecurityHandler.java */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73554a;

        static {
            int[] iArr = new int[DispatcherType.values().length];
            f73554a = iArr;
            try {
                iArr[DispatcherType.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73554a[DispatcherType.ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f73554a[DispatcherType.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static k I0() {
        c.d dVarV0 = oq.c.V0();
        if (dVarV0 == null) {
            return null;
        }
        return (k) dVarV0.b().z0(k.class);
    }

    public boolean C0(n nVar) {
        int i10 = d.f73554a[nVar.F().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 != 3 || !this.f73543q || nVar.getAttribute("org.eclipse.jetty.server.welcome") == null) {
            return false;
        }
        nVar.c0("org.eclipse.jetty.server.welcome");
        return true;
    }

    public abstract boolean D0(String str, n nVar, o oVar, Object obj) throws IOException;

    public abstract boolean E0(String str, n nVar, o oVar, Object obj, v vVar) throws IOException;

    public f F0() {
        return (f) b().t0(f.class);
    }

    public g G0() {
        List<g> listV0 = b().v0(g.class);
        String strJ0 = J0();
        if (strJ0 == null) {
            if (listV0.size() == 1) {
                return (g) listV0.get(0);
            }
            return null;
        }
        for (g gVar : listV0) {
            if (gVar.getName() != null && gVar.getName().equals(strJ0)) {
                return gVar;
            }
        }
        return null;
    }

    public kq.a H0() {
        return this.f73544r;
    }

    public String J0() {
        return this.f73546t;
    }

    public abstract boolean K0(n nVar, o oVar, Object obj);

    public void L0(d.h hVar) {
        A.h("logout {}", hVar);
        g gVarS = S();
        if (gVarS != null) {
            gVarS.b(hVar.getUserIdentity());
        }
        f fVarE = e();
        if (fVarE != null) {
            fVarE.c(null);
        }
    }

    public abstract Object M0(String str, n nVar);

    public String N0(String str, String str2) {
        if (isRunning()) {
            throw new IllegalStateException("running");
        }
        return this.f73548v.put(str, str2);
    }

    @Override // kq.a.InterfaceC0866a
    public g S() {
        return this.f73549w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v7, types: [kq.f] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kq.f] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // oq.g, mq.i
    public void a0(String str, n nVar, an.a aVar, an.c cVar) throws Throwable {
        an.c cVar2;
        ?? r32;
        ?? r02;
        mq.d dVarB;
        an.a aVar2;
        d.h hVar;
        Object obj;
        an.a aVarG = aVar;
        an.c cVarO = cVar;
        o oVarM = nVar.M();
        mq.i iVarA0 = A0();
        if (iVarA0 == null) {
            return;
        }
        kq.a aVar3 = this.f73544r;
        if (!C0(nVar)) {
            iVarA0.a0(str, nVar, aVarG, cVarO);
            return;
        }
        Object objM0 = M0(str, nVar);
        if (!D0(str, nVar, oVarM, objM0)) {
            if (nVar.X()) {
                return;
            }
            cVarO.o(403);
            nVar.m0(true);
            return;
        }
        boolean zK0 = K0(nVar, oVarM, objM0);
        if (zK0 && aVar3 == null) {
            A.f("No authenticator for: " + objM0, new Object[0]);
            if (nVar.X()) {
                return;
            }
            cVarO.o(403);
            nVar.m0(true);
            return;
        }
        ?? r33 = 0;
        ?? r34 = 0;
         = 0;
        ?? r35 = 0;
        try {
            try {
                dVarB = nVar.B();
                if (dVarB == null || dVarB == mq.d.J8) {
                    dVarB = aVar3 == null ? mq.d.I8 : aVar3.a(aVarG, cVarO, zK0);
                }
                if (dVarB instanceof d.i) {
                    aVarG = ((d.i) dVarB).g();
                    cVarO = ((d.i) dVarB).o();
                }
                aVar2 = aVarG;
                cVar2 = cVarO;
                try {
                } catch (ServerAuthException e10) {
                    e = e10;
                }
            } catch (ServerAuthException e11) {
                e = e11;
                cVar2 = cVarO;
            }
            if (dVarB instanceof d.g) {
                nVar.m0(true);
            } else {
                ?? B2 = dVarB instanceof d.h;
                try {
                } catch (ServerAuthException e12) {
                    e = e12;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (B2 != 0) {
                    d.h hVar2 = (d.h) dVarB;
                    nVar.g0(dVarB);
                    f fVar = this.f73551y;
                    Object objB = fVar != null ? fVar.b(hVar2.getUserIdentity()) : null;
                    if (zK0) {
                        try {
                            hVar = hVar2;
                            Object obj2 = objB;
                            try {
                                if (!E0(str, nVar, oVarM, objM0, hVar2.getUserIdentity())) {
                                    cVar2.m(403, "!role");
                                    nVar.m0(true);
                                    f fVar2 = this.f73551y;
                                    if (fVar2 != null) {
                                        fVar2.c(obj2);
                                        return;
                                    }
                                    return;
                                }
                                obj = obj2;
                            } catch (ServerAuthException e13) {
                                e = e13;
                                B2 = obj2;
                                r35 = B2;
                                cVar2.m(500, e.getMessage());
                                f fVar3 = this.f73551y;
                                r02 = fVar3;
                                r32 = r35;
                                if (fVar3 == null) {
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                B2 = obj2;
                                r33 = B2;
                                ?? r12 = this.f73551y;
                                if (r12 != 0) {
                                    r12.c(r33);
                                }
                                throw th;
                            }
                        } catch (ServerAuthException e14) {
                            e = e14;
                            B2 = objB;
                        } catch (Throwable th4) {
                            th = th4;
                            B2 = objB;
                        }
                        r02.c(r32);
                    }
                    hVar = hVar2;
                    obj = objB;
                    iVarA0.a0(str, nVar, aVar2, cVar2);
                    B2 = obj;
                    if (aVar3 != null) {
                        aVar3.c(aVar2, cVar2, zK0, hVar);
                        B2 = obj;
                    }
                } else if (dVarB instanceof d.f) {
                    lq.c cVar3 = (lq.c) dVarB;
                    nVar.g0(dVarB);
                    try {
                        iVarA0.a0(str, nVar, aVar2, cVar2);
                        B2 = cVar3.b();
                        if (aVar3 != null) {
                            mq.d dVarB2 = nVar.B();
                            if (dVarB2 instanceof d.h) {
                                aVar3.c(aVar2, cVar2, zK0, (d.h) dVarB2);
                                B2 = B2;
                            } else {
                                aVar3.c(aVar2, cVar2, zK0, null);
                                B2 = B2;
                            }
                        }
                        r34 = B2;
                    } catch (Throwable th5) {
                        cVar3.b();
                        throw th5;
                    }
                } else {
                    nVar.g0(dVarB);
                    f fVar4 = this.f73551y;
                    Object objB2 = fVar4 != null ? fVar4.b(null) : null;
                    iVarA0.a0(str, nVar, aVar2, cVar2);
                    B2 = objB2;
                    if (aVar3 != null) {
                        aVar3.c(aVar2, cVar2, zK0, null);
                        B2 = objB2;
                    }
                }
                r34 = B2;
            }
            f fVar5 = this.f73551y;
            r02 = fVar5;
            r32 = r34;
            if (fVar5 == null) {
                return;
            }
            r02.c(r32);
        } catch (Throwable th6) {
            th = th6;
        }
    }

    @Override // oq.g, oq.a, uq.b, uq.a
    public void d0() throws Exception {
        a.b bVar;
        c.d dVarV0 = oq.c.V0();
        if (dVarV0 != null) {
            Enumeration enumerationH = dVarV0.h();
            while (enumerationH != null && enumerationH.hasMoreElements()) {
                String str = (String) enumerationH.nextElement();
                if (str.startsWith("org.eclipse.jetty.security.") && getInitParameter(str) == null) {
                    N0(str, dVarV0.c(str));
                }
            }
            dVarV0.b().N0(new a());
        }
        if (this.f73549w == null) {
            g gVarG0 = G0();
            this.f73549w = gVarG0;
            if (gVarG0 != null) {
                this.f73550x = true;
            }
        }
        if (this.f73551y == null) {
            g gVar = this.f73549w;
            if (gVar != null) {
                this.f73551y = gVar.e();
            }
            if (this.f73551y == null) {
                this.f73551y = F0();
            }
            if (this.f73551y == null && this.f73546t != null) {
                this.f73551y = new e();
            }
        }
        g gVar2 = this.f73549w;
        if (gVar2 != null) {
            if (gVar2.e() == null) {
                this.f73549w.c(this.f73551y);
            } else if (this.f73549w.e() != this.f73551y) {
                throw new IllegalStateException("LoginService has different IdentityService to " + this);
            }
        }
        if (!this.f73550x) {
            g gVar3 = this.f73549w;
            if (gVar3 instanceof uq.f) {
                ((uq.f) gVar3).start();
            }
        }
        if (this.f73544r == null && (bVar = this.f73545s) != null && this.f73551y != null) {
            kq.a aVarA = bVar.a(b(), oq.c.V0(), this, this.f73551y, this.f73549w);
            this.f73544r = aVarA;
            if (aVarA != null) {
                this.f73547u = aVarA.getAuthMethod();
            }
        }
        kq.a aVar = this.f73544r;
        if (aVar != null) {
            aVar.b(this);
            kq.a aVar2 = this.f73544r;
            if (aVar2 instanceof uq.f) {
                ((uq.f) aVar2).start();
            }
        } else if (this.f73546t != null) {
            A.f("No ServerAuthentication for " + this, new Object[0]);
            throw new IllegalStateException("No ServerAuthentication");
        }
        super.d0();
    }

    @Override // kq.a.InterfaceC0866a
    public f e() {
        return this.f73551y;
    }

    @Override // oq.g, oq.a, uq.b, uq.a
    public void e0() throws Exception {
        super.e0();
        if (this.f73550x) {
            return;
        }
        g gVar = this.f73549w;
        if (gVar instanceof uq.f) {
            ((uq.f) gVar).stop();
        }
    }

    @Override // kq.a.InterfaceC0866a
    public String getAuthMethod() {
        return this.f73547u;
    }

    @Override // kq.a.InterfaceC0866a
    public String getInitParameter(String str) {
        return this.f73548v.get(str);
    }

    @Override // kq.a.InterfaceC0866a
    public boolean z() {
        return this.f73552z;
    }
}
