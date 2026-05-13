package i6;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.common.collect.ImmutableList;
import i6.t;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: FlacMetadataReader.java */
/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: compiled from: FlacMetadataReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public t f63918a;

        public a(@Nullable t tVar) {
            this.f63918a = tVar;
        }
    }

    public static boolean a(l lVar) throws IOException {
        s7.a0 a0Var = new s7.a0(4);
        lVar.peekFully(a0Var.d(), 0, 4);
        return a0Var.F() == 1716281667;
    }

    public static int b(l lVar) throws IOException {
        lVar.resetPeekPosition();
        s7.a0 a0Var = new s7.a0(2);
        lVar.peekFully(a0Var.d(), 0, 2);
        int iJ = a0Var.J();
        if ((iJ >> 2) == 16382) {
            lVar.resetPeekPosition();
            return iJ;
        }
        lVar.resetPeekPosition();
        throw ParserException.createForMalformedContainer("First frame does not start with sync code.", null);
    }

    @Nullable
    public static Metadata c(l lVar, boolean z10) throws IOException {
        Metadata metadataA = new w().a(lVar, z10 ? null : z6.b.f98242b);
        if (metadataA == null || metadataA.f() == 0) {
            return null;
        }
        return metadataA;
    }

    @Nullable
    public static Metadata d(l lVar, boolean z10) throws IOException {
        lVar.resetPeekPosition();
        long peekPosition = lVar.getPeekPosition();
        Metadata metadataC = c(lVar, z10);
        lVar.skipFully((int) (lVar.getPeekPosition() - peekPosition));
        return metadataC;
    }

    public static boolean e(l lVar, a aVar) throws IOException {
        lVar.resetPeekPosition();
        s7.z zVar = new s7.z(new byte[4]);
        lVar.peekFully(zVar.f79571a, 0, 4);
        boolean zG = zVar.g();
        int iH = zVar.h(7);
        int iH2 = zVar.h(24) + 4;
        if (iH == 0) {
            aVar.f63918a = h(lVar);
        } else {
            t tVar = aVar.f63918a;
            if (tVar == null) {
                throw new IllegalArgumentException();
            }
            if (iH == 3) {
                aVar.f63918a = tVar.b(f(lVar, iH2));
            } else if (iH == 4) {
                aVar.f63918a = tVar.c(j(lVar, iH2));
            } else if (iH == 6) {
                s7.a0 a0Var = new s7.a0(iH2);
                lVar.readFully(a0Var.d(), 0, iH2);
                a0Var.Q(4);
                aVar.f63918a = tVar.a(ImmutableList.of(PictureFrame.b(a0Var)));
            } else {
                lVar.skipFully(iH2);
            }
        }
        return zG;
    }

    public static t.a f(l lVar, int i10) throws IOException {
        s7.a0 a0Var = new s7.a0(i10);
        lVar.readFully(a0Var.d(), 0, i10);
        return g(a0Var);
    }

    public static t.a g(s7.a0 a0Var) {
        a0Var.Q(1);
        int iG = a0Var.G();
        long jE = ((long) a0Var.e()) + ((long) iG);
        int i10 = iG / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jW = a0Var.w();
            if (jW == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jW;
            jArrCopyOf2[i11] = a0Var.w();
            a0Var.Q(2);
            i11++;
        }
        a0Var.Q((int) (jE - ((long) a0Var.e())));
        return new t.a(jArrCopyOf, jArrCopyOf2);
    }

    public static t h(l lVar) throws IOException {
        byte[] bArr = new byte[38];
        lVar.readFully(bArr, 0, 38);
        return new t(bArr, 4);
    }

    public static void i(l lVar) throws IOException {
        s7.a0 a0Var = new s7.a0(4);
        lVar.readFully(a0Var.d(), 0, 4);
        if (a0Var.F() != 1716281667) {
            throw ParserException.createForMalformedContainer("Failed to read FLAC stream marker.", null);
        }
    }

    public static List<String> j(l lVar, int i10) throws IOException {
        s7.a0 a0Var = new s7.a0(i10);
        lVar.readFully(a0Var.d(), 0, i10);
        a0Var.Q(4);
        return Arrays.asList(e0.j(a0Var, false, false).f63881b);
    }
}
