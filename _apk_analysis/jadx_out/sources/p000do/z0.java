package p000do;

import kotlinx.coroutines.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final y0 f59912b;

    public z0(@NotNull y0 y0Var) {
        this.f59912b = y0Var;
    }

    @Override // kotlinx.coroutines.b
    public void a(@Nullable Throwable th2) {
        this.f59912b.dispose();
    }

    @NotNull
    public String toString() {
        return "DisposeOnCancel[" + this.f59912b + ']';
    }
}
