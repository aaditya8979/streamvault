package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.i7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3479i7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3578m7 f27342b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3479i7(C3578m7 c3578m7, hn.c cVar) {
        super(2, cVar);
        this.f27342b = c3578m7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3479i7(this.f27342b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3479i7(this.f27342b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27341a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            C3578m7 c3578m7 = this.f27342b;
            this.f27341a = 1;
            if (c3578m7.d(this) == objG) {
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
