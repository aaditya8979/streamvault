package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4693c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f66447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f66448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66449c;

    public RunnableC4693c1(C5149u1 c5149u1, String str, String str2) {
        this.f66449c = c5149u1;
        this.f66447a = str;
        this.f66448b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5273z0 c5273z0 = this.f66449c.f67758a;
        String str = this.f66447a;
        String str2 = this.f66448b;
        c5273z0.getClass();
        C5248y0.c().a(str, str2);
    }
}
