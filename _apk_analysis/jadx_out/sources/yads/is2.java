package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class is2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qe f90968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f90969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f90970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hs2 f90971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public hs2 f90972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hs2 f90973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f90974g;

    public is2(qe qeVar) {
        this.f90968a = qeVar;
        int iB = ((ib0) qeVar).b();
        this.f90969b = iB;
        this.f90970c = new jb2(32);
        hs2 hs2Var = new hs2(iB, 0L);
        this.f90971d = hs2Var;
        this.f90972e = hs2Var;
        this.f90973f = hs2Var;
    }

    public static hs2 a(hs2 hs2Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= hs2Var.f90528b) {
            hs2Var = hs2Var.f90530d;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (hs2Var.f90528b - j10));
            pe peVar = hs2Var.f90529c;
            byteBuffer.put(peVar.f93560a, ((int) (j10 - hs2Var.f90527a)) + peVar.f93561b, iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == hs2Var.f90528b) {
                hs2Var = hs2Var.f90530d;
            }
        }
        return hs2Var;
    }

    public static hs2 a(hs2 hs2Var, long j10, byte[] bArr, int i10) {
        while (j10 >= hs2Var.f90528b) {
            hs2Var = hs2Var.f90530d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (hs2Var.f90528b - j10));
            pe peVar = hs2Var.f90529c;
            System.arraycopy(peVar.f93560a, ((int) (j10 - hs2Var.f90527a)) + peVar.f93561b, bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == hs2Var.f90528b) {
                hs2Var = hs2Var.f90530d;
            }
        }
        return hs2Var;
    }

    public static hs2 a(hs2 hs2Var, sa0 sa0Var, js2 js2Var, jb2 jb2Var) {
        hs2 hs2VarA;
        if (sa0Var.b(1073741824)) {
            long j10 = js2Var.f91346b;
            int iR = 1;
            jb2Var.c(1);
            hs2 hs2VarA2 = a(hs2Var, j10, jb2Var.f91147a, 1);
            long j11 = j10 + 1;
            byte b10 = jb2Var.f91147a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & 127;
            m20 m20Var = sa0Var.f94748c;
            byte[] bArr = m20Var.f92214a;
            if (bArr == null) {
                m20Var.f92214a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            hs2VarA = a(hs2VarA2, j11, m20Var.f92214a, i10);
            long j12 = j11 + ((long) i10);
            if (z10) {
                jb2Var.c(2);
                hs2VarA = a(hs2VarA, j12, jb2Var.f91147a, 2);
                j12 += 2;
                iR = jb2Var.r();
            }
            int i11 = iR;
            int[] iArr = m20Var.f92217d;
            if (iArr == null || iArr.length < i11) {
                iArr = new int[i11];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = m20Var.f92218e;
            if (iArr3 == null || iArr3.length < i11) {
                iArr3 = new int[i11];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i12 = i11 * 6;
                jb2Var.c(i12);
                hs2VarA = a(hs2VarA, j12, jb2Var.f91147a, i12);
                j12 += (long) i12;
                jb2Var.e(0);
                for (int i13 = 0; i13 < i11; i13++) {
                    iArr2[i13] = jb2Var.r();
                    iArr4[i13] = jb2Var.p();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = js2Var.f91345a - ((int) (j12 - js2Var.f91346b));
            }
            l73 l73Var = js2Var.f91347c;
            int i14 = ib3.f90737a;
            m20Var.a(i11, iArr2, iArr4, l73Var.f91907b, m20Var.f92214a, l73Var.f91906a, l73Var.f91908c, l73Var.f91909d);
            long j13 = js2Var.f91346b;
            int i15 = (int) (j12 - j13);
            js2Var.f91346b = j13 + ((long) i15);
            js2Var.f91345a -= i15;
        } else {
            hs2VarA = hs2Var;
        }
        if (!sa0Var.b(268435456)) {
            sa0Var.c(js2Var.f91345a);
            return a(hs2VarA, js2Var.f91346b, sa0Var.f94749d, js2Var.f91345a);
        }
        jb2Var.c(4);
        hs2 hs2VarA3 = a(hs2VarA, js2Var.f91346b, jb2Var.f91147a, 4);
        int iP = jb2Var.p();
        js2Var.f91346b += 4;
        js2Var.f91345a -= 4;
        sa0Var.c(iP);
        hs2 hs2VarA4 = a(hs2VarA3, js2Var.f91346b, sa0Var.f94749d, iP);
        js2Var.f91346b += (long) iP;
        int i16 = js2Var.f91345a - iP;
        js2Var.f91345a = i16;
        ByteBuffer byteBuffer = sa0Var.f94752g;
        if (byteBuffer == null || byteBuffer.capacity() < i16) {
            sa0Var.f94752g = ByteBuffer.allocate(i16);
        } else {
            sa0Var.f94752g.clear();
        }
        return a(hs2VarA4, js2Var.f91346b, sa0Var.f94752g, js2Var.f91345a);
    }

    public final void a(long j10) {
        hs2 hs2Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            hs2Var = this.f90971d;
            if (j10 < hs2Var.f90528b) {
                break;
            }
            qe qeVar = this.f90968a;
            pe peVar = hs2Var.f90529c;
            ib0 ib0Var = (ib0) qeVar;
            synchronized (ib0Var) {
                pe[] peVarArr = ib0Var.f90732g;
                int i10 = ib0Var.f90731f;
                ib0Var.f90731f = i10 + 1;
                peVarArr[i10] = peVar;
                ib0Var.f90730e--;
                ib0Var.notifyAll();
            }
            hs2 hs2Var2 = this.f90971d;
            hs2Var2.f90529c = null;
            hs2 hs2Var3 = hs2Var2.f90530d;
            hs2Var2.f90530d = null;
            this.f90971d = hs2Var3;
        }
        if (this.f90972e.f90527a < hs2Var.f90527a) {
            this.f90972e = hs2Var;
        }
    }

    public final void a(hs2 hs2Var) {
        if (hs2Var.f90529c == null) {
            return;
        }
        ib0 ib0Var = (ib0) this.f90968a;
        synchronized (ib0Var) {
            hs2 hs2Var2 = hs2Var;
            while (hs2Var2 != null) {
                pe[] peVarArr = ib0Var.f90732g;
                int i10 = ib0Var.f90731f;
                ib0Var.f90731f = i10 + 1;
                pe peVar = hs2Var2.f90529c;
                peVar.getClass();
                peVarArr[i10] = peVar;
                ib0Var.f90730e--;
                hs2Var2 = hs2Var2.f90530d;
                if (hs2Var2 == null || hs2Var2.f90529c == null) {
                    hs2Var2 = null;
                }
            }
            ib0Var.notifyAll();
        }
        hs2Var.f90529c = null;
        hs2Var.f90530d = null;
    }
}
