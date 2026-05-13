package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class e53 implements dk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f89103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f89104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f89105c;

    public e53(MediaCodec mediaCodec) {
        this.f89103a = mediaCodec;
        if (ib3.f90737a < 21) {
            this.f89104b = mediaCodec.getInputBuffers();
            this.f89105c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // yads.dk1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f89103a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && ib3.f90737a < 21) {
                this.f89105c = this.f89103a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // yads.dk1
    public final MediaFormat a() {
        return this.f89103a.getOutputFormat();
    }

    @Override // yads.dk1
    public final ByteBuffer a(int i10) {
        return ib3.f90737a >= 21 ? this.f89103a.getInputBuffer(i10) : this.f89104b[i10];
    }

    @Override // yads.dk1
    public final void a(int i10, int i11, long j10, int i12) {
        this.f89103a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // yads.dk1
    public final void a(int i10, long j10) {
        this.f89103a.releaseOutputBuffer(i10, j10);
    }

    @Override // yads.dk1
    public final void a(int i10, m20 m20Var, long j10) {
        this.f89103a.queueSecureInputBuffer(i10, 0, m20Var.f92222i, j10, 0);
    }

    @Override // yads.dk1
    public final void a(Bundle bundle) {
        this.f89103a.setParameters(bundle);
    }

    @Override // yads.dk1
    public final void a(Surface surface) {
        this.f89103a.setOutputSurface(surface);
    }

    public final void a(ck1 ck1Var, MediaCodec mediaCodec, long j10, long j11) {
        al1 al1Var = (al1) ck1Var;
        al1Var.getClass();
        if (ib3.f90737a < 30) {
            al1Var.f87731b.sendMessageAtFrontOfQueue(Message.obtain(al1Var.f87731b, 0, (int) (j10 >> 32), (int) j10));
            return;
        }
        bl1 bl1Var = al1Var.f87732c;
        if (al1Var != bl1Var.f88057n1) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            bl1Var.f92418z0 = true;
            return;
        }
        try {
            bl1Var.b(j10);
            bl1Var.D();
            bl1Var.B0.f93504e++;
            bl1Var.V0 = true;
            if (!bl1Var.T0) {
                bl1Var.T0 = true;
                bl1Var.I0.a(bl1Var.P0);
                bl1Var.R0 = true;
            }
            bl1Var.a(j10);
        } catch (pn0 e10) {
            al1Var.f87732c.A0 = e10;
        }
    }

    @Override // yads.dk1
    public final void a(final ck1 ck1Var, Handler handler) {
        this.f89103a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: bt.d1
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f5982b.a(ck1Var, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // yads.dk1
    public final void a(boolean z10, int i10) {
        this.f89103a.releaseOutputBuffer(i10, z10);
    }

    @Override // yads.dk1
    public final int b() {
        return this.f89103a.dequeueInputBuffer(0L);
    }

    @Override // yads.dk1
    public final ByteBuffer b(int i10) {
        return ib3.f90737a >= 21 ? this.f89103a.getOutputBuffer(i10) : this.f89105c[i10];
    }

    @Override // yads.dk1
    public final void flush() {
        this.f89103a.flush();
    }

    @Override // yads.dk1
    public final void release() {
        this.f89104b = null;
        this.f89105c = null;
        this.f89103a.release();
    }

    @Override // yads.dk1
    public final void setVideoScalingMode(int i10) {
        this.f89103a.setVideoScalingMode(i10);
    }
}
