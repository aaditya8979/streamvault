package androidx.core.util;

import bn.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableKt {
    @NotNull
    public static final Runnable asRunnable(@NotNull hn.c<? super r> cVar) {
        return new ContinuationRunnable(cVar);
    }
}
