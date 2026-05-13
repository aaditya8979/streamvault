package n7;

import android.text.Layout;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: TtmlStyle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f75231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f75233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75235e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f75241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f75242l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f75245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f75246p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public b f75248r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f75236f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75237g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f75238h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f75239i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f75240j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f75243m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f75244n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f75247q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f75249s = Float.MAX_VALUE;

    public g A(@Nullable String str) {
        this.f75242l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f75239i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f75236f = z10 ? 1 : 0;
        return this;
    }

    public g D(@Nullable Layout.Alignment alignment) {
        this.f75246p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f75244n = i10;
        return this;
    }

    public g F(int i10) {
        this.f75243m = i10;
        return this;
    }

    public g G(float f10) {
        this.f75249s = f10;
        return this;
    }

    public g H(@Nullable Layout.Alignment alignment) {
        this.f75245o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f75247q = z10 ? 1 : 0;
        return this;
    }

    public g J(@Nullable b bVar) {
        this.f75248r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f75237g = z10 ? 1 : 0;
        return this;
    }

    public g a(@Nullable g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f75235e) {
            return this.f75234d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f75233c) {
            return this.f75232b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    @Nullable
    public String d() {
        return this.f75231a;
    }

    public float e() {
        return this.f75241k;
    }

    public int f() {
        return this.f75240j;
    }

    @Nullable
    public String g() {
        return this.f75242l;
    }

    @Nullable
    public Layout.Alignment h() {
        return this.f75246p;
    }

    public int i() {
        return this.f75244n;
    }

    public int j() {
        return this.f75243m;
    }

    public float k() {
        return this.f75249s;
    }

    public int l() {
        int i10 = this.f75238h;
        if (i10 == -1 && this.f75239i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f75239i == 1 ? 2 : 0);
    }

    @Nullable
    public Layout.Alignment m() {
        return this.f75245o;
    }

    public boolean n() {
        return this.f75247q == 1;
    }

    @Nullable
    public b o() {
        return this.f75248r;
    }

    public boolean p() {
        return this.f75235e;
    }

    public boolean q() {
        return this.f75233c;
    }

    public final g r(@Nullable g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f75233c && gVar.f75233c) {
                w(gVar.f75232b);
            }
            if (this.f75238h == -1) {
                this.f75238h = gVar.f75238h;
            }
            if (this.f75239i == -1) {
                this.f75239i = gVar.f75239i;
            }
            if (this.f75231a == null && (str = gVar.f75231a) != null) {
                this.f75231a = str;
            }
            if (this.f75236f == -1) {
                this.f75236f = gVar.f75236f;
            }
            if (this.f75237g == -1) {
                this.f75237g = gVar.f75237g;
            }
            if (this.f75244n == -1) {
                this.f75244n = gVar.f75244n;
            }
            if (this.f75245o == null && (alignment2 = gVar.f75245o) != null) {
                this.f75245o = alignment2;
            }
            if (this.f75246p == null && (alignment = gVar.f75246p) != null) {
                this.f75246p = alignment;
            }
            if (this.f75247q == -1) {
                this.f75247q = gVar.f75247q;
            }
            if (this.f75240j == -1) {
                this.f75240j = gVar.f75240j;
                this.f75241k = gVar.f75241k;
            }
            if (this.f75248r == null) {
                this.f75248r = gVar.f75248r;
            }
            if (this.f75249s == Float.MAX_VALUE) {
                this.f75249s = gVar.f75249s;
            }
            if (z10 && !this.f75235e && gVar.f75235e) {
                u(gVar.f75234d);
            }
            if (z10 && this.f75243m == -1 && (i10 = gVar.f75243m) != -1) {
                this.f75243m = i10;
            }
        }
        return this;
    }

    public boolean s() {
        return this.f75236f == 1;
    }

    public boolean t() {
        return this.f75237g == 1;
    }

    public g u(int i10) {
        this.f75234d = i10;
        this.f75235e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f75238h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f75232b = i10;
        this.f75233c = true;
        return this;
    }

    public g x(@Nullable String str) {
        this.f75231a = str;
        return this;
    }

    public g y(float f10) {
        this.f75241k = f10;
        return this;
    }

    public g z(int i10) {
        this.f75240j = i10;
        return this;
    }
}
