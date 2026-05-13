package yads;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public final class xv2 implements by0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy0 f96890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f96891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i02 f96892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zs2 f96893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t42 f96894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d4 f96895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d22 f96896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ky0 f96897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v9 f96898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w02 f96899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f96900k;

    public /* synthetic */ xv2(fy0 fy0Var, lu2 lu2Var) {
        this(fy0Var, lu2Var, new i02());
    }

    public xv2(fy0 fy0Var, lu2 lu2Var, i02 i02Var) {
        this.f96890a = fy0Var;
        this.f96891b = lu2Var;
        this.f96892c = i02Var;
        Context contextG = fy0Var.g();
        d4 d4VarE = fy0Var.e();
        this.f96895f = d4VarE;
        this.f96896g = new d22(d4VarE);
        w5 w5VarF = fy0Var.f();
        this.f96893d = new zs2(d4VarE, lu2Var);
        this.f96894e = new t42(contextG, lu2Var, d4VarE, w5VarF);
        this.f96897h = new ky0(lu2Var);
    }

    @Override // yads.by0
    public final Object a(qy0 qy0Var, Activity activity) {
        Result.a aVar = Result.Companion;
        Object objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(o7.f93135b));
        v9 v9Var = this.f96898i;
        w02 w02Var = this.f96899j;
        if (v9Var == null || w02Var == null) {
            return objM7534constructorimpl;
        }
        d4 d4Var = this.f96895f;
        Object objA = this.f96897h.a(activity, new x1(v9Var, d4Var, qy0Var.f89446c, this.f96891b, w02Var, d4Var.f88753n, null, 64));
        this.f96898i = null;
        this.f96899j = null;
        return objA;
    }

    @Override // yads.fc
    public final List a() {
        i02 i02Var = this.f96892c;
        w02 w02Var = this.f96899j;
        i02Var.getClass();
        return i02.a(w02Var);
    }

    @Override // yads.by0
    public final void a(Context context) {
        this.f96900k = true;
        this.f96898i = null;
        this.f96899j = null;
        this.f96894e.f95063b.a();
        boolean z10 = ad1.f87661a;
    }

    @Override // yads.by0
    public final void a(Context context, v9 v9Var) {
        if (this.f96900k) {
            return;
        }
        this.f96898i = v9Var;
        this.f96890a.f97677b.a(v5.f95924c, null);
        this.f96894e.a(v9Var, new wv2(this), new vv2(this, context, v9Var));
    }

    @Override // yads.fc
    public final List b() {
        i02 i02Var = this.f96892c;
        w02 w02Var = this.f96899j;
        i02Var.getClass();
        return i02.b(w02Var);
    }

    @Override // yads.by0
    public final String getAdInfo() {
        return this.f96892c.c(this.f96899j);
    }
}
