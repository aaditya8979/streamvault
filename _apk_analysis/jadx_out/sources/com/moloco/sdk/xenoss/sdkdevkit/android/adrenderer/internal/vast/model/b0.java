package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f49865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f49866b;

    public b0(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "url");
        this.f49865a = str;
        this.f49866b = str2;
    }

    @NotNull
    public final String a() {
        return this.f49866b;
    }
}
