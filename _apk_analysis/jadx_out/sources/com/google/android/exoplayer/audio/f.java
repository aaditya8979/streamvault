package com.google.android.exoplayer.audio;

import a6.k0;
import a6.o;
import a6.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.audio.AudioSink;
import com.google.android.exoplayer.audio.a;
import com.google.android.exoplayer.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer.mediacodec.MediaCodecUtil;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import e4.f0;
import e4.l0;
import e4.q0;
import g4.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends MediaCodecRenderer implements o {
    public int A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public MediaFormat E0;

    @Nullable
    public Format F0;
    public long G0;
    public boolean H0;
    public boolean I0;
    public long J0;
    public int K0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Context f20036w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final a.C0283a f20037x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final AudioSink f20038y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final long[] f20039z0;

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    public final class b implements AudioSink.a {
        public b() {
        }

        @Override // com.google.android.exoplayer.audio.AudioSink.a
        public void onAudioSessionId(int i10) {
            f.this.f20037x0.g(i10);
            f.this.V0(i10);
        }

        @Override // com.google.android.exoplayer.audio.AudioSink.a
        public void onPositionDiscontinuity() {
            f.this.W0();
            f.this.I0 = true;
        }

        @Override // com.google.android.exoplayer.audio.AudioSink.a
        public void onUnderrun(int i10, long j10, long j11) {
            f.this.f20037x0.h(i10, j10, j11);
            f.this.X0(i10, j10, j11);
        }
    }

    @Deprecated
    public f(Context context, com.google.android.exoplayer.mediacodec.b bVar, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, boolean z10, boolean z11, @Nullable Handler handler, @Nullable com.google.android.exoplayer.audio.a aVar2, AudioSink audioSink) {
        super(1, bVar, aVar, z10, z11, 44100.0f);
        this.f20036w0 = context.getApplicationContext();
        this.f20038y0 = audioSink;
        this.J0 = -9223372036854775807L;
        this.f20039z0 = new long[10];
        this.f20037x0 = new a.C0283a(handler, aVar2);
        audioSink.a(new b());
    }

    public static boolean N0(String str) {
        if (k0.f3574a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(k0.f3576c)) {
            String str2 = k0.f3575b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean O0(String str) {
        if (k0.f3574a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(k0.f3576c)) {
            String str2 = k0.f3575b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean P0() {
        if (k0.f3574a == 23) {
            String str = k0.f3577d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int U0(Format format) {
        if ("audio/raw".equals(format.f19927j)) {
            return format.f19942y;
        }
        return 2;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public int F0(com.google.android.exoplayer.mediacodec.b bVar, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, Format format) throws MediaCodecUtil.DecoderQueryException {
        String str = format.f19927j;
        if (!p.l(str)) {
            return q0.create(0);
        }
        int i10 = k0.f3574a >= 21 ? 32 : 0;
        boolean z10 = format.f19930m == null || j4.j.class.equals(format.D) || (format.D == null && e4.e.w(aVar, format.f19930m));
        int i11 = 8;
        if (z10 && L0(format.f19940w, str) && bVar.getPassthroughDecoderInfo() != null) {
            return q0.create(4, 8, i10);
        }
        if (("audio/raw".equals(str) && !this.f20038y0.d(format.f19940w, format.f19942y)) || !this.f20038y0.d(format.f19940w, 2)) {
            return q0.create(1);
        }
        List<com.google.android.exoplayer.mediacodec.a> listV = V(bVar, format, false);
        if (listV.isEmpty()) {
            return q0.create(1);
        }
        if (!z10) {
            return q0.create(2);
        }
        com.google.android.exoplayer.mediacodec.a aVar2 = listV.get(0);
        boolean zL = aVar2.l(format);
        if (zL && aVar2.n(format)) {
            i11 = 16;
        }
        return q0.create(zL ? 4 : 3, i11, i10);
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void H(com.google.android.exoplayer.mediacodec.a aVar, MediaCodec mediaCodec, Format format, @Nullable MediaCrypto mediaCrypto, float f10) {
        this.A0 = R0(aVar, format, k());
        this.C0 = N0(aVar.f20204a);
        this.D0 = O0(aVar.f20204a);
        boolean z10 = aVar.f20211h;
        this.B0 = z10;
        MediaFormat mediaFormatS0 = S0(format, z10 ? "audio/raw" : aVar.f20206c, this.A0, f10);
        mediaCodec.configure(mediaFormatS0, (Surface) null, mediaCrypto, 0);
        if (!this.B0) {
            this.E0 = null;
        } else {
            this.E0 = mediaFormatS0;
            mediaFormatS0.setString("mime", format.f19927j);
        }
    }

    public boolean L0(int i10, String str) {
        return T0(i10, str) != 0;
    }

    public boolean M0(Format format, Format format2) {
        return k0.c(format.f19927j, format2.f19927j) && format.f19940w == format2.f19940w && format.f19941x == format2.f19941x && format.f19942y == format2.f19942y && format.F(format2) && !"audio/opus".equals(format.f19927j);
    }

    public final int Q0(com.google.android.exoplayer.mediacodec.a aVar, Format format) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(aVar.f20204a) || (i10 = k0.f3574a) >= 24 || (i10 == 23 && k0.i0(this.f20036w0))) {
            return format.f19928k;
        }
        return -1;
    }

    public int R0(com.google.android.exoplayer.mediacodec.a aVar, Format format, Format[] formatArr) {
        int iQ0 = Q0(aVar, format);
        if (formatArr.length == 1) {
            return iQ0;
        }
        for (Format format2 : formatArr) {
            if (aVar.o(format, format2, false)) {
                iQ0 = Math.max(iQ0, Q0(aVar, format2));
            }
        }
        return iQ0;
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat S0(Format format, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.f19940w);
        mediaFormat.setInteger("sample-rate", format.f19941x);
        v4.e.e(mediaFormat, format.f19929l);
        v4.e.d(mediaFormat, "max-input-size", i10);
        int i11 = k0.f3574a;
        if (i11 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f && !P0()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(format.f19927j)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        return mediaFormat;
    }

    public int T0(int i10, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (this.f20038y0.d(-1, 18)) {
                return p.d("audio/eac3-joc");
            }
            str = "audio/eac3";
        }
        int iD = p.d(str);
        if (this.f20038y0.d(i10, iD)) {
            return iD;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public float U(float f10, Format format, Format[] formatArr) {
        int iMax = -1;
        for (Format format2 : formatArr) {
            int i10 = format2.f19941x;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public List<com.google.android.exoplayer.mediacodec.a> V(com.google.android.exoplayer.mediacodec.b bVar, Format format, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        com.google.android.exoplayer.mediacodec.a passthroughDecoderInfo;
        String str = format.f19927j;
        if (str == null) {
            return Collections.emptyList();
        }
        if (L0(format.f19940w, str) && (passthroughDecoderInfo = bVar.getPassthroughDecoderInfo()) != null) {
            return Collections.singletonList(passthroughDecoderInfo);
        }
        List<com.google.android.exoplayer.mediacodec.a> listP = MediaCodecUtil.p(bVar.getDecoderInfos(str, z10, false), format);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(listP);
            arrayList.addAll(bVar.getDecoderInfos("audio/eac3", z10, false));
            listP = arrayList;
        }
        return Collections.unmodifiableList(listP);
    }

    public void V0(int i10) {
    }

    public void W0() {
    }

    public void X0(int i10, long j10, long j11) {
    }

    public final void Y0() {
        long currentPositionUs = this.f20038y0.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.I0) {
                currentPositionUs = Math.max(this.G0, currentPositionUs);
            }
            this.G0 = currentPositionUs;
            this.I0 = false;
        }
    }

    @Override // a6.o
    public void b(l0 l0Var) {
        this.f20038y0.b(l0Var);
    }

    @Override // e4.e, e4.p0
    @Nullable
    public o getMediaClock() {
        return this;
    }

    @Override // a6.o
    public l0 getPlaybackParameters() {
        return this.f20038y0.getPlaybackParameters();
    }

    @Override // a6.o
    public long getPositionUs() {
        if (getState() == 2) {
            Y0();
        }
        return this.G0;
    }

    @Override // e4.e, e4.o0.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 2) {
            this.f20038y0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f20038y0.c((g4.c) obj);
        } else if (i10 != 5) {
            super.handleMessage(i10, obj);
        } else {
            this.f20038y0.e((m) obj);
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.p0
    public boolean isEnded() {
        return super.isEnded() && this.f20038y0.isEnded();
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.p0
    public boolean isReady() {
        return this.f20038y0.hasPendingData() || super.isReady();
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void j0(String str, long j10, long j11) {
        this.f20037x0.i(str, j10, j11);
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void k0(f0 f0Var) throws ExoPlaybackException {
        super.k0(f0Var);
        Format format = f0Var.f60107c;
        this.F0 = format;
        this.f20037x0.l(format);
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void l0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iR;
        int[] iArr;
        int i10;
        MediaFormat mediaFormat2 = this.E0;
        if (mediaFormat2 != null) {
            iR = T0(mediaFormat2.getInteger("channel-count"), mediaFormat2.getString("mime"));
            mediaFormat = mediaFormat2;
        } else {
            iR = mediaFormat.containsKey("v-bits-per-sample") ? k0.R(mediaFormat.getInteger("v-bits-per-sample")) : U0(this.F0);
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.C0 && integer == 6 && (i10 = this.F0.f19940w) < 6) {
            iArr = new int[i10];
            for (int i11 = 0; i11 < this.F0.f19940w; i11++) {
                iArr[i11] = i11;
            }
        } else {
            iArr = null;
        }
        int[] iArr2 = iArr;
        try {
            AudioSink audioSink = this.f20038y0;
            Format format = this.F0;
            audioSink.configure(iR, integer, integer2, 0, iArr2, format.f19943z, format.A);
        } catch (AudioSink.ConfigurationException e10) {
            throw g(e10, this.F0);
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void m0(long j10) {
        while (this.K0 != 0 && j10 >= this.f20039z0[0]) {
            this.f20038y0.handleDiscontinuity();
            int i10 = this.K0 - 1;
            this.K0 = i10;
            long[] jArr = this.f20039z0;
            System.arraycopy(jArr, 1, jArr, 0, i10);
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void n() {
        try {
            this.J0 = -9223372036854775807L;
            this.K0 = 0;
            this.f20038y0.flush();
            try {
                super.n();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.n();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void n0(i4.e eVar) {
        if (this.H0 && !eVar.isDecodeOnly()) {
            if (Math.abs(eVar.f63713e - this.G0) > 500000) {
                this.G0 = eVar.f63713e;
            }
            this.H0 = false;
        }
        this.J0 = Math.max(eVar.f63713e, this.J0);
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void o(boolean z10) throws ExoPlaybackException {
        super.o(z10);
        this.f20037x0.k(this.f20181u0);
        int i10 = h().f60216a;
        if (i10 != 0) {
            this.f20038y0.enableTunnelingV21(i10);
        } else {
            this.f20038y0.disableTunneling();
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        super.p(j10, z10);
        this.f20038y0.flush();
        this.G0 = j10;
        this.H0 = true;
        this.I0 = true;
        this.J0 = -9223372036854775807L;
        this.K0 = 0;
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public boolean p0(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11, Format format) throws ExoPlaybackException {
        if (this.D0 && j12 == 0 && (i11 & 4) != 0) {
            long j13 = this.J0;
            if (j13 != -9223372036854775807L) {
                j12 = j13;
            }
        }
        if (this.B0 && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.f20181u0.f63706f++;
            this.f20038y0.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.f20038y0.handleBuffer(byteBuffer, j12)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            this.f20181u0.f63705e++;
            return true;
        } catch (AudioSink.InitializationException | AudioSink.WriteException e10) {
            throw g(e10, this.F0);
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void q() {
        try {
            super.q();
        } finally {
            this.f20038y0.reset();
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void r() {
        super.r();
        this.f20038y0.play();
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer, e4.e
    public void s() {
        Y0();
        this.f20038y0.pause();
        super.s();
    }

    @Override // e4.e
    public void t(Format[] formatArr, long j10) throws ExoPlaybackException {
        super.t(formatArr, j10);
        if (this.J0 != -9223372036854775807L) {
            int i10 = this.K0;
            if (i10 == this.f20039z0.length) {
                a6.m.h("MediaCodecAudioRenderer", "Too many stream changes, so dropping change at " + this.f20039z0[this.K0 - 1]);
            } else {
                this.K0 = i10 + 1;
            }
            this.f20039z0[this.K0 - 1] = this.J0;
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public void v0() throws ExoPlaybackException {
        try {
            this.f20038y0.playToEndOfStream();
        } catch (AudioSink.WriteException e10) {
            throw g(e10, this.F0);
        }
    }

    @Override // com.google.android.exoplayer.mediacodec.MediaCodecRenderer
    public int x(MediaCodec mediaCodec, com.google.android.exoplayer.mediacodec.a aVar, Format format, Format format2) {
        if (Q0(aVar, format2) <= this.A0 && format.f19943z == 0 && format.A == 0 && format2.f19943z == 0 && format2.A == 0) {
            if (aVar.o(format, format2, true)) {
                return 3;
            }
            if (M0(format, format2)) {
                return 1;
            }
        }
        return 0;
    }
}
