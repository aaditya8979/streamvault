package s6;

import java.io.IOException;
import s7.m0;

/* JADX INFO: compiled from: TsDurationReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79141a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f79144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f79146f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s7.j0 f79142b = new s7.j0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f79147g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f79148h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f79149i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7.a0 f79143c = new s7.a0();

    public f0(int i10) {
        this.f79141a = i10;
    }

    public final int a(i6.l lVar) {
        this.f79143c.M(m0.f79492f);
        this.f79144d = true;
        lVar.resetPeekPosition();
        return 0;
    }

    public long b() {
        return this.f79149i;
    }

    public s7.j0 c() {
        return this.f79142b;
    }

    public boolean d() {
        return this.f79144d;
    }

    public int e(i6.l lVar, i6.y yVar, int i10) throws IOException {
        if (i10 <= 0) {
            return a(lVar);
        }
        if (!this.f79146f) {
            return h(lVar, yVar, i10);
        }
        if (this.f79148h == -9223372036854775807L) {
            return a(lVar);
        }
        if (!this.f79145e) {
            return f(lVar, yVar, i10);
        }
        long j10 = this.f79147g;
        if (j10 == -9223372036854775807L) {
            return a(lVar);
        }
        long jB = this.f79142b.b(this.f79148h) - this.f79142b.b(j10);
        this.f79149i = jB;
        if (jB < 0) {
            s7.q.i("TsDurationReader", "Invalid duration: " + this.f79149i + ". Using TIME_UNSET instead.");
            this.f79149i = -9223372036854775807L;
        }
        return a(lVar);
    }

    public final int f(i6.l lVar, i6.y yVar, int i10) throws IOException {
        int iMin = (int) Math.min(this.f79141a, lVar.getLength());
        long j10 = 0;
        if (lVar.getPosition() != j10) {
            yVar.f63944a = j10;
            return 1;
        }
        this.f79143c.L(iMin);
        lVar.resetPeekPosition();
        lVar.peekFully(this.f79143c.d(), 0, iMin);
        this.f79147g = g(this.f79143c, i10);
        this.f79145e = true;
        return 0;
    }

    public final long g(s7.a0 a0Var, int i10) {
        int iF = a0Var.f();
        for (int iE = a0Var.e(); iE < iF; iE++) {
            if (a0Var.d()[iE] == 71) {
                long jC = j0.c(a0Var, iE, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(i6.l lVar, i6.y yVar, int i10) throws IOException {
        long length = lVar.getLength();
        int iMin = (int) Math.min(this.f79141a, length);
        long j10 = length - ((long) iMin);
        if (lVar.getPosition() != j10) {
            yVar.f63944a = j10;
            return 1;
        }
        this.f79143c.L(iMin);
        lVar.resetPeekPosition();
        lVar.peekFully(this.f79143c.d(), 0, iMin);
        this.f79148h = i(this.f79143c, i10);
        this.f79146f = true;
        return 0;
    }

    public final long i(s7.a0 a0Var, int i10) {
        int iE = a0Var.e();
        int iF = a0Var.f();
        for (int i11 = iF - 188; i11 >= iE; i11--) {
            if (j0.b(a0Var.d(), iE, iF, i11)) {
                long jC = j0.c(a0Var, i11, i10);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }
}
