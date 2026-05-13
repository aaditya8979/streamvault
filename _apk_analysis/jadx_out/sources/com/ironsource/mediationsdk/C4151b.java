package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4151b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u.d f32362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f32363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f32365d;

    public C4151b(@NotNull u.d dVar, boolean z10, boolean z11, boolean z12) {
        tn.p.k(dVar, "sdkState");
        this.f32362a = dVar;
        this.f32363b = z10;
        this.f32364c = z11;
        this.f32365d = z12;
    }

    public static /* synthetic */ C4151b a(C4151b c4151b, u.d dVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = c4151b.f32362a;
        }
        if ((i10 & 2) != 0) {
            z10 = c4151b.f32363b;
        }
        if ((i10 & 4) != 0) {
            z11 = c4151b.f32364c;
        }
        if ((i10 & 8) != 0) {
            z12 = c4151b.f32365d;
        }
        return c4151b.a(dVar, z10, z11, z12);
    }

    @NotNull
    public final C4151b a(@NotNull u.d dVar, boolean z10, boolean z11, boolean z12) {
        tn.p.k(dVar, "sdkState");
        return new C4151b(dVar, z10, z11, z12);
    }

    @NotNull
    public final u.d a() {
        return this.f32362a;
    }

    public final boolean b() {
        return this.f32363b;
    }

    public final boolean c() {
        return this.f32364c;
    }

    public final boolean d() {
        return this.f32365d;
    }

    @NotNull
    public final u.d e() {
        return this.f32362a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4151b)) {
            return false;
        }
        C4151b c4151b = (C4151b) obj;
        return this.f32362a == c4151b.f32362a && this.f32363b == c4151b.f32363b && this.f32364c == c4151b.f32364c && this.f32365d == c4151b.f32365d;
    }

    public final boolean f() {
        return this.f32365d;
    }

    public final boolean g() {
        return this.f32364c;
    }

    public final boolean h() {
        return this.f32363b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.f32362a.hashCode() * 31;
        boolean z10 = this.f32363b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode + r12) * 31;
        boolean z11 = this.f32364c;
        ?? r13 = z11;
        if (z11) {
            r13 = 1;
        }
        int i11 = (i10 + r13) * 31;
        boolean z12 = this.f32365d;
        return i11 + (z12 ? 1 : z12);
    }

    @NotNull
    public String toString() {
        return "AdUnitInitStateInfo(sdkState=" + this.f32362a + ", isRetryForMoreThan15Secs=" + this.f32363b + ", isDemandOnlyInitRequested=" + this.f32364c + ", isAdUnitInitRequested=" + this.f32365d + ")";
    }
}
