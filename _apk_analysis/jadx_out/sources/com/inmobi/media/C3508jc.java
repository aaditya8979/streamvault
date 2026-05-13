package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3508jc extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3558lc f27397a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3508jc(C3558lc c3558lc, hn.c cVar) {
        super(2, cVar);
        this.f27397a = c3558lc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3508jc(this.f27397a, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3508jc(this.f27397a, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        C3605n9 c3605n9 = this.f27397a.f27560a;
        if (c3605n9 != null) {
            c3605n9.a("MediaViewManager", "destroy called");
        }
        AbstractC3498j2 abstractC3498j2 = this.f27397a.f27561b;
        if (abstractC3498j2 != null) {
            abstractC3498j2.a();
        }
        this.f27397a.f27561b = null;
        return bn.r.f5635a;
    }
}
