package k4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import java.io.EOFException;
import java.io.IOException;
import k4.u;

/* JADX INFO: compiled from: DummyTrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements u {
    @Override // k4.u
    public void a(a6.t tVar, int i10) {
        tVar.M(i10);
    }

    @Override // k4.u
    public int b(h hVar, int i10, boolean z10) throws InterruptedException, IOException {
        int iSkip = hVar.skip(i10);
        if (iSkip != -1) {
            return iSkip;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // k4.u
    public void c(long j10, int i10, int i11, int i12, @Nullable u.a aVar) {
    }

    @Override // k4.u
    public void d(Format format) {
    }
}
