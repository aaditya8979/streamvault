package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3453h6 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3376e6 f27278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3552l6 f27280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3453h6(C3376e6 c3376e6, boolean z10, C3552l6 c3552l6, hn.c cVar) {
        super(2, cVar);
        this.f27278a = c3376e6;
        this.f27279b = z10;
        this.f27280c = c3552l6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3453h6(this.f27278a, this.f27279b, this.f27280c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3453h6) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        return bn.r.f5635a;
    }
}
