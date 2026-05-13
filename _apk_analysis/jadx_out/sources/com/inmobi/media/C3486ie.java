package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3486ie extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3734se f27352a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3486ie(C3734se c3734se, hn.c cVar) {
        super(2, cVar);
        this.f27352a = c3734se;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3486ie(this.f27352a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3486ie(this.f27352a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f27352a.f28119h.onVideoCompleted();
        return bn.r.f5635a;
    }
}
