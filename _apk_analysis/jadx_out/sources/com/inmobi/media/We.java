package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class We extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3334cf f26540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public We(C3334cf c3334cf, hn.c cVar) {
        super(2, cVar);
        this.f26540c = c3334cf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        We we2 = new We(this.f26540c, cVar);
        we2.f26539b = obj;
        return we2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        We we2 = new We(this.f26540c, (hn.c) obj2);
        we2.f26539b = (Xf) obj;
        return we2.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26538a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Xf xf2 = (Xf) this.f26539b;
            C3334cf c3334cf = this.f26540c;
            this.f26538a = 1;
            Object objA = c3334cf.f26711b.a(xf2, this);
            if (objA != in.a.g()) {
                objA = bn.r.f5635a;
            }
            if (objA == objG) {
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
