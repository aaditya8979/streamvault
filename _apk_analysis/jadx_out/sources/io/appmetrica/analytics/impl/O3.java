package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class O3 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65679a = "client.db";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65680b = "metrica_client_data.db";

    @Override // io.appmetrica.analytics.impl.Y6
    @NotNull
    public final String a() {
        return this.f65680b;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    @NotNull
    public final String b() {
        return this.f65679a;
    }
}
