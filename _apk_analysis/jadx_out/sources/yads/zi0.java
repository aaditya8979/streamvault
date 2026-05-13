package yads;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zi0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cj0 f97584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(cj0 cj0Var, hn.c cVar) {
        super(2, cVar);
        this.f97584c = cj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new zi0(this.f97584c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new zi0(this.f97584c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f97583b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            cj0 cj0Var = this.f97584c;
            AtomicBoolean atomicBoolean = cj0.f88468e;
            cj0Var.getClass();
            List listC = cn.v.c();
            String strA = ya3.a(cj0Var.f88471c.a(cj0Var.f88470b));
            if (strA != null) {
                listC.add(strA);
            }
            List listA = cn.v.a(listC);
            if (listA.isEmpty()) {
                boolean z10 = ad1.f87661a;
                return bn.r.f5635a;
            }
            cj0 cj0Var2 = this.f97584c;
            this.f97583b = 1;
            cj0Var2.getClass();
            Object objC = TimeoutKt.c(2500L, new bj0(cj0Var2, listA, null), this);
            if (objC != in.a.g()) {
                objC = bn.r.f5635a;
            }
            if (objC == objG) {
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
