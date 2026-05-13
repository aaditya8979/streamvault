package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class pg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f33257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33259c;

    public pg(boolean z10, boolean z11, boolean z12) {
        this.f33257a = z10;
        this.f33258b = z11;
        this.f33259c = z12;
    }

    public static /* synthetic */ pg a(pg pgVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = pgVar.f33257a;
        }
        if ((i10 & 2) != 0) {
            z11 = pgVar.f33258b;
        }
        if ((i10 & 4) != 0) {
            z12 = pgVar.f33259c;
        }
        return pgVar.a(z10, z11, z12);
    }

    @NotNull
    public final pg a(boolean z10, boolean z11, boolean z12) {
        return new pg(z10, z11, z12);
    }

    public final boolean a() {
        return this.f33257a;
    }

    public final boolean b() {
        return this.f33258b;
    }

    public final boolean c() {
        return this.f33259c;
    }

    public final boolean d() {
        return this.f33259c;
    }

    public final boolean e() {
        return this.f33257a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg)) {
            return false;
        }
        pg pgVar = (pg) obj;
        return this.f33257a == pgVar.f33257a && this.f33258b == pgVar.f33258b && this.f33259c == pgVar.f33259c;
    }

    public final boolean f() {
        return this.f33258b;
    }

    @NotNull
    public final JSONObject g() throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put(C4089j8.f32054k, this.f33257a).put(C4089j8.f32055l, this.f33258b).put(C4089j8.f32056m, this.f33259c);
        tn.p.j(jSONObjectPut, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return jSONObjectPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z10 = this.f33257a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.f33258b;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        int i11 = (i10 + r22) * 31;
        boolean z12 = this.f33259c;
        return i11 + (z12 ? 1 : z12);
    }

    @NotNull
    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f33257a + ", isWindowVisible=" + this.f33258b + ", isShown=" + this.f33259c + ")";
    }
}
