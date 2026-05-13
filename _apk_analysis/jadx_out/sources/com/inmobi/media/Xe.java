package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Xe extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3334cf f26593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rf f26594c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xe(C3334cf c3334cf, Rf rf2, hn.c cVar) {
        super(2, cVar);
        this.f26593b = c3334cf;
        this.f26594c = rf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Xe(this.f26593b, this.f26594c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Xe(this.f26593b, this.f26594c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26592a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3334cf c3334cf = this.f26593b;
            Rf rf2 = this.f26594c;
            We we2 = new We(c3334cf, null);
            this.f26592a = 1;
            if (c3334cf.a(rf2, we2, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
