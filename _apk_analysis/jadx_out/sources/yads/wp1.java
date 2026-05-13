package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes12.dex */
public final class wp1 extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f96467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f96468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qq1 f96469e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, qq1 qq1Var, hn.c cVar) {
        super(2, cVar);
        this.f96467c = aVar;
        this.f96468d = context;
        this.f96469e = qq1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new wp1(this.f96467c, this.f96468d, this.f96469e, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return ((wp1) create((p000do.l0) obj, (hn.c) obj2)).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f96466b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f96467c;
            Context context = this.f96468d;
            qq1 qq1Var = this.f96469e;
            this.f96466b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f51084g;
            if (aVar.a(context, qq1Var, this) == objG) {
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
