package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class he extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie f90371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(ie ieVar, hn.c cVar) {
        super(2, cVar);
        this.f90371c = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new he(this.f90371c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new he(this.f90371c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f90370b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            ie ieVar = this.f90371c;
            this.f90370b = 1;
            obj = p000do.g.g(ieVar.f90778a, new ge(ieVar, null), this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        vd vdVar = (vd) obj;
        return (vdVar.f96060a == null && vdVar.f96061b == null) ? je.f91186a : new ke(vdVar);
    }
}
