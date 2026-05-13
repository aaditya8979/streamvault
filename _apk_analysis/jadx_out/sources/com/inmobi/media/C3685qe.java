package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.qe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3685qe extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f27977a;

    public C3685qe(hn.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3685qe c3685qe = new C3685qe(cVar);
        c3685qe.f27977a = ((Boolean) obj).booleanValue();
        return c3685qe;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C3685qe c3685qe = new C3685qe((hn.c) obj2);
        c3685qe.f27977a = bool.booleanValue();
        return c3685qe.invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        return jn.a.a(this.f27977a);
    }
}
