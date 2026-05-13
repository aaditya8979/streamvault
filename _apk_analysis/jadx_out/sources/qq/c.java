package qq;

import an.i;
import an.j;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import mq.p;
import mq.s;
import mq.t;
import oq.c;
import zm.v;

/* JADX INFO: compiled from: AbstractSessionManager.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends uq.a implements t {
    public static final vq.c L = g.f78415u;
    public static final i M = new a();
    public String A;
    public int C;
    public boolean D;
    public boolean E;
    public String F;
    public Set<SessionTrackingMode> G;
    public boolean H;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f78392n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public s f78394p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ClassLoader f78399u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c.d f78400v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f78404z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<SessionTrackingMode> f78389k = Collections.unmodifiableSet(new HashSet(Arrays.asList(SessionTrackingMode.COOKIE, SessionTrackingMode.URL)));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f78390l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f78391m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f78393o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f78395q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f78396r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<an.g> f78397s = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<j> f78398t = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f78401w = "JSESSIONID";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f78402x = "jsessionid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f78403y = ";" + this.f78402x + "=";
    public int B = -1;
    public final zq.a I = new zq.a();
    public final zq.b J = new zq.b();
    public v K = new b();

    /* JADX INFO: compiled from: AbstractSessionManager.java */
    public static class a implements i {
    }

    /* JADX INFO: compiled from: AbstractSessionManager.java */
    public class b implements v {
        public b() {
        }

        @Override // zm.v
        public boolean a() {
            return c.this.f78393o;
        }

        @Override // zm.v
        public boolean c() {
            return c.this.f78395q;
        }

        @Override // zm.v
        public int getMaxAge() {
            return c.this.B;
        }

        @Override // zm.v
        public String getName() {
            return c.this.f78401w;
        }
    }

    /* JADX INFO: renamed from: qq.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractSessionManager.java */
    public interface InterfaceC0940c extends an.e {
        qq.a getSession();
    }

    public c() {
        A0(this.f78389k);
    }

    public static an.e y0(an.a aVar, an.e eVar, boolean z10) {
        HashMap map = new HashMap();
        Enumeration<String> enumerationB = eVar.b();
        while (enumerationB.hasMoreElements()) {
            String strNextElement = enumerationB.nextElement();
            map.put(strNextElement, eVar.getAttribute(strNextElement));
            eVar.removeAttribute(strNextElement);
        }
        eVar.invalidate();
        an.e eVarP = aVar.p(true);
        if (z10) {
            eVarP.a("org.eclipse.jetty.security.sessionKnownOnlytoAuthenticated", Boolean.TRUE);
        }
        for (Map.Entry entry : map.entrySet()) {
            eVarP.a((String) entry.getKey(), entry.getValue());
        }
        return eVarP;
    }

    public void A0(Set<SessionTrackingMode> set) {
        HashSet hashSet = new HashSet(set);
        this.G = hashSet;
        this.f78390l = hashSet.contains(SessionTrackingMode.COOKIE);
        this.H = this.G.contains(SessionTrackingMode.URL);
    }

    @Override // mq.t
    public boolean M() {
        return this.H;
    }

    @Override // mq.t
    public boolean O() {
        return this.f78390l;
    }

    @Override // mq.t
    public void T(g gVar) {
        this.f78392n = gVar;
    }

    @Override // mq.t
    public an.e V(an.a aVar) {
        qq.a aVarV0 = v0(aVar);
        aVarV0.x(this.f78391m);
        n0(aVarV0, true);
        return aVarV0;
    }

    @Override // mq.t
    public String Y() {
        return this.f78403y;
    }

    @Override // uq.a
    public void d0() throws Exception {
        String strC;
        this.f78400v = oq.c.V0();
        this.f78399u = Thread.currentThread().getContextClassLoader();
        if (this.f78394p == null) {
            p pVarB = r0().b();
            synchronized (pVarB) {
                s sVarH0 = pVarB.H0();
                this.f78394p = sVarH0;
                if (sVarH0 == null) {
                    d dVar = new d();
                    this.f78394p = dVar;
                    pVarB.T0(dVar);
                }
            }
        }
        if (!this.f78394p.isStarted()) {
            this.f78394p.start();
        }
        c.d dVar2 = this.f78400v;
        if (dVar2 != null) {
            String strC2 = dVar2.c("org.eclipse.jetty.servlet.SessionCookie");
            if (strC2 != null) {
                this.f78401w = strC2;
            }
            String strC3 = this.f78400v.c("org.eclipse.jetty.servlet.SessionIdPathParameterName");
            if (strC3 != null) {
                z0(strC3);
            }
            if (this.B == -1 && (strC = this.f78400v.c("org.eclipse.jetty.servlet.MaxAge")) != null) {
                this.B = Integer.parseInt(strC.trim());
            }
            if (this.f78404z == null) {
                this.f78404z = this.f78400v.c("org.eclipse.jetty.servlet.SessionDomain");
            }
            if (this.A == null) {
                this.A = this.f78400v.c("org.eclipse.jetty.servlet.SessionPath");
            }
            String strC4 = this.f78400v.c("org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding");
            if (strC4 != null) {
                this.E = Boolean.parseBoolean(strC4);
            }
        }
        super.d0();
    }

    @Override // uq.a
    public void e0() throws Exception {
        super.e0();
        t0();
        this.f78399u = null;
    }

    public c.d getContext() {
        return this.f78400v;
    }

    @Override // mq.t
    public an.e k(String str) {
        qq.a aVarQ0 = q0(s0().c0(str));
        if (aVarQ0 != null && !aVarQ0.s().equals(str)) {
            aVarQ0.w(true);
        }
        return aVarQ0;
    }

    @Override // mq.t
    public void l(an.e eVar) {
        ((InterfaceC0940c) eVar).getSession().g();
    }

    @Override // mq.t
    public String m(an.e eVar) {
        return ((InterfaceC0940c) eVar).getSession().s();
    }

    public abstract void m0(qq.a aVar);

    public void n0(qq.a aVar, boolean z10) {
        synchronized (this.f78394p) {
            this.f78394p.Q(aVar);
            m0(aVar);
        }
        if (z10) {
            this.I.c();
            if (this.f78398t != null) {
                HttpSessionEvent httpSessionEvent = new HttpSessionEvent(aVar);
                Iterator<j> it = this.f78398t.iterator();
                while (it.hasNext()) {
                    it.next().s(httpSessionEvent);
                }
            }
        }
    }

    @Override // mq.t
    public gq.g o(an.e eVar, boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        qq.a session = ((InterfaceC0940c) eVar).getSession();
        if (!session.c(jCurrentTimeMillis) || !O()) {
            return null;
        }
        if (!session.u() && (x().getMaxAge() <= 0 || p0() <= 0 || (jCurrentTimeMillis - session.p()) / 1000 <= p0())) {
            return null;
        }
        c.d dVar = this.f78400v;
        gq.g gVarS = s(eVar, dVar == null ? "/" : dVar.e(), z10);
        session.h();
        session.w(false);
        return gVarS;
    }

    public void o0(qq.a aVar, String str, Object obj, Object obj2) {
        if (this.f78397s.isEmpty()) {
            return;
        }
        HttpSessionBindingEvent httpSessionBindingEvent = new HttpSessionBindingEvent(aVar, str, obj == null ? obj2 : obj);
        for (an.g gVar : this.f78397s) {
            if (obj == null) {
                gVar.c(httpSessionBindingEvent);
            } else if (obj2 == null) {
                gVar.a(httpSessionBindingEvent);
            } else {
                gVar.C(httpSessionBindingEvent);
            }
        }
    }

    public int p0() {
        return this.C;
    }

    public abstract qq.a q0(String str);

    public g r0() {
        return this.f78392n;
    }

    @Override // mq.t
    public gq.g s(an.e eVar, String str, boolean z10) {
        gq.g gVar;
        if (!O()) {
            return null;
        }
        String str2 = this.A;
        if (str2 != null) {
            str = str2;
        }
        if (str == null || str.length() == 0) {
            str = "/";
        }
        String str3 = str;
        String strM = m(eVar);
        if (this.F == null) {
            gVar = new gq.g(this.f78401w, strM, this.f78404z, str3, this.K.getMaxAge(), this.K.a(), this.K.c() || (u0() && z10));
        } else {
            gVar = new gq.g(this.f78401w, strM, this.f78404z, str3, this.K.getMaxAge(), this.K.a(), this.K.c() || (u0() && z10), this.F, 1);
        }
        return gVar;
    }

    public s s0() {
        return this.f78394p;
    }

    @Override // mq.t
    public boolean t() {
        return this.E;
    }

    public abstract void t0() throws Exception;

    public boolean u0() {
        return this.f78396r;
    }

    public abstract qq.a v0(an.a aVar);

    public void w0(qq.a aVar, boolean z10) {
        if (x0(aVar.o())) {
            this.I.b();
            this.J.a(Math.round((System.currentTimeMillis() - aVar.q()) / 1000.0d));
            this.f78394p.X(aVar);
            if (z10) {
                this.f78394p.A(aVar.o());
            }
            if (!z10 || this.f78398t == null) {
                return;
            }
            HttpSessionEvent httpSessionEvent = new HttpSessionEvent(aVar);
            Iterator<j> it = this.f78398t.iterator();
            while (it.hasNext()) {
                it.next().d(httpSessionEvent);
            }
        }
    }

    @Override // mq.t
    public v x() {
        return this.K;
    }

    public abstract boolean x0(String str);

    @Override // mq.t
    public boolean y(an.e eVar) {
        return ((InterfaceC0940c) eVar).getSession().v();
    }

    public void z0(String str) {
        String str2 = null;
        this.f78402x = (str == null || "none".equals(str)) ? null : str;
        if (str != null && !"none".equals(str)) {
            str2 = ";" + this.f78402x + "=";
        }
        this.f78403y = str2;
    }
}
