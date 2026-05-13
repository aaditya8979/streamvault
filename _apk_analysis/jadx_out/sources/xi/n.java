package xi;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.decoder.CryptoInfo;

/* JADX INFO: compiled from: SynchronousMediaCodecBufferEnqueuer.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
public class n implements g {
    private final MediaCodec codec;

    public n(MediaCodec mediaCodec) {
        this.codec = mediaCodec;
    }

    @Override // xi.g
    public void flush() {
    }

    @Override // xi.g
    public void maybeThrowException() {
    }

    @Override // xi.g
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.codec.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // xi.g
    public void queueSecureInputBuffer(int i10, int i11, CryptoInfo cryptoInfo, long j10, int i12) {
        this.codec.queueSecureInputBuffer(i10, i11, cryptoInfo.getFrameworkCryptoInfo(), j10, i12);
    }

    @Override // xi.g
    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // xi.g
    public void shutdown() {
    }

    @Override // xi.g
    public void start() {
    }

    @Override // xi.g
    public void waitUntilQueueingComplete() {
    }
}
