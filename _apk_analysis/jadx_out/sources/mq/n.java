package mq;

import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.http.Cookie;
import mq.b;
import mq.d;
import mq.v;
import oq.c;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;
import org.eclipse.jetty.util.UrlEncoded;
import sq.l;

/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes12.dex */
public class n implements an.a {
    public static final vq.c R = vq.b.a(n.class);
    public static final Collection S = Collections.singleton(Locale.getDefault());
    public String A;
    public String B;
    public Object C;
    public String D;
    public String F;
    public Map<Object, an.e> G;
    public v.a I;
    public String J;
    public String K;
    public an.e L;
    public t M;
    public long N;
    public hq.d O;
    public gq.n P;
    public sq.l Q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile sq.b f74942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f74943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MultiMap<String> f74944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f74945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f74946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.d f74947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f74948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f74949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f74950k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DispatcherType f74952m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public hq.k f74954o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f74957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MultiMap<String> f74958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f74959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f74960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f74961v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f74963x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f74964y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public BufferedReader f74965z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f74940a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f74941b = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f74951l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f74953n = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f74955p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f74956q = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f74962w = "HTTP/1.1";
    public boolean E = false;
    public String H = "http";

    /* JADX INFO: compiled from: Request.java */
    public static class a implements zm.r {
        @Override // zm.r
        public void q(ServletRequestEvent servletRequestEvent) {
        }

        @Override // zm.r
        public void z(ServletRequestEvent servletRequestEvent) {
            sq.l lVar = (sq.l) servletRequestEvent.getServletRequest().getAttribute("org.eclipse.multiPartInputStream");
            if (lVar == null || ((c.d) servletRequestEvent.getServletRequest().getAttribute("org.eclipse.multiPartContext")) != servletRequestEvent.getServletContext()) {
                return;
            }
            try {
                lVar.a();
            } catch (MultiException e10) {
                servletRequestEvent.getServletContext().f("Errors deleting multipart tmp files", e10);
            }
        }
    }

    public n() {
    }

    public n(b bVar) {
        i0(bVar);
    }

    public String A() {
        d dVar = this.f74943d;
        if (dVar instanceof d.f) {
            g0(((d.f) dVar).e(this));
        }
        d dVar2 = this.f74943d;
        if (dVar2 instanceof d.h) {
            return ((d.h) dVar2).getAuthMethod();
        }
        return null;
    }

    public void A0(int i10) {
        this.f74961v = i10;
    }

    public d B() {
        return this.f74943d;
    }

    public void B0(String str) {
        this.K = str;
    }

    public String C() {
        return this.f74945f;
    }

    public void C0(an.e eVar) {
        this.L = eVar;
    }

    public b D() {
        return this.f74946g;
    }

    public void D0(t tVar) {
        this.M = tVar;
    }

    public int E() {
        return (int) this.f74946g.y().v(gq.i.f62821j);
    }

    public void E0(long j10) {
        this.N = j10;
    }

    public DispatcherType F() {
        return this.f74952m;
    }

    public void F0(gq.n nVar) {
        this.P = nVar;
    }

    public String G() {
        hq.k kVar = this.f74954o;
        if (kVar == null) {
            return null;
        }
        if (this.f74953n) {
            return kVar.v();
        }
        String strH = kVar.h();
        if (strH == null || strH.indexOf(58) < 0) {
            return strH;
        }
        return C3978d4.j.f31383d + strH + C3978d4.j.f31385e;
    }

    public void G0(v.a aVar) {
        this.I = aVar;
    }

    public int H() {
        hq.k kVar = this.f74954o;
        if (kVar == null) {
            return 0;
        }
        return kVar.c();
    }

    public boolean H0() {
        boolean z10 = this.f74948i;
        this.f74948i = false;
        return z10;
    }

    public MultiMap<String> I() {
        return this.f74958s;
    }

