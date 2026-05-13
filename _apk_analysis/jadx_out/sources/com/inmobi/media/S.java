package com.inmobi.media;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class S extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f26271a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u10, hn.c cVar) {
        super(1, cVar);
        this.f26271a = u10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new S(this.f26271a, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new S(this.f26271a, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        Object objA = H3.a(new Q(this.f26271a));
        U u10 = this.f26271a;
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objA);
        if (thM7537exceptionOrNullimpl != null) {
            u10.a(thM7537exceptionOrNullimpl);
        }
        return bn.r.f5635a;
    }
}
