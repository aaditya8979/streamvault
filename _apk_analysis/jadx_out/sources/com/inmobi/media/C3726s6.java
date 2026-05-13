package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3726s6 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3776u6 f28095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3726s6(C3776u6 c3776u6, hn.c cVar) {
        super(1, cVar);
        this.f28095b = c3776u6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3726s6(this.f28095b, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3726s6(this.f28095b, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28094a;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                C3776u6 c3776u6 = this.f28095b;
                this.f28094a = 1;
                if (C3776u6.a(c3776u6, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
        } catch (Exception e10) {
            e10.toString();
        }
        return bn.r.f5635a;
    }
}
