package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface M0 {
    default void a() {
    }

    void a(@Nullable IronSourceError ironSourceError);

    void a(@NotNull C4258t0 c4258t0);

    default void b(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
    }
}
