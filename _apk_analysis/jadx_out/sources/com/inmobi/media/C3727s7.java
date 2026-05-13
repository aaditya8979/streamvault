package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.s7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3727s7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f28096a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3727s7(hn.c cVar, N7 n72) {
        super(2, cVar);
        this.f28096a = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3727s7(cVar, this.f28096a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3727s7((hn.c) obj2, this.f28096a).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        N7 n72 = this.f28096a;
        n72.f26007p.addListener(n72.B);
        return bn.r.f5635a;
    }
}
