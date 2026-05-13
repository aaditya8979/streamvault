package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class Xb implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Pb f30670a;

    public Xb(@NotNull Pb pb2) {
        tn.p.k(pb2, "nativeAdBinder");
        this.f30670a = pb2;
    }

    @Override // com.ironsource.J
    public void a(@NotNull Wb wb2) {
        tn.p.k(wb2, "nativeAdInstance");
        wb2.a(this.f30670a);
    }
}
