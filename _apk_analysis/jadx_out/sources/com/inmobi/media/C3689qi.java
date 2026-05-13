package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3689qi extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3713ri f27985a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3689qi(AbstractC3713ri abstractC3713ri, hn.c cVar) {
        super(2, cVar);
        this.f27985a = abstractC3713ri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3689qi(this.f27985a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3689qi(this.f27985a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f27985a.f28066d.onUserLeftApplication();
        return bn.r.f5635a;
    }
}
