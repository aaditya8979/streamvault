package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile c31 f96765a;

    public static final c31 a(Context context) {
        if (f96765a == null) {
            synchronized (c31.f88319h) {
                if (f96765a == null) {
                    Context applicationContext = context.getApplicationContext();
                    f96765a = new c31(applicationContext, pg.a(applicationContext), new yg(), new wg(new ug(), pg.a(applicationContext)), new bj1(ug1.a(applicationContext, "YadPreferenceFile")));
                }
                bn.r rVar = bn.r.f5635a;
            }
        }
        c31 c31Var = f96765a;
        tn.p.h(c31Var);
        return c31Var;
    }
}
