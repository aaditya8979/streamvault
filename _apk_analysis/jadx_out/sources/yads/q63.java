package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class q63 extends s63 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p51 f93909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p51 f93910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f93911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f93912f;

    public q63(sm2 sm2Var, sm2 sm2Var2, int[] iArr) {
        ni.a(sm2Var.size() == iArr.length);
        this.f93909c = sm2Var;
        this.f93910d = sm2Var2;
        this.f93911e = iArr;
        this.f93912f = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f93912f[iArr[i10]] = i10;
        }
    }

    @Override // yads.s63
    public final int a() {
        return this.f93910d.size();
    }

    @Override // yads.s63
    public final int a(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 != b(z10)) {
            return z10 ? this.f93911e[this.f93912f[i10] + 1] : i10 + 1;
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // yads.s63
    public final int a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.s63
    public final int a(boolean z10) {
        if (c()) {
            return -1;
        }
        if (z10) {
            return this.f93911e[0];
        }
        return 0;
    }

    @Override // yads.s63
    public final Object a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        p63 p63Var2 = (p63) this.f93910d.get(i10);
        p63Var.a(p63Var2.f93447b, p63Var2.f93448c, p63Var2.f93449d, p63Var2.f93450e, p63Var2.f93451f, p63Var2.f93453h, p63Var2.f93452g);
        return p63Var;
    }

    @Override // yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        r63 r63Var2 = (r63) this.f93909c.get(i10);
        r63Var.a(r63Var2.f94299b, r63Var2.f94301d, r63Var2.f94302e, r63Var2.f94303f, r63Var2.f94304g, r63Var2.f94305h, r63Var2.f94306i, r63Var2.f94307j, r63Var2.f94309l, r63Var2.f94311n, r63Var2.f94312o, r63Var2.f94313p, r63Var2.f94314q, r63Var2.f94315r);
        r63Var.f94310m = r63Var2.f94310m;
        return r63Var;
    }

    @Override // yads.s63
    public final int b() {
        return this.f93909c.size();
    }

    @Override // yads.s63
    public final int b(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 != a(z10)) {
            return z10 ? this.f93911e[this.f93912f[i10] - 1] : i10 - 1;
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    @Override // yads.s63
    public final int b(boolean z10) {
        if (c()) {
            return -1;
        }
        return z10 ? this.f93911e[this.f93909c.size() - 1] : this.f93909c.size() - 1;
    }
}
