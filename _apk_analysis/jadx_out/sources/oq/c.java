package oq;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.servlet.DispatcherType;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.ServletRequestEvent;
import mq.i;
import mq.n;
import mq.p;
import org.eclipse.jetty.http.HttpException;
import org.eclipse.jetty.util.LazyList;
import sq.o;
import sq.q;
import zm.k;
import zm.l;
import zm.r;

/* JADX INFO: compiled from: ContextHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends h implements sq.b, p.a {
    public static final vq.c X = vq.b.a(c.class);
    public static final ThreadLocal<d> Y = new ThreadLocal<>();
    public wq.e A;
    public gq.p B;
    public e C;
    public String[] D;
    public Set<String> E;
    public EventListener[] F;
    public vq.c G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public Object M;
    public Object N;
    public Object O;
    public Object P;
    public Object Q;
    public Map<String, Object> R;
    public String[] S;
    public final CopyOnWriteArrayList<a> T;
    public boolean U;
    public boolean V;
    public volatile int W;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f76518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final sq.c f76519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final sq.c f76520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map<String, String> f76521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ClassLoader f76522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f76523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f76524z;

    /* JADX INFO: compiled from: ContextHandler.java */
    public interface a {
    }

    /* JADX INFO: compiled from: ContextHandler.java */
    public static class b implements a {
    }

    /* JADX INFO: renamed from: oq.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ContextHandler.java */
    public static class C0911c implements uq.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClassLoader f76525b;

        public C0911c(ClassLoader classLoader) {
            this.f76525b = classLoader;
        }

        @Override // uq.e
        public void w(Appendable appendable, String str) throws IOException {
            ClassLoader parent;
            appendable.append(String.valueOf(this.f76525b)).append("\n");
            ClassLoader classLoader = this.f76525b;
            if (classLoader == null || (parent = classLoader.getParent()) == null) {
                return;
            }
            boolean z10 = parent instanceof uq.e;
            Object c0911c = parent;
            if (!z10) {
                c0911c = new C0911c(parent);
            }
            ClassLoader classLoader2 = this.f76525b;
            if (classLoader2 instanceof URLClassLoader) {
                uq.b.p0(appendable, str, sq.p.a(((URLClassLoader) classLoader2).getURLs()), Collections.singleton(c0911c));
            } else {
                uq.b.p0(appendable, str, Collections.singleton(c0911c));
            }
        }
    }

    /* JADX INFO: compiled from: ContextHandler.java */
    public class d implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f76526a = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f76527b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f76528c = true;

        public d() {
        }

        public synchronized Enumeration a() {
            HashSet hashSet;
            hashSet = new HashSet();
            if (c.this.f76520v != null) {
                Enumeration<String> enumerationC = c.this.f76520v.c();
                while (enumerationC.hasMoreElements()) {
                    hashSet.add(enumerationC.nextElement());
                }
            }
            Enumeration<String> enumerationC2 = c.this.f76519u.c();
            while (enumerationC2.hasMoreElements()) {
                hashSet.add(enumerationC2.nextElement());
            }
            return Collections.enumeration(hashSet);
        }

        public c b() {
            return c.this;
        }

        public String c(String str) {
            return c.this.getInitParameter(str);
        }

        @Override // zm.k
        public zm.h d(String str) {
            String strSubstring;
            if (str == null || !str.startsWith("/")) {
                return null;
            }
            try {
                int iIndexOf = str.indexOf(63);
                if (iIndexOf > 0) {
                    strSubstring = str.substring(iIndexOf + 1);
                    str = str.substring(0, iIndexOf);
                } else {
                    strSubstring = null;
                }
                String strB = q.b(q.d(str));
                if (strB != null) {
                    return new mq.h(c.this, q.a(e(), str), strB, strSubstring);
                }
            } catch (Exception e10) {
                c.X.g(e10);
            }
            return null;
        }

        @Override // zm.k
        public String e() {
            return (c.this.f76523y == null || !c.this.f76523y.equals("/")) ? c.this.f76523y : "";
        }

        @Override // zm.k
        public void f(String str, Throwable th2) {
            c.this.G.d(str, th2);
        }

        @Override // zm.k
        public void g(String str) {
            c.this.G.i(str, new Object[0]);
        }

        @Override // zm.k
        public synchronized Object getAttribute(String str) {
            Object attribute;
            attribute = c.this.getAttribute(str);
            if (attribute == null && c.this.f76520v != null) {
                attribute = c.this.f76520v.getAttribute(str);
            }
            return attribute;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00af A[PHI: r4 r8
          0x00af: PHI (r4v6 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v9 int), (r4v2 int) binds: [B:6:0x0020, B:21:0x005b, B:23:0x0062, B:87:0x00af, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]
          0x00af: PHI (r8v8 java.lang.String) = 
          (r8v1 java.lang.String)
          (r8v1 java.lang.String)
          (r8v1 java.lang.String)
          (r8v12 java.lang.String)
          (r8v1 java.lang.String)
         binds: [B:6:0x0020, B:21:0x005b, B:23:0x0062, B:87:0x00af, B:15:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00a1 A[SYNTHETIC] */
        @Override // zm.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public zm.k getContext(java.lang.String r18) {
            /*
                Method dump skipped, instruction units count: 319
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oq.c.d.getContext(java.lang.String):zm.k");
        }

        public Enumeration h() {
            return c.this.Z0();
        }

        public void i(boolean z10) {
            this.f76528c = z10;
        }

        public String toString() {
            return "ServletContext@" + c.this.toString();
        }
    }

    public c() {
        this.f76523y = "/";
        this.I = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", -1).intValue();
        this.J = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", -1).intValue();
        this.K = false;
        this.L = false;
        this.T = new CopyOnWriteArrayList<>();
        this.U = false;
        this.V = true;
        this.f76518t = new d();
        this.f76519u = new sq.c();
        this.f76520v = new sq.c();
        this.f76521w = new HashMap();
        M0(new b());
    }

    public c(d dVar) {
        this.f76523y = "/";
        this.I = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormKeys", -1).intValue();
        this.J = Integer.getInteger("org.eclipse.jetty.server.Request.maxFormContentSize", -1).intValue();
        this.K = false;
        this.L = false;
        this.T = new CopyOnWriteArrayList<>();
        this.U = false;
        this.V = true;
        this.f76518t = dVar;
        this.f76519u = new sq.c();
        this.f76520v = new sq.c();
        this.f76521w = new HashMap();
        M0(new b());
    }

    public static d V0() {
        return Y.get();
    }

    @Override // oq.h
    public void C0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException {
        DispatcherType dispatcherTypeF = nVar.F();
        boolean zH0 = nVar.H0();
        try {
            if (zH0) {
                try {
                    Object obj = this.P;
                    if (obj != null) {
                        int size = LazyList.size(obj);
                        for (int i10 = 0; i10 < size; i10++) {
                            nVar.w((EventListener) LazyList.get(this.P, i10));
                        }
                    }
                    Object obj2 = this.O;
                    if (obj2 != null) {
                        int size2 = LazyList.size(obj2);
                        ServletRequestEvent servletRequestEvent = new ServletRequestEvent(this.f76518t, aVar);
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((r) LazyList.get(this.O, i11)).q(servletRequestEvent);
                        }
                    }
                } catch (HttpException e10) {
                    X.b(e10);
                    nVar.m0(true);
                    cVar.m(e10.getStatus(), e10.getReason());
                    if (!zH0) {
                        return;
                    }
                    if (this.O != null) {
                        ServletRequestEvent servletRequestEvent2 = new ServletRequestEvent(this.f76518t, aVar);
                        int size3 = LazyList.size(this.O);
                        while (true) {
                            int i12 = size3 - 1;
                            if (size3 <= 0) {
                                break;
                            }
                            ((r) LazyList.get(this.O, i12)).z(servletRequestEvent2);
                            size3 = i12;
                        }
                    }
                    Object obj3 = this.P;
                    if (obj3 == null) {
                        return;
                    }
                    int size4 = LazyList.size(obj3);
                    while (true) {
                        int i13 = size4 - 1;
                        if (size4 <= 0) {
                            return;
                        }
                        nVar.d0((EventListener) LazyList.get(this.P, i13));
                        size4 = i13;
                    }
                }
            }
            if (DispatcherType.REQUEST.equals(dispatcherTypeF) && e1(str)) {
                throw new HttpException(404);
            }
            if (E0()) {
                F0(str, nVar, aVar, cVar);
            } else {
                h hVar = this.f76548r;
                if (hVar == null || hVar != this.f76545p) {
                    i iVar = this.f76545p;
                    if (iVar != null) {
                        iVar.a0(str, nVar, aVar, cVar);
                    }
                } else {
                    hVar.C0(str, nVar, aVar, cVar);
                }
            }
            if (!zH0) {
                return;
            }
            if (this.O != null) {
                ServletRequestEvent servletRequestEvent3 = new ServletRequestEvent(this.f76518t, aVar);
                int size5 = LazyList.size(this.O);
                while (true) {
                    int i14 = size5 - 1;
                    if (size5 <= 0) {
                        break;
                    }
                    ((r) LazyList.get(this.O, i14)).z(servletRequestEvent3);
                    size5 = i14;
                }
            }
            Object obj4 = this.P;
            if (obj4 == null) {
                return;
            }
            int size6 = LazyList.size(obj4);
            while (true) {
                int i15 = size6 - 1;
                if (size6 <= 0) {
                    return;
                }
                nVar.d0((EventListener) LazyList.get(this.P, i15));
                size6 = i15;
            }
        } catch (Throwable th2) {
            if (zH0) {
                if (this.O != null) {
                    ServletRequestEvent servletRequestEvent4 = new ServletRequestEvent(this.f76518t, aVar);
                    int size7 = LazyList.size(this.O);
                    while (true) {
                        int i16 = size7 - 1;
                        if (size7 <= 0) {
                            break;
                        }
                        ((r) LazyList.get(this.O, i16)).z(servletRequestEvent4);
                        size7 = i16;
                    }
                }
                Object obj5 = this.P;
                if (obj5 != null) {
                    int size8 = LazyList.size(obj5);
                    while (true) {
                        int i17 = size8 - 1;
                        if (size8 <= 0) {
                            break;
                        }
                        nVar.d0((EventListener) LazyList.get(this.P, i17));
                        size8 = i17;
                    }
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:45:0x00d2, B:47:0x00df, B:49:0x00e5, B:51:0x00ee, B:53:0x00f9, B:52:0x00f4, B:54:0x0100, B:56:0x0106, B:57:0x0126, B:59:0x012c, B:60:0x0130, B:62:0x0134, B:63:0x0138, B:65:0x013c, B:66:0x0140), top: B:92:0x00d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    @Override // oq.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D0(java.lang.String r18, mq.n r19, an.a r20, an.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.c.D0(java.lang.String, mq.n, an.a, an.c):void");
    }

    public void M0(a aVar) {
        this.T.add(aVar);
    }

    public void N0(EventListener eventListener) {
        if (!isStarted() && !D()) {
            this.Q = LazyList.add(this.Q, eventListener);
        }
        j1((EventListener[]) LazyList.addToArray(Y0(), eventListener, EventListener.class));
    }

    public void O0(l lVar, ServletContextEvent servletContextEvent) {
        lVar.r(servletContextEvent);
    }

    public boolean P0(String str, n nVar, an.c cVar) throws ServletException, IOException {
        String name;
        DispatcherType dispatcherTypeF = nVar.F();
        int i10 = this.W;
        if (i10 != 0 && i10 != 2) {
            if (i10 != 3) {
                if (DispatcherType.REQUEST.equals(dispatcherTypeF) && nVar.X()) {
                    return false;
                }
                String[] strArr = this.D;
                if (strArr != null && strArr.length > 0) {
                    String strG1 = g1(nVar.s());
                    boolean zRegionMatches = false;
                    int i11 = 0;
                    while (!zRegionMatches) {
                        String[] strArr2 = this.D;
                        if (i11 >= strArr2.length) {
                            break;
                        }
                        String str2 = strArr2[i11];
                        if (str2 != null) {
                            zRegionMatches = str2.startsWith("*.") ? str2.regionMatches(true, 2, strG1, strG1.indexOf(".") + 1, str2.length() - 2) : str2.equalsIgnoreCase(strG1);
                        }
                        i11++;
                    }
                    if (!zRegionMatches) {
                        return false;
                    }
                }
                Set<String> set = this.E;
                if (set != null && set.size() > 0 && ((name = mq.b.o().n().getName()) == null || !this.E.contains(name))) {
                    return false;
                }
                if (this.f76523y.length() > 1) {
                    if (!str.startsWith(this.f76523y)) {
                        return false;
                    }
                    if (str.length() > this.f76523y.length() && str.charAt(this.f76523y.length()) != '/') {
                        return false;
                    }
                    if (!this.H && this.f76523y.length() == str.length()) {
                        nVar.m0(true);
                        if (nVar.i() != null) {
                            cVar.g(q.a(nVar.v(), "/") + "?" + nVar.i());
                        } else {
                            cVar.g(q.a(nVar.v(), "/"));
                        }
                        return false;
                    }
                }
                return true;
            }
            nVar.m0(true);
            cVar.o(503);
        }
        return false;
    }

    public void Q0(String str, Object obj) {
        Map<String, Object> map = this.R;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        k1(str, obj);
    }

    public wq.e R0() {
        wq.e eVar = this.A;
        if (eVar == null) {
            return null;
        }
        return eVar;
    }

    public ClassLoader S0() {
        return this.f76522x;
    }

    public String T0() {
        ClassLoader classLoader = this.f76522x;
        if (classLoader == null || !(classLoader instanceof URLClassLoader)) {
            return null;
        }
        URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
        StringBuilder sb2 = new StringBuilder();
        for (URL url : uRLs) {
            try {
                File fileB = f1(url).b();
                if (fileB != null && fileB.exists()) {
                    if (sb2.length() > 0) {
                        sb2.append(File.pathSeparatorChar);
                    }
                    sb2.append(fileB.getAbsolutePath());
                }
            } catch (IOException e10) {
                X.b(e10);
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    public String U0() {
        return this.f76523y;
    }

    public String W0() {
        return this.f76524z;
    }

    public e X0() {
        return this.C;
    }

    public EventListener[] Y0() {
        return this.F;
    }

    public Enumeration Z0() {
        return Collections.enumeration(this.f76521w.keySet());
    }

    @Override // sq.b
    public void a(String str, Object obj) {
        Q0(str, obj);
        this.f76519u.a(str, obj);
    }

    public int a1() {
        return this.J;
    }

    public int b1() {
        return this.I;
    }

    public d c1() {
        return this.f76518t;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    @Override // oq.h, oq.g, oq.a, uq.b, uq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d0() throws java.lang.Exception {
        /*
            r5 = this;
            r0 = 0
            r5.W = r0
            java.lang.String r0 = r5.f76523y
            if (r0 == 0) goto L83
            java.lang.String r0 = r5.W0()
            if (r0 != 0) goto L12
            java.lang.String r0 = r5.U0()
            goto L16
        L12:
            java.lang.String r0 = r5.W0()
        L16:
            vq.c r0 = vq.b.b(r0)
            r5.G = r0
            r0 = 0
            java.lang.ClassLoader r1 = r5.f76522x     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L32
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L73
            java.lang.ClassLoader r2 = r1.getContextClassLoader()     // Catch: java.lang.Throwable -> L2f
            java.lang.ClassLoader r3 = r5.f76522x     // Catch: java.lang.Throwable -> L71
            r1.setContextClassLoader(r3)     // Catch: java.lang.Throwable -> L71
            goto L34
        L2f:
            r3 = move-exception
            r2 = r0
            goto L76
        L32:
            r1 = r0
            r2 = r1
        L34:
            gq.p r3 = r5.B     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto L3f
            gq.p r3 = new gq.p     // Catch: java.lang.Throwable -> L71
            r3.<init>()     // Catch: java.lang.Throwable -> L71
            r5.B = r3     // Catch: java.lang.Throwable -> L71
        L3f:
            java.lang.ThreadLocal<oq.c$d> r3 = oq.c.Y     // Catch: java.lang.Throwable -> L71
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L71
            oq.c$d r4 = (oq.c.d) r4     // Catch: java.lang.Throwable -> L71
            oq.c$d r0 = r5.f76518t     // Catch: java.lang.Throwable -> L6e
            r3.set(r0)     // Catch: java.lang.Throwable -> L6e
            r5.l1()     // Catch: java.lang.Throwable -> L6e
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6e
            boolean r0 = r5.U     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L56
            r0 = 2
            goto L5d
        L56:
            boolean r0 = r5.V     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = 3
        L5d:
            r5.W = r0     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            r3.set(r4)
            java.lang.ClassLoader r0 = r5.f76522x
            if (r0 == 0) goto L6a
            r1.setContextClassLoader(r2)
        L6a:
            return
        L6b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L6e
        L6e:
            r3 = move-exception
            r0 = r4
            goto L76
        L71:
            r3 = move-exception
            goto L76
        L73:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L76:
            java.lang.ThreadLocal<oq.c$d> r4 = oq.c.Y
            r4.set(r0)
            java.lang.ClassLoader r0 = r5.f76522x
            if (r0 == 0) goto L82
            r1.setContextClassLoader(r2)
        L82:
            throw r3
        L83:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Null contextPath"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.c.d0():void");
    }

    public String[] d1() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    @Override // oq.g, oq.a, uq.b, uq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0() throws java.lang.Exception {
        /*
            r11 = this;
            java.lang.String r0 = "stopped {}"
            r1 = 0
            r11.W = r1
            java.lang.ThreadLocal<oq.c$d> r2 = oq.c.Y
            java.lang.Object r3 = r2.get()
            oq.c$d r3 = (oq.c.d) r3
            oq.c$d r4 = r11.f76518t
            r2.set(r4)
            r2 = 1
            r4 = 0
            java.lang.ClassLoader r5 = r11.f76522x     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L2c
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L9e
            java.lang.ClassLoader r6 = r5.getContextClassLoader()     // Catch: java.lang.Throwable -> L26
            java.lang.ClassLoader r7 = r11.f76522x     // Catch: java.lang.Throwable -> L9c
            r5.setContextClassLoader(r7)     // Catch: java.lang.Throwable -> L9c
            goto L2e
        L26:
            r6 = move-exception
            r10 = r6
            r6 = r4
            r4 = r10
            goto La2
        L2c:
            r5 = r4
            r6 = r5
        L2e:
            super.e0()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r7 = r11.M     // Catch: java.lang.Throwable -> L9c
            if (r7 == 0) goto L53
            javax.servlet.ServletContextEvent r7 = new javax.servlet.ServletContextEvent     // Catch: java.lang.Throwable -> L9c
            oq.c$d r8 = r11.f76518t     // Catch: java.lang.Throwable -> L9c
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r8 = r11.M     // Catch: java.lang.Throwable -> L9c
            int r8 = org.eclipse.jetty.util.LazyList.size(r8)     // Catch: java.lang.Throwable -> L9c
        L42:
            int r9 = r8 + (-1)
            if (r8 <= 0) goto L53
            java.lang.Object r8 = r11.M     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r8 = org.eclipse.jetty.util.LazyList.get(r8, r9)     // Catch: java.lang.Throwable -> L9c
            zm.l r8 = (zm.l) r8     // Catch: java.lang.Throwable -> L9c
            r8.k(r7)     // Catch: java.lang.Throwable -> L9c
            r8 = r9
            goto L42
        L53:
            java.lang.Object r7 = r11.Q     // Catch: java.lang.Throwable -> L9c
            java.lang.Class<java.util.EventListener> r8 = java.util.EventListener.class
            java.lang.Object r7 = org.eclipse.jetty.util.LazyList.toArray(r7, r8)     // Catch: java.lang.Throwable -> L9c
            java.util.EventListener[] r7 = (java.util.EventListener[]) r7     // Catch: java.lang.Throwable -> L9c
            java.util.EventListener[] r7 = (java.util.EventListener[]) r7     // Catch: java.lang.Throwable -> L9c
            r11.j1(r7)     // Catch: java.lang.Throwable -> L9c
            r11.Q = r4     // Catch: java.lang.Throwable -> L9c
            oq.e r7 = r11.C     // Catch: java.lang.Throwable -> L9c
            if (r7 == 0) goto L6b
            r7.stop()     // Catch: java.lang.Throwable -> L9c
        L6b:
            oq.c$d r7 = r11.f76518t     // Catch: java.lang.Throwable -> L9c
            java.util.Enumeration r7 = r7.a()     // Catch: java.lang.Throwable -> L9c
        L71:
            boolean r8 = r7.hasMoreElements()     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L81
            java.lang.Object r8 = r7.nextElement()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L9c
            r11.Q0(r8, r4)     // Catch: java.lang.Throwable -> L9c
            goto L71
        L81:
            vq.c r4 = oq.c.X
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r11
            r4.i(r0, r2)
            java.lang.ThreadLocal<oq.c$d> r0 = oq.c.Y
            r0.set(r3)
            java.lang.ClassLoader r0 = r11.f76522x
            if (r0 == 0) goto L96
            r5.setContextClassLoader(r6)
        L96:
            sq.c r0 = r11.f76520v
            r0.u()
            return
        L9c:
            r4 = move-exception
            goto La2
        L9e:
            r5 = move-exception
            r6 = r4
            r4 = r5
            r5 = r6
        La2:
            vq.c r7 = oq.c.X
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r11
            r7.i(r0, r2)
            java.lang.ThreadLocal<oq.c$d> r0 = oq.c.Y
            r0.set(r3)
            java.lang.ClassLoader r0 = r11.f76522x
            if (r0 == 0) goto Lb7
            r5.setContextClassLoader(r6)
        Lb7:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.c.e0():void");
    }

    public boolean e1(String str) {
        boolean z10 = false;
        if (str != null && this.S != null) {
            while (str.startsWith("//")) {
                str = q.c(str);
            }
            int i10 = 0;
            while (!z10) {
                String[] strArr = this.S;
                if (i10 >= strArr.length) {
                    break;
                }
                int i11 = i10 + 1;
                boolean zG = o.g(str, strArr[i10]);
                i10 = i11;
                z10 = zG;
            }
        }
        return z10;
    }

    @Override // oq.g, oq.a, mq.i
    public void f(p pVar) {
        if (this.C == null) {
            super.f(pVar);
            return;
        }
        p pVarB = b();
        if (pVarB != null && pVarB != pVar) {
            pVarB.E0().update((Object) this, (Object) this.C, (Object) null, "error", true);
        }
        super.f(pVar);
        if (pVar != null && pVar != pVarB) {
            pVar.E0().update((Object) this, (Object) null, (Object) this.C, "error", true);
        }
        this.C.f(pVar);
    }

    public wq.e f1(URL url) throws IOException {
        return wq.e.g(url);
    }

    public final String g1(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
    }

    @Override // sq.b
    public Object getAttribute(String str) {
        return this.f76519u.getAttribute(str);
    }

    public String getInitParameter(String str) {
        return this.f76521w.get(str);
    }

    public void h1(String str) {
        if (str != null && str.length() > 1 && str.endsWith("/")) {
            throw new IllegalArgumentException("ends with /");
        }
        this.f76523y = str;
        if (b() != null) {
            if (b().D() || b().isStarted()) {
                i[] iVarArrU = b().U(oq.d.class);
                for (int i10 = 0; iVarArrU != null && i10 < iVarArrU.length; i10++) {
                    ((oq.d) iVarArrU[i10]).D0();
                }
            }
        }
    }

    public void i1(e eVar) {
        if (eVar != null) {
            eVar.f(b());
        }
        if (b() != null) {
            b().E0().update((Object) this, (Object) this.C, (Object) eVar, "errorHandler", true);
        }
        this.C = eVar;
    }

    public void j1(EventListener[] eventListenerArr) {
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.F = eventListenerArr;
        for (int i10 = 0; eventListenerArr != null && i10 < eventListenerArr.length; i10++) {
            EventListener eventListener = this.F[i10];
            if (eventListener instanceof l) {
                this.M = LazyList.add(this.M, eventListener);
            }
            if (eventListener instanceof r) {
                this.O = LazyList.add(this.O, eventListener);
            }
            if (eventListener instanceof zm.q) {
                this.P = LazyList.add(this.P, eventListener);
            }
        }
    }

    public void k1(String str, Object obj) {
        b().E0().update((Object) this, this.R.put(str, obj), obj, str, true);
    }

    public void l1() throws Exception {
        String str = this.f76521w.get("org.eclipse.jetty.server.context.ManagedAttributes");
        if (str != null) {
            this.R = new HashMap();
            for (String str2 : str.split(StringUtils.COMMA)) {
                this.R.put(str2, null);
            }
            Enumeration enumerationA = this.f76518t.a();
            while (enumerationA.hasMoreElements()) {
                String str3 = (String) enumerationA.nextElement();
                Q0(str3, this.f76518t.getAttribute(str3));
            }
        }
        super.d0();
        e eVar = this.C;
        if (eVar != null) {
            eVar.start();
        }
        if (this.M != null) {
            ServletContextEvent servletContextEvent = new ServletContextEvent(this.f76518t);
            for (int i10 = 0; i10 < LazyList.size(this.M); i10++) {
                O0((l) LazyList.get(this.M, i10), servletContextEvent);
            }
        }
    }

    @Override // mq.p.a
    public void r(boolean z10) {
        synchronized (this) {
            this.U = z10;
            this.W = isRunning() ? this.U ? 2 : this.V ? 1 : 3 : 0;
        }
    }

    @Override // sq.b
    public void removeAttribute(String str) {
        Q0(str, null);
        this.f76519u.removeAttribute(str);
    }

    public String toString() {
        String name;
        String[] strArrD1 = d1();
        StringBuilder sb2 = new StringBuilder();
        Package r22 = getClass().getPackage();
        if (r22 != null && (name = r22.getName()) != null && name.length() > 0) {
            for (String str : name.split("\\.")) {
                sb2.append(str.charAt(0));
                sb2.append('.');
            }
        }
        sb2.append(getClass().getSimpleName());
        sb2.append('{');
        sb2.append(U0());
        sb2.append(',');
        sb2.append(R0());
        if (strArrD1 != null && strArrD1.length > 0) {
            sb2.append(',');
            sb2.append(strArrD1[0]);
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // sq.b
    public void u() {
        Enumeration<String> enumerationC = this.f76519u.c();
        while (enumerationC.hasMoreElements()) {
            Q0(enumerationC.nextElement(), null);
        }
        this.f76519u.u();
    }

    @Override // oq.b, uq.b, uq.e
    public void w(Appendable appendable, String str) throws IOException {
        s0(appendable);
        uq.b.p0(appendable, str, Collections.singletonList(new C0911c(S0())), sq.p.a(N()), u0(), this.f76521w.entrySet(), this.f76519u.b(), this.f76520v.b());
    }
}
