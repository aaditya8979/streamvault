package yads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
public final class aj0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj0 f87719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f87720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj0(cj0 cj0Var, String str, hn.c cVar) {
        super(2, cVar);
        this.f87719b = cj0Var;
        this.f87720c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new aj0(this.f87719b, this.f87720c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new aj0(this.f87719b, this.f87720c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        cj0 cj0Var = this.f87719b;
        String str = this.f87720c;
        AtomicBoolean atomicBoolean = cj0.f88468e;
        cj0Var.a(str);
        return bn.r.f5635a;
    }
}
