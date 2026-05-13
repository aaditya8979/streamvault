package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class nc0 implements b30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gg1 f92803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo f92804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f92805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f92806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p30 f92807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f92808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te2 f92809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lc0[] f92810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public op0 f92811i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c30 f92812j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f92813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zo f92814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f92815m;

    public nc0(du duVar, gg1 gg1Var, c30 c30Var, vo voVar, int i10, int[] iArr, op0 op0Var, int i11, p30 p30Var, long j10, boolean z10, ArrayList arrayList, te2 te2Var, ye2 ye2Var) {
        this.f92803a = gg1Var;
        this.f92812j = c30Var;
        this.f92804b = voVar;
        this.f92805c = iArr;
        this.f92811i = op0Var;
        this.f92806d = i11;
        this.f92807e = p30Var;
        this.f92813k = i10;
        this.f92808f = j10;
        this.f92809g = te2Var;
        long jC = c30Var.c(i10);
        ArrayList arrayListA = a();
        this.f92810h = new lc0[op0Var.f()];
        int i12 = 0;
        while (i12 < this.f92810h.length) {
            lo2 lo2Var = (lo2) arrayListA.get(op0Var.b(i12));
            uo uoVarB = voVar.b(lo2Var.f92050b);
            lc0[] lc0VarArr = this.f92810h;
            if (uoVarB == null) {
                uoVarB = (uo) lo2Var.f92050b.get(0);
            }
            int i13 = i12;
            lc0VarArr[i13] = new lc0(jC, lo2Var, uoVarB, duVar.a(i11, lo2Var.f92049a, z10, arrayList, te2Var, ye2Var), 0L, lo2Var.d());
            i12 = i13 + 1;
        }
    }

    public final ArrayList a() {
        List list = ((fc2) this.f92812j.f88318m.get(this.f92813k)).f89532c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f92805c) {
            arrayList.addAll(((zb) list.get(i10)).f97448c);
        }
        return arrayList;
    }
}
