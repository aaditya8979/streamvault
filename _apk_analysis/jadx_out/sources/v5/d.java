package v5;

import a6.k0;
import android.text.Layout;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: WebvttCssStyle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f85878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f85879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f85880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f85881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f85883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f85885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f85888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f85889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f85890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f85891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f85892p;

    public d() {
        m();
    }

    public static int x(int i10, String str, @Nullable String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public int a() {
        if (this.f85885i) {
            return this.f85884h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public int b() {
        if (this.f85883g) {
            return this.f85882f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    @Nullable
    public String c() {
        return this.f85881e;
    }

    public float d() {
        return this.f85891o;
    }

    public int e() {
        return this.f85890n;
    }

    public int f(@Nullable String str, @Nullable String str2, String[] strArr, @Nullable String str3) {
        if (this.f85877a.isEmpty() && this.f85878b.isEmpty() && this.f85879c.isEmpty() && this.f85880d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iX = x(x(x(0, this.f85877a, str, 1073741824), this.f85878b, str2, 2), this.f85880d, str3, 4);
        if (iX == -1 || !Arrays.asList(strArr).containsAll(this.f85879c)) {
            return 0;
        }
        return iX + (this.f85879c.size() * 4);
    }

    public int g() {
        int i10 = this.f85888l;
        if (i10 == -1 && this.f85889m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f85889m == 1 ? 2 : 0);
    }

    @Nullable
    public Layout.Alignment h() {
        return this.f85892p;
    }

    public boolean i() {
        return this.f85885i;
    }

    public boolean j() {
        return this.f85883g;
    }

    public boolean k() {
        return this.f85886j == 1;
    }

    public boolean l() {
        return this.f85887k == 1;
    }

    public void m() {
        this.f85877a = "";
        this.f85878b = "";
        this.f85879c = Collections.emptyList();
        this.f85880d = "";
        this.f85881e = null;
        this.f85883g = false;
        this.f85885i = false;
        this.f85886j = -1;
        this.f85887k = -1;
        this.f85888l = -1;
        this.f85889m = -1;
        this.f85890n = -1;
        this.f85892p = null;
    }

    public d n(int i10) {
        this.f85884h = i10;
        this.f85885i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f85888l = z10 ? 1 : 0;
        return this;
    }

    public d p(int i10) {
        this.f85882f = i10;
        this.f85883g = true;
        return this;
    }

    public d q(@Nullable String str) {
        this.f85881e = k0.K0(str);
        return this;
    }

    public d r(boolean z10) {
        this.f85889m = z10 ? 1 : 0;
        return this;
    }

    public void s(String[] strArr) {
        this.f85879c = Arrays.asList(strArr);
    }

    public void t(String str) {
        this.f85877a = str;
    }

    public void u(String str) {
        this.f85878b = str;
    }

    public void v(String str) {
        this.f85880d = str;
    }

    public d w(boolean z10) {
        this.f85887k = z10 ? 1 : 0;
        return this;
    }
}
