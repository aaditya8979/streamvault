package ho;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r<T> implements hn.c<T>, jn.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final hn.c<T> f63568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f63569c;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@NotNull hn.c<? super T> cVar, @NotNull kotlin.coroutines.d dVar) {
        this.f63568b = cVar;
        this.f63569c = dVar;
    }

    @Override // jn.c
    @Nullable
    public jn.c getCallerFrame() {
        hn.c<T> cVar = this.f63568b;
        if (cVar instanceof jn.c) {
            return (jn.c) cVar;
        }
        return null;
    }

    @Override // hn.c
    @NotNull
    public kotlin.coroutines.d getContext() {
        return this.f63569c;
    }

    @Override // hn.c
    public void resumeWith(@NotNull Object obj) {
        this.f63568b.resumeWith(obj);
    }
}
