package dq;

import ar.e;
import gq.l;
import gq.n;
import hq.j;
import hq.k;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jetty.client.HttpDestination;

/* JADX INFO: compiled from: HttpExchange.java */
/* JADX INFO: loaded from: classes12.dex */
public class i {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final vq.c f59955x = vq.b.a(i.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f59958c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public dq.b f59960e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hq.d f59962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InputStream f59963h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile dq.a f59968m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile e.a f59971p;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f59976u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f59977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f59978w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f59956a = "GET";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hq.d f59957b = l.f62875a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f59959d = 11;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final org.eclipse.jetty.http.a f59961f = new org.eclipse.jetty.http.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AtomicInteger f59964i = new AtomicInteger(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f59965j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f59966k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f59967l = new b(this, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public dq.b f59969n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f59970o = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f59972q = System.currentTimeMillis();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f59973r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f59974s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f59975t = -1;

    /* JADX INFO: compiled from: HttpExchange.java */
    public class a extends e.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ HttpDestination f59979h;

        public a(HttpDestination httpDestination) {
            this.f59979h = httpDestination;
        }

        @Override // ar.e.a
        public void f() {
            i.this.i(this.f59979h);
        }
    }

    /* JADX INFO: compiled from: HttpExchange.java */
    public class b implements g {
        public b() {
        }

        public /* synthetic */ b(i iVar, a aVar) {
            this();
        }

        @Override // dq.g
        public void a(Throwable th2) {
            try {
                i.this.y(th2);
            } finally {
                i.this.h();
            }
        }

        @Override // dq.g
        public void b() {
            i.this.V(true);
            try {
                i.this.I();
            } catch (IOException e10) {
                i.f59955x.b(e10);
            }
        }

        @Override // dq.g
        public void c(hq.d dVar, hq.d dVar2) throws IOException {
            i.this.F(dVar, dVar2);
        }

        @Override // dq.g
        public void d() throws IOException {
            i.this.G();
        }

        @Override // dq.g
        public void e(hq.d dVar, int i10, hq.d dVar2) throws IOException {
            i.this.H(dVar, i10, dVar2);
        }

        @Override // dq.g
        public void f(Throwable th2) {
            try {
                i.this.z(th2);
            } finally {
                i.this.h();
            }
        }

        @Override // dq.g
        public void g(hq.d dVar) throws IOException {
            i.this.E(dVar);
        }

        @Override // dq.g
        public void h() {
            try {
                i.this.A();
            } finally {
                i.this.h();
            }
        }

        @Override // dq.g
        public void i() throws IOException {
            i.this.B();
        }

        @Override // dq.g
        public void j() throws IOException {
            try {
                i.this.D();
                synchronized (i.this) {
                    i iVar = i.this;
                    iVar.f59977v = true;
                    boolean z10 = iVar.f59978w | iVar.f59976u;
                    iVar.f59978w = z10;
                    if (z10) {
                        iVar.g();
                    }
                    i.this.notifyAll();
                }
            } catch (Throwable th2) {
                synchronized (i.this) {
                    i iVar2 = i.this;
                    iVar2.f59977v = true;
                    boolean z11 = iVar2.f59978w | iVar2.f59976u;
                    iVar2.f59978w = z11;
                    if (z11) {
                        iVar2.g();
                    }
                    i.this.notifyAll();
                    throw th2;
                }
            }
        }

        @Override // dq.g
        public void onRequestComplete() throws IOException {
            try {
                i.this.C();
                synchronized (i.this) {
                    i iVar = i.this;
                    iVar.f59976u = true;
                    boolean z10 = iVar.f59978w | iVar.f59977v;
                    iVar.f59978w = z10;
                    if (z10) {
                        iVar.g();
                    }
                    i.this.notifyAll();
                }
            } catch (Throwable th2) {
                synchronized (i.this) {
                    i iVar2 = i.this;
                    iVar2.f59976u = true;
                    boolean z11 = iVar2.f59978w | iVar2.f59977v;
                    iVar2.f59978w = z11;
                    if (z11) {
                        iVar2.g();
                    }
                    i.this.notifyAll();
                    throw th2;
                }
            }
        }
    }

    public static String c0(int i10) {
        switch (i10) {
            case 0:
                return "START";
            case 1:
                return "CONNECTING";
            case 2:
                return "CONNECTED";
            case 3:
                return "SENDING";
            case 4:
                return "WAITING";
            case 5:
                return "HEADERS";
            case 6:
                return "CONTENT";
            case 7:
                return "COMPLETED";
            case 8:
                return "EXPIRED";
            case 9:
                return "EXCEPTED";
            case 10:
                return "CANCELLING";
            case 11:
                return "CANCELLED";
            case 12:
                return "SENDING+HEADERS";
            case 13:
                return "SENDING+CONTENT";
            case 14:
                return "SENDING+COMPLETED";
            default:
                return "UNKNOWN";
        }
    }

    public void A() {
        f59955x.f("EXPIRED " + this, new Object[0]);
    }

    public void B() throws IOException {
    }

    public void C() throws IOException {
    }

    public void D() throws IOException {
    }

    public void E(hq.d dVar) throws IOException {
    }

    public void F(hq.d dVar, hq.d dVar2) throws IOException {
    }

    public void G() throws IOException {
    }

    public void H(hq.d dVar, int i10, hq.d dVar2) throws IOException {
    }

    public void I() throws IOException {
        InputStream inputStream = this.f59963h;
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                throw new IOException("Unsupported retry attempt");
            }
            this.f59962g = null;
            this.f59963h.reset();
        }
    }

