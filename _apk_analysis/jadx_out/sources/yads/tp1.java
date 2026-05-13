package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class tp1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f95317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f95318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hp f95319e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, hp hpVar, hn.c cVar) {
        super(2, cVar);
        this.f95317c = aVar;
        this.f95318d = context;
        this.f95319e = hpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new tp1(this.f95317c, this.f95318d, this.f95319e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((tp1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Collection<cs1> collectionM;
        List list;
        Object objG = in.a.g();
        int i10 = this.f95316b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f95317c;
            Context context = this.f95318d;
            hp hpVar = this.f95319e;
            this.f95316b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f51084g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.f51084g.getAndSet(false)) {
                aVar.f51087b.getClass();
                gs1 gs1Var = hpVar.f90476c;
                if (gs1Var == null || (list = gs1Var.f90102c) == null) {
                    collectionM = cn.w.m();
                } else {
                    collectionM = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        cn.b0.F(collectionM, ((xr1) it.next()).f96860c);
                    }
                }
                ArrayList arrayList = new ArrayList(cn.x.x(collectionM, 10));
                for (cs1 cs1Var : collectionM) {
                    aVar.f51088c.getClass();
                    arrayList.add(new qq1(cs1Var.f88595b, cs1Var.f88596c, null, null, null, null, null));
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
