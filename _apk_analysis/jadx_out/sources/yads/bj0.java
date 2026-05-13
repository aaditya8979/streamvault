package yads;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class bj0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f88024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f88025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj0 f88026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(cj0 cj0Var, List list, hn.c cVar) {
        super(2, cVar);
        this.f88025c = list;
        this.f88026d = cj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        bj0 bj0Var = new bj0(this.f88026d, this.f88025c, cVar);
        bj0Var.f88024b = obj;
        return bj0Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((bj0) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        p000do.l0 l0Var = (p000do.l0) this.f88024b;
        List list = this.f88025c;
        cj0 cj0Var = this.f88026d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p000do.i.d(l0Var, null, null, new aj0(cj0Var, (String) it.next(), null), 3, null);
        }
        return bn.r.f5635a;
    }
}
