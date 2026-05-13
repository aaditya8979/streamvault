package ar;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ExecutorThreadPool.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends uq.a implements d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final vq.c f5261l = vq.b.a(a.class);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ExecutorService f5262k;

    public a() {
        this(new ThreadPoolExecutor(256, 256, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue()));
    }

    public a(ExecutorService executorService) {
        this.f5262k = executorService;
    }

    @Override // ar.d
    public boolean B() {
        ExecutorService executorService = this.f5262k;
        if (!(executorService instanceof ThreadPoolExecutor)) {
            return false;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        return threadPoolExecutor.getPoolSize() == threadPoolExecutor.getMaximumPoolSize() && threadPoolExecutor.getQueue().size() >= threadPoolExecutor.getPoolSize() - threadPoolExecutor.getActiveCount();
    }

    @Override // ar.d
    public boolean Z(Runnable runnable) {
        try {
            this.f5262k.execute(runnable);
            return true;
        } catch (RejectedExecutionException e10) {
            f5261l.e(e10);
            return false;
        }
    }

    @Override // uq.a
    public void e0() throws Exception {
        super.e0();
        this.f5262k.shutdownNow();
    }
}
