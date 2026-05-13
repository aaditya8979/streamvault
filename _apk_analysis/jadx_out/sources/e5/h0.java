package e5;

import android.os.Looper;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.drm.DrmSession;
import java.io.IOException;
import k4.u;

/* JADX INFO: compiled from: SampleQueue.java */
/* JADX INFO: loaded from: classes11.dex */
public class h0 implements k4.u {
    public int A;
    public boolean B;
    public Format C;
    public long D;
    public boolean E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f60472a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer.drm.a<?> f60474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f60475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Looper f60476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Format f60477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public DrmSession<?> f60478g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f60487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f60488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f60489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f60490s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f60493v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Format f60496y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Format f60497z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f60473b = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f60479h = 1000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f60480i = new int[1000];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f60481j = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f60484m = new long[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f60483l = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f60482k = new int[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u.a[] f60485n = new u.a[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Format[] f60486o = new Format[1000];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f60491t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f60492u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f60495x = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f60494w = true;

    /* JADX INFO: compiled from: SampleQueue.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f60499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u.a f60500c;
    }

    /* JADX INFO: compiled from: SampleQueue.java */
    public interface b {
        void b(Format format);
    }

    public h0(y5.b bVar, Looper looper, com.google.android.exoplayer.drm.a<?> aVar) {
        this.f60472a = new g0(bVar);
        this.f60476e = looper;
        this.f60474c = aVar;
    }

    public final int A() {
        return this.f60488q + this.f60487p;
    }

    public final boolean B() {
        return this.f60490s != this.f60487p;
    }

    public final void C() {
        this.B = true;
    }

    public final synchronized boolean D() {
        return this.f60493v;
    }

    @CallSuper
    public synchronized boolean E(boolean z10) {
        Format format;
        boolean z11 = true;
        if (B()) {
            int iY = y(this.f60490s);
            if (this.f60486o[iY] != this.f60477f) {
                return true;
            }
            return F(iY);
        }
        if (!z10 && !this.f60493v && ((format = this.f60496y) == null || format == this.f60477f)) {
            z11 = false;
        }
        return z11;
    }

    public final boolean F(int i10) {
        DrmSession<?> drmSession;
        if (this.f60474c == com.google.android.exoplayer.drm.a.f20134a || (drmSession = this.f60478g) == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f60483l[i10] & 1073741824) == 0 && this.f60478g.playClearSamplesWithoutKeys();
    }

    @CallSuper
    public void G() throws IOException {
        DrmSession<?> drmSession = this.f60478g;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) a6.a.e(this.f60478g.getError()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Format format, e4.f0 f0Var) {
        f0Var.f60107c = format;
        Format format2 = this.f60477f;
        boolean z10 = format2 == null;
        DrmInitData drmInitData = z10 ? null : format2.f19930m;
        this.f60477f = format;
        if (this.f60474c == com.google.android.exoplayer.drm.a.f20134a) {
            return;
        }
        DrmInitData drmInitData2 = format.f19930m;
        f0Var.f60105a = true;
        f0Var.f60106b = this.f60478g;
        if (z10 || !a6.k0.c(drmInitData, drmInitData2)) {
            DrmSession<?> drmSession = this.f60478g;
            DrmSession drmSessionC = drmInitData2 != null ? this.f60474c.c(this.f60476e, drmInitData2) : this.f60474c.d(this.f60476e, a6.p.h(format.f19927j));
            this.f60478g = drmSessionC;
            f0Var.f60106b = drmSessionC;
            if (drmSession != null) {
                drmSession.release();
            }
        }
    }

    public final synchronized int I() {
        return B() ? this.f60480i[y(this.f60490s)] : this.A;
    }

    @CallSuper
    public void J() {
        n();
        N();
    }

    @CallSuper
    public int K(e4.f0 f0Var, i4.e eVar, boolean z10, boolean z11, long j10) {
        int iL = L(f0Var, eVar, z10, z11, j10, this.f60473b);
        if (iL == -4 && !eVar.isEndOfStream() && !eVar.e()) {
            this.f60472a.k(eVar, this.f60473b);
        }
        return iL;
    }

    public final synchronized int L(e4.f0 f0Var, i4.e eVar, boolean z10, boolean z11, long j10, a aVar) {
        boolean zB;
        eVar.f63712d = false;
        int iY = -1;
        while (true) {
            zB = B();
            if (!zB) {
                break;
            }
            iY = y(this.f60490s);
            if (this.f60484m[iY] >= j10 || !a6.p.a(this.f60486o[iY].f19927j)) {
                break;
            }
            this.f60490s++;
        }
        if (!zB) {
            if (!z11 && !this.f60493v) {
                Format format = this.f60496y;
                if (format == null || (!z10 && format == this.f60477f)) {
                    return -3;
                }
                H((Format) a6.a.e(format), f0Var);
                return -5;
            }
            eVar.setFlags(4);
            return -4;
        }
        if (!z10 && this.f60486o[iY] == this.f60477f) {
            if (!F(iY)) {
                eVar.f63712d = true;
                return -3;
            }
            eVar.setFlags(this.f60483l[iY]);
            long j11 = this.f60484m[iY];
            eVar.f63713e = j11;
            if (j11 < j10) {
                eVar.addFlag(Integer.MIN_VALUE);
            }
            if (eVar.e()) {
                return -4;
            }
            aVar.f60498a = this.f60482k[iY];
            aVar.f60499b = this.f60481j[iY];
            aVar.f60500c = this.f60485n[iY];
            this.f60490s++;
            return -4;
        }
        H(this.f60486o[iY], f0Var);
        return -5;
    }

    @CallSuper
    public void M() {
        P(true);
        N();
    }

    public final void N() {
        DrmSession<?> drmSession = this.f60478g;
        if (drmSession != null) {
            drmSession.release();
            this.f60478g = null;
            this.f60477f = null;
        }
    }

    public final void O() {
        P(false);
    }

    @CallSuper
    public void P(boolean z10) {
        this.f60472a.l();
        this.f60487p = 0;
        this.f60488q = 0;
        this.f60489r = 0;
        this.f60490s = 0;
        this.f60494w = true;
        this.f60491t = Long.MIN_VALUE;
        this.f60492u = Long.MIN_VALUE;
        this.f60493v = false;
        this.f60497z = null;
        if (z10) {
            this.C = null;
            this.f60496y = null;
            this.f60495x = true;
        }
    }

    public final synchronized void Q() {
        this.f60490s = 0;
        this.f60472a.m();
    }

    public final synchronized boolean R(int i10) {
        Q();
        int i11 = this.f60488q;
        if (i10 >= i11 && i10 <= this.f60487p + i11) {
            this.f60490s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean S(long j10, boolean z10) {
        Q();
        int iY = y(this.f60490s);
        if (B() && j10 >= this.f60484m[iY] && (j10 <= this.f60492u || z10)) {
            int iR = r(iY, this.f60487p - this.f60490s, j10, true);
            if (iR == -1) {
                return false;
            }
            this.f60490s += iR;
            return true;
        }
        return false;
    }

    public final void T(long j10) {
        if (this.D != j10) {
            this.D = j10;
            C();
        }
    }

    public final synchronized boolean U(Format format) {
        if (format == null) {
            this.f60495x = true;
            return false;
        }
        this.f60495x = false;
        if (a6.k0.c(format, this.f60496y)) {
            return false;
        }
        if (a6.k0.c(format, this.f60497z)) {
            this.f60496y = this.f60497z;
            return true;
        }
        this.f60496y = format;
        return true;
    }

    public final void V(b bVar) {
        this.f60475d = bVar;
    }

    public final void W(int i10) {
        this.A = i10;
    }

    public final void X() {
        this.E = true;
    }

    @Override // k4.u
    public final void a(a6.t tVar, int i10) {
        this.f60472a.o(tVar, i10);
    }

    @Override // k4.u
    public final int b(k4.h hVar, int i10, boolean z10) throws InterruptedException, IOException {
        return this.f60472a.n(hVar, i10, z10);
    }

    @Override // k4.u
    public final void c(long j10, int i10, int i11, int i12, @Nullable u.a aVar) {
        if (this.B) {
            d(this.C);
        }
        long j11 = j10 + this.D;
        if (this.E) {
            if ((i10 & 1) == 0 || !g(j11)) {
                return;
            } else {
                this.E = false;
            }
        }
        h(j11, i10, (this.f60472a.e() - ((long) i11)) - ((long) i12), i11, aVar);
    }

    @Override // k4.u
    public final void d(Format format) {
        Format formatS = s(format);
        this.B = false;
        this.C = format;
        boolean zU = U(formatS);
        b bVar = this.f60475d;
        if (bVar == null || !zU) {
            return;
        }
        bVar.b(formatS);
    }

    public final synchronized int e(long j10) {
        int iY = y(this.f60490s);
        if (B() && j10 >= this.f60484m[iY]) {
            int iR = r(iY, this.f60487p - this.f60490s, j10, true);
            if (iR == -1) {
                return 0;
            }
            this.f60490s += iR;
            return iR;
        }
        return 0;
    }

    public final synchronized int f() {
        int i10;
        int i11 = this.f60487p;
        i10 = i11 - this.f60490s;
        this.f60490s = i11;
        return i10;
    }

    public final synchronized boolean g(long j10) {
        if (this.f60487p == 0) {
            return j10 > this.f60491t;
        }
        if (Math.max(this.f60491t, w(this.f60490s)) >= j10) {
            return false;
        }
        int i10 = this.f60487p;
        int iY = y(i10 - 1);
        while (i10 > this.f60490s && this.f60484m[iY] >= j10) {
            i10--;
            iY--;
            if (iY == -1) {
                iY = this.f60479h - 1;
            }
        }
        p(this.f60488q + i10);
        return true;
    }

    public final synchronized void h(long j10, int i10, long j11, int i11, u.a aVar) {
        if (this.f60494w) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.f60494w = false;
            }
        }
        a6.a.f(!this.f60495x);
        this.f60493v = (536870912 & i10) != 0;
        this.f60492u = Math.max(this.f60492u, j10);
        int iY = y(this.f60487p);
        this.f60484m[iY] = j10;
        long[] jArr = this.f60481j;
        jArr[iY] = j11;
        this.f60482k[iY] = i11;
        this.f60483l[iY] = i10;
        this.f60485n[iY] = aVar;
        Format[] formatArr = this.f60486o;
        Format format = this.f60496y;
        formatArr[iY] = format;
        this.f60480i[iY] = this.A;
        this.f60497z = format;
        int i12 = this.f60487p + 1;
        this.f60487p = i12;
        int i13 = this.f60479h;
        if (i12 == i13) {
            int i14 = i13 + 1000;
            int[] iArr = new int[i14];
            long[] jArr2 = new long[i14];
            long[] jArr3 = new long[i14];
            int[] iArr2 = new int[i14];
            int[] iArr3 = new int[i14];
            u.a[] aVarArr = new u.a[i14];
            Format[] formatArr2 = new Format[i14];
            int i15 = this.f60489r;
            int i16 = i13 - i15;
            System.arraycopy(jArr, i15, jArr2, 0, i16);
            System.arraycopy(this.f60484m, this.f60489r, jArr3, 0, i16);
            System.arraycopy(this.f60483l, this.f60489r, iArr2, 0, i16);
            System.arraycopy(this.f60482k, this.f60489r, iArr3, 0, i16);
            System.arraycopy(this.f60485n, this.f60489r, aVarArr, 0, i16);
            System.arraycopy(this.f60486o, this.f60489r, formatArr2, 0, i16);
            System.arraycopy(this.f60480i, this.f60489r, iArr, 0, i16);
            int i17 = this.f60489r;
            System.arraycopy(this.f60481j, 0, jArr2, i16, i17);
            System.arraycopy(this.f60484m, 0, jArr3, i16, i17);
            System.arraycopy(this.f60483l, 0, iArr2, i16, i17);
            System.arraycopy(this.f60482k, 0, iArr3, i16, i17);
            System.arraycopy(this.f60485n, 0, aVarArr, i16, i17);
            System.arraycopy(this.f60486o, 0, formatArr2, i16, i17);
            System.arraycopy(this.f60480i, 0, iArr, i16, i17);
            this.f60481j = jArr2;
            this.f60484m = jArr3;
            this.f60483l = iArr2;
            this.f60482k = iArr3;
            this.f60485n = aVarArr;
            this.f60486o = formatArr2;
            this.f60480i = iArr;
            this.f60489r = 0;
            this.f60479h = i14;
        }
    }

    public final synchronized long i(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f60487p;
        if (i11 != 0) {
            long[] jArr = this.f60484m;
            int i12 = this.f60489r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f60490s) != i11) {
                    i11 = i10 + 1;
                }
                int iR = r(i12, i11, j10, z10);
                if (iR == -1) {
                    return -1L;
                }
                return l(iR);
            }
        }
        return -1L;
    }

