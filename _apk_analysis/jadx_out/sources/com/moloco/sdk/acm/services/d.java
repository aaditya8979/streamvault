package com.moloco.sdk.acm.services;

import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final f f45890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicLong f45891b;

    public d(@NotNull f fVar) {
        p.k(fVar, "timeProviderService");
        this.f45890a = fVar;
        this.f45891b = new AtomicLong(0L);
    }

    public final long a() {
        return this.f45890a.invoke() - this.f45891b.get();
    }

    public final void b() {
        this.f45891b.set(this.f45890a.invoke());
    }
}
