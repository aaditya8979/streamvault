package e7;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import d6.z0;

/* JADX INFO: compiled from: EmptySampleStream.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements b0 {
    @Override // e7.b0
    public int a(z0 z0Var, DecoderInputBuffer decoderInputBuffer, int i10) {
        decoderInputBuffer.k(4);
        return -4;
    }

    @Override // e7.b0
    public boolean isReady() {
        return true;
    }

    @Override // e7.b0
    public void maybeThrowError() {
    }

    @Override // e7.b0
    public int skipData(long j10) {
        return 0;
    }
}
