package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class qj implements dk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f94045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj f94046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tj f94047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f94048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f94049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f94050f = 0;

    public qj(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f94045a = mediaCodec;
        this.f94046b = new uj(handlerThread);
        this.f94047c = new tj(mediaCodec, handlerThread2);
        this.f94048d = z10;
    }

    @Override // yads.dk1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f94046b.a(bufferInfo);
    }

    @Override // yads.dk1
    public final MediaFormat a() {
        MediaFormat mediaFormat;
        uj ujVar = this.f94046b;
        synchronized (ujVar.f95672a) {
            mediaFormat = ujVar.f95679h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // yads.dk1
    public final ByteBuffer a(int i10) {
        return this.f94045a.getInputBuffer(i10);
    }

    @Override // yads.dk1
    public final void a(int i10, int i11, long j10, int i12) {
        tj tjVar = this.f94047c;
        RuntimeException runtimeException = (RuntimeException) tjVar.f95249d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        sj sjVarB = tj.b();
        sjVarB.f94843a = i10;
        sjVarB.f94844b = 0;
        sjVarB.f94845c = i11;
        sjVarB.f94847e = j10;
        sjVarB.f94848f = i12;
        rj rjVar = tjVar.f95248c;
        int i13 = ib3.f90737a;
        rjVar.obtainMessage(0, sjVarB).sendToTarget();
    }

    @Override // yads.dk1
    public final void a(int i10, long j10) {
        this.f94045a.releaseOutputBuffer(i10, j10);
    }

    @Override // yads.dk1
    public final void a(int i10, m20 m20Var, long j10) {
        this.f94047c.a(i10, m20Var, j10);
    }

    public final void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f94046b.a(this.f94045a);
        d73.a("configureCodec");
        this.f94045a.configure(mediaFormat, surface, mediaCrypto, 0);
        d73.a();
        tj tjVar = this.f94047c;
        if (!tjVar.f95251f) {
            tjVar.f95247b.start();
            tjVar.f95248c = new rj(tjVar, tjVar.f95247b.getLooper());
            tjVar.f95251f = true;
        }
        d73.a("startCodec");
        this.f94045a.start();
        d73.a();
        this.f94050f = 1;
    }

    @Override // yads.dk1
    public final void a(Bundle bundle) {
        c();
        this.f94045a.setParameters(bundle);
    }

    @Override // yads.dk1
    public final void a(Surface surface) {
        c();
        this.f94045a.setOutputSurface(surface);
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
        c();
        this.f94045a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: bt.v8
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f6350b.a(ck1Var, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // yads.dk1
    public final void a(boolean z10, int i10) {
        this.f94045a.releaseOutputBuffer(i10, z10);
    }

    @Override // yads.dk1
    public final int b() {
        int i10;
        uj ujVar = this.f94046b;
        synchronized (ujVar.f95672a) {
            i10 = -1;
            if (ujVar.f95682k <= 0 && !ujVar.f95683l) {
                IllegalStateException illegalStateException = ujVar.f95684m;
                if (illegalStateException != null) {
                    ujVar.f95684m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = ujVar.f95681j;
                if (codecException != null) {
                    ujVar.f95681j = null;
                    throw codecException;
                }
                sb1 sb1Var = ujVar.f95675d;
                int i11 = sb1Var.f94761c;
                if (i11 != 0) {
                    if (i11 == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = sb1Var.f94762d;
                    int i12 = sb1Var.f94759a;
                    i10 = iArr[i12];
                    sb1Var.f94759a = (i12 + 1) & sb1Var.f94763e;
                    sb1Var.f94761c = i11 - 1;
                }
            }
        }
        return i10;
    }

    @Override // yads.dk1
    public final ByteBuffer b(int i10) {
        return this.f94045a.getOutputBuffer(i10);
    }

    public final void c() {
        if (this.f94048d) {
            try {
                tj tjVar = this.f94047c;
                vy vyVar = tjVar.f95250e;
                synchronized (vyVar) {
                    vyVar.f96222a = false;
                }
                rj rjVar = tjVar.f95248c;
                rjVar.getClass();
                rjVar.obtainMessage(2).sendToTarget();
                tjVar.f95250e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // yads.dk1
    public final void flush() {
        this.f94047c.a();
        this.f94045a.flush();
        this.f94046b.a();
        this.f94045a.start();
    }

    @Override // yads.dk1
    public final void release() {
        try {
            if (this.f94050f == 1) {
                tj tjVar = this.f94047c;
                if (tjVar.f95251f) {
                    tjVar.a();
                    tjVar.f95247b.quit();
                }
                tjVar.f95251f = false;
                uj ujVar = this.f94046b;
                synchronized (ujVar.f95672a) {
                    ujVar.f95683l = true;
                    ujVar.f95673b.quit();
                    if (!ujVar.f95678g.isEmpty()) {
                        ujVar.f95680i = (MediaFormat) ujVar.f95678g.getLast();
                    }
                    sb1 sb1Var = ujVar.f95675d;
                    sb1Var.f94759a = 0;
                    sb1Var.f94760b = -1;
                    sb1Var.f94761c = 0;
                    sb1 sb1Var2 = ujVar.f95676e;
                    sb1Var2.f94759a = 0;
                    sb1Var2.f94760b = -1;
                    sb1Var2.f94761c = 0;
                    ujVar.f95677f.clear();
                    ujVar.f95678g.clear();
                    ujVar.f95681j = null;
                }
            }
            this.f94050f = 2;
        } finally {
            if (!this.f94049e) {
                this.f94045a.release();
                this.f94049e = true;
            }
        }
    }

    @Override // yads.dk1
    public final void setVideoScalingMode(int i10) {
        c();
        this.f94045a.setVideoScalingMode(i10);
    }
}
