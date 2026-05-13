package t4;

/* JADX INFO: compiled from: TsUtil.java */
/* JADX INFO: loaded from: classes12.dex */
public final class i0 {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long b(a6.t tVar, int i10, int i11) {
        tVar.L(i10);
        if (tVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iJ = tVar.j();
        if ((8388608 & iJ) != 0 || ((2096896 & iJ) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (((iJ & 32) != 0) && tVar.y() >= 7 && tVar.a() >= 7) {
            if ((tVar.y() & 16) == 16) {
                byte[] bArr = new byte[6];
                tVar.h(bArr, 0, 6);
                return c(bArr);
            }
        }
        return -9223372036854775807L;
    }

    public static long c(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
