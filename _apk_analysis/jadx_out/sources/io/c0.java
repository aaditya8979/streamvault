package io;

import io.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c0<S extends b0<S>> {
    @NotNull
    public static <S extends b0<S>> Object a(@Nullable Object obj) {
        return obj;
    }

    @NotNull
    public static final S b(Object obj) {
        if (obj == b.f68502a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        tn.p.i(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    public static final boolean c(Object obj) {
        return obj == b.f68502a;
    }
}
