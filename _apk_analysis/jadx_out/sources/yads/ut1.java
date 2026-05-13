package yads;

import android.content.Context;
import java.util.ArrayList;
import yads.ut1;

/* JADX INFO: loaded from: classes4.dex */
public final class ut1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f95782f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile ut1 f95783g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt1 f95784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rt1 f95785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uu2 f95786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lu2 f95787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tt1 f95788e;

    public ut1(nt1 nt1Var, rt1 rt1Var, uu2 uu2Var, lu2 lu2Var, tt1 tt1Var) {
        this.f95784a = nt1Var;
        this.f95785b = rt1Var;
        this.f95786c = uu2Var;
        this.f95787d = lu2Var;
        this.f95788e = tt1Var;
    }

    public static final void a(l00 l00Var) {
        l00Var.onInitializationCompleted();
    }

    public static final void a(ut1 ut1Var) {
        ArrayList<s61> arrayList;
        rt1 rt1Var = ut1Var.f95785b;
        synchronized (rt1Var.f94603a) {
            arrayList = new ArrayList(rt1Var.f94604b);
            rt1Var.f94604b.clear();
            bn.r rVar = bn.r.f5635a;
        }
        for (s61 s61Var : arrayList) {
            if (s61Var != null) {
                s61Var.a();
            }
        }
    }

    public static final void a(ut1 ut1Var, Context context, l00 l00Var) {
        ut1Var.b(context, l00Var);
    }

    public final void a(final Context context, final l00 l00Var) {
        j1.a(context);
        nt1 nt1Var = this.f95784a;
        nt1Var.f92935a.f93323b.execute(new Runnable() { // from class: bt.za
            @Override // java.lang.Runnable
            public final void run() {
                ut1.a(this.f6448b, context, l00Var);
            }
        });
    }

    public final void a(ru2 ru2Var) {
        if (ru2Var instanceof qu2) {
            synchronized (f95782f) {
                this.f95788e = tt1.f95352d;
                bn.r rVar = bn.r.f5635a;
            }
        } else if (ru2Var instanceof pu2) {
            synchronized (f95782f) {
                this.f95788e = tt1.f95350b;
                bn.r rVar2 = bn.r.f5635a;
            }
        }
        nt1 nt1Var = this.f95784a;
        nt1Var.f92935a.f93322a.execute(new Runnable() { // from class: bt.bb
            @Override // java.lang.Runnable
            public final void run() {
                ut1.a(this.f5960b);
            }
        });
    }

    public final void b(Context context, final l00 l00Var) {
        boolean z10;
        boolean z11;
        synchronized (f95782f) {
            s61 s61Var = new s61(this.f95784a, l00Var);
            z10 = false;
            if (this.f95788e == tt1.f95352d) {
                z11 = false;
                z10 = true;
            } else {
                this.f95785b.a(s61Var);
                if (this.f95788e == tt1.f95350b) {
                    this.f95788e = tt1.f95351c;
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            bn.r rVar = bn.r.f5635a;
        }
        if (z10) {
            this.f95784a.f92935a.f93322a.execute(new Runnable() { // from class: bt.ab
                @Override // java.lang.Runnable
                public final void run() {
                    ut1.a(l00Var);
                }
            });
        }
        if (z11) {
            uu2 uu2Var = this.f95786c;
            lu2 lu2Var = this.f95787d;
            uu2Var.getClass();
            iu3 iu3Var = (iu3) lu2Var;
            this.f95784a.f92935a.f93323b.execute(new tu2(context, iu3Var, kotlinx.coroutines.d.a(p000do.j2.b(null, 1, null).plus(p000do.w0.b()).plus(new y10(iu3Var.a()))), st1.a(iu3Var)));
        }
    }
}
