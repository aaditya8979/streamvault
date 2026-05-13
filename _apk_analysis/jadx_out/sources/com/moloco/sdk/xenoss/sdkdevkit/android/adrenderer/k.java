package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface k {

    public interface a {
        void a();

        void a(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar);

        void b(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar);
    }

    void i(long j10, @Nullable a aVar);

    @NotNull
    go.u<Boolean> isLoaded();
}
