package i6;

import androidx.annotation.Nullable;
import i6.b0;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: DummyTrackOutput.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f63915a = new byte[4096];

    @Override // i6.b0
    public void a(s7.a0 a0Var, int i10, int i11) {
        a0Var.Q(i10);
    }

    @Override // i6.b0
    public void b(com.google.android.exoplayer2.m mVar) {
    }

    @Override // i6.b0
    public void c(long j10, int i10, int i11, int i12, @Nullable b0.a aVar) {
    }

    @Override // i6.b0
    public int d(r7.f fVar, int i10, boolean z10, int i11) throws IOException {
        int i12 = fVar.read(this.f63915a, 0, Math.min(this.f63915a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }
}
