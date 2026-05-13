package yads;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f90615m = {wb.a(i1.class, "activityInteractionEventListener", "getActivityInteractionEventListener()Lcom/monetization/ads/base/tracker/interaction/ActivityInteractionEventListener;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f90616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f90617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dr0 f90618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n9 f90619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io2 f90620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kr0 f90621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hr0 f90622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f90623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lm2 f90624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h1 f90625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i22 f90626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f90627l;

    public /* synthetic */ i1(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var, g1 g1Var, dr0 dr0Var) {
        n9 n9Var = new n9();
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f93787a;
        at1 at1VarA = cf.a(context, iu3Var.b());
        kr0 kr0Var = dr0Var != null ? new kr0(context, d4Var, lu2Var, dr0Var) : null;
        hr0 hr0VarA = gr0.a(context);
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        this(d4Var, v9Var, g1Var, dr0Var, n9Var, at1VarA, kr0Var, hr0VarA, nt2VarA != null && nt2VarA.i());
    }

    public i1(d4 d4Var, v9 v9Var, g1 g1Var, dr0 dr0Var, n9 n9Var, io2 io2Var, kr0 kr0Var, hr0 hr0Var, boolean z10) {
        this.f90616a = d4Var;
        this.f90617b = v9Var;
        this.f90618c = dr0Var;
        this.f90619d = n9Var;
        this.f90620e = io2Var;
        this.f90621f = kr0Var;
        this.f90622g = hr0Var;
        this.f90623h = z10;
        this.f90624i = mm2.a(g1Var);
    }

    public final eo2 a(h1 h1Var, String str) {
        fo2 fo2VarA = this.f90619d.a(this.f90616a.f88744e);
        fo2VarA.b(h1Var.f90192b, "type");
        fo2VarA.b(this.f90616a.f88740a.f89049b, "ad_type");
        fo2VarA.b(this.f90616a.f88742c.f90339a, "ad_unit_id");
        fo2VarA.b(str, "interval");
        i22 i22Var = this.f90626k;
        if (i22Var != null) {
            fo2VarA = go2.a(fo2VarA, i22Var.a());
        }
        co2 co2Var = co2.f88533c;
        Map map = fo2VarA.f89652a;
        v9 v9Var = this.f90617b;
        return new eo2("returned_to_app", kotlin.collections.a.C(map), v9Var != null ? v9Var.f95998i : null);
    }

    public final void a(h1 h1Var) {
        Objects.toString(h1Var);
        boolean z10 = ad1.f87661a;
        if (this.f90627l == 0 || this.f90625j != h1Var) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f90627l;
        this.f90620e.a(a(h1Var, rd1.a(jCurrentTimeMillis)));
        lm2 lm2Var = this.f90624i;
        KProperty kProperty = f90615m[0];
        g1 g1Var = (g1) lm2Var.f92035a.get();
        if (g1Var != null) {
            g1Var.onReturnedToApplication();
        }
        kr0 kr0Var = this.f90621f;
        if (kr0Var != null) {
            kr0Var.a(jCurrentTimeMillis);
            if (this.f90623h) {
                this.f90622g.a(this.f90627l);
            }
        }
        this.f90627l = 0L;
        this.f90625j = null;
    }

    public final void b(h1 h1Var) {
        Objects.toString(h1Var);
        boolean z10 = ad1.f87661a;
        this.f90627l = System.currentTimeMillis();
        this.f90625j = h1Var;
        if (h1Var == h1.f90188c && this.f90623h) {
            Map mapB = a(h1Var, null).b();
            v9 v9Var = this.f90617b;
            this.f90622g.a(new er0(this.f90616a.a(), this.f90627l, h1Var, this.f90618c, mapB, v9Var != null ? v9Var.a() : null));
        }
    }
}
