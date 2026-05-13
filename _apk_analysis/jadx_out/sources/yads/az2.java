package yads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes12.dex */
public abstract class az2 implements oa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy2 f87848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f87849b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f87850c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f87851d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sa0[] f87852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ua0[] f87853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f87855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sa0 f87856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t43 f87857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f87858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f87859l;

    public az2(sa0[] sa0VarArr, ua0[] ua0VarArr) {
        this.f87852e = sa0VarArr;
        this.f87854g = sa0VarArr.length;
        for (int i10 = 0; i10 < this.f87854g; i10++) {
            this.f87852e[i10] = c();
        }
        this.f87853f = ua0VarArr;
        this.f87855h = ua0VarArr.length;
        for (int i11 = 0; i11 < this.f87855h; i11++) {
            this.f87853f[i11] = d();
        }
        zy2 zy2Var = new zy2((fz2) this);
        this.f87848a = zy2Var;
        zy2Var.start();
    }

    @Override // yads.oa0
    public final Object a() {
        ua0 ua0Var;
        synchronized (this.f87849b) {
            t43 t43Var = this.f87857j;
            if (t43Var != null) {
                throw t43Var;
            }
            ua0Var = this.f87851d.isEmpty() ? null : (ua0) this.f87851d.removeFirst();
        }
        return ua0Var;
    }

    public abstract t43 a(sa0 sa0Var, ua0 ua0Var, boolean z10);

    @Override // yads.oa0
    public final void a(w43 w43Var) {
        synchronized (this.f87849b) {
            t43 t43Var = this.f87857j;
            if (t43Var != null) {
                throw t43Var;
            }
            if (w43Var != this.f87856i) {
                throw new IllegalArgumentException();
            }
            this.f87850c.addLast(w43Var);
            if (!this.f87850c.isEmpty() && this.f87855h > 0) {
                this.f87849b.notify();
            }
            this.f87856i = null;
        }
    }

    @Override // yads.oa0
    public final Object b() {
        sa0 sa0Var;
        synchronized (this.f87849b) {
            t43 t43Var = this.f87857j;
            if (t43Var != null) {
                throw t43Var;
            }
            if (this.f87856i != null) {
                throw new IllegalStateException();
            }
            int i10 = this.f87854g;
            if (i10 == 0) {
                sa0Var = null;
            } else {
                sa0[] sa0VarArr = this.f87852e;
                int i11 = i10 - 1;
                this.f87854g = i11;
                sa0Var = sa0VarArr[i11];
            }
            this.f87856i = sa0Var;
        }
        return sa0Var;
    }

    public abstract w43 c();

    public abstract ez2 d();

    public final boolean e() {
        t43 t43Var;
        t43 t43VarA;
        synchronized (this.f87849b) {
            while (!this.f87859l && (this.f87850c.isEmpty() || this.f87855h <= 0)) {
                this.f87849b.wait();
            }
            if (this.f87859l) {
                return false;
            }
            sa0 sa0Var = (sa0) this.f87850c.removeFirst();
            ua0[] ua0VarArr = this.f87853f;
            int i10 = this.f87855h - 1;
            this.f87855h = i10;
            ua0 ua0Var = ua0VarArr[i10];
            boolean z10 = this.f87858k;
            this.f87858k = false;
            if (sa0Var.b(4)) {
                ua0Var.f94912b = 4 | ua0Var.f94912b;
            } else {
                if (sa0Var.b(Integer.MIN_VALUE)) {
                    ua0Var.f94912b |= Integer.MIN_VALUE;
                }
                if (sa0Var.b(134217728)) {
                    ua0Var.f94912b = 134217728 | ua0Var.f94912b;
                }
                try {
                    t43VarA = a(sa0Var, ua0Var, z10);
                } catch (OutOfMemoryError e10) {
                    t43Var = new t43("Unexpected decode error", e10);
                    t43VarA = t43Var;
                } catch (RuntimeException e11) {
                    t43Var = new t43("Unexpected decode error", e11);
                    t43VarA = t43Var;
                }
                if (t43VarA != null) {
                    synchronized (this.f87849b) {
                        this.f87857j = t43VarA;
                    }
                    return false;
                }
            }
            synchronized (this.f87849b) {
                if (this.f87858k || ua0Var.b(Integer.MIN_VALUE)) {
                    ua0Var.b();
                } else {
                    this.f87851d.addLast(ua0Var);
                }
                sa0Var.b();
                sa0[] sa0VarArr = this.f87852e;
                int i11 = this.f87854g;
                this.f87854g = i11 + 1;
                sa0VarArr[i11] = sa0Var;
            }
            return true;
        }
    }

    public final void f() {
        if (this.f87850c.isEmpty() || this.f87855h <= 0) {
            return;
        }
        this.f87849b.notify();
    }

    @Override // yads.oa0
    public final void flush() {
        synchronized (this.f87849b) {
            this.f87858k = true;
            sa0 sa0Var = this.f87856i;
            if (sa0Var != null) {
                sa0Var.b();
                sa0[] sa0VarArr = this.f87852e;
                int i10 = this.f87854g;
                this.f87854g = i10 + 1;
                sa0VarArr[i10] = sa0Var;
                this.f87856i = null;
            }
            while (!this.f87850c.isEmpty()) {
                sa0 sa0Var2 = (sa0) this.f87850c.removeFirst();
                sa0Var2.b();
                sa0[] sa0VarArr2 = this.f87852e;
                int i11 = this.f87854g;
                this.f87854g = i11 + 1;
                sa0VarArr2[i11] = sa0Var2;
            }
            while (!this.f87851d.isEmpty()) {
                ((ua0) this.f87851d.removeFirst()).b();
            }
        }
    }

    public final void g() {
        int i10 = this.f87854g;
        sa0[] sa0VarArr = this.f87852e;
        if (i10 != sa0VarArr.length) {
            throw new IllegalStateException();
        }
        for (sa0 sa0Var : sa0VarArr) {
            sa0Var.c(1024);
        }
    }

    @Override // yads.oa0
    public final void release() {
        synchronized (this.f87849b) {
            this.f87859l = true;
            this.f87849b.notify();
        }
        try {
            this.f87848a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
