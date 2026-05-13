package yads;

import android.content.Context;
import com.ironsource.Z7;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class xh extends SuspendLambda implements sn.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f96773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lu2 f96774c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(Context context, lu2 lu2Var, hn.c cVar) {
        super(2, cVar);
        this.f96773b = context;
        this.f96774c = lu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(Object obj, hn.c cVar) {
        return new xh(this.f96773b, this.f96774c, cVar);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo2invoke(Object obj, Object obj2) {
        return new xh(this.f96773b, this.f96774c, (hn.c) obj2).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        in.a.g();
        kotlin.c.b(obj);
        boolean z10 = ha3.f90337a;
        ha3.a(this.f96773b, ((iu3) this.f96774c).a());
        xf.a(this.f96773b, ((iu3) this.f96774c).a());
        AtomicBoolean atomicBoolean = ji.f91229a;
        ji.a(this.f96773b, ((iu3) this.f96774c).a());
        sh1 sh1Var = new sh1();
        Boolean boolA = sh1.a(this.f96773b);
        if (boolA != null) {
            tu1.b(boolA.booleanValue());
        }
        Boolean boolB = sh1.b(this.f96773b);
        if (boolB != null) {
            tu1.a(boolB.booleanValue());
        }
        if (ub.a(this.f96773b)) {
            zt1 zt1VarA = au1.a(this.f96773b);
            if (zt1VarA instanceof yt1) {
                lc1.a(new nc1().a((yt1) zt1VarA), new Object[0]);
            } else if (zt1VarA instanceof xt1) {
                lc1.b("Yandex Mobile Ads" + Z7.f30794r + "7.18.1 integrated successfully", new Object[0]);
            }
            cr1 cr1Var = new cr1();
            String str = pq1.f93719d;
            qr1.a(new tr1(cr1Var).a(new or1().a(mq1.a())));
        }
        ew2 ew2Var = new ew2(sh1Var, this.f96774c);
        j1.a(this.f96773b);
        ew2Var.a(this.f96773b);
        return bn.r.f5635a;
    }
}
