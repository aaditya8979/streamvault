package ho;

import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements hn.c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final k f63560b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final kotlin.coroutines.d f63561c = EmptyCoroutineContext.INSTANCE;

    @Override // hn.c
    @NotNull
    public kotlin.coroutines.d getContext() {
        return f63561c;
    }

    @Override // hn.c
    public void resumeWith(@NotNull Object obj) {
    }
}
