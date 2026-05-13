package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3451h4 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3476i4 f27276b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3451h4(C3476i4 c3476i4, hn.c cVar) {
        super(2, cVar);
        this.f27276b = c3476i4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3451h4(this.f27276b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3451h4(this.f27276b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27275a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3476i4 c3476i4 = this.f27276b;
            this.f27275a = 1;
            Object objCollect = go.f.z(new C3787uh(new C3812vh((C3271a4) c3476i4.f27330b.f27381b.getValue()), null)).collect(new C3374e4(c3476i4), this);
            if (objCollect != in.a.g()) {
                objCollect = bn.r.f5635a;
            }
            if (objCollect == objG) {
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
