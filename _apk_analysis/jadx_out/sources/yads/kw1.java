package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kw1 implements o11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw1 f91786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv1 f91787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lh3 f91788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zn3 f91789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uv1 f91790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k11 f91791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nt2 f91792g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ev f91793h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f91794i;

    public /* synthetic */ kw1(gw1 gw1Var, xv1 xv1Var) {
        lh3 lh3Var = new lh3();
        zn3 zn3Var = new zn3(gw1Var);
        uv1 uv1Var = new uv1();
        k11 k11Var = new k11();
        Object obj = dw2.f89000j;
        this(gw1Var, xv1Var, lh3Var, zn3Var, uv1Var, k11Var, cw2.a().a(gw1Var.f()));
    }

    public kw1(gw1 gw1Var, xv1 xv1Var, lh3 lh3Var, zn3 zn3Var, uv1 uv1Var, k11 k11Var, nt2 nt2Var) {
        this.f91786a = gw1Var;
        this.f91787b = xv1Var;
        this.f91788c = lh3Var;
        this.f91789d = zn3Var;
        this.f91790e = uv1Var;
        this.f91791f = k11Var;
        this.f91792g = nt2Var;
    }

    @Override // yads.o11
    public final void a() {
        this.f91794i = true;
    }

    @Override // yads.o11
    public final void a(String str) {
        nt2 nt2Var = this.f91792g;
        if (nt2Var == null || !nt2Var.B0 || this.f91794i) {
            ev evVar = this.f91793h;
            if (evVar != null) {
                gw1 gw1Var = this.f91786a;
                rv1 rv1Var = (rv1) evVar;
                if1 if1Var = rv1Var.f94623a;
                if1 if1Var2 = new if1(if1Var.f90802a, if1Var.f90803b, if1Var.f90804c, str, if1Var.f90806e);
                hv hvVar = rv1Var.f94624b;
                l12 l12Var = hvVar.f90569c;
                iv ivVar = l12Var.f91861a;
                oi oiVar = hvVar.f90567a;
                y3 y3Var = hvVar.f90568b;
                kn2 kn2Var = hvVar.f90570d;
                jx0 jx0Var = hvVar.f90571e;
                ivVar.getClass();
                new tz1(jx0Var, kn2Var, y3Var, l12Var, oiVar, if1Var2).onClick(gw1Var);
            }
            this.f91794i = false;
        }
    }

    @Override // yads.o11
    public final void a(hb2 hb2Var, Map map) {
    }

    @Override // yads.o11
    public final void a(boolean z10) {
    }
}
