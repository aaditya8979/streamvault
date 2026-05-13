package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: loaded from: classes9.dex */
public final class X0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f66140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66141b;

    public X0(C5149u1 c5149u1, Revenue revenue) {
        this.f66141b = c5149u1;
        this.f66140a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f66141b).reportRevenue(this.f66140a);
    }
}
