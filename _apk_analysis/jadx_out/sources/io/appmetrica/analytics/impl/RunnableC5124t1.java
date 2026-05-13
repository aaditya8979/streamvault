package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC5124t1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f67710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67711b;

    public RunnableC5124t1(C5149u1 c5149u1, Throwable th2) {
        this.f67711b = c5149u1;
        this.f67710a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f67711b).reportUnhandledException(this.f67710a);
    }
}
