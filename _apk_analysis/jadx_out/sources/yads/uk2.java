package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import yads.uk2;

/* JADX INFO: loaded from: classes4.dex */
public final class uk2 implements gy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final er2 f95700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f95701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f95702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f95703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q10 f95704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t5 f95705f;

    public /* synthetic */ uk2(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var, er2 er2Var) {
        this(er2Var, new Handler(Looper.getMainLooper()), new y5(context, d4Var, lu2Var, w5Var));
    }

    public uk2(er2 er2Var, Handler handler, y5 y5Var) {
        this.f95700a = er2Var;
        this.f95701b = handler;
        this.f95702c = y5Var;
    }

    public static final void a(l4 l4Var, uk2 uk2Var) {
        l4 l4Var2 = new l4(l4Var.f91878a, l4Var.f91879b, l4Var.f91880c, uk2Var.f95703d);
        q10 q10Var = uk2Var.f95704e;
        if (q10Var != null) {
            q10Var.a(l4Var2);
        }
        t5 t5Var = uk2Var.f95705f;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    public static final void a(uk2 uk2Var, dr2 dr2Var) {
        q10 q10Var = uk2Var.f95704e;
        if (q10Var != null) {
            q10Var.a(dr2Var);
        }
        t5 t5Var = uk2Var.f95705f;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    public final void a(d4 d4Var) {
        this.f95702c.f97004e = new j9(d4Var);
    }

    public final void a(fq2 fq2Var) {
        this.f95702c.f97005f = fq2Var;
    }

    @Override // yads.gy0
    public final void a(final l4 l4Var) {
        this.f95702c.a(l4Var.f91879b, l4Var.f91880c);
        this.f95701b.post(new Runnable() { // from class: bt.xa
            @Override // java.lang.Runnable
            public final void run() {
                uk2.a(l4Var, this);
            }
        });
    }

    public final void a(t5 t5Var) {
        this.f95705f = t5Var;
    }

    @Override // yads.gy0
    public final void a(wq2 wq2Var) {
        this.f95702c.a();
        er2 er2Var = this.f95700a;
        final dr2 dr2Var = new dr2(wq2Var, er2Var.f89368a, new rh1(er2Var.f89369b), new mh1());
        this.f95701b.post(new Runnable() { // from class: bt.ya
            @Override // java.lang.Runnable
            public final void run() {
                uk2.a(this.f6428b, dr2Var);
            }
        });
    }
}
