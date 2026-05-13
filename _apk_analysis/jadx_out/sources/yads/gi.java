package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class gi extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hi f89987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(hi hiVar, hn.c cVar) {
        super(2, cVar);
        this.f89987b = hiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new gi(this.f89987b, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new gi(this.f89987b, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        try {
            long jB = ((tg1) this.f89987b.f90423e.f91585a).b("ExitInfoAnrLastReportedTimestamp");
            hi hiVar = this.f89987b;
            ei eiVar = hiVar.f90421c;
            wf wfVar = hiVar.f90419a;
            List listA = eiVar.a(wfVar.f96362b, wfVar.f96363c, jB);
            if (listA.isEmpty()) {
                return bn.r.f5635a;
            }
            this.f89987b.f90425g.getClass();
            ArrayList arrayListA = mf.a(listA);
            if (arrayListA.isEmpty()) {
                return bn.r.f5635a;
            }
            ArrayList arrayListA2 = this.f89987b.f90425g.a(arrayListA);
            if (arrayListA2.isEmpty()) {
                return bn.r.f5635a;
            }
            this.f89987b.f90422d.a(arrayListA2);
            hi.a(this.f89987b, arrayListA2);
            this.f89987b.f90426h.set(false);
            return bn.r.f5635a;
        } finally {
            this.f89987b.f90426h.set(false);
        }
    }
}
