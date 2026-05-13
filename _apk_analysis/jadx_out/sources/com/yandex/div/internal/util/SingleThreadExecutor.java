package com.yandex.div.internal.util;

import bn.r;
import com.yandex.div.internal.Assert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: SingleThreadExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SingleThreadExecutor {

    @Nullable
    private Worker currentWorker;

    @NotNull
    private final Executor executor;

    @NotNull
    private final Object monitor = new Object();

    @Nullable
    private List<Runnable> passedTasks;

    @NotNull
    private final String threadNameSuffix;

    /* JADX INFO: compiled from: SingleThreadExecutor.kt */
    public final class Worker extends NamedRunnable {
        public Worker() {
            super(SingleThreadExecutor.this.threadNameSuffix);
        }

        @Override // com.yandex.div.internal.util.NamedRunnable
        public void execute() {
            Object obj = SingleThreadExecutor.this.monitor;
            SingleThreadExecutor singleThreadExecutor = SingleThreadExecutor.this;
            synchronized (obj) {
                if (p.f(singleThreadExecutor.currentWorker, this) && singleThreadExecutor.passedTasks != null) {
                    List list = singleThreadExecutor.passedTasks;
                    singleThreadExecutor.passedTasks = null;
                    r rVar = r.f5635a;
                    boolean z10 = true;
                    while (z10) {
                        if (list != null) {
                            try {
                                SingleThreadExecutor singleThreadExecutor2 = SingleThreadExecutor.this;
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((Runnable) it.next()).run();
                                    } catch (RuntimeException e10) {
                                        singleThreadExecutor2.handleError(e10);
                                    }
                                }
                            } catch (Throwable th2) {
                                Object obj2 = SingleThreadExecutor.this.monitor;
                                SingleThreadExecutor singleThreadExecutor3 = SingleThreadExecutor.this;
                                synchronized (obj2) {
                                    singleThreadExecutor3.currentWorker = null;
                                    r rVar2 = r.f5635a;
                                    throw th2;
                                }
                            }
                        }
                        Object obj3 = SingleThreadExecutor.this.monitor;
                        SingleThreadExecutor singleThreadExecutor4 = SingleThreadExecutor.this;
                        synchronized (obj3) {
                            if (singleThreadExecutor4.passedTasks != null) {
                                list = singleThreadExecutor4.passedTasks;
                                singleThreadExecutor4.passedTasks = null;
                            } else {
                                singleThreadExecutor4.currentWorker = null;
                                z10 = false;
                            }
                            r rVar3 = r.f5635a;
                        }
                    }
                    return;
                }
                Assert.fail("We shouldn't create excessive workers");
            }
        }
    }

    public SingleThreadExecutor(@NotNull Executor executor, @NotNull String str) {
        this.executor = executor;
        this.threadNameSuffix = str;
    }

    private final void addTaskLocked(Runnable runnable) {
        if (this.passedTasks == null) {
            this.passedTasks = new ArrayList(2);
        }
        List<Runnable> list = this.passedTasks;
        if (list != null) {
            list.add(runnable);
        }
    }

    public abstract void handleError(@NotNull RuntimeException runtimeException);

    public final void post(@NotNull Runnable runnable) {
        Worker worker;
        synchronized (this.monitor) {
            addTaskLocked(runnable);
            if (this.currentWorker == null) {
                worker = new Worker();
                this.currentWorker = worker;
            } else {
                worker = null;
            }
            r rVar = r.f5635a;
        }
        if (worker != null) {
            this.executor.execute(worker);
        }
    }
}
