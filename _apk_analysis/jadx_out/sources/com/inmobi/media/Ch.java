package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Ch extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gh f25270a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ch(Gh gh2, hn.c cVar) {
        super(1, cVar);
        this.f25270a = gh2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Ch(this.f25270a, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Ch(this.f25270a, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f25270a.f25542k.getAndIncrement();
        this.f25270a.getClass();
        this.f25270a.a(false);
        return bn.r.f5635a;
    }
}
