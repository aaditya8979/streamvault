package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4755ec implements InterfaceC5107s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4929l5 f66682a;

    public C4755ec(@NotNull InterfaceC5207w9 interfaceC5207w9, @NotNull M6 m62, @NotNull Rg rg2, @NotNull C5028p4 c5028p4, @NotNull R4 r42, @NotNull Xe xe2) {
        C4730dc c4730dc = new C4730dc(m62, rg2, this, c5028p4, xe2);
        this.f66682a = new C4929l5(interfaceC5207w9, c4730dc.a(), c4730dc.b(), r42);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5107s9
    public final InterfaceC5082r9 a() {
        return this.f66682a;
    }

    @NotNull
    public final C4929l5 b() {
        return this.f66682a;
    }
}
