package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC4974n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5024p0 f67316a;

    public RunnableC4974n0(C5024p0 c5024p0) {
        this.f67316a = c5024p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5024p0 c5024p0 = this.f67316a;
        synchronized (c5024p0) {
            if (c5024p0.f67477a != null && c5024p0.a()) {
                try {
                    c5024p0.f67480d = null;
                    c5024p0.f67477a.unbindService(c5024p0.f67486j);
                } catch (Throwable unused) {
                }
            }
            c5024p0.f67480d = null;
        }
    }
}
