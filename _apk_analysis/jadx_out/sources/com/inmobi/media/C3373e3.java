package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3373e3 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S2 f27085b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3373e3(S2 s22, hn.c cVar) {
        super(2, cVar);
        this.f27085b = s22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3373e3(this.f27085b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3373e3(this.f27085b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27084a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            W2 w22 = (W2) C3823w3.f28407b.getValue();
            int i11 = this.f27085b.f26274a;
            this.f27084a = 1;
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
