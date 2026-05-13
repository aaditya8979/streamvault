package r0;

import android.os.Handler;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Handler f78542a = new Handler(Looper.getMainLooper());

    public static final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "runnable");
        if (tn.p.f(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            f78542a.post(runnable);
        }
    }
}
