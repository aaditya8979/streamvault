package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes4.dex */
public final class up1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f95750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f95751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hp f95752e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, hp hpVar, hn.c cVar) {
        super(2, cVar);
        this.f95750c = aVar;
        this.f95751d = context;
        this.f95752e = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new up1(this.f95750c, this.f95751d, this.f95752e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((up1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objG = in.a.g();
        int i10 = this.f95749b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f95750c;
            Context context = this.f95751d;
            hp hpVar = this.f95752e;
            this.f95749b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f51084g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.f51085h.getAndSet(false)) {
                aVar.f51087b.getClass();
                List list = hpVar.f90475b;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cn.b0.F(arrayList, ((gb) it.next()).f89899c);
                }
                objC = p000do.j2.c(new xp1(aVar.f51090e.a(arrayList), aVar, context, null), this);
                if (objC != in.a.g()) {
                    objC = bn.r.f5635a;
                }
                if (objC != in.a.g()) {
                    objC = bn.r.f5635a;
                }
            } else {
                objC = bn.r.f5635a;
            }
            if (objC == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return bn.r.f5635a;
    }
}
