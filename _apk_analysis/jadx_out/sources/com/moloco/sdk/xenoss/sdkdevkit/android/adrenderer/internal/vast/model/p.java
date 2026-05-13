package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f49911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f49912b;

    public p(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "impressionUrl");
        this.f49911a = str;
        this.f49912b = str2;
    }

    @NotNull
    public final String a() {
        return this.f49912b;
    }
}
