package i6;

import i6.z;
import s7.m0;

/* JADX INFO: compiled from: IndexSeekMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f63940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f63941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f63942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f63943d;

    public x(long[] jArr, long[] jArr2, long j10) {
        s7.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f63943d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f63940a = jArr;
            this.f63941b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f63940a = jArr3;
            long[] jArr4 = new long[i10];
            this.f63941b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f63942c = j10;
    }

    @Override // i6.z
    public long getDurationUs() {
        return this.f63942c;
    }

    @Override // i6.z
    public z.a getSeekPoints(long j10) {
        if (!this.f63943d) {
            return new z.a(a0.f63837c);
        }
        int i10 = m0.i(this.f63941b, j10, true, true);
        a0 a0Var = new a0(this.f63941b[i10], this.f63940a[i10]);
        if (a0Var.f63838a == j10 || i10 == this.f63941b.length - 1) {
            return new z.a(a0Var);
        }
        int i11 = i10 + 1;
        return new z.a(a0Var, new a0(this.f63941b[i11], this.f63940a[i11]));
    }

    @Override // i6.z
    public boolean isSeekable() {
        return this.f63943d;
    }
}
