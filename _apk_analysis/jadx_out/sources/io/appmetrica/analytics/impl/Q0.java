package io.appmetrica.analytics.impl;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f65777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5149u1 f65778b;

    public Q0(C5149u1 c5149u1, Location location) {
        this.f65778b = c5149u1;
        this.f65777a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5273z0 c5273z0 = this.f65778b.f67758a;
        Location location = this.f65777a;
        c5273z0.getClass();
        C5248y0.c().a(location);
    }
}
