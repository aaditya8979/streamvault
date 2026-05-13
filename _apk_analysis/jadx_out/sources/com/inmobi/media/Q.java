package com.inmobi.media;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Q extends FunctionReferenceImpl implements sn.a {
    public Q(Object obj) {
        super(0, obj, U.class, "calculateMetrics", "calculateMetrics()V", 0);
    }

    @Override // sn.a
    public final Object invoke() {
        U u10 = (U) this.receiver;
        u10.getClass();
        u10.f26402n = Ji.f25750d.get();
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        O o10 = u10.f26401m;
        wb2.getClass();
        tn.p.k(o10, "runnable");
        wb2.f26536a.postAtFrontOfQueue(o10);
        return bn.r.f5635a;
    }
}