    public Collection<an.m> J() throws Throwable {
        if (getContentType() == null || !getContentType().startsWith(ShareTarget.ENCODING_TYPE_MULTIPART)) {
            throw new ServletException("Content-Type != multipart/form-data");
        }
        if (this.Q == null) {
            this.Q = (sq.l) getAttribute("org.eclipse.multiPartInputStream");
        }
        if (this.Q == null) {
            zm.g gVar = (zm.g) getAttribute("org.eclipse.multipartConfig");
            if (gVar == null) {
                throw new IllegalStateException("No multipart config for servlet");
            }
            zm.m mVarB = b();
            String contentType = getContentType();
            c.d dVar = this.f74947h;
            ByteArrayOutputStream byteArrayOutputStream = null;
            sq.l lVar = new sq.l(mVarB, contentType, gVar, dVar != null ? (File) dVar.getAttribute("javax.servlet.context.tempdir") : null);
            this.Q = lVar;
            a("org.eclipse.multiPartInputStream", lVar);
            a("org.eclipse.multiPartContext", this.f74947h);
            Iterator<an.m> it = this.Q.d().iterator();
            while (it.hasNext()) {
                l.c cVar = (l.c) it.next();
                if (cVar.d() == null) {
                    String strA = cVar.e() != null ? gq.p.a(new hq.h(cVar.e())) : null;
                    InputStream inputStreamF = cVar.f();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            sq.j.c(inputStreamF, byteArrayOutputStream2);
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            if (strA == null) {
                                strA = "UTF-8";
                            }
                            String str = new String(byteArray, strA);
                            getParameter("");
                            I().add(cVar.g(), str);
                            sq.j.b(byteArrayOutputStream2);
                            sq.j.a(inputStreamF);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            sq.j.b(byteArrayOutputStream);
                            sq.j.a(inputStreamF);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        return this.Q.d();
    }

    public String K() {
        return this.f74963x;
    }

    public v L() {
        d dVar = this.f74943d;
        if (dVar instanceof d.h) {
            return ((d.h) dVar).getUserIdentity();
        }
        return null;
    }

    public o M() {
        return this.f74946g.f74872o;
    }

    public StringBuilder N() {
        StringBuilder sb2 = new StringBuilder(48);
        String strO = O();
        int iP = P();
        sb2.append(strO);
        sb2.append("://");
        sb2.append(s());
        if (iP > 0 && ((strO.equalsIgnoreCase("http") && iP != 80) || (strO.equalsIgnoreCase("https") && iP != 443))) {
            sb2.append(':');
            sb2.append(iP);
        }
        return sb2;
    }

    public String O() {
        return this.H;
    }

    public int P() {
        gq.n nVar;
        if (this.f74961v <= 0) {
            if (this.J == null) {
                s();
            }
            if (this.f74961v <= 0) {
                if (this.J == null || (nVar = this.P) == null) {
                    hq.k kVar = this.f74954o;
                    this.f74961v = kVar == null ? 0 : kVar.c();
                } else {
                    this.f74961v = nVar.j();
                }
            }
        }
        int i10 = this.f74961v;
        return i10 <= 0 ? O().equalsIgnoreCase("https") ? 443 : 80 : i10;
    }

    public String Q() {
        v.a aVar = this.I;
        if (aVar != null) {
            return aVar.getName();
        }
        return null;
    }

    public zm.t R() {
        return this.f74946g.B();
    }

    public t S() {
        return this.M;
    }

    public long T() {
        return this.N;
    }

    public hq.d U() {
        if (this.O == null) {
            long j10 = this.N;
            if (j10 > 0) {
                this.O = org.eclipse.jetty.http.a.f76617e.g(j10);
            }
        }
        return this.O;
    }

    public v.a V() {
        return this.I;
    }

    public boolean W() {
        return this.f74941b;
    }

    public boolean X() {
        return this.f74955p;
    }

    public boolean Y() {
        return this.D != null && this.E;
    }

    public void Z(String str) {
        boolean z10;
        MultiMap<String> multiMap = new MultiMap<>();
        UrlEncoded.decodeTo(str, multiMap, "UTF-8");
        if (!this.f74959t) {
            x();
        }
        MultiMap<String> multiMap2 = this.f74958s;
        if (multiMap2 == null || multiMap2.size() <= 0) {
            z10 = false;
        } else {
            z10 = false;
            for (Map.Entry<String, Object> entry : this.f74958s.entrySet()) {
                String key = entry.getKey();
                if (multiMap.containsKey(key)) {
                    z10 = true;
                }
                Object value = entry.getValue();
                for (int i10 = 0; i10 < LazyList.size(value); i10++) {
                    multiMap.add(key, LazyList.get(value, i10));
                }
            }
        }
        String str2 = this.f74964y;
        if (str2 != null && str2.length() > 0) {
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                MultiMap multiMap3 = new MultiMap();
                UrlEncoded.decodeTo(this.f74964y, multiMap3, K());
                MultiMap multiMap4 = new MultiMap();
                UrlEncoded.decodeTo(str, multiMap4, "UTF-8");
                for (Map.Entry entry2 : multiMap3.entrySet()) {
                    String str3 = (String) entry2.getKey();
                    if (!multiMap4.containsKey(str3)) {
                        Object value2 = entry2.getValue();
                        for (int i11 = 0; i11 < LazyList.size(value2); i11++) {
                            sb2.append(C3978d4.j.f31381c);
                            sb2.append(str3);
                            sb2.append("=");
                            sb2.append(LazyList.get(value2, i11));
                        }
                    }
                }
                str = str + ((Object) sb2);
            } else {
                str = str + C3978d4.j.f31381c + this.f74964y;
            }
        }
        o0(multiMap);
        s0(str);
    }

    @Override // zm.p
    public void a(String str, Object obj) {
        Object attribute = this.f74942c == null ? null : this.f74942c.getAttribute(str);
        if (str.startsWith("org.eclipse.jetty.")) {
            if ("org.eclipse.jetty.server.Request.queryEncoding".equals(str)) {
                r0(obj != null ? obj.toString() : null);
            } else if ("org.eclipse.jetty.server.sendContent".equals(str)) {
                try {
                    ((b.C0890b) R().e()).l(obj);
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } else if ("org.eclipse.jetty.server.ResponseBuffer".equals(str)) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    synchronized (byteBuffer) {
                        ((b.C0890b) R().e()).m(byteBuffer.isDirect() ? new jq.b(byteBuffer, true) : new jq.c(byteBuffer, true));
                    }
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            } else if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
                try {
                    D().f().u(Integer.valueOf(obj.toString()).intValue());
                } catch (IOException e12) {
                    throw new RuntimeException(e12);
                }
            }
        }
        if (this.f74942c == null) {
            this.f74942c = new sq.c();
        }
        this.f74942c.a(str, obj);
        if (this.C != null) {
            ServletRequestAttributeEvent servletRequestAttributeEvent = new ServletRequestAttributeEvent(this.f74947h, this, str, attribute == null ? obj : attribute);
            int size = LazyList.size(this.C);
            for (int i10 = 0; i10 < size; i10++) {
                zm.q qVar = (zm.q) LazyList.get(this.C, i10);
                if (qVar instanceof zm.q) {
                    if (attribute == null) {
                        qVar.u(servletRequestAttributeEvent);
                    } else if (obj == null) {
                        qVar.v(servletRequestAttributeEvent);
                    } else {
                        qVar.B(servletRequestAttributeEvent);
                    }
                }
            }
        }
    }

    public an.e a0(Object obj) {
        Map<Object, an.e> map = this.G;
        if (map == null) {
            return null;
        }
        return map.get(obj);
    }

    @Override // zm.p
    public zm.m b() throws IOException {
        int i10 = this.f74956q;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("READER");
        }
        this.f74956q = 1;
        return this.f74946g.r();
    }

