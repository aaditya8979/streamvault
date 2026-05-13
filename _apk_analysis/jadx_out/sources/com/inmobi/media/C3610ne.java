package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3610ne extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3759te f27694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3610ne(C3759te c3759te, hn.c cVar) {
        super(2, cVar);
        this.f27694b = c3759te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3610ne(this.f27694b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3610ne(this.f27694b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27693a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            InterfaceC3580m9 interfaceC3580m9L = this.f27694b.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("NativeRenderedState", "Impression Tracking Started - waiting for viewability criteria");
            }
            go.d dVarB = ((C3409fd) this.f27694b.f28184b.f28268j.getValue()).b();
            C3585me c3585me = new C3585me(null);
            this.f27693a = 1;
            if (go.f.w(dVarB, c3585me, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        this.f27694b.m();
        ((C3409fd) this.f27694b.f28184b.f28268j.getValue()).a();
        return bn.r.f5635a;
    }
}
