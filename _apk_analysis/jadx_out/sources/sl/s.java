package sl;

import org.jetbrains.annotations.NotNull;
import p000do.l0;

/* JADX INFO: compiled from: ByteWriteChannelOperations.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class s implements l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f84422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final kotlin.coroutines.d f84423c;

    public s(@NotNull f fVar, @NotNull kotlin.coroutines.d dVar) {
        tn.p.k(fVar, "channel");
        tn.p.k(dVar, "coroutineContext");
        this.f84422b = fVar;
        this.f84423c = dVar;
    }

    @NotNull
    public final f a() {
        return this.f84422b;
    }

    @Override // p000do.l0
    @NotNull
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f84423c;
    }
}
