package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class wd extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd f96354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd(yd ydVar, hn.c cVar) {
        super(2, cVar);
        this.f96354c = ydVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new wd(this.f96354c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new wd(this.f96354c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f96353b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            ie ieVar = this.f96354c.f97070a;
            this.f96353b = 1;
            obj = p000do.g.g(ieVar.f90778a, new he(ieVar, null), this);
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
