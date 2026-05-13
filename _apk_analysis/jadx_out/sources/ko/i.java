package ko;

import io.f0;
import io.h0;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import zn.n;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f73188a = f0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f73189b = h0.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f73190c = h0.e("kotlinx.coroutines.scheduler.core.pool.size", n.e(f0.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f73191d = h0.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f73192e = TimeUnit.SECONDS.toNanos(h0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static f f73193f = d.f73179a;

    @NotNull
    public static final g b(@NotNull Runnable runnable, long j10, boolean z10) {
        return new h(runnable, j10, z10);
    }

    public static final String c(boolean z10) {
        return z10 ? "Blocking" : "Non-blocking";
    }
}
