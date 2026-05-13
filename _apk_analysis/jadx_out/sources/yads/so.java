package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.so;

/* JADX INFO: loaded from: classes2.dex */
public final class so implements br2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f94891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f94892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ar2 f94893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f94894e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q10 f94895f;

    public so(Context context, rh1 rh1Var, mh1 mh1Var, ar2 ar2Var) {
        this.f94890a = context;
        this.f94891b = rh1Var;
        this.f94892c = mh1Var;
        this.f94893d = ar2Var;
    }

    public static final void a(so soVar, g9 g9Var) {
        zq2 zq2VarA = soVar.f94893d.a(soVar.f94890a, soVar, g9Var, null);
        soVar.f94894e.add(zq2VarA);
        String str = g9Var.f89877a;
        zq2VarA.f97678c.a(str);
        zq2VarA.F.f95703d = str;
        zq2VarA.a(soVar.f94895f);
        zq2VarA.b(g9Var);
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        zq2 zq2Var = (zq2) fy0Var;
        if (this.f94895f == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        zq2Var.a((q10) null);
        this.f94894e.remove(zq2Var);
    }

    @Override // yads.br2
    public final void a(final g9 g9Var) {
        this.f94891b.a();
        if (this.f94895f == null) {
            lc1.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f94892c.a(new Runnable() { // from class: bt.x9
            @Override // java.lang.Runnable
            public final void run() {
                so.a(this.f6401b, g9Var);
            }
        });
    }

    @Override // yads.br2
    public final void a(hu3 hu3Var) {
        this.f94891b.a();
        this.f94895f = hu3Var;
        Iterator it = this.f94894e.iterator();
        while (it.hasNext()) {
            ((zq2) it.next()).a((q10) hu3Var);
        }
    }
}
