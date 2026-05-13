package io;

import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Concurrent.common.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public static final <T> T a(@NotNull AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void b(@NotNull AtomicReference<T> atomicReference, T t10) {
        atomicReference.set(t10);
    }
}
