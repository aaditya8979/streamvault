package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class gc1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kc1 f89916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m90 f89917d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc1(kc1 kc1Var, m90 m90Var, hn.c cVar) {
        super(2, cVar);
        this.f89916c = kc1Var;
        this.f89917d = m90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new gc1(this.f89916c, this.f89917d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new gc1(this.f89916c, this.f89917d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f89915b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            fo.d dVar = this.f89916c.f91564o;
            m90 m90Var = this.f89917d;
            this.f89915b = 1;
            if (dVar.I(m90Var, this) == objG) {
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
