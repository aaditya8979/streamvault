package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class h42 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j42 f90243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f90244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry1 f90245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h42(j42 j42Var, Context context, ry1 ry1Var, hn.c cVar) {
        super(2, cVar);
        this.f90243c = j42Var;
        this.f90244d = context;
        this.f90245e = ry1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new h42(this.f90243c, this.f90244d, this.f90245e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((h42) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f90242b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            r72 r72Var = this.f90243c.f91094b;
            Context context = this.f90244d;
            ry1 ry1Var = this.f90245e;
            this.f90242b = 1;
            if (r72Var.a(context, ry1Var, this) == objG) {
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
