package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes9.dex */
public final class vh2 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f96094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xh2 f96095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f96096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e00 f96097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a03 f96098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f96099h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh2(long j10, Context context, e00 e00Var, a03 a03Var, xh2 xh2Var, List list, hn.c cVar) {
        super(2, cVar);
        this.f96094c = list;
        this.f96095d = xh2Var;
        this.f96096e = context;
        this.f96097f = e00Var;
        this.f96098g = a03Var;
        this.f96099h = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        List list = this.f96094c;
        xh2 xh2Var = this.f96095d;
        vh2 vh2Var = new vh2(this.f96099h, this.f96096e, this.f96097f, this.f96098g, xh2Var, list, cVar);
        vh2Var.f96093b = obj;
        return vh2Var;
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((vh2) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        p000do.l0 l0Var = (p000do.l0) this.f96093b;
        List<cs1> list = this.f96094c;
        xh2 xh2Var = this.f96095d;
        Context context = this.f96096e;
        e00 e00Var = this.f96097f;
        a03 a03Var = this.f96098g;
        long j10 = this.f96099h;
        ArrayList arrayList = new ArrayList(cn.x.x(list, 10));
        for (cs1 cs1Var : list) {
            xh2Var.getClass();
            ArrayList arrayList2 = arrayList;
            arrayList2.add(p000do.i.b(l0Var, null, null, new sh2(xh2Var, cs1Var, context, e00Var, j10, a03Var, null), 3, null));
            arrayList = arrayList2;
            j10 = j10;
        }
        return arrayList;
    }
}
