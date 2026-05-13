package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC5223x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5248y0 f67916a;

    public RunnableC5223x0(C5248y0 c5248y0) {
        this.f67916a = c5248y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4696c4.l().f66453c.a().executeDelayed(new RunnableC5199w1(this.f67916a.f67998a), TimeUnit.SECONDS.toMillis(5L));
    }
}
