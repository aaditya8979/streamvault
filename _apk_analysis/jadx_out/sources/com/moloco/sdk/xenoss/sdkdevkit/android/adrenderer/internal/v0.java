package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f49294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final r0 f49295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final p0 f49296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final u0 f49297d;

    public v0(@Nullable Integer num, @Nullable r0 r0Var, @Nullable p0 p0Var, @Nullable u0 u0Var) {
        this.f49294a = num;
        this.f49295b = r0Var;
        this.f49296c = p0Var;
        this.f49297d = u0Var;
    }

    @Nullable
    public final Integer a() {
        return this.f49294a;
    }

    @Nullable
    public final p0 b() {
        return this.f49296c;
    }

    @Nullable
    public final r0 c() {
        return this.f49295b;
    }

    @Nullable
    public final u0 d() {
        return this.f49297d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return tn.p.f(this.f49294a, v0Var.f49294a) && tn.p.f(this.f49295b, v0Var.f49295b) && tn.p.f(this.f49296c, v0Var.f49296c) && tn.p.f(this.f49297d, v0Var.f49297d);
    }

    public int hashCode() {
        Integer num = this.f49294a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        r0 r0Var = this.f49295b;
        int iHashCode2 = (iHashCode + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
        p0 p0Var = this.f49296c;
        int iHashCode3 = (iHashCode2 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        u0 u0Var = this.f49297d;
        return iHashCode3 + (u0Var != null ? u0Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECRenderingData(appNameFontSize=" + this.f49294a + ", decCTA=" + this.f49295b + ", decAppIcon=" + this.f49296c + ", decRating=" + this.f49297d + ')';
    }
}
