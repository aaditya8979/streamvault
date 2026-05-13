package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C3978d4;
import com.ironsource.Q6;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 1)
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f47422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f47423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f47424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f47426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f47427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f47428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f47429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f47430i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f47431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f47432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final String f47433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f47434m;

    public i0(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z10, @NotNull String str4, @NotNull String str5, int i10, @NotNull String str6, @NotNull String str7, float f10, long j10, @NotNull String str8, @NotNull String str9) {
        tn.p.k(str, CommonUrlParts.MANUFACTURER);
        tn.p.k(str2, "model");
        tn.p.k(str3, "hwVersion");
        tn.p.k(str4, Q6.F);
        tn.p.k(str5, "osVersion");
        tn.p.k(str6, "language");
        tn.p.k(str7, C3978d4.j.f31411r);
        tn.p.k(str8, "hardware");
        tn.p.k(str9, "brand");
        this.f47422a = str;
        this.f47423b = str2;
        this.f47424c = str3;
        this.f47425d = z10;
        this.f47426e = str4;
        this.f47427f = str5;
        this.f47428g = i10;
        this.f47429h = str6;
        this.f47430i = str7;
        this.f47431j = f10;
        this.f47432k = j10;
        this.f47433l = str8;
        this.f47434m = str9;
    }

    @NotNull
    public final String a() {
        return this.f47434m;
    }

    public final long b() {
        return this.f47432k;
    }

    @NotNull
    public final String c() {
        return this.f47433l;
    }

    @NotNull
    public final String d() {
        return this.f47424c;
    }

    @NotNull
    public final String e() {
        return this.f47429h;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return tn.p.f(this.f47422a, i0Var.f47422a) && tn.p.f(this.f47423b, i0Var.f47423b) && tn.p.f(this.f47424c, i0Var.f47424c) && this.f47425d == i0Var.f47425d && tn.p.f(this.f47426e, i0Var.f47426e) && tn.p.f(this.f47427f, i0Var.f47427f) && this.f47428g == i0Var.f47428g && tn.p.f(this.f47429h, i0Var.f47429h) && tn.p.f(this.f47430i, i0Var.f47430i) && Float.compare(this.f47431j, i0Var.f47431j) == 0 && this.f47432k == i0Var.f47432k && tn.p.f(this.f47433l, i0Var.f47433l) && tn.p.f(this.f47434m, i0Var.f47434m);
    }

    @NotNull
    public final String f() {
        return this.f47422a;
    }

    @NotNull
    public final String g() {
        return this.f47430i;
    }

    @NotNull
    public final String h() {
        return this.f47423b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f47422a.hashCode() * 31) + this.f47423b.hashCode()) * 31) + this.f47424c.hashCode()) * 31) + Boolean.hashCode(this.f47425d)) * 31) + this.f47426e.hashCode()) * 31) + this.f47427f.hashCode()) * 31) + Integer.hashCode(this.f47428g)) * 31) + this.f47429h.hashCode()) * 31) + this.f47430i.hashCode()) * 31) + Float.hashCode(this.f47431j)) * 31) + Long.hashCode(this.f47432k)) * 31) + this.f47433l.hashCode()) * 31) + this.f47434m.hashCode();
    }

    @NotNull
    public final String i() {
        return this.f47426e;
    }

    @NotNull
    public final String j() {
        return this.f47427f;
    }

    public final float k() {
        return this.f47431j;
    }

    public final boolean l() {
        return this.f47425d;
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(manufacturer=" + this.f47422a + ", model=" + this.f47423b + ", hwVersion=" + this.f47424c + ", isTablet=" + this.f47425d + ", os=" + this.f47426e + ", osVersion=" + this.f47427f + ", apiLevel=" + this.f47428g + ", language=" + this.f47429h + ", mobileCarrier=" + this.f47430i + ", screenDensity=" + this.f47431j + ", dbtMs=" + this.f47432k + ", hardware=" + this.f47433l + ", brand=" + this.f47434m + ')';
    }
}
