package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.r;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: OkHttpClient.java */
/* JADX INFO: loaded from: classes7.dex */
public class v implements Cloneable {
    public static final List<w> A = com.mbridge.msdk.thrid.okhttp.internal.c.a(w.HTTP_2, w.HTTP_1_1);
    public static final List<j> B = com.mbridge.msdk.thrid.okhttp.internal.c.a(j.f40667h, j.f40669j);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f40738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f40739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<w> f40740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<j> f40741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<t> f40742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<t> f40743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o.c f40744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProxySelector f40745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f40746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SocketFactory f40747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SSLSocketFactory f40748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.tls.c f40749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HostnameVerifier f40750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f40751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.b f40752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.b f40753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f40754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f40755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f40756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f40757t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f40758u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f40759v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f40760w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f40761x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f40762y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f40763z;

    /* JADX INFO: compiled from: OkHttpClient.java */
    public static class a extends com.mbridge.msdk.thrid.okhttp.internal.a {
        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public int a(a0.a aVar) {
            return aVar.f40170c;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
            return iVar.a(aVar, gVar, c0Var);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public com.mbridge.msdk.thrid.okhttp.internal.connection.d a(i iVar) {
            return iVar.f40301e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public IOException a(d dVar, IOException iOException) {
            return ((x) dVar).a(iOException);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public Socket a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
            return iVar.a(aVar, gVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(j jVar, SSLSocket sSLSocket, boolean z10) {
            jVar.a(sSLSocket, z10);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str) {
            aVar.a(str);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void a(r.a aVar, String str, String str2) {
            aVar.b(str, str2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2) {
            return aVar.a(aVar2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public boolean a(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            return iVar.a(cVar);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.a
        public void b(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
            iVar.b(cVar);
        }
    }

    /* JADX INFO: compiled from: OkHttpClient.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public m f40764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Proxy f40765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<w> f40766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<j> f40767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<t> f40768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<t> f40769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o.c f40770g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ProxySelector f40771h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public l f40772i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public SocketFactory f40773j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public SSLSocketFactory f40774k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okhttp.internal.tls.c f40775l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public HostnameVerifier f40776m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public f f40777n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okhttp.b f40778o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public com.mbridge.msdk.thrid.okhttp.b f40779p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public i f40780q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public n f40781r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f40782s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f40783t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f40784u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f40785v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f40786w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f40787x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f40788y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f40789z;

        public b() {
            this.f40768e = new ArrayList();
            this.f40769f = new ArrayList();
            this.f40764a = new m();
            this.f40766c = v.A;
            this.f40767d = v.B;
            this.f40770g = o.factory(o.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f40771h = proxySelector;
            if (proxySelector == null) {
                this.f40771h = new com.mbridge.msdk.thrid.okhttp.internal.proxy.a();
            }
            this.f40772i = l.f40691a;
            this.f40773j = SocketFactory.getDefault();
            this.f40776m = com.mbridge.msdk.thrid.okhttp.internal.tls.d.f40663a;
            this.f40777n = f.f40217c;
            com.mbridge.msdk.thrid.okhttp.b bVar = com.mbridge.msdk.thrid.okhttp.b.f40180a;
            this.f40778o = bVar;
            this.f40779p = bVar;
            this.f40780q = new i();
            this.f40781r = n.f40700a;
            this.f40782s = true;
            this.f40783t = true;
            this.f40784u = true;
            this.f40785v = 0;
            this.f40786w = 10000;
            this.f40787x = 10000;
            this.f40788y = 10000;
            this.f40789z = 0;
        }

        public b(v vVar) {
            ArrayList arrayList = new ArrayList();
            this.f40768e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f40769f = arrayList2;
            this.f40764a = vVar.f40738a;
            this.f40765b = vVar.f40739b;
            this.f40766c = vVar.f40740c;
            this.f40767d = vVar.f40741d;
            arrayList.addAll(vVar.f40742e);
            arrayList2.addAll(vVar.f40743f);
            this.f40770g = vVar.f40744g;
            this.f40771h = vVar.f40745h;
            this.f40772i = vVar.f40746i;
            this.f40773j = vVar.f40747j;
            this.f40774k = vVar.f40748k;
            this.f40775l = vVar.f40749l;
            this.f40776m = vVar.f40750m;
            this.f40777n = vVar.f40751n;
            this.f40778o = vVar.f40752o;
            this.f40779p = vVar.f40753p;
            this.f40780q = vVar.f40754q;
            this.f40781r = vVar.f40755r;
            this.f40782s = vVar.f40756s;
            this.f40783t = vVar.f40757t;
            this.f40784u = vVar.f40758u;
            this.f40785v = vVar.f40759v;
            this.f40786w = vVar.f40760w;
            this.f40787x = vVar.f40761x;
            this.f40788y = vVar.f40762y;
            this.f40789z = vVar.f40763z;
        }

        public b a(long j10, TimeUnit timeUnit) {
            this.f40785v = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b a(i iVar) {
            if (iVar == null) {
                throw new NullPointerException("connectionPool == null");
            }
            this.f40780q = iVar;
            return this;
        }

        public b a(m mVar) {
            if (mVar == null) {
                throw new IllegalArgumentException("dispatcher == null");
            }
            this.f40764a = mVar;
            return this;
        }

        public b a(n nVar) {
            if (nVar == null) {
                throw new NullPointerException("dns == null");
            }
            this.f40781r = nVar;
            return this;
        }

        public b a(o oVar) {
            if (oVar == null) {
                throw new NullPointerException("eventListener == null");
            }
            this.f40770g = o.factory(oVar);
            return this;
        }

        public b a(List<w> list) {
            ArrayList arrayList = new ArrayList(list);
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(wVar) && !arrayList.contains(w.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(wVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (arrayList.contains(w.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayList.remove(w.SPDY_3);
            this.f40766c = Collections.unmodifiableList(arrayList);
            return this;
        }

        public b a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier == null) {
                throw new NullPointerException("hostnameVerifier == null");
            }
            this.f40776m = hostnameVerifier;
            return this;
        }

        public b a(boolean z10) {
            this.f40783t = z10;
            return this;
        }

        public v a() {
            return new v(this);
        }

        public b b(long j10, TimeUnit timeUnit) {
            this.f40786w = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b b(boolean z10) {
            this.f40784u = z10;
            return this;
        }

        public b c(long j10, TimeUnit timeUnit) {
            this.f40789z = com.mbridge.msdk.thrid.okhttp.internal.c.a("interval", j10, timeUnit);
            return this;
        }

        public b d(long j10, TimeUnit timeUnit) {
            this.f40787x = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }

        public b e(long j10, TimeUnit timeUnit) {
            this.f40788y = com.mbridge.msdk.thrid.okhttp.internal.c.a("timeout", j10, timeUnit);
            return this;
        }
    }

    static {
        com.mbridge.msdk.thrid.okhttp.internal.a.f40304a = new a();
    }

    public v() {
        this(new b());
    }

    public v(b bVar) {
        boolean z10;
        this.f40738a = bVar.f40764a;
        this.f40739b = bVar.f40765b;
        this.f40740c = bVar.f40766c;
        List<j> list = bVar.f40767d;
        this.f40741d = list;
        this.f40742e = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f40768e);
        this.f40743f = com.mbridge.msdk.thrid.okhttp.internal.c.a(bVar.f40769f);
        this.f40744g = bVar.f40770g;
        this.f40745h = bVar.f40771h;
        this.f40746i = bVar.f40772i;
        this.f40747j = bVar.f40773j;
        Iterator<j> it = list.iterator();
        loop0: while (true) {
            z10 = false;
            while (it.hasNext()) {
                z10 = (z10 || it.next().b()) ? true : z10;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f40774k;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager x509TrustManagerA = com.mbridge.msdk.thrid.okhttp.internal.c.a();
            this.f40748k = a(x509TrustManagerA);
            this.f40749l = com.mbridge.msdk.thrid.okhttp.internal.tls.c.a(x509TrustManagerA);
        } else {
            this.f40748k = sSLSocketFactory;
            this.f40749l = bVar.f40775l;
        }
        if (this.f40748k != null) {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.f40748k);
        }
        this.f40750m = bVar.f40776m;
        this.f40751n = bVar.f40777n.a(this.f40749l);
        this.f40752o = bVar.f40778o;
        this.f40753p = bVar.f40779p;
        this.f40754q = bVar.f40780q;
        this.f40755r = bVar.f40781r;
        this.f40756s = bVar.f40782s;
        this.f40757t = bVar.f40783t;
        this.f40758u = bVar.f40784u;
        this.f40759v = bVar.f40785v;
        this.f40760w = bVar.f40786w;
        this.f40761x = bVar.f40787x;
        this.f40762y = bVar.f40788y;
        this.f40763z = bVar.f40789z;
        if (this.f40742e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f40742e);
        }
        if (this.f40743f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f40743f);
        }
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextE = com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().e();
            sSLContextE.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextE.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("No System TLS", (Exception) e10);
        }
    }

    public SocketFactory A() {
        return this.f40747j;
    }

    public SSLSocketFactory B() {
        return this.f40748k;
    }

    public int C() {
        return this.f40762y;
    }

    public com.mbridge.msdk.thrid.okhttp.b a() {
        return this.f40753p;
    }

    public d a(y yVar) {
        return x.a(this, yVar, false);
    }

    public int b() {
        return this.f40759v;
    }

    public f c() {
        return this.f40751n;
    }

    public int e() {
        return this.f40760w;
    }

    public i f() {
        return this.f40754q;
    }

    public List<j> g() {
        return this.f40741d;
    }

    public l i() {
        return this.f40746i;
    }

    public m j() {
        return this.f40738a;
    }

    public n k() {
        return this.f40755r;
    }

    public o.c l() {
        return this.f40744g;
    }

    public boolean m() {
        return this.f40757t;
    }

    public boolean n() {
        return this.f40756s;
    }

    public HostnameVerifier o() {
        return this.f40750m;
    }

    public List<t> p() {
        return this.f40742e;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.cache.c q() {
        return null;
    }

    public List<t> r() {
        return this.f40743f;
    }

    public b s() {
        return new b(this);
    }

    public int t() {
        return this.f40763z;
    }

    public List<w> u() {
        return this.f40740c;
    }

    public Proxy v() {
        return this.f40739b;
    }

    public com.mbridge.msdk.thrid.okhttp.b w() {
        return this.f40752o;
    }

    public ProxySelector x() {
        return this.f40745h;
    }

    public int y() {
        return this.f40761x;
    }

    public boolean z() {
        return this.f40758u;
    }
}
