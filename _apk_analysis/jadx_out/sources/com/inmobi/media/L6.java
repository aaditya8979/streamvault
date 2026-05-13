package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class L6 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M6 f25858a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L6(M6 m62, hn.c cVar) {
        super(2, cVar);
        this.f25858a = m62;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new L6(this.f25858a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new L6(this.f25858a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        M6 m62 = this.f25858a;
        Hc hc2 = m62.f25934f;
        InMobiAdRequestStatus inMobiAdRequestStatus = m62.f25933e;
        hc2.getClass();
        tn.p.k(inMobiAdRequestStatus, "status");
        hc2.onAdLoadFailed(inMobiAdRequestStatus);
        return bn.r.f5635a;
    }
}
