package yads;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class v72 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x72 f95980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je3 f95981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v72(x72 x72Var, je3 je3Var, hn.c cVar) {
        super(2, cVar);
        this.f95980c = x72Var;
        this.f95981d = je3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new v72(this.f95980c, this.f95981d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new v72(this.f95980c, this.f95981d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f95979b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            x72 x72Var = this.f95980c;
            List listE = cn.v.e(this.f95981d);
            this.f95979b = 1;
            obj = x72.a(x72Var, listE, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return obj;
    }
}
