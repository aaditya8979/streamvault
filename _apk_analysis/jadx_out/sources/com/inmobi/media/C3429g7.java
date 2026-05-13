package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3429g7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3578m7 f27208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Rf f27209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3429g7(C3578m7 c3578m7, Rf rf2, hn.c cVar) {
        super(2, cVar);
        this.f27208b = c3578m7;
        this.f27209c = rf2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3429g7(this.f27208b, this.f27209c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3429g7(this.f27208b, this.f27209c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27207a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3578m7 c3578m7 = this.f27208b;
            Rf rf2 = this.f27209c;
            C3403f7 c3403f7 = new C3403f7(c3578m7, null);
            this.f27207a = 1;
            if (c3578m7.a(rf2, c3403f7, this) == objG) {
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
