package com.ironsource;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4005ed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f31587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private int[] f31590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private int[] f31591f;

    public C4005ed() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public C4005ed(boolean z10, @NotNull String str, boolean z11, int i10, @Nullable int[] iArr, @Nullable int[] iArr2) {
        tn.p.k(str, Ne.f29915b1);
        this.f31586a = z10;
        this.f31587b = str;
        this.f31588c = z11;
        this.f31589d = i10;
        this.f31590e = iArr;
        this.f31591f = iArr2;
    }

    public /* synthetic */ C4005ed(boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, tn.i iVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? C4023fd.f31702a : str, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? -1 : i10, (i11 & 16) != 0 ? null : iArr, (i11 & 32) != 0 ? null : iArr2);
    }

    public static /* synthetic */ C4005ed a(C4005ed c4005ed, boolean z10, String str, boolean z11, int i10, int[] iArr, int[] iArr2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = c4005ed.f31586a;
        }
        if ((i11 & 2) != 0) {
            str = c4005ed.f31587b;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z11 = c4005ed.f31588c;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            i10 = c4005ed.f31589d;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            iArr = c4005ed.f31590e;
        }
        int[] iArr3 = iArr;
        if ((i11 & 32) != 0) {
            iArr2 = c4005ed.f31591f;
        }
        return c4005ed.a(z10, str2, z12, i12, iArr3, iArr2);
    }

    @NotNull
    public final C4005ed a(boolean z10, @NotNull String str, boolean z11, int i10, @Nullable int[] iArr, @Nullable int[] iArr2) {
        tn.p.k(str, Ne.f29915b1);
        return new C4005ed(z10, str, z11, i10, iArr, iArr2);
    }

    public final void a(int i10) {
        this.f31589d = i10;
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f31587b = str;
    }

    public final void a(boolean z10) {
        this.f31588c = z10;
    }

    public final void a(@Nullable int[] iArr) {
        this.f31591f = iArr;
    }

    public final boolean a() {
        return this.f31586a;
    }

    @NotNull
    public final String b() {
        return this.f31587b;
    }

    public final void b(boolean z10) {
        this.f31586a = z10;
    }

    public final void b(@Nullable int[] iArr) {
        this.f31590e = iArr;
    }

    public final boolean c() {
        return this.f31588c;
    }

    public final int d() {
        return this.f31589d;
    }

    @Nullable
    public final int[] e() {
        return this.f31590e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4005ed)) {
            return false;
        }
        C4005ed c4005ed = (C4005ed) obj;
        return this.f31586a == c4005ed.f31586a && tn.p.f(this.f31587b, c4005ed.f31587b) && this.f31588c == c4005ed.f31588c && this.f31589d == c4005ed.f31589d && tn.p.f(this.f31590e, c4005ed.f31590e) && tn.p.f(this.f31591f, c4005ed.f31591f);
    }

    @Nullable
    public final int[] f() {
        return this.f31591f;
    }

    public final boolean g() {
        return this.f31588c;
    }

    public final int h() {
        return this.f31589d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        boolean z10 = this.f31586a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int iHashCode = ((r02 * 31) + this.f31587b.hashCode()) * 31;
        boolean z11 = this.f31588c;
        int iHashCode2 = (((iHashCode + (z11 ? 1 : z11)) * 31) + Integer.hashCode(this.f31589d)) * 31;
        int[] iArr = this.f31590e;
        int iHashCode3 = (iHashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f31591f;
        return iHashCode3 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f31586a;
    }

    @NotNull
    public final String j() {
        return this.f31587b;
    }

    @Nullable
    public final int[] k() {
        return this.f31591f;
    }

    @Nullable
    public final int[] l() {
        return this.f31590e;
    }

    @NotNull
    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f31586a + ", pixelEventsUrl=" + this.f31587b + ", pixelEventsCompression=" + this.f31588c + ", pixelEventsCompressionLevel=" + this.f31589d + ", pixelOptOut=" + Arrays.toString(this.f31590e) + ", pixelOptIn=" + Arrays.toString(this.f31591f) + ")";
    }
}
