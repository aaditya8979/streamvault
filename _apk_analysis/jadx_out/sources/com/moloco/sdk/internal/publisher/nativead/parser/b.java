package com.moloco.sdk.internal.publisher.nativead.parser;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class b extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46870c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f46872b;

    public b(int i10, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        p.k(cVar, "errorSubType");
        this.f46871a = i10;
        this.f46872b = cVar;
    }

    public final int a() {
        return this.f46871a;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c b() {
        return this.f46872b;
    }
}
