package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3410fe extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go.k f27167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3759te f27168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3410fe(go.k kVar, hn.c cVar, C3759te c3759te) {
        super(2, cVar);
        this.f27167c = kVar;
        this.f27168d = c3759te;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3410fe c3410fe = new C3410fe(this.f27167c, cVar, this.f27168d);
        c3410fe.f27166b = obj;
        return c3410fe;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3410fe) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27165a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f27166b;
            go.k kVar = this.f27167c;
            C3384ee c3384ee = new C3384ee(l0Var, this.f27168d);
            this.f27165a = 1;
            if (kVar.collect(c3384ee, this) == objG) {
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
