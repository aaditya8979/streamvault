package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class qa2 extends z33 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f93961o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f93962p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f93963n;

    public static boolean a(jb2 jb2Var, byte[] bArr) {
        int i10 = jb2Var.f91149c;
        int i11 = jb2Var.f91148b;
        if (i10 - i11 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        jb2Var.a(bArr2, 0, bArr.length);
        jb2Var.e(i11);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // yads.z33
    public final long a(jb2 jb2Var) {
        byte[] bArr = jb2Var.f91147a;
        byte b10 = bArr[0];
        int i10 = b10 & 255;
        int i11 = b10 & 3;
        int i12 = 2;
        if (i11 == 0) {
            i12 = 1;
        } else if (i11 != 1 && i11 != 2) {
            i12 = bArr[1] & 63;
        }
        int i13 = i10 >> 3;
        int i14 = i13 & 3;
        return (((long) this.f97384i) * (((long) i12) * ((long) (i13 >= 16 ? 2500 << i14 : i13 >= 12 ? 10000 << (i13 & 1) : i14 == 3 ? 60000 : 10000 << i14)))) / 1000000;
    }

    @Override // yads.z33
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f93963n = false;
        }
    }

    @Override // yads.z33
    public final boolean a(jb2 jb2Var, long j10, x33 x33Var) {
        if (a(jb2Var, f93961o)) {
            byte[] bArrCopyOf = Arrays.copyOf(jb2Var.f91147a, jb2Var.f91149c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = ra2.a(bArrCopyOf);
            if (x33Var.f96626a != null) {
                return true;
            }
            lx0 lx0Var = new lx0();
            lx0Var.f92148k = "audio/opus";
            lx0Var.f92161x = i10;
            lx0Var.f92162y = 48000;
            lx0Var.f92150m = arrayListA;
            x33Var.f96626a = new mx0(lx0Var);
            return true;
        }
        if (!a(jb2Var, f93962p)) {
            if (x33Var.f96626a != null) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (x33Var.f96626a == null) {
            throw new IllegalStateException();
        }
        if (this.f93963n) {
            return true;
        }
        this.f93963n = true;
        jb2Var.e(jb2Var.f91148b + 8);
        ts1 ts1VarA = dn3.a(p51.b(dn3.a(jb2Var, false, false).f87759a));
        if (ts1VarA == null) {
            return true;
        }
        mx0 mx0Var = x33Var.f96626a;
        mx0Var.getClass();
        lx0 lx0Var2 = new lx0(mx0Var);
        ts1 ts1Var = x33Var.f96626a.f92608k;
        if (ts1Var != null) {
            ss1[] ss1VarArr = ts1Var.f95344b;
            if (ss1VarArr.length != 0) {
                ts1VarA = new ts1((ss1[]) ib3.a((Object[]) ts1VarA.f95344b, (Object[]) ss1VarArr));
            }
        }
        lx0Var2.f92146i = ts1VarA;
        x33Var.f96626a = new mx0(lx0Var2);
        return true;
    }
}
