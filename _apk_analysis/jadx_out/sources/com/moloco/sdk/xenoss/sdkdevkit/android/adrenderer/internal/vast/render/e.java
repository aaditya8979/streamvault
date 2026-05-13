package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a0 f50512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f50515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<String> f50516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<String> f50517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Long f50518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t f50519h;

    public e(@NotNull a0 a0Var, int i10, int i11, @Nullable String str, @NotNull List<String> list, @NotNull List<String> list2, @Nullable Long l10, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar) {
        tn.p.k(a0Var, "resource");
        tn.p.k(list, "clickTracking");
        tn.p.k(list2, "viewTracking");
        this.f50512a = a0Var;
        this.f50513b = i10;
        this.f50514c = i11;
        this.f50515d = str;
        this.f50516e = list;
        this.f50517f = list2;
        this.f50518g = l10;
        this.f50519h = tVar;
    }

    @Nullable
    public final String a() {
        return this.f50515d;
    }

    @NotNull
    public final List<String> b() {
        return this.f50516e;
    }

    @Nullable
    public final Long c() {
        return this.f50518g;
    }

    public final int d() {
        return this.f50514c;
    }

    @Nullable
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t e() {
        return this.f50519h;
    }

    @NotNull
    public final a0 f() {
        return this.f50512a;
    }

    @NotNull
    public final List<String> g() {
        return this.f50517f;
    }

    public final int h() {
        return this.f50513b;
    }
}
