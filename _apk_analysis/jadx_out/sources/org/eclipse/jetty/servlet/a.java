package org.eclipse.jetty.servlet;

import javax.servlet.ServletException;
import org.eclipse.jetty.servlet.Holder;
import org.eclipse.jetty.servlet.b;
import zm.d;
import zm.f;

/* JADX INFO: compiled from: FilterHolder.java */
/* JADX INFO: loaded from: classes12.dex */
public class a extends Holder<d> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final vq.c f76776v = vq.b.a(a.class);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient d f76777t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient C0919a f76778u;

    /* JADX INFO: renamed from: org.eclipse.jetty.servlet.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FilterHolder.java */
    public class C0919a extends Holder<d>.b implements f {
        public C0919a() {
            super();
        }
    }

    public a() {
        this(Holder.Source.EMBEDDED);
    }

    public a(Holder.Source source) {
        super(source);
    }

    @Override // org.eclipse.jetty.servlet.Holder, uq.a
    public void d0() throws Exception {
        super.d0();
        if (!d.class.isAssignableFrom(this.f76753l)) {
            String str = this.f76753l + " is not a javax.servlet.Filter";
            super.stop();
            throw new IllegalStateException(str);
        }
        if (this.f76777t == null) {
            try {
                this.f76777t = ((b.a) this.f76759r.P0()).j(n0());
            } catch (ServletException e10) {
                Throwable rootCause = e10.getRootCause();
                if (rootCause instanceof InstantiationException) {
                    throw ((InstantiationException) rootCause);
                }
                if (!(rootCause instanceof IllegalAccessException)) {
                    throw e10;
                }
                throw ((IllegalAccessException) rootCause);
            }
        }
        C0919a c0919a = new C0919a();
        this.f76778u = c0919a;
        this.f76777t.a(c0919a);
    }

    @Override // org.eclipse.jetty.servlet.Holder, uq.a
    public void e0() throws Exception {
        d dVar = this.f76777t;
        if (dVar != null) {
            try {
                x0(dVar);
            } catch (Exception e10) {
                f76776v.e(e10);
            }
        }
        if (!this.f76756o) {
            this.f76777t = null;
        }
        this.f76778u = null;
        super.e0();
    }

    @Override // org.eclipse.jetty.servlet.Holder
    public String toString() {
        return getName();
    }

    public void x0(Object obj) throws Exception {
        if (obj == null) {
            return;
        }
        d dVar = (d) obj;
        dVar.destroy();
        p0().J0(dVar);
    }

    public d y0() {
        return this.f76777t;
    }
}
