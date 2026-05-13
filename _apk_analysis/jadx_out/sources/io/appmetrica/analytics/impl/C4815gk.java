package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4815gk implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66842a = "service_main.db";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66843b = "metrica_data.db";

    @Override // io.appmetrica.analytics.impl.Y6
    @NotNull
    public final String a() {
        return this.f66843b;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    @NotNull
    public final String b() {
        return this.f66842a;
    }
}
