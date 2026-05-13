package go;

import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class n<T> implements u<T>, a<T>, ho.j<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u<T> f62652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final kotlinx.coroutines.g f62653c;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull u<? extends T> uVar, @Nullable kotlinx.coroutines.g gVar) {
        this.f62652b = uVar;
        this.f62653c = gVar;
    }

    @Override // ho.j
    @NotNull
    public d<T> a(@NotNull kotlin.coroutines.d dVar, int i10, @NotNull BufferOverflow bufferOverflow) {
        return v.d(this, dVar, i10, bufferOverflow);
    }

    @Override // go.p, go.d
    @Nullable
    public Object collect(@NotNull e<? super T> eVar, @NotNull hn.c<?> cVar) {
        return this.f62652b.collect(eVar, cVar);
    }

    @Override // go.u
    public T getValue() {
        return this.f62652b.getValue();
    }
}
