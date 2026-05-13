package io.appmetrica.analytics.impl;

import android.app.Activity;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class RunnableC4897k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f67077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4948m f67078b;

    public RunnableC4897k(C4948m c4948m, Activity activity) {
        this.f67078b = c4948m;
        this.f67077a = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67078b.a(this.f67077a);
    }
}
