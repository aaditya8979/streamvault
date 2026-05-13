package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4132lf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final N3 f32206b;

    public C4132lf(int i10, @NotNull N3 n32) {
        tn.p.k(n32, Ne.f29954n1);
        this.f32205a = i10;
        this.f32206b = n32;
    }

    public final int a() {
        return this.f32205a;
    }

    @NotNull
    public final N3 b() {
        return this.f32206b;
    }

    @NotNull
    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f32205a + ", unit=" + this.f32206b + ")";
    }
}
