package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$layout;
import yads.qs0;

/* JADX INFO: loaded from: classes3.dex */
public final class qs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi2 f94129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d4 f94130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lu2 f94131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh0 f94132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ve1 f94133e;

    public qs0(hi2 hi2Var, d4 d4Var, lu2 lu2Var, qh0 qh0Var, ve1 ve1Var) {
        this.f94129a = hi2Var;
        this.f94130b = d4Var;
        this.f94131c = lu2Var;
        this.f94132d = qh0Var;
        this.f94133e = ve1Var;
    }

    public static final void a() {
    }

    public final se1 a(Context context, v9 v9Var, v22 v22Var, z00 z00Var, lh3 lh3Var) {
        hi2 hi2Var = this.f94129a;
        pu puVar = hi2Var.f90431c;
        zh0 zh0Var = hi2Var.f90432d;
        kz kzVar = new kz() { // from class: bt.z8
            @Override // yads.kz
            public final void e() {
                qs0.a();
            }
        };
        wm wmVar = new wm();
        at1 at1VarA = ((iu3) this.f94131c).a();
        this.f94132d.getClass();
        jy jyVar = new jy(new st0(this.f94129a, new oh0(context, this.f94130b, this.f94131c, v9Var, kzVar, wmVar, zh0Var), at1VarA), qh0.a(v22Var, kzVar, z00Var, puVar, at1VarA), new n22(v22Var.O, lh3Var));
        ji0 ji0Var = new ji0(v9Var);
        ve1 ve1Var = this.f94133e;
        int i10 = R$layout.monetization_ads_internal_divkit;
        ve1Var.getClass();
        return new se1(i10, jyVar, ji0Var);
    }
}
