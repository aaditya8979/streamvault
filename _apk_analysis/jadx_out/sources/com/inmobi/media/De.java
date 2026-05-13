package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class De extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go.u f25322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn.l f25323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public De(go.u uVar, hn.c cVar, sn.l lVar) {
        super(2, cVar);
        this.f25322c = uVar;
        this.f25323d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        De de2 = new De(this.f25322c, cVar, this.f25323d);
        de2.f25321b = obj;
        return de2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((De) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25320a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f25321b;
            go.u uVar = this.f25322c;
            Ce ce2 = new Ce(l0Var, this.f25323d);
            this.f25320a = 1;
            if (uVar.collect(ce2, this) == objG) {
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
