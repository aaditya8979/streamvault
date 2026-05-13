package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Xk extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26600a;

    public Xk(hn.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new Xk(cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new Xk((hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26600a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            String strB = Ji.b();
            if (strB == null) {
                return bn.r.f5635a;
            }
            if (!tn.p.f(strB, Ji.f25749c)) {
                C3476i4 c3476i4 = Y3.f26611a;
                this.f26600a = 1;
                Object objA = C3431g9.a(((C3271a4) Y3.f26611a.f27330b.f27381b.getValue()).f26736a, "config_db", null, this, 6);
                if (objA != in.a.g()) {
                    objA = bn.r.f5635a;
                }
                if (objA != in.a.g()) {
                    objA = bn.r.f5635a;
                }
                if (objA != in.a.g()) {
                    objA = bn.r.f5635a;
                }
                if (objA == objG) {
                    return objG;
                }
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
