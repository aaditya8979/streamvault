package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AwaitKt;

/* JADX INFO: loaded from: classes4.dex */
public final class w72 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f96301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f96302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x72 f96303e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w72(x72 x72Var, List list, hn.c cVar) {
        super(2, cVar);
        this.f96302d = list;
        this.f96303e = x72Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        w72 w72Var = new w72(this.f96303e, this.f96302d, cVar);
        w72Var.f96301c = obj;
        return w72Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((w72) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f96300b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            p000do.l0 l0Var = (p000do.l0) this.f96301c;
            List<je3> list = this.f96302d;
            x72 x72Var = this.f96303e;
            ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
            for (je3 je3Var : list) {
                arrayList.add(je3Var.f91195b.f95602a ? p000do.i.b(l0Var, null, null, new v72(x72Var, je3Var, null), 3, null) : p000do.v.a(cn.v.e(je3Var)));
            }
            this.f96300b = 1;
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
        return cn.x.z((Iterable) obj);
    }
}
