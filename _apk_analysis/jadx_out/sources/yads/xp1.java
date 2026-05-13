package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class xp1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f96849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f96850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f96851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp1(List list, com.monetization.ads.mediation.base.initialize.a aVar, Context context, hn.c cVar) {
        super(2, cVar);
        this.f96849c = list;
        this.f96850d = aVar;
        this.f96851e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        xp1 xp1Var = new xp1(this.f96849c, this.f96850d, this.f96851e, cVar);
        xp1Var.f96848b = obj;
        return xp1Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((xp1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        p000do.l0 l0Var = (p000do.l0) this.f96848b;
        List list = this.f96849c;
        com.monetization.ads.mediation.base.initialize.a aVar = this.f96850d;
        Context context = this.f96851e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p000do.i.d(l0Var, null, null, new wp1(aVar, context, (qq1) it.next(), null), 3, null);
        }
        return bn.r.f5635a;
    }
}
