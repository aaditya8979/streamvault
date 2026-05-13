package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class yv0 extends z33 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public bw0 f97305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public xv0 f97306o;

    @Override // yads.z33
    public final long a(jb2 jb2Var) {
        int i10;
        int i11;
        int iM;
        byte[] bArr = jb2Var.f91147a;
        int i12 = -1;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i13 = (bArr[2] & 255) >> 4;
        if (i13 == 6 || i13 == 7) {
            jb2Var.e(jb2Var.f91148b + 4);
            jb2Var.s();
        }
        switch (i13) {
            case 1:
                i12 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i10 = i13 - 2;
                i11 = 576;
                i12 = i11 << i10;
                break;
            case 6:
                iM = jb2Var.m();
                i12 = iM + 1;
                break;
            case 7:
                iM = jb2Var.r();
                i12 = iM + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = i13 - 8;
                i11 = 256;
                i12 = i11 << i10;
                break;
        }
        jb2Var.e(0);
        return i12;
    }

    @Override // yads.z33
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f97305n = null;
            this.f97306o = null;
        }
    }

    @Override // yads.z33
    public final boolean a(jb2 jb2Var, long j10, x33 x33Var) {
        byte[] bArr = jb2Var.f91147a;
        bw0 bw0Var = this.f97305n;
        if (bw0Var == null) {
            bw0 bw0Var2 = new bw0(17, bArr);
            this.f97305n = bw0Var2;
            x33Var.f96626a = bw0Var2.a(Arrays.copyOfRange(bArr, 9, jb2Var.f91149c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & 127) == 3) {
            aw0 aw0VarA = wv0.a(jb2Var);
            bw0 bw0Var3 = new bw0(bw0Var.f88162a, bw0Var.f88163b, bw0Var.f88164c, bw0Var.f88165d, bw0Var.f88166e, bw0Var.f88168g, bw0Var.f88169h, bw0Var.f88171j, aw0VarA, bw0Var.f88173l);
            this.f97305n = bw0Var3;
            this.f97306o = new xv0(bw0Var3, aw0VarA);
            return true;
        }
        if (b10 != -1) {
            return true;
        }
        xv0 xv0Var = this.f97306o;
        if (xv0Var != null) {
            xv0Var.f96885c = j10;
            x33Var.f96627b = xv0Var;
        }
        x33Var.f96626a.getClass();
        return false;
    }
}
