package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3381eb extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3407fb f27104a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3381eb(C3407fb c3407fb, hn.c cVar) {
        super(2, cVar);
        this.f27104a = c3407fb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3381eb(this.f27104a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3381eb(this.f27104a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3407fb c3407fb = this.f27104a;
        c3407fb.f27162f.onAdLoadFailed(c3407fb.f27161e);
        return bn.r.f5635a;
    }
}
