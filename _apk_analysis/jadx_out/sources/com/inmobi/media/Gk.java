package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;

/* JADX INFO: loaded from: classes7.dex */
public final class Gk extends SuspendLambda implements sn.l {
    public Gk(hn.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Gk(cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Gk((hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p000do.p0 p0Var;
        in.a.g();
        kotlin.c.b(obj);
        if (Jk.f25757b.f27983b.get() != null && (p0Var = Jk.f25759d) != null) {
            g.a.a(p0Var, null, 1, null);
        }
        return bn.r.f5635a;
    }
}
