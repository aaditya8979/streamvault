package p000do;

import java.util.concurrent.Future;
import kotlinx.coroutines.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class j implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Future<?> f59858b;

    public j(@NotNull Future<?> future) {
        this.f59858b = future;
    }

    @Override // kotlinx.coroutines.b
    public void a(@Nullable Throwable th2) {
        this.f59858b.cancel(false);
    }

    @NotNull
    public String toString() {
        return "CancelFutureOnCancel[" + this.f59858b + ']';
    }
}
