package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3528k7 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3578m7 f27455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3528k7(C3578m7 c3578m7, hn.c cVar) {
        super(1, cVar);
        this.f27455b = c3578m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3528k7(this.f27455b, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3528k7(this.f27455b, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27454a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3578m7 c3578m7 = this.f27455b;
            this.f27454a = 1;
            if (c3578m7.b(this) == objG) {
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
