package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class O4 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go.k f26064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3305bc f26065c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O4(go.k kVar, AbstractC3305bc abstractC3305bc, hn.c cVar) {
        super(2, cVar);
        this.f26064b = kVar;
        this.f26065c = abstractC3305bc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new O4(this.f26064b, this.f26065c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new O4(this.f26064b, this.f26065c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f26063a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            go.k kVar = this.f26064b;
            AbstractC3305bc abstractC3305bc = this.f26065c;
            this.f26063a = 1;
            if (kVar.emit(abstractC3305bc, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
