package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fy0 extends h11 {
    public final i12 A;
    public final dy0 B;
    public by0 C;
    public by0 D;
    public qy0 E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gy0 f89724y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ly0 f89725z;

    public /* synthetic */ fy0(Context context, d4 d4Var, lu2 lu2Var, gy0 gy0Var, w5 w5Var, ly0 ly0Var, i12 i12Var) {
        this(context, d4Var, lu2Var, gy0Var, w5Var, ly0Var, i12Var, new dy0(lu2Var));
    }

    public fy0(Context context, d4 d4Var, lu2 lu2Var, gy0 gy0Var, w5 w5Var, ly0 ly0Var, i12 i12Var, dy0 dy0Var) {
        super(context, d4Var, lu2Var, w5Var);
        this.f89724y = gy0Var;
        this.f89725z = ly0Var;
        this.A = i12Var;
        this.B = dy0Var;
        a(ma.f92314a.a());
    }

    public abstract by0 a(cy0 cy0Var);

    @Override // yads.zn
    public final void a(l4 l4Var) {
        this.f89724y.a(l4Var);
    }

    @Override // yads.up2
    public void a(v9 v9Var) {
        synchronized (this) {
            this.f97677b.a(v5.f95940s);
            this.f97697v = v9Var;
        }
        this.A.f90632d = v9Var;
        dy0 dy0Var = this.B;
        dy0Var.getClass();
        hq1 hq1Var = v9Var.f96006q;
        by0 by0VarA = a(hq1Var != null ? new fp1(v9Var, hq1Var) : new uv2(dy0Var.f89023a));
        this.D = this.C;
        this.C = by0VarA;
        this.E = this.f89725z.a(v9Var, this.f97678c, by0VarA);
        Context contextA = j1.a();
        if (contextA != null) {
            boolean z10 = ad1.f87661a;
        }
        if (contextA == null) {
            contextA = this.f97676a;
        }
        by0VarA.a(contextA, v9Var);
    }

    @Override // yads.zn
    public final void i() {
        this.f89724y.a(h9.f90289h);
    }

    @Override // yads.zn
    public final void j() {
        qy0 qy0Var = this.E;
        if (qy0Var != null) {
            this.f89724y.a(qy0Var);
        } else {
            this.f89724y.a(h9.f90283b);
        }
    }
}
