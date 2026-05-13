package com.yandex.div.internal.viewpool;

import android.view.View;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import bn.r;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.UtilsKt;
import com.yandex.div.internal.viewpool.optimization.PerformanceDependentSessionProfiler;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: AdvanceViewPool.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AdvanceViewPool implements ViewPool {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final ViewPoolProfiler profiler;

    @NotNull
    private final PerformanceDependentSessionProfiler sessionProfiler;

    @NotNull
    private final ViewCreator viewCreator;

    @NotNull
    private final Map<String, Channel<? extends View>> viewFactories = new ArrayMap();

    /* JADX INFO: compiled from: AdvanceViewPool.kt */
    public static final class Channel<T extends View> implements ViewFactory<T> {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private volatile int capacity;
        private final boolean notEmpty;

        @Nullable
        private final ViewPoolProfiler profiler;

        @NotNull
        private AtomicInteger realQueueSize;

        @NotNull
        private final PerformanceDependentSessionProfiler sessionProfiler;

        @NotNull
        private final ViewCreator viewCreator;

        @NotNull
        private final ViewFactory<T> viewFactory;

        @NotNull
        private final String viewName;

        @NotNull
        private final BlockingQueue<T> viewQueue = new LinkedBlockingQueue();

        @NotNull
        private final AtomicBoolean stopped = new AtomicBoolean(false);

        /* JADX INFO: compiled from: AdvanceViewPool.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }
        }

        public Channel(@NotNull String str, @Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler performanceDependentSessionProfiler, @NotNull ViewFactory<T> viewFactory, @NotNull ViewCreator viewCreator, int i10) {
            this.viewName = str;
            this.profiler = viewPoolProfiler;
            this.sessionProfiler = performanceDependentSessionProfiler;
            this.viewFactory = viewFactory;
            this.viewCreator = viewCreator;
            this.realQueueSize = new AtomicInteger(i10);
            this.notEmpty = !r1.isEmpty();
            this.capacity = i10;
            for (int i11 = 0; i11 < i10; i11++) {
                this.viewCreator.request$div_release(this, 0);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @AnyThread
        public final T extractViewBlocked() {
            try {
                this.viewCreator.promote$div_release(this);
                T tPoll = this.viewQueue.poll(16L, TimeUnit.MILLISECONDS);
                if (tPoll != null) {
                    this.realQueueSize.decrementAndGet();
                } else {
                    tPoll = (T) this.viewFactory.createView();
                }
                return tPoll;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return (T) this.viewFactory.createView();
            }
        }

        private final void requestViewCreation() {
            if (this.capacity <= this.realQueueSize.get()) {
                return;
            }
            Companion companion = AdvanceViewPool.Companion;
            long jNanoTime = System.nanoTime();
            this.viewCreator.request$div_release(this, this.viewQueue.size());
            this.realQueueSize.incrementAndGet();
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            ViewPoolProfiler viewPoolProfiler = this.profiler;
            if (viewPoolProfiler != null) {
                viewPoolProfiler.onViewRequested$div_release(jNanoTime2);
            }
        }

        @WorkerThread
        public final void createAndEnqueueView() {
            if (this.stopped.get()) {
                return;
            }
            try {
                this.viewQueue.offer((T) this.viewFactory.createView());
            } catch (Exception unused) {
            }
        }

        @Override // com.yandex.div.internal.viewpool.ViewFactory
        @NotNull
        public T createView() {
            return (T) extractView();
        }

        @AnyThread
        @NotNull
        public final T extractView() {
            Companion companion = AdvanceViewPool.Companion;
            long jNanoTime = System.nanoTime();
            Object objPoll = this.viewQueue.poll();
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            if (objPoll == null) {
                long jNanoTime3 = System.nanoTime();
                objPoll = extractViewBlocked();
                long jNanoTime4 = System.nanoTime() - jNanoTime3;
                ViewPoolProfiler viewPoolProfiler = this.profiler;
                if (viewPoolProfiler != null) {
                    viewPoolProfiler.onViewObtainedWithBlock$div_release(this.viewName, jNanoTime4);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler = this.sessionProfiler;
                this.viewQueue.size();
                PerformanceDependentSessionProfiler.access$getSession$p(performanceDependentSessionProfiler);
            } else {
                this.realQueueSize.decrementAndGet();
                ViewPoolProfiler viewPoolProfiler2 = this.profiler;
                if (viewPoolProfiler2 != null) {
                    viewPoolProfiler2.onViewObtainedWithoutBlock$div_release(jNanoTime2);
                }
                PerformanceDependentSessionProfiler performanceDependentSessionProfiler2 = this.sessionProfiler;
                this.viewQueue.size();
                PerformanceDependentSessionProfiler.access$getSession$p(performanceDependentSessionProfiler2);
            }
            requestViewCreation();
            p.h(objPoll);
            return (T) objPoll;
        }

        public final boolean getNotEmpty() {
            return this.notEmpty;
        }

        @NotNull
        public final String getViewName() {
            return this.viewName;
        }
    }

    /* JADX INFO: compiled from: AdvanceViewPool.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public AdvanceViewPool(@Nullable ViewPoolProfiler viewPoolProfiler, @NotNull PerformanceDependentSessionProfiler performanceDependentSessionProfiler, @NotNull ViewCreator viewCreator) {
        this.profiler = viewPoolProfiler;
        this.sessionProfiler = performanceDependentSessionProfiler;
        this.viewCreator = viewCreator;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    @NotNull
    public <T extends View> T obtain(@NotNull String str) {
        Channel channel;
        synchronized (this.viewFactories) {
            channel = (Channel) UtilsKt.getOrThrow(this.viewFactories, str, "Factory is not registered");
        }
        T t10 = (T) channel.createView();
        p.i(t10, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.AdvanceViewPool.obtain");
        return t10;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @AnyThread
    public <T extends View> void register(@NotNull String str, @NotNull ViewFactory<T> viewFactory, int i10) {
        synchronized (this.viewFactories) {
            if (this.viewFactories.containsKey(str)) {
                Assert.fail("Factory is already registered");
            } else {
                this.viewFactories.put(str, new Channel<>(str, this.profiler, this.sessionProfiler, viewFactory, this.viewCreator, i10));
                r rVar = r.f5635a;
            }
        }
    }
}
