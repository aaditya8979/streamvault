package gq;

import java.io.IOException;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: AbstractGenerator.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final vq.c f62752t = vq.b.a(a.class);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f62753u = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Buffers f62754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hq.k f62755b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hq.d f62759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hq.d f62760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f62761h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public hq.d f62768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public hq.d f62769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public hq.d f62770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public hq.d f62771r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f62772s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62756c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62757d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62758e = 11;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f62762i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f62763j = -3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f62764k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f62765l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f62766m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f62767n = null;

    public a(Buffers buffers, hq.k kVar) {
        this.f62754a = buffers;
        this.f62755b = kVar;
    }

    public abstract int A() throws IOException;

    public void B(String str, String str2) {
        if (str == null || "GET".equals(str)) {
            this.f62760g = j.f62843b;
        } else {
            this.f62760g = j.f62842a.h(str);
        }
        this.f62761h = str2;
        if (this.f62758e == 9) {
            this.f62766m = true;
        }
    }

    @Override // gq.c
    public void a() {
        hq.d dVar = this.f62769p;
        if (dVar != null && dVar.length() == 0) {
            this.f62754a.c(this.f62769p);
            this.f62769p = null;
        }
        hq.d dVar2 = this.f62768o;
        if (dVar2 == null || dVar2.length() != 0) {
            return;
        }
        this.f62754a.c(this.f62768o);
        this.f62768o = null;
    }

    @Override // gq.c
    public boolean b() {
        return this.f62756c != 0;
    }

    @Override // gq.c
    public void c() {
        if (this.f62756c >= 3) {
            throw new IllegalStateException("Flushed");
        }
        this.f62764k = false;
        this.f62767n = null;
        this.f62762i = 0L;
        this.f62763j = -3L;
        this.f62770q = null;
        hq.d dVar = this.f62769p;
        if (dVar != null) {
            dVar.clear();
        }
    }

    @Override // gq.c
    public void complete() throws IOException {
        if (this.f62756c == 0) {
            throw new IllegalStateException("State==HEADER");
        }
        long j10 = this.f62763j;
        if (j10 < 0 || j10 == this.f62762i || this.f62765l) {
            return;
        }
        vq.c cVar = f62752t;
        if (cVar.isDebugEnabled()) {
            cVar.h("ContentLength written==" + this.f62762i + " != contentLength==" + this.f62763j, new Object[0]);
        }
        this.f62767n = Boolean.FALSE;
    }

    @Override // gq.c
    public void d(boolean z10) {
        this.f62767n = Boolean.valueOf(z10);
    }

    @Override // gq.c
    public boolean e() {
        Boolean bool = this.f62767n;
        return bool != null ? bool.booleanValue() : x() || this.f62758e > 10;
    }

    @Override // gq.c
    public void f(int i10, String str) {
        if (this.f62756c != 0) {
            throw new IllegalStateException("STATE!=START");
        }
        this.f62760g = null;
        this.f62757d = i10;
        if (str != null) {
            byte[] bArrC = sq.o.c(str);
            int length = bArrC.length;
            if (length > 1024) {
                length = 1024;
            }
            this.f62759f = new hq.h(length);
            for (int i11 = 0; i11 < length; i11++) {
                byte b10 = bArrC[i11];
                if (b10 == 13 || b10 == 10) {
                    this.f62759f.put((byte) 32);
                } else {
                    this.f62759f.put(b10);
                }
            }
        }
    }

    @Override // gq.c
    public void h(boolean z10) {
        this.f62765l = z10;
    }

    @Override // gq.c
    public void i(boolean z10) {
        this.f62772s = z10;
    }

    @Override // gq.c
    public boolean isComplete() {
        return this.f62756c == 4;
    }

    @Override // gq.c
    public void j(hq.d dVar) {
        this.f62771r = dVar;
    }

    @Override // gq.c
    public boolean k() {
        long j10 = this.f62763j;
        return j10 >= 0 && this.f62762i >= j10;
    }

    @Override // gq.c
    public abstract int l() throws IOException;

    @Override // gq.c
    public abstract void m(org.eclipse.jetty.http.a aVar, boolean z10) throws IOException;

    @Override // gq.c
    public void n(int i10, String str, String str2, boolean z10) throws IOException {
        if (z10) {
            this.f62767n = Boolean.FALSE;
        }
        if (b()) {
            f62752t.h("sendError on committed: {} {}", Integer.valueOf(i10), str);
            return;
        }
        f62752t.h("sendError: {} {}", Integer.valueOf(i10), str);
        f(i10, str);
        if (str2 != null) {
            m(null, false);
            g(new hq.m(new hq.h(str2)), true);
        } else if (i10 >= 400) {
            m(null, false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error: ");
            if (str == null) {
                str = "" + i10;
            }
            sb2.append(str);
            g(new hq.m(new hq.h(sb2.toString())), true);
        } else {
            m(null, true);
        }
        complete();
    }

    @Override // gq.c
    public void o(long j10) {
        if (j10 < 0) {
            this.f62763j = -3L;
        } else {
            this.f62763j = j10;
        }
    }

    @Override // gq.c
    public boolean p() {
        return this.f62756c == 0 && this.f62760g == null && this.f62757d == 0;
    }

    public void q(long j10) throws IOException {
        if (this.f62755b.g()) {
            try {
                l();
                return;
            } catch (IOException e10) {
                this.f62755b.close();
                throw e10;
            }
        }
        if (this.f62755b.i(j10)) {
            l();
        } else {
            this.f62755b.close();
            throw new EofException("timeout");
        }
    }

    public void r() {
        if (this.f62766m) {
            hq.d dVar = this.f62769p;
            if (dVar != null) {
                dVar.clear();
                return;
            }
            return;
        }
        this.f62762i += (long) this.f62769p.length();
        if (this.f62765l) {
            this.f62769p.clear();
        }
    }

    @Override // gq.c
    public void reset() {
        this.f62756c = 0;
        this.f62757d = 0;
        this.f62758e = 11;
        this.f62759f = null;
        this.f62764k = false;
        this.f62765l = false;
        this.f62766m = false;
        this.f62767n = null;
        this.f62762i = 0L;
        this.f62763j = -3L;
        this.f62771r = null;
        this.f62770q = null;
        this.f62760g = null;
    }

    public void s(long j10) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = j10 + jCurrentTimeMillis;
        hq.d dVar = this.f62770q;
        hq.d dVar2 = this.f62769p;
        if ((dVar == null || dVar.length() <= 0) && ((dVar2 == null || dVar2.length() <= 0) && !v())) {
            return;
        }
        l();
        while (jCurrentTimeMillis < j11) {
            if ((dVar == null || dVar.length() <= 0) && (dVar2 == null || dVar2.length() <= 0)) {
                return;
            }
            if (!this.f62755b.isOpen() || this.f62755b.x()) {
                throw new EofException();
            }
            q(j11 - jCurrentTimeMillis);
            jCurrentTimeMillis = System.currentTimeMillis();
        }
    }

    @Override // gq.c
    public void setVersion(int i10) {
        if (this.f62756c != 0) {
            throw new IllegalStateException("STATE!=START " + this.f62756c);
        }
        this.f62758e = i10;
        if (i10 != 9 || this.f62760g == null) {
            return;
        }
        this.f62766m = true;
    }

    public boolean t() {
        return this.f62772s;
    }

    public hq.d u() {
        return this.f62769p;
    }

    public boolean v() {
        hq.d dVar = this.f62769p;
        if (dVar == null || dVar.L() != 0) {
            hq.d dVar2 = this.f62770q;
            return dVar2 != null && dVar2.length() > 0;
        }
        if (this.f62769p.length() == 0 && !this.f62769p.Z()) {
            this.f62769p.c0();
        }
        return this.f62769p.L() == 0;
    }

    public boolean w() {
        return this.f62755b.isOpen();
    }

    public abstract boolean x();

    public boolean y(int i10) {
        return this.f62756c == i10;
    }

    public boolean z() {
        return this.f62762i > 0;
    }
}
