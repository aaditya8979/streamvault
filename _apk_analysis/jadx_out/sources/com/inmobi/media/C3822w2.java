package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3822w2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3847x2 f28404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rl f28405b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3822w2(AbstractC3847x2 abstractC3847x2, Rl rl2, hn.c cVar) {
        super(2, cVar);
        this.f28404a = abstractC3847x2;
        this.f28405b = rl2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new C3822w2(this.f28404a, this.f28405b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new C3822w2(this.f28404a, this.f28405b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        AbstractC3847x2 abstractC3847x2 = this.f28404a;
        Rl rl2 = this.f28405b;
        int i10 = AbstractC3847x2.f28477h;
        abstractC3847x2.b(rl2);
        return bn.r.f5635a;
    }
}
