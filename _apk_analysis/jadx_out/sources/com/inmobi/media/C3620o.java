package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3620o extends SuspendLambda implements sn.l {
    public C3620o(hn.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3620o(cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3620o((hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        if (C3670q.f27916d.get() && C3670q.b()) {
            C3670q.a(jn.a.c(0.0f));
        }
        return bn.r.f5635a;
    }
}
