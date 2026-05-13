package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final b0 f49853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<b0> f49854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<b0> f49855c;

    public a(@Nullable b0 b0Var, @NotNull List<b0> list, @NotNull List<b0> list2) {
        tn.p.k(list, "clickTrackingList");
        tn.p.k(list2, "customClickList");
        this.f49853a = b0Var;
        this.f49854b = list;
        this.f49855c = list2;
    }

    @Nullable
    public final b0 a() {
        return this.f49853a;
    }

    @NotNull
    public final List<b0> b() {
        return this.f49854b;
    }

    @NotNull
    public final List<b0> c() {
        return this.f49855c;
    }
}
