package c9;

import com.safedk.android.analytics.brandsafety.ImpressionLog;

/* JADX INFO: compiled from: Codeword.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6536e = -1;

    public d(int i10, int i11, int i12, int i13) {
        this.f6532a = i10;
        this.f6533b = i11;
        this.f6534c = i12;
        this.f6535d = i13;
    }

    public int a() {
        return this.f6534c;
    }

    public int b() {
        return this.f6533b;
    }

    public int c() {
        return this.f6536e;
    }

    public int d() {
        return this.f6532a;
    }

    public int e() {
        return this.f6535d;
    }

    public int f() {
        return this.f6533b - this.f6532a;
    }

    public boolean g() {
        return h(this.f6536e);
    }

    public boolean h(int i10) {
        return i10 != -1 && this.f6534c == (i10 % 3) * 3;
    }

    public void i(int i10) {
        this.f6536e = i10;
    }

    public void j() {
        this.f6536e = ((this.f6535d / 30) * 3) + (this.f6534c / 3);
    }

    public String toString() {
        return this.f6536e + ImpressionLog.Q + this.f6535d;
    }
}
