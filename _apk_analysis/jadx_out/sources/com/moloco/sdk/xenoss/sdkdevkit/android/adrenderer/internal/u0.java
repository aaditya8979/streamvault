package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Float f48860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f48861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f48862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48864e;

    public u0(@Nullable Float f10, @NotNull String str, @NotNull String str2, int i10, int i11) {
        tn.p.k(str, "foregroundColor");
        tn.p.k(str2, "backgroundColor");
        this.f48860a = f10;
        this.f48861b = str;
        this.f48862c = str2;
        this.f48863d = i10;
        this.f48864e = i11;
    }

    @NotNull
    public final String a() {
        return this.f48862c;
    }

    public final int b() {
        return this.f48864e;
    }

    @NotNull
    public final String c() {
        return this.f48861b;
    }

    public final int d() {
        return this.f48863d;
    }

    @Nullable
    public final Float e() {
        return this.f48860a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return tn.p.f(this.f48860a, u0Var.f48860a) && tn.p.f(this.f48861b, u0Var.f48861b) && tn.p.f(this.f48862c, u0Var.f48862c) && this.f48863d == u0Var.f48863d && this.f48864e == u0Var.f48864e;
    }

    public int hashCode() {
        Float f10 = this.f48860a;
        return ((((((((f10 == null ? 0 : f10.hashCode()) * 31) + this.f48861b.hashCode()) * 31) + this.f48862c.hashCode()) * 31) + Integer.hashCode(this.f48863d)) * 31) + Integer.hashCode(this.f48864e);
    }

    @NotNull
    public String toString() {
        return "DECRating(value=" + this.f48860a + ", foregroundColor=" + this.f48861b + ", backgroundColor=" + this.f48862c + ", size=" + this.f48863d + ", fontSize=" + this.f48864e + ')';
    }
}
