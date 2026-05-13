package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3535ke extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3734se f27472a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3535ke(C3734se c3734se, hn.c cVar) {
        super(2, cVar);
        this.f27472a = c3734se;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3535ke(this.f27472a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3535ke(this.f27472a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f27472a.f28119h.onVideoResumed();
        return bn.r.f5635a;
    }
}
