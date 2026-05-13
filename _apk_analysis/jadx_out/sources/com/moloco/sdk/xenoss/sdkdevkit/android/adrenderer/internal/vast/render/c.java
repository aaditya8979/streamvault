package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a0 f50079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f50082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<String> f50083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<String> f50084f;

    public c(@NotNull a0 a0Var, int i10, int i11, @Nullable String str, @NotNull List<String> list, @NotNull List<String> list2) {
        tn.p.k(a0Var, "resource");
        tn.p.k(list, "clickTracking");
        tn.p.k(list2, "creativeViewTracking");
        this.f50079a = a0Var;
        this.f50080b = i10;
        this.f50081c = i11;
        this.f50082d = str;
        this.f50083e = list;
        this.f50084f = list2;
    }

    @Nullable
    public final String a() {
        return this.f50082d;
    }

    @NotNull
    public final List<String> b() {
        return this.f50083e;
    }

    @NotNull
    public final List<String> c() {
        return this.f50084f;
    }

    public final int d() {
        return this.f50081c;
    }

    @NotNull
    public final a0 e() {
        return this.f50079a;
    }

    public final int f() {
        return this.f50080b;
    }
}
