package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class Fa extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fa(int i10, hn.c cVar) {
        super(2, cVar);
        this.f25428b = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Fa(this.f25428b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Fa(this.f25428b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25427a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        N9 n92 = (N9) P9.f26117a.getValue();
        int i11 = this.f25428b;
        this.f25427a = 1;
        Object objB = n92.b(i11, this);
        return objB == objG ? objG : objB;
    }
}
