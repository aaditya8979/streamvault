package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class P4 implements InterfaceC5107s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4929l5 f65740a;

    public P4(@NotNull InterfaceC5207w9 interfaceC5207w9, @NotNull M6 m62, @NotNull Rg rg2, @NotNull R4 r42) {
        O4 o42 = new O4(m62, rg2);
        this.f65740a = new C4929l5(interfaceC5207w9, o42.a(), o42.b(), r42);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5107s9
    public final InterfaceC5082r9 a() {
        return this.f65740a;
    }

    @NotNull
    public final C4929l5 b() {
        return this.f65740a;
    }
}
