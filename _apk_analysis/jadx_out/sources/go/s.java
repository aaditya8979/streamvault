package go;

import kotlinx.coroutines.channels.BufferOverflow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final d<T> f62658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final BufferOverflow f62660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f62661d;

    /* JADX WARN: Multi-variable type inference failed */
    public s(@NotNull d<? extends T> dVar, int i10, @NotNull BufferOverflow bufferOverflow, @NotNull kotlin.coroutines.d dVar2) {
        this.f62658a = dVar;
        this.f62659b = i10;
        this.f62660c = bufferOverflow;
        this.f62661d = dVar2;
    }
}
