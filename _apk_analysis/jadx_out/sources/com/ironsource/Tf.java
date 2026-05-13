package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface Tf {
    static /* synthetic */ void a(Tf tf2, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        tf2.a(runnable, j10);
    }

    void a(@NotNull Runnable runnable);

    void a(@NotNull Runnable runnable, long j10);
}
