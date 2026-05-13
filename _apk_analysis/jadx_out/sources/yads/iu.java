package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class iu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m73 f90985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f90988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f90990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f90991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f90992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f90993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f90994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f90995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f90996l;

    public iu(int i10, int i11, long j10, int i12, m73 m73Var) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        ni.a(z10);
        this.f90988d = j10;
        this.f90989e = i12;
        this.f90985a = m73Var;
        this.f90986b = a(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f90987c = i11 == 2 ? a(i10, 1650720768) : -1;
        this.f90995k = new long[512];
        this.f90996l = new int[512];
    }

    public static int a(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    public final void a() {
        this.f90995k = Arrays.copyOf(this.f90995k, this.f90994j);
        this.f90996l = Arrays.copyOf(this.f90996l, this.f90994j);
    }

    public final void a(long j10) {
        if (this.f90994j == this.f90996l.length) {
            long[] jArr = this.f90995k;
            this.f90995k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f90996l;
            this.f90996l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f90995k;
        int i10 = this.f90994j;
        jArr2[i10] = j10;
        this.f90996l[i10] = this.f90993i;
        this.f90994j = i10 + 1;
    }

    public final tw2 b(long j10) {
        long j11 = 1;
        int i10 = (int) (j10 / ((this.f90988d * j11) / ((long) this.f90989e)));
        int iA = ib3.a(this.f90996l, i10, true, true);
        int[] iArr = this.f90996l;
        int i11 = iArr[iA];
        if (i11 == i10) {
            xw2 xw2Var = new xw2(((this.f90988d * j11) / ((long) this.f90989e)) * ((long) i11), this.f90995k[iA]);
            return new tw2(xw2Var, xw2Var);
        }
        long j12 = i11;
        long j13 = (this.f90988d * j11) / ((long) this.f90989e);
        long[] jArr = this.f90995k;
        xw2 xw2Var2 = new xw2(j12 * j13, jArr[iA]);
        int i12 = iA + 1;
        return i12 < jArr.length ? new tw2(xw2Var2, new xw2(j13 * ((long) iArr[i12]), jArr[i12])) : new tw2(xw2Var2, xw2Var2);
    }
}
