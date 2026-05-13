package kotlinx.coroutines.flow;

import go.d;
import go.f;
import go.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class StartedLazily implements a {
    @Override // kotlinx.coroutines.flow.a
    @NotNull
    public d<SharingCommand> a(@NotNull u<Integer> uVar) {
        return f.z(new StartedLazily$command$1(uVar, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
