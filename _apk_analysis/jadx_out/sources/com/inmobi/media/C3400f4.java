package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3400f4 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3476i4 f27132b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3400f4(C3476i4 c3476i4, hn.c cVar) {
        super(2, cVar);
        this.f27132b = c3476i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3400f4(this.f27132b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3400f4(this.f27132b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27131a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3476i4 c3476i4 = this.f27132b;
            this.f27131a = 1;
            if (c3476i4.b(this) == objG) {
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
