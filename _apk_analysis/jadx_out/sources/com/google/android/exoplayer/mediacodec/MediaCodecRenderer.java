package com.google.android.exoplayer.mediacodec;

import a6.f0;
import a6.h0;
import a6.k0;
import a6.m;
import a6.q;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.drm.DrmSession;
import com.google.android.exoplayer.mediacodec.MediaCodecUtil;
import e4.e;
import e4.k;
import i4.d;
import j4.j;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class MediaCodecRenderer extends e {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final byte[] f20151v0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    @Nullable
    public DrmSession<j> A;

    @Nullable
    public MediaCrypto B;
    public boolean C;
    public long D;
    public float E;

    @Nullable
    public MediaCodec F;

    @Nullable
    public Format G;
    public float H;

    @Nullable
    public ArrayDeque<a> I;

    @Nullable
    public DecoderInitializationException J;

    @Nullable
    public a K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public ByteBuffer[] W;
    public ByteBuffer[] X;
    public long Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f20152a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ByteBuffer f20153b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f20154c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f20155d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f20156e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f20157f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f20158g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f20159h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f20160i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f20161j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f20162k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f20163l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f20164m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f20165m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer.drm.a<j> f20166n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f20167n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20168o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f20169o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f20170p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f20171p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f20172q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f20173q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i4.e f20174r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f20175r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i4.e f20176s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f20177s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f0<Format> f20178t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f20179t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList<Long> f20180u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public d f20181u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final MediaCodec.BufferInfo f20182v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Format f20184x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Format f20185y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public DrmSession<j> f20186z;

    public static class DecoderInitializationException extends Exception {

        @Nullable
        public final a codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + format, th2, format.f19927j, z10, null, a(i10), null);
        }

        public DecoderInitializationException(Format format, Throwable th2, boolean z10, a aVar) {
            this("Decoder init failed: " + aVar.f20204a + ", " + format, th2, format.f19927j, z10, aVar, k0.f3574a >= 21 ? c(th2) : null, null);
        }

        public DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, @Nullable a aVar, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.mimeType = str2;
            this.secureDecoderRequired = z10;
            this.codecInfo = aVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }

        public static String a(int i10) {
            return "com.google.android.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        @TargetApi(21)
        public static String c(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        @CheckResult
        public final DecoderInitializationException b(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }
    }

    public MediaCodecRenderer(int i10, b bVar, @Nullable com.google.android.exoplayer.drm.a<j> aVar, boolean z10, boolean z11, float f10) {
        super(i10);
        this.f20164m = (b) a6.a.e(bVar);
        this.f20166n = aVar;
        this.f20168o = z10;
        this.f20170p = z11;
        this.f20172q = f10;
        this.f20174r = new i4.e(0);
        this.f20176s = i4.e.f();
        this.f20178t = new f0<>();
        this.f20180u = new ArrayList<>();
        this.f20182v = new MediaCodec.BufferInfo();
        this.f20157f0 = 0;
        this.f20158g0 = 0;
        this.f20159h0 = 0;
        this.H = -1.0f;
        this.E = 1.0f;
        this.D = -9223372036854775807L;
    }

    public static boolean A(String str) {
        int i10 = k0.f3574a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = k0.f3575b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean B(String str) {
        return k0.f3574a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean C(a aVar) {
        String str = aVar.f20204a;
        int i10 = k0.f3574a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ("Amazon".equals(k0.f3576c) && "AFTS".equals(k0.f3577d) && aVar.f20210g);
    }

    public static boolean D(String str) {
        int i10 = k0.f3574a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && k0.f3577d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean E(String str, Format format) {
        return k0.f3574a <= 18 && format.f19940w == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean F(String str) {
        return k0.f3577d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean G(String str) {
        return k0.f3574a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public static MediaCodec.CryptoInfo X(i4.e eVar, int i10) {
        MediaCodec.CryptoInfo cryptoInfoA = eVar.f63710b.a();
        if (i10 == 0) {
            return cryptoInfoA;
        }
        if (cryptoInfoA.numBytesOfClearData == null) {
            cryptoInfoA.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoA.numBytesOfClearData;
        iArr[0] = iArr[0] + i10;
        return cryptoInfoA;
    }

    public static boolean e0(IllegalStateException illegalStateException) {
        if (k0.f3574a >= 21 && f0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @TargetApi(21)
    public static boolean f0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean i0(DrmSession<j> drmSession, Format format) {
        j jVar = (j) drmSession.getMediaCrypto();
        if (jVar == null) {
            return true;
        }
        if (jVar.f72189c) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(jVar.f72187a, jVar.f72188b);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(format.f19927j);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public static boolean z(String str, Format format) {
        return k0.f3574a < 21 && format.f19929l.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public final void A0() {
        this.f20179t0 = true;
    }

    public final void B0(@Nullable DrmSession<j> drmSession) {
        DrmSession.a(this.A, drmSession);
        this.A = drmSession;
    }

    public final boolean C0(long j10) {
        return this.D == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.D;
    }

    public boolean D0(a aVar) {
        return true;
    }

    public final boolean E0(boolean z10) throws ExoPlaybackException {
        DrmSession<j> drmSession = this.f20186z;
        if (drmSession == null || (!z10 && (this.f20168o || drmSession.playClearSamplesWithoutKeys()))) {
            return false;
        }
        int state = this.f20186z.getState();
        if (state != 1) {
            return state != 4;
        }
        throw g(this.f20186z.getError(), this.f20184x);
    }

    public abstract int F0(b bVar, @Nullable com.google.android.exoplayer.drm.a<j> aVar, Format format) throws MediaCodecUtil.DecoderQueryException;

    public final void G0() throws ExoPlaybackException {
        if (k0.f3574a < 23) {
            return;
        }
        float fU = U(this.E, this.G, k());
        float f10 = this.H;
        if (f10 == fU) {
            return;
        }
        if (fU == -1.0f) {
            J();
            return;
        }
        if (f10 != -1.0f || fU > this.f20172q) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fU);
            this.F.setParameters(bundle);
            this.H = fU;
        }
    }

    public abstract void H(a aVar, MediaCodec mediaCodec, Format format, @Nullable MediaCrypto mediaCrypto, float f10);

    @TargetApi(23)
    public final void H0() throws ExoPlaybackException {
        j jVar = (j) this.A.getMediaCrypto();
        if (jVar == null) {
            t0();
            return;
        }
        if (k.f60171e.equals(jVar.f72187a)) {
            t0();
            return;
        }
        if (N()) {
            return;
        }
        try {
            this.B.setMediaDrmSession(jVar.f72188b);
            z0(this.A);
            this.f20158g0 = 0;
            this.f20159h0 = 0;
        } catch (MediaCryptoException e10) {
            throw g(e10, this.f20184x);
        }
    }

    public final void I() {
        if (this.f20160i0) {
            this.f20158g0 = 1;
            this.f20159h0 = 1;
        }
    }

    @Nullable
    public final Format I0(long j10) {
        Format formatH = this.f20178t.h(j10);
        if (formatH != null) {
            this.f20185y = formatH;
        }
        return formatH;
    }

    public final void J() throws ExoPlaybackException {
        if (!this.f20160i0) {
            t0();
        } else {
            this.f20158g0 = 1;
            this.f20159h0 = 3;
        }
    }

    public final void K() throws ExoPlaybackException {
        if (k0.f3574a < 23) {
            J();
        } else if (!this.f20160i0) {
            H0();
        } else {
            this.f20158g0 = 1;
            this.f20159h0 = 2;
        }
    }

    public final boolean L(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        boolean zP0;
        MediaCodec mediaCodec;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int iDequeueOutputBuffer;
        if (!b0()) {
            if (this.R && this.f20161j0) {
                try {
                    iDequeueOutputBuffer = this.F.dequeueOutputBuffer(this.f20182v, W());
                } catch (IllegalStateException unused) {
                    o0();
                    if (this.f20169o0) {
                        u0();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.F.dequeueOutputBuffer(this.f20182v, W());
            }
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    r0();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    q0();
                    return true;
                }
                if (this.V && (this.f20167n0 || this.f20158g0 == 2)) {
                    o0();
                }
                return false;
            }
            if (this.U) {
                this.U = false;
                this.F.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f20182v;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                o0();
                return false;
            }
            this.f20152a0 = iDequeueOutputBuffer;
            ByteBuffer byteBufferZ = Z(iDequeueOutputBuffer);
            this.f20153b0 = byteBufferZ;
            if (byteBufferZ != null) {
                byteBufferZ.position(this.f20182v.offset);
                ByteBuffer byteBuffer2 = this.f20153b0;
                MediaCodec.BufferInfo bufferInfo3 = this.f20182v;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            this.f20154c0 = d0(this.f20182v.presentationTimeUs);
            long j12 = this.f20165m0;
            long j13 = this.f20182v.presentationTimeUs;
            this.f20155d0 = j12 == j13;
            I0(j13);
        }
        if (this.R && this.f20161j0) {
            try {
                mediaCodec = this.F;
                byteBuffer = this.f20153b0;
                i10 = this.f20152a0;
                bufferInfo = this.f20182v;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                zP0 = p0(j10, j11, mediaCodec, byteBuffer, i10, bufferInfo.flags, bufferInfo.presentationTimeUs, this.f20154c0, this.f20155d0, this.f20185y);
            } catch (IllegalStateException unused3) {
                o0();
                if (this.f20169o0) {
                    u0();
                }
                return z10;
            }
        } else {
            z10 = false;
            MediaCodec mediaCodec2 = this.F;
            ByteBuffer byteBuffer3 = this.f20153b0;
            int i11 = this.f20152a0;
            MediaCodec.BufferInfo bufferInfo4 = this.f20182v;
            zP0 = p0(j10, j11, mediaCodec2, byteBuffer3, i11, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f20154c0, this.f20155d0, this.f20185y);
        }
        if (zP0) {
            m0(this.f20182v.presentationTimeUs);
            boolean z11 = (this.f20182v.flags & 4) != 0 ? true : z10;
            y0();
            if (!z11) {
                return true;
            }
            o0();
        }
        return z10;
    }

    public final boolean M() throws ExoPlaybackException {
        int iPosition;
        int iU;
        MediaCodec mediaCodec = this.F;
        if (mediaCodec == null || this.f20158g0 == 2 || this.f20167n0) {
            return false;
        }
        if (this.Z < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.Z = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            this.f20174r.f63711c = Y(iDequeueInputBuffer);
            this.f20174r.clear();
        }
        if (this.f20158g0 == 1) {
            if (!this.V) {
                this.f20161j0 = true;
                this.F.queueInputBuffer(this.Z, 0, 0, 0L, 4);
                x0();
            }
            this.f20158g0 = 2;
            return false;
        }
        if (this.T) {
            this.T = false;
            ByteBuffer byteBuffer = this.f20174r.f63711c;
            byte[] bArr = f20151v0;
            byteBuffer.put(bArr);
            this.F.queueInputBuffer(this.Z, 0, bArr.length, 0L, 0);
            x0();
            this.f20160i0 = true;
            return true;
        }
        e4.f0 f0VarI = i();
        if (this.f20171p0) {
            iU = -4;
            iPosition = 0;
        } else {
            if (this.f20157f0 == 1) {
                for (int i10 = 0; i10 < this.G.f19929l.size(); i10++) {
                    this.f20174r.f63711c.put(this.G.f19929l.get(i10));
                }
                this.f20157f0 = 2;
            }
            iPosition = this.f20174r.f63711c.position();
            iU = u(f0VarI, this.f20174r, false);
        }
        if (hasReadStreamToEnd()) {
            this.f20165m0 = this.f20163l0;
        }
        if (iU == -3) {
            return false;
        }
        if (iU == -5) {
            if (this.f20157f0 == 2) {
                this.f20174r.clear();
                this.f20157f0 = 1;
            }
            k0(f0VarI);
            return true;
        }
        if (this.f20174r.isEndOfStream()) {
            if (this.f20157f0 == 2) {
                this.f20174r.clear();
                this.f20157f0 = 1;
            }
            this.f20167n0 = true;
            if (!this.f20160i0) {
                o0();
                return false;
            }
            try {
                if (!this.V) {
                    this.f20161j0 = true;
                    this.F.queueInputBuffer(this.Z, 0, 0, 0L, 4);
                    x0();
                }
                return false;
            } catch (MediaCodec.CryptoException e10) {
                throw g(e10, this.f20184x);
            }
        }
        if (this.f20173q0 && !this.f20174r.isKeyFrame()) {
            this.f20174r.clear();
            if (this.f20157f0 == 2) {
                this.f20157f0 = 1;
            }
            return true;
        }
        this.f20173q0 = false;
        boolean zD = this.f20174r.d();
        boolean zE0 = E0(zD);
        this.f20171p0 = zE0;
        if (zE0) {
            return false;
        }
        if (this.N && !zD) {
            q.b(this.f20174r.f63711c);
            if (this.f20174r.f63711c.position() == 0) {
                return true;
            }
            this.N = false;
        }
        try {
            i4.e eVar = this.f20174r;
            long j10 = eVar.f63713e;
            if (eVar.isDecodeOnly()) {
                this.f20180u.add(Long.valueOf(j10));
            }
            if (this.f20175r0) {
                this.f20178t.a(j10, this.f20184x);
                this.f20175r0 = false;
            }
            this.f20163l0 = Math.max(this.f20163l0, j10);
            this.f20174r.c();
            if (this.f20174r.hasSupplementalData()) {
                a0(this.f20174r);
            }
            n0(this.f20174r);
            if (zD) {
                this.F.queueSecureInputBuffer(this.Z, 0, X(this.f20174r, iPosition), j10, 0);
            } else {
                this.F.queueInputBuffer(this.Z, 0, this.f20174r.f63711c.limit(), j10, 0);
            }
            x0();
            this.f20160i0 = true;
            this.f20157f0 = 0;
            this.f20181u0.f63703c++;
            return true;
        } catch (MediaCodec.CryptoException e11) {
            throw g(e11, this.f20184x);
        }
    }

    public final boolean N() throws ExoPlaybackException {
        boolean zO = O();
        if (zO) {
            g0();
        }
        return zO;
    }

    public boolean O() {
        MediaCodec mediaCodec = this.F;
        if (mediaCodec == null) {
            return false;
        }
        if (this.f20159h0 == 3 || this.O || ((this.P && !this.f20162k0) || (this.Q && this.f20161j0))) {
            u0();
            return true;
        }
        mediaCodec.flush();
        x0();
        y0();
        this.Y = -9223372036854775807L;
        this.f20161j0 = false;
        this.f20160i0 = false;
        this.f20173q0 = true;
        this.T = false;
        this.U = false;
        this.f20154c0 = false;
        this.f20155d0 = false;
        this.f20171p0 = false;
        this.f20180u.clear();
        this.f20163l0 = -9223372036854775807L;
        this.f20165m0 = -9223372036854775807L;
        this.f20158g0 = 0;
        this.f20159h0 = 0;
        this.f20157f0 = this.f20156e0 ? 1 : 0;
        return false;
    }

    public final List<a> P(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        List<a> listV = V(this.f20164m, this.f20184x, z10);
        if (listV.isEmpty() && z10) {
            listV = V(this.f20164m, this.f20184x, false);
            if (!listV.isEmpty()) {
                m.h("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f20184x.f19927j + ", but no secure decoder available. Trying to proceed with " + listV + ".");
            }
        }
        return listV;
    }

    public final MediaCodec Q() {
        return this.F;
    }

    public final void R(MediaCodec mediaCodec) {
        if (k0.f3574a < 21) {
            this.W = mediaCodec.getInputBuffers();
            this.X = mediaCodec.getOutputBuffers();
        }
    }

    @Nullable
    public final a S() {
        return this.K;
    }

    public boolean T() {
        return false;
    }

    public abstract float U(float f10, Format format, Format[] formatArr);

    public abstract List<a> V(b bVar, Format format, boolean z10) throws MediaCodecUtil.DecoderQueryException;

    public long W() {
        return 0L;
    }

    public final ByteBuffer Y(int i10) {
        return k0.f3574a >= 21 ? this.F.getInputBuffer(i10) : this.W[i10];
    }

    public final ByteBuffer Z(int i10) {
        return k0.f3574a >= 21 ? this.F.getOutputBuffer(i10) : this.X[i10];
    }

    @Override // e4.q0
    public final int a(Format format) throws ExoPlaybackException {
        try {
            return F0(this.f20164m, this.f20166n, format);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw g(e10, format);
        }
    }

    public void a0(i4.e eVar) throws ExoPlaybackException {
    }

    public final boolean b0() {
        return this.f20152a0 >= 0;
    }

    @Override // e4.p0
    public final void c(float f10) throws ExoPlaybackException {
        this.E = f10;
        if (this.F == null || this.f20159h0 == 3 || getState() == 0) {
            return;
        }
        G0();
    }

    public final void c0(a aVar, MediaCrypto mediaCrypto) throws Exception {
        long jElapsedRealtime;
        MediaCodec mediaCodecCreateByCodecName;
        String str = aVar.f20204a;
        float fU = k0.f3574a < 23 ? -1.0f : U(this.E, this.f20184x, k());
        float f10 = fU <= this.f20172q ? -1.0f : fU;
        MediaCodec mediaCodec = null;
        try {
            jElapsedRealtime = SystemClock.elapsedRealtime();
            h0.a("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        } catch (Exception e10) {
            e = e10;
        }
        try {
            h0.c();
            h0.a("configureCodec");
            H(aVar, mediaCodecCreateByCodecName, this.f20184x, mediaCrypto, f10);
            h0.c();
            h0.a("startCodec");
            mediaCodecCreateByCodecName.start();
            h0.c();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            R(mediaCodecCreateByCodecName);
            this.F = mediaCodecCreateByCodecName;
            this.K = aVar;
            this.H = f10;
            this.G = this.f20184x;
            this.L = y(str);
            this.M = F(str);
            this.N = z(str, this.G);
            this.O = D(str);
            this.P = G(str);
            this.Q = A(str);
            this.R = B(str);
            this.S = E(str, this.G);
            this.V = C(aVar) || T();
            x0();
            y0();
            this.Y = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.f20156e0 = false;
            this.f20157f0 = 0;
            this.f20161j0 = false;
            this.f20160i0 = false;
            this.f20163l0 = -9223372036854775807L;
            this.f20165m0 = -9223372036854775807L;
            this.f20158g0 = 0;
            this.f20159h0 = 0;
            this.T = false;
            this.U = false;
            this.f20154c0 = false;
            this.f20155d0 = false;
            this.f20173q0 = true;
            this.f20181u0.f63701a++;
            j0(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Exception e11) {
            e = e11;
            mediaCodec = mediaCodecCreateByCodecName;
            if (mediaCodec != null) {
                w0();
                mediaCodec.release();
            }
            throw e;
        }
    }

    public final boolean d0(long j10) {
        int size = this.f20180u.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f20180u.get(i10).longValue() == j10) {
                this.f20180u.remove(i10);
                return true;
            }
        }
        return false;
    }

    public final void g0() throws ExoPlaybackException {
        if (this.F != null || this.f20184x == null) {
            return;
        }
        z0(this.A);
        String str = this.f20184x.f19927j;
        DrmSession<j> drmSession = this.f20186z;
        if (drmSession != null) {
            if (this.B == null) {
                j jVar = (j) drmSession.getMediaCrypto();
                if (jVar != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(jVar.f72187a, jVar.f72188b);
                        this.B = mediaCrypto;
                        this.C = !jVar.f72189c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw g(e10, this.f20184x);
                    }
                } else if (this.f20186z.getError() == null) {
                    return;
                }
            }
            if (j.f72186d) {
                int state = this.f20186z.getState();
                if (state == 1) {
                    throw g(this.f20186z.getError(), this.f20184x);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            h0(this.B, this.C);
        } catch (DecoderInitializationException e11) {
            throw g(e11, this.f20184x);
        }
    }

    public final void h0(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException {
        if (this.I == null) {
            try {
                List<a> listP = P(z10);
                ArrayDeque<a> arrayDeque = new ArrayDeque<>();
                this.I = arrayDeque;
                if (this.f20170p) {
                    arrayDeque.addAll(listP);
                } else if (!listP.isEmpty()) {
                    this.I.add(listP.get(0));
                }
                this.J = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(this.f20184x, e10, z10, -49998);
            }
        }
        if (this.I.isEmpty()) {
            throw new DecoderInitializationException(this.f20184x, (Throwable) null, z10, -49999);
        }
        while (this.F == null) {
            a aVarPeekFirst = this.I.peekFirst();
            if (!D0(aVarPeekFirst)) {
                return;
            }
            try {
                c0(aVarPeekFirst, mediaCrypto);
            } catch (Exception e11) {
                m.i("MediaCodecRenderer", "Failed to initialize decoder: " + aVarPeekFirst, e11);
                this.I.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.f20184x, e11, z10, aVarPeekFirst);
                if (this.J == null) {
                    this.J = decoderInitializationException;
                } else {
                    this.J = this.J.b(decoderInitializationException);
                }
                if (this.I.isEmpty()) {
                    throw this.J;
                }
            }
        }
        this.I = null;
    }

    @Override // e4.p0
    public boolean isEnded() {
        return this.f20169o0;
    }

    @Override // e4.p0
    public boolean isReady() {
        return (this.f20184x == null || this.f20171p0 || (!m() && !b0() && (this.Y == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.Y))) ? false : true;
    }

    public abstract void j0(String str, long j10, long j11);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k0(e4.f0 r5) throws com.google.android.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.mediacodec.MediaCodecRenderer.k0(e4.f0):void");
    }

    public abstract void l0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException;

    public abstract void m0(long j10);

    @Override // e4.e
    public void n() {
        this.f20184x = null;
        if (this.A == null && this.f20186z == null) {
            O();
        } else {
            q();
        }
    }

    public abstract void n0(i4.e eVar);

    @Override // e4.e
    public void o(boolean z10) throws ExoPlaybackException {
        com.google.android.exoplayer.drm.a<j> aVar = this.f20166n;
        if (aVar != null && !this.f20183w) {
            this.f20183w = true;
            aVar.prepare();
        }
        this.f20181u0 = new d();
    }

    public final void o0() throws ExoPlaybackException {
        int i10 = this.f20159h0;
        if (i10 == 1) {
            N();
            return;
        }
        if (i10 == 2) {
            H0();
        } else if (i10 == 3) {
            t0();
        } else {
            this.f20169o0 = true;
            v0();
        }
    }

    @Override // e4.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        this.f20167n0 = false;
        this.f20169o0 = false;
        this.f20179t0 = false;
        N();
        this.f20178t.c();
    }

    public abstract boolean p0(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11, Format format) throws ExoPlaybackException;

    @Override // e4.e
    public void q() {
        try {
            u0();
            B0(null);
            com.google.android.exoplayer.drm.a<j> aVar = this.f20166n;
            if (aVar == null || !this.f20183w) {
                return;
            }
            this.f20183w = false;
            aVar.release();
        } catch (Throwable th2) {
            B0(null);
            throw th2;
        }
    }

    public final void q0() {
        if (k0.f3574a < 21) {
            this.X = this.F.getOutputBuffers();
        }
    }

    @Override // e4.e
    public void r() {
    }

    public final void r0() throws ExoPlaybackException {
        this.f20162k0 = true;
        MediaFormat outputFormat = this.F.getOutputFormat();
        if (this.L != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.U = true;
            return;
        }
        if (this.S) {
            outputFormat.setInteger("channel-count", 1);
        }
        l0(this.F, outputFormat);
    }

    @Override // e4.p0
    public void render(long j10, long j11) throws ExoPlaybackException {
        if (this.f20179t0) {
            this.f20179t0 = false;
            o0();
        }
        try {
            if (this.f20169o0) {
                v0();
                return;
            }
            if (this.f20184x != null || s0(true)) {
                g0();
                if (this.F != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    h0.a("drainAndFeed");
                    while (L(j10, j11)) {
                    }
                    while (M() && C0(jElapsedRealtime)) {
                    }
                    h0.c();
                } else {
                    this.f20181u0.f63704d += v(j10);
                    s0(false);
                }
                this.f20181u0.a();
            }
        } catch (IllegalStateException e10) {
            if (!e0(e10)) {
                throw e10;
            }
            throw g(e10, this.f20184x);
        }
    }

    @Override // e4.e
    public void s() {
    }

    public final boolean s0(boolean z10) throws ExoPlaybackException {
        e4.f0 f0VarI = i();
        this.f20176s.clear();
        int iU = u(f0VarI, this.f20176s, z10);
        if (iU == -5) {
            k0(f0VarI);
            return true;
        }
        if (iU != -4 || !this.f20176s.isEndOfStream()) {
            return false;
        }
        this.f20167n0 = true;
        o0();
        return false;
    }

    @Override // e4.e, e4.q0
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public final void t0() throws ExoPlaybackException {
        u0();
        g0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void u0() {
        this.I = null;
        this.K = null;
        this.G = null;
        this.f20162k0 = false;
        x0();
        y0();
        w0();
        this.f20171p0 = false;
        this.Y = -9223372036854775807L;
        this.f20180u.clear();
        this.f20163l0 = -9223372036854775807L;
        this.f20165m0 = -9223372036854775807L;
        try {
            MediaCodec mediaCodec = this.F;
            if (mediaCodec != null) {
                this.f20181u0.f63702b++;
                try {
                    if (!this.f20177s0) {
                        mediaCodec.stop();
                    }
                    this.F.release();
                } catch (Throwable th2) {
                    this.F.release();
                    throw th2;
                }
            }
            this.F = null;
            try {
                MediaCrypto mediaCrypto = this.B;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th3) {
            this.F = null;
            try {
                MediaCrypto mediaCrypto2 = this.B;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th3;
            } finally {
            }
        }
    }

    public void v0() throws ExoPlaybackException {
    }

    public final void w0() {
        if (k0.f3574a < 21) {
            this.W = null;
            this.X = null;
        }
    }

    public abstract int x(MediaCodec mediaCodec, a aVar, Format format, Format format2);

    public final void x0() {
        this.Z = -1;
        this.f20174r.f63711c = null;
    }

    public final int y(String str) {
        int i10 = k0.f3574a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = k0.f3577d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = k0.f3575b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public final void y0() {
        this.f20152a0 = -1;
        this.f20153b0 = null;
    }

    public final void z0(@Nullable DrmSession<j> drmSession) {
        DrmSession.a(this.f20186z, drmSession);
        this.f20186z = drmSession;
    }
}