    public void b0() {
        if (this.f74956q == 2) {
            try {
                int i10 = this.f74965z.read();
                while (i10 != -1) {
                    i10 = this.f74965z.read();
                }
            } catch (Exception e10) {
                R.g(e10);
                this.f74965z = null;
            }
        }
        g0(d.J8);
        this.f74940a.v();
        this.f74941b = true;
        this.f74955p = false;
        if (this.f74947h != null) {
            throw new IllegalStateException("Request in context!");
        }
        if (this.f74942c != null) {
            this.f74942c.u();
        }
        this.f74945f = null;
        this.f74949j = null;
        g gVar = this.f74950k;
        if (gVar != null) {
            gVar.d();
        }
        this.f74951l = false;
        this.f74947h = null;
        this.J = null;
        this.f74957r = null;
        this.f74960u = null;
        this.f74961v = 0;
        this.f74962w = "HTTP/1.1";
        this.f74963x = null;
        this.f74964y = null;
        this.D = null;
        this.E = false;
        this.L = null;
        this.M = null;
        this.F = null;
        this.I = null;
        this.H = "http";
        this.K = null;
        this.N = 0L;
        this.O = null;
        this.P = null;
        MultiMap<String> multiMap = this.f74944e;
        if (multiMap != null) {
            multiMap.clear();
        }
        this.f74958s = null;
        this.f74959t = false;
        this.f74956q = 0;
        Map<Object, an.e> map = this.G;
        if (map != null) {
            map.clear();
        }
        this.G = null;
        this.Q = null;
    }

