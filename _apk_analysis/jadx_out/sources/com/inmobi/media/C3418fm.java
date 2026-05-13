package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3418fm extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go.d f27184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3643om f27185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3418fm(go.d dVar, hn.c cVar, C3643om c3643om) {
        super(2, cVar);
        this.f27184c = dVar;
        this.f27185d = c3643om;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3418fm c3418fm = new C3418fm(this.f27184c, cVar, this.f27185d);
        c3418fm.f27183b = obj;
        return c3418fm;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3418fm) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27182a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f27183b;
            go.d dVar = this.f27184c;
            C3392em c3392em = new C3392em(l0Var, this.f27185d);
            this.f27182a = 1;
            if (dVar.collect(c3392em, this) == objG) {
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
