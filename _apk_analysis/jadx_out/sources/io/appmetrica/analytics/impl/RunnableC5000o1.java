package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC5000o1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f67389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67390b;

    public RunnableC5000o1(C5149u1 c5149u1, String str) {
        this.f67390b = c5149u1;
        this.f67389a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f67390b).reportEvent(this.f67389a);
    }
}
