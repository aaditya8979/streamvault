package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AwaitKt;

/* JADX INFO: loaded from: classes4.dex */
public final class pw0 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f93809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f93810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f93811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rw0 f93812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(List list, rw0 rw0Var, hn.c cVar) {
        super(2, cVar);
        this.f93811d = list;
        this.f93812e = rw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        pw0 pw0Var = new pw0(this.f93811d, this.f93812e, cVar);
        pw0Var.f93810c = obj;
        return pw0Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((pw0) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f93809b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f93810c;
            List list = this.f93811d;
            rw0 rw0Var = this.f93812e;
            ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(p000do.i.b(l0Var, null, null, new ow0(rw0Var, (dn2) it.next(), null), 3, null));
            }
            this.f93809b = 1;
            obj = AwaitKt.a(arrayList, this);
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
