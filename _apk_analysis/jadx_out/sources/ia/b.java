package ia;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: FileDownloadExecutors.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: compiled from: FileDownloadExecutors.java */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AtomicInteger f64028e = new AtomicInteger(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64029b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f64031d = new AtomicInteger(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ThreadGroup f64030c = Thread.currentThread().getThreadGroup();

        public a(String str) {
            this.f64029b = f.D(str);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f64030c, runnable, this.f64029b + this.f64031d.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public static ThreadPoolExecutor a(int i10, String str) {
        return b(i10, new LinkedBlockingQueue(), str);
    }

    public static ThreadPoolExecutor b(int i10, LinkedBlockingQueue<Runnable> linkedBlockingQueue, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 15L, TimeUnit.SECONDS, linkedBlockingQueue, new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor c(String str) {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new SynchronousQueue(), new a(str));
    }
}
