package no;

import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmCore.kt */
/* JADX INFO: loaded from: classes2.dex */
public class f implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final InputStream f75918b;

    public f(@NotNull InputStream inputStream) {
        tn.p.k(inputStream, "input");
        this.f75918b = inputStream;
    }

    @Override // no.j, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f75918b.close();
    }

    @Override // no.j
    public long s(@NotNull a aVar, long j10) throws IOException {
        tn.p.k(aVar, "sink");
        if (j10 == 0) {
            return 0L;
        }
        boolean z10 = true;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        try {
            ro.d dVar = ro.d.f78921a;
            m mVarG = aVar.G(1);
            byte[] bArrB = mVarG.b(false);
            long j11 = this.f75918b.read(bArrB, mVarG.d(), (int) Math.min(j10, bArrB.length - r4));
            int i10 = j11 == -1 ? 0 : (int) j11;
            if (i10 == 1) {
                mVarG.w(bArrB, i10);
                mVarG.p(mVarG.d() + i10);
                aVar.B(aVar.o() + ((long) i10));
            } else {
                if (i10 < 0 || i10 > mVarG.h()) {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + i10 + ". Should be in 0.." + mVarG.h()).toString());
                }
                if (i10 != 0) {
                    mVarG.w(bArrB, i10);
                    mVarG.p(mVarG.d() + i10);
                    aVar.B(aVar.o() + ((long) i10));
                } else if (o.b(mVarG)) {
                    aVar.x();
                }
            }
            return j11;
        } catch (AssertionError e10) {
            if (g.b(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @NotNull
    public String toString() {
        return "RawSource(" + this.f75918b + ')';
    }
}
