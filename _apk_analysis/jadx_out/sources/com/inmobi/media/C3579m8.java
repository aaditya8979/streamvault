package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3579m8 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3629o8 f27613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ij f27614b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3579m8(C3629o8 c3629o8, Ij ij2, hn.c cVar) {
        super(2, cVar);
        this.f27613a = c3629o8;
        this.f27614b = ij2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3579m8(this.f27613a, this.f27614b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3579m8(this.f27613a, this.f27614b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3629o8 c3629o8 = this.f27613a;
        c3629o8.f27764f = this.f27614b;
        c3629o8.f27762d.a(c3629o8.f27766h);
        return bn.r.f5635a;
    }
}
