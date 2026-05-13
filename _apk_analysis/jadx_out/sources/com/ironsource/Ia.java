package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f29633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f29634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29635c;

    public Ia(long j10, long j11, boolean z10) {
        this.f29633a = j10;
        this.f29634b = j11;
        this.f29635c = z10;
    }

    public static /* synthetic */ Ia a(Ia ia2, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = ia2.f29633a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = ia2.f29634b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            z10 = ia2.f29635c;
        }
        return ia2.a(j12, j13, z10);
    }

    public final long a() {
        return this.f29633a;
    }

    @NotNull
    public final Ia a(long j10, long j11, boolean z10) {
        return new Ia(j10, j11, z10);
    }

    public final long b() {
        return this.f29634b;
    }

    public final boolean c() {
        return this.f29635c;
    }

    public final long d() {
        return this.f29633a;
    }

    public final long e() {
        return this.f29634b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ia)) {
            return false;
        }
        Ia ia2 = (Ia) obj;
        return this.f29633a == ia2.f29633a && this.f29634b == ia2.f29634b && this.f29635c == ia2.f29635c;
    }

    public final boolean f() {
        return this.f29635c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.f29633a) * 31) + Long.hashCode(this.f29634b)) * 31;
        boolean z10 = this.f29635c;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    @NotNull
    public String toString() {
        return "LevelPlayBannerReloadAdUnitStrategyConfig(refreshInterval=" + this.f29633a + ", visibilityCheckerInterval=" + this.f29634b + ", isAutoRefreshEnabled=" + this.f29635c + ")";
    }
}
