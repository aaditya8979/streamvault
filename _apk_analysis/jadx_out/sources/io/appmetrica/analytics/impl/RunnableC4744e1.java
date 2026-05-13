package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC4744e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f66641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f66642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66643c;

    public RunnableC4744e1(C5149u1 c5149u1, String str, String str2) {
        this.f66643c = c5149u1;
        this.f66641a = str;
        this.f66642b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f66643c).b(this.f66641a, this.f66642b);
    }
}
