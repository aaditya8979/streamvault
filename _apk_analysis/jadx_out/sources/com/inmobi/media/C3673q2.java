package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3673q2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3722s2 f27927b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3673q2(AbstractC3722s2 abstractC3722s2, hn.c cVar) {
        super(2, cVar);
        this.f27927b = abstractC3722s2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3673q2(this.f27927b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3673q2(this.f27927b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27926a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            AbstractC3722s2 abstractC3722s2 = this.f27927b;
            this.f27926a = 1;
            if (AbstractC3722s2.b(abstractC3722s2, this) == objG) {
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
