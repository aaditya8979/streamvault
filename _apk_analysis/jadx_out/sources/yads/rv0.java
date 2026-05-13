package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class rv0 implements sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw0 f94620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uv0 f94622c = new uv0();

    public rv0(int i10, bw0 bw0Var) {
        this.f94620a = bw0Var;
        this.f94621b = i10;
    }

    public final long a(ld0 ld0Var) throws EOFException, InterruptedIOException {
        while (true) {
            long j10 = ld0Var.f91938d + ((long) ld0Var.f91940f);
            if (j10 >= ld0Var.f91937c - 6) {
                break;
            }
            bw0 bw0Var = this.f94620a;
            int i10 = this.f94621b;
            uv0 uv0Var = this.f94622c;
            int i11 = 2;
            byte[] bArr = new byte[2];
            ld0Var.b(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i10) {
                jb2 jb2Var = new jb2(16);
                System.arraycopy(bArr, 0, jb2Var.f91147a, 0, 2);
                byte[] bArr2 = jb2Var.f91147a;
                int i12 = 0;
                for (int i13 = 14; i12 < i13; i13 = 14) {
                    int iB = ld0Var.b(bArr2, i11 + i12, 14 - i12);
                    if (iB == -1) {
                        break;
                    }
                    i12 += iB;
                    i11 = 2;
                }
                jb2Var.d(i12);
                ld0Var.f91940f = 0;
                ld0Var.a(false, (int) (j10 - ld0Var.f91938d));
                if (vv0.a(jb2Var, bw0Var, i10, uv0Var)) {
                    break;
                }
            } else {
                ld0Var.f91940f = 0;
                ld0Var.a(false, (int) (j10 - ld0Var.f91938d));
            }
            ld0Var.a(false, 1);
        }
        long j11 = ld0Var.f91938d + ((long) ld0Var.f91940f);
        long j12 = ld0Var.f91937c;
        if (j11 < j12 - 6) {
            return this.f94622c.f95852a;
        }
        ld0Var.a(false, (int) (j12 - j11));
        return this.f94620a.f88171j;
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j10) throws EOFException, InterruptedIOException {
        long j11 = ld0Var.f91938d;
        long jA = a(ld0Var);
        long j12 = ld0Var.f91938d + ((long) ld0Var.f91940f);
        ld0Var.a(false, Math.max(6, this.f94620a.f88164c));
        long jA2 = a(ld0Var);
        return (jA > j10 || jA2 <= j10) ? jA2 <= j10 ? new rp(-2, jA2, ld0Var.f91938d + ((long) ld0Var.f91940f)) : new rp(-1, jA, j11) : new rp(0, -9223372036854775807L, j12);
    }
}
