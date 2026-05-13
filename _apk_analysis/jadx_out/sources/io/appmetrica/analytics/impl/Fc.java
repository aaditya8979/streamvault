package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Fc implements G8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5187ve f65245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn.a f65246b;

    public Fc(@NotNull InterfaceC5187ve interfaceC5187ve, @NotNull sn.a<Integer> aVar) {
        this.f65245a = interfaceC5187ve;
        this.f65246b = aVar;
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final boolean b() {
        return ((C5162ue) this.f65245a).f67784b.get() >= ((long) ((Number) this.f65246b.invoke()).intValue());
    }
}
