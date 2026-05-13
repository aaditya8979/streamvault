package com.inmobi.media;

import android.content.Context;
import java.util.Calendar;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class Ib extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Jb f25653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f25654c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ib(Jb jb2, Context context, hn.c cVar) {
        super(1, cVar);
        this.f25653b = jb2;
        this.f25654c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new Ib(this.f25653b, this.f25654c, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new Ib(this.f25653b, this.f25654c, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = in.a.g();
        int i10 = this.f25652a;
        if (i10 == 0) {
            kotlin.c.b(obj);
            if (this.f25653b.f25719g.get()) {
                return bn.r.f5635a;
            }
            Jb jb2 = this.f25653b;
            Context context = this.f25654c;
            this.f25652a = 1;
            if (jb2.a(context, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        p000do.l0 l0Var = Sb.f26292a;
        C3856xb c3856xb = (C3856xb) AbstractC3881yb.f28577a.getValue();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Jb jb3 = this.f25653b;
        long j10 = timeInMillis - jb3.f25715c;
        int i11 = jb3.f25717e;
        tn.p.k(c3856xb, "dao");
        if (!Sb.f26294c.getAndSet(true)) {
            Qb qb2 = new Qb(c3856xb, j10, i11, null);
            p000do.l0 l0Var2 = AbstractC3492il.f27361a;
            tn.p.k(qb2, "runnable");
            p000do.i.d(AbstractC3492il.f27361a, null, null, new C3417fl(10000L, null, qb2), 3, null);
        }
        return bn.r.f5635a;
    }
}
