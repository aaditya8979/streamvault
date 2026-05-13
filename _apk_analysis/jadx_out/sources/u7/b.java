package u7;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.m;
import d6.u1;
import java.nio.ByteBuffer;
import s7.a0;
import s7.m0;

/* JADX INFO: compiled from: CameraMotionRenderer.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends com.google.android.exoplayer2.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final DecoderInputBuffer f85544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a0 f85545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f85546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public a f85547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f85548s;

    public b() {
        super(6);
        this.f85544o = new DecoderInputBuffer(1);
        this.f85545p = new a0();
    }

    @Override // d6.u1
    public int a(m mVar) {
        return "application/x-camera-motion".equals(mVar.f21751m) ? u1.create(4) : u1.create(0);
    }

    @Override // com.google.android.exoplayer2.y, d6.u1
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.w.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 8) {
            this.f85547r = (a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // com.google.android.exoplayer2.y
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // com.google.android.exoplayer2.y
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.e
    public void n() {
        y();
    }

    @Override // com.google.android.exoplayer2.e
    public void p(long j10, boolean z10) {
        this.f85548s = Long.MIN_VALUE;
        y();
    }

    @Override // com.google.android.exoplayer2.y
    public void render(long j10, long j11) {
        while (!hasReadStreamToEnd() && this.f85548s < 100000 + j10) {
            this.f85544o.b();
            if (u(i(), this.f85544o, 0) != -4 || this.f85544o.g()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.f85544o;
            this.f85548s = decoderInputBuffer.f21432f;
            if (this.f85547r != null && !decoderInputBuffer.f()) {
                this.f85544o.n();
                float[] fArrX = x((ByteBuffer) m0.j(this.f85544o.f21430d));
                if (fArrX != null) {
                    ((a) m0.j(this.f85547r)).onCameraMotion(this.f85548s - this.f85546q, fArrX);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void t(m[] mVarArr, long j10, long j11) {
        this.f85546q = j11;
    }

    @Nullable
    public final float[] x(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f85545p.N(byteBuffer.array(), byteBuffer.limit());
        this.f85545p.P(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f85545p.q());
        }
        return fArr;
    }

    public final void y() {
        a aVar = this.f85547r;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }
}
