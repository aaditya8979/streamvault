package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import kq.f;
import mq.n;
import mq.v;
import oq.c;
import oq.h;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.MultiMap;
import sq.q;
import zm.d;
import zm.e;
import zm.i;
import zm.k;
import zm.p;
import zm.t;

/* JADX INFO: compiled from: ServletHandler.java */
/* JADX INFO: loaded from: classes12.dex */
public class c extends h {
    public static final vq.c M;
    public static final vq.c N;
    public f C;
    public rq.b[] E;
    public List<rq.a> G;
    public MultiMap<String> H;
    public PathMap J;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public org.eclipse.jetty.servlet.b f76789t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c.d f76790u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public rq.a[] f76792w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public org.eclipse.jetty.servlet.a[] f76791v = new org.eclipse.jetty.servlet.a[0];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f76793x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f76794y = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f76795z = true;
    public int A = 512;
    public boolean B = false;
    public ServletHolder[] D = new ServletHolder[0];
    public final Map<String, org.eclipse.jetty.servlet.a> F = new HashMap();
    public final Map<String, ServletHolder> I = new HashMap();
    public final ConcurrentMap<String, e>[] K = new ConcurrentMap[31];
    public final Queue<String>[] L = new Queue[31];

    /* JADX INFO: compiled from: ServletHandler.java */
    public class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public org.eclipse.jetty.servlet.a f76796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f76797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ServletHolder f76798c;

        public a(Object obj, ServletHolder servletHolder) {
            if (LazyList.size(obj) <= 0) {
                this.f76798c = servletHolder;
            } else {
                this.f76796a = (org.eclipse.jetty.servlet.a) LazyList.get(obj, 0);
                this.f76797b = c.this.V0(LazyList.remove(obj, 0), servletHolder);
            }
        }

        @Override // zm.e
        public void a(p pVar, t tVar) throws ServletException, IOException {
            n nVarX = pVar instanceof n ? (n) pVar : mq.b.o().x();
            if (this.f76796a == null) {
                an.a aVar = (an.a) pVar;
                if (this.f76798c == null) {
                    if (c.this.A0() == null) {
                        c.this.W0(aVar, (an.c) tVar);
                        return;
                    } else {
                        c.this.F0(q.a(aVar.t(), aVar.l()), nVarX, aVar, (an.c) tVar);
                        return;
                    }
                }
                if (c.M.isDebugEnabled()) {
                    c.M.h("call servlet " + this.f76798c, new Object[0]);
                }
                this.f76798c.E0(nVarX, pVar, tVar);
                return;
            }
            if (c.M.isDebugEnabled()) {
                c.M.h("call filter " + this.f76796a, new Object[0]);
            }
            d dVarY0 = this.f76796a.y0();
            if (this.f76796a.r0()) {
                dVarY0.b(pVar, tVar, this.f76797b);
                return;
            }
            if (!nVarX.W()) {
                dVarY0.b(pVar, tVar, this.f76797b);
                return;
            }
            try {
                nVarX.e0(false);
                dVarY0.b(pVar, tVar, this.f76797b);
            } finally {
                nVarX.e0(true);
            }
        }

