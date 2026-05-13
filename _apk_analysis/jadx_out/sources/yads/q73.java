package yads;

import android.os.Bundle;
import yads.q73;
import yads.xq;

/* JADX INFO: loaded from: classes3.dex */
public class q73 implements xq {
    public static final q73 B = new q73(new p73());
    public final u51 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f93925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f93926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f93927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f93928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f93929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f93930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f93931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f93932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f93933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p51 f93934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f93935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p51 f93936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f93937p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f93938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f93939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p51 f93940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p51 f93941t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f93942u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f93943v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f93944w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f93945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f93946y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s51 f93947z;

    static {
        new wq() { // from class: bt.r8
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return q73.a(bundle);
            }
        };
    }

    public q73(p73 p73Var) {
        this.f93923b = p73Var.f93455a;
        this.f93924c = p73Var.f93456b;
        this.f93925d = p73Var.f93457c;
        this.f93926e = p73Var.f93458d;
        this.f93927f = p73Var.f93459e;
        this.f93928g = p73Var.f93460f;
        this.f93929h = p73Var.f93461g;
        this.f93930i = p73Var.f93462h;
        this.f93931j = p73Var.f93463i;
        this.f93932k = p73Var.f93464j;
        this.f93933l = p73Var.f93465k;
        this.f93934m = p73Var.f93466l;
        this.f93935n = p73Var.f93467m;
        this.f93936o = p73Var.f93468n;
        this.f93937p = p73Var.f93469o;
        this.f93938q = p73Var.f93470p;
        this.f93939r = p73Var.f93471q;
        this.f93940s = p73Var.f93472r;
        this.f93941t = p73Var.f93473s;
        this.f93942u = p73Var.f93474t;
        this.f93943v = p73Var.f93475u;
        this.f93944w = p73Var.f93476v;
        this.f93945x = p73Var.f93477w;
        this.f93946y = p73Var.f93478x;
        this.f93947z = s51.a(p73Var.f93479y);
        this.A = u51.a(p73Var.f93480z);
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public static q73 a(Bundle bundle) {
        return new q73(new p73(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.q73.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return this.A.hashCode() + ((((((((((((((this.f93941t.hashCode() + ((this.f93940s.hashCode() + ((((((((this.f93936o.hashCode() + ((((this.f93934m.hashCode() + ((((((((((((((((((((((this.f93923b + 31) * 31) + this.f93924c) * 31) + this.f93925d) * 31) + this.f93926e) * 31) + this.f93927f) * 31) + this.f93928g) * 31) + this.f93929h) * 31) + this.f93930i) * 31) + (this.f93933l ? 1 : 0)) * 31) + this.f93931j) * 31) + this.f93932k) * 31)) * 31) + this.f93935n) * 31)) * 31) + this.f93937p) * 31) + this.f93938q) * 31) + this.f93939r) * 31)) * 31)) * 31) + this.f93942u) * 31) + this.f93943v) * 31) + (this.f93944w ? 1 : 0)) * 31) + (this.f93945x ? 1 : 0)) * 31) + (this.f93946y ? 1 : 0)) * 31) + ly2.a(this.f93947z.entrySet())) * 31);
    }
}
