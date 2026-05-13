package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4641a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f66329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66330b;

    public RunnableC4641a1(C5149u1 c5149u1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f66330b = c5149u1;
        this.f66329a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f66330b.f67758a.getClass();
        C5248y0 c5248y0 = C5248y0.f67995e;
        c5248y0.f().a(this.f66329a);
    }
}