    @Override // zm.p
    public boolean c() {
        return this.f74946g.G(this);
    }

    public void c0(String str) {
        Object attribute = this.f74942c == null ? null : this.f74942c.getAttribute(str);
        if (this.f74942c != null) {
            this.f74942c.removeAttribute(str);
        }
        if (attribute == null || this.C == null) {
            return;
        }
        ServletRequestAttributeEvent servletRequestAttributeEvent = new ServletRequestAttributeEvent(this.f74947h, this, str, attribute);
        int size = LazyList.size(this.C);
        for (int i10 = 0; i10 < size; i10++) {
            zm.q qVar = (zm.q) LazyList.get(this.C, i10);
            if (qVar instanceof zm.q) {
                qVar.v(servletRequestAttributeEvent);
            }
        }
    }

    @Override // zm.p
    public zm.h d(String str) {
        String strC = sq.q.c(str);
        if (strC == null || this.f74947h == null) {
            return null;
        }
        if (!strC.startsWith("/")) {
            String strA = sq.q.a(this.K, this.f74960u);
            int iLastIndexOf = strA.lastIndexOf("/");
            strC = sq.q.a(iLastIndexOf > 1 ? strA.substring(0, iLastIndexOf + 1) : "/", strC);
        }
        return this.f74947h.d(strC);
    }

    public void d0(EventListener eventListener) {
        this.C = LazyList.remove(this.C, eventListener);
    }

    @Override // an.a
    public String e() {
        return this.f74949j;
    }

    public void e0(boolean z10) {
        this.f74941b = z10;
    }

    @Override // zm.p
    public String f() {
        String str = this.A;
        if (str != null) {
            return str;
        }
        hq.k kVar = this.f74954o;
        if (kVar == null) {
            return null;
        }
        return kVar.f();
    }

    public void f0(sq.b bVar) {
        this.f74942c = bVar;
    }

    @Override // zm.p
    public boolean g() {
        return this.f74940a.p();
    }

    public void g0(d dVar) {
        this.f74943d = dVar;
    }

    @Override // zm.p
    public Object getAttribute(String str) {
        if ("org.eclipse.jetty.io.EndPoint.maxIdleTime".equalsIgnoreCase(str)) {
            return new Long(D().f().d());
        }
        Object attribute = this.f74942c == null ? null : this.f74942c.getAttribute(str);
        return (attribute == null && "org.eclipse.jetty.continuation".equals(str)) ? this.f74940a : attribute;
    }

    @Override // zm.p
    public String getContentType() {
        return this.f74946g.y().w(gq.i.f62841z);
    }

    public c.d getContext() {
        return this.f74947h;
    }

    @Override // an.a
    public String getMethod() {
        return this.f74957r;
    }

    @Override // zm.p
    public String getParameter(String str) {
        if (!this.f74959t) {
            x();
        }
        return (String) this.f74958s.getValue(str, 0);
    }

    @Override // zm.p
    public String getProtocol() {
        return this.f74962w;
    }

    @Override // zm.p
    public zm.k getServletContext() {
        return this.f74947h;
    }

