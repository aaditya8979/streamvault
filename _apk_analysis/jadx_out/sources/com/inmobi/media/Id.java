package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Id extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Jd f25659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Id(Jd jd2, hn.c cVar) {
        super(2, cVar);
        this.f25659c = jd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Id id2 = new Id(this.f25659c, cVar);
        id2.f25658b = obj;
        return id2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Id id2 = new Id(this.f25659c, (hn.c) obj2);
        id2.f25658b = (fo.m) obj;
        return id2.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25657a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            fo.m mVar = (fo.m) this.f25658b;
            Jd jd2 = this.f25659c;
            go.k kVar = jd2.f25721a.f26054a;
            Hd hd2 = new Hd(jd2, mVar);
            this.f25657a = 1;
            if (kVar.collect(hd2, this) == objG) {
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
