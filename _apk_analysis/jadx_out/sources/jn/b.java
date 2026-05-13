package jn;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements hn.c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f72505b = new b();

    @Override // hn.c
    @NotNull
    public kotlin.coroutines.d getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // hn.c
    public void resumeWith(@NotNull Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @NotNull
    public String toString() {
        return "This continuation is already complete";
    }
}
