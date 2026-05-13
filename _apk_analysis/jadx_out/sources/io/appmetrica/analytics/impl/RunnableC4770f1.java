package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4770f1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f66721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66722b;

    public RunnableC4770f1(C5149u1 c5149u1, String str) {
        this.f66722b = c5149u1;
        this.f66721a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f66722b).b(this.f66721a);
    }
}
