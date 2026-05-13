package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class Yl extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go.l f26666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3643om f26667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yl(go.l lVar, hn.c cVar, C3643om c3643om) {
        super(2, cVar);
        this.f26666c = lVar;
        this.f26667d = c3643om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Yl yl2 = new Yl(this.f26666c, cVar, this.f26667d);
        yl2.f26665b = obj;
        return yl2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((Yl) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26664a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f26665b;
            go.l lVar = this.f26666c;
            Xl xl2 = new Xl(l0Var, this.f26667d);
            this.f26664a = 1;
            if (lVar.collect(xl2, this) == objG) {
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
