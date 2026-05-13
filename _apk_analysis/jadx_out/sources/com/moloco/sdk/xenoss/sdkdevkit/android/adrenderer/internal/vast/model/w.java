package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f49960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i f49961b;

    public w(@NotNull String str, @NotNull i iVar) {
        tn.p.k(str, "resource");
        tn.p.k(iVar, "creativeType");
        this.f49960a = str;
        this.f49961b = iVar;
    }

    @NotNull
    public final i a() {
        return this.f49961b;
    }

    @NotNull
    public final String b() {
        return this.f49960a;
    }
}
