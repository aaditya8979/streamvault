package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ct2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j00 f88602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a73 f88603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct2(j00 j00Var, a73 a73Var, hn.c cVar) {
        super(2, cVar);
        this.f88602b = j00Var;
        this.f88603c = a73Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new ct2(this.f88602b, this.f88603c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new ct2(this.f88602b, this.f88603c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        j00 j00Var = this.f88602b;
        String str = this.f88603c.f87612a;
        wq3 wq3Var = (wq3) j00Var;
        wq3Var.getClass();
        new CallbackStackTraceMarker(new vq3(wq3Var, str));
        return bn.r.f5635a;
    }
}
