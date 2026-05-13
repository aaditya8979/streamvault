package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: loaded from: classes.dex */
public final class Ph implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f65752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65753b;

    public Ph(C4839hi c4839hi, Revenue revenue) {
        this.f65753b = c4839hi;
        this.f65752a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65753b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportRevenue(this.f65752a);
    }
}
