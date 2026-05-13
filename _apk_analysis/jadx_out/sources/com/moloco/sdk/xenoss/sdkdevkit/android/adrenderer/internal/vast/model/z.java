package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<c> f49978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f49979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f49980c;

    public z(@NotNull List<c> list, @Nullable String str, @Nullable String str2) {
        tn.p.k(list, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.f49978a = list;
        this.f49979b = str;
        this.f49980c = str2;
    }

    @NotNull
    public final List<c> a() {
        return this.f49978a;
    }

    @Nullable
    public final String b() {
        return this.f49979b;
    }
}
