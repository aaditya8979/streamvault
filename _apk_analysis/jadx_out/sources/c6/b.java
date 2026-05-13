package c6;

import a6.k0;
import a6.t;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import e4.e;
import e4.q0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: CameraMotionRenderer.java */
/* JADX INFO: loaded from: classes7.dex */
public class b extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i4.e f6508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f6509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f6510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public a f6511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6512q;

    public b() {
        super(5);
        this.f6508m = new i4.e(1);
        this.f6509n = new t();
    }

    @Override // e4.q0
    public int a(Format format) {
        return "application/x-camera-motion".equals(format.f19927j) ? q0.create(4) : q0.create(0);
    }

    @Override // e4.e, e4.o0.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 7) {
            this.f6511p = (a) obj;
        } else {
            super.handleMessage(i10, obj);
        }
    }

    @Override // e4.p0
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // e4.p0
    public boolean isReady() {
        return true;
    }

    @Override // e4.e
    public void n() {
        y();
    }

    @Override // e4.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        y();
    }

    @Override // e4.p0
    public void render(long j10, long j11) throws ExoPlaybackException {
        float[] fArrX;
        while (!hasReadStreamToEnd() && this.f6512q < 100000 + j10) {
            this.f6508m.clear();
            if (u(i(), this.f6508m, false) != -4 || this.f6508m.isEndOfStream()) {
                return;
            }
            this.f6508m.c();
            i4.e eVar = this.f6508m;
            this.f6512q = eVar.f63713e;
            if (this.f6511p != null && (fArrX = x((ByteBuffer) k0.i(eVar.f63711c))) != null) {
                ((a) k0.i(this.f6511p)).onCameraMotion(this.f6512q - this.f6510o, fArrX);
            }
        }
    }

    @Override // e4.e
    public void t(Format[] formatArr, long j10) throws ExoPlaybackException {
        this.f6510o = j10;
    }

    @Nullable
    public final float[] x(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f6509n.J(byteBuffer.array(), byteBuffer.limit());
        this.f6509n.L(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f6509n.m());
        }
        return fArr;
    }

    public final void y() {
        this.f6512q = 0L;
        a aVar = this.f6511p;
        if (aVar != null) {
            aVar.onCameraMotionReset();
        }
    }
}
