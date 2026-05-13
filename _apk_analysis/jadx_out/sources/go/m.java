package go;

import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class m<T> implements p<T>, a<T>, ho.j<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<T> f62650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final kotlinx.coroutines.g f62651c;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull p<? extends T> pVar, @Nullable kotlinx.coroutines.g gVar) {
        this.f62650b = pVar;
        this.f62651c = gVar;
    }

    @Override // ho.j
    @NotNull
    public d<T> a(@NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return q.e(this, dVar, i10, bufferOverflow);
    }

    @Override // go.p, go.d
    @Nullable
    public Object collect(@NotNull e<? super T> eVar, @NotNull hn.c<?> cVar) {
        return this.f62650b.collect(eVar, cVar);
    }
}
