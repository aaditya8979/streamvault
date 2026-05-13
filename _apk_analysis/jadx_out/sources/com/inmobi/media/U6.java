package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class U6 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V6 f26419c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(V6 v62, hn.c cVar) {
        super(2, cVar);
        this.f26419c = v62;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        U6 u62 = new U6(this.f26419c, cVar);
        u62.f26418b = obj;
        return u62;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        U6 u62 = new U6(this.f26419c, (hn.c) obj2);
        u62.f26418b = (p000do.l0) obj;
        return u62.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p000do.l0 l0Var;
        Object objG = in.a.g();
        int i10 = this.f26417a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            l0Var = (p000do.l0) this.f26418b;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0Var = (p000do.l0) this.f26418b;
            kotlin.c.b(obj);
        }
        while (kotlinx.coroutines.d.h(l0Var)) {
            V6 v62 = this.f26419c;
            v62.f26485d.setValue(jn.a.a(v62.f26483b.getWindowVisibility() == 0));
            long j10 = this.f26419c.f26484c;
            this.f26418b = l0Var;
            this.f26417a = 1;
            if (p000do.s0.a(j10, this) == objG) {
                return objG;
            }
        }
        return bn.r.f5635a;
    }
}
