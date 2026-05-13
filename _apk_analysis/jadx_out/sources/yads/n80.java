package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class n80 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b80 f92773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c80 f92774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f92775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o80 f92776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n80(o80 o80Var, hn.c cVar) {
        super(2, cVar);
        this.f92776e = o80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new n80(this.f92776e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new n80(this.f92776e, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b80 b80VarA;
        c80 c80Var;
        Object objM7542unboximpl;
        List listM;
        Object objG = in.a.g();
        int i10 = this.f92775d;
        if (i10 == 0) {
            kotlin.c.b(obj);
            b80VarA = this.f92776e.f93142a.a();
            c80 c80Var2 = b80VarA.f87945f;
            if (c80Var2 == null) {
                return y61.f97012a;
            }
            cn2 cn2Var = this.f92776e.f93143b;
            this.f92773b = b80VarA;
            this.f92774c = c80Var2;
            this.f92775d = 1;
            Object objA = cn2Var.a(this);
            if (objA == objG) {
                return objG;
            }
            c80Var = c80Var2;
            objM7542unboximpl = objA;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c80Var = this.f92774c;
            b80VarA = this.f92773b;
            kotlin.c.b(obj);
            objM7542unboximpl = ((Result) obj).m7542unboximpl();
        }
        if (Result.m7539isFailureimpl(objM7542unboximpl)) {
            objM7542unboximpl = null;
        }
        j80 j80Var = (j80) objM7542unboximpl;
        if (j80Var == null || (listM = j80Var.f91125g) == null) {
            listM = cn.w.m();
        }
        List list = b80VarA.f87942c;
        ArrayList arrayListA = this.f92776e.f93144c.a(listM);
        return this.f92776e.f93146e.a(this.f92776e.f93145d.a(new m80(b80VarA.f87940a, b80VarA.f87941b, arrayListA.isEmpty() ? list : arrayListA, b80VarA.f87943d, c80Var.f88388a, c80Var.f88389b)));
    }
}
