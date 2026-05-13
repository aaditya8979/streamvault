package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes9.dex */
public final class Y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f66208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66209b;

    public Y0(C5149u1 c5149u1, AdRevenue adRevenue) {
        this.f66209b = c5149u1;
        this.f66208a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f66209b).reportAdRevenue(this.f66208a);
    }
}