    @Override // zm.p
    public zm.a h() {
        if (!this.f74940a.s() || this.f74940a.p()) {
            return this.f74940a;
        }
        throw new IllegalStateException(this.f74940a.m());
    }

    public void h0(String str) {
        this.f74945f = str;
    }

    @Override // an.a
    public String i() {
        gq.n nVar;
        if (this.f74964y == null && (nVar = this.P) != null) {
            String str = this.f74963x;
            if (str == null) {
                this.f74964y = nVar.k();
            } else {
                this.f74964y = nVar.l(str);
            }
        }
        return this.f74964y;
    }

    public final void i0(b bVar) {
        this.f74946g = bVar;
        this.f74940a.y(bVar);
        this.f74954o = bVar.f();
        this.f74953n = bVar.A();
    }

    @Override // an.a
    public Cookie[] j() {
        if (this.f74951l) {
            g gVar = this.f74950k;
            if (gVar == null) {
                return null;
            }
            return gVar.b();
        }
        this.f74951l = true;
        Enumeration<String> enumerationY = this.f74946g.y().y(gq.i.f62818h0);
        if (enumerationY != null) {
            if (this.f74950k == null) {
                this.f74950k = new g();
            }
            while (enumerationY.hasMoreElements()) {
                this.f74950k.a(enumerationY.nextElement());
            }
        }
        g gVar2 = this.f74950k;
        if (gVar2 == null) {
            return null;
        }
        return gVar2.b();
    }

    public void j0(c.d dVar) {
        this.f74948i = this.f74947h != dVar;
        this.f74947h = dVar;
    }

    @Override // an.a
    public Enumeration k() {
        return this.f74946g.y().t();
    }

    public void k0(String str) {
        this.f74949j = str;
    }

    @Override // an.a
    public String l() {
        return this.f74960u;
    }

    public void l0(DispatcherType dispatcherType) {
        this.f74952m = dispatcherType;
    }

    @Override // an.a
    public String m(String str) {
        return this.f74946g.y().x(str);
    }

    public void m0(boolean z10) {
        this.f74955p = z10;
    }

    @Override // an.a
    public String n() {
        return this.D;
    }

    public void n0(String str) {
        this.f74957r = str;
    }

    @Override // an.a
    public Enumeration o(String str) {
        Enumeration<String> enumerationZ = this.f74946g.y().z(str);
        return enumerationZ == null ? Collections.enumeration(Collections.EMPTY_LIST) : enumerationZ;
    }

    public void o0(MultiMap<String> multiMap) {
        if (multiMap == null) {
            multiMap = this.f74944e;
        }
        this.f74958s = multiMap;
        if (this.f74959t && multiMap == null) {
            throw new IllegalStateException();
        }
    }

    @Override // an.a
    public an.e p(boolean z10) {
        an.e eVar = this.L;
        if (eVar != null) {
            t tVar = this.M;
            if (tVar == null || tVar.y(eVar)) {
                return this.L;
            }
            this.L = null;
        }
        if (!z10) {
            return null;
        }
        t tVar2 = this.M;
        if (tVar2 == null) {
            throw new IllegalStateException("No SessionManager");
        }
        an.e eVarV = tVar2.V(this);
        this.L = eVarV;
        gq.g gVarS = this.M.s(eVarV, e(), c());
        if (gVarS != null) {
            this.f74946g.B().q(gVarS);
        }
        return this.L;
    }

    public void p0(String str) {
        this.f74960u = str;
    }

    @Override // zm.p
    public zm.a q() throws IllegalStateException {
        if (!this.f74941b) {
            throw new IllegalStateException("!asyncSupported");
        }
        this.f74940a.z();
        return this.f74940a;
    }

    public void q0(String str) {
        this.f74962w = str;
    }

    @Override // an.a
    public StringBuffer r() {
        StringBuffer stringBuffer = new StringBuffer(48);
        synchronized (stringBuffer) {
            String strO = O();
            int iP = P();
            stringBuffer.append(strO);
            stringBuffer.append("://");
            stringBuffer.append(s());
            if (this.f74961v > 0 && ((strO.equalsIgnoreCase("http") && iP != 80) || (strO.equalsIgnoreCase("https") && iP != 443))) {
                stringBuffer.append(':');
                stringBuffer.append(this.f74961v);
            }
            stringBuffer.append(v());
        }
        return stringBuffer;
    }

