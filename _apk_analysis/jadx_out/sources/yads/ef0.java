package yads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ef0 extends gf0 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f89229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f89231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f89232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f89233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f89234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f89235l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f89236m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f89237n;

    public ef0(int i10, h73 h73Var, int i11, af0 af0Var, int i12, String str) {
        int iA;
        super(i10, i11, h73Var);
        int i13 = 0;
        this.f89230g = if0.a(false, i12);
        int i14 = this.f89977e.f92602e & (~af0Var.f93943v);
        this.f89231h = (i14 & 1) != 0;
        this.f89232i = (i14 & 2) != 0;
        int i15 = Integer.MAX_VALUE;
        p51 p51VarA = af0Var.f93941t.isEmpty() ? p51.a("") : af0Var.f93941t;
        int i16 = 0;
        while (true) {
            if (i16 >= p51VarA.size()) {
                iA = 0;
                break;
            }
            iA = if0.a(this.f89977e, (String) p51VarA.get(i16), af0Var.f93944w);
            if (iA > 0) {
                i15 = i16;
                break;
            }
            i16++;
        }
        this.f89233j = i15;
        this.f89234k = iA;
        int iA2 = if0.a(this.f89977e.f92603f, af0Var.f93942u);
        this.f89235l = iA2;
        this.f89237n = (this.f89977e.f92603f & 1088) != 0;
        int iA3 = if0.a(this.f89977e, str, if0.b(str) == null);
        this.f89236m = iA3;
        boolean z10 = iA > 0 || (af0Var.f93941t.isEmpty() && iA2 > 0) || this.f89231h || (this.f89232i && iA3 > 0);
        if (if0.a(af0Var.M, i12) && z10) {
            i13 = 1;
        }
        this.f89229f = i13;
    }

    public static int a(List list, List list2) {
        return ((ef0) list.get(0)).compareTo((ef0) list2.get(0));
    }

    @Override // yads.gf0
    public final int a() {
        return this.f89229f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ef0 ef0Var) {
        hy hyVarA = fy.a(lq.a(this.f89230g, ef0Var.f89230g));
        Integer numValueOf = Integer.valueOf(this.f89233j);
        Integer numValueOf2 = Integer.valueOf(ef0Var.f89233j);
        Comparator comparator = y72.f97019b;
        comparator.getClass();
        jq2 jq2Var = jq2.f91329b;
        hy hyVarA2 = hyVarA.a(numValueOf, numValueOf2, jq2Var).a(this.f89234k, ef0Var.f89234k).a(this.f89235l, ef0Var.f89235l).a(this.f89231h, ef0Var.f89231h);
        Boolean boolValueOf = Boolean.valueOf(this.f89232i);
        Boolean boolValueOf2 = Boolean.valueOf(ef0Var.f89232i);
        if (this.f89234k != 0) {
            comparator = jq2Var;
        }
        hy hyVarA3 = hyVarA2.a(boolValueOf, boolValueOf2, comparator).a(this.f89236m, ef0Var.f89236m);
        if (this.f89235l == 0) {
            hyVarA3 = hyVarA3.b(this.f89237n, ef0Var.f89237n);
        }
        return hyVarA3.a();
    }

    @Override // yads.gf0
    public final /* bridge */ /* synthetic */ boolean a(gf0 gf0Var) {
        return false;
    }
}
