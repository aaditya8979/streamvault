package t6;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import i6.l;
import java.io.IOException;
import s7.a0;
import s7.m0;
import s7.q;

/* JADX INFO: compiled from: WavHeaderReader.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: compiled from: WavHeaderReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f85072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f85073b;

        public a(int i10, long j10) {
            this.f85072a = i10;
            this.f85073b = j10;
        }

        public static a a(l lVar, a0 a0Var) throws IOException {
            lVar.peekFully(a0Var.d(), 0, 8);
            a0Var.P(0);
            return new a(a0Var.n(), a0Var.t());
        }
    }

    public static boolean a(l lVar) throws IOException {
        a0 a0Var = new a0(8);
        int i10 = a.a(lVar, a0Var).f85072a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.peekFully(a0Var.d(), 0, 4);
        a0Var.P(0);
        int iN = a0Var.n();
        if (iN == 1463899717) {
            return true;
        }
        q.c("WavHeaderReader", "Unsupported form type: " + iN);
        return false;
    }

    public static c b(l lVar) throws IOException {
        byte[] bArr;
        a0 a0Var = new a0(16);
        a aVarD = d(1718449184, lVar, a0Var);
        s7.a.g(aVarD.f85073b >= 16);
        lVar.peekFully(a0Var.d(), 0, 16);
        a0Var.P(0);
        int iV = a0Var.v();
        int iV2 = a0Var.v();
        int iU = a0Var.u();
        int iU2 = a0Var.u();
        int iV3 = a0Var.v();
        int iV4 = a0Var.v();
        int i10 = ((int) aVarD.f85073b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            lVar.peekFully(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = m0.f79492f;
        }
        lVar.skipFully((int) (lVar.getPeekPosition() - lVar.getPosition()));
        return new c(iV, iV2, iU, iU2, iV3, iV4, bArr);
    }

    public static long c(l lVar) throws IOException {
        a0 a0Var = new a0(8);
        a aVarA = a.a(lVar, a0Var);
        if (aVarA.f85072a != 1685272116) {
            lVar.resetPeekPosition();
            return -1L;
        }
        lVar.advancePeekPosition(8);
        a0Var.P(0);
        lVar.peekFully(a0Var.d(), 0, 8);
        long jR = a0Var.r();
        lVar.skipFully(((int) aVarA.f85073b) + 8);
        return jR;
    }

    public static a d(int i10, l lVar, a0 a0Var) throws IOException {
        a aVarA = a.a(lVar, a0Var);
        while (aVarA.f85072a != i10) {
            q.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f85072a);
            long j10 = aVarA.f85073b + 8;
            if (j10 > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + aVarA.f85072a);
            }
            lVar.skipFully((int) j10);
            aVarA = a.a(lVar, a0Var);
        }
        return aVarA;
    }

    public static Pair<Long, Long> e(l lVar) throws IOException {
        lVar.resetPeekPosition();
        a aVarD = d(1684108385, lVar, new a0(8));
        lVar.skipFully(8);
        return Pair.create(Long.valueOf(lVar.getPosition()), Long.valueOf(aVarD.f85073b));
    }
}
