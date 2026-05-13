package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f48512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f48513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f48514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f48515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final q0 f48516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f48517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f48518g;

    public r0(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable q0 q0Var, @Nullable String str2, @Nullable String str3) {
        this.f48512a = num;
        this.f48513b = str;
        this.f48514c = num2;
        this.f48515d = num3;
        this.f48516e = q0Var;
        this.f48517f = str2;
        this.f48518g = str3;
    }

    @Nullable
    public final String a() {
        return this.f48518g;
    }

    @Nullable
    public final q0 b() {
        return this.f48516e;
    }

    @Nullable
    public final Integer c() {
        return this.f48514c;
    }

    @Nullable
    public final String d() {
        return this.f48513b;
    }

    @Nullable
    public final Integer e() {
        return this.f48515d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return tn.p.f(this.f48512a, r0Var.f48512a) && tn.p.f(this.f48513b, r0Var.f48513b) && tn.p.f(this.f48514c, r0Var.f48514c) && tn.p.f(this.f48515d, r0Var.f48515d) && tn.p.f(this.f48516e, r0Var.f48516e) && tn.p.f(this.f48517f, r0Var.f48517f) && tn.p.f(this.f48518g, r0Var.f48518g);
    }

    @Nullable
    public final String f() {
        return this.f48517f;
    }

    @Nullable
    public final Integer g() {
        return this.f48512a;
    }

    public int hashCode() {
        Integer num = this.f48512a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f48513b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f48514c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f48515d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        q0 q0Var = this.f48516e;
        int iHashCode5 = (iHashCode4 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        String str2 = this.f48517f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48518g;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECCta(verticalSpacing=" + this.f48512a + ", ctaText=" + this.f48513b + ", buttonWidth=" + this.f48514c + ", fontSize=" + this.f48515d + ", border=" + this.f48516e + ", foregroundColor=" + this.f48517f + ", backgroundColor=" + this.f48518g + ')';
    }
}
