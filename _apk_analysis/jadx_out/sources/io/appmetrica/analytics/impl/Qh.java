package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes.dex */
public final class Qh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f65818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4839hi f65819b;

    public Qh(C4839hi c4839hi, AdRevenue adRevenue) {
        this.f65819b = c4839hi;
        this.f65818a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4839hi c4839hi = this.f65819b;
        C4839hi.a(c4839hi.f66922a, c4839hi.f66925d, c4839hi.f66926e).reportAdRevenue(this.f65818a);
    }
}
