package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
public final class iz1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz1 f91034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry1 f91035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2 f91036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz1 f91037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz1 f91038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz1(mz1 mz1Var, ry1 ry1Var, mi2 mi2Var, kz1 kz1Var, jz1 jz1Var, hn.c cVar) {
        super(2, cVar);
        this.f91034b = mz1Var;
        this.f91035c = ry1Var;
        this.f91036d = mi2Var;
        this.f91037e = kz1Var;
        this.f91038f = jz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new iz1(this.f91034b, this.f91035c, this.f91036d, this.f91037e, this.f91038f, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((iz1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        mz1 mz1Var = this.f91034b;
        oz1 oz1Var = mz1Var.f92664f;
        Context context = mz1Var.f92663e;
        ry1 ry1Var = this.f91035c;
        mi2 mi2Var = this.f91036d;
        xz1 xz1Var = this.f91037e.f91808d;
        hz1 hz1Var = this.f91038f.f91430a;
        sy1 sy1Var = (sy1) oz1Var.f93360d.f95422a.get(oz1Var.f93357a.f88745f);
        if (sy1Var != null) {
            sy1Var.a(context, ry1Var, mi2Var, oz1Var.f93359c, xz1Var, oz1Var.f93358b, hz1Var);
        } else {
            hz1Var.a(h9.f90282a);
        }
        return bn.r.f5635a;
    }
}
