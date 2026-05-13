package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3341cm extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3643om f26998a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3341cm(C3643om c3643om, hn.c cVar) {
        super(2, cVar);
        this.f26998a = c3643om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3341cm(this.f26998a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3341cm(this.f26998a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3643om c3643om = this.f26998a;
        return new Sd(c3643om.f27375a, c3643om.f27805b, c3643om.f27806c.f27896e, c3643om.f27808e);
    }
}
