package yads;

import android.view.View;
import android.view.ViewGroup;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final class q03 implements zf0, c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j7 f93851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f93852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cz1 f93853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f03 f93854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ue0 f93855e;

    public q03(j7 j7Var, b2 b2Var, cz1 cz1Var, f03 f03Var) {
        this.f93851a = j7Var;
        this.f93852b = b2Var;
        this.f93853c = cz1Var;
        this.f93854d = f03Var;
    }

    @Override // yads.c2
    public final void a() {
        ue0 ue0Var = this.f93855e;
        if (ue0Var != null) {
            ((zb2) ue0Var.f95622a).d();
        }
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        k7 k7Var;
        View viewB = this.f93853c.b(viewGroup);
        if (viewB != null) {
            this.f93852b.f87878b.add(this);
            f03 f03Var = this.f93854d;
            j7 j7Var = this.f93851a;
            Long lValueOf = (j7Var == null || (k7Var = j7Var.f91108b) == null) ? null : Long.valueOf(k7Var.f91504c);
            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            zb2 zb2VarA = bc2.a();
            ue0 ue0Var = new ue0(viewB, f03Var, jLongValue, zb2VarA);
            this.f93855e = ue0Var;
            lm2 lm2Var = ue0Var.f95623b;
            KProperty kProperty = ue0.f95621c[0];
            View view = (View) lm2Var.f92035a.get();
            if (view != null) {
                te0 te0Var = new te0(view, f03Var);
                if (jLongValue == 0) {
                    f03Var.b(view);
                } else {
                    zb2VarA.a(jLongValue, te0Var);
                }
            }
            if (viewB.getTag() == null) {
                viewB.setTag("skip_button");
            }
        }
    }

    @Override // yads.c2
    public final void b() {
        ue0 ue0Var = this.f93855e;
        if (ue0Var != null) {
            ((zb2) ue0Var.f95622a).b();
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f93852b.f87878b.remove(this);
        ue0 ue0Var = this.f93855e;
        if (ue0Var != null) {
            ((zb2) ue0Var.f95622a).a();
        }
    }
}
