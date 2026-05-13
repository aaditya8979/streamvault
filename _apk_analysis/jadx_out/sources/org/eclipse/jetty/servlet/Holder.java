package org.eclipse.jetty.servlet;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.UnavailableException;
import uq.e;
import zm.k;

/* JADX INFO: loaded from: classes8.dex */
public class Holder<T> extends uq.a implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final vq.c f76751s = vq.b.a(Holder.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Source f76752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient Class<? extends T> f76753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, String> f76754m = new HashMap(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f76755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f76756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f76757p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f76758q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public org.eclipse.jetty.servlet.c f76759r;

    public enum Source {
        EMBEDDED,
        JAVAX_API,
        DESCRIPTOR,
        ANNOTATION
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f76761a;

        static {
            int[] iArr = new int[Source.values().length];
            f76761a = iArr;
            try {
                iArr[Source.JAVAX_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76761a[Source.DESCRIPTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76761a[Source.ANNOTATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b {
        public b() {
        }

        public String getInitParameter(String str) {
            return Holder.this.getInitParameter(str);
        }

        public Enumeration getInitParameterNames() {
            return Holder.this.o0();
        }

        public k getServletContext() {
            return Holder.this.f76759r.P0();
        }
    }

    public class c {
        public c() {
        }
    }

    public Holder(Source source) {
        this.f76752k = source;
        int i10 = a.f76761a[source.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            this.f76757p = false;
        } else {
            this.f76757p = true;
        }
    }

    @Override // uq.a
    public void d0() throws Exception {
        String str;
        if (this.f76753l == null && ((str = this.f76755n) == null || str.equals(""))) {
            throw new UnavailableException("No class for Servlet or Filter for " + this.f76758q);
        }
        if (this.f76753l == null) {
            try {
                this.f76753l = sq.k.c(Holder.class, this.f76755n);
                vq.c cVar = f76751s;
                if (cVar.isDebugEnabled()) {
                    cVar.h("Holding {}", this.f76753l);
                }
            } catch (Exception e10) {
                f76751s.e(e10);
                throw new UnavailableException(e10.getMessage());
            }
        }
    }

    @Override // uq.a
    public void e0() throws Exception {
        if (this.f76756o) {
            return;
        }
        this.f76753l = null;
    }

    public String getInitParameter(String str) {
        Map<String, String> map = this.f76754m;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public String getName() {
        return this.f76758q;
    }

    public String m0() {
        return this.f76755n;
    }

    public Class<? extends T> n0() {
        return this.f76753l;
    }

    public Enumeration o0() {
        Map<String, String> map = this.f76754m;
        return map == null ? Collections.enumeration(Collections.EMPTY_LIST) : Collections.enumeration(map.keySet());
    }

    public org.eclipse.jetty.servlet.c p0() {
        return this.f76759r;
    }

    public Source q0() {
        return this.f76752k;
    }

    public boolean r0() {
        return this.f76757p;
    }

    public void s0(String str) {
        this.f76755n = str;
        this.f76753l = null;
        if (this.f76758q == null) {
            this.f76758q = str + "-" + Integer.toHexString(hashCode());
        }
    }

    public void t0(Class<? extends T> cls) {
        this.f76753l = cls;
        if (cls != null) {
            this.f76755n = cls.getName();
            if (this.f76758q == null) {
                this.f76758q = cls.getName() + "-" + Integer.toHexString(hashCode());
            }
        }
    }

    public String toString() {
        return this.f76758q;
    }

    public void u0(String str, String str2) {
        this.f76754m.put(str, str2);
    }

    public void v0(String str) {
        this.f76758q = str;
    }

    @Override // uq.e
    public void w(Appendable appendable, String str) throws IOException {
        appendable.append(this.f76758q).append("==").append(this.f76755n).append(" - ").append(uq.a.g0(this)).append("\n");
        uq.b.p0(appendable, str, this.f76754m.entrySet());
    }

    public void w0(org.eclipse.jetty.servlet.c cVar) {
        this.f76759r = cVar;
    }
}
