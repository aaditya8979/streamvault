package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import yads.sk2;

/* JADX INFO: loaded from: classes11.dex */
public final class sk2 implements gy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd1 f94855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f94856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f94857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w00 f94858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t5 f94859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f94860f;

    public /* synthetic */ sk2(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var, kd1 kd1Var) {
        this(kd1Var, new Handler(Looper.getMainLooper()), new y5(context, d4Var, lu2Var, w5Var));
    }

    public sk2(kd1 kd1Var, Handler handler, y5 y5Var) {
        this.f94855a = kd1Var;
        this.f94856b = handler;
        this.f94857c = y5Var;
    }

    public static final void a(sk2 sk2Var, jd1 jd1Var) {
        w00 w00Var = sk2Var.f94858d;
        if (w00Var != null) {
            w00Var.a(jd1Var);
        }
        t5 t5Var = sk2Var.f94859e;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    public static final void a(sk2 sk2Var, l4 l4Var) {
        w00 w00Var = sk2Var.f94858d;
        if (w00Var != null) {
            w00Var.a(l4Var);
        }
        t5 t5Var = sk2Var.f94859e;
        if (t5Var != null) {
            t5Var.a();
        }
    }

    @Override // yads.gy0
    public final void a(cd1 cd1Var) {
        this.f94857c.a();
        kd1 kd1Var = this.f94855a;
        final jd1 jd1Var = new jd1(cd1Var, kd1Var.f91571a, new rh1(kd1Var.f91572b), new mh1());
        this.f94856b.post(new Runnable() { // from class: bt.w9
            @Override // java.lang.Runnable
            public final void run() {
                sk2.a(this.f6375b, jd1Var);
            }
        });
    }

    public final void a(d4 d4Var) {
        this.f94857c.f97004e = new j9(d4Var);
    }

    public final void a(fq2 fq2Var) {
        this.f94857c.f97005f = fq2Var;
    }

    @Override // yads.gy0
    public final void a(l4 l4Var) {
        this.f94857c.a(l4Var.f91879b, l4Var.f91880c);
        final l4 l4Var2 = new l4(l4Var.f91878a, l4Var.f91879b, l4Var.f91880c, this.f94860f);
        this.f94856b.post(new Runnable() { // from class: bt.v9
            @Override // java.lang.Runnable
            public final void run() {
                sk2.a(this.f6352b, l4Var2);
            }
        });
    }

    public final void a(t5 t5Var) {
        this.f94859e = t5Var;
    }
}
