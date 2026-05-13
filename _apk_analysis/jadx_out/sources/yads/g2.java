package yads;

import android.content.Context;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class g2 implements h2, kz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f89772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f89773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Window f89774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w02 f89775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v9 f89776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f2 f89777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d4 f89778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nt2 f89779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zx0 f89780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ey0 f89781j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final py0 f89782k;

    public g2(Context context, RelativeLayout relativeLayout, Window window, w02 w02Var, v9 v9Var, q2 q2Var, b2 b2Var, d4 d4Var, lu2 lu2Var, int i10, nt2 nt2Var, zx0 zx0Var, ey0 ey0Var) {
        this.f89772a = context;
        this.f89773b = relativeLayout;
        this.f89774c = window;
        this.f89775d = w02Var;
        this.f89776e = v9Var;
        this.f89777f = q2Var;
        this.f89778g = d4Var;
        this.f89779h = nt2Var;
        this.f89780i = zx0Var;
        this.f89781j = ey0Var;
        this.f89782k = new uy0(context, v9Var, relativeLayout, this, b2Var, i10, q2Var, d4Var, lu2Var).a(context, w02Var, this);
    }

    @Override // yads.h2
    public final void a() {
        ((q2) this.f89777f).a(2, null);
    }

    @Override // yads.h2
    public final void b() {
        ((q2) this.f89777f).a(3, null);
    }

    @Override // yads.h2
    public final void c() {
        if (this.f89778g.f88740a != e00.f89045i) {
            this.f89773b.setBackground(u9.f95579a);
        }
        this.f89782k.c();
        ((q2) this.f89777f).a(0, null);
        ((q2) this.f89777f).a(5, null);
        boolean z10 = ad1.f87661a;
    }

    @Override // yads.h2
    public final boolean d() {
        zx0 zx0Var = this.f89780i;
        zx0Var.getClass();
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(zx0Var.f97821a);
        return nt2VarA != null && nt2VarA.f92972s;
    }

    @Override // yads.kz
    public final void e() {
        ((q2) this.f89777f).f93865a.finish();
    }

    @Override // yads.h2
    public final void f() {
        nt2 nt2Var;
        ((q2) this.f89777f).a(this.f89772a.getResources().getConfiguration().orientation == 1 ? 7 : 6);
        this.f89774c.requestFeature(1);
        this.f89774c.addFlags(1024);
        this.f89774c.addFlags(16777216);
        if (this.f89776e.F || ((nt2Var = this.f89779h) != null && nt2Var.E0)) {
            ey0 ey0Var = this.f89781j;
            Window window = this.f89774c;
            ey0Var.getClass();
            WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(WindowInsetsCompat.Type.navigationBars());
        }
        this.f89781j.a(this.f89774c, this.f89773b);
    }

    @Override // yads.h2
    public final void g() {
        this.f89782k.invalidate();
    }

    @Override // yads.h2
    public final void onAdClosed() {
        this.f89775d.destroy();
        ((q2) this.f89777f).a(4, null);
    }
}
