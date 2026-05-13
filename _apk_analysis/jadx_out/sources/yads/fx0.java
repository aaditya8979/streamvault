package yads;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class fx0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gx0 f89716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f89717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(gx0 gx0Var, List list, hn.c cVar) {
        super(2, cVar);
        this.f89716c = gx0Var;
        this.f89717d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new fx0(this.f89716c, this.f89717d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new fx0(this.f89716c, this.f89717d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f89715b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            rw0 rw0Var = this.f89716c.f90146a;
            List list = this.f89717d;
            this.f89715b = 1;
            rw0Var.getClass();
            if (kotlinx.coroutines.d.f(new pw0(list, rw0Var, null), this) == objG) {
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
