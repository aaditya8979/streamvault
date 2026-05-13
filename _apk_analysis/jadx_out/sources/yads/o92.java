package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes8.dex */
public final class o92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f93158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f93159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f93161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f93162f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f93163g = new jb2(255);

    public final boolean a(ld0 ld0Var, long j10) throws EOFException, InterruptedIOException {
        long j11 = ld0Var.f91938d;
        if (j11 != ((long) ld0Var.f91940f) + j11) {
            throw new IllegalArgumentException();
        }
        this.f93163g.c(4);
        while (true) {
            if (j10 != -1 && ld0Var.f91938d + 4 >= j10) {
                break;
            }
            try {
                if (!ld0Var.b(this.f93163g.f91147a, 0, 4, true)) {
                    break;
                }
                this.f93163g.e(0);
                if (this.f93163g.n() == 1332176723) {
                    ld0Var.f91940f = 0;
                    return true;
                }
                ld0Var.a(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if (j10 != -1 && ld0Var.f91938d >= j10) {
                break;
            }
        } while (ld0Var.c(1) != -1);
        return false;
    }

    public final boolean a(ld0 ld0Var, boolean z10) throws ob2, EOFException {
        this.f93157a = 0;
        this.f93158b = 0L;
        this.f93159c = 0;
        this.f93160d = 0;
        this.f93161e = 0;
        this.f93163g.c(27);
        try {
            if (ld0Var.b(this.f93163g.f91147a, 0, 27, z10) && this.f93163g.n() == 1332176723) {
                if (this.f93163g.m() != 0) {
                    if (z10) {
                        return false;
                    }
                    throw ob2.b("unsupported bit stream revision");
                }
                this.f93157a = this.f93163g.m();
                this.f93158b = this.f93163g.e();
                this.f93163g.g();
                this.f93163g.g();
                this.f93163g.g();
                int iM = this.f93163g.m();
                this.f93159c = iM;
                this.f93160d = iM + 27;
                this.f93163g.c(iM);
                try {
                    if (ld0Var.b(this.f93163g.f91147a, 0, this.f93159c, z10)) {
                        for (int i10 = 0; i10 < this.f93159c; i10++) {
                            this.f93162f[i10] = this.f93163g.m();
                            this.f93161e += this.f93162f[i10];
                        }
                        return true;
                    }
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                }
                return false;
            }
        } catch (EOFException e11) {
            if (!z10) {
                throw e11;
            }
        }
        return false;
    }
}
