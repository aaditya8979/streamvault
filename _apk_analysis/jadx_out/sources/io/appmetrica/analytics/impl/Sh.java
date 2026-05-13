package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: loaded from: classes6.dex */
public final class Sh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f65881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65882b;

    public Sh(C4839hi c4839hi, ECommerceEvent eCommerceEvent) {
        this.f65882b = c4839hi;
        this.f65881a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65882b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportECommerce(this.f65881a);
    }
}
