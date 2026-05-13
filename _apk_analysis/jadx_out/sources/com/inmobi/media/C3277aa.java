package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3277aa extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3329ca f26767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3277aa(C3329ca c3329ca, hn.c cVar) {
        super(2, cVar);
        this.f26767b = c3329ca;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3277aa(this.f26767b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3277aa(this.f26767b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26766a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3856xb c3856xb = (C3856xb) AbstractC3881yb.f28577a.getValue();
            String str = this.f26767b.f26924a.f26530c.f27957a;
            this.f26766a = 1;
            if (c3856xb.a(str, this) == objG) {
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
