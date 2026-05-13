package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: loaded from: classes9.dex */
public final class Z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f66277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f66278b;

    public Z0(C5149u1 c5149u1, ECommerceEvent eCommerceEvent) {
        this.f66278b = c5149u1;
        this.f66277a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5149u1.a(this.f66278b).reportECommerce(this.f66277a);
    }
}
