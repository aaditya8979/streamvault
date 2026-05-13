package yads;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class sz1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tz1 f95020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f95021d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz1(tz1 tz1Var, View view, hn.c cVar) {
        super(2, cVar);
        this.f95020c = tz1Var;
        this.f95021d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new sz1(this.f95020c, this.f95021d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new sz1(this.f95020c, this.f95021d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objG = in.a.g();
        int i10 = this.f95019b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            tz1 tz1Var = this.f95020c;
            y3 y3Var = tz1Var.f95437b;
            View view = this.f95021d;
            oi oiVar = tz1Var.f95436a;
            if1 if1Var = tz1Var.f95440e;
            l12 l12Var = tz1Var.f95438c;
            this.f95019b = 1;
            x3 x3Var = (x3) y3Var;
            f1 f1Var = x3Var.f96614d.f95883b;
            e1 e1Var = new e1(f1Var.f89443e, f1Var.f89439a, f1Var.f89440b, f1Var.f89441c, f1Var.f89442d, if1Var.f90803b);
            f1Var.f89444f = e1Var;
            i22 i22Var = f1Var.f89445g;
            if (i22Var != null) {
                f1Var.f89445g = i22Var;
                e1Var.f89057b.f90626k = i22Var;
            }
            Context context = view.getContext();
            z9 z9Var = x3Var.f96619i.f94705a;
            zy1 zy1Var = x3Var.f96617g;
            lv lvVar = new lv(zy1Var.f97838c, zy1Var.f97836a, new az1(oiVar.f93229a, zy1Var.f97840e, l12Var.f91862b), ((iu3) zy1Var.f97837b).a(), new sx(), new we(zy1Var.f97839d));
            p53 p53Var = x3Var.f96615e;
            lu2 lu2Var = x3Var.f96611a;
            d4 d4Var = x3Var.f96613c;
            v9 v9Var = x3Var.f96612b;
            p53Var.getClass();
            Object obj2 = dw2.f89000j;
            nt2 nt2VarA = cw2.a().a(context);
            if (nt2VarA != null) {
                boolean z10 = nt2VarA.f92946f;
            }
            p2 p2Var = new p2(lu2Var);
            lm0 lm0Var = lm0.f92028c;
            eb0 eb0Var = new eb0(context, d4Var, v9Var, z9Var, p2Var, km0.a(context));
            za zaVar = x3Var.f96616f;
            l42 l42Var = new l42(zaVar, eb0Var);
            objA = x3Var.a(view, if1Var, new v0(new p0(x3Var.f96613c, x3Var.f96611a, x3Var.f96612b, lvVar, l42Var, l12Var, x3Var.f96614d, x3Var.f96618h)), new k42(zaVar, eb0Var, lvVar), this);
            if (objA == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            objA = obj;
        }
        if (((o01) objA).f93060a) {
            this.f95020c.f95441f.a();
        }
        return bn.r.f5635a;
    }
}
