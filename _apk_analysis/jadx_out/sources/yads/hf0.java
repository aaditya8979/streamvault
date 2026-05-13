package yads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yads.hf0;

/* JADX INFO: loaded from: classes4.dex */
public final class hf0 extends gf0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f90382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final af0 f90383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f90384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f90385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f90386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f90387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f90388l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f90389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f90390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f90391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f90392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f90393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f90394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f90395s;

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hf0(int r5, yads.h73 r6, int r7, yads.af0 r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.hf0.<init>(int, yads.h73, int, yads.af0, int, int, boolean):void");
    }

    public static int a(List list, List list2) {
        return fy.a(new Comparator() { // from class: bt.l2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.a((hf0) obj, (hf0) obj2);
            }
        }.compare((hf0) Collections.max(list, new Comparator() { // from class: bt.l2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.a((hf0) obj, (hf0) obj2);
            }
        }), (hf0) Collections.max(list2, new Comparator() { // from class: bt.l2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.a((hf0) obj, (hf0) obj2);
            }
        }))).a(list.size(), list2.size()).a((hf0) Collections.max(list, new Comparator() { // from class: bt.m2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.b((hf0) obj, (hf0) obj2);
            }
        }), (hf0) Collections.max(list2, new Comparator() { // from class: bt.m2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.b((hf0) obj, (hf0) obj2);
            }
        }), new Comparator() { // from class: bt.m2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.b((hf0) obj, (hf0) obj2);
            }
        }).a();
    }

    public static int a(hf0 hf0Var, hf0 hf0Var2) {
        hy hyVarA = fy.a(lq.a(hf0Var.f90385i, hf0Var2.f90385i)).a(hf0Var.f90389m, hf0Var2.f90389m).a(hf0Var.f90390n, hf0Var2.f90390n).a(hf0Var.f90382f, hf0Var2.f90382f).a(hf0Var.f90384h, hf0Var2.f90384h);
        Integer numValueOf = Integer.valueOf(hf0Var.f90388l);
        Integer numValueOf2 = Integer.valueOf(hf0Var2.f90388l);
        y72.f97019b.getClass();
        hy hyVarA2 = hyVarA.a(numValueOf, numValueOf2, jq2.f91329b).a(hf0Var.f90393q, hf0Var2.f90393q).a(hf0Var.f90394r, hf0Var2.f90394r);
        if (hf0Var.f90393q && hf0Var.f90394r) {
            hyVarA2 = hyVarA2.a(hf0Var.f90395s, hf0Var2.f90395s);
        }
        return hyVarA2.a();
    }

    public static int b(hf0 hf0Var, hf0 hf0Var2) {
        sa2 sa2VarA = (hf0Var.f90382f && hf0Var.f90385i) ? if0.f90794i : if0.f90794i.a();
        return fy.a((hf0Var.f90383g.f93945x ? if0.f90794i.a() : if0.f90795j).compare(Integer.valueOf(hf0Var.f90386j), Integer.valueOf(hf0Var2.f90386j))).a(Integer.valueOf(hf0Var.f90387k), Integer.valueOf(hf0Var2.f90387k), sa2VarA).a(Integer.valueOf(hf0Var.f90386j), Integer.valueOf(hf0Var2.f90386j), sa2VarA).a();
    }

    @Override // yads.gf0
    public final int a() {
        return this.f90392p;
    }

    public final int a(int i10, int i11) {
        if ((this.f89977e.f92603f & 16384) != 0 || !if0.a(this.f90383g.M, i10)) {
            return 0;
        }
        if (!this.f90382f && !this.f90383g.C) {
            return 0;
        }
        if (if0.a(false, i10) && this.f90384h && this.f90382f && this.f89977e.f92606i != -1) {
            af0 af0Var = this.f90383g;
            if (!af0Var.f93946y && !af0Var.f93945x && (i10 & i11) != 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override // yads.gf0
    public final boolean a(gf0 gf0Var) {
        hf0 hf0Var = (hf0) gf0Var;
        return (this.f90391o || ib3.a(this.f89977e.f92610m, hf0Var.f89977e.f92610m)) && (this.f90383g.F || (this.f90393q == hf0Var.f90393q && this.f90394r == hf0Var.f90394r));
    }
}
