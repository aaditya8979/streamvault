package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f49867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f49868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f49869c;

    public c(@Nullable String str, @Nullable Integer num, @NotNull d dVar) {
        tn.p.k(dVar, "child");
        this.f49867a = str;
        this.f49868b = num;
        this.f49869c = dVar;
    }

    @NotNull
    public final d a() {
        return this.f49869c;
    }

    @Nullable
    public final Integer b() {
        return this.f49868b;
    }
}
