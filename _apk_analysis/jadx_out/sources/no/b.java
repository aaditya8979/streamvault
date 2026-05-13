package no;

import java.io.IOException;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BuffersJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final void a(@NotNull a aVar, @NotNull OutputStream outputStream, long j10) throws IOException {
        tn.p.k(aVar, "<this>");
        tn.p.k(outputStream, "out");
        u.b(aVar.n(), 0L, j10);
        while (j10 > 0) {
            ro.d dVar = ro.d.f78921a;
            if (!(!aVar.exhausted())) {
                throw new IllegalArgumentException("Buffer is empty".toString());
            }
            m mVarM = aVar.m();
            tn.p.h(mVarM);
            byte[] bArrB = mVarM.b(true);
            int iF = mVarM.f();
            int iMin = (int) Math.min(j10, mVarM.d() - iF);
            outputStream.write(bArrB, iF, iMin);
            long j11 = iMin;
            j10 -= j11;
            if (iMin != 0) {
                if (iMin < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (iMin > mVarM.j()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                aVar.skip(j11);
            }
        }
    }

    public static /* synthetic */ void b(a aVar, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = aVar.n();
        }
        a(aVar, outputStream, j10);
    }
}
