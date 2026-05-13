package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import kq.f;
import kq.j;
import mq.n;
import mq.v;
import oq.c;
import org.eclipse.jetty.servlet.Holder;
import org.eclipse.jetty.servlet.b;
import sq.k;
import zm.g;
import zm.i;
import zm.o;
import zm.p;
import zm.t;
import zm.w;

/* JADX INFO: loaded from: classes7.dex */
public class ServletHolder extends Holder<i> implements v.a, Comparable {
    public static final vq.c F = vq.b.a(ServletHolder.class);
    public static final Map<String, String> G = Collections.emptyMap();
    public transient i A;
    public transient a B;
    public transient long C;
    public transient boolean D;
    public transient UnavailableException E;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f76764t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f76765u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f76766v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f76767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j f76768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f f76769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o f76770z;

    public class a extends Holder<i>.b implements zm.j {
        public a() {
            super();
        }

        @Override // zm.j
        public String getServletName() {
            return ServletHolder.this.getName();
        }
    }

    public class b extends Holder<i>.c implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f76772b;

        public b() {
            super();
        }

        public g a() {
            return this.f76772b;
        }
    }

    public class c implements i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Stack<i> f76774b;

        public c() {
            this.f76774b = new Stack<>();
        }

        @Override // zm.i
        public void destroy() {
            synchronized (this) {
                while (this.f76774b.size() > 0) {
                    try {
                        this.f76774b.pop().destroy();
                    } catch (Exception e10) {
                        ServletHolder.F.e(e10);
                    }
                }
            }
        }

        @Override // zm.i
        public void init(zm.j jVar) throws ServletException {
            synchronized (this) {
                if (this.f76774b.size() == 0) {
                    try {
                        i iVarN0 = ServletHolder.this.N0();
                        iVarN0.init(jVar);
                        this.f76774b.push(iVarN0);
                    } catch (ServletException e10) {
                        throw e10;
                    } catch (Exception e11) {
                        throw new ServletException(e11);
                    }
                }
            }
        }

        @Override // zm.i
        public void service(p pVar, t tVar) throws ServletException, IOException {
            i iVarN0;
            synchronized (this) {
                if (this.f76774b.size() > 0) {
                    iVarN0 = this.f76774b.pop();
                } else {
                    try {
                        iVarN0 = ServletHolder.this.N0();
                        iVarN0.init(ServletHolder.this.B);
                    } catch (ServletException e10) {
                        throw e10;
                    } catch (Exception e11) {
                        throw new ServletException(e11);
                    }
                }
            }
            try {
                iVarN0.service(pVar, tVar);
                synchronized (this) {
                    this.f76774b.push(iVarN0);
                }
            } catch (Throwable th2) {
                synchronized (this) {
                    this.f76774b.push(iVarN0);
                    throw th2;
                }
            }
        }
    }

    public ServletHolder() {
        this(Holder.Source.EMBEDDED);
    }

    public ServletHolder(Holder.Source source) {
        super(source);
        this.f76765u = false;
        this.D = true;
    }

    public ServletHolder(i iVar) {
        this(Holder.Source.EMBEDDED);
        O0(iVar);
    }

    public void A0(Object obj) throws Exception {
        if (obj == null) {
            return;
        }
        i iVar = (i) obj;
        p0().K0(iVar);
        iVar.destroy();
    }

    public String B0() {
        return this.f76766v;
    }

    public o C0() {
        if (this.f76770z == null) {
            this.f76770z = new b();
        }
        return this.f76770z;
    }

    public synchronized i D0() throws ServletException {
        long j10 = this.C;
        if (j10 != 0) {
            if (j10 < 0 || (j10 > 0 && System.currentTimeMillis() < this.C)) {
                throw this.E;
            }
            this.C = 0L;
            this.E = null;
        }
        if (this.A == null) {
            H0();
        }
        return this.A;
    }

    public void E0(n nVar, p pVar, t tVar) throws ServletException, IOException {
        if (this.f76753l == null) {
            throw new UnavailableException("Servlet Not Initialized");
        }
        i iVarD0 = this.A;
        synchronized (this) {
            if (!isStarted()) {
                throw new UnavailableException("Servlet not initialized", -1);
            }
            if (this.C != 0 || !this.f76765u) {
                iVarD0 = D0();
            }
            if (iVarD0 == null) {
                throw new UnavailableException("Could not instantiate " + this.f76753l);
            }
        }
        boolean zW = nVar.W();
        try {
            try {
                String str = this.f76766v;
                if (str != null) {
                    pVar.a("org.apache.catalina.jsp_file", str);
                }
                f fVar = this.f76769y;
                objD = fVar != null ? fVar.d(nVar.L(), this.f76768x) : null;
                if (!r0()) {
                    nVar.e0(false);
                }
                g gVarA = ((b) C0()).a();
                if (gVarA != null) {
                    pVar.a("org.eclipse.multipartConfig", gVarA);
                }
                iVarD0.service(pVar, tVar);
                nVar.e0(zW);
                f fVar2 = this.f76769y;
                if (fVar2 != null) {
                    fVar2.e(objD);
                }
            } catch (UnavailableException e10) {
                M0(e10);
                throw this.E;
            }
        } catch (Throwable th2) {
            nVar.e0(zW);
            f fVar3 = this.f76769y;
            if (fVar3 != null) {
                fVar3.e(objD);
            }
            pVar.a("javax.servlet.error.servlet_name", getName());
            throw th2;
        }
    }

    public void F0() throws Exception {
        oq.c cVarB = ((c.d) p0().P0()).b();
        cVarB.a("org.apache.catalina.jsp_classpath", cVarB.T0());
        u0("com.sun.appserv.jsp.classpath", k.a(cVarB.S0().getParent()));
        if ("?".equals(getInitParameter("classpath"))) {
            String strT0 = cVarB.T0();
            F.h("classpath=" + strT0, new Object[0]);
            if (strT0 != null) {
                u0("classpath", strT0);
            }
        }
    }

    public void G0() throws Exception {
        if (((b) C0()).a() != null) {
            ((c.d) p0().P0()).b().N0(new n.a());
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x008b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:49:0x008b */
    public final void H0() throws Throwable {
        Object obj;
        Object objD;
        Object obj2 = null;
        try {
            try {
                if (this.A == null) {
                    this.A = N0();
                }
                if (this.B == null) {
                    this.B = new a();
                }
                f fVar = this.f76769y;
                objD = fVar != null ? fVar.d(fVar.a(), this.f76768x) : null;
            } catch (Throwable th2) {
                th = th2;
                obj2 = obj;
            }
            try {
                if (J0()) {
                    F0();
                }
                G0();
                this.A.init(this.B);
                f fVar2 = this.f76769y;
                if (fVar2 != null) {
                    fVar2.e(objD);
                }
            } catch (UnavailableException e10) {
                e = e10;
                M0(e);
                this.A = null;
                this.B = null;
                throw e;
            } catch (ServletException e11) {
                e = e11;
                L0(e.getCause() == null ? e : e.getCause());
                this.A = null;
                this.B = null;
                throw e;
            } catch (Exception e12) {
                e = e12;
                L0(e);
                this.A = null;
                this.B = null;
                throw new ServletException(toString(), e);
            } catch (Throwable th3) {
                Object obj3 = objD;
                th = th3;
                obj2 = obj3;
                f fVar3 = this.f76769y;
                if (fVar3 != null) {
                    fVar3.e(obj2);
                }
                throw th;
            }
        } catch (UnavailableException e13) {
            e = e13;
        } catch (ServletException e14) {
            e = e14;
        } catch (Exception e15) {
            e = e15;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public boolean I0() {
        return this.D;
    }

    public final boolean J0() {
        i iVar = this.A;
        boolean zK0 = false;
        if (iVar == null) {
            return false;
        }
        for (Class<?> superclass = iVar.getClass(); superclass != null && !zK0; superclass = superclass.getSuperclass()) {
            zK0 = K0(superclass.getName());
        }
        return zK0;
    }

    public final boolean K0(String str) {
        if (str == null) {
            return false;
        }
        return "org.apache.jasper.servlet.JspServlet".equals(str);
    }

    public final void L0(Throwable th2) {
        if (th2 instanceof UnavailableException) {
            M0((UnavailableException) th2);
            return;
        }
        zm.k kVarP0 = this.f76759r.P0();
        if (kVarP0 == null) {
            F.c("unavailable", th2);
        } else {
            kVarP0.f("unavailable", th2);
        }
        this.E = new UnavailableException(String.valueOf(th2), -1, th2) { // from class: org.eclipse.jetty.servlet.ServletHolder.1
            public final /* synthetic */ Throwable val$e;

            {
                this.val$e = th2;
                initCause(th2);
            }
        };
        this.C = -1L;
    }

    public final void M0(UnavailableException unavailableException) {
        if (this.E != unavailableException || this.C == 0) {
            this.f76759r.P0().f("unavailable", unavailableException);
            this.E = unavailableException;
            this.C = -1L;
            if (unavailableException.isPermanent()) {
                this.C = -1L;
            } else if (this.E.getUnavailableSeconds() > 0) {
                this.C = System.currentTimeMillis() + ((long) (this.E.getUnavailableSeconds() * 1000));
            } else {
                this.C = System.currentTimeMillis() + 5000;
            }
        }
    }

    public i N0() throws IllegalAccessException, ServletException, InstantiationException {
        try {
            zm.k kVarP0 = p0().P0();
            return kVarP0 == null ? n0().newInstance() : ((b.a) kVarP0).k(n0());
        } catch (ServletException e10) {
            Throwable rootCause = e10.getRootCause();
            if (rootCause instanceof InstantiationException) {
                throw ((InstantiationException) rootCause);
            }
            if (rootCause instanceof IllegalAccessException) {
                throw ((IllegalAccessException) rootCause);
            }
            throw e10;
        }
    }

    public synchronized void O0(i iVar) {
        if (iVar != null) {
            if (!(iVar instanceof w)) {
                this.f76756o = true;
                this.A = iVar;
                t0(iVar.getClass());
                if (getName() == null) {
                    v0(iVar.getClass().getName() + "-" + super.hashCode());
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        String str;
        if (!(obj instanceof ServletHolder)) {
            return 1;
        }
        ServletHolder servletHolder = (ServletHolder) obj;
        int iCompareTo = 0;
        if (servletHolder == this) {
            return 0;
        }
        int i10 = servletHolder.f76764t;
        int i11 = this.f76764t;
        if (i10 < i11) {
            return 1;
        }
        if (i10 > i11) {
            return -1;
        }
        String str2 = this.f76755n;
        if (str2 != null && (str = servletHolder.f76755n) != null) {
            iCompareTo = str2.compareTo(str);
        }
        return iCompareTo == 0 ? this.f76758q.compareTo(servletHolder.f76758q) : iCompareTo;
    }

    @Override // org.eclipse.jetty.servlet.Holder, uq.a
    public void d0() throws Exception {
        String str;
        this.C = 0L;
        if (this.D) {
            try {
                super.d0();
                try {
                    z0();
                    f fVarE = this.f76759r.e();
                    this.f76769y = fVarE;
                    if (fVarE != null && (str = this.f76767w) != null) {
                        this.f76768x = fVarE.f(str);
                    }
                    this.B = new a();
                    Class<? extends T> cls = this.f76753l;
                    if (cls != 0 && w.class.isAssignableFrom(cls)) {
                        this.A = new c();
                    }
                    if (this.f76756o || this.f76765u) {
                        try {
                            H0();
                        } catch (Exception e10) {
                            if (!this.f76759r.U0()) {
                                throw e10;
                            }
                            F.g(e10);
                        }
                    }
                } catch (UnavailableException e11) {
                    M0(e11);
                    if (!this.f76759r.U0()) {
                        throw e11;
                    }
                    F.g(e11);
                }
            } catch (UnavailableException e12) {
                M0(e12);
                if (!this.f76759r.U0()) {
                    throw e12;
                }
                F.g(e12);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    @Override // org.eclipse.jetty.servlet.Holder, uq.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0() throws java.lang.Exception {
        /*
            r5 = this;
            zm.i r0 = r5.A
            r1 = 0
            if (r0 == 0) goto L47
            kq.f r0 = r5.f76769y     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            if (r0 == 0) goto L14
            mq.v r2 = r0.a()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            kq.j r3 = r5.f76768x     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            java.lang.Object r0 = r0.d(r2, r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            goto L15
        L14:
            r0 = r1
        L15:
            zm.i r2 = r5.A     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L27
            r5.A0(r2)     // Catch: java.lang.Throwable -> L22 java.lang.Exception -> L27
            kq.f r2 = r5.f76769y
            if (r2 == 0) goto L47
            r2.e(r0)
            goto L47
        L22:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L3f
        L27:
            r2 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
            goto L30
        L2c:
            r0 = move-exception
            goto L3f
        L2e:
            r0 = move-exception
            r2 = r1
        L30:
            vq.c r3 = org.eclipse.jetty.servlet.ServletHolder.F     // Catch: java.lang.Throwable -> L3d
            r3.e(r0)     // Catch: java.lang.Throwable -> L3d
            kq.f r0 = r5.f76769y
            if (r0 == 0) goto L47
            r0.e(r2)
            goto L47
        L3d:
            r0 = move-exception
            r1 = r2
        L3f:
            kq.f r2 = r5.f76769y
            if (r2 == 0) goto L46
            r2.e(r1)
        L46:
            throw r0
        L47:
            boolean r0 = r5.f76756o
            if (r0 != 0) goto L4d
            r5.A = r1
        L4d:
            r5.B = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.ServletHolder.e0():void");
    }

    public boolean equals(Object obj) {
        return compareTo(obj) == 0;
    }

    public int hashCode() {
        String str = this.f76758q;
        return str == null ? System.identityHashCode(this) : str.hashCode();
    }

    public void z0() throws UnavailableException {
        Class<? extends T> cls = this.f76753l;
        if (cls == 0 || !i.class.isAssignableFrom(cls)) {
            throw new UnavailableException("Servlet " + this.f76753l + " is not a javax.servlet.Servlet");
        }
    }
}