    public j J(k kVar) throws IOException {
        return null;
    }

    public void K() {
        synchronized (this) {
            this.f59971p = null;
            this.f59976u = false;
            this.f59977v = false;
            this.f59978w = false;
            Y(0);
        }
    }

    public void L(HttpDestination httpDestination) {
        this.f59971p = new a(httpDestination);
        org.eclipse.jetty.client.a aVarH = httpDestination.h();
        long jT = t();
        if (jT > 0) {
            aVarH.R0(this.f59971p, jT);
        } else {
            aVarH.Q0(this.f59971p);
        }
    }

    public void M(dq.b bVar) {
        this.f59960e = bVar;
    }

    public void N(g gVar) {
        this.f59967l = gVar;
    }

    public void O(String str) {
        this.f59956a = str;
    }

    public void P(hq.d dVar) {
        this.f59962g = dVar;
    }

    public void Q(InputStream inputStream) {
        this.f59963h = inputStream;
        if (inputStream == null || !inputStream.markSupported()) {
            return;
        }
        this.f59963h.mark(Integer.MAX_VALUE);
    }

    public void R(String str) {
        p().C(gq.i.f62841z, str);
    }

    public void S(hq.d dVar, hq.d dVar2) {
        p().B(dVar, dVar2);
    }

    public void T(String str, String str2) {
        p().D(str, str2);
    }

    public void U(String str) {
        this.f59958c = str;
    }

    public void V(boolean z10) {
        this.f59965j = z10;
    }

    public void W(hq.d dVar) {
        this.f59957b = dVar;
    }

