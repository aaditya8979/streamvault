package yads;

import android.text.Layout;

/* JADX INFO: loaded from: classes2.dex */
public final class v93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f96017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f96019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f96020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f96021e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f96027k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f96028l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f96031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f96032p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v53 f96034r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f96022f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f96023g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f96024h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f96025i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f96026j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f96029m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f96030n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f96033q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f96035s = Float.MAX_VALUE;

    public final v93 a(v93 v93Var) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (v93Var != null) {
            if (!this.f96019c && v93Var.f96019c) {
                this.f96018b = v93Var.f96018b;
                this.f96019c = true;
            }
            if (this.f96024h == -1) {
                this.f96024h = v93Var.f96024h;
            }
            if (this.f96025i == -1) {
                this.f96025i = v93Var.f96025i;
            }
            if (this.f96017a == null && (str = v93Var.f96017a) != null) {
                this.f96017a = str;
            }
            if (this.f96022f == -1) {
                this.f96022f = v93Var.f96022f;
            }
            if (this.f96023g == -1) {
                this.f96023g = v93Var.f96023g;
            }
            if (this.f96030n == -1) {
                this.f96030n = v93Var.f96030n;
            }
            if (this.f96031o == null && (alignment2 = v93Var.f96031o) != null) {
                this.f96031o = alignment2;
            }
            if (this.f96032p == null && (alignment = v93Var.f96032p) != null) {
                this.f96032p = alignment;
            }
            if (this.f96033q == -1) {
                this.f96033q = v93Var.f96033q;
            }
            if (this.f96026j == -1) {
                this.f96026j = v93Var.f96026j;
                this.f96027k = v93Var.f96027k;
            }
            if (this.f96034r == null) {
                this.f96034r = v93Var.f96034r;
            }
            if (this.f96035s == Float.MAX_VALUE) {
                this.f96035s = v93Var.f96035s;
            }
            if (!this.f96021e && v93Var.f96021e) {
                this.f96020d = v93Var.f96020d;
                this.f96021e = true;
            }
            if (this.f96029m == -1 && (i10 = v93Var.f96029m) != -1) {
                this.f96029m = i10;
            }
        }
        return this;
    }
}
