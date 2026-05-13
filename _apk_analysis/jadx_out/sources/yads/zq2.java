package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zq2 extends fy0 {
    public final uk2 F;
    public final sq2 G;

    public zq2(Context context, lu2 lu2Var, r5 r5Var, g9 g9Var, d4 d4Var, w5 w5Var, i12 i12Var, xq2 xq2Var, uk2 uk2Var, sq2 sq2Var) {
        super(context, d4Var, lu2Var, uk2Var, w5Var, xq2Var, i12Var);
        this.F = uk2Var;
        this.G = sq2Var;
        d4Var.a(g9Var);
        uk2Var.a(new yq2(r5Var, this));
        uk2Var.a(d4Var);
        uk2Var.a(i12Var);
    }

    @Override // yads.fy0
    public final by0 a(cy0 cy0Var) {
        return cy0Var.b(this);
    }

    public final void a(q10 q10Var) {
        uk2 uk2Var = this.F;
        uk2Var.f95704e = q10Var;
        uk2Var.f95702c.a(q10Var);
    }

    @Override // yads.fy0, yads.up2
    public final void a(v9 v9Var) {
        qq2 qq2Var = v9Var.f96007r;
        this.G.getClass();
        if (qq2Var == null || (!qq2Var.f94118b ? qq2Var.f94119c != null : qq2Var.f94120d != null)) {
            b(h9.f90284c);
        } else {
            super.a(v9Var);
        }
    }
}
