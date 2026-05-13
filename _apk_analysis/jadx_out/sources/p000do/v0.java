package p000do;

import io.i;
import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final h0 f59891b;

    public v0(@NotNull h0 h0Var) {
        this.f59891b = h0Var;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        h0 h0Var = this.f59891b;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (i.d(h0Var, emptyCoroutineContext)) {
            i.c(this.f59891b, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    @NotNull
    public String toString() {
        return this.f59891b.toString();
    }
}
