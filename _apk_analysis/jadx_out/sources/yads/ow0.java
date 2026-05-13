package yads;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ow0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f93345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f93346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw0 f93347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2 f93348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(rw0 rw0Var, dn2 dn2Var, hn.c cVar) {
        super(2, cVar);
        this.f93347d = rw0Var;
        this.f93348e = dn2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        ow0 ow0Var = new ow0(this.f93347d, this.f93348e, cVar);
        ow0Var.f93346c = obj;
        return ow0Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((ow0) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM7534constructorimpl;
        Object objG = in.a.g();
        int i10 = this.f93345b;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                rw0 rw0Var = this.f93347d;
                dn2 dn2Var = this.f93348e;
                Result.a aVar = Result.Companion;
                this.f93345b = 1;
                obj = rw0Var.a(dn2Var, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            objM7534constructorimpl = Result.m7534constructorimpl(jn.a.a(((Boolean) obj).booleanValue()));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return Result.m7533boximpl(objM7534constructorimpl);
    }
}
