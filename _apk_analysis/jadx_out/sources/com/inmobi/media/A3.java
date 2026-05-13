package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class A3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p000do.p0 f25136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sn.l f25137c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(p000do.p0 p0Var, sn.l lVar, hn.c cVar) {
        super(2, cVar);
        this.f25136b = p0Var;
        this.f25137c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new A3(this.f25136b, this.f25137c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new A3(this.f25136b, this.f25137c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25135a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.p0 p0Var = this.f25136b;
            this.f25135a = 1;
            obj = p0Var.N(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        if (obj != null) {
            this.f25137c.invoke(obj);
        }
        return bn.r.f5635a;
    }
}
