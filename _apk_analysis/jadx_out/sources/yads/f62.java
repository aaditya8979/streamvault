package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class f62 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f89492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h62 f89493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f89494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9 f89495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry1 f89496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z30 f89497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f62(h62 h62Var, Context context, v9 v9Var, ry1 ry1Var, z30 z30Var, hn.c cVar) {
        super(2, cVar);
        this.f89493c = h62Var;
        this.f89494d = context;
        this.f89495e = v9Var;
        this.f89496f = ry1Var;
        this.f89497g = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new f62(this.f89493c, this.f89494d, this.f89495e, this.f89496f, this.f89497g, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((f62) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f89492b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            h62 h62Var = this.f89493c;
            Context context = this.f89494d;
            v9 v9Var = this.f89495e;
            ry1 ry1Var = this.f89496f;
            z30 z30Var = this.f89497g;
            this.f89492b = 1;
            if (h62Var.a(context, v9Var, ry1Var, z30Var, this) == objG) {
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
