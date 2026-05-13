package yads;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class gt2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt2 f90114c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt2(jt2 jt2Var, hn.c cVar) {
        super(2, cVar);
        this.f90114c = jt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new gt2(this.f90114c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new gt2(this.f90114c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f90113b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            zu2 zu2Var = this.f90114c.f91357e;
            q61 q61Var = q61.f93905f;
            this.f90113b = 1;
            obj = zu2Var.a(q61Var, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        ru2 ru2Var = (ru2) obj;
        if (ru2Var instanceof qu2) {
            return null;
        }
        if (ru2Var instanceof pu2) {
            return kt2.f91746c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
