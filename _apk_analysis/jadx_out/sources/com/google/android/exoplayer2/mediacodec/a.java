package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.mediacodec.a;
import com.google.android.exoplayer2.mediacodec.c;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.nio.ByteBuffer;
import s7.k0;
import y7.p;

/* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(23)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f21837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6.f f21838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u6.d f21839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21842f;

    /* JADX INFO: compiled from: AsynchronousMediaCodecAdapter.java */
    public static final class b implements c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<HandlerThread> f21843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p<HandlerThread> f21844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21845c;

        public b(final int i10, boolean z10) {
            this(new p() { // from class: u6.b
                @Override // y7.p
                public final Object get() {
                    return a.b.e(i10);
                }
            }, new p() { // from class: u6.c
                @Override // y7.p
                public final Object get() {
                    return a.b.f(i10);
                }
            }, z10);
        }

        @VisibleForTesting
        public b(p<HandlerThread> pVar, p<HandlerThread> pVar2, boolean z10) {
            this.f21843a = pVar;
            this.f21844b = pVar2;
            this.f21845c = z10;
        }

        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(a.g(i10));
        }

        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(a.h(i10));
        }

        @Override // com.google.android.exoplayer2.mediacodec.c.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(c.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            a aVar2;
            String str = aVar.f21848a.f21854a;
            a aVar3 = null;
            try {
                k0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    aVar2 = new a(mediaCodecCreateByCodecName, this.f21843a.get(), this.f21844b.get(), this.f21845c);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodecCreateByCodecName = null;
            }
            try {
                k0.c();
                aVar2.j(aVar.f21849b, aVar.f21851d, aVar.f21852e, aVar.f21853f);
                return aVar2;
            } catch (Exception e12) {
                e = e12;
                aVar3 = aVar2;
                if (aVar3 != null) {
                    aVar3.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }
    }

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f21837a = mediaCodec;
        this.f21838b = new u6.f(handlerThread);
        this.f21839c = new u6.d(mediaCodec, handlerThread2);
        this.f21840d = z10;
        this.f21842f = 0;
    }

    public static String g(int i10) {
        return i(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String h(int i10) {
        return i(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String i(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append(VastTagName.VIDEO);
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(c.InterfaceC0302c interfaceC0302c, MediaCodec mediaCodec, long j10, long j11) {
        interfaceC0302c.a(this, j10, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void a(final c.InterfaceC0302c interfaceC0302c, Handler handler) {
        l();
        this.f21837a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: u6.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f85496b.k(interfaceC0302c, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void b(int i10, int i11, g6.c cVar, long j10, int i12) {
        this.f21839c.n(i10, i11, cVar, j10, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public int dequeueInputBufferIndex() {
        return this.f21838b.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.f21838b.d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void flush() {
        this.f21839c.i();
        this.f21837a.flush();
        this.f21838b.e();
        this.f21837a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    @Nullable
    public ByteBuffer getInputBuffer(int i10) {
        return this.f21837a.getInputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    @Nullable
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f21837a.getOutputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public MediaFormat getOutputFormat() {
        return this.f21838b.g();
    }

    public final void j(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i10) {
        this.f21838b.h(this.f21837a);
        k0.a("configureCodec");
        this.f21837a.configure(mediaFormat, surface, mediaCrypto, i10);
        k0.c();
        this.f21839c.q();
        k0.a("startCodec");
        this.f21837a.start();
        k0.c();
        this.f21842f = 1;
    }

    public final void l() {
        if (this.f21840d) {
            try {
                this.f21839c.r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f21839c.m(i10, i11, i12, j10, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void release() {
        try {
            if (this.f21842f == 1) {
                this.f21839c.p();
                this.f21838b.o();
            }
            this.f21842f = 2;
        } finally {
            if (!this.f21841e) {
                this.f21837a.release();
                this.f21841e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void releaseOutputBuffer(int i10, long j10) {
        this.f21837a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f21837a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void setOutputSurface(Surface surface) {
        l();
        this.f21837a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void setParameters(Bundle bundle) {
        l();
        this.f21837a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void setVideoScalingMode(int i10) {
        l();
        this.f21837a.setVideoScalingMode(i10);
    }
}
