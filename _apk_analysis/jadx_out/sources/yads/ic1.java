package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class ic1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kc1 f90754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f90755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(kc1 kc1Var, String str, hn.c cVar) {
        super(2, cVar);
        this.f90754c = kc1Var;
        this.f90755d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new ic1(this.f90754c, this.f90755d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new ic1(this.f90754c, this.f90755d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f90753b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            fo.d dVar = this.f90754c.f91564o;
            l90 l90Var = new l90(this.f90755d);
            this.f90753b = 1;
            if (dVar.I(l90Var, this) == objG) {
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
