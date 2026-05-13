package e7;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import d6.z0;
import java.io.IOException;

/* JADX INFO: compiled from: SampleStream.java */
/* JADX INFO: loaded from: classes10.dex */
public interface b0 {
    int a(z0 z0Var, DecoderInputBuffer decoderInputBuffer, int i10);

    boolean isReady();

    void maybeThrowError() throws IOException;

    int skipData(long j10);
}
