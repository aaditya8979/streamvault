package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.ps;

/* JADX INFO: loaded from: classes12.dex */
public final class ps implements hd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f93736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f93737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f93738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gd1 f93739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd1 f93740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ii2 f93741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList f93742g = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w00 f93743h;

    public ps(Context context, rh1 rh1Var, mh1 mh1Var, gd1 gd1Var, qd1 qd1Var, ii2 ii2Var) {
        this.f93736a = context;
        this.f93737b = rh1Var;
        this.f93738c = mh1Var;
        this.f93739d = gd1Var;
        this.f93740e = qd1Var;
        this.f93741f = ii2Var;
    }

    public static final void a(ps psVar, g9 g9Var) {
        jd1 jd1Var;
        psVar.f93741f.getClass();
        if (!ii2.a(g9Var)) {
            psVar.a(g9Var, new os(psVar), "default");
            return;
        }
        qd1 qd1Var = psVar.f93740e;
        synchronized (qd1Var) {
            ki2 ki2Var = qd1Var.f94013a;
            qd1Var.f94014b.getClass();
            jd1Var = (jd1) ki2Var.a(oy0.a(g9Var));
        }
        if (jd1Var == null) {
            psVar.a(g9Var, new os(psVar), "default");
            return;
        }
        w00 w00Var = psVar.f93743h;
        if (w00Var != null) {
            w00Var.a(jd1Var);
        }
    }

    public static final void b(ps psVar, g9 g9Var) {
        boolean zB;
        psVar.f93741f.getClass();
        if (ii2.a(g9Var)) {
            qd1 qd1Var = psVar.f93740e;
            synchronized (qd1Var) {
                zB = qd1Var.f94013a.b();
            }
            if (zB) {
                psVar.a(g9Var, new ns(psVar, g9Var), "render");
            }
        }
    }

    @Override // yads.hd1
    public final void a(ct3 ct3Var) {
        this.f93737b.a();
        this.f93743h = ct3Var;
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        fd1 fd1Var = (fd1) fy0Var;
        if (this.f93743h == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        fd1Var.a((w00) null);
        this.f93742g.remove(fd1Var);
    }

    @Override // yads.hd1
    public final void a(final g9 g9Var) {
        this.f93737b.a();
        if (this.f93743h == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f93738c.a(new Runnable() { // from class: bt.l8
            @Override // java.lang.Runnable
            public final void run() {
                ps.a(this.f6139b, g9Var);
            }
        });
    }

    public final void a(g9 g9Var, w00 w00Var, String str) {
        g9 g9VarA = g9.a(g9Var, null, str, 2047);
        fd1 fd1VarA = this.f93739d.a(this.f93736a, this, g9VarA, new ms(this, g9VarA));
        this.f93742g.add(fd1VarA);
        String str2 = g9VarA.f89877a;
        fd1VarA.f97678c.a(str2);
        fd1VarA.F.f94860f = str2;
        fd1VarA.a(w00Var);
        fd1VarA.b(g9VarA);
    }

    public final void b(final g9 g9Var) {
        this.f93738c.a(new Runnable() { // from class: bt.m8
            @Override // java.lang.Runnable
            public final void run() {
                ps.b(this.f6159b, g9Var);
            }
        });
    }
}
