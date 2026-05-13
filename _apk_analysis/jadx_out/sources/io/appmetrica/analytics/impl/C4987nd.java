package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4987nd extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f67356a;

    public C4987nd(String str) {
        this.f67356a = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5273z0 c5273z0 = C4696c4.l().f66466p;
        String str = this.f67356a;
        c5273z0.getClass();
        C5248y0.c().a(str);
    }
}
