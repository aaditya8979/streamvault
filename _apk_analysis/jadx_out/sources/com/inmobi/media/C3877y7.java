package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3877y7 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f28568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3877y7(hn.c cVar, N7 n72, boolean z10) {
        super(2, cVar);
        this.f28568a = n72;
        this.f28569b = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3877y7(cVar, this.f28568a, this.f28569b);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3877y7((hn.c) obj2, this.f28568a, this.f28569b).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f28568a.f26005n.setVisibility(this.f28569b ? 0 : 8);
        return bn.r.f5635a;
    }
}
