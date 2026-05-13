package s6;

import androidx.core.view.InputDeviceCompat;
import s6.i0;
import s7.m0;

/* JADX INFO: compiled from: SectionReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f79112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.a0 f79113b = new s7.a0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79117f;

    public c0(b0 b0Var) {
        this.f79112a = b0Var;
    }

    @Override // s6.i0
    public void a(s7.a0 a0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int iE = z10 ? a0Var.e() + a0Var.D() : -1;
        if (this.f79117f) {
            if (!z10) {
                return;
            }
            this.f79117f = false;
            a0Var.P(iE);
            this.f79115d = 0;
        }
        while (a0Var.a() > 0) {
            int i11 = this.f79115d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iD = a0Var.D();
                    a0Var.P(a0Var.e() - 1);
                    if (iD == 255) {
                        this.f79117f = true;
                        return;
                    }
                }
                int iMin = Math.min(a0Var.a(), 3 - this.f79115d);
                a0Var.j(this.f79113b.d(), this.f79115d, iMin);
                int i12 = this.f79115d + iMin;
                this.f79115d = i12;
                if (i12 == 3) {
                    this.f79113b.P(0);
                    this.f79113b.O(3);
                    this.f79113b.Q(1);
                    int iD2 = this.f79113b.D();
                    int iD3 = this.f79113b.D();
                    this.f79116e = (iD2 & 128) != 0;
                    this.f79114c = (((iD2 & 15) << 8) | iD3) + 3;
                    int iB = this.f79113b.b();
                    int i13 = this.f79114c;
                    if (iB < i13) {
                        this.f79113b.c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i13, this.f79113b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(a0Var.a(), this.f79114c - this.f79115d);
                a0Var.j(this.f79113b.d(), this.f79115d, iMin2);
                int i14 = this.f79115d + iMin2;
                this.f79115d = i14;
                int i15 = this.f79114c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f79116e) {
                        this.f79113b.O(i15);
                    } else {
                        if (m0.r(this.f79113b.d(), 0, this.f79114c, -1) != 0) {
                            this.f79117f = true;
                            return;
                        }
                        this.f79113b.O(this.f79114c - 4);
                    }
                    this.f79113b.P(0);
                    this.f79112a.a(this.f79113b);
                    this.f79115d = 0;
                }
            }
        }
    }

    @Override // s6.i0
    public void b(s7.j0 j0Var, i6.m mVar, i0.d dVar) {
        this.f79112a.b(j0Var, mVar, dVar);
        this.f79117f = true;
    }

    @Override // s6.i0
    public void seek() {
        this.f79117f = true;
    }
}
