package sg.bigo.ads.core.b.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f83673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f83674b = Executors.newFixedThreadPool(1, new c("Callback-Worker"));

    public static class a extends AbstractRunnableC1042b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f83676c;

        public a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.b.c.b.AbstractRunnableC1042b
        public final void a() {
            Runnable runnable = this.f83677a;
            if (runnable != null) {
                this.f83676c = b.a(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.b.c.b$b, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC1042b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f83677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f83678b = new AtomicBoolean(false);

        public AbstractRunnableC1042b(Runnable runnable) {
            this.f83677a = runnable;
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f83678b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Callback-Handler");
        handlerThread.start();
        f83673a = new Handler(handlerThread.getLooper());
    }

    public static Future<?> a(final Runnable runnable) {
        return f83674b.submit(new Runnable() { // from class: sg.bigo.ads.core.b.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e10) {
                    e = e10;
                    sb2 = new StringBuilder("callback thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb2.toString());
                } catch (Throwable th2) {
                    e = th2;
                    sb2 = new StringBuilder("callback thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb2.toString());
                }
            }
        });
    }

    public static AbstractRunnableC1042b a(Runnable runnable, long j10) {
        a aVar = new a(runnable);
        f83673a.postDelayed(aVar, j10);
        return aVar;
    }

    public static void a(AbstractRunnableC1042b abstractRunnableC1042b) {
        if (abstractRunnableC1042b != null) {
            abstractRunnableC1042b.f83678b.set(true);
            if (abstractRunnableC1042b instanceof a) {
                a aVar = (a) abstractRunnableC1042b;
                if (aVar.f83676c != null) {
                    Future future = aVar.f83676c;
                    if ((future == null || future.isCancelled() || future.isDone()) ? false : true) {
                        future.cancel(true);
                    }
                }
            }
            f83673a.removeCallbacks(abstractRunnableC1042b);
        }
    }
}
