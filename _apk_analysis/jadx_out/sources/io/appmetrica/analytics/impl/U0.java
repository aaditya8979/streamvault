package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public final class U0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f65970b;

    public U0(C5149u1 c5149u1, String str) {
        this.f65970b = c5149u1;
        this.f65969a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5273z0 c5273z0 = this.f65970b.f67758a;
        String str = this.f65969a;
        c5273z0.getClass();
        C5248y0.c().setUserProfileID(str);
    }
}
