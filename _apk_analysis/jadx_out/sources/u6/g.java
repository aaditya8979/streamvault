package u6;

import androidx.annotation.IntRange;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: BatchBuffer.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g extends DecoderInputBuffer {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f85529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f85530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f85531l;

    public g() {
        super(2);
        this.f85531l = 32;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, g6.a
    public void b() {
        super.b();
        this.f85530k = 0;
    }

    public boolean r(DecoderInputBuffer decoderInputBuffer) {
        s7.a.a(!decoderInputBuffer.o());
        s7.a.a(!decoderInputBuffer.e());
        s7.a.a(!decoderInputBuffer.g());
        if (!s(decoderInputBuffer)) {
            return false;
        }
        int i10 = this.f85530k;
        this.f85530k = i10 + 1;
        if (i10 == 0) {
            this.f21432f = decoderInputBuffer.f21432f;
            if (decoderInputBuffer.j()) {
                k(1);
            }
        }
        if (decoderInputBuffer.f()) {
            k(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.f21430d;
        if (byteBuffer != null) {
            m(byteBuffer.remaining());
            this.f21430d.put(byteBuffer);
        }
        this.f85529j = decoderInputBuffer.f21432f;
        return true;
    }

    public final boolean s(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!w()) {
            return true;
        }
        if (this.f85530k >= this.f85531l || decoderInputBuffer.f() != f()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.f21430d;
        return byteBuffer2 == null || (byteBuffer = this.f21430d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long t() {
        return this.f21432f;
    }

    public long u() {
        return this.f85529j;
    }

    public int v() {
        return this.f85530k;
    }

    public boolean w() {
        return this.f85530k > 0;
    }

    public void x(@IntRange(from = 1) int i10) {
        s7.a.a(i10 > 0);
        this.f85531l = i10;
    }
}
