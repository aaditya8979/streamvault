package yads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ro implements af2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94535b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mn2 f94537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f94538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ye2 f94539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f94540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ns2 f94541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public mx0[] f94542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f94543j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f94545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f94546m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nx0 f94536c = new nx0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f94544k = Long.MIN_VALUE;

    public ro(int i10) {
        this.f94535b = i10;
    }

    public static int a(int i10) {
        return i10 & 128;
    }

    public static int a(int i10, int i11, int i12) {
        return i10 | i11 | i12 | 128;
    }

    public static int b(int i10) {
        return i10 & 64;
    }

    public abstract int a(mx0 mx0Var);

    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        ns2 ns2Var = this.f94541h;
        ns2Var.getClass();
        int iA = ns2Var.a(nx0Var, sa0Var, i10);
        if (iA == -4) {
            if (sa0Var.b(4)) {
                this.f94544k = Long.MIN_VALUE;
                return this.f94545l ? -4 : -3;
            }
            long j10 = sa0Var.f94751f + this.f94543j;
            sa0Var.f94751f = j10;
            this.f94544k = Math.max(this.f94544k, j10);
        } else if (iA == -5) {
            mx0 mx0Var = nx0Var.f93035b;
            mx0Var.getClass();
            if (mx0Var.f92614q != Long.MAX_VALUE) {
                lx0 lx0Var = new lx0(mx0Var);
                lx0Var.f92152o = mx0Var.f92614q + this.f94543j;
                nx0Var.f93035b = new mx0(lx0Var);
            }
        }
        return iA;
    }

    public final pn0 a(int i10, mx0 mx0Var, Exception exc, boolean z10) {
        int iA;
        if (mx0Var == null || this.f94546m) {
            iA = 4;
        } else {
            this.f94546m = true;
            try {
                iA = a(mx0Var) & 7;
            } catch (pn0 unused) {
                iA = 4;
            } finally {
                this.f94546m = false;
            }
        }
        String strD = d();
        int i11 = this.f94538e;
        int i12 = mx0Var == null ? 4 : iA;
        return new pn0(pn0.a(1, null, strD, i11, mx0Var, i12), exc, i10, 1, strD, i11, mx0Var, i12, null, SystemClock.elapsedRealtime(), z10);
    }

    public /* bridge */ /* synthetic */ void a(float f10, float f11) {
    }

    public final void a(int i10, ye2 ye2Var) {
        this.f94538e = i10;
        this.f94539f = ye2Var;
    }

    public abstract void a(long j10, long j11);

    public abstract void a(long j10, boolean z10);

    public void a(boolean z10) {
    }

    public abstract void a(mx0[] mx0VarArr, long j10, long j11);

    public final ro b() {
        return this;
    }

    public zj1 c() {
        return null;
    }

    public abstract String d();

    public final boolean e() {
        return this.f94544k == Long.MIN_VALUE;
    }

    public abstract boolean f();

    public abstract boolean g();

    public abstract void h();

    @Override // yads.af2
    public void handleMessage(int i10, Object obj) {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public int l() {
        return 0;
    }
}
