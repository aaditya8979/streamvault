package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class ft2 extends SuspendLambda implements sn.l {
    public ft2(hn.c cVar) {
        super(1, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new ft2(cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        new ft2((hn.c) obj);
        bn.r rVar = bn.r.f5635a;
        in.a.g();
        kotlin.c.b(rVar);
        return kt2.f91747d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        return kt2.f91747d;
    }
}
