package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkCore extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f68288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f68289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f68290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f68291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f68292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final IExecutionPolicy f68293f;

    public NetworkCore(@NonNull IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    public NetworkCore(IExecutionPolicy iExecutionPolicy, g gVar) {
        this.f68288a = new LinkedBlockingQueue();
        this.f68289b = new Object();
        this.f68290c = new Object();
        this.f68293f = iExecutionPolicy;
        this.f68292e = gVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        NetworkTask networkTask = null;
        while (isRunning()) {
            try {
                synchronized (this.f68290c) {
                }
                this.f68291d = (d) this.f68288a.take();
                networkTask = this.f68291d.f68259a;
                Executor executor = networkTask.getExecutor();
                this.f68292e.getClass();
                executor.execute(new h(networkTask, this, new f()));
                networkTask.onTaskFinished();
                synchronized (this.f68290c) {
                    this.f68291d = null;
                }
            } catch (InterruptedException unused) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f68290c) {
                        this.f68291d = null;
                    }
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                if (networkTask != null) {
                    networkTask.onTaskFinished();
                    synchronized (this.f68290c) {
                        this.f68291d = null;
                        networkTask.onTaskRemoved();
                    }
                }
                throw th2;
            }
            networkTask.onTaskRemoved();
        }
    }

    public void startTask(NetworkTask networkTask) {
        if (this.f68293f.canBeExecuted()) {
            synchronized (this.f68289b) {
                d dVar = new d(networkTask);
                if (isRunning() && !this.f68288a.contains(dVar) && !dVar.equals(this.f68291d) && networkTask.onTaskAdded()) {
                    this.f68288a.offer(dVar);
                }
            }
        }
    }

    public void stopTasks() {
        synchronized (this.f68290c) {
            ArrayList arrayList = new ArrayList(this.f68288a.size());
            this.f68288a.drainTo(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f68259a.onTaskRemoved();
            }
        }
    }
}
