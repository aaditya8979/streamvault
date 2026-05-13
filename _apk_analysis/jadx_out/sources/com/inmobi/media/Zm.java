package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class Zm extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go.k f26724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3316bn f26725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zm(go.k kVar, hn.c cVar, C3316bn c3316bn) {
        super(2, cVar);
        this.f26724c = kVar;
        this.f26725d = c3316bn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Zm zm2 = new Zm(this.f26724c, cVar, this.f26725d);
        zm2.f26723b = obj;
        return zm2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((Zm) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26722a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f26723b;
            go.k kVar = this.f26724c;
            Ym ym2 = new Ym(l0Var, this.f26725d);
            this.f26722a = 1;
            if (kVar.collect(ym2, this) == objG) {
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
