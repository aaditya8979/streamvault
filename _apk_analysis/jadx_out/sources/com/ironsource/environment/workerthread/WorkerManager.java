package com.ironsource.environment.workerthread;

import com.ironsource.C4228r4;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class WorkerManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Callable<T>> f31643a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f31644b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j10);

        void onWorkFailed(String str);
    }

    public WorkerManager(@NotNull ExecutorService executorService) {
        this.f31644b = executorService;
    }

    public void addCallable(@NotNull Callable<T> callable) {
        this.f31643a.add(callable);
    }

    public void startWork(@NotNull WorkEndedListener<T> workEndedListener, long j10, @NotNull TimeUnit timeUnit) {
        if (this.f31644b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f31643a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.f31644b.invokeAll(this.f31643a, j10, timeUnit);
            for (int i10 = 0; i10 < listInvokeAll.size(); i10++) {
                Future<T> future = listInvokeAll.get(i10);
                if (!future.isDone() || future.isCancelled()) {
                    arrayList.add(new WorkerResult.Canceled(this.f31643a.get(i10)));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e10) {
                        e = e10;
                        C4228r4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f31643a.get(i10), e));
                    } catch (CancellationException e11) {
                        C4228r4.d().a(e11);
                        arrayList.add(new WorkerResult.Canceled(this.f31643a.get(i10)));
                    } catch (ExecutionException e12) {
                        e = e12;
                        C4228r4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f31643a.get(i10), e));
                    }
                }
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.f31644b.shutdownNow();
        } catch (Exception e13) {
            C4228r4.d().a(e13);
            IronLog.INTERNAL.error(e13.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e13.getMessage());
            this.f31644b.shutdownNow();
        }
    }
}
