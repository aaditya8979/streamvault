package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes12.dex */
public final class qn extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zn f94086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ra3 f94087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(zn znVar, ra3 ra3Var, hn.c cVar) {
        super(2, cVar);
        this.f94086b = znVar;
        this.f94087c = ra3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new qn(this.f94086b, this.f94087c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new qn(this.f94086b, this.f94087c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        in.a.g();
        kotlin.c.b(obj);
        zn znVar = this.f94086b;
        synchronized (znVar) {
            z10 = znVar.f97694s;
        }
        if (!z10) {
            String strA = this.f94087c.a(this.f94086b.f97678c);
            if (strA == null || strA.length() == 0) {
                this.f94086b.b(h9.f90291j);
            } else {
                this.f94086b.f97677b.a(v5.f95939r, null);
                this.f94086b.f97678c.f88746g = this.f94087c.a();
                zn znVar2 = this.f94086b;
                d4 d4Var = znVar2.f97678c;
                sp2 sp2Var = znVar2.f97690o;
                Context context = znVar2.f97676a;
                sp2Var.getClass();
                d4Var.f88753n = context.getResources().getConfiguration().orientation;
                ra3 ra3Var = this.f94087c;
                zn znVar3 = this.f94086b;
                this.f94086b.f97692q.a(this.f94086b.a(strA, ra3Var.a(znVar3.f97676a, znVar3.f97678c, znVar3.f97684i)));
            }
        }
        return bn.r.f5635a;
    }
}
