package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f49900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f49901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f49902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f49903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final t f49904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Long f49905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final o f49906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final List<String> f49907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a0 f49908i;

    public n(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable t tVar, @Nullable Long l10, @Nullable o oVar, @NotNull List<String> list, @NotNull a0 a0Var) {
        tn.p.k(list, "viewTrackingUrlList");
        tn.p.k(a0Var, "resource");
        this.f49900a = str;
        this.f49901b = num;
        this.f49902c = num2;
        this.f49903d = str2;
        this.f49904e = tVar;
        this.f49905f = l10;
        this.f49906g = oVar;
        this.f49907h = list;
        this.f49908i = a0Var;
    }

    @Nullable
    public final String a() {
        return this.f49903d;
    }

    @Nullable
    public final o b() {
        return this.f49906g;
    }

    @Nullable
    public final Long c() {
        return this.f49905f;
    }

    @Nullable
    public final Integer d() {
        return this.f49902c;
    }

    @Nullable
    public final t e() {
        return this.f49904e;
    }

    @NotNull
    public final a0 f() {
        return this.f49908i;
    }

    @NotNull
    public final List<String> g() {
        return this.f49907h;
    }

    @Nullable
    public final Integer h() {
        return this.f49901b;
    }
}
