package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
public final class w21 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f96259a = new jb2(10);

    public final ts1 a(ld0 ld0Var, s21 s21Var) throws EOFException, InterruptedIOException {
        ts1 ts1VarA = null;
        int i10 = 0;
        while (true) {
            try {
                ld0Var.b(this.f96259a.f91147a, 0, 10, false);
                this.f96259a.e(0);
                if (this.f96259a.o() != 4801587) {
                    break;
                }
                jb2 jb2Var = this.f96259a;
                jb2Var.e(jb2Var.f91148b + 3);
                int iL = this.f96259a.l();
                int i11 = iL + 10;
                if (ts1VarA == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f96259a.f91147a, 0, bArr, 0, 10);
                    ld0Var.b(bArr, 10, iL, false);
                    ts1VarA = new u21(s21Var).a(i11, bArr);
                } else {
                    ld0Var.a(false, iL);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        ld0Var.f91940f = 0;
        ld0Var.a(false, i10);
        return ts1VarA;
    }
}
