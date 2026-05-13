package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Ig implements Kg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Dg f29645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29646b;

    public Ig(@NotNull Dg dg2) {
        tn.p.k(dg2, "waterfallOperations");
        this.f29645a = dg2;
    }

    @Override // com.ironsource.Kg
    public void a() {
        this.f29645a.a();
    }

    @Override // com.ironsource.Kg
    public void a(@NotNull A a10) {
        tn.p.k(a10, "it");
        this.f29646b++;
        this.f29645a.a(a10);
    }

    @Override // com.ironsource.Kg
    @NotNull
    public Ed b() {
        return this.f29646b >= 2 ? Ed.MAX_ATTEMPTS_REACHED : !this.f29645a.b() ? Ed.NO_LOADED_ADS : Ed.CAN_RECOVER;
    }

    @Override // com.ironsource.Kg
    @Nullable
    public A c() {
        return this.f29645a.a(this.f29646b);
    }
}
