package ko;

import io.f0;
import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import p000do.j1;
import zn.n;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends j1 implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f73176c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final h0 f73177d = h0.limitedParallelism$default(j.f73194b, io.h0.e("kotlinx.coroutines.io.parallelism", n.e(64, f0.a()), 0, 0, 12, null), null, 2, null);

    @Override // p000do.j1
    @NotNull
    public Executor I() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // p000do.h0
    public void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        f73177d.dispatch(dVar, runnable);
    }

    @Override // p000do.h0
    public void dispatchYield(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        f73177d.dispatchYield(dVar, runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        dispatch(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // p000do.h0
    @NotNull
    public h0 limitedParallelism(int i10, @Nullable String str) {
        return j.f73194b.limitedParallelism(i10, str);
    }

    @Override // p000do.h0
    @NotNull
    public String toString() {
        return "Dispatchers.IO";
    }
}
