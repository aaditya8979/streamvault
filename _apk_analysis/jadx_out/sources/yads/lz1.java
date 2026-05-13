package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class lz1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz1 f92179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9 f92180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d12 f92181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz1 f92182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hz1 f92183f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz1(mz1 mz1Var, v9 v9Var, d12 d12Var, xz1 xz1Var, hz1 hz1Var, hn.c cVar) {
        super(2, cVar);
        this.f92179b = mz1Var;
        this.f92180c = v9Var;
        this.f92181d = d12Var;
        this.f92182e = xz1Var;
        this.f92183f = hz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new lz1(this.f92179b, this.f92180c, this.f92181d, this.f92182e, this.f92183f, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((lz1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        new kz1(this.f92179b, this.f92180c, this.f92181d, this.f92182e, this.f92183f, new aq2()).run();
        return bn.r.f5635a;
    }
}
