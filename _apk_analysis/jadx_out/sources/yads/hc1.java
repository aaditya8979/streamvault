package yads;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class hc1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kc1 f90356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc1(kc1 kc1Var, hn.c cVar) {
        super(2, cVar);
        this.f90356c = kc1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new hc1(this.f90356c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new hc1(this.f90356c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m90 j90Var;
        Object objG = in.a.g();
        int i10 = this.f90355b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            iz0 iz0Var = this.f90356c.f91551b;
            this.f90355b = 1;
            o80 o80Var = iz0Var.f91033a;
            obj = p000do.g.g(o80Var.f93147f, new n80(o80Var, null), this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        a71 a71Var = (a71) obj;
        if (a71Var instanceof z61) {
            j90Var = new k90(((z61) a71Var).f97410a);
        } else if (a71Var instanceof x61) {
            j90Var = new j90(((x61) a71Var).f96644a);
        } else {
            if (!(a71Var instanceof y61)) {
                throw new NoWhenBranchMatchedException();
            }
            j90Var = i90.f90712a;
        }
        kc1 kc1Var = this.f90356c;
        p000do.i.d(kc1Var.f91550a, null, null, new gc1(kc1Var, j90Var, null), 3, null);
        return bn.r.f5635a;
    }
}
