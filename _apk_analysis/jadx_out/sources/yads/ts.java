package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.ts;

/* JADX INFO: loaded from: classes2.dex */
public final class ts implements br2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f95337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f95338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ar2 f95339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tr2 f95340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii2 f95341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f95342g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q10 f95343h;

    public ts(Context context, rh1 rh1Var, mh1 mh1Var, ar2 ar2Var, tr2 tr2Var, ii2 ii2Var) {
        this.f95336a = context;
        this.f95337b = rh1Var;
        this.f95338c = mh1Var;
        this.f95339d = ar2Var;
        this.f95340e = tr2Var;
        this.f95341f = ii2Var;
    }

    public static final void a(ts tsVar, g9 g9Var) {
        dr2 dr2Var;
        tsVar.f95341f.getClass();
        if (!ii2.a(g9Var)) {
            tsVar.a(g9Var, new rs(tsVar), "default");
            return;
        }
        tr2 tr2Var = tsVar.f95340e;
        synchronized (tr2Var) {
            ki2 ki2Var = tr2Var.f95334a;
            tr2Var.f95335b.getClass();
            dr2Var = (dr2) ki2Var.a(oy0.a(g9Var));
        }
        if (dr2Var == null) {
            tsVar.a(g9Var, new rs(tsVar), "default");
            return;
        }
        q10 q10Var = tsVar.f95343h;
        if (q10Var != null) {
            q10Var.a(dr2Var);
        }
    }

    public static final void b(ts tsVar, g9 g9Var) {
        boolean zB;
        tsVar.f95341f.getClass();
        if (ii2.a(g9Var)) {
            tr2 tr2Var = tsVar.f95340e;
            synchronized (tr2Var) {
                zB = tr2Var.f95334a.b();
            }
            if (zB) {
                tsVar.a(g9Var, new qs(tsVar, g9Var), "render");
            }
        }
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        zq2 zq2Var = (zq2) fy0Var;
        if (this.f95343h == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        zq2Var.a((q10) null);
        this.f95342g.remove(zq2Var);
    }

    @Override // yads.br2
    public final void a(final g9 g9Var) {
        this.f95337b.a();
        if (this.f95343h == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f95338c.a(new Runnable() { // from class: bt.na
            @Override // java.lang.Runnable
            public final void run() {
                ts.a(this.f6184b, g9Var);
            }
        });
    }

    public final void a(g9 g9Var, q10 q10Var, String str) {
        g9 g9VarA = g9.a(g9Var, null, str, 2047);
        zq2 zq2VarA = this.f95339d.a(this.f95336a, this, g9VarA, new ss(this, g9VarA));
        this.f95342g.add(zq2VarA);
        String str2 = g9VarA.f89877a;
        zq2VarA.f97678c.a(str2);
        zq2VarA.F.f95703d = str2;
        zq2VarA.a(q10Var);
        zq2VarA.b(g9VarA);
    }

    @Override // yads.br2
    public final void a(hu3 hu3Var) {
        this.f95337b.a();
        this.f95343h = hu3Var;
    }

    public final void b(final g9 g9Var) {
        this.f95338c.a(new Runnable() { // from class: bt.oa
            @Override // java.lang.Runnable
            public final void run() {
                ts.b(this.f6204b, g9Var);
            }
        });
    }
}
