package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC5074r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f67603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f67604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67605c;

    public RunnableC5074r1(C5149u1 c5149u1, String str, Throwable th2) {
        this.f67605c = c5149u1;
        this.f67603a = str;
        this.f67604b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f67605c).reportError(this.f67603a, this.f67604b);
    }
}
