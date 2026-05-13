package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC5099s1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f67655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f67656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f67657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f67658d;

    public RunnableC5099s1(C5149u1 c5149u1, String str, String str2, Throwable th2) {
        this.f67658d = c5149u1;
        this.f67655a = str;
        this.f67656b = str2;
        this.f67657c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f67658d).reportError(this.f67655a, this.f67656b, this.f67657c);
    }
}
