package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4667b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f66407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66408b;

    public RunnableC4667b1(C5149u1 c5149u1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f66408b = c5149u1;
        this.f66407a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f66408b.f67758a.getClass();
        C5248y0 c5248y0 = C5248y0.f67995e;
        c5248y0.f().a(this.f66407a);
    }
}
