package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class dt2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j00 f88976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt2(j00 j00Var, hn.c cVar) {
        super(2, cVar);
        this.f88976b = j00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new dt2(this.f88976b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new dt2(this.f88976b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        wq3 wq3Var = (wq3) this.f88976b;
        wq3Var.getClass();
        new CallbackStackTraceMarker(new uq3(wq3Var));
        return bn.r.f5635a;
    }
}
