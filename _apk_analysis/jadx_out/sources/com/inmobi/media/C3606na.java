package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3606na extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3631oa f27677a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3606na(ViewTreeObserverOnGlobalLayoutListenerC3631oa viewTreeObserverOnGlobalLayoutListenerC3631oa, hn.c cVar) {
        super(2, cVar);
        this.f27677a = viewTreeObserverOnGlobalLayoutListenerC3631oa;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3606na(this.f27677a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3606na(this.f27677a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        p000do.t tVar = this.f27677a.f27771e;
        bn.r rVar = bn.r.f5635a;
        tVar.n(rVar);
        return rVar;
    }
}
