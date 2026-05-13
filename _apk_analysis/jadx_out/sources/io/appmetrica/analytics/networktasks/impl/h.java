package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f68261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f68262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f68263c;

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f68261a = networkTask;
        this.f68262b = interruptionSafeThread;
        this.f68263c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.networktasks.impl.h.run():void");
    }
}
