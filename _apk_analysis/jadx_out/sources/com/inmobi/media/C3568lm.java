package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3568lm extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K3 f27585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3568lm(K3 k32, hn.c cVar) {
        super(2, cVar);
        this.f27585a = k32;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3568lm(this.f27585a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3568lm(this.f27585a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        this.f27585a.a();
        return bn.r.f5635a;
    }
}
