package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3598n2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go.l f27666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3722s2 f27667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3598n2(go.l lVar, hn.c cVar, AbstractC3722s2 abstractC3722s2) {
        super(2, cVar);
        this.f27666c = lVar;
        this.f27667d = abstractC3722s2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3598n2 c3598n2 = new C3598n2(this.f27666c, cVar, this.f27667d);
        c3598n2.f27665b = obj;
        return c3598n2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3598n2) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27664a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f27665b;
            go.l lVar = this.f27666c;
            C3573m2 c3573m2 = new C3573m2(l0Var, this.f27667d);
            this.f27664a = 1;
            if (lVar.collect(c3573m2, this) == objG) {
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
