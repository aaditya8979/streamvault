package io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LimitedDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    @NotNull
    public static final p000do.h0 b(@NotNull p000do.h0 h0Var, @Nullable String str) {
        return str != null ? new w(h0Var, str) : h0Var;
    }
}
