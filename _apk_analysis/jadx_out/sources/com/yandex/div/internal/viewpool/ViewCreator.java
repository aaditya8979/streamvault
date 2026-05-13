package com.yandex.div.internal.viewpool;

import android.os.Process;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.util.Cancelable;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.AdvanceViewPool;
import java.util.PriorityQueue;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;
import tn.t;
import wn.d;

/* JADX INFO: compiled from: ViewCreator.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewCreator {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ViewCreatorThread creatorThread;

    /* JADX INFO: compiled from: ViewCreator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ViewCreator.kt */
    public static final class CreateViewTask implements Runnable, Comparable<CreateViewTask> {
        public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {t.i(new PropertyReference1Impl(CreateViewTask.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0))};

        @NotNull
        private final d channelRef$delegate;
        private final int priority;

        @NotNull
        private final String viewName;

        public CreateViewTask(@NotNull AdvanceViewPool.Channel<?> channel, int i10) {
            this.priority = i10;
            this.viewName = channel.getViewName();
            this.channelRef$delegate = UtilsKt.weak(channel);
        }

        private final AdvanceViewPool.Channel<?> getChannelRef() {
            return (AdvanceViewPool.Channel) this.channelRef$delegate.getValue(this, $$delegatedProperties[0]);
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull CreateViewTask createViewTask) {
            int i10 = this.priority - createViewTask.priority;
            return i10 != 0 ? i10 : !p.f(this.viewName, createViewTask.viewName) ? 1 : 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!p.f(CreateViewTask.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            p.i(obj, "null cannot be cast to non-null type com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask");
            CreateViewTask createViewTask = (CreateViewTask) obj;
            return p.f(this.viewName, createViewTask.viewName) && this.priority == createViewTask.priority;
        }

        @NotNull
        public final String getViewName() {
            return this.viewName;
        }

        public int hashCode() {
            return ((6913 + this.priority) * 31) + this.viewName.hashCode();
        }

        @Override // java.lang.Runnable
        public void run() {
            AdvanceViewPool.Channel<?> channelRef = getChannelRef();
            if (channelRef != null) {
                channelRef.createAndEnqueueView();
            }
        }
    }

    /* JADX INFO: compiled from: ViewCreator.kt */
    public static final class ViewCreatorThread extends Thread {

        @NotNull
        private final CpuUsageHistogramReporter cpuUsageHistogramReporter;

        @Nullable
        private volatile String currentViewName;

        @NotNull
        private final BatchBlockingQueue<CreateViewTask> taskQueue;

        public ViewCreatorThread(@NotNull String str, @NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
            super(str);
            this.cpuUsageHistogramReporter = cpuUsageHistogramReporter;
            this.taskQueue = new BatchBlockingQueue<>(new PriorityQueue(32));
            setPriority(5);
        }

        private final void createView() throws InterruptedException {
            CreateViewTask createViewTaskPoll = this.taskQueue.poll();
            if (createViewTaskPoll == null) {
                try {
                    setPriority(3);
                    createViewTaskPoll = this.taskQueue.take();
                } finally {
                    setPriority(5);
                }
            }
            this.currentViewName = createViewTaskPoll.getViewName();
            createViewTaskPoll.run();
            this.currentViewName = null;
        }

        @Nullable
        public final String getCurrentViewName() {
            return this.currentViewName;
        }

        @NotNull
        public final BatchBlockingQueue<CreateViewTask> getTaskQueue() {
            return this.taskQueue;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Cancelable cancelableStartReporting = this.cpuUsageHistogramReporter.startReporting("Div.ViewPool.CPU", Process.myTid());
            while (true) {
                try {
                    try {
                        createView();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        cancelableStartReporting.cancel();
                        return;
                    }
                } catch (Throwable th2) {
                    cancelableStartReporting.cancel();
                    throw th2;
                }
            }
        }
    }

    public ViewCreator(@NotNull CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        ViewCreatorThread viewCreatorThread = new ViewCreatorThread("ViewPoolThread", cpuUsageHistogramReporter);
        this.creatorThread = viewCreatorThread;
        viewCreatorThread.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        r2.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void promote$div_release(@org.jetbrains.annotations.NotNull com.yandex.div.internal.viewpool.AdvanceViewPool.Channel<?> r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getViewName()
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r1 = r5.creatorThread
            java.lang.String r1 = r1.getCurrentViewName()
            boolean r0 = tn.p.f(r0, r1)
            if (r0 != 0) goto La8
            boolean r0 = r6.getNotEmpty()
            if (r0 == 0) goto L18
            goto La8
        L18:
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r0 = r5.creatorThread
            com.yandex.div.internal.viewpool.BatchBlockingQueue r0 = r0.getTaskQueue()
            java.util.concurrent.locks.ReentrantLock r1 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r0)
            r1.lock()
            java.lang.String r1 = r6.getViewName()     // Catch: java.lang.Throwable -> L9f
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r2 = r5.creatorThread     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = r2.getCurrentViewName()     // Catch: java.lang.Throwable -> L9f
            boolean r1 = tn.p.f(r1, r2)     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L97
            boolean r1 = r6.getNotEmpty()     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto L3c
            goto L97
        L3c:
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r1 = r5.creatorThread     // Catch: java.lang.Throwable -> L9f
            com.yandex.div.internal.viewpool.BatchBlockingQueue r1 = r1.getTaskQueue()     // Catch: java.lang.Throwable -> L9f
            java.util.concurrent.locks.ReentrantLock r2 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r1)     // Catch: java.lang.Throwable -> L9f
            r2.lock()     // Catch: java.lang.Throwable -> L9f
            java.util.Queue r2 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getQueue$p(r1)     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8e
        L51:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L8e
            com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask r3 = (com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask) r3     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = r3.getViewName()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r4 = r6.getViewName()     // Catch: java.lang.Throwable -> L8e
            boolean r3 = tn.p.f(r3, r4)     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L51
            r2.remove()     // Catch: java.lang.Throwable -> L8e
        L6e:
            java.util.concurrent.locks.ReentrantLock r1 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r1)     // Catch: java.lang.Throwable -> L9f
            r1.unlock()     // Catch: java.lang.Throwable -> L9f
            com.yandex.div.internal.viewpool.ViewCreator$ViewCreatorThread r1 = r5.creatorThread     // Catch: java.lang.Throwable -> L9f
            com.yandex.div.internal.viewpool.BatchBlockingQueue r1 = r1.getTaskQueue()     // Catch: java.lang.Throwable -> L9f
            com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask r2 = new com.yandex.div.internal.viewpool.ViewCreator$CreateViewTask     // Catch: java.lang.Throwable -> L9f
            r3 = -1
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L9f
            r1.offer(r2)     // Catch: java.lang.Throwable -> L9f
            bn.r r6 = bn.r.f5635a     // Catch: java.lang.Throwable -> L9f
            java.util.concurrent.locks.ReentrantLock r6 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r0)
            r6.unlock()
            return
        L8e:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r1)     // Catch: java.lang.Throwable -> L9f
            r1.unlock()     // Catch: java.lang.Throwable -> L9f
            throw r6     // Catch: java.lang.Throwable -> L9f
        L97:
            java.util.concurrent.locks.ReentrantLock r6 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r0)
            r6.unlock()
            return
        L9f:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = com.yandex.div.internal.viewpool.BatchBlockingQueue.access$getLock$p(r0)
            r0.unlock()
            throw r6
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.viewpool.ViewCreator.promote$div_release(com.yandex.div.internal.viewpool.AdvanceViewPool$Channel):void");
    }

    public final void request$div_release(@NotNull AdvanceViewPool.Channel<?> channel, int i10) {
        this.creatorThread.getTaskQueue().offer(new CreateViewTask(channel, i10));
    }
}
