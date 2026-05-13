package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4911kd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5012od f67121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f67122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67123c;

    public C4911kd(C5012od c5012od, int i10, String str) {
        this.f67121a = c5012od;
        this.f67122b = i10;
        this.f67123c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5012od.a(this.f67121a).a(new G9(this.f67122b, this.f67123c));
    }
}
