package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class xe0 extends gf0 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f96721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f96722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f96723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final af0 f96724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f96725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f96726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f96727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f96728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f96729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f96730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f96731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f96732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f96733r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f96734s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f96735t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f96736u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f96737v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f96738w;

    public xe0(int i10, h73 h73Var, int i11, af0 af0Var, int i12, boolean z10, og2 og2Var) {
        int i13;
        int iA;
        int iA2;
        super(i10, i11, h73Var);
        this.f96724i = af0Var;
        this.f96723h = if0.b(this.f89977e.f92601d);
        this.f96725j = if0.a(false, i12);
        int i14 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i14 >= af0Var.f93936o.size()) {
                iA = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                iA = if0.a(this.f89977e, (String) af0Var.f93936o.get(i14), false);
                if (iA > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f96727l = i14;
        this.f96726k = iA;
        this.f96728m = if0.a(this.f89977e.f92603f, af0Var.f93937p);
        mx0 mx0Var = this.f89977e;
        int i15 = mx0Var.f92603f;
        this.f96729n = i15 == 0 || (i15 & 1) != 0;
        this.f96732q = (mx0Var.f92602e & 1) != 0;
        int i16 = mx0Var.f92623z;
        this.f96733r = i16;
        this.f96734s = mx0Var.A;
        int i17 = mx0Var.f92606i;
        this.f96735t = i17;
        this.f96722g = (i17 == -1 || i17 <= af0Var.f93939r) && (i16 == -1 || i16 <= af0Var.f93938q) && og2Var.apply(mx0Var);
        String[] strArrD = ib3.d();
        int i18 = 0;
        while (true) {
            if (i18 >= strArrD.length) {
                iA2 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                iA2 = if0.a(this.f89977e, strArrD[i18], false);
                if (iA2 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.f96730o = i18;
        this.f96731p = iA2;
        int i19 = 0;
        while (true) {
            if (i19 < af0Var.f93940s.size()) {
                String str = this.f89977e.f92610m;
                if (str != null && str.equals(af0Var.f93940s.get(i19))) {
                    i13 = i19;
                    break;
                }
                i19++;
            } else {
                break;
            }
        }
        this.f96736u = i13;
        this.f96737v = ro.a(i12) == 128;
        this.f96738w = ro.b(i12) == 64;
        this.f96721f = a(z10, i12);
    }

    public static int a(List list, List list2) {
        return ((xe0) Collections.max(list)).compareTo((xe0) Collections.max(list2));
    }

    @Override // yads.gf0
    public final int a() {
        return this.f96721f;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xe0 xe0Var) {
        sa2 sa2VarA = (this.f96722g && this.f96725j) ? if0.f90794i : if0.f90794i.a();
        hy hyVarA = fy.a(lq.a(this.f96725j, xe0Var.f96725j));
        Integer numValueOf = Integer.valueOf(this.f96727l);
        Integer numValueOf2 = Integer.valueOf(xe0Var.f96727l);
        y72.f97019b.getClass();
        jq2 jq2Var = jq2.f91329b;
        hy hyVarA2 = hyVarA.a(numValueOf, numValueOf2, jq2Var).a(this.f96726k, xe0Var.f96726k).a(this.f96728m, xe0Var.f96728m).a(this.f96732q, xe0Var.f96732q).a(this.f96729n, xe0Var.f96729n).a(Integer.valueOf(this.f96730o), Integer.valueOf(xe0Var.f96730o), jq2Var).a(this.f96731p, xe0Var.f96731p).a(this.f96722g, xe0Var.f96722g).a(Integer.valueOf(this.f96736u), Integer.valueOf(xe0Var.f96736u), jq2Var).a(Integer.valueOf(this.f96735t), Integer.valueOf(xe0Var.f96735t), this.f96724i.f93945x ? if0.f90794i.a() : if0.f90795j).a(this.f96737v, xe0Var.f96737v).a(this.f96738w, xe0Var.f96738w).a(Integer.valueOf(this.f96733r), Integer.valueOf(xe0Var.f96733r), sa2VarA).a(Integer.valueOf(this.f96734s), Integer.valueOf(xe0Var.f96734s), sa2VarA);
        Integer numValueOf3 = Integer.valueOf(this.f96735t);
        Integer numValueOf4 = Integer.valueOf(xe0Var.f96735t);
        if (!ib3.a(this.f96723h, xe0Var.f96723h)) {
            sa2VarA = if0.f90795j;
        }
        return hyVarA2.a(numValueOf3, numValueOf4, sa2VarA).a();
    }

    public final int a(boolean z10, int i10) {
        if (!if0.a(this.f96724i.M, i10)) {
            return 0;
        }
        if (!this.f96722g && !this.f96724i.G) {
            return 0;
        }
        if (if0.a(false, i10) && this.f96722g && this.f89977e.f92606i != -1) {
            af0 af0Var = this.f96724i;
            if (!af0Var.f93946y && !af0Var.f93945x && (af0Var.O || !z10)) {
                return 2;
            }
        }
        return 1;
    }

    @Override // yads.gf0
    public final boolean a(gf0 gf0Var) {
        int i10;
        String str;
        int i11;
        xe0 xe0Var = (xe0) gf0Var;
        af0 af0Var = this.f96724i;
        if ((af0Var.J || ((i11 = this.f89977e.f92623z) != -1 && i11 == xe0Var.f89977e.f92623z)) && (af0Var.H || ((str = this.f89977e.f92610m) != null && TextUtils.equals(str, xe0Var.f89977e.f92610m)))) {
            af0 af0Var2 = this.f96724i;
            if ((af0Var2.I || ((i10 = this.f89977e.A) != -1 && i10 == xe0Var.f89977e.A)) && (af0Var2.K || (this.f96737v == xe0Var.f96737v && this.f96738w == xe0Var.f96738w))) {
                return true;
            }
        }
        return false;
    }
}