    public void r0(String str) {
        this.f74963x = str;
        this.f74964y = null;
    }

    @Override // zm.p
    public String s() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        gq.n nVar = this.P;
        if (nVar == null) {
            throw new IllegalStateException("No uri");
        }
        this.J = nVar.g();
        this.f74961v = this.P.j();
        String str2 = this.J;
        if (str2 != null) {
            return str2;
        }
        hq.d dVarO = this.f74946g.y().o(gq.i.f62811e);
        if (dVarO == null) {
            if (this.f74946g != null) {
                this.J = G();
                this.f74961v = H();
                String str3 = this.J;
                if (str3 != null && !"0.0.0.0".equals(str3)) {
                    return this.J;
                }
            }
            try {
                this.J = InetAddress.getLocalHost().getHostAddress();
            } catch (UnknownHostException e10) {
                R.g(e10);
            }
            return this.J;
        }
        int iT = dVarO.T();
        while (true) {
            int i10 = iT - 1;
            if (iT <= dVarO.getIndex()) {
                break;
            }
            char cQ = (char) (dVarO.Q(i10) & 255);
            if (cQ == ':') {
                this.J = hq.g.f(dVarO.N(dVarO.getIndex(), i10 - dVarO.getIndex()));
                try {
                    try {
                        this.f74961v = hq.g.h(dVarO.N(i10 + 1, (dVarO.T() - i10) - 1));
                    } catch (NumberFormatException unused) {
                        b bVar = this.f74946g;
                        if (bVar != null) {
                            bVar.f74870m.n(400, "Bad Host header", null, true);
                        }
                    }
                    return this.J;
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
            if (cQ == ']') {
                break;
            }
            iT = i10;
        }
        if (this.J == null || this.f74961v < 0) {
            this.J = hq.g.f(dVarO);
            this.f74961v = 0;
        }
        return this.J;
    }

    public void s0(String str) {
        this.f74964y = str;
        this.f74963x = null;
    }

    @Override // an.a
    public String t() {
        if (this.K == null) {
            this.K = "";
        }
        return this.K;
    }

    public void t0(String str) {
        this.A = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f74955p ? C3978d4.j.f31383d : "(");
        sb2.append(getMethod());
        sb2.append(Z7.f30794r);
        sb2.append(this.P);
        sb2.append(this.f74955p ? "]@" : ")@");
        sb2.append(hashCode());
        sb2.append(Z7.f30794r);
        sb2.append(super.toString());
        return sb2.toString();
    }

    @Override // an.a
    public long u(String str) {
        return this.f74946g.y().p(str);
    }

    public void u0(String str) {
        this.B = str;
    }

    @Override // an.a
    public String v() {
        gq.n nVar;
        if (this.F == null && (nVar = this.P) != null) {
            this.F = nVar.i();
        }
        return this.F;
    }

    public void v0(String str) {
        this.F = str;
    }

