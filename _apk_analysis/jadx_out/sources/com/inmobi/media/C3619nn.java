package com.inmobi.media;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3619nn extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Vm f27711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3669pn f27712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3619nn(Vm vm2, hn.c cVar, C3669pn c3669pn) {
        super(2, cVar);
        this.f27711c = vm2;
        this.f27712d = c3669pn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        C3619nn c3619nn = new C3619nn(this.f27711c, cVar, this.f27712d);
        c3619nn.f27710b = obj;
        return c3619nn;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((C3619nn) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f27709a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f27710b;
            Vm vm2 = this.f27711c;
            C3594mn c3594mn = new C3594mn(l0Var, this.f27712d);
            this.f27709a = 1;
            if (vm2.collect(c3594mn, this) == objG) {
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
