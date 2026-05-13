package com.luck.picture.lib.thread;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import com.ironsource.C4254sd;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class PictureThreadUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f35203a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Map<Integer, ExecutorService>> f35204b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<e, ExecutorService> f35205c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f35206d = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Timer f35207e = new Timer();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Executor f35208f;

    public static final class LinkedBlockingQueue4Util extends LinkedBlockingQueue<Runnable> {
        private int mCapacity;
        private volatile f mPool;

        public LinkedBlockingQueue4Util() {
            this.mCapacity = Integer.MAX_VALUE;
        }

        public LinkedBlockingQueue4Util(int i10) {
            this.mCapacity = i10;
        }

        public LinkedBlockingQueue4Util(boolean z10) {
            this.mCapacity = Integer.MAX_VALUE;
            if (z10) {
                this.mCapacity = 0;
            }
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        public boolean offer(@NonNull Runnable runnable) {
            if (this.mCapacity > size() || this.mPool == null || this.mPool.getPoolSize() >= this.mPool.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }
    }

    public static final class UtilsThreadFactory extends AtomicLong implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AtomicInteger f35209b = new AtomicInteger(1);
        private static final long serialVersionUID = -9209200509960368598L;
        private final boolean isDaemon;
        private final String namePrefix;
        private final int priority;

        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                } catch (Throwable th2) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th2);
                }
            }
        }

        public class b implements Thread.UncaughtExceptionHandler {
            public b() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                System.out.println(th2);
            }
        }

        public UtilsThreadFactory(String str, int i10) {
            this(str, i10, false);
        }

        public UtilsThreadFactory(String str, int i10, boolean z10) {
            this.namePrefix = str + "-pool-" + f35209b.getAndIncrement() + "-thread-";
            this.priority = i10;
            this.isDaemon = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            a aVar = new a(runnable, this.namePrefix + getAndIncrement());
            aVar.setDaemon(this.isDaemon);
            aVar.setUncaughtExceptionHandler(new b());
            aVar.setPriority(this.priority);
            return aVar;
        }
    }

    public class a extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f35212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f35213c;

        public a(ExecutorService executorService, e eVar) {
            this.f35212b = executorService;
            this.f35213c = eVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f35212b.execute(this.f35213c);
        }
    }

    public class b extends TimerTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f35214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f35215c;

        public b(ExecutorService executorService, e eVar) {
            this.f35214b = executorService;
            this.f35215c = eVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f35214b.execute(this.f35215c);
        }
    }

    public class c implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            PictureThreadUtils.n(runnable);
        }
    }

    public static abstract class d<T> extends e<T> {
        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        public void j() {
            Log.e("ThreadUtils", "onCancel: " + Thread.currentThread());
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.e
        public void l(Throwable th2) {
            Log.e("ThreadUtils", "onFail: ", th2);
        }
    }

    public static abstract class e<T> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f35216b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f35217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile Thread f35218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Timer f35219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f35220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public f f35221g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Executor f35222h;

        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (e.this.i() || e.this.f35221g == null) {
                    return;
                }
                e.this.p();
                e.this.f35221g.onTimeout();
                e.this.k();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f35224b;

            public b(Object obj) {
                this.f35224b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                e.this.m(this.f35224b);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f35226b;

            public c(Object obj) {
                this.f35226b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                e.this.m(this.f35226b);
                e.this.k();
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Throwable f35228b;

            public d(Throwable th2) {
                this.f35228b = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.l(this.f35228b);
                e.this.k();
            }
        }

        /* JADX INFO: renamed from: com.luck.picture.lib.thread.PictureThreadUtils$e$e, reason: collision with other inner class name */
        public class RunnableC0412e implements Runnable {
            public RunnableC0412e() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.j();
                e.this.k();
            }
        }

        public interface f {
            void onTimeout();
        }

        public void d() {
            f(true);
        }

        public void f(boolean z10) {
            synchronized (this.f35216b) {
                if (this.f35216b.get() > 1) {
                    return;
                }
                this.f35216b.set(4);
                if (z10 && this.f35218d != null) {
                    this.f35218d.interrupt();
                }
                h().execute(new RunnableC0412e());
            }
        }

        public abstract T g() throws Throwable;

        public final Executor h() {
            Executor executor = this.f35222h;
            return executor == null ? PictureThreadUtils.i() : executor;
        }

        public boolean i() {
            return this.f35216b.get() > 1;
        }

        public abstract void j();

        @CallSuper
        public void k() {
            PictureThreadUtils.f35205c.remove(this);
            Timer timer = this.f35219e;
            if (timer != null) {
                timer.cancel();
                this.f35219e = null;
                this.f35221g = null;
            }
        }

        public abstract void l(Throwable th2);

        public abstract void m(T t10);

        public final void n(boolean z10) {
            this.f35217c = z10;
        }

        public final void p() {
            synchronized (this.f35216b) {
                if (this.f35216b.get() > 1) {
                    return;
                }
                this.f35216b.set(6);
                if (this.f35218d != null) {
                    this.f35218d.interrupt();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f35217c) {
                if (this.f35218d == null) {
                    if (!this.f35216b.compareAndSet(0, 1)) {
                        return;
                    }
                    this.f35218d = Thread.currentThread();
                    if (this.f35221g != null) {
                        Log.w("ThreadUtils", "Scheduled task doesn't support timeout.");
                    }
                } else if (this.f35216b.get() != 1) {
                    return;
                }
            } else {
                if (!this.f35216b.compareAndSet(0, 1)) {
                    return;
                }
                this.f35218d = Thread.currentThread();
                if (this.f35221g != null) {
                    Timer timer = new Timer();
                    this.f35219e = timer;
                    timer.schedule(new a(), this.f35220f);
                }
            }
            try {
                T tG = g();
                if (this.f35217c) {
                    if (this.f35216b.get() != 1) {
                        return;
                    }
                    h().execute(new b(tG));
                } else if (this.f35216b.compareAndSet(1, 3)) {
                    h().execute(new c(tG));
                }
            } catch (InterruptedException unused) {
                this.f35216b.compareAndSet(4, 5);
            } catch (Throwable th2) {
                if (this.f35216b.compareAndSet(1, 2)) {
                    h().execute(new d(th2));
                }
            }
        }
    }

    public static final class f extends ThreadPoolExecutor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f35231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LinkedBlockingQueue4Util f35232c;

        public f(int i10, int i11, long j10, TimeUnit timeUnit, LinkedBlockingQueue4Util linkedBlockingQueue4Util, ThreadFactory threadFactory) {
            super(i10, i11, j10, timeUnit, linkedBlockingQueue4Util, threadFactory);
            this.f35231b = new AtomicInteger();
            linkedBlockingQueue4Util.mPool = this;
            this.f35232c = linkedBlockingQueue4Util;
        }

        public static ExecutorService b(int i10, int i11) {
            if (i10 == -8) {
                return new f(PictureThreadUtils.f35206d + 1, (PictureThreadUtils.f35206d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cpu", i11));
            }
            if (i10 == -4) {
                return new f((PictureThreadUtils.f35206d * 2) + 1, (PictureThreadUtils.f35206d * 2) + 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("io", i11));
            }
            if (i10 == -2) {
                return new f(0, 128, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue4Util(true), new UtilsThreadFactory("cached", i11));
            }
            if (i10 == -1) {
                return new f(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory(C4254sd.f33526d, i11));
            }
            return new f(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue4Util(), new UtilsThreadFactory("fixed(" + i10 + ")", i11));
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        public void afterExecute(Runnable runnable, Throwable th2) {
            this.f35231b.decrementAndGet();
            super.afterExecute(runnable, th2);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.f35231b.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.f35232c.offer(runnable);
            } catch (Throwable unused2) {
                this.f35231b.decrementAndGet();
            }
        }
    }

    public static void d(e eVar) {
        if (eVar == null) {
            return;
        }
        eVar.d();
    }

    public static void e(ExecutorService executorService) {
        if (!(executorService instanceof f)) {
            Log.e("ThreadUtils", "The executorService is not ThreadUtils's pool.");
            return;
        }
        for (Map.Entry<e, ExecutorService> entry : f35205c.entrySet()) {
            if (entry.getValue() == executorService) {
                d(entry.getKey());
            }
        }
    }

    public static <T> void f(ExecutorService executorService, e<T> eVar) {
        g(executorService, eVar, 0L, 0L, null);
    }

    public static <T> void g(ExecutorService executorService, e<T> eVar, long j10, long j11, TimeUnit timeUnit) {
        Map<e, ExecutorService> map = f35205c;
        synchronized (map) {
            if (map.get(eVar) != null) {
                Log.e("ThreadUtils", "Task can only be executed once.");
                return;
            }
            map.put(eVar, executorService);
            if (j11 != 0) {
                eVar.n(true);
                f35207e.scheduleAtFixedRate(new b(executorService, eVar), timeUnit.toMillis(j10), timeUnit.toMillis(j11));
            } else if (j10 == 0) {
                executorService.execute(eVar);
            } else {
                f35207e.schedule(new a(executorService, eVar), timeUnit.toMillis(j10));
            }
        }
    }

    public static <T> void h(e<T> eVar) {
        f(k(-4), eVar);
    }

    public static Executor i() {
        if (f35208f == null) {
            f35208f = new c();
        }
        return f35208f;
    }

    public static ExecutorService j() {
        return k(-4);
    }

    public static ExecutorService k(int i10) {
        return l(i10, 5);
    }

    public static ExecutorService l(int i10, int i11) {
        ExecutorService executorServiceB;
        Map<Integer, Map<Integer, ExecutorService>> map = f35204b;
        synchronized (map) {
            Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i10));
            if (map2 == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                executorServiceB = f.b(i10, i11);
                concurrentHashMap.put(Integer.valueOf(i11), executorServiceB);
                map.put(Integer.valueOf(i10), concurrentHashMap);
            } else {
                executorServiceB = map2.get(Integer.valueOf(i11));
                if (executorServiceB == null) {
                    executorServiceB = f.b(i10, i11);
                    map2.put(Integer.valueOf(i11), executorServiceB);
                }
            }
        }
        return executorServiceB;
    }

    public static boolean m() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void n(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f35203a.post(runnable);
        }
    }
}
