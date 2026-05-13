package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3754t9 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3779u9 f28172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Me f28173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3754t9(C3779u9 c3779u9, Me me2, hn.c cVar) {
        super(2, cVar);
        this.f28172b = c3779u9;
        this.f28173c = me2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3754t9(this.f28172b, this.f28173c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3754t9(this.f28172b, this.f28173c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28171a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return obj;
        }
        kotlin.c.b(obj);
        C3849x4 c3849x4 = this.f28172b.f28245a;
        Me me2 = this.f28173c;
        this.f28171a = 1;
        Object objA = c3849x4.a(me2, this);
        return objA == objG ? objG : objA;
    }
}
