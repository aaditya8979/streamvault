package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3723s3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f28093b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3723s3(S2 s22, hn.c cVar) {
        super(2, cVar);
        this.f28093b = s22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3723s3(this.f28093b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3723s3(this.f28093b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28092a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            W2 w22 = (W2) C3823w3.f28407b.getValue();
            int i11 = this.f28093b.f26274a;
            this.f28092a = 1;
            Object objA = w22.f26518a.a("click", "id=?", new String[]{String.valueOf(i11)}, this);
            if (objA != in.a.g()) {
                objA = bn.r.f5635a;
            }
            if (objA == objG) {
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
