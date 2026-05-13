package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.zn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3918zn extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go.l f28671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bn f28672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3918zn(go.l lVar, hn.c cVar, Bn bn2) {
        super(2, cVar);
        this.f28671c = lVar;
        this.f28672d = bn2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3918zn c3918zn = new C3918zn(this.f28671c, cVar, this.f28672d);
        c3918zn.f28670b = obj;
        return c3918zn;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3918zn) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f28669a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f28670b;
            go.l lVar = this.f28671c;
            C3893yn c3893yn = new C3893yn(l0Var, this.f28672d);
            this.f28669a = 1;
            if (lVar.collect(c3893yn, this) == objG) {
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
