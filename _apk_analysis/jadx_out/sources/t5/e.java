package t5;

import android.text.Layout;

/* JADX INFO: compiled from: TtmlStyle.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f85020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85021f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85022g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85023h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85024i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85025j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f85026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f85027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f85028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Layout.Alignment f85029n;

    public e a(e eVar) {
        return l(eVar, true);
    }

    public int b() {
        if (this.f85020e) {
            return this.f85019d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f85018c) {
            return this.f85017b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f85016a;
    }

    public float e() {
        return this.f85026k;
    }

    public int f() {
        return this.f85025j;
    }

    public String g() {
        return this.f85027l;
    }

    public int h() {
        int i10 = this.f85023h;
        if (i10 == -1 && this.f85024i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f85024i == 1 ? 2 : 0);
    }

    public Layout.Alignment i() {
        return this.f85029n;
    }

    public boolean j() {
        return this.f85020e;
    }

    public boolean k() {
        return this.f85018c;
    }

    public final e l(e eVar, boolean z10) {
        if (eVar != null) {
            if (!this.f85018c && eVar.f85018c) {
                q(eVar.f85017b);
            }
            if (this.f85023h == -1) {
                this.f85023h = eVar.f85023h;
            }
            if (this.f85024i == -1) {
                this.f85024i = eVar.f85024i;
            }
            if (this.f85016a == null) {
                this.f85016a = eVar.f85016a;
            }
            if (this.f85021f == -1) {
                this.f85021f = eVar.f85021f;
            }
            if (this.f85022g == -1) {
                this.f85022g = eVar.f85022g;
            }
            if (this.f85029n == null) {
                this.f85029n = eVar.f85029n;
            }
            if (this.f85025j == -1) {
                this.f85025j = eVar.f85025j;
                this.f85026k = eVar.f85026k;
            }
            if (z10 && !this.f85020e && eVar.f85020e) {
                o(eVar.f85019d);
            }
        }
        return this;
    }

    public boolean m() {
        return this.f85021f == 1;
    }

    public boolean n() {
        return this.f85022g == 1;
    }

    public e o(int i10) {
        this.f85019d = i10;
        this.f85020e = true;
        return this;
    }

    public e p(boolean z10) {
        a6.a.f(this.f85028m == null);
        this.f85023h = z10 ? 1 : 0;
        return this;
    }

    public e q(int i10) {
        a6.a.f(this.f85028m == null);
        this.f85017b = i10;
        this.f85018c = true;
        return this;
    }

    public e r(String str) {
        a6.a.f(this.f85028m == null);
        this.f85016a = str;
        return this;
    }

    public e s(float f10) {
        this.f85026k = f10;
        return this;
    }

    public e t(int i10) {
        this.f85025j = i10;
        return this;
    }

    public e u(String str) {
        this.f85027l = str;
        return this;
    }

    public e v(boolean z10) {
        a6.a.f(this.f85028m == null);
        this.f85024i = z10 ? 1 : 0;
        return this;
    }

    public e w(boolean z10) {
        a6.a.f(this.f85028m == null);
        this.f85021f = z10 ? 1 : 0;
        return this;
    }

    public e x(Layout.Alignment alignment) {
        this.f85029n = alignment;
        return this;
    }

    public e y(boolean z10) {
        a6.a.f(this.f85028m == null);
        this.f85022g = z10 ? 1 : 0;
        return this;
    }
}