    public final synchronized long j() {
        int i10 = this.f60487p;
        if (i10 == 0) {
            return -1L;
        }
        return l(i10);
    }

    public synchronized long k() {
        int i10 = this.f60490s;
        if (i10 == 0) {
            return -1L;
        }
        return l(i10);
    }

    public final long l(int i10) {
        this.f60491t = Math.max(this.f60491t, w(i10));
        int i11 = this.f60487p - i10;
        this.f60487p = i11;
        this.f60488q += i10;
        int i12 = this.f60489r + i10;
        this.f60489r = i12;
        int i13 = this.f60479h;
        if (i12 >= i13) {
            this.f60489r = i12 - i13;
        }
        int i14 = this.f60490s - i10;
        this.f60490s = i14;
        if (i14 < 0) {
            this.f60490s = 0;
        }
        if (i11 != 0) {
            return this.f60481j[this.f60489r];
        }
        int i15 = this.f60489r;
        if (i15 != 0) {
            i13 = i15;
        }
        int i16 = i13 - 1;
        return this.f60481j[i16] + ((long) this.f60482k[i16]);
    }

    public final void m(long j10, boolean z10, boolean z11) {
        this.f60472a.c(i(j10, z10, z11));
    }

    public final void n() {
        this.f60472a.c(j());
    }

