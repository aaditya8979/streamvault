package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC4200p9 f29129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f29130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f29131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f29133e;

    public Db(@NotNull EnumC4200p9 enumC4200p9, @NotNull String str, long j10, boolean z10, boolean z11) {
        tn.p.k(enumC4200p9, "instanceType");
        tn.p.k(str, "adSourceNameForEvents");
        this.f29129a = enumC4200p9;
        this.f29130b = str;
        this.f29131c = j10;
        this.f29132d = z10;
        this.f29133e = z11;
    }

    public /* synthetic */ Db(EnumC4200p9 enumC4200p9, String str, long j10, boolean z10, boolean z11, int i10, tn.i iVar) {
        this(enumC4200p9, str, j10, z10, (i10 & 16) != 0 ? true : z11);
    }

    public static /* synthetic */ Db a(Db db2, EnumC4200p9 enumC4200p9, String str, long j10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC4200p9 = db2.f29129a;
        }
        if ((i10 & 2) != 0) {
            str = db2.f29130b;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            j10 = db2.f29131c;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            z10 = db2.f29132d;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = db2.f29133e;
        }
        return db2.a(enumC4200p9, str2, j11, z12, z11);
    }

    @NotNull
    public final Db a(@NotNull EnumC4200p9 enumC4200p9, @NotNull String str, long j10, boolean z10, boolean z11) {
        tn.p.k(enumC4200p9, "instanceType");
        tn.p.k(str, "adSourceNameForEvents");
        return new Db(enumC4200p9, str, j10, z10, z11);
    }

    @NotNull
    public final EnumC4200p9 a() {
        return this.f29129a;
    }

    @NotNull
    public final String b() {
        return this.f29130b;
    }

    public final long c() {
        return this.f29131c;
    }

    public final boolean d() {
        return this.f29132d;
    }

    public final boolean e() {
        return this.f29133e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Db)) {
            return false;
        }
        Db db2 = (Db) obj;
        return this.f29129a == db2.f29129a && tn.p.f(this.f29130b, db2.f29130b) && this.f29131c == db2.f29131c && this.f29132d == db2.f29132d && this.f29133e == db2.f29133e;
    }

    @NotNull
    public final String f() {
        return this.f29130b;
    }

    @NotNull
    public final EnumC4200p9 g() {
        return this.f29129a;
    }

    public final long h() {
        return this.f29131c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.f29129a.hashCode() * 31) + this.f29130b.hashCode()) * 31) + Long.hashCode(this.f29131c)) * 31;
        boolean z10 = this.f29132d;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode + r12) * 31;
        boolean z11 = this.f29133e;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean i() {
        return this.f29133e;
    }

    public final boolean j() {
        return this.f29132d;
    }

    @NotNull
    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f29129a + ", adSourceNameForEvents=" + this.f29130b + ", loadTimeoutInMills=" + this.f29131c + ", isOneFlow=" + this.f29132d + ", isMultipleAdObjects=" + this.f29133e + ")";
    }
}
