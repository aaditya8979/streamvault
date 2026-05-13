package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3403f7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3578m7 f27150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3403f7(C3578m7 c3578m7, hn.c cVar) {
        super(2, cVar);
        this.f27150c = c3578m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3403f7 c3403f7 = new C3403f7(this.f27150c, cVar);
        c3403f7.f27149b = obj;
        return c3403f7;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        C3403f7 c3403f7 = new C3403f7(this.f27150c, (hn.c) obj2);
        c3403f7.f27149b = (Xf) obj;
        return c3403f7.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27148a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            Xf xf2 = (Xf) this.f27149b;
            C3578m7 c3578m7 = this.f27150c;
            this.f27148a = 1;
            Object objA = c3578m7.f26711b.a(xf2, this);
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
