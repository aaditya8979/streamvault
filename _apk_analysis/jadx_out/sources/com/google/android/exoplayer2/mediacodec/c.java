package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.m;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: MediaCodecAdapter.java */
/* JADX INFO: loaded from: classes10.dex */
public interface c {

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f21848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f21849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m f21850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Surface f21851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final MediaCrypto f21852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f21853f;

        public a(d dVar, MediaFormat mediaFormat, m mVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i10) {
            this.f21848a = dVar;
            this.f21849b = mediaFormat;
            this.f21850c = mVar;
            this.f21851d = surface;
            this.f21852e = mediaCrypto;
            this.f21853f = i10;
        }

        public static a a(d dVar, MediaFormat mediaFormat, m mVar, @Nullable MediaCrypto mediaCrypto) {
            return new a(dVar, mediaFormat, mVar, null, mediaCrypto, 0);
        }

        public static a b(d dVar, MediaFormat mediaFormat, m mVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
            return new a(dVar, mediaFormat, mVar, surface, mediaCrypto, 0);
        }
    }

    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface b {
        c a(a aVar) throws IOException;
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MediaCodecAdapter.java */
    public interface InterfaceC0302c {
        void a(c cVar, long j10, long j11);
    }

    @RequiresApi(23)
    void a(InterfaceC0302c interfaceC0302c, Handler handler);

    void b(int i10, int i11, g6.c cVar, long j10, int i12);

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void flush();

    @Nullable
    ByteBuffer getInputBuffer(int i10);

    @Nullable
    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void release();

    @RequiresApi(21)
    void releaseOutputBuffer(int i10, long j10);

    void releaseOutputBuffer(int i10, boolean z10);

    @RequiresApi(23)
    void setOutputSurface(Surface surface);

    @RequiresApi(19)
    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i10);
}
