package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class Zf implements Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4785fg f66303a;

    public Zf(C4785fg c4785fg) {
        this.f66303a = c4785fg;
    }

    @Override // io.appmetrica.analytics.impl.Xf
    @WorkerThread
    public final void a() {
        C4785fg c4785fg = this.f66303a;
        Aa aa2 = c4785fg.f66781b;
        Yf yf2 = new Yf(c4785fg);
        aa2.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC5283za(aa2));
            C5009oa.I.f67421d.f67240a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + Ad.f64974a.incrementAndGet()).start();
            C5015og c5015og = (C5015og) futureTask.get(5L, TimeUnit.SECONDS);
            mo.a(aa2.f64973b);
            C4785fg.a(c4785fg, c5015og, C4785fg.a(c4785fg));
        } catch (Throwable th2) {
            try {
                yf2.a(th2);
            } finally {
                mo.a(aa2.f64973b);
            }
        }
    }
}
