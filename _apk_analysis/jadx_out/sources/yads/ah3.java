package yads;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class ah3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final if1 f87702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hv f87703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b20 f87704c;

    public ah3(if1 if1Var, hv hvVar, b20 b20Var) {
        this.f87702a = if1Var;
        this.f87703b = hvVar;
        this.f87704c = b20Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if1 if1Var;
        b20 b20Var = this.f87704c;
        if (b20Var != null) {
            if1 if1Var2 = this.f87702a;
            if1Var = new if1(if1Var2.f90802a, if1Var2.f90803b, if1Var2.f90804c, b20Var.f87885f, if1Var2.f90806e);
        } else {
            if1Var = this.f87702a;
        }
        hv hvVar = this.f87703b;
        l12 l12Var = hvVar.f90569c;
        iv ivVar = l12Var.f91861a;
        oi oiVar = hvVar.f90567a;
        y3 y3Var = hvVar.f90568b;
        kn2 kn2Var = hvVar.f90570d;
        jx0 jx0Var = hvVar.f90571e;
        ivVar.getClass();
        new tz1(jx0Var, kn2Var, y3Var, l12Var, oiVar, if1Var).onClick(view);
    }
}
