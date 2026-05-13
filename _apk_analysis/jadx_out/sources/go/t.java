package go;

import kotlinx.coroutines.flow.SharingCommand;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class t implements kotlinx.coroutines.flow.a {
    @Override // kotlinx.coroutines.flow.a
    @NotNull
    public d<SharingCommand> a(@NotNull u<Integer> uVar) {
        return f.B(SharingCommand.START);
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
