package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class n92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o92 f92788a = new o92();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f92789b = new jb2(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f92790c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f92791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f92792e;

    public final void a() {
        jb2 jb2Var = this.f92789b;
        byte[] bArr = jb2Var.f91147a;
        if (bArr.length == 65025) {
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(65025, jb2Var.f91149c));
        int i10 = this.f92789b.f91149c;
        jb2Var.f91147a = bArrCopyOf;
        jb2Var.f91149c = i10;
        jb2Var.f91148b = 0;
    }

    public final boolean a(ld0 ld0Var) throws InterruptedIOException {
        int i10;
        int i11;
        int i12;
        if (this.f92792e) {
            this.f92792e = false;
            this.f92789b.c(0);
        }
        while (true) {
            if (this.f92792e) {
                return true;
            }
            if (this.f92790c < 0) {
                if (!this.f92788a.a(ld0Var, -1L) || !this.f92788a.a(ld0Var, true)) {
                    break;
                }
                o92 o92Var = this.f92788a;
                int i13 = o92Var.f93160d;
                if ((o92Var.f93157a & 1) == 1 && this.f92789b.f91149c == 0) {
                    this.f92791d = 0;
                    int i14 = 0;
                    do {
                        int i15 = this.f92791d;
                        o92 o92Var2 = this.f92788a;
                        if (i15 >= o92Var2.f93159c) {
                            break;
                        }
                        int[] iArr = o92Var2.f93162f;
                        this.f92791d = i15 + 1;
                        i12 = iArr[i15];
                        i14 += i12;
                    } while (i12 == 255);
                    i13 += i14;
                    i11 = this.f92791d;
                } else {
                    i11 = 0;
                }
                try {
                    ld0Var.a(i13);
                    this.f92790c = i11;
                } catch (EOFException unused) {
                }
            }
            int i16 = this.f92790c;
            this.f92791d = 0;
            int i17 = 0;
            do {
                int i18 = this.f92791d;
                int i19 = i16 + i18;
                o92 o92Var3 = this.f92788a;
                if (i19 >= o92Var3.f93159c) {
                    break;
                }
                int[] iArr2 = o92Var3.f93162f;
                this.f92791d = i18 + 1;
                i10 = iArr2[i19];
                i17 += i10;
            } while (i10 == 255);
            int i20 = this.f92790c + this.f92791d;
            if (i17 > 0) {
                jb2 jb2Var = this.f92789b;
                jb2Var.a(jb2Var.f91149c + i17);
                jb2 jb2Var2 = this.f92789b;
                try {
                    ld0Var.a(jb2Var2.f91147a, jb2Var2.f91149c, i17, false);
                    jb2 jb2Var3 = this.f92789b;
                    jb2Var3.d(jb2Var3.f91149c + i17);
                    this.f92792e = this.f92788a.f93162f[i20 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i20 == this.f92788a.f93159c) {
                i20 = -1;
            }
            this.f92790c = i20;
        }
        return false;
    }
}
