package ho;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements kotlin.coroutines.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.d f63558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Throwable f63559c;

    public f(@NotNull Throwable th2, @NotNull kotlin.coroutines.d dVar) {
        this.f63558b = dVar;
        this.f63559c = th2;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull sn.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) this.f63558b.fold(r10, pVar);
    }

    @Override // kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) this.f63558b.get(cVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d minusKey(@NotNull d.c<?> cVar) {
        return this.f63558b.minusKey(cVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public kotlin.coroutines.d plus(@NotNull kotlin.coroutines.d dVar) {
        return this.f63558b.plus(dVar);
    }
}
