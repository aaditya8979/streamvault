package sl;

import org.jetbrains.annotations.NotNull;
import p000do.l0;

/* JADX INFO: compiled from: ByteReadChannelOperations.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class p implements l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final io.ktor.utils.io.a f84417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f84418c;

    public p(@NotNull io.ktor.utils.io.a aVar, @NotNull kotlin.coroutines.d dVar) {
        tn.p.k(aVar, "channel");
        tn.p.k(dVar, "coroutineContext");
        this.f84417b = aVar;
        this.f84418c = dVar;
    }

    @NotNull
    public final io.ktor.utils.io.a a() {
        return this.f84417b;
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f84418c;
    }
}
