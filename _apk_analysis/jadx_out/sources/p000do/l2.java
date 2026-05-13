package p000do;

import io.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l2 {
    @NotNull
    public static final <T> k2<T> a(@NotNull ThreadLocal<T> threadLocal, T t10) {
        return new m0(t10, threadLocal);
    }
}
