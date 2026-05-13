package yads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class fy extends hy {
    public static hy a(int i10) {
        return i10 < 0 ? hy.f90592b : i10 > 0 ? hy.f90593c : hy.f90591a;
    }

    @Override // yads.hy
    public final int a() {
        return 0;
    }

    @Override // yads.hy
    public final hy a(int i10, int i11) {
        return a(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
    }

    @Override // yads.hy
    public final hy a(long j10, long j11) {
        return a(j10 < j11 ? -1 : j10 > j11 ? 1 : 0);
    }

    @Override // yads.hy
    public final hy a(Object obj, Object obj2, Comparator comparator) {
        return a(comparator.compare(obj, obj2));
    }

    @Override // yads.hy
    public final hy a(boolean z10, boolean z11) {
        return a(lq.a(z10, z11));
    }

    @Override // yads.hy
    public final hy b(boolean z10, boolean z11) {
        return a(lq.a(z11, z10));
    }
}
