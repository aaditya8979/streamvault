package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class J7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25699a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7(hn.c cVar, N7 n72) {
        super(2, cVar);
        this.f25699a = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new J7(cVar, this.f25699a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new J7((hn.c) obj2, this.f25699a).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        N7 n72 = this.f25699a;
        n72.f26005n.addView(n72.f26006o, 0);
        return bn.r.f5635a;
    }
}
