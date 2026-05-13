package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.g;

/* JADX INFO: loaded from: classes8.dex */
public final class Ik extends SuspendLambda implements sn.l {
    public Ik(hn.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Ik(cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Ik((hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        p000do.p0 p0Var = Jk.f25759d;
        if (p0Var != null) {
            g.a.a(p0Var, null, 1, null);
        }
        Jk.f25759d = null;
        Jk.f25758c.clear();
        return bn.r.f5635a;
    }
}
