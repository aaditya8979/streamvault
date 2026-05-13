package p7;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: WebvttCssStyle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @ColorInt
    public int f77102f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f77104h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f77111o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f77097a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f77098b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f77099c = Collections.emptySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f77100d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f77101e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f77103g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f77105i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f77106j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f77107k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f77108l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f77109m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f77110n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f77112p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f77113q = false;

    public static int B(int i10, String str, @Nullable String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f77107k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f77105i) {
            return this.f77104h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f77113q;
    }

    public int c() {
        if (this.f77103g) {
            return this.f77102f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @Nullable
    public String d() {
        return this.f77101e;
    }

    public float e() {
        return this.f77111o;
    }

    public int f() {
        return this.f77110n;
    }

    public int g() {
        return this.f77112p;
    }

    public int h(@Nullable String str, @Nullable String str2, Set<String> set, @Nullable String str3) {
        if (this.f77097a.isEmpty() && this.f77098b.isEmpty() && this.f77099c.isEmpty() && this.f77100d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iB = B(B(B(0, this.f77097a, str, 1073741824), this.f77098b, str2, 2), this.f77100d, str3, 4);
        if (iB == -1 || !set.containsAll(this.f77099c)) {
            return 0;
        }
        return iB + (this.f77099c.size() * 4);
    }

    public int i() {
        int i10 = this.f77108l;
        if (i10 == -1 && this.f77109m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f77109m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f77105i;
    }

    public boolean k() {
        return this.f77103g;
    }

    public boolean l() {
        return this.f77106j == 1;
    }

    public boolean m() {
        return this.f77107k == 1;
    }

    public d n(int i10) {
        this.f77104h = i10;
        this.f77105i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f77108l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f77113q = z10;
        return this;
    }

    public d q(int i10) {
        this.f77102f = i10;
        this.f77103g = true;
        return this;
    }

    public d r(@Nullable String str) {
        this.f77101e = str == null ? null : y7.a.e(str);
        return this;
    }

    public d s(float f10) {
        this.f77111o = f10;
        return this;
    }

    public d t(int i10) {
        this.f77110n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f77109m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f77112p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f77099c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f77097a = str;
    }

    public void y(String str) {
        this.f77098b = str;
    }

    public void z(String str) {
        this.f77100d = str;
    }
}
