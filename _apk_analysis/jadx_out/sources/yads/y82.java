package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class y82 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z82 f97024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f97025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f97026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ep f97027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y82(z82 z82Var, CountDownLatch countDownLatch, ArrayList arrayList, ep epVar, hn.c cVar) {
        super(2, cVar);
        this.f97024b = z82Var;
        this.f97025c = countDownLatch;
        this.f97026d = arrayList;
        this.f97027e = epVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new y82(this.f97024b, this.f97025c, this.f97026d, this.f97027e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((y82) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        JSONArray jSONArray;
        in.a.g();
        kotlin.c.b(obj);
        z82 z82Var = this.f97024b;
        CountDownLatch countDownLatch = this.f97025c;
        ArrayList arrayList = this.f97026d;
        ep epVar = this.f97027e;
        z82Var.getClass();
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                boolean z10 = ad1.f87661a;
            }
            epVar.f89343a.set(true);
            synchronized (z82Var.f97424b) {
                jSONArray = new JSONArray((Collection) arrayList);
            }
            return jSONArray;
        } catch (InterruptedException unused) {
            boolean z11 = ad1.f87661a;
            return null;
        }
    }
}
