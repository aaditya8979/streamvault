package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class M3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final O3 f29831b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29832a;

        static {
            int[] iArr = new int[O3.values().length];
            try {
                iArr[O3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29832a = iArr;
        }
    }

    public M3(boolean z10, @Nullable O3 o32) {
        this.f29830a = z10;
        this.f29831b = o32;
    }

    public /* synthetic */ M3(boolean z10, O3 o32, int i10, tn.i iVar) {
        this(z10, (i10 & 2) != 0 ? null : o32);
    }

    public static /* synthetic */ M3 a(M3 m32, boolean z10, O3 o32, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = m32.f29830a;
        }
        if ((i10 & 2) != 0) {
            o32 = m32.f29831b;
        }
        return m32.a(z10, o32);
    }

    @NotNull
    public final M3 a(boolean z10, @Nullable O3 o32) {
        return new M3(z10, o32);
    }

    public final boolean a() {
        return this.f29830a;
    }

    @Nullable
    public final O3 b() {
        return this.f29831b;
    }

    @Nullable
    public final O3 c() {
        return this.f29831b;
    }

    public final boolean d() {
        return this.f29830a;
    }

    @Nullable
    public final String e() {
        O3 o32 = this.f29831b;
        int i10 = o32 == null ? -1 : a.f29832a[o32.ordinal()];
        if (i10 == 1) {
            return "Placement delivery is false";
        }
        if (i10 == 2) {
            return "In pacing mode";
        }
        if (i10 != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M3)) {
            return false;
        }
        M3 m32 = (M3) obj;
        return this.f29830a == m32.f29830a && this.f29831b == m32.f29831b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z10 = this.f29830a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        O3 o32 = this.f29831b;
        return i10 + (o32 == null ? 0 : o32.hashCode());
    }

    @NotNull
    public String toString() {
        return "CappingStatus(isCapped=" + this.f29830a + " reason=" + this.f29831b + ")";
    }
}
