package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class de extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f88829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie f88830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(ie ieVar, hn.c cVar) {
        super(2, cVar);
        this.f88830c = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new de(this.f88830c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new de(this.f88830c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f88829b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            ud2 ud2Var = this.f88830c.f90782e;
            this.f88829b = 1;
            obj = ud2Var.a(1000L, this);
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
