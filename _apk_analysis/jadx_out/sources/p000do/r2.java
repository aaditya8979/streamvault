package p000do;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class r2 implements d.b, d.c<r2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final r2 f59886b = new r2();

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) d.b.a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    @NotNull
    public d.c<?> getKey() {
        return this;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        return d.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public d plus(@NotNull d dVar) {
        return d.b.a.d(this, dVar);
    }
}
