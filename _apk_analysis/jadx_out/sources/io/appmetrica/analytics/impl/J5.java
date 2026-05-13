package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.impl.J5;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class J5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f65429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f65430b = C5009oa.k().w().a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f65431c = C5009oa.k().a();

    public J5(List list) {
        this.f65429a = list;
    }

    public static final void a(J5 j52) {
        Iterator it = j52.f65429a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f65431c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f65430b, new ActivationBarrierCallback() { // from class: mh.d
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                J5.a(this.f74260a);
            }
        });
    }
}
