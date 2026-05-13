package com.monetization.ads.mediation.interstitial;

import android.app.Activity;
import android.content.Context;
import bn.h;
import bn.r;
import cn.p0;
import cn.w;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.reflect.KProperty;
import yads.a9;
import yads.ad1;
import yads.by0;
import yads.co1;
import yads.co2;
import yads.d4;
import yads.do1;
import yads.ep1;
import yads.fy0;
import yads.hq1;
import yads.ip1;
import yads.lm2;
import yads.lu2;
import yads.mo1;
import yads.qq1;
import yads.qy0;
import yads.sb2;
import yads.t8;
import yads.v9;
import yads.w5;
import yads.xo1;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements by0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy0 f51098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final do1 f51099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f51100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f51101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xo1 f51102e;

    public c(fy0 fy0Var, v9 v9Var, hq1 hq1Var) {
        this.f51098a = fy0Var;
        d4 d4VarE = fy0Var.e();
        lu2 lu2VarH = fy0Var.h();
        ep1 ep1Var = new ep1(d4VarE);
        xo1 xo1Var = new xo1(d4VarE, lu2VarH, v9Var);
        this.f51102e = xo1Var;
        ip1 ip1Var = new ip1(new mo1(hq1Var.c(), ep1Var, xo1Var));
        w5 w5VarF = fy0Var.f();
        sb2 sb2Var = new sb2(fy0Var, hq1Var);
        b bVar = new b();
        this.f51100c = bVar;
        do1 do1Var = new do1(d4VarE, lu2VarH, w5VarF, bVar, xo1Var, ip1Var, sb2Var);
        this.f51099b = do1Var;
        this.f51101d = new a(fy0Var, do1Var);
    }

    @Override // yads.by0
    public final Object a(qy0 qy0Var, Activity activity) {
        Object objM7534constructorimpl;
        co1 co1Var;
        try {
            Result.a aVar = Result.Companion;
            MediatedInterstitialAdapter mediatedInterstitialAdapter = this.f51100c.f51097a;
            if (mediatedInterstitialAdapter != null) {
                lm2 lm2Var = this.f51101d.f51095c;
                KProperty kProperty = a.f51092e[0];
                lm2Var.getClass();
                lm2Var.f92035a = new WeakReference(qy0Var);
                t8 t8Var = this.f51098a.f97681f;
                if (t8Var.b()) {
                    ((a9) t8Var.f95098f.getValue()).onAdWillDisplay();
                }
                mediatedInterstitialAdapter.showInterstitial(activity);
            }
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
        if (thM7537exceptionOrNullimpl != null && (co1Var = this.f51099b.f88936i) != null) {
            Context applicationContext = activity.getApplicationContext();
            boolean z10 = ad1.f87661a;
            Map mapG = p0.g(h.a("reason", p0.g(h.a("exception_in_adapter", thM7537exceptionOrNullimpl.toString()))));
            xo1 xo1Var = this.f51102e;
            qq1 qq1Var = co1Var.f88530b;
            String networkName = co1Var.f88531c.b().getNetworkName();
            xo1Var.getClass();
            xo1Var.a(applicationContext, co2.f88536f, qq1Var, networkName, mapG);
        }
        return objM7534constructorimpl;
    }

    @Override // yads.fc
    public final List a() {
        return w.m();
    }

    @Override // yads.by0
    public final void a(Context context) {
        this.f51098a.f97681f.a();
        this.f51099b.a(context);
    }

    @Override // yads.by0
    public final void a(Context context, v9 v9Var) {
        this.f51099b.a(context, this.f51101d);
    }

    @Override // yads.fc
    public final List b() {
        return w.m();
    }

    @Override // yads.by0
    public final String getAdInfo() {
        return null;
    }
}
