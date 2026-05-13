package l6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import i6.b0;
import i6.k;
import i6.l;
import i6.m;
import i6.p;
import i6.q;
import i6.r;
import i6.s;
import i6.t;
import i6.y;
import i6.z;
import java.io.IOException;
import s7.a0;
import s7.m0;

/* JADX INFO: compiled from: FlacExtractor.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p f73692o = new p() { // from class: l6.c
        @Override // i6.p
        public final k[] createExtractors() {
            return d.i();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f73693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f73694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q.a f73696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f73697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f73698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f73699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Metadata f73700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f73701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f73702j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f73703k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f73704l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f73705m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f73706n;

    public d() {
        this(0);
    }

    public d(int i10) {
        this.f73693a = new byte[42];
        this.f73694b = new a0(new byte[32768], 0);
        this.f73695c = (i10 & 1) != 0;
        this.f73696d = new q.a();
        this.f73699g = 0;
    }

    public static /* synthetic */ k[] i() {
        return new k[]{new d()};
    }

    @Override // i6.k
    public void a(m mVar) {
        this.f73697e = mVar;
        this.f73698f = mVar.track(0, 1);
        mVar.endTracks();
    }

    @Override // i6.k
    public int b(l lVar, y yVar) throws IOException {
        int i10 = this.f73699g;
        if (i10 == 0) {
            l(lVar);
            return 0;
        }
        if (i10 == 1) {
            h(lVar);
            return 0;
        }
        if (i10 == 2) {
            n(lVar);
            return 0;
        }
        if (i10 == 3) {
            m(lVar);
            return 0;
        }
        if (i10 == 4) {
            f(lVar);
            return 0;
        }
        if (i10 == 5) {
            return k(lVar, yVar);
        }
        throw new IllegalStateException();
    }

    @Override // i6.k
    public boolean c(l lVar) throws IOException {
        r.c(lVar, false);
        return r.a(lVar);
    }

    public final long e(a0 a0Var, boolean z10) {
        boolean zD;
        s7.a.e(this.f73701i);
        int iE = a0Var.e();
        while (iE <= a0Var.f() - 16) {
            a0Var.P(iE);
            if (q.d(a0Var, this.f73701i, this.f73703k, this.f73696d)) {
                a0Var.P(iE);
                return this.f73696d.f63917a;
            }
            iE++;
        }
        if (!z10) {
            a0Var.P(iE);
            return -1L;
        }
        while (iE <= a0Var.f() - this.f73702j) {
            a0Var.P(iE);
            try {
                zD = q.d(a0Var, this.f73701i, this.f73703k, this.f73696d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (a0Var.e() <= a0Var.f() ? zD : false) {
                a0Var.P(iE);
                return this.f73696d.f63917a;
            }
            iE++;
        }
        a0Var.P(a0Var.f());
        return -1L;
    }

    public final void f(l lVar) throws IOException {
        this.f73703k = r.b(lVar);
        ((m) m0.j(this.f73697e)).h(g(lVar.getPosition(), lVar.getLength()));
        this.f73699g = 5;
    }

    public final z g(long j10, long j11) {
        s7.a.e(this.f73701i);
        t tVar = this.f73701i;
        if (tVar.f63931k != null) {
            return new s(tVar, j10);
        }
        if (j11 == -1 || tVar.f63930j <= 0) {
            return new z.b(tVar.f());
        }
        b bVar = new b(tVar, this.f73703k, j10, j11);
        this.f73704l = bVar;
        return bVar.b();
    }

    public final void h(l lVar) throws IOException {
        byte[] bArr = this.f73693a;
        lVar.peekFully(bArr, 0, bArr.length);
        lVar.resetPeekPosition();
        this.f73699g = 2;
    }

    public final void j() {
        ((b0) m0.j(this.f73698f)).c((this.f73706n * 1000000) / ((long) ((t) m0.j(this.f73701i)).f63925e), 1, this.f73705m, 0, null);
    }

    public final int k(l lVar, y yVar) throws IOException {
        boolean z10;
        s7.a.e(this.f73698f);
        s7.a.e(this.f73701i);
        b bVar = this.f73704l;
        if (bVar != null && bVar.d()) {
            return this.f73704l.c(lVar, yVar);
        }
        if (this.f73706n == -1) {
            this.f73706n = q.i(lVar, this.f73701i);
            return 0;
        }
        int iF = this.f73694b.f();
        if (iF < 32768) {
            int i10 = lVar.read(this.f73694b.d(), iF, 32768 - iF);
            z10 = i10 == -1;
            if (!z10) {
                this.f73694b.O(iF + i10);
            } else if (this.f73694b.a() == 0) {
                j();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iE = this.f73694b.e();
        int i11 = this.f73705m;
        int i12 = this.f73702j;
        if (i11 < i12) {
            a0 a0Var = this.f73694b;
            a0Var.Q(Math.min(i12 - i11, a0Var.a()));
        }
        long jE = e(this.f73694b, z10);
        int iE2 = this.f73694b.e() - iE;
        this.f73694b.P(iE);
        this.f73698f.e(this.f73694b, iE2);
        this.f73705m += iE2;
        if (jE != -1) {
            j();
            this.f73705m = 0;
            this.f73706n = jE;
        }
        if (this.f73694b.a() < 16) {
            int iA = this.f73694b.a();
            System.arraycopy(this.f73694b.d(), this.f73694b.e(), this.f73694b.d(), 0, iA);
            this.f73694b.P(0);
            this.f73694b.O(iA);
        }
        return 0;
    }

    public final void l(l lVar) throws IOException {
        this.f73700h = r.d(lVar, !this.f73695c);
        this.f73699g = 1;
    }

    public final void m(l lVar) throws IOException {
        r.a aVar = new r.a(this.f73701i);
        boolean zE = false;
        while (!zE) {
            zE = r.e(lVar, aVar);
            this.f73701i = (t) m0.j(aVar.f63918a);
        }
        s7.a.e(this.f73701i);
        this.f73702j = Math.max(this.f73701i.f63923c, 6);
        ((b0) m0.j(this.f73698f)).b(this.f73701i.g(this.f73693a, this.f73700h));
        this.f73699g = 4;
    }

    public final void n(l lVar) throws IOException {
        r.i(lVar);
        this.f73699g = 3;
    }

    @Override // i6.k
    public void release() {
    }

    @Override // i6.k
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f73699g = 0;
        } else {
            b bVar = this.f73704l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f73706n = j11 != 0 ? -1L : 0L;
        this.f73705m = 0;
        this.f73694b.L(0);
    }
}
