package yads;

import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ProduceKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a41 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f87568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c41 f87569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set f87570e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a41(c41 c41Var, Set set, hn.c cVar) {
        super(2, cVar);
        this.f87569d = c41Var;
        this.f87570e = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        a41 a41Var = new a41(this.f87569d, this.f87570e, cVar);
        a41Var.f87568c = obj;
        return a41Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((a41) create((fo.m) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f87567b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            fo.m mVar = (fo.m) this.f87568c;
            this.f87569d.a(this.f87570e, new z31(mVar));
            this.f87567b = 1;
            if (ProduceKt.c(mVar, null, this, 1, null) == objG) {
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
