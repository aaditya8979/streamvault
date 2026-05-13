package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC5025p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f67487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f67488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67489c;

    public RunnableC5025p1(C5149u1 c5149u1, String str, String str2) {
        this.f67489c = c5149u1;
        this.f67487a = str;
        this.f67488b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f67489c).reportEvent(this.f67487a, this.f67488b);
    }
}
