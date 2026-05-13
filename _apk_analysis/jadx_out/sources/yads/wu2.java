package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class wu2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f96499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2 f96500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu2(boolean z10, zu2 zu2Var, hn.c cVar) {
        super(2, cVar);
        this.f96499c = z10;
        this.f96500d = zu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new wu2(this.f96499c, this.f96500d, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new wu2(this.f96499c, this.f96500d, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f96498b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            if (this.f96499c) {
                cj0 cj0Var = this.f96500d.f97791q;
                this.f96498b = 1;
                if (cj0Var.a(this) == objG) {
                    return objG;
                }
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
