package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import java.util.Comparator;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements Comparator<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f49353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Long f49354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f49355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f49356e;

    public d(double d10, @Nullable Long l10, @Nullable Integer num, @Nullable Integer num2) {
        this.f49353b = d10;
        this.f49354c = l10;
        this.f49355d = num;
        this.f49356e = num2;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s sVar2) {
        tn.p.k(sVar, "mf1");
        tn.p.k(sVar2, "mf2");
        Pair pairV = u.v(sVar, sVar2, this.f49353b, this.f49354c, this.f49355d, this.f49356e);
        return tn.p.m(((Number) pairV.component2()).intValue(), ((Number) pairV.component1()).intValue());
    }
}
