package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.idsync.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4638b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f64872a;

    public C4638b(@NotNull ServiceContext serviceContext) {
        this.f64872a = serviceContext;
    }

    @Override // io.appmetrica.analytics.idsync.impl.t
    public final boolean a() {
        return this.f64872a.getActiveNetworkTypeProvider().getNetworkType(this.f64872a.getContext()) == NetworkType.CELL;
    }
}
