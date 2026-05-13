package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface Lb extends Ob, LocationServiceApi {
    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void a(@Nullable Location location);

    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void a(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void a(boolean z10);

    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void b(@NotNull Object obj);

    @Override // io.appmetrica.analytics.impl.Ob
    /* synthetic */ void init();
}
