package ql;

import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StackWalkingFailedFrame.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l implements jn.c, hn.c<?> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final l f78344b = new l();

    @Override // jn.c
    @Nullable
    public jn.c getCallerFrame() {
        return null;
    }

    @Override // hn.c
    @NotNull
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // hn.c
    public void resumeWith(@NotNull Object obj) {
        k.f78343a.a();
    }
}
