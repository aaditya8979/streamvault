package yads;

import android.app.Activity;
import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
public final class yp1 implements by0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy0 f97262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do1 f97263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aq1 f97264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hr2 f97265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo1 f97266e;

    public yp1(fy0 fy0Var, v9 v9Var, hq1 hq1Var) {
        this.f97262a = fy0Var;
        d4 d4VarE = fy0Var.e();
        lu2 lu2VarH = fy0Var.h();
        ep1 ep1Var = new ep1(d4VarE);
        xo1 xo1Var = new xo1(d4VarE, lu2VarH, v9Var);
        this.f97266e = xo1Var;
        zp1 zp1Var = new zp1(new mo1(hq1Var.c(), ep1Var, xo1Var));
        w5 w5VarF = fy0Var.f();
        sb2 sb2Var = new sb2(fy0Var, hq1Var);
        aq1 aq1Var = new aq1();
        this.f97264c = aq1Var;
        do1 do1Var = new do1(d4VarE, lu2VarH, w5VarF, aq1Var, xo1Var, zp1Var, sb2Var);
        this.f97263b = do1Var;
        this.f97265d = new hr2(fy0Var, do1Var);
    }

    @Override // yads.by0
    public final Object a(qy0 qy0Var, Activity activity) {
        Object objM7534constructorimpl;
        co1 co1Var;
        wq2 wq2Var = (wq2) qy0Var;
        try {
            Result.a aVar = Result.Companion;
            MediatedRewardedAdapter mediatedRewardedAdapter = this.f97264c.f87774a;
            if (mediatedRewardedAdapter != null) {
                lm2 lm2Var = this.f97265d.f90516c;
                KProperty kProperty = hr2.f90513e[0];
                lm2Var.getClass();
                lm2Var.f92035a = new WeakReference(wq2Var);
                t8 t8Var = this.f97262a.f97681f;
                if (t8Var.b()) {
                    ((a9) t8Var.f95098f.getValue()).onAdWillDisplay();
                }
                mediatedRewardedAdapter.showRewardedAd(activity);
            }
            objM7534constructorimpl = Result.m7534constructorimpl(bn.r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null && (co1Var = this.f97263b.f88936i) != null) {
            Context applicationContext = activity.getApplicationContext();
            boolean z10 = ad1.f87661a;
            Map mapG = cn.p0.g(bn.h.a("reason", cn.p0.g(bn.h.a("exception_in_adapter", thM7537exceptionOrNullimpl.toString()))));
            xo1 xo1Var = this.f97266e;
            qq1 qq1Var = co1Var.f88530b;
            String networkName = co1Var.f88531c.b().getNetworkName();
            xo1Var.getClass();
            xo1Var.a(applicationContext, co2.f88536f, qq1Var, networkName, mapG);
        }
        return objM7534constructorimpl;
    }

    @Override // yads.fc
    public final List a() {
        return cn.w.m();
    }

    @Override // yads.by0
    public final void a(Context context) {
        this.f97262a.f97681f.a();
        this.f97263b.a(context);
    }

    @Override // yads.by0
    public final void a(Context context, v9 v9Var) {
        this.f97263b.a(context, this.f97265d);
    }

    @Override // yads.fc
    public final List b() {
        return cn.w.m();
    }

    @Override // yads.by0
    public final String getAdInfo() {
        return null;
    }
}
