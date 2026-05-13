package yads;

import android.content.Context;
import com.ironsource.C3978d4;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import kotlin.Result;

/* JADX INFO: loaded from: classes7.dex */
public final class rt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd f94605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm0 f94606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f94607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cu2 f94608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xt2 f94609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xo2 f94610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zt2 f94611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q33 f94612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f94613i;

    public /* synthetic */ rt2(Context context, at1 at1Var, rd rdVar, lm0 lm0Var, w5 w5Var) {
        cu2 cu2Var = new cu2(context, at1Var);
        Object obj = xt2.f96867b;
        xt2 xt2VarA = wt2.a();
        Object obj2 = xo2.f96843a;
        this(context, rdVar, lm0Var, w5Var, cu2Var, xt2VarA, wo2.a(), new zt2(), new q33(at1Var));
    }

    public rt2(Context context, rd rdVar, lm0 lm0Var, w5 w5Var, cu2 cu2Var, xt2 xt2Var, xo2 xo2Var, zt2 zt2Var, q33 q33Var) {
        this.f94605a = rdVar;
        this.f94606b = lm0Var;
        this.f94607c = w5Var;
        this.f94608d = cu2Var;
        this.f94609e = xt2Var;
        this.f94610f = xo2Var;
        this.f94611g = zt2Var;
        this.f94612h = q33Var;
        this.f94613i = context.getApplicationContext();
    }

    public final void a(ox2 ox2Var, q61 q61Var, tt2 tt2Var) {
        String str;
        String libraryVersion;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(this.f94613i);
        if (nt2VarA != null && !this.f94608d.a()) {
            xy xyVar = xy.f96923d;
            if (tt2Var.f95354a.isActive()) {
                p000do.k kVar = tt2Var.f95354a;
                Result.a aVar = Result.Companion;
                kVar.resumeWith(Result.m7534constructorimpl(new hu2(nt2VarA, xyVar)));
                return;
            }
            return;
        }
        du2 du2Var = new du2(this.f94613i, this.f94609e, tt2Var, this.f94607c);
        io2 io2Var = this.f94612h.f93878a;
        co2 co2Var = co2.f88533c;
        io2Var.a(new eo2("sdk_configuration_request", kotlin.collections.a.C(cn.p0.g(bn.h.a("call_source", q61Var.f93907b))), null));
        jm0 jm0Var = this.f94606b.f92030a;
        Context context = this.f94613i;
        String str2 = jm0Var.f91281e;
        if (str2 == null || str2.length() == 0) {
            str = null;
        } else {
            zt2 zt2Var = this.f94611g;
            rd rdVar = this.f94605a;
            zt2Var.getClass();
            boolean zB = ox2Var.b(context);
            uu0 uu0Var = new uu0(zB);
            uu0Var.f95836u = jm0Var.b();
            uu0Var.f95820m = jm0Var.f91280d;
            td tdVar = rdVar.f94376a;
            boolean z10 = rdVar.f94378c;
            if (tdVar != null) {
                uu0Var.N = Boolean.valueOf(tdVar.f95148b);
                uu0Var.O = Boolean.valueOf(z10);
                String str3 = tdVar.f95147a;
                uu0Var.f95804e.getClass();
                boolean z11 = (str3 == null || str3.length() == 0 || tn.p.f("00000000-0000-0000-0000-000000000000", str3)) ? false : true;
                if (!zB && tn.p.f(uu0Var.N, Boolean.FALSE) && z11) {
                    uu0Var.P = str3;
                }
            }
            td tdVar2 = rdVar.f94377b;
            if (tdVar2 != null) {
                uu0Var.Q = Boolean.valueOf(tdVar2.f95148b);
                String str4 = tdVar2.f95147a;
                uu0Var.f95804e.getClass();
                boolean z12 = (str4 == null || str4.length() == 0 || tn.p.f("00000000-0000-0000-0000-000000000000", str4)) ? false : true;
                if (!zB && tn.p.f(uu0Var.Q, Boolean.FALSE) && z12) {
                    uu0Var.R = str4;
                }
            }
            uu0Var.f95800c.getClass();
            pg.a(context);
            try {
                libraryVersion = AppMetrica.getLibraryVersion();
            } catch (Throwable unused) {
                boolean z13 = ad1.f87661a;
                libraryVersion = null;
            }
            uu0Var.C0 = libraryVersion;
            uu0Var.C = Integer.valueOf(kl3.d(context));
            uu0Var.D = Integer.valueOf(kl3.b(context));
            uu0Var.E = Float.valueOf(context.getResources().getDisplayMetrics().density);
            uu0Var.f95831r0 = kl3.a(context);
            vg0 vg0VarB = vo3.b(context);
            uu0Var.f95833s0 = vg0VarB.f96085a;
            uu0Var.f95835t0 = vg0VarB.f96086b;
            uu0Var.f95837u0 = vg0VarB.f96087c;
            uu0Var.f95839v0 = vg0VarB.f96088d;
            uu0Var.f95841w0 = vg0VarB.f96089e;
            uu0Var.f95843x0 = vg0VarB.f96090f;
            uu0Var.f95816k = cw2.a().b();
            uu0Var.f95808g = ox2.a(context);
            uu0 uu0VarA = uu0Var.a(context, jm0Var.f91277a);
            uu0VarA.f95823n0 = context.getPackageName();
            uu0VarA.f95825o0 = og.a(context);
            uu0VarA.f95827p0 = og.b(context);
            uu0VarA.A0 = uu0VarA.f95802d.a("%d.%d%d");
            uu0VarA.B0 = uu0VarA.f95802d.a("%d.%d.%d");
            uu0VarA.f95814j = cw2.a().d();
            uu0VarA.f95806f = true;
            String[] strArr = {new yu0(uu0VarA).toString(), cn.f0.D0(jm0Var.f91278b, C3978d4.j.f31381c, null, null, 0, null, yt2.f97292b, 30, null)};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                String str5 = strArr[i10];
                if (!bo.d0.u0(str5)) {
                    arrayList.add(str5);
                }
            }
            String strA = zt2Var.f97765a.a(context, cn.f0.D0(arrayList, C3978d4.j.f31381c, null, null, 0, null, null, 62, null));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            if (!tn.p.f(String.valueOf(bo.f0.B1(sb2)), "/")) {
                sb2.append("/");
            }
            sb2.append("v1/startup");
            sb2.append("?");
            sb2.append(strA);
            String string = sb2.toString();
            tn.p.j(string, "toString(...)");
            str = string;
        }
        if (str == null || str.length() == 0) {
            du2Var.a((im3) new h4(m4.f92248j, null));
            return;
        }
        bu2 bu2Var = new bu2(this.f94613i, str, this.f94608d, jm0Var.f91279c, du2Var, du2Var);
        bu2Var.f93684q = this;
        this.f94607c.a(v5.f95933l, null);
        xo2 xo2Var = this.f94610f;
        Context context2 = this.f94613i;
        synchronized (xo2Var) {
            r82.a(context2).a(bu2Var);
        }
    }
}
