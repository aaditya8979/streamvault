package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class B2 implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4171ng f28821a;

    public B2(@NotNull InterfaceC4171ng interfaceC4171ng) {
        tn.p.k(interfaceC4171ng, "viewBinder");
        this.f28821a = interfaceC4171ng;
    }

    @Override // com.ironsource.J
    public void a(@NotNull C4328x2 c4328x2) {
        tn.p.k(c4328x2, "bannerAdInstance");
        c4328x2.a(this.f28821a);
    }
}
