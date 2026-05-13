package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Hg implements Kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Dg f29568a;

    public Hg(@NotNull Dg dg2) {
        tn.p.k(dg2, "waterfallOperations");
        this.f29568a = dg2;
    }

    @Override // com.ironsource.Kg
    public void a() {
    }

    @Override // com.ironsource.Kg
    public void a(@NotNull A a10) {
        tn.p.k(a10, "it");
        this.f29568a.a(a10);
        this.f29568a.a();
    }

    @Override // com.ironsource.Kg
    @NotNull
    public Ed b() {
        return Ed.FEATURE_DISABLED;
    }

    @Override // com.ironsource.Kg
    @Nullable
    public A c() {
        return this.f29568a.a(0);
    }
}
