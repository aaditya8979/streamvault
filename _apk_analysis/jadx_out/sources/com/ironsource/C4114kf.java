package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4114kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32175b;

    public C4114kf(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "identifier");
        tn.p.k(str2, "baseConst");
        this.f32174a = str;
        this.f32175b = str2;
    }

    @NotNull
    public final String a() {
        return this.f32174a + "_" + this.f32175b;
    }
}
