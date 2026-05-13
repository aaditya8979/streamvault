package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class hf extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p000do.t f90381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(p000do.t tVar, hn.c cVar) {
        super(2, cVar);
        this.f90381c = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new hf(this.f90381c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new hf(this.f90381c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f90380b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.t tVar = this.f90381c;
            this.f90380b = 1;
            if (tVar.N(this) == objG) {
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
