package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3303ba extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3682qb f26849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3303ba(C3682qb c3682qb, hn.c cVar) {
        super(2, cVar);
        this.f26849b = c3682qb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3303ba(this.f26849b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3303ba(this.f26849b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26848a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3856xb c3856xb = (C3856xb) AbstractC3881yb.f28577a.getValue();
            C3682qb c3682qb = this.f26849b;
            this.f26848a = 1;
            if (c3856xb.b(c3682qb, this) == objG) {
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
