package com.google.android.exoplayer2.source;

import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.p;
import d6.z0;
import e7.e0;
import i6.b0;
import java.io.IOException;
import s7.a0;
import s7.m0;
import s7.u;

/* JADX INFO: compiled from: SampleQueue.java */
/* JADX INFO: loaded from: classes9.dex */
public class p implements b0 {

    @Nullable
    public com.google.android.exoplayer2.m A;

    @Nullable
    public com.google.android.exoplayer2.m B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f22414a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.drm.c f22417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final b.a f22418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public d f22419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.m f22420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public DrmSession f22421h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22432s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f22436w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f22439z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f22415b = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22422i = 1000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f22423j = new int[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f22424k = new long[1000];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f22427n = new long[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f22426m = new int[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f22425l = new int[1000];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0.a[] f22428o = new b0.a[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0<c> f22416c = new e0<>(new s7.h() { // from class: e7.a0
        @Override // s7.h
        public final void accept(Object obj) {
            com.google.android.exoplayer2.source.p.E((p.c) obj);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f22433t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f22434u = Long.MIN_VALUE;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f22435v = Long.MIN_VALUE;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f22438y = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22437x = true;

    /* JADX INFO: compiled from: SampleQueue.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f22441b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public b0.a f22442c;
    }

    /* JADX INFO: compiled from: SampleQueue.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.m f22443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.b f22444b;

        public c(com.google.android.exoplayer2.m mVar, c.b bVar) {
            this.f22443a = mVar;
            this.f22444b = bVar;
        }
    }

    /* JADX INFO: compiled from: SampleQueue.java */
    public interface d {
        void a(com.google.android.exoplayer2.m mVar);
    }

    public p(r7.b bVar, @Nullable com.google.android.exoplayer2.drm.c cVar, @Nullable b.a aVar) {
        this.f22417d = cVar;
        this.f22418e = aVar;
        this.f22414a = new o(bVar);
    }

    public static /* synthetic */ void E(c cVar) {
        cVar.f22444b.release();
    }

    public static p k(r7.b bVar, com.google.android.exoplayer2.drm.c cVar, b.a aVar) {
        return new p(bVar, (com.google.android.exoplayer2.drm.c) s7.a.e(cVar), (b.a) s7.a.e(aVar));
    }

    public final int A() {
        return this.f22430q + this.f22429p;
    }

    public final boolean B() {
        return this.f22432s != this.f22429p;
    }

    public final synchronized boolean C() {
        return this.f22436w;
    }

    @CallSuper
    public synchronized boolean D(boolean z10) {
        com.google.android.exoplayer2.m mVar;
        boolean z11 = true;
        if (B()) {
            if (this.f22416c.e(w()).f22443a != this.f22420g) {
                return true;
            }
            return F(x(this.f22432s));
        }
        if (!z10 && !this.f22436w && ((mVar = this.B) == null || mVar == this.f22420g)) {
            z11 = false;
        }
        return z11;
    }

    public final boolean F(int i10) {
        DrmSession drmSession = this.f22421h;
        return drmSession == null || drmSession.getState() == 4 || ((this.f22426m[i10] & 1073741824) == 0 && this.f22421h.playClearSamplesWithoutKeys());
    }

    @CallSuper
    public void G() throws IOException {
        DrmSession drmSession = this.f22421h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) s7.a.e(this.f22421h.getError()));
        }
    }

    public final void H(com.google.android.exoplayer2.m mVar, z0 z0Var) {
        com.google.android.exoplayer2.m mVar2 = this.f22420g;
        boolean z10 = mVar2 == null;
        DrmInitData drmInitData = z10 ? null : mVar2.f21754p;
        this.f22420g = mVar;
        DrmInitData drmInitData2 = mVar.f21754p;
        com.google.android.exoplayer2.drm.c cVar = this.f22417d;
        z0Var.f59724b = cVar != null ? mVar.c(cVar.d(mVar)) : mVar;
        z0Var.f59723a = this.f22421h;
        if (this.f22417d == null) {
            return;
        }
        if (z10 || !m0.c(drmInitData, drmInitData2)) {
            DrmSession drmSession = this.f22421h;
            DrmSession drmSessionB = this.f22417d.b(this.f22418e, mVar);
            this.f22421h = drmSessionB;
            z0Var.f59723a = drmSessionB;
            if (drmSession != null) {
                drmSession.a(this.f22418e);
            }
        }
    }

    public final synchronized int I(z0 z0Var, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, b bVar) {
        decoderInputBuffer.f21431e = false;
        if (!B()) {
            if (!z11 && !this.f22436w) {
                com.google.android.exoplayer2.m mVar = this.B;
                if (mVar == null || (!z10 && mVar == this.f22420g)) {
                    return -3;
                }
                H((com.google.android.exoplayer2.m) s7.a.e(mVar), z0Var);
                return -5;
            }
            decoderInputBuffer.k(4);
            return -4;
        }
        com.google.android.exoplayer2.m mVar2 = this.f22416c.e(w()).f22443a;
        if (!z10 && mVar2 == this.f22420g) {
            int iX = x(this.f22432s);
            if (!F(iX)) {
                decoderInputBuffer.f21431e = true;
                return -3;
            }
            decoderInputBuffer.k(this.f22426m[iX]);
            long j10 = this.f22427n[iX];
            decoderInputBuffer.f21432f = j10;
            if (j10 < this.f22433t) {
                decoderInputBuffer.a(Integer.MIN_VALUE);
            }
            bVar.f22440a = this.f22425l[iX];
            bVar.f22441b = this.f22424k[iX];
            bVar.f22442c = this.f22428o[iX];
            return -4;
        }
        H(mVar2, z0Var);
        return -5;
    }

    @CallSuper
    public void J() {
        p();
        M();
    }

    @CallSuper
    public int K(z0 z0Var, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        int I = I(z0Var, decoderInputBuffer, (i10 & 2) != 0, z10, this.f22415b);
        if (I == -4 && !decoderInputBuffer.g()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f22414a.e(decoderInputBuffer, this.f22415b);
                } else {
                    this.f22414a.l(decoderInputBuffer, this.f22415b);
                }
            }
            if (!z11) {
                this.f22432s++;
            }
        }
        return I;
    }

    @CallSuper
    public void L() {
        O(true);
        M();
    }

    public final void M() {
        DrmSession drmSession = this.f22421h;
        if (drmSession != null) {
            drmSession.a(this.f22418e);
            this.f22421h = null;
            this.f22420g = null;
        }
    }

    public final void N() {
        O(false);
    }

    @CallSuper
    public void O(boolean z10) {
        this.f22414a.m();
        this.f22429p = 0;
        this.f22430q = 0;
        this.f22431r = 0;
        this.f22432s = 0;
        this.f22437x = true;
        this.f22433t = Long.MIN_VALUE;
        this.f22434u = Long.MIN_VALUE;
        this.f22435v = Long.MIN_VALUE;
        this.f22436w = false;
        this.f22416c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f22438y = true;
        }
    }

    public final synchronized void P() {
        this.f22432s = 0;
        this.f22414a.n();
    }

    public final synchronized boolean Q(long j10, boolean z10) {
        P();
        int iX = x(this.f22432s);
        if (B() && j10 >= this.f22427n[iX] && (j10 <= this.f22435v || z10)) {
            int iR = r(iX, this.f22429p - this.f22432s, j10, true);
            if (iR == -1) {
                return false;
            }
            this.f22433t = j10;
            this.f22432s += iR;
            return true;
        }
        return false;
    }

    public final void R(long j10) {
        this.f22433t = j10;
    }

    public final synchronized boolean S(com.google.android.exoplayer2.m mVar) {
        this.f22438y = false;
        if (m0.c(mVar, this.B)) {
            return false;
        }
        if (this.f22416c.g() || !this.f22416c.f().f22443a.equals(mVar)) {
            this.B = mVar;
        } else {
            this.B = this.f22416c.f().f22443a;
        }
        com.google.android.exoplayer2.m mVar2 = this.B;
        this.D = u.a(mVar2.f21751m, mVar2.f21748j);
        this.E = false;
        return true;
    }

    public final void T(@Nullable d dVar) {
        this.f22419f = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void U(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f22432s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f22429p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            s7.a.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f22432s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f22432s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.p.U(int):void");
    }

    @Override // i6.b0
    public final void a(a0 a0Var, int i10, int i11) {
        this.f22414a.p(a0Var, i10);
    }

    @Override // i6.b0
    public final void b(com.google.android.exoplayer2.m mVar) {
        com.google.android.exoplayer2.m mVarS = s(mVar);
        this.f22439z = false;
        this.A = mVar;
        boolean zS = S(mVarS);
        d dVar = this.f22419f;
        if (dVar == null || !zS) {
            return;
        }
        dVar.a(mVarS);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    @Override // i6.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r12, int r14, int r15, int r16, @androidx.annotation.Nullable i6.b0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f22439z
            if (r0 == 0) goto L10
            com.google.android.exoplayer2.m r0 = r8.A
            java.lang.Object r0 = s7.a.i(r0)
            com.google.android.exoplayer2.m r0 = (com.google.android.exoplayer2.m) r0
            r11.b(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f22437x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f22437x = r1
        L22:
            long r4 = r8.F
            long r4 = r4 + r12
            boolean r6 = r8.D
            if (r6 == 0) goto L54
            long r6 = r8.f22433t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            com.google.android.exoplayer2.m r6 = r8.B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            s7.q.i(r6, r0)
            r8.E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.G = r1
            goto L66
        L65:
            return
        L66:
            com.google.android.exoplayer2.source.o r0 = r8.f22414a
            long r0 = r0.d()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.p.c(long, int, int, int, i6.b0$a):void");
    }

    @Override // i6.b0
    public final int d(r7.f fVar, int i10, boolean z10, int i11) throws IOException {
        return this.f22414a.o(fVar, i10, z10);
    }

    public final synchronized boolean h(long j10) {
        if (this.f22429p == 0) {
            return j10 > this.f22434u;
        }
        if (u() >= j10) {
            return false;
        }
        q(this.f22430q + j(j10));
        return true;
    }

    public final synchronized void i(long j10, int i10, long j11, int i11, @Nullable b0.a aVar) {
        int i12 = this.f22429p;
        if (i12 > 0) {
            int iX = x(i12 - 1);
            s7.a.a(this.f22424k[iX] + ((long) this.f22425l[iX]) <= j11);
        }
        this.f22436w = (536870912 & i10) != 0;
        this.f22435v = Math.max(this.f22435v, j10);
        int iX2 = x(this.f22429p);
        this.f22427n[iX2] = j10;
        this.f22424k[iX2] = j11;
        this.f22425l[iX2] = i11;
        this.f22426m[iX2] = i10;
        this.f22428o[iX2] = aVar;
        this.f22423j[iX2] = this.C;
        if (this.f22416c.g() || !this.f22416c.f().f22443a.equals(this.B)) {
            com.google.android.exoplayer2.drm.c cVar = this.f22417d;
            this.f22416c.a(A(), new c((com.google.android.exoplayer2.m) s7.a.e(this.B), cVar != null ? cVar.c(this.f22418e, this.B) : c.b.f21530a));
        }
        int i13 = this.f22429p + 1;
        this.f22429p = i13;
        int i14 = this.f22422i;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            b0.a[] aVarArr = new b0.a[i15];
            int i16 = this.f22431r;
            int i17 = i14 - i16;
            System.arraycopy(this.f22424k, i16, jArr, 0, i17);
            System.arraycopy(this.f22427n, this.f22431r, jArr2, 0, i17);
            System.arraycopy(this.f22426m, this.f22431r, iArr2, 0, i17);
            System.arraycopy(this.f22425l, this.f22431r, iArr3, 0, i17);
            System.arraycopy(this.f22428o, this.f22431r, aVarArr, 0, i17);
            System.arraycopy(this.f22423j, this.f22431r, iArr, 0, i17);
            int i18 = this.f22431r;
            System.arraycopy(this.f22424k, 0, jArr, i17, i18);
            System.arraycopy(this.f22427n, 0, jArr2, i17, i18);
            System.arraycopy(this.f22426m, 0, iArr2, i17, i18);
            System.arraycopy(this.f22425l, 0, iArr3, i17, i18);
            System.arraycopy(this.f22428o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f22423j, 0, iArr, i17, i18);
            this.f22424k = jArr;
            this.f22427n = jArr2;
            this.f22426m = iArr2;
            this.f22425l = iArr3;
            this.f22428o = aVarArr;
            this.f22423j = iArr;
            this.f22431r = 0;
            this.f22422i = i15;
        }
    }

    public final int j(long j10) {
        int i10 = this.f22429p;
        int iX = x(i10 - 1);
        while (i10 > this.f22432s && this.f22427n[iX] >= j10) {
            i10--;
            iX--;
            if (iX == -1) {
                iX = this.f22422i - 1;
            }
        }
        return i10;
    }

    public final synchronized long l(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f22429p;
        if (i11 != 0) {
            long[] jArr = this.f22427n;
            int i12 = this.f22431r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f22432s) != i11) {
                    i11 = i10 + 1;
                }
                int iR = r(i12, i11, j10, z10);
                if (iR == -1) {
                    return -1L;
                }
                return n(iR);
            }
        }
        return -1L;
    }

    public final synchronized long m() {
        int i10 = this.f22429p;
        if (i10 == 0) {
            return -1L;
        }
        return n(i10);
    }

    @GuardedBy("this")
    public final long n(int i10) {
        this.f22434u = Math.max(this.f22434u, v(i10));
        this.f22429p -= i10;
        int i11 = this.f22430q + i10;
        this.f22430q = i11;
        int i12 = this.f22431r + i10;
        this.f22431r = i12;
        int i13 = this.f22422i;
        if (i12 >= i13) {
            this.f22431r = i12 - i13;
        }
        int i14 = this.f22432s - i10;
        this.f22432s = i14;
        if (i14 < 0) {
            this.f22432s = 0;
        }
        this.f22416c.d(i11);
        if (this.f22429p != 0) {
            return this.f22424k[this.f22431r];
        }
        int i15 = this.f22431r;
        if (i15 == 0) {
            i15 = this.f22422i;
        }
        int i16 = i15 - 1;
        return this.f22424k[i16] + ((long) this.f22425l[i16]);
    }

    public final void o(long j10, boolean z10, boolean z11) {
        this.f22414a.b(l(j10, z10, z11));
    }

    public final void p() {
        this.f22414a.b(m());
    }

    public final long q(int i10) {
        int iA = A() - i10;
        boolean z10 = false;
        s7.a.a(iA >= 0 && iA <= this.f22429p - this.f22432s);
        int i11 = this.f22429p - iA;
        this.f22429p = i11;
        this.f22435v = Math.max(this.f22434u, v(i11));
        if (iA == 0 && this.f22436w) {
            z10 = true;
        }
        this.f22436w = z10;
        this.f22416c.c(i10);
        int i12 = this.f22429p;
        if (i12 == 0) {
            return 0L;
        }
        int iX = x(i12 - 1);
        return this.f22424k[iX] + ((long) this.f22425l[iX]);
    }

    public final int r(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f22427n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f22426m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f22422i) {
                i10 = 0;
            }
        }
        return i12;
    }

    @CallSuper
    public com.google.android.exoplayer2.m s(com.google.android.exoplayer2.m mVar) {
        return (this.F == 0 || mVar.f21755q == Long.MAX_VALUE) ? mVar : mVar.b().i0(mVar.f21755q + this.F).E();
    }

    public final synchronized long t() {
        return this.f22435v;
    }

    public final synchronized long u() {
        return Math.max(this.f22434u, v(this.f22432s));
    }

    public final long v(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iX = x(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f22427n[iX]);
            if ((this.f22426m[iX] & 1) != 0) {
                break;
            }
            iX--;
            if (iX == -1) {
                iX = this.f22422i - 1;
            }
        }
        return jMax;
    }

    public final int w() {
        return this.f22430q + this.f22432s;
    }

    public final int x(int i10) {
        int i11 = this.f22431r + i10;
        int i12 = this.f22422i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized int y(long j10, boolean z10) {
        int iX = x(this.f22432s);
        if (B() && j10 >= this.f22427n[iX]) {
            if (j10 > this.f22435v && z10) {
                return this.f22429p - this.f22432s;
            }
            int iR = r(iX, this.f22429p - this.f22432s, j10, true);
            if (iR == -1) {
                return 0;
            }
            return iR;
        }
        return 0;
    }

    @Nullable
    public final synchronized com.google.android.exoplayer2.m z() {
        return this.f22438y ? null : this.B;
    }
}
