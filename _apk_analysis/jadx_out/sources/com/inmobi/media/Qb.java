package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class Qb extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3856xb f26177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qb(C3856xb c3856xb, long j10, int i10, hn.c cVar) {
        super(1, cVar);
        this.f26177a = c3856xb;
        this.f26178b = j10;
        this.f26179c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Qb(this.f26177a, this.f26178b, this.f26179c, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return ((Qb) create((hn.c) obj)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        p000do.i.d(A9.f25147c, null, null, new Pb(this.f26177a, this.f26178b, this.f26179c, null), 3, null);
        return bn.r.f5635a;
    }
}
