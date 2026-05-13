package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3676q5 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3700r5 f27937b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3676q5(C3700r5 c3700r5, hn.c cVar) {
        super(2, cVar);
        this.f27937b = c3700r5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3676q5(this.f27937b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3676q5(this.f27937b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27936a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            AbstractC3721s1 abstractC3721s1 = this.f27937b.f28030b;
            if (abstractC3721s1 != null) {
                abstractC3721s1.a();
            }
            Fc fc2 = this.f27937b.f28029a;
            if (fc2 != null) {
                this.f27936a = 1;
                if (fc2.a(this) == objG) {
                    return objG;
                }
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
