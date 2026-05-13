package u4;

import a6.k0;
import a6.m;
import a6.t;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ParserException;
import java.io.IOException;
import k4.h;

/* JADX INFO: compiled from: WavHeaderReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: compiled from: WavHeaderReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f85480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f85481b;

        public a(int i10, long j10) {
            this.f85480a = i10;
            this.f85481b = j10;
        }

        public static a a(h hVar, t tVar) throws InterruptedException, IOException {
            hVar.peekFully(tVar.f3620a, 0, 8);
            tVar.L(0);
            return new a(tVar.j(), tVar.o());
        }
    }

    @Nullable
    public static c a(h hVar) throws InterruptedException, IOException {
        byte[] bArr;
        a6.a.e(hVar);
        t tVar = new t(16);
        if (a.a(hVar, tVar).f85480a != 1380533830) {
            return null;
        }
        hVar.peekFully(tVar.f3620a, 0, 4);
        tVar.L(0);
        int iJ = tVar.j();
        if (iJ != 1463899717) {
            m.c("WavHeaderReader", "Unsupported RIFF format: " + iJ);
            return null;
        }
        a aVarA = a.a(hVar, tVar);
        while (aVarA.f85480a != 1718449184) {
            hVar.advancePeekPosition((int) aVarA.f85481b);
            aVarA = a.a(hVar, tVar);
        }
        a6.a.f(aVarA.f85481b >= 16);
        hVar.peekFully(tVar.f3620a, 0, 16);
        tVar.L(0);
        int iQ = tVar.q();
        int iQ2 = tVar.q();
        int iP = tVar.p();
        int iP2 = tVar.p();
        int iQ3 = tVar.q();
        int iQ4 = tVar.q();
        int i10 = ((int) aVarA.f85481b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            hVar.peekFully(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = k0.f3579f;
        }
        return new c(iQ, iQ2, iP, iP2, iQ3, iQ4, bArr);
    }

    public static Pair<Long, Long> b(h hVar) throws InterruptedException, IOException {
        a6.a.e(hVar);
        hVar.resetPeekPosition();
        t tVar = new t(8);
        a aVarA = a.a(hVar, tVar);
        while (true) {
            int i10 = aVarA.f85480a;
            if (i10 == 1684108385) {
                hVar.skipFully(8);
                long position = hVar.getPosition();
                long j10 = aVarA.f85481b + position;
                long length = hVar.getLength();
                if (length != -1 && j10 > length) {
                    m.h("WavHeaderReader", "Data exceeds input length: " + j10 + ", " + length);
                    j10 = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j10));
            }
            if (i10 != 1380533830 && i10 != 1718449184) {
                m.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f85480a);
            }
            long j11 = aVarA.f85481b + 8;
            if (aVarA.f85480a == 1380533830) {
                j11 = 12;
            }
            if (j11 > 2147483647L) {
                throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + aVarA.f85480a);
            }
            hVar.skipFully((int) j11);
            aVarA = a.a(hVar, tVar);
        }
    }
}
