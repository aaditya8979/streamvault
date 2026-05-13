package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class Dh extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gh f25329a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dh(Gh gh2, hn.c cVar) {
        super(1, cVar);
        this.f25329a = gh2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Dh(this.f25329a, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Dh(this.f25329a, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f25329a.a(true);
        return bn.r.f5635a;
    }
}
