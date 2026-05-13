package p000do;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class x0 implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Future<?> f59908b;

    public x0(@NotNull Future<?> future) {
        this.f59908b = future;
    }

    @Override // p000do.y0
    public void dispose() {
        this.f59908b.cancel(false);
    }

    @NotNull
    public String toString() {
        return "DisposableFutureHandle[" + this.f59908b + ']';
    }
}
