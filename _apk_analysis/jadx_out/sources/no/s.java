package no;

import java.io.EOFException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Sources.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public static final long a(@NotNull r rVar, byte b10, long j10, long j11) {
        String str;
        tn.p.k(rVar, "<this>");
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (z10) {
            if (j10 == j11) {
                return -1L;
            }
            long jN = j10;
            while (jN < j11 && rVar.request(1 + jN)) {
                long jA = c.a(rVar.getBuffer(), b10, jN, Math.min(j11, rVar.getBuffer().n()));
                if (jA != -1) {
                    return jA;
                }
                jN = rVar.getBuffer().n();
            }
            return -1L;
        }
        if (j11 < 0) {
            str = "startIndex (" + j10 + ") and endIndex (" + j11 + ") should be non negative";
        } else {
            str = "startIndex (" + j10 + ") is not within the range [0..endIndex(" + j11 + "))";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static /* synthetic */ long b(r rVar, byte b10, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return a(rVar, b10, j12, j11);
    }

    @NotNull
    public static final byte[] c(@NotNull r rVar) {
        tn.p.k(rVar, "<this>");
        return e(rVar, -1);
    }

    @NotNull
    public static final byte[] d(@NotNull r rVar, int i10) {
        tn.p.k(rVar, "<this>");
        long j10 = i10;
        if (j10 >= 0) {
            return e(rVar, i10);
        }
        throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
    }

    public static final byte[] e(r rVar, int i10) throws EOFException {
        if (i10 == -1) {
            for (long j10 = 2147483647L; rVar.getBuffer().n() < 2147483647L && rVar.request(j10); j10 *= (long) 2) {
            }
            if (!(rVar.getBuffer().n() < 2147483647L)) {
                throw new IllegalStateException(("Can't create an array of size " + rVar.getBuffer().n()).toString());
            }
            i10 = (int) rVar.getBuffer().n();
        } else {
            rVar.require(i10);
        }
        byte[] bArr = new byte[i10];
        g(rVar.getBuffer(), bArr, 0, 0, 6, null);
        return bArr;
    }

    public static final void f(@NotNull r rVar, @NotNull byte[] bArr, int i10, int i11) throws EOFException {
        tn.p.k(rVar, "<this>");
        tn.p.k(bArr, "sink");
        u.a(bArr.length, i10, i11);
        int i12 = i10;
        while (i12 < i11) {
            int iG0 = rVar.g0(bArr, i12, i11);
            if (iG0 == -1) {
                throw new EOFException("Source exhausted before reading " + (i11 - i10) + " bytes. Only " + iG0 + " bytes were read.");
            }
            i12 += iG0;
        }
    }

    public static /* synthetic */ void g(r rVar, byte[] bArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        f(rVar, bArr, i10, i11);
    }
}
