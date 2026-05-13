package com.google.common.collect;

import com.google.common.collect.Multisets;
import com.google.common.collect.b2;
import java.util.Arrays;

/* JADX INFO: compiled from: ObjectCountHashMap.java */
/* JADX INFO: loaded from: classes12.dex */
public class e2<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object[] f23391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f23392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f23393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient int f23394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int[] f23395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient long[] f23396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient float f23397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f23398h;

    /* JADX INFO: compiled from: ObjectCountHashMap.java */
    public class a extends Multisets.a<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f23399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23400c;

        public a(int i10) {
            this.f23399b = (K) e2.this.f23391a[i10];
            this.f23400c = i10;
        }

        public void d() {
            int i10 = this.f23400c;
            if (i10 == -1 || i10 >= e2.this.C() || !y7.i.a(this.f23399b, e2.this.f23391a[this.f23400c])) {
                this.f23400c = e2.this.m(this.f23399b);
            }
        }

        @Override // com.google.common.collect.b2.a
        public int getCount() {
            d();
            int i10 = this.f23400c;
            if (i10 == -1) {
                return 0;
            }
            return e2.this.f23392b[i10];
        }

        @Override // com.google.common.collect.b2.a
        public K getElement() {
            return this.f23399b;
        }
    }

    public e2() {
        n(3, 1.0f);
    }

    public e2(int i10) {
        this(i10, 1.0f);
    }

    public e2(int i10, float f10) {
        n(i10, f10);
    }

    public e2(e2<? extends K> e2Var) {
        n(e2Var.C(), 1.0f);
        int iE = e2Var.e();
        while (iE != -1) {
            u(e2Var.i(iE), e2Var.k(iE));
            iE = e2Var.s(iE);
        }
    }

    public static long D(long j10, int i10) {
        return (j10 & (-4294967296L)) | (((long) i10) & 4294967295L);
    }

    public static <K> e2<K> b() {
        return new e2<>();
    }

    public static <K> e2<K> c(int i10) {
        return new e2<>(i10);
    }

    public static int h(long j10) {
        return (int) (j10 >>> 32);
    }

    public static int j(long j10) {
        return (int) j10;
    }

    public static long[] q(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] r(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final void A(int i10) {
        if (this.f23395e.length >= 1073741824) {
            this.f23398h = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f23397g)) + 1;
        int[] iArrR = r(i10);
        long[] jArr = this.f23396f;
        int length = iArrR.length - 1;
        for (int i12 = 0; i12 < this.f23393c; i12++) {
            int iH = h(jArr[i12]);
            int i13 = iH & length;
            int i14 = iArrR[i13];
            iArrR[i13] = i12;
            jArr[i12] = (((long) iH) << 32) | (((long) i14) & 4294967295L);
        }
        this.f23398h = i11;
        this.f23395e = iArrR;
    }

    public void B(int i10, int i11) {
        y7.l.k(i10, this.f23393c);
        this.f23392b[i10] = i11;
    }

    public int C() {
        return this.f23393c;
    }

    public void a() {
        this.f23394d++;
        Arrays.fill(this.f23391a, 0, this.f23393c, (Object) null);
        Arrays.fill(this.f23392b, 0, this.f23393c, 0);
        Arrays.fill(this.f23395e, -1);
        Arrays.fill(this.f23396f, -1L);
        this.f23393c = 0;
    }

    public void d(int i10) {
        if (i10 > this.f23396f.length) {
            y(i10);
        }
        if (i10 >= this.f23398h) {
            A(Math.max(2, Integer.highestOneBit(i10 - 1) << 1));
        }
    }

    public int e() {
        return this.f23393c == 0 ? -1 : 0;
    }

    public int f(Object obj) {
        int iM = m(obj);
        if (iM == -1) {
            return 0;
        }
        return this.f23392b[iM];
    }

    public b2.a<K> g(int i10) {
        y7.l.k(i10, this.f23393c);
        return new a(i10);
    }

    public K i(int i10) {
        y7.l.k(i10, this.f23393c);
        return (K) this.f23391a[i10];
    }

    public int k(int i10) {
        y7.l.k(i10, this.f23393c);
        return this.f23392b[i10];
    }

    public final int l() {
        return this.f23395e.length - 1;
    }

    public int m(Object obj) {
        int iC = v1.c(obj);
        int iJ = this.f23395e[l() & iC];
        while (iJ != -1) {
            long j10 = this.f23396f[iJ];
            if (h(j10) == iC && y7.i.a(obj, this.f23391a[iJ])) {
                return iJ;
            }
            iJ = j(j10);
        }
        return -1;
    }

    public void n(int i10, float f10) {
        y7.l.e(i10 >= 0, "Initial capacity must be non-negative");
        y7.l.e(f10 > 0.0f, "Illegal load factor");
        int iA = v1.a(i10, f10);
        this.f23395e = r(iA);
        this.f23397g = f10;
        this.f23391a = new Object[i10];
        this.f23392b = new int[i10];
        this.f23396f = q(i10);
        this.f23398h = Math.max(1, (int) (iA * f10));
    }

    public void o(int i10, K k10, int i11, int i12) {
        this.f23396f[i10] = (((long) i12) << 32) | 4294967295L;
        this.f23391a[i10] = k10;
        this.f23392b[i10] = i11;
    }

    public void p(int i10) {
        int iC = C() - 1;
        if (i10 >= iC) {
            this.f23391a[i10] = null;
            this.f23392b[i10] = 0;
            this.f23396f[i10] = -1;
            return;
        }
        Object[] objArr = this.f23391a;
        objArr[i10] = objArr[iC];
        int[] iArr = this.f23392b;
        iArr[i10] = iArr[iC];
        objArr[iC] = null;
        iArr[iC] = 0;
        long[] jArr = this.f23396f;
        long j10 = jArr[iC];
        jArr[i10] = j10;
        jArr[iC] = -1;
        int iH = h(j10) & l();
        int[] iArr2 = this.f23395e;
        int i11 = iArr2[iH];
        if (i11 == iC) {
            iArr2[iH] = i10;
            return;
        }
        while (true) {
            long j11 = this.f23396f[i11];
            int iJ = j(j11);
            if (iJ == iC) {
                this.f23396f[i11] = D(j11, i10);
                return;
            }
            i11 = iJ;
        }
    }

    public int s(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f23393c) {
            return i11;
        }
        return -1;
    }

    public int t(int i10, int i11) {
        return i10 - 1;
    }

    public int u(K k10, int i10) {
        j1.d(i10, "count");
        long[] jArr = this.f23396f;
        Object[] objArr = this.f23391a;
        int[] iArr = this.f23392b;
        int iC = v1.c(k10);
        int iL = l() & iC;
        int i11 = this.f23393c;
        int[] iArr2 = this.f23395e;
        int i12 = iArr2[iL];
        if (i12 == -1) {
            iArr2[iL] = i11;
        } else {
            while (true) {
                long j10 = jArr[i12];
                if (h(j10) == iC && y7.i.a(k10, objArr[i12])) {
                    int i13 = iArr[i12];
                    iArr[i12] = i10;
                    return i13;
                }
                int iJ = j(j10);
                if (iJ == -1) {
                    jArr[i12] = D(j10, i11);
                    break;
                }
                i12 = iJ;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i14 = i11 + 1;
        z(i14);
        o(i11, k10, i10, iC);
        this.f23393c = i14;
        if (i11 >= this.f23398h) {
            A(this.f23395e.length * 2);
        }
        this.f23394d++;
        return 0;
    }

    public int v(Object obj) {
        return w(obj, v1.c(obj));
    }

    public final int w(Object obj, int i10) {
        int iL = l() & i10;
        int i11 = this.f23395e[iL];
        if (i11 == -1) {
            return 0;
        }
        int i12 = -1;
        while (true) {
            if (h(this.f23396f[i11]) == i10 && y7.i.a(obj, this.f23391a[i11])) {
                int i13 = this.f23392b[i11];
                if (i12 == -1) {
                    this.f23395e[iL] = j(this.f23396f[i11]);
                } else {
                    long[] jArr = this.f23396f;
                    jArr[i12] = D(jArr[i12], j(jArr[i11]));
                }
                p(i11);
                this.f23393c--;
                this.f23394d++;
                return i13;
            }
            int iJ = j(this.f23396f[i11]);
            if (iJ == -1) {
                return 0;
            }
            i12 = i11;
            i11 = iJ;
        }
    }

    public int x(int i10) {
        return w(this.f23391a[i10], h(this.f23396f[i10]));
    }

    public void y(int i10) {
        this.f23391a = Arrays.copyOf(this.f23391a, i10);
        this.f23392b = Arrays.copyOf(this.f23392b, i10);
        long[] jArr = this.f23396f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f23396f = jArrCopyOf;
    }

    public final void z(int i10) {
        int length = this.f23396f.length;
        if (i10 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                y(iMax);
            }
        }
    }
}
