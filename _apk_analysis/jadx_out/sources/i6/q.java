package i6;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import s7.m0;

/* JADX INFO: compiled from: FlacFrameReader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: compiled from: FlacFrameReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f63917a;
    }

    public static boolean a(s7.a0 a0Var, t tVar, int i10) {
        int iJ = j(a0Var, i10);
        return iJ != -1 && iJ <= tVar.f63922b;
    }

    public static boolean b(s7.a0 a0Var, int i10) {
        return a0Var.D() == m0.s(a0Var.d(), i10, a0Var.e() - 1, 0);
    }

    public static boolean c(s7.a0 a0Var, t tVar, boolean z10, a aVar) {
        try {
            long jK = a0Var.K();
            if (!z10) {
                jK *= (long) tVar.f63922b;
            }
            aVar.f63917a = jK;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(s7.a0 a0Var, t tVar, int i10, a aVar) {
        int iE = a0Var.e();
        long jF = a0Var.F();
        long j10 = jF >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((jF >> 4) & 15), tVar) && f((int) ((jF >> 1) & 7), tVar) && !(((jF & 1) > 1L ? 1 : ((jF & 1) == 1L ? 0 : -1)) == 0) && c(a0Var, tVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(a0Var, tVar, (int) ((jF >> 12) & 15)) && e(a0Var, tVar, (int) ((jF >> 8) & 15)) && b(a0Var, iE);
    }

    public static boolean e(s7.a0 a0Var, t tVar, int i10) {
        int i11 = tVar.f63925e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == tVar.f63926f;
        }
        if (i10 == 12) {
            return a0Var.D() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int iJ = a0Var.J();
        if (i10 == 14) {
            iJ *= 10;
        }
        return iJ == i11;
    }

    public static boolean f(int i10, t tVar) {
        return i10 == 0 || i10 == tVar.f63929i;
    }

    public static boolean g(int i10, t tVar) {
        return i10 <= 7 ? i10 == tVar.f63927g - 1 : i10 <= 10 && tVar.f63927g == 2;
    }

    public static boolean h(l lVar, t tVar, int i10, a aVar) throws IOException {
        long peekPosition = lVar.getPeekPosition();
        byte[] bArr = new byte[2];
        lVar.peekFully(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            lVar.resetPeekPosition();
            lVar.advancePeekPosition((int) (peekPosition - lVar.getPosition()));
            return false;
        }
        s7.a0 a0Var = new s7.a0(16);
        System.arraycopy(bArr, 0, a0Var.d(), 0, 2);
        a0Var.O(n.c(lVar, a0Var.d(), 2, 14));
        lVar.resetPeekPosition();
        lVar.advancePeekPosition((int) (peekPosition - lVar.getPosition()));
        return d(a0Var, tVar, i10, aVar);
    }

    public static long i(l lVar, t tVar) throws IOException {
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        lVar.peekFully(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        lVar.advancePeekPosition(2);
        int i10 = z10 ? 7 : 6;
        s7.a0 a0Var = new s7.a0(i10);
        a0Var.O(n.c(lVar, a0Var.d(), 0, i10));
        lVar.resetPeekPosition();
        a aVar = new a();
        if (c(a0Var, tVar, z10, aVar)) {
            return aVar.f63917a;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    public static int j(s7.a0 a0Var, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return a0Var.D() + 1;
            case 7:
                return a0Var.J() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
