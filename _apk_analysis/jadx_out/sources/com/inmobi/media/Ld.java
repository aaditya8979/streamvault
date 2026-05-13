package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Ld extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Od f25876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Sd f25877d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ld(Od od2, hn.c cVar, Sd sd2) {
        super(2, cVar);
        this.f25876c = od2;
        this.f25877d = sd2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        Ld ld2 = new Ld(this.f25876c, cVar, this.f25877d);
        ld2.f25875b = obj;
        return ld2;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((Ld) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25874a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f25875b;
            Od od2 = this.f25876c;
            Kd kd2 = new Kd(l0Var, this.f25877d);
            this.f25874a = 1;
            if (od2.collect(kd2, this) == objG) {
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
