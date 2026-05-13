package sg.bigo.ads.core.d.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f83745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f83746b = Executors.newFixedThreadPool(1, new c("Stat-Worker"));

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.c.a$a, reason: collision with other inner class name */
    public static class C1045a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f83748c;

        public C1045a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.d.c.a.b
        public final void a() {
            Runnable runnable = this.f83749a;
            if (runnable != null) {
                this.f83748c = a.a(runnable);
            }
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f83749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f83750b = new AtomicBoolean(false);

        public b(Runnable runnable) {
            this.f83749a = runnable;
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f83750b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Stat-Handler");
        handlerThread.start();
        f83745a = new Handler(handlerThread.getLooper());
    }

    public static Future a(final Runnable runnable) {
        return f83746b.submit(new Runnable() { // from class: sg.bigo.ads.core.d.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e10) {
                    e = e10;
                    sb2 = new StringBuilder("stat thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb2.toString());
                } catch (Throwable th2) {
                    e = th2;
                    sb2 = new StringBuilder("stat thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb2.toString());
                }
            }
        });
    }

    public static b a(Runnable runnable, long j10) {
        C1045a c1045a = new C1045a(runnable);
        f83745a.postDelayed(c1045a, j10);
        return c1045a;
    }

    public static void a(b bVar) {
        if (bVar != null) {
            bVar.f83750b.set(true);
            if (bVar instanceof C1045a) {
                C1045a c1045a = (C1045a) bVar;
                if (c1045a.f83748c != null) {
                    Future future = c1045a.f83748c;
                    if ((future == null || future.isCancelled() || future.isDone()) ? false : true) {
                        future.cancel(true);
                    }
                }
            }
            f83745a.removeCallbacks(bVar);
        }
    }
}