    public void w(EventListener eventListener) {
        if (eventListener instanceof zm.q) {
            this.C = LazyList.add(this.C, eventListener);
        }
        if (eventListener instanceof fq.b) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        }
        if (eventListener instanceof zm.c) {
            throw new IllegalArgumentException(eventListener.getClass().toString());
        }
    }

    public void w0(String str) {
        this.D = str;
    }

    public void x() {
        int iE;
        int iIntValue;
        int iIntValue2;
        MultiMap<String> multiMap;
        if (this.f74944e == null) {
            this.f74944e = new MultiMap<>(16);
        }
        if (this.f74959t) {
            if (multiMap == null) {
                return;
            } else {
                return;
            }
        }
        this.f74959t = true;
        try {
            gq.n nVar = this.P;
            if (nVar != null && nVar.n()) {
                String str = this.f74963x;
                if (str == null) {
                    this.P.b(this.f74944e);
                } else {
                    try {
                        this.P.c(this.f74944e, str);
                    } catch (UnsupportedEncodingException e10) {
                        vq.c cVar = R;
                        if (cVar.isDebugEnabled()) {
                            cVar.e(e10);
                        } else {
                            cVar.f(e10.toString(), new Object[0]);
                        }
                    }
                }
            }
            String strC = C();
            String contentType = getContentType();
            if (contentType != null && contentType.length() > 0) {
                contentType = org.eclipse.jetty.http.a.L(contentType, null);
                if (ShareTarget.ENCODING_TYPE_URL_ENCODED.equalsIgnoreCase(contentType) && this.f74956q == 0 && (("POST".equals(getMethod()) || "PUT".equals(getMethod())) && (iE = E()) != 0)) {
                    try {
                        c.d dVar = this.f74947h;
                        if (dVar != null) {
                            iIntValue = dVar.b().a1();
                            iIntValue2 = this.f74947h.b().b1();
                        } else {
                            iIntValue = -1;
                            iIntValue2 = -1;
                        }
                        if (iIntValue < 0) {
                            Object attribute = this.f74946g.n().b().getAttribute("org.eclipse.jetty.server.Request.maxFormContentSize");
                            if (attribute == null) {
                                iIntValue = C3978d4.b.f31230c;
                            } else if (attribute instanceof Number) {
                                iIntValue = ((Number) attribute).intValue();
                            } else if (attribute instanceof String) {
                                iIntValue = Integer.valueOf((String) attribute).intValue();
                            }
                        }
                        if (iIntValue2 < 0) {
                            Object attribute2 = this.f74946g.n().b().getAttribute("org.eclipse.jetty.server.Request.maxFormKeys");
                            if (attribute2 == null) {
                                iIntValue2 = 1000;
                            } else if (attribute2 instanceof Number) {
                                iIntValue2 = ((Number) attribute2).intValue();
                            } else if (attribute2 instanceof String) {
                                iIntValue2 = Integer.valueOf((String) attribute2).intValue();
                            }
                        }
                        if (iE > iIntValue && iIntValue > 0) {
                            throw new IllegalStateException("Form too large " + iE + ">" + iIntValue);
                        }
                        UrlEncoded.decodeTo(b(), this.f74944e, strC, iE < 0 ? iIntValue : -1, iIntValue2);
                    } catch (IOException e11) {
                        vq.c cVar2 = R;
                        if (cVar2.isDebugEnabled()) {
                            cVar2.e(e11);
                        } else {
                            cVar2.f(e11.toString(), new Object[0]);
                        }
                    }
                }
            }
            MultiMap<String> multiMap2 = this.f74958s;
            if (multiMap2 == null) {
                this.f74958s = this.f74944e;
            } else {
                MultiMap<String> multiMap3 = this.f74944e;
                if (multiMap2 != multiMap3) {
                    for (Map.Entry<String, Object> entry : multiMap3.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        for (int i10 = 0; i10 < LazyList.size(value); i10++) {
                            this.f74958s.add(key, LazyList.get(value, i10));
                        }
                    }
                }
            }
            if (contentType != null && contentType.length() > 0 && contentType.startsWith(ShareTarget.ENCODING_TYPE_MULTIPART) && getAttribute("org.eclipse.multipartConfig") != null) {
                try {
                    J();
                } catch (IOException e12) {
                    if (R.isDebugEnabled()) {
                        R.e(e12);
                    } else {
                        R.f(e12.toString(), new Object[0]);
                    }
                } catch (ServletException e13) {
                    if (R.isDebugEnabled()) {
                        R.e(e13);
                    } else {
                        R.f(e13.toString(), new Object[0]);
                    }
                }
            }
            if (this.f74958s == null) {
                this.f74958s = this.f74944e;
            }
        } finally {
            if (this.f74958s == null) {
                this.f74958s = this.f74944e;
            }
        }
    }

    public void x0(boolean z10) {
        this.E = z10;
    }

    public c y() {
        return this.f74940a;
    }

    public void y0(String str) {
        this.H = str;
    }

    public sq.b z() {
        if (this.f74942c == null) {
            this.f74942c = new sq.c();
        }
        return this.f74942c;
    }

    public void z0(String str) {
        this.J = str;
    }
}
