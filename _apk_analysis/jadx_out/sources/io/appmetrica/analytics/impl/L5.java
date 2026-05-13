package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class L5 implements K5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4877j5 f65522a;

    public L5(@NotNull C4877j5 c4877j5) {
        this.f65522a = c4877j5;
    }

    @Override // io.appmetrica.analytics.impl.K5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    @NotNull
    public final C4877j5 getAdRevenueProcessorsHolder() {
        return this.f65522a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f65522a;
    }
}
