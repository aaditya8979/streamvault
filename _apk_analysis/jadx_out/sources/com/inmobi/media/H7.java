package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class H7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f25583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H7(hn.c cVar, N7 n72) {
        super(2, cVar);
        this.f25583a = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new H7(cVar, this.f25583a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new H7((hn.c) obj2, this.f25583a).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f25583a.f26007p.stop();
        this.f25583a.f26007p.clearMediaItems();
        this.f25583a.f26007p.release();
        this.f25583a.f26017z.a();
        this.f25583a.f26016y.f26288d.c();
        return bn.r.f5635a;
    }
}
