package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class W0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66061a;

    public W0(C5149u1 c5149u1) {
        this.f66061a = c5149u1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f66061a).sendEventsBuffer();
    }
}
