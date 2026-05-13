package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface Ba extends SimpleAdvertisingIdGetter, InterfaceC4946lm {
    @NotNull
    AdvertisingIdsHolder a();

    @NotNull
    AdvertisingIdsHolder a(@NotNull Hi hi2);

    @Override // io.appmetrica.analytics.impl.InterfaceC4946lm
    /* synthetic */ void a(@NonNull C4817gm c4817gm);

    void b(boolean z10);

    void c(boolean z10);

    @NotNull
    AdvertisingIdsHolder getIdentifiers();

    void init();
}
