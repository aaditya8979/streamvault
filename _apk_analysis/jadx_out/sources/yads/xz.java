package yads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xz implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx1 f96937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw1 f96938b;

    public xz(bx1 bx1Var, vw1 vw1Var) {
        this.f96937a = bx1Var;
        this.f96938b = vw1Var;
    }

    public /* synthetic */ xz(bx1 bx1Var, vw1 vw1Var, int i10) {
        this(bx1Var, vw1Var);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        vw1 vw1Var = this.f96938b;
        if (vw1Var != null) {
            vw1Var.a();
            vw1Var.f96211f = false;
        }
        bx1 bx1Var = this.f96937a;
        if (bx1Var.f88185c) {
            bx1Var.a("first_click_on_controls");
            bx1Var.f88185c = false;
        }
    }
}
