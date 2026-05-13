package m4;

import a6.j;
import a6.k0;
import a6.t;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.metadata.Metadata;
import java.io.IOException;
import k4.g;
import k4.h;
import k4.i;
import k4.k;
import k4.l;
import k4.m;
import k4.n;
import k4.r;
import k4.s;
import k4.u;

/* JADX INFO: compiled from: FlacExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k f73968o = new k() { // from class: m4.c
        @Override // k4.k
        public final g[] createExtractors() {
            return d.i();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f73969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f73970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l.a f73972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f73973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f73974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f73975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Metadata f73976h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f73977i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f73978j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f73979k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f73980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f73981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f73982n;

    public d() {
        this(0);
    }

    public d(int i10) {
        this.f73969a = new byte[42];
        this.f73970b = new t(new byte[32768], 0);
        this.f73971c = (i10 & 1) != 0;
        this.f73972d = new l.a();
        this.f73975g = 0;
    }

    public static /* synthetic */ g[] i() {
        return new g[]{new d()};
    }

    @Override // k4.g
    public boolean a(h hVar) throws InterruptedException, IOException {
        m.c(hVar, false);
        return m.a(hVar);
    }

    @Override // k4.g
    public void b(i iVar) {
        this.f73973e = iVar;
        this.f73974f = iVar.track(0, 1);
        iVar.endTracks();
    }

    @Override // k4.g
    public int c(h hVar, r rVar) throws InterruptedException, IOException {
        int i10 = this.f73975g;
        if (i10 == 0) {
            l(hVar);
            return 0;
        }
        if (i10 == 1) {
            h(hVar);
            return 0;
        }
        if (i10 == 2) {
            n(hVar);
            return 0;
        }
        if (i10 == 3) {
            m(hVar);
            return 0;
        }
        if (i10 == 4) {
            f(hVar);
            return 0;
        }
        if (i10 == 5) {
            return k(hVar, rVar);
        }
        throw new IllegalStateException();
    }

    public final long e(t tVar, boolean z10) {
        boolean zD;
        a6.a.e(this.f73977i);
        int iC = tVar.c();
        while (iC <= tVar.d() - 16) {
            tVar.L(iC);
            if (l.d(tVar, this.f73977i, this.f73979k, this.f73972d)) {
                tVar.L(iC);
                return this.f73972d.f72896a;
            }
            iC++;
        }
        if (!z10) {
            tVar.L(iC);
            return -1L;
        }
        while (iC <= tVar.d() - this.f73978j) {
            tVar.L(iC);
            try {
                zD = l.d(tVar, this.f73977i, this.f73979k, this.f73972d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (tVar.c() <= tVar.d() ? zD : false) {
                tVar.L(iC);
                return this.f73972d.f72896a;
            }
            iC++;
        }
        tVar.L(tVar.d());
        return -1L;
    }

    public final void f(h hVar) throws InterruptedException, IOException {
        this.f73979k = m.b(hVar);
        ((i) k0.i(this.f73973e)).c(g(hVar.getPosition(), hVar.getLength()));
        this.f73975g = 5;
    }

    public final s g(long j10, long j11) {
        a6.a.e(this.f73977i);
        j jVar = this.f73977i;
        if (jVar.f3569k != null) {
            return new n(jVar, j10);
        }
        if (j11 == -1 || jVar.f3568j <= 0) {
            return new s.b(jVar.h());
        }
        b bVar = new b(jVar, this.f73979k, j10, j11);
        this.f73980l = bVar;
        return bVar.b();
    }

    public final void h(h hVar) throws InterruptedException, IOException {
        byte[] bArr = this.f73969a;
        hVar.peekFully(bArr, 0, bArr.length);
        hVar.resetPeekPosition();
        this.f73975g = 2;
    }

    public final void j() {
        ((u) k0.i(this.f73974f)).c((this.f73982n * 1000000) / ((long) ((j) k0.i(this.f73977i)).f3563e), 1, this.f73981m, 0, null);
    }

    public final int k(h hVar, r rVar) throws InterruptedException, IOException {
        boolean z10;
        a6.a.e(this.f73974f);
        a6.a.e(this.f73977i);
        b bVar = this.f73980l;
        if (bVar != null && bVar.d()) {
            return this.f73980l.c(hVar, rVar);
        }
        if (this.f73982n == -1) {
            this.f73982n = l.i(hVar, this.f73977i);
            return 0;
        }
        int iD = this.f73970b.d();
        if (iD < 32768) {
            int i10 = hVar.read(this.f73970b.f3620a, iD, 32768 - iD);
            z10 = i10 == -1;
            if (!z10) {
                this.f73970b.K(iD + i10);
            } else if (this.f73970b.a() == 0) {
                j();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iC = this.f73970b.c();
        int i11 = this.f73981m;
        int i12 = this.f73978j;
        if (i11 < i12) {
            t tVar = this.f73970b;
            tVar.M(Math.min(i12 - i11, tVar.a()));
        }
        long jE = e(this.f73970b, z10);
        int iC2 = this.f73970b.c() - iC;
        this.f73970b.L(iC);
        this.f73974f.a(this.f73970b, iC2);
        this.f73981m += iC2;
        if (jE != -1) {
            j();
            this.f73981m = 0;
            this.f73982n = jE;
        }
        if (this.f73970b.a() < 16) {
            t tVar2 = this.f73970b;
            byte[] bArr = tVar2.f3620a;
            int iC3 = tVar2.c();
            t tVar3 = this.f73970b;
            System.arraycopy(bArr, iC3, tVar3.f3620a, 0, tVar3.a());
            t tVar4 = this.f73970b;
            tVar4.H(tVar4.a());
        }
        return 0;
    }

    public final void l(h hVar) throws InterruptedException, IOException {
        this.f73976h = m.d(hVar, !this.f73971c);
        this.f73975g = 1;
    }

    public final void m(h hVar) throws InterruptedException, IOException {
        m.a aVar = new m.a(this.f73977i);
        boolean zE = false;
        while (!zE) {
            zE = m.e(hVar, aVar);
            this.f73977i = (j) k0.i(aVar.f72897a);
        }
        a6.a.e(this.f73977i);
        this.f73978j = Math.max(this.f73977i.f3561c, 6);
        ((u) k0.i(this.f73974f)).d(this.f73977i.i(this.f73969a, this.f73976h));
        this.f73975g = 4;
    }

    public final void n(h hVar) throws InterruptedException, IOException {
        m.j(hVar);
        this.f73975g = 3;
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f73975g = 0;
        } else {
            b bVar = this.f73980l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f73982n = j11 != 0 ? -1L : 0L;
        this.f73981m = 0;
        this.f73970b.G();
    }
}
