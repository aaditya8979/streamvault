package yads;

import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class t72 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sd3 f95084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd3 f95086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x72 f95087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t72(sd3 sd3Var, x72 x72Var, hn.c cVar) {
        super(2, cVar);
        this.f95086d = sd3Var;
        this.f95087e = x72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new t72(this.f95086d, this.f95087e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new t72(this.f95086d, this.f95087e, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws z02 {
        sd3 sd3Var;
        Object objG = in.a.g();
        int i10 = this.f95085c;
        if (i10 == 0) {
            kotlin.c.b(obj);
            sd3 sd3Var2 = this.f95086d;
            if (sd3Var2 == null) {
                return null;
            }
            x72 x72Var = this.f95087e;
            List list = sd3Var2.f94800a;
            this.f95084b = sd3Var2;
            this.f95085c = 1;
            x72Var.getClass();
            Object objG2 = p000do.g.g(p000do.w0.b(), new w72(x72Var, list, null), this);
            if (objG2 == objG) {
                return objG;
            }
            sd3Var = sd3Var2;
            obj = objG2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sd3Var = this.f95084b;
            kotlin.c.b(obj);
        }
        List list2 = (List) obj;
        if (list2.isEmpty()) {
            throw new z02("Invalid VAST in response");
        }
        return new sd3(list2, sd3Var.f94801b, sd3Var.f94802c);
    }
}
