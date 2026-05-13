package d6;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: SeekParameters.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f59714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x1 f59715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x1 f59716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x1 f59717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x1 f59718g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f59719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f59720b;

    static {
        x1 x1Var = new x1(0L, 0L);
        f59714c = x1Var;
        f59715d = new x1(Long.MAX_VALUE, Long.MAX_VALUE);
        f59716e = new x1(Long.MAX_VALUE, 0L);
        f59717f = new x1(0L, Long.MAX_VALUE);
        f59718g = x1Var;
    }

    public x1(long j10, long j11) {
        s7.a.a(j10 >= 0);
        s7.a.a(j11 >= 0);
        this.f59719a = j10;
        this.f59720b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f59719a;
        if (j13 == 0 && this.f59720b == 0) {
            return j10;
        }
        long jL0 = s7.m0.L0(j10, j13, Long.MIN_VALUE);
        long jB = s7.m0.b(j10, this.f59720b, Long.MAX_VALUE);
        boolean z10 = jL0 <= j11 && j11 <= jB;
        boolean z11 = jL0 <= j12 && j12 <= jB;
        return (z10 && z11) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z10 ? j11 : z11 ? j12 : jL0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x1.class != obj.getClass()) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.f59719a == x1Var.f59719a && this.f59720b == x1Var.f59720b;
    }

    public int hashCode() {
        return (((int) this.f59719a) * 31) + ((int) this.f59720b);
    }
}
