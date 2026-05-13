package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class Yc extends E2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66260b;

    public Yc(@NotNull String str, @NotNull InterfaceC5194vl interfaceC5194vl) {
        super(interfaceC5194vl);
        this.f66260b = str;
    }

    @Override // io.appmetrica.analytics.impl.E2
    @NotNull
    public final String a(@NotNull String str) {
        return str + '-' + this.f66260b;
    }
}
