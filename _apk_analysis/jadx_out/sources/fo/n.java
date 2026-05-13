package fo;

import io.b0;
import org.jetbrains.annotations.NotNull;
import p000do.s2;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class n<E> implements s2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kotlinx.coroutines.c<kotlinx.coroutines.channels.a<? extends E>> f61770b;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull kotlinx.coroutines.c<? super kotlinx.coroutines.channels.a<? extends E>> cVar) {
        this.f61770b = cVar;
    }

    @Override // p000do.s2
    public void b(@NotNull b0<?> b0Var, int i10) {
        this.f61770b.b(b0Var, i10);
    }
}
