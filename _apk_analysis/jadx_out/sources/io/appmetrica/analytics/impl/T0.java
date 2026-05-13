package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class T0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f65900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f65901b;

    public T0(C5149u1 c5149u1, boolean z10) {
        this.f65901b = c5149u1;
        this.f65900a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5273z0 c5273z0 = this.f65901b.f67758a;
        boolean z10 = this.f65900a;
        c5273z0.getClass();
        C5248y0.c().setDataSendingEnabled(z10);
    }
}
