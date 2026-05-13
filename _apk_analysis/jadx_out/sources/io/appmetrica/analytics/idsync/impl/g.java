package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements ActivationBarrierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f64890a;

    public g(h hVar) {
        this.f64890a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        f fVar = this.f64890a.f64897g;
        if (fVar == null) {
            tn.p.C("syncRunnable");
            fVar = null;
        }
        fVar.run();
    }
}
