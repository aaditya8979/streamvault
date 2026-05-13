package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface Vc {
    default void a(@NotNull A a10, @Nullable String str, @NotNull C4201pa c4201pa) {
        tn.p.k(a10, C4157n2.f33007p);
        tn.p.k(c4201pa, "publisherDataHolder");
    }

    default void a(@NotNull List<? extends A> list, @NotNull A a10) {
        tn.p.k(list, "waterfallInstances");
        tn.p.k(a10, "winnerInstance");
    }
}
