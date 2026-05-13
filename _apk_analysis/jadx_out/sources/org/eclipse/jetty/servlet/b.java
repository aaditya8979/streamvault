package org.eclipse.jetty.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import kq.k;
import mq.j;
import oq.c;
import oq.e;
import oq.f;
import org.eclipse.jetty.util.LazyList;
import qq.g;
import zm.d;
import zm.i;
import zm.l;

/* JADX INFO: compiled from: ServletContextHandler.java */
/* JADX INFO: loaded from: classes12.dex */
public class b extends oq.c {
    public final List<InterfaceC0920b> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Class<? extends k> f76780a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public g f76781b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public k f76782c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public c f76783d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public oq.g f76784e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f76785f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Object f76786g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f76787h0;

    /* JADX INFO: compiled from: ServletContextHandler.java */
    public class a extends c.d {
        public a() {
            super();
        }

        public <T extends d> T j(Class<T> cls) throws ServletException {
            try {
                T tNewInstance = cls.newInstance();
                for (int size = b.this.Z.size() - 1; size >= 0; size--) {
                    tNewInstance = (T) b.this.Z.get(size).e(tNewInstance);
                }
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new ServletException(e10);
            } catch (InstantiationException e11) {
                throw new ServletException(e11);
            }
        }

        public <T extends i> T k(Class<T> cls) throws ServletException {
            try {
                T tNewInstance = cls.newInstance();
                for (int size = b.this.Z.size() - 1; size >= 0; size--) {
                    tNewInstance = (T) b.this.Z.get(size).b(tNewInstance);
                }
                return tNewInstance;
            } catch (IllegalAccessException e10) {
                throw new ServletException(e10);
            } catch (InstantiationException e11) {
                throw new ServletException(e11);
            }
        }
    }

    /* JADX INFO: renamed from: org.eclipse.jetty.servlet.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ServletContextHandler.java */
    public interface InterfaceC0920b {
        void a(i iVar);

        <T extends i> T b(T t10) throws ServletException;

        void c(d dVar);

        void d(org.eclipse.jetty.servlet.a aVar) throws ServletException;

        <T extends d> T e(T t10) throws ServletException;

        void f(ServletHolder servletHolder) throws ServletException;
    }

    public b() {
        this(null, null, null, null, null);
    }

    public b(int i10) {
        this(null, null, i10);
    }

    public b(j jVar, String str, int i10) {
        this(jVar, str, null, null, null, null);
        this.f76785f0 = i10;
    }

    public b(j jVar, String str, g gVar, k kVar, c cVar, e eVar) {
        super(null);
        this.Z = new ArrayList();
        this.f76780a0 = kq.c.class;
        this.f76787h0 = true;
        this.f76518t = new a();
        this.f76781b0 = gVar;
        this.f76782c0 = kVar;
        this.f76783d0 = cVar;
        if (eVar != null) {
            i1(eVar);
        }
        if (str != null) {
            h1(str);
        }
        if (jVar instanceof oq.g) {
            ((oq.g) jVar).B0(this);
        } else if (jVar instanceof f) {
            ((f) jVar).B0(this);
        }
    }

    public b(j jVar, g gVar, k kVar, c cVar, e eVar) {
        this(jVar, null, gVar, kVar, cVar, eVar);
    }

    @Override // oq.c
    public void O0(l lVar, ServletContextEvent servletContextEvent) {
        try {
            if (LazyList.contains(this.f76786g0, lVar)) {
                c1().i(false);
            }
            super.O0(lVar, servletContextEvent);
        } finally {
            c1().i(true);
        }
    }

    @Override // oq.c, oq.g, oq.a, uq.b, uq.a
    public void e0() throws Exception {
        super.e0();
        List<InterfaceC0920b> list = this.Z;
        if (list != null) {
            list.clear();
        }
        oq.g gVar = this.f76784e0;
        if (gVar != null) {
            gVar.B0(null);
        }
    }

    @Override // oq.c
    public void l1() throws Exception {
        r1();
        p1();
        q1();
        oq.g gVar = this.f76783d0;
        k kVar = this.f76782c0;
        if (kVar != null) {
            kVar.B0(gVar);
            gVar = this.f76782c0;
        }
        g gVar2 = this.f76781b0;
        if (gVar2 != null) {
            gVar2.B0(gVar);
            gVar = this.f76781b0;
        }
        this.f76784e0 = this;
        while (true) {
            oq.g gVar3 = this.f76784e0;
            if (gVar3 == gVar || !(gVar3.A0() instanceof oq.g)) {
                break;
            } else {
                this.f76784e0 = (oq.g) this.f76784e0.A0();
            }
        }
        oq.g gVar4 = this.f76784e0;
        if (gVar4 != gVar) {
            if (gVar4.A0() != null) {
                throw new IllegalStateException("!ScopedHandler");
            }
            this.f76784e0.B0(gVar);
        }
        super.l1();
        c cVar = this.f76783d0;
        if (cVar == null || !cVar.isStarted()) {
            return;
        }
        for (int size = this.Z.size() - 1; size >= 0; size--) {
            InterfaceC0920b interfaceC0920b = this.Z.get(size);
            if (this.f76783d0.N0() != null) {
                for (org.eclipse.jetty.servlet.a aVar : this.f76783d0.N0()) {
                    interfaceC0920b.d(aVar);
                }
            }
            if (this.f76783d0.R0() != null) {
                for (ServletHolder servletHolder : this.f76783d0.R0()) {
                    interfaceC0920b.f(servletHolder);
                }
            }
        }
        this.f76783d0.S0();
    }

    public void m1(ServletHolder servletHolder, String str) {
        q1().I0(servletHolder, str);
    }

    public void n1(d dVar) {
        Iterator<InterfaceC0920b> it = this.Z.iterator();
        while (it.hasNext()) {
            it.next().c(dVar);
        }
    }

    public void o1(i iVar) {
        Iterator<InterfaceC0920b> it = this.Z.iterator();
        while (it.hasNext()) {
            it.next().a(iVar);
        }
    }

    public k p1() {
        if (this.f76782c0 == null && (this.f76785f0 & 2) != 0 && !isStarted()) {
            this.f76782c0 = s1();
        }
        return this.f76782c0;
    }

    public c q1() {
        if (this.f76783d0 == null && !isStarted()) {
            this.f76783d0 = t1();
        }
        return this.f76783d0;
    }

    public g r1() {
        if (this.f76781b0 == null && (this.f76785f0 & 1) != 0 && !isStarted()) {
            this.f76781b0 = u1();
        }
        return this.f76781b0;
    }

    public k s1() {
        try {
            return this.f76780a0.newInstance();
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public c t1() {
        return new c();
    }

    public g u1() {
        return new g();
    }
}
