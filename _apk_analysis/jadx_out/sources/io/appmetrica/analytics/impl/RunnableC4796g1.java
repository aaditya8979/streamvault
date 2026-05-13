package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4796g1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f66806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f66807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66808c;

    public RunnableC4796g1(C5149u1 c5149u1, String str, String str2) {
        this.f66808c = c5149u1;
        this.f66806a = str;
        this.f66807b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5273z0 c5273z0 = this.f66808c.f67758a;
        String str = this.f66806a;
        String str2 = this.f66807b;
        c5273z0.getClass();
        C5248y0.c().putAppEnvironmentValue(str, str2);
    }
}
