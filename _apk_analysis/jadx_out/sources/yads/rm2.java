package yads;

import android.content.Context;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rm2 extends h11 implements ll3 {
    public boolean A;
    public final qm2 B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tc1 f94497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final xb f94498z;

    public /* synthetic */ rm2(Context context, tc1 tc1Var, w5 w5Var) {
        this(context, tc1Var, w5Var, new xb(tc1Var));
    }

    public rm2(Context context, tc1 tc1Var, w5 w5Var, xb xbVar) {
        super(context, tc1Var.getAdConfiguration$mobileads_externalRelease(), tc1Var.getSdkEnvironmentModule$mobileads_externalRelease(), w5Var);
        this.f94497y = tc1Var;
        this.f94498z = xbVar;
        this.A = true;
        this.B = new qm2(this);
        tc1Var.addVisibilityChangeListener(this);
    }

    @Override // yads.zn, yads.vc2
    public final void a(rc2 rc2Var) {
        super.a(rc2Var);
        q();
    }

    @Override // yads.zn
    public final void b(l4 l4Var) {
        super.b(l4Var);
        int i10 = l4Var.f91878a;
        if (5 == i10 || 2 == i10) {
            return;
        }
        q();
    }

    @Override // yads.zn
    public void c() {
        super.c();
        this.f94497y.removeVisibilityChangeListener(this);
        boolean z10 = ad1.f87661a;
        this.A = false;
        this.f97682g.removeCallbacks(this.B);
    }

    @Override // yads.zn
    public final void j() {
        super.j();
        q();
    }

    public final void p() {
        q();
    }

    public final void q() {
        boolean z10 = ad1.f87661a;
        this.f97682g.removeCallbacks(this.B);
        v9 v9Var = this.f97697v;
        if (v9Var == null || !v9Var.K || !this.A || (!this.f97691p.a())) {
            return;
        }
        lm2 lm2Var = this.f94498z.f96700a;
        KProperty kProperty = xb.f96699b[0];
        tc1 tc1Var = (tc1) lm2Var.f92035a.get();
        if (tc1Var == null || kl3.b(tc1Var)) {
            return;
        }
        this.f97682g.postDelayed(this.B, v9Var.I);
    }
}
