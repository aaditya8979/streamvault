package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f48498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f48499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f48500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f48501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f48502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f48503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final r0 f48504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final p0 f48505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final u0 f48506i;

    public o0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable r0 r0Var, @Nullable p0 p0Var, @Nullable u0 u0Var) {
        this.f48498a = str;
        this.f48499b = str2;
        this.f48500c = str3;
        this.f48501d = str4;
        this.f48502e = str5;
        this.f48503f = num;
        this.f48504g = r0Var;
        this.f48505h = p0Var;
        this.f48506i = u0Var;
    }

    @NotNull
    public final o0 b(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable r0 r0Var, @Nullable p0 p0Var, @Nullable u0 u0Var) {
        return new o0(str, str2, str3, str4, str5, num, r0Var, p0Var, u0Var);
    }

    @Nullable
    public final String c() {
        return this.f48498a;
    }

    @Nullable
    public final Integer d() {
        return this.f48503f;
    }

    @Nullable
    public final String e() {
        return this.f48500c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return tn.p.f(this.f48498a, o0Var.f48498a) && tn.p.f(this.f48499b, o0Var.f48499b) && tn.p.f(this.f48500c, o0Var.f48500c) && tn.p.f(this.f48501d, o0Var.f48501d) && tn.p.f(this.f48502e, o0Var.f48502e) && tn.p.f(this.f48503f, o0Var.f48503f) && tn.p.f(this.f48504g, o0Var.f48504g) && tn.p.f(this.f48505h, o0Var.f48505h) && tn.p.f(this.f48506i, o0Var.f48506i);
    }

    @Nullable
    public final String f() {
        return this.f48499b;
    }

    @Nullable
    public final p0 g() {
        return this.f48505h;
    }

    @Nullable
    public final r0 h() {
        return this.f48504g;
    }

    public int hashCode() {
        String str = this.f48498a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f48499b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48500c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f48501d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f48502e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f48503f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        r0 r0Var = this.f48504g;
        int iHashCode7 = (iHashCode6 + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
        p0 p0Var = this.f48505h;
        int iHashCode8 = (iHashCode7 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        u0 u0Var = this.f48506i;
        return iHashCode8 + (u0Var != null ? u0Var.hashCode() : 0);
    }

    @Nullable
    public final u0 i() {
        return this.f48506i;
    }

    @Nullable
    public final String j() {
        return this.f48501d;
    }

    @Nullable
    public final String k() {
        return this.f48502e;
    }

    @NotNull
    public String toString() {
        return "DEC(appName=" + this.f48498a + ", ctaUrl=" + this.f48499b + ", ctaTrackingUrl=" + this.f48500c + ", impressionTrackingUrl=" + this.f48501d + ", skipToDECTrackingUrl=" + this.f48502e + ", appNameFontSize=" + this.f48503f + ", decCta=" + this.f48504g + ", decAppIcon=" + this.f48505h + ", decRating=" + this.f48506i + ')';
    }
}
