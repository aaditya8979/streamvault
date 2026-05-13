package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.Comparator;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f49350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f49351c;

    public b(@Nullable Integer num, @Nullable Integer num2) {
        this.f49350b = num;
        this.f49351c = num2;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g gVar2) {
        tn.p.k(gVar, "c1");
        tn.p.k(gVar2, "c2");
        Pair pairY = u.y(gVar, gVar2, this.f49350b, this.f49351c);
        return tn.p.m(((Number) pairY.component2()).intValue(), ((Number) pairY.component1()).intValue());
    }
}
