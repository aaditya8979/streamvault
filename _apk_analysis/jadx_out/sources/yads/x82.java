package yads;

import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class x82 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z82 f96661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f96662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03 f96663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f96664f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x82(z82 z82Var, Context context, a03 a03Var, List list, hn.c cVar) {
        super(2, cVar);
        this.f96661c = z82Var;
        this.f96662d = context;
        this.f96663e = a03Var;
        this.f96664f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new x82(this.f96661c, this.f96662d, this.f96663e, this.f96664f, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((x82) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f96660b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            z82 z82Var = this.f96661c;
            Context context = this.f96662d;
            a03 a03Var = this.f96663e;
            List list = this.f96664f;
            this.f96660b = 1;
            obj = z82Var.a(context, a03Var, list, this);
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
