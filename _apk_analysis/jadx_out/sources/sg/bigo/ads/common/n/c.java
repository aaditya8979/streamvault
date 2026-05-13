package sg.bigo.ads.common.n;

import androidx.annotation.NonNull;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f82243e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f82244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f82245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f82246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f82247d;

    public c(String str) {
        this(str, false);
    }

    public c(String str, boolean z10) {
        this.f82244a = "BGAd-".concat(String.valueOf(str));
        this.f82245b = new AtomicInteger(1);
        this.f82246c = Executors.defaultThreadFactory();
        this.f82247d = z10;
    }

    public static void a(a aVar) {
        f82243e = aVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f82246c.newThread(runnable);
        threadNewThread.setName(this.f82244a + "-" + this.f82245b.getAndIncrement());
        if (this.f82247d) {
            threadNewThread.setPriority(10);
        }
        threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: sg.bigo.ads.common.n.c.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
                if (c.f82243e != null) {
                    c.f82243e.a(th2);
                }
            }
        });
        return threadNewThread;
    }
}
