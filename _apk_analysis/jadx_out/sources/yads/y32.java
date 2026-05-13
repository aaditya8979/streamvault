package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes12.dex */
public final class y32 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ go.d f96993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2 f96994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y32(go.d dVar, mi2 mi2Var, hn.c cVar) {
        super(2, cVar);
        this.f96993c = dVar;
        this.f96994d = mi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new y32(this.f96993c, this.f96994d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new y32(this.f96993c, this.f96994d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f96992b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            go.d dVar = this.f96993c;
            x32 x32Var = new x32(this.f96994d);
            this.f96992b = 1;
            if (dVar.collect(x32Var, this) == objG) {
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
