package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class D0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sn.a f25284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(long j10, sn.a aVar, hn.c cVar) {
        super(2, cVar);
        this.f25283b = j10;
        this.f25284c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new D0(this.f25283b, this.f25284c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new D0(this.f25283b, this.f25284c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25282a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            long j10 = this.f25283b;
            this.f25282a = 1;
            if (p000do.s0.a(j10, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        this.f25284c.invoke();
        return bn.r.f5635a;
    }
}