    public final void o() {
        this.f60472a.c(k());
    }

    public final long p(int i10) {
        int iA = A() - i10;
        boolean z10 = false;
        a6.a.a(iA >= 0 && iA <= this.f60487p - this.f60490s);
        int i11 = this.f60487p - iA;
        this.f60487p = i11;
        this.f60492u = Math.max(this.f60491t, w(i11));
        if (iA == 0 && this.f60493v) {
            z10 = true;
        }
        this.f60493v = z10;
        int i12 = this.f60487p;
        if (i12 == 0) {
            return 0L;
        }
        int iY = y(i12 - 1);
        return this.f60481j[iY] + ((long) this.f60482k[iY]);
    }

    public final void q(int i10) {
        this.f60472a.d(p(i10));
    }

    public final int r(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11 && this.f60484m[i10] <= j10; i13++) {
            if (!z10 || (this.f60483l[i10] & 1) != 0) {
                i12 = i13;
            }
            i10++;
            if (i10 == this.f60479h) {
                i10 = 0;
            }
        }
        return i12;
    }

    @CallSuper
    public Format s(Format format) {
        long j10 = this.D;
        if (j10 == 0) {
            return format;
        }
        long j11 = format.f19931n;
        return j11 != Long.MAX_VALUE ? format.m(j11 + j10) : format;
    }

    public final int t() {
        return this.f60488q;
    }

    public final synchronized long u() {
        return this.f60487p == 0 ? Long.MIN_VALUE : this.f60484m[this.f60489r];
    }

    public final synchronized long v() {
        return this.f60492u;
    }

    public final long w(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iY = y(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f60484m[iY]);
            if ((this.f60483l[iY] & 1) != 0) {
                break;
            }
            iY--;
            if (iY == -1) {
                iY = this.f60479h - 1;
            }
        }
        return jMax;
    }

    public final int x() {
        return this.f60488q + this.f60490s;
    }

    public final int y(int i10) {
        int i11 = this.f60489r + i10;
        int i12 = this.f60479h;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized Format z() {
        return this.f60495x ? null : this.f60496y;
    }
}