        public String toString() {
            if (this.f76796a == null) {
                ServletHolder servletHolder = this.f76798c;
                return servletHolder != null ? servletHolder.toString() : "null";
            }
            return this.f76796a + "->" + this.f76797b.toString();
        }
    }

    /* JADX INFO: compiled from: ServletHandler.java */
    public class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f76800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f76801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ServletHolder f76802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f76803d = 0;

        public b(n nVar, Object obj, ServletHolder servletHolder) {
            this.f76800a = nVar;
            this.f76801b = obj;
            this.f76802c = servletHolder;
        }

        @Override // zm.e
        public void a(p pVar, t tVar) throws ServletException, IOException {
            if (c.M.isDebugEnabled()) {
                c.M.h("doFilter " + this.f76803d, new Object[0]);
            }
            if (this.f76803d >= LazyList.size(this.f76801b)) {
                an.a aVar = (an.a) pVar;
                if (this.f76802c == null) {
                    if (c.this.A0() == null) {
                        c.this.W0(aVar, (an.c) tVar);
                        return;
                    } else {
                        c.this.F0(q.a(aVar.t(), aVar.l()), pVar instanceof n ? (n) pVar : mq.b.o().x(), aVar, (an.c) tVar);
                        return;
                    }
                }
                if (c.M.isDebugEnabled()) {
                    c.M.h("call servlet " + this.f76802c, new Object[0]);
                }
                this.f76802c.E0(this.f76800a, pVar, tVar);
                return;
            }
            Object obj = this.f76801b;
            int i10 = this.f76803d;
            this.f76803d = i10 + 1;
            org.eclipse.jetty.servlet.a aVar2 = (org.eclipse.jetty.servlet.a) LazyList.get(obj, i10);
            if (c.M.isDebugEnabled()) {
                c.M.h("call filter " + aVar2, new Object[0]);
            }
            d dVarY0 = aVar2.y0();
            if (aVar2.r0() || !this.f76800a.W()) {
                dVarY0.b(pVar, tVar, this);
                return;
            }
            try {
                this.f76800a.e0(false);
                dVarY0.b(pVar, tVar, this);
            } finally {
                this.f76800a.e0(true);
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < LazyList.size(this.f76801b); i10++) {
                sb2.append(LazyList.get(this.f76801b, i10).toString());
                sb2.append("->");
            }
            sb2.append(this.f76802c);
            return sb2.toString();
        }
    }

    static {
        vq.c cVarA = vq.b.a(c.class);
        M = cVarA;
        N = cVarA.a("unhandled");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01f8 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0141 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:19:0x0051, B:21:0x0057, B:22:0x005b, B:23:0x005f, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:32:0x007b, B:33:0x007f, B:40:0x008e, B:42:0x0096, B:45:0x009f, B:60:0x00f8, B:62:0x0100, B:64:0x0108, B:66:0x010c, B:68:0x0110, B:71:0x0115, B:72:0x0117, B:73:0x0118, B:74:0x011a, B:75:0x011b, B:76:0x011d, B:86:0x013d, B:88:0x0141, B:90:0x0145, B:92:0x0149, B:94:0x0151, B:104:0x01a1, B:106:0x01b1, B:108:0x01b5, B:110:0x01be, B:111:0x01c4, B:112:0x01ca, B:113:0x01ce, B:95:0x0162, B:97:0x0166, B:100:0x016b, B:102:0x0192, B:103:0x019a, B:120:0x01f0, B:121:0x01f3, B:122:0x01f4, B:123:0x01f7, B:124:0x01f8, B:125:0x01fb, B:129:0x0200, B:131:0x0202, B:133:0x0204), top: B:141:0x004f, inners: #3, #5, #6, #7 }] */
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
    @Override // oq.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(java.lang.String r18, mq.n r19, an.a r20, an.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.c.C0(java.lang.String, mq.n, an.a, an.c):void");
    }

    @Override // oq.h
    public void D0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException {
        ServletHolder servletHolder;
        String strT = nVar.t();
        String strL = nVar.l();
        DispatcherType dispatcherTypeF = nVar.F();
        if (str.startsWith("/")) {
            PathMap.a aVarO0 = O0(str);
            if (aVarO0 != null) {
                servletHolder = (ServletHolder) aVarO0.getValue();
                String str2 = (String) aVarO0.getKey();
                String strA = aVarO0.a() != null ? aVarO0.a() : PathMap.pathMatch(str2, str);
                String strPathInfo = PathMap.pathInfo(str2, str);
                if (DispatcherType.INCLUDE.equals(dispatcherTypeF)) {
                    nVar.a("javax.servlet.include.servlet_path", strA);
                    nVar.a("javax.servlet.include.path_info", strPathInfo);
                } else {
                    nVar.B0(strA);
                    nVar.p0(strPathInfo);
                }
            } else {
                servletHolder = null;
            }
        } else {
            servletHolder = this.I.get(str);
        }
        vq.c cVar2 = M;
        if (cVar2.isDebugEnabled()) {
            cVar2.h("servlet {}|{}|{} -> {}", nVar.e(), nVar.t(), nVar.l(), servletHolder);
        }
        try {
            v.a aVarV = nVar.V();
            nVar.G0(servletHolder);
            if (E0()) {
                G0(str, nVar, aVar, cVar);
            } else {
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
            }
            if (aVarV != null) {
                nVar.G0(aVarV);
            }
            if (DispatcherType.INCLUDE.equals(dispatcherTypeF)) {
                return;
            }
            nVar.B0(strT);
            nVar.p0(strL);
        } catch (Throwable th2) {
            if (0 != 0) {
                nVar.G0(null);
            }
            if (!DispatcherType.INCLUDE.equals(dispatcherTypeF)) {
                nVar.B0(strT);
                nVar.p0(strL);
            }
            throw th2;
        }
    }

    public void I0(ServletHolder servletHolder, String str) {
        ServletHolder[] servletHolderArrR0 = R0();
        if (servletHolderArrR0 != null) {
            servletHolderArrR0 = (ServletHolder[]) servletHolderArrR0.clone();
        }
        try {
            Y0((ServletHolder[]) LazyList.addToArray(servletHolderArrR0, servletHolder, ServletHolder.class));
            rq.b bVar = new rq.b();
            bVar.d(servletHolder.getName());
            bVar.c(str);
            X0((rq.b[]) LazyList.addToArray(Q0(), bVar, rq.b.class));
        } catch (Exception e10) {
            Y0(servletHolderArrR0);
            if (!(e10 instanceof RuntimeException)) {
                throw new RuntimeException(e10);
            }
            throw ((RuntimeException) e10);
        }
    }

    public void J0(d dVar) {
        org.eclipse.jetty.servlet.b bVar = this.f76789t;
        if (bVar != null) {
            bVar.n1(dVar);
        }
    }

    public void K0(i iVar) {
        org.eclipse.jetty.servlet.b bVar = this.f76789t;
        if (bVar != null) {
            bVar.o1(iVar);
        }
    }

    public e L0(n nVar, String str, ServletHolder servletHolder) {
        Object objAdd;
        MultiMap<String> multiMap;
        ConcurrentMap<String, e>[] concurrentMapArr;
        e eVar;
        String name = str == null ? servletHolder.getName() : str;
        int iC = rq.a.c(nVar.F());
        if (this.f76795z && (concurrentMapArr = this.K) != null && (eVar = concurrentMapArr[iC].get(name)) != null) {
            return eVar;
        }
        if (str == null || this.G == null) {
            objAdd = null;
        } else {
            objAdd = null;
            for (int i10 = 0; i10 < this.G.size(); i10++) {
                rq.a aVar = this.G.get(i10);
                if (aVar.b(str, iC)) {
                    objAdd = LazyList.add(objAdd, aVar.d());
                }
            }
        }
        if (servletHolder != null && (multiMap = this.H) != null && multiMap.size() > 0 && this.H.size() > 0) {
            Object obj = this.H.get(servletHolder.getName());
            for (int i11 = 0; i11 < LazyList.size(obj); i11++) {
                rq.a aVar2 = (rq.a) LazyList.get(obj, i11);
                if (aVar2.a(iC)) {
                    objAdd = LazyList.add(objAdd, aVar2.d());
                }
            }
            Object obj2 = this.H.get("*");
            for (int i12 = 0; i12 < LazyList.size(obj2); i12++) {
                rq.a aVar3 = (rq.a) LazyList.get(obj2, i12);
                if (aVar3.a(iC)) {
                    objAdd = LazyList.add(objAdd, aVar3.d());
                }
            }
        }
        if (objAdd == null) {
            return null;
        }
        if (!this.f76795z) {
            if (LazyList.size(objAdd) > 0) {
                return new b(nVar, objAdd, servletHolder);
            }
            return null;
        }
        a aVarV0 = LazyList.size(objAdd) > 0 ? V0(objAdd, servletHolder) : null;
        ConcurrentMap<String, e> concurrentMap = this.K[iC];
        Queue<String> queue = this.L[iC];
        while (true) {
            if (this.A <= 0 || concurrentMap.size() < this.A) {
                break;
            }
            String strPoll = queue.poll();
            if (strPoll == null) {
                concurrentMap.clear();
                break;
            }
            concurrentMap.remove(strPoll);
        }
        concurrentMap.put(name, aVarV0);
        queue.add(name);
        return aVarV0;
    }

    public rq.a[] M0() {
        return this.f76792w;
    }

    public org.eclipse.jetty.servlet.a[] N0() {
        return this.f76791v;
    }

    public PathMap.a O0(String str) {
        PathMap pathMap = this.J;
        if (pathMap == null) {
            return null;
        }
        return pathMap.getMatch(str);
    }

    public k P0() {
        return this.f76790u;
    }

    public rq.b[] Q0() {
        return this.E;
    }

    public ServletHolder[] R0() {
        return this.D;
    }

    public void S0() throws Exception {
        MultiException multiException = new MultiException();
        if (this.f76791v != null) {
            int i10 = 0;
            while (true) {
                org.eclipse.jetty.servlet.a[] aVarArr = this.f76791v;
                if (i10 >= aVarArr.length) {
                    break;
                }
                aVarArr[i10].start();
                i10++;
            }
        }
        ServletHolder[] servletHolderArr = this.D;
        if (servletHolderArr != null) {
            ServletHolder[] servletHolderArr2 = (ServletHolder[]) servletHolderArr.clone();
            Arrays.sort(servletHolderArr2);
            for (int i11 = 0; i11 < servletHolderArr2.length; i11++) {
                try {
                    if (servletHolderArr2[i11].m0() != null || servletHolderArr2[i11].B0() == null) {
                        servletHolderArr2[i11].start();
                    } else {
                        ServletHolder servletHolder = (ServletHolder) this.J.match(servletHolderArr2[i11].B0());
                        if (servletHolder != null && servletHolder.m0() != null) {
                            servletHolderArr2[i11].s0(servletHolder.m0());
                            servletHolderArr2[i11].start();
                        }
                        multiException.add(new IllegalStateException("No forced path servlet for " + servletHolderArr2[i11].B0()));
                    }
                } catch (Throwable th2) {
                    M.debug("EXCEPTION ", th2);
                    multiException.add(th2);
                }
            }
            multiException.ifExceptionThrow();
        }
    }

    public void T0() {
        Queue<String> queue = this.L[1];
        if (queue != null) {
            queue.clear();
            this.L[2].clear();
            this.L[4].clear();
            this.L[8].clear();
            this.L[16].clear();
            this.K[1].clear();
            this.K[2].clear();
            this.K[4].clear();
            this.K[8].clear();
            this.K[16].clear();
        }
    }

    public boolean U0() {
        return this.B;
    }

    public a V0(Object obj, ServletHolder servletHolder) {
        return new a(obj, servletHolder);
    }

    public void W0(an.a aVar, an.c cVar) throws IOException {
        vq.c cVar2 = M;
        if (cVar2.isDebugEnabled()) {
            cVar2.h("Not Found " + aVar.v(), new Object[0]);
        }
    }

    public void X0(rq.b[] bVarArr) {
        if (b() != null) {
            b().E0().update((Object) this, (Object[]) this.E, (Object[]) bVarArr, "servletMapping", true);
        }
        this.E = bVarArr;
        Z0();
        T0();
    }

    public synchronized void Y0(ServletHolder[] servletHolderArr) {
        if (b() != null) {
            b().E0().update((Object) this, (Object[]) this.D, (Object[]) servletHolderArr, "servlet", true);
        }
        this.D = servletHolderArr;
        a1();
        T0();
    }

    public synchronized void Z0() {
        if (this.f76792w != null) {
            this.G = new ArrayList();
            this.H = new MultiMap<>();
            int i10 = 0;
            while (true) {
                rq.a[] aVarArr = this.f76792w;
                if (i10 >= aVarArr.length) {
                    break;
                }
                org.eclipse.jetty.servlet.a aVar = this.F.get(aVarArr[i10].e());
                if (aVar == null) {
                    throw new IllegalStateException("No filter named " + this.f76792w[i10].e());
                }
                this.f76792w[i10].h(aVar);
                if (this.f76792w[i10].f() != null) {
                    this.G.add(this.f76792w[i10]);
                }
                if (this.f76792w[i10].g() != null) {
                    for (String str : this.f76792w[i10].g()) {
                        if (str != null) {
                            this.H.add(str, this.f76792w[i10]);
                        }
                    }
                }
                i10++;
            }
        } else {
            this.G = null;
            this.H = null;
        }
        if (this.E == null || this.I == null) {
            this.J = null;
        } else {
            PathMap pathMap = new PathMap();
            int i11 = 0;
            while (true) {
                rq.b[] bVarArr = this.E;
                if (i11 >= bVarArr.length) {
                    this.J = pathMap;
                    break;
                }
                ServletHolder servletHolder = this.I.get(bVarArr[i11].b());
                if (servletHolder == null) {
                    throw new IllegalStateException("No such servlet: " + this.E[i11].b());
                }
                if (servletHolder.I0() && this.E[i11].a() != null) {
                    for (String str2 : this.E[i11].a()) {
                        if (str2 != null) {
                            pathMap.put(str2, servletHolder);
                        }
                    }
                }
                i11++;
            }
        }
        ConcurrentMap<String, e>[] concurrentMapArr = this.K;
        if (concurrentMapArr != null) {
            int length = concurrentMapArr.length;
            while (true) {
                int i12 = length - 1;
                if (length <= 0) {
                    break;
                }
                ConcurrentMap<String, e> concurrentMap = this.K[i12];
                if (concurrentMap != null) {
                    concurrentMap.clear();
                }
                length = i12;
            }
        }
        vq.c cVar = M;
        if (cVar.isDebugEnabled()) {
            cVar.h("filterNameMap=" + this.F, new Object[0]);
            cVar.h("pathFilters=" + this.G, new Object[0]);
            cVar.h("servletFilterMap=" + this.H, new Object[0]);
            cVar.h("servletPathMap=" + this.J, new Object[0]);
            cVar.h("servletNameMap=" + this.I, new Object[0]);
        }
        try {
            org.eclipse.jetty.servlet.b bVar = this.f76789t;
            if ((bVar != null && bVar.isStarted()) || (this.f76789t == null && isStarted())) {
                S0();
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public synchronized void a1() {
        this.F.clear();
        int i10 = 0;
        if (this.f76791v != null) {
            int i11 = 0;
            while (true) {
                org.eclipse.jetty.servlet.a[] aVarArr = this.f76791v;
                if (i11 >= aVarArr.length) {
                    break;
                }
                this.F.put(aVarArr[i11].getName(), this.f76791v[i11]);
                this.f76791v[i11].w0(this);
                i11++;
            }
        }
        this.I.clear();
        if (this.D != null) {
            while (true) {
                ServletHolder[] servletHolderArr = this.D;
                if (i10 >= servletHolderArr.length) {
                    break;
                }
                this.I.put(servletHolderArr[i10].getName(), this.D[i10]);
                this.D[i10].w0(this);
                i10++;
            }
        }
    }

    @Override // oq.h, oq.g, oq.a, uq.b, uq.a
    public synchronized void d0() throws Exception {
        kq.k kVar;
        c.d dVarV0 = oq.c.V0();
        this.f76790u = dVarV0;
        org.eclipse.jetty.servlet.b bVar = (org.eclipse.jetty.servlet.b) (dVarV0 == null ? null : dVarV0.b());
        this.f76789t = bVar;
        if (bVar != null && (kVar = (kq.k) bVar.z0(kq.k.class)) != null) {
            this.C = kVar.e();
        }
        a1();
        Z0();
        if (this.f76795z) {
            this.K[1] = new ConcurrentHashMap();
            this.K[2] = new ConcurrentHashMap();
            this.K[4] = new ConcurrentHashMap();
            this.K[8] = new ConcurrentHashMap();
            this.K[16] = new ConcurrentHashMap();
            this.L[1] = new ConcurrentLinkedQueue();
            this.L[2] = new ConcurrentLinkedQueue();
            this.L[4] = new ConcurrentLinkedQueue();
            this.L[8] = new ConcurrentLinkedQueue();
            this.L[16] = new ConcurrentLinkedQueue();
        }
        super.d0();
        org.eclipse.jetty.servlet.b bVar2 = this.f76789t;
        if (bVar2 == null || !(bVar2 instanceof org.eclipse.jetty.servlet.b)) {
            S0();
        }
    }

    public f e() {
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[Catch: all -> 0x011d, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0013, B:8:0x0018, B:12:0x0028, B:14:0x0034, B:15:0x0045, B:17:0x004b, B:19:0x0063, B:20:0x0067, B:11:0x0021, B:22:0x0070, B:24:0x0087, B:27:0x008b, B:29:0x0090, B:31:0x00a3, B:34:0x00a8, B:38:0x00b8, B:40:0x00c4, B:41:0x00d5, B:43:0x00db, B:45:0x00f3, B:46:0x00f7, B:37:0x00b1, B:48:0x0100), top: B:58:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100 A[Catch: all -> 0x011d, EDGE_INSN: B:67:0x0100->B:48:0x0100 BREAK  A[LOOP:2: B:32:0x00a4->B:47:0x00fe], TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0013, B:8:0x0018, B:12:0x0028, B:14:0x0034, B:15:0x0045, B:17:0x004b, B:19:0x0063, B:20:0x0067, B:11:0x0021, B:22:0x0070, B:24:0x0087, B:27:0x008b, B:29:0x0090, B:31:0x00a3, B:34:0x00a8, B:38:0x00b8, B:40:0x00c4, B:41:0x00d5, B:43:0x00db, B:45:0x00f3, B:46:0x00f7, B:37:0x00b1, B:48:0x0100), top: B:58:0x0001, inners: #0, #1 }] */
    @Override // oq.g, oq.a, uq.b, uq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void e0() throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.c.e0():void");
    }

    @Override // oq.g, oq.a, mq.i
    public void f(mq.p pVar) {
        mq.p pVarB = b();
        if (pVarB != null && pVarB != pVar) {
            b().E0().update((Object) this, (Object[]) this.f76791v, (Object[]) null, "filter", true);
            b().E0().update((Object) this, (Object[]) this.f76792w, (Object[]) null, "filterMapping", true);
            b().E0().update((Object) this, (Object[]) this.D, (Object[]) null, "servlet", true);
            b().E0().update((Object) this, (Object[]) this.E, (Object[]) null, "servletMapping", true);
        }
        super.f(pVar);
        if (pVar == null || pVarB == pVar) {
            return;
        }
        pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.f76791v, "filter", true);
        pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.f76792w, "filterMapping", true);
        pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.D, "servlet", true);
        pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.E, "servletMapping", true);
    }

    @Override // oq.b, uq.b, uq.e
    public void w(Appendable appendable, String str) throws IOException {
        super.s0(appendable);
        uq.b.p0(appendable, str, sq.p.a(N()), u0(), sq.p.a(M0()), sq.p.a(N0()), sq.p.a(Q0()), sq.p.a(R0()));
    }
}
