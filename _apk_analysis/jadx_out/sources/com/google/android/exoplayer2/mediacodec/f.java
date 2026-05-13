package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.mediacodec.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import s7.k0;
import s7.m0;

/* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f21866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public ByteBuffer[] f21867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ByteBuffer[] f21868c;

    /* JADX INFO: compiled from: SynchronousMediaCodecAdapter.java */
    public static class b implements c.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.mediacodec.f$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // com.google.android.exoplayer2.mediacodec.c.b
        public c a(c.a aVar) throws Throwable {
            MediaCodec mediaCodecB;
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                mediaCodecB = b(aVar);
            } catch (IOException e10) {
                e = e10;
            } catch (RuntimeException e11) {
                e = e11;
            }
            try {
                k0.a("configureCodec");
                mediaCodecB.configure(aVar.f21849b, aVar.f21851d, aVar.f21852e, aVar.f21853f);
                k0.c();
                k0.a("startCodec");
                mediaCodecB.start();
                k0.c();
                return new f(mediaCodecB);
            } catch (IOException | RuntimeException e12) {
                e = e12;
                mediaCodec = mediaCodecB;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        public MediaCodec b(c.a aVar) throws IOException {
            s7.a.e(aVar.f21848a);
            String str = aVar.f21848a.f21854a;
            k0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            k0.c();
            return mediaCodecCreateByCodecName;
        }
    }

    public f(MediaCodec mediaCodec) {
        this.f21866a = mediaCodec;
        if (m0.f79487a < 21) {
            this.f21867b = mediaCodec.getInputBuffers();
            this.f21868c = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(c.InterfaceC0302c interfaceC0302c, MediaCodec mediaCodec, long j10, long j11) {
        interfaceC0302c.a(this, j10, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    @RequiresApi(23)
    public void a(final c.InterfaceC0302c interfaceC0302c, Handler handler) {
        this.f21866a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: u6.o
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f85542b.d(interfaceC0302c, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void b(int i10, int i11, g6.c cVar, long j10, int i12) {
        this.f21866a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public int dequeueInputBufferIndex() {
        return this.f21866a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f21866a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && m0.f79487a < 21) {
                this.f21868c = this.f21866a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void flush() {
        this.f21866a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    @Nullable
    public ByteBuffer getInputBuffer(int i10) {
        return m0.f79487a >= 21 ? this.f21866a.getInputBuffer(i10) : ((ByteBuffer[]) m0.j(this.f21867b))[i10];
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    @Nullable
    public ByteBuffer getOutputBuffer(int i10) {
        return m0.f79487a >= 21 ? this.f21866a.getOutputBuffer(i10) : ((ByteBuffer[]) m0.j(this.f21868c))[i10];
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public MediaFormat getOutputFormat() {
        return this.f21866a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f21866a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void release() {
        this.f21867b = null;
        this.f21868c = null;
        this.f21866a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    @RequiresApi(21)
    public void releaseOutputBuffer(int i10, long j10) {
        this.f21866a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f21866a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    @RequiresApi(23)
    public void setOutputSurface(Surface surface) {
        this.f21866a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    @RequiresApi(19)
    public void setParameters(Bundle bundle) {
        this.f21866a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public void setVideoScalingMode(int i10) {
        this.f21866a.setVideoScalingMode(i10);
    }
}
