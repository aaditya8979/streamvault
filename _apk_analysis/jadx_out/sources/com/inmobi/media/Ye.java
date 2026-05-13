package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class Ye extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3334cf f26644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ye(C3334cf c3334cf, hn.c cVar) {
        super(2, cVar);
        this.f26644b = c3334cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Ye(this.f26644b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Ye(this.f26644b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26643a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3334cf c3334cf = this.f26644b;
            this.f26643a = 1;
            if (c3334cf.c(this) == objG) {
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
