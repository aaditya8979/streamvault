package com.moloco.sdk.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public interface h0 {

    public static final class a {
        public static /* synthetic */ boolean a(h0 h0Var, String str, long j10, c0 c0Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 4) != 0) {
                c0Var = null;
            }
            return h0Var.a(str, j10, c0Var);
        }
    }

    boolean a(@NotNull String str, long j10, @Nullable c0 c0Var);
}
