package yads;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class aw2 implements by0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy0 f87820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f87821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i02 f87822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zs2 f87823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t42 f87824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d4 f87825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d22 f87826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ky0 f87827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v9 f87828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w02 f87829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f87830k;

    public aw2(fy0 fy0Var, lu2 lu2Var, i02 i02Var) {
        this.f87820a = fy0Var;
        this.f87821b = lu2Var;
        this.f87822c = i02Var;
        Context contextG = fy0Var.g();
        d4 d4VarE = fy0Var.e();
        this.f87825f = d4VarE;
        this.f87826g = new d22(d4VarE);
        w5 w5VarF = fy0Var.f();
        this.f87823d = new zs2(d4VarE, lu2Var);
        this.f87824e = new t42(contextG, lu2Var, d4VarE, w5VarF);
        this.f87827h = new ky0(lu2Var);
    }

    @Override // yads.by0
    public final Object a(qy0 qy0Var, Activity activity) {
        wq2 wq2Var = (wq2) qy0Var;
        Result.a aVar = Result.Companion;
        Object objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(o7.f93135b));
        v9 v9Var = this.f87828i;
        w02 w02Var = this.f87829j;
        if (v9Var == null || w02Var == null) {
            return objM7534constructorimpl;
        }
        d4 d4Var = this.f87825f;
        Object objA = this.f87827h.a(activity, new x1(v9Var, d4Var, wq2Var.f89446c, this.f87821b, w02Var, d4Var.f88753n, null, 64));
        this.f87828i = null;
        this.f87829j = null;
        return objA;
    }

    @Override // yads.fc
    public final List a() {
        return cn.w.m();
    }

    @Override // yads.by0
    public final void a(Context context) {
        this.f87830k = true;
        this.f87828i = null;
        this.f87829j = null;
        this.f87824e.f95063b.a();
        boolean z10 = ad1.f87661a;
    }

    @Override // yads.by0
    public final void a(Context context, v9 v9Var) {
        if (this.f87830k) {
            return;
        }
        this.f87828i = v9Var;
        this.f87820a.f97677b.a(v5.f95924c, null);
        this.f87824e.a(v9Var, new zv2(this), new yv2(this, context, v9Var));
    }

    @Override // yads.fc
    public final List b() {
        i02 i02Var = this.f87822c;
        w02 w02Var = this.f87829j;
        i02Var.getClass();
        return i02.b(w02Var);
    }

    @Override // yads.by0
    public final String getAdInfo() {
        return this.f87822c.c(this.f87829j);
    }
}
