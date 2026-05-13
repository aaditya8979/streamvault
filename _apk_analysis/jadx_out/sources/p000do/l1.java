package p000do;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l1 {
    @NotNull
    public static final Executor a(@NotNull h0 h0Var) {
        Executor executorI;
        j1 j1Var = h0Var instanceof j1 ? (j1) h0Var : null;
        return (j1Var == null || (executorI = j1Var.I()) == null) ? new v0(h0Var) : executorI;
    }

    @NotNull
    public static final h0 b(@NotNull Executor executor) {
        h0 h0Var;
        v0 v0Var = executor instanceof v0 ? (v0) executor : null;
        return (v0Var == null || (h0Var = v0Var.f59891b) == null) ? new k1(executor) : h0Var;
    }

    @NotNull
    public static final j1 c(@NotNull ExecutorService executorService) {
        return new k1(executorService);
    }
}
