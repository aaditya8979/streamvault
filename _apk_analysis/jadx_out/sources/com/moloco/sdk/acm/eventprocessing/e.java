package com.moloco.sdk.acm.eventprocessing;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.acm.services.f f45794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45795b;

    public e(@NotNull com.moloco.sdk.acm.services.f fVar, long j10) {
        p.k(fVar, "timeProviderService");
        this.f45794a = fVar;
        this.f45795b = j10;
    }

    public final boolean a(@NotNull com.moloco.sdk.acm.db.b bVar) {
        p.k(bVar, "eventEntity");
        return this.f45794a.invoke() - bVar.f() >= this.f45795b * ((long) 1000);
    }
}