    public void X(String str) {
        if (str != null) {
            if ("http".equalsIgnoreCase(str)) {
                W(l.f62875a);
            } else if ("https".equalsIgnoreCase(str)) {
                W(l.f62876b);
            } else {
                W(new hq.h(str));
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ab A[Catch: IOException -> 0x022b, TryCatch #1 {IOException -> 0x022b, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:10:0x0028, B:129:0x0215, B:130:0x022a, B:12:0x002e, B:14:0x0032, B:15:0x003a, B:16:0x0040, B:23:0x0057, B:24:0x005f, B:25:0x0065, B:29:0x0078, B:37:0x0094, B:38:0x009c, B:39:0x00a2, B:43:0x00b5, B:52:0x00cf, B:59:0x00e4, B:60:0x00e8, B:63:0x00f4, B:65:0x00f8, B:67:0x00fe, B:68:0x0106, B:69:0x010e, B:70:0x0116, B:72:0x011b, B:73:0x0123, B:74:0x0129, B:80:0x013f, B:81:0x0147, B:82:0x014d, B:89:0x0165, B:90:0x016b, B:93:0x0177, B:95:0x017b, B:96:0x0182, B:97:0x0187, B:98:0x0190, B:105:0x01a6, B:106:0x01ab, B:108:0x01b4, B:110:0x01b8, B:111:0x01bd, B:115:0x01ca, B:117:0x01cf, B:118:0x01d4), top: B:135:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bd A[Catch: IOException -> 0x022b, TryCatch #1 {IOException -> 0x022b, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:10:0x0028, B:129:0x0215, B:130:0x022a, B:12:0x002e, B:14:0x0032, B:15:0x003a, B:16:0x0040, B:23:0x0057, B:24:0x005f, B:25:0x0065, B:29:0x0078, B:37:0x0094, B:38:0x009c, B:39:0x00a2, B:43:0x00b5, B:52:0x00cf, B:59:0x00e4, B:60:0x00e8, B:63:0x00f4, B:65:0x00f8, B:67:0x00fe, B:68:0x0106, B:69:0x010e, B:70:0x0116, B:72:0x011b, B:73:0x0123, B:74:0x0129, B:80:0x013f, B:81:0x0147, B:82:0x014d, B:89:0x0165, B:90:0x016b, B:93:0x0177, B:95:0x017b, B:96:0x0182, B:97:0x0187, B:98:0x0190, B:105:0x01a6, B:106:0x01ab, B:108:0x01b4, B:110:0x01b8, B:111:0x01bd, B:115:0x01ca, B:117:0x01cf, B:118:0x01d4), top: B:135:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d4 A[Catch: IOException -> 0x022b, TRY_LEAVE, TryCatch #1 {IOException -> 0x022b, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:10:0x0028, B:129:0x0215, B:130:0x022a, B:12:0x002e, B:14:0x0032, B:15:0x003a, B:16:0x0040, B:23:0x0057, B:24:0x005f, B:25:0x0065, B:29:0x0078, B:37:0x0094, B:38:0x009c, B:39:0x00a2, B:43:0x00b5, B:52:0x00cf, B:59:0x00e4, B:60:0x00e8, B:63:0x00f4, B:65:0x00f8, B:67:0x00fe, B:68:0x0106, B:69:0x010e, B:70:0x0116, B:72:0x011b, B:73:0x0123, B:74:0x0129, B:80:0x013f, B:81:0x0147, B:82:0x014d, B:89:0x0165, B:90:0x016b, B:93:0x0177, B:95:0x017b, B:96:0x0182, B:97:0x0187, B:98:0x0190, B:105:0x01a6, B:106:0x01ab, B:108:0x01b4, B:110:0x01b8, B:111:0x01bd, B:115:0x01ca, B:117:0x01cf, B:118:0x01d4), top: B:135:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b A[Catch: IOException -> 0x022b, TryCatch #1 {IOException -> 0x022b, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x001b, B:10:0x0028, B:129:0x0215, B:130:0x022a, B:12:0x002e, B:14:0x0032, B:15:0x003a, B:16:0x0040, B:23:0x0057, B:24:0x005f, B:25:0x0065, B:29:0x0078, B:37:0x0094, B:38:0x009c, B:39:0x00a2, B:43:0x00b5, B:52:0x00cf, B:59:0x00e4, B:60:0x00e8, B:63:0x00f4, B:65:0x00f8, B:67:0x00fe, B:68:0x0106, B:69:0x010e, B:70:0x0116, B:72:0x011b, B:73:0x0123, B:74:0x0129, B:80:0x013f, B:81:0x0147, B:82:0x014d, B:89:0x0165, B:90:0x016b, B:93:0x0177, B:95:0x017b, B:96:0x0182, B:97:0x0187, B:98:0x0190, B:105:0x01a6, B:106:0x01ab, B:108:0x01b4, B:110:0x01b8, B:111:0x01bd, B:115:0x01ca, B:117:0x01cf, B:118:0x01d4), top: B:135:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Y(int r11) {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.i.Y(int):boolean");
    }

    public final boolean Z(int i10, int i11) {
        boolean zCompareAndSet = this.f59964i.compareAndSet(i11, i10);
        if (zCompareAndSet) {
            k().h();
        }
        return zCompareAndSet;
    }

    public final void a() {
        dq.a aVar = this.f59968m;
        try {
            if (aVar != null) {
                try {
                    aVar.l();
                } catch (IOException e10) {
                    f59955x.b(e10);
                }
            }
        } finally {
            g();
        }
    }

    public void a0(URI uri) {
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("!Absolute URI: " + uri);
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("Opaque URI: " + uri);
        }
        vq.c cVar = f59955x;
        if (cVar.isDebugEnabled()) {
            cVar.h("URI = {}", uri.toASCIIString());
        }
        String scheme = uri.getScheme();
        int port = uri.getPort();
        if (port <= 0) {
            port = "https".equalsIgnoreCase(scheme) ? 443 : 80;
        }
        X(scheme);
        M(new dq.b(uri.getHost(), port));
        String strD = new n(uri).d();
        if (strD == null) {
            strD = "/";
        }
        U(strD);
    }

    public void b0(String str) {
        a0(URI.create(str));
    }

    public void c(String str, String str2) {
        p().e(str, str2);
    }

    public void d(dq.a aVar) {
        if (aVar.f().h() != null) {
            this.f59969n = new dq.b(aVar.f().h(), aVar.f().c());
        }
        this.f59968m = aVar;
        if (s() == 10) {
            a();
        }
    }

    public int d0() throws InterruptedException {
        int i10;
        synchronized (this) {
            while (!w()) {
                wait();
            }
            i10 = this.f59964i.get();
        }
        return i10;
    }

    public void e() {
        Y(10);
        a();
    }

    public void f(org.eclipse.jetty.client.a aVar) {
        e.a aVar2 = this.f59971p;
        if (aVar2 != null) {
            aVar.z0(aVar2);
        }
        this.f59971p = null;
    }

    public dq.a g() {
        dq.a aVar = this.f59968m;
        this.f59968m = null;
        if (s() == 10) {
            Y(11);
        }
        return aVar;
    }

    public final void h() {
        synchronized (this) {
            g();
            this.f59978w = true;
            notifyAll();
        }
    }

    public void i(HttpDestination httpDestination) {
        dq.a aVar = this.f59968m;
        int iS = s();
        if (iS < 7 || iS == 12 || iS == 13 || iS == 14) {
            Y(8);
        }
        httpDestination.e(this);
        if (aVar != null) {
            aVar.n(this);
        }
    }

    public dq.b j() {
        return this.f59960e;
    }

    public g k() {
        return this.f59967l;
    }

    public String l() {
        return this.f59956a;
    }

    public hq.d m() {
        return this.f59962g;
    }

    public hq.d n(hq.d dVar) throws IOException {
        synchronized (this) {
            if (this.f59963h != null) {
                if (dVar == null) {
                    dVar = new hq.h(8192);
                }
                int i10 = this.f59963h.read(dVar.W(), dVar.T(), dVar.L());
                if (i10 >= 0) {
                    dVar.X(dVar.T() + i10);
                    return dVar;
                }
            }
            return null;
        }
    }

    public InputStream o() {
        return this.f59963h;
    }

    public org.eclipse.jetty.http.a p() {
        return this.f59961f;
    }

    public String q() {
        return this.f59958c;
    }

    public hq.d r() {
        return this.f59957b;
    }

    public int s() {
        return this.f59964i.get();
    }

    public long t() {
        return this.f59970o;
    }

    public String toString() {
        String strC0 = c0(s());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f59972q;
        String str = this.f59974s >= 0 ? String.format("%s@%x=%s//%s%s#%s(%dms)->%s(%dms)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f59956a, this.f59960e, this.f59958c, c0(this.f59974s), Integer.valueOf(this.f59975t), strC0, Long.valueOf(j10)) : String.format("%s@%x=%s//%s%s#%s(%dms)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this.f59956a, this.f59960e, this.f59958c, strC0, Long.valueOf(j10));
        if (s() < 3 || this.f59973r <= 0) {
            return str;
        }
        return str + "sent=" + (jCurrentTimeMillis - this.f59973r) + "ms";
    }

    @Deprecated
    public String u() {
        return q();
    }

    public int v() {
        return this.f59959d;
    }

    public boolean w() {
        boolean z10;
        synchronized (this) {
            z10 = this.f59978w;
        }
        return z10;
    }

    public final boolean x() {
        boolean z10;
        synchronized (this) {
            z10 = this.f59977v;
        }
        return z10;
    }

    public void y(Throwable th2) {
        f59955x.d("CONNECTION FAILED " + this, th2);
    }

    public void z(Throwable th2) {
        f59955x.d("EXCEPTION " + this, th2);
    }
}
