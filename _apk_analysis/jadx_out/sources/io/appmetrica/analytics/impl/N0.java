package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public final class N0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f65612b;

    public N0(C5149u1 c5149u1, String str) {
        this.f65612b = c5149u1;
        this.f65611a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f65612b.d().f67120b.a(this.f65611a, false);
    }
}
