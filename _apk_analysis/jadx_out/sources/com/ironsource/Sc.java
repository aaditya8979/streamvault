package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f30417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30418b;

    /* JADX WARN: Multi-variable type inference failed */
    public Sc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public Sc(boolean z10, int i10) {
        this.f30417a = z10;
        this.f30418b = i10;
    }

    public /* synthetic */ Sc(boolean z10, int i10, int i11, tn.i iVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 805306368 : i10);
    }

    public static /* synthetic */ Sc a(Sc sc2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = sc2.f30417a;
        }
        if ((i11 & 2) != 0) {
            i10 = sc2.f30418b;
        }
        return sc2.a(z10, i10);
    }

    @NotNull
    public final Sc a(boolean z10, int i10) {
        return new Sc(z10, i10);
    }

    public final boolean a() {
        return this.f30417a;
    }

    public final int b() {
        return this.f30418b;
    }

    public final int c() {
        return this.f30418b;
    }

    public final boolean d() {
        return this.f30417a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sc)) {
            return false;
        }
        Sc sc2 = (Sc) obj;
        return this.f30417a == sc2.f30417a && this.f30418b == sc2.f30418b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f30417a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        return (r02 * 31) + Integer.hashCode(this.f30418b);
    }

    @NotNull
    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f30417a + ", flags=" + this.f30418b + ")";
    }
}
