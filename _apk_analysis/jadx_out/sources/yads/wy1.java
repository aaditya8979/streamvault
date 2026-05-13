package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class wy1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yy1 f96561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oi f96562d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy1(yy1 yy1Var, oi oiVar, hn.c cVar) {
        super(2, cVar);
        this.f96561c = yy1Var;
        this.f96562d = oiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new wy1(this.f96561c, this.f96562d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new wy1(this.f96561c, this.f96562d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f96560b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            yy1 yy1Var = this.f96561c;
            oi oiVar = this.f96562d;
            this.f96560b = 1;
            obj = yy1.a(yy1Var, oiVar, this);
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
