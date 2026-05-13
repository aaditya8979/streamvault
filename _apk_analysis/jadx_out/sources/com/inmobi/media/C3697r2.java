package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3697r2 extends SuspendLambda implements sn.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3722s2 f28024b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3697r2(AbstractC3722s2 abstractC3722s2, hn.c cVar) {
        super(3, cVar);
        this.f28024b = abstractC3722s2;
    }

    @Override // sn.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C3697r2(this.f28024b, (hn.c) obj3).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28023a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            AbstractC3722s2 abstractC3722s2 = this.f28024b;
            this.f28023a = 1;
            if (AbstractC3722s2.a(abstractC3722s2, this) == objG) {
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
