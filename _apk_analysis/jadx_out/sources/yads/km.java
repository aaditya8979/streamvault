package yads;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class km extends rm2 {
    public final tc1 C;
    public final jm D;
    public final lh3 E;
    public final mm F;
    public final lm G;
    public final i12 H;
    public final ri0 I;
    public um J;
    public um K;

    public km(Context context, tc1 tc1Var, jm jmVar, w5 w5Var, lh3 lh3Var, mm mmVar, lm lmVar, i12 i12Var, ri0 ri0Var) {
        super(context, tc1Var, w5Var);
        this.C = tc1Var;
        this.D = jmVar;
        this.E = lh3Var;
        this.F = mmVar;
        this.G = lmVar;
        this.H = i12Var;
        this.I = ri0Var;
        a(tc1Var);
        jmVar.a(i12Var);
    }

    public static void a(tc1 tc1Var) {
        tc1Var.setHorizontalScrollBarEnabled(false);
        tc1Var.setVerticalScrollBarEnabled(false);
        tc1Var.setVisibility(8);
        tc1Var.setBackgroundColor(0);
    }

    @Override // yads.up2
    public final void a(Object obj) {
        v9 v9Var = (v9) obj;
        synchronized (this) {
            this.f97677b.a(v5.f95940s);
            this.f97697v = v9Var;
        }
        this.H.f90632d = v9Var;
        lm lmVar = this.G;
        lmVar.getClass();
        hq1 hq1Var = v9Var.f96006q;
        um umVarA = (hq1Var != null ? new ap1(v9Var, hq1Var) : new rv2(lmVar.f92027a)).a(this);
        this.K = umVarA;
        umVarA.a(this.f97676a, v9Var);
    }

    @Override // yads.rm2, yads.zn
    public final void c() {
        super.c();
        jm jmVar = this.D;
        jmVar.f91275c = null;
        jmVar.f91274b.a(null);
        mk3.a(this.C, true);
        this.C.setVisibility(8);
        kl3.a((ViewGroup) this.C);
    }

    @Override // yads.zn
    public final void d() {
        um[] umVarArr = {this.J, this.K};
        for (int i10 = 0; i10 < 2; i10++) {
            um umVar = umVarArr[i10];
            if (umVar != null) {
                umVar.a(this.f97676a);
            }
        }
        super.d();
    }

    @Override // yads.zn
    public final void l() {
        super.l();
        um umVar = this.J;
        if (umVar != this.K) {
            if (umVar != null) {
                umVar.a(this.f97676a);
            }
            this.J = this.K;
        }
        a03 a03Var = this.f97678c.f88743d.f87866a;
        if (zz2.f97846d != (a03Var != null ? a03Var.b() : null) || this.C.getLayoutParams() == null) {
            return;
        }
        this.C.getLayoutParams().height = -2;
    }

    public final tc1 r() {
        return this.C;
    }
}
