package u6;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import f6.u;
import java.nio.ByteBuffer;
import s7.q;

/* JADX INFO: compiled from: C2Mp3TimestampTracker.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f85532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85534c;

    public final long a(long j10) {
        return this.f85532a + Math.max(0L, ((this.f85533b - 529) * 1000000) / j10);
    }

    public long b(com.google.android.exoplayer2.m mVar) {
        return a(mVar.A);
    }

    public void c() {
        this.f85532a = 0L;
        this.f85533b = 0L;
        this.f85534c = false;
    }

    public long d(com.google.android.exoplayer2.m mVar, DecoderInputBuffer decoderInputBuffer) {
        if (this.f85533b == 0) {
            this.f85532a = decoderInputBuffer.f21432f;
        }
        if (this.f85534c) {
            return decoderInputBuffer.f21432f;
        }
        ByteBuffer byteBuffer = (ByteBuffer) s7.a.e(decoderInputBuffer.f21430d);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int iM = u.m(i10);
        if (iM != -1) {
            long jA = a(mVar.A);
            this.f85533b += (long) iM;
            return jA;
        }
        this.f85534c = true;
        this.f85533b = 0L;
        this.f85532a = decoderInputBuffer.f21432f;
        q.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return decoderInputBuffer.f21432f;
    }
}
