package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3330cb extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3356db f26925a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3330cb(C3356db c3356db, hn.c cVar) {
        super(2, cVar);
        this.f26925a = c3356db;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3330cb(this.f26925a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3330cb(this.f26925a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3356db c3356db = this.f26925a;
        Hc hc2 = c3356db.f27029f;
        InMobiAdRequestStatus inMobiAdRequestStatus = c3356db.f27028e;
        hc2.getClass();
        tn.p.k(inMobiAdRequestStatus, "status");
        hc2.onAdLoadFailed(inMobiAdRequestStatus);
        return bn.r.f5635a;
    }
}
