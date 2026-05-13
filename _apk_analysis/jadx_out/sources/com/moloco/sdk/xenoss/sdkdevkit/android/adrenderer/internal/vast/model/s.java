package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f49928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f49929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f49931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f49932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f49933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f49934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Integer f49935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final Integer f49936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Integer f49937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Boolean f49938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final String f49939l;

    public s(@NotNull String str, @Nullable String str2, boolean z10, @NotNull String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable String str4, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable String str5) {
        tn.p.k(str, "mediaFileUrl");
        tn.p.k(str3, "type");
        this.f49928a = str;
        this.f49929b = str2;
        this.f49930c = z10;
        this.f49931d = str3;
        this.f49932e = num;
        this.f49933f = num2;
        this.f49934g = str4;
        this.f49935h = num3;
        this.f49936i = num4;
        this.f49937j = num5;
        this.f49938k = bool;
        this.f49939l = str5;
    }

    @Nullable
    public final String a() {
        return this.f49939l;
    }

    @Nullable
    public final Integer b() {
        return this.f49935h;
    }

    @Nullable
    public final Integer c() {
        return this.f49933f;
    }

    @Nullable
    public final Integer d() {
        return this.f49937j;
    }

    @NotNull
    public final String e() {
        return this.f49928a;
    }

    @Nullable
    public final Integer f() {
        return this.f49936i;
    }

    @NotNull
    public final String g() {
        return this.f49931d;
    }

    @Nullable
    public final Integer h() {
        return this.f49932e;
    }

    public final boolean i() {
        return this.f49930c;
    }
}
