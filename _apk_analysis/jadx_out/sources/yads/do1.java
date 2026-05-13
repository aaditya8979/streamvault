package yads;

import android.content.Context;
import java.util.Map;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class do1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f88928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f88929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f88930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lo1 f88931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo1 f88932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eo1 f88933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sb2 f88934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final so1 f88935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public co1 f88936i;

    public /* synthetic */ do1(d4 d4Var, lu2 lu2Var, w5 w5Var, lo1 lo1Var, xo1 xo1Var, eo1 eo1Var, sb2 sb2Var) {
        this(d4Var, lu2Var, w5Var, lo1Var, xo1Var, eo1Var, sb2Var, new so1());
    }

    public do1(d4 d4Var, lu2 lu2Var, w5 w5Var, lo1 lo1Var, xo1 xo1Var, eo1 eo1Var, sb2 sb2Var, so1 so1Var) {
        this.f88928a = d4Var;
        this.f88929b = lu2Var;
        this.f88930c = w5Var;
        this.f88931d = lo1Var;
        this.f88932e = xo1Var;
        this.f88933f = eo1Var;
        this.f88934g = sb2Var;
        this.f88935h = so1Var;
    }

    public final void a() {
        qq1 qq1Var;
        co1 co1Var = this.f88936i;
        this.f88930c.a(v5.f95924c, new ac(do2.f88938d, (co1Var == null || (qq1Var = co1Var.f88530b) == null) ? null : qq1Var.f94111b), null);
    }

    public final void a(Context context) {
        co1 co1Var = this.f88936i;
        if (co1Var != null) {
            try {
                this.f88931d.a(co1Var.f88529a);
            } catch (Throwable th2) {
                qq1 qq1Var = co1Var.f88530b;
                String networkName = co1Var.f88531c.b().getNetworkName();
                boolean z10 = ad1.f87661a;
                Map mapG = cn.p0.g(bn.h.a("reason", cn.p0.g(bn.h.a("exception_in_adapter", th2.toString()))));
                xo1 xo1Var = this.f88932e;
                xo1Var.getClass();
                xo1Var.a(context, co2.f88536f, qq1Var, networkName, mapG);
            }
        }
    }

    public final void a(Context context, Object obj) {
        co1 co1VarA = this.f88933f.a(context);
        this.f88936i = co1VarA;
        if (co1VarA == null) {
            sb2 sb2Var = this.f88934g;
            lm2 lm2Var = sb2Var.f94766b;
            KProperty kProperty = sb2.f94764c[0];
            zn znVar = (zn) lm2Var.f92035a.get();
            if (znVar == null || znVar.f97693r == z5.f97392b) {
                return;
            }
            tb2 tb2Var = sb2Var.f94765a;
            znVar.a(z5.f97394d);
            synchronized (znVar) {
                p000do.i.d(znVar.f97680e, null, null, new qn(znVar, tb2Var, null), 3, null);
            }
            return;
        }
        d4 d4Var = this.f88928a;
        d4Var.f88750k = co1VarA.f88530b;
        d4Var.f88751l = co1VarA.f88531c.b().getNetworkName();
        this.f88930c.a(v5.f95924c, null);
        qq1 qq1Var = co1VarA.f88530b;
        String networkName = co1VarA.f88531c.b().getNetworkName();
        xo1 xo1Var = this.f88932e;
        xo1Var.getClass();
        xo1Var.a(context, co2.f88537g, qq1Var, networkName, kotlin.collections.a.j());
        try {
            lo1 lo1Var = this.f88931d;
            com.monetization.ads.mediation.base.a aVar = co1VarA.f88529a;
            Map mapA = co1VarA.f88532d.a(context);
            ep1 ep1Var = co1VarA.f88532d;
            qq1 qq1Var2 = co1VarA.f88530b;
            ep1Var.getClass();
            lo1Var.a(context, aVar, obj, mapA, qq1Var2.f94112c);
        } catch (Throwable th2) {
            boolean z10 = ad1.f87661a;
            Map mapG = cn.p0.g(bn.h.a("reason", cn.p0.g(bn.h.a("exception_in_adapter", th2.toString()))));
            xo1 xo1Var2 = this.f88932e;
            xo1Var2.getClass();
            xo1Var2.a(context, co2.f88536f, qq1Var, networkName, mapG);
            a();
            a(context, obj);
        }
    }
}
