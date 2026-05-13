package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ExecutorManager.java */
/* JADX INFO: loaded from: classes9.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f40932a;

    /* JADX INFO: compiled from: ExecutorManager.java */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    /* JADX INFO: compiled from: ExecutorManager.java */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f40934a;

        public b(Runnable runnable) {
            this.f40934a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.b(this.f40934a)) {
                return;
            }
            try {
                this.f40934a.run();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f40902a) {
                    Log.e("TrackManager", "execute error", e10);
                }
            }
        }
    }

    private ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public void a(Runnable runnable) {
        if (this.f40932a == null) {
            this.f40932a = a();
        }
        if (this.f40932a.isShutdown()) {
            return;
        }
        this.f40932a.execute(new b(runnable));
    }
}
