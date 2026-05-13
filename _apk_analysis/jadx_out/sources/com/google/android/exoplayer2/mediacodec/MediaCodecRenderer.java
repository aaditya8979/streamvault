package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.c;
import d6.z0;
import e6.s1;
import h6.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import s7.i0;
import s7.k0;
import s7.m0;
import s7.q;
import s7.v;
import u6.g;
import u6.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.e {
    public static final byte[] G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final long[] A;
    public boolean A0;
    public final long[] B;

    @Nullable
    public ExoPlaybackException B0;

    @Nullable
    public m C;
    public g6.e C0;

    @Nullable
    public m D;
    public long D0;

    @Nullable
    public DrmSession E;
    public long E0;

    @Nullable
    public DrmSession F;
    public int F0;

    @Nullable
    public MediaCrypto G;
    public boolean H;
    public long I;
    public float J;
    public float K;

    @Nullable
    public c L;

    @Nullable
    public m M;

    @Nullable
    public MediaFormat N;
    public boolean O;
    public float P;

    @Nullable
    public ArrayDeque<d> Q;

    @Nullable
    public DecoderInitializationException R;

    @Nullable
    public d S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f21791a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f21792b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f21793c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f21794d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @Nullable
    public h f21795e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f21796f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f21797g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f21798h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @Nullable
    public ByteBuffer f21799i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f21800j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f21801k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f21802l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f21803m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f21804n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c.b f21805o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f21806o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f21807p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f21808p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f21809q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f21810q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f21811r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f21812r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DecoderInputBuffer f21813s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f21814s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DecoderInputBuffer f21815t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f21816t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final DecoderInputBuffer f21817u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f21818u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g f21819v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f21820v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i0<m> f21821w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public long f21822w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList<Long> f21823x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f21824x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final MediaCodec.BufferInfo f21825y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f21826y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long[] f21827z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f21828z0;

    public static class DecoderInitializationException extends Exception {

        @Nullable
        public final d codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(m mVar, @Nullable Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + mVar, th2, mVar.f21751m, z10, null, a(i10), null);
        }

        public DecoderInitializationException(m mVar, @Nullable Throwable th2, boolean z10, d dVar) {
            this("Decoder init failed: " + dVar.f21854a + ", " + mVar, th2, mVar.f21751m, z10, dVar, m0.f79487a >= 21 ? c(th2) : null, null);
        }

        public DecoderInitializationException(String str, @Nullable Throwable th2, String str2, boolean z10, @Nullable d dVar, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.mimeType = str2;
            this.secureDecoderRequired = z10;
            this.codecInfo = dVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }

        public static String a(int i10) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        @Nullable
        @RequiresApi(21)
        public static String c(@Nullable Throwable th2) {
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

    @RequiresApi(31)
    public static final class a {
        @DoNotInline
        public static void a(c.a aVar, s1 s1Var) {
            LogSessionId logSessionIdA = s1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f21849b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    public MediaCodecRenderer(int i10, c.b bVar, e eVar, boolean z10, float f10) {
        super(i10);
        this.f21805o = bVar;
        this.f21807p = (e) s7.a.e(eVar);
        this.f21809q = z10;
        this.f21811r = f10;
        this.f21813s = DecoderInputBuffer.p();
        this.f21815t = new DecoderInputBuffer(0);
        this.f21817u = new DecoderInputBuffer(2);
        g gVar = new g();
        this.f21819v = gVar;
        this.f21821w = new i0<>();
        this.f21823x = new ArrayList<>();
        this.f21825y = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = -9223372036854775807L;
        this.f21827z = new long[10];
        this.A = new long[10];
        this.B = new long[10];
        this.D0 = -9223372036854775807L;
        K0(-9223372036854775807L);
        gVar.m(0);
        gVar.f21430d.order(ByteOrder.nativeOrder());
        this.P = -1.0f;
        this.T = 0;
        this.f21808p0 = 0;
        this.f21797g0 = -1;
        this.f21798h0 = -1;
        this.f21796f0 = -9223372036854775807L;
        this.f21820v0 = -9223372036854775807L;
        this.f21822w0 = -9223372036854775807L;
        this.f21810q0 = 0;
        this.f21812r0 = 0;
    }

    public static boolean B(String str, m mVar) {
        return m0.f79487a < 21 && mVar.f21753o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean C(String str) {
        if (m0.f79487a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(m0.f79489c)) {
            String str2 = m0.f79488b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean D(String str) {
        int i10 = m0.f79487a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = m0.f79488b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean E(String str) {
        return m0.f79487a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean F(d dVar) {
        String str = dVar.f21854a;
        int i10 = m0.f79487a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(m0.f79489c) && "AFTS".equals(m0.f79490d) && dVar.f21860g));
    }

    public static boolean G(String str) {
        int i10 = m0.f79487a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && m0.f79490d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean H(String str, m mVar) {
        return m0.f79487a <= 18 && mVar.f21764z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean I(String str) {
        return m0.f79487a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public static boolean T0(m mVar) {
        int i10 = mVar.F;
        return i10 == 0 || i10 == 2;
    }

    public static boolean k0(IllegalStateException illegalStateException) {
        if (m0.f79487a >= 21 && l0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @RequiresApi(21)
    public static boolean l0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @RequiresApi(21)
    public static boolean m0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    public final int A(String str) {
        int i10 = m0.f79487a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = m0.f79490d;
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
        String str3 = m0.f79488b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public final void A0() {
        this.f21818u0 = true;
        MediaFormat outputFormat = this.L.getOutputFormat();
        if (this.T != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f21793c0 = true;
            return;
        }
        if (this.f21791a0) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.N = outputFormat;
        this.O = true;
    }

    public final boolean B0(int i10) throws ExoPlaybackException {
        z0 z0VarI = i();
        this.f21813s.b();
        int iU = u(z0VarI, this.f21813s, i10 | 4);
        if (iU == -5) {
            s0(z0VarI);
            return true;
        }
        if (iU != -4 || !this.f21813s.g()) {
            return false;
        }
        this.f21824x0 = true;
        y0();
        return false;
    }

    public final void C0() throws ExoPlaybackException {
        D0();
        n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void D0() {
        try {
            c cVar = this.L;
            if (cVar != null) {
                cVar.release();
                this.C0.f62097b++;
                r0(this.S.f21854a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.G;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.G;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void E0() throws ExoPlaybackException {
    }

    @CallSuper
    public void F0() {
        H0();
        I0();
        this.f21796f0 = -9223372036854775807L;
        this.f21816t0 = false;
        this.f21814s0 = false;
        this.f21792b0 = false;
        this.f21793c0 = false;
        this.f21800j0 = false;
        this.f21801k0 = false;
        this.f21823x.clear();
        this.f21820v0 = -9223372036854775807L;
        this.f21822w0 = -9223372036854775807L;
        h hVar = this.f21795e0;
        if (hVar != null) {
            hVar.c();
        }
        this.f21810q0 = 0;
        this.f21812r0 = 0;
        this.f21808p0 = this.f21806o0 ? 1 : 0;
    }

    @CallSuper
    public void G0() {
        F0();
        this.B0 = null;
        this.f21795e0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.f21818u0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f21791a0 = false;
        this.f21794d0 = false;
        this.f21806o0 = false;
        this.f21808p0 = 0;
        this.H = false;
    }

    public final void H0() {
        this.f21797g0 = -1;
        this.f21815t.f21430d = null;
    }

    public final void I0() {
        this.f21798h0 = -1;
        this.f21799i0 = null;
    }

    public MediaCodecDecoderException J(Throwable th2, @Nullable d dVar) {
        return new MediaCodecDecoderException(th2, dVar);
    }

    public final void J0(@Nullable DrmSession drmSession) {
        DrmSession.b(this.E, drmSession);
        this.E = drmSession;
    }

    public final void K() {
        this.f21804n0 = false;
        this.f21819v.b();
        this.f21817u.b();
        this.f21803m0 = false;
        this.f21802l0 = false;
    }

    public final void K0(long j10) {
        this.E0 = j10;
        if (j10 != -9223372036854775807L) {
            u0(j10);
        }
    }

    public final boolean L() {
        if (this.f21814s0) {
            this.f21810q0 = 1;
            if (this.V || this.X) {
                this.f21812r0 = 3;
                return false;
            }
            this.f21812r0 = 1;
        }
        return true;
    }

    public final void L0() {
        this.A0 = true;
    }

    public final void M() throws ExoPlaybackException {
        if (!this.f21814s0) {
            C0();
        } else {
            this.f21810q0 = 1;
            this.f21812r0 = 3;
        }
    }

    public final void M0(ExoPlaybackException exoPlaybackException) {
        this.B0 = exoPlaybackException;
    }

    @TargetApi(23)
    public final boolean N() throws ExoPlaybackException {
        if (this.f21814s0) {
            this.f21810q0 = 1;
            if (this.V || this.X) {
                this.f21812r0 = 3;
                return false;
            }
            this.f21812r0 = 2;
        } else {
            V0();
        }
        return true;
    }

    public final void N0(@Nullable DrmSession drmSession) {
        DrmSession.b(this.F, drmSession);
        this.F = drmSession;
    }

    public final boolean O(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        boolean zZ0;
        c cVar;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int iDequeueOutputBufferIndex;
        if (!g0()) {
            if (this.Y && this.f21816t0) {
                try {
                    iDequeueOutputBufferIndex = this.L.dequeueOutputBufferIndex(this.f21825y);
                } catch (IllegalStateException unused) {
                    y0();
                    if (this.f21826y0) {
                        D0();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = this.L.dequeueOutputBufferIndex(this.f21825y);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    A0();
                    return true;
                }
                if (this.f21794d0 && (this.f21824x0 || this.f21810q0 == 2)) {
                    y0();
                }
                return false;
            }
            if (this.f21793c0) {
                this.f21793c0 = false;
                this.L.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f21825y;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                y0();
                return false;
            }
            this.f21798h0 = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = this.L.getOutputBuffer(iDequeueOutputBufferIndex);
            this.f21799i0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f21825y.offset);
                ByteBuffer byteBuffer2 = this.f21799i0;
                MediaCodec.BufferInfo bufferInfo3 = this.f21825y;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.Z) {
                MediaCodec.BufferInfo bufferInfo4 = this.f21825y;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j12 = this.f21820v0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo4.presentationTimeUs = j12;
                    }
                }
            }
            this.f21800j0 = j0(this.f21825y.presentationTimeUs);
            long j13 = this.f21822w0;
            long j14 = this.f21825y.presentationTimeUs;
            this.f21801k0 = j13 == j14;
            W0(j14);
        }
        if (this.Y && this.f21816t0) {
            try {
                cVar = this.L;
                byteBuffer = this.f21799i0;
                i10 = this.f21798h0;
                bufferInfo = this.f21825y;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                zZ0 = z0(j10, j11, cVar, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f21800j0, this.f21801k0, this.D);
            } catch (IllegalStateException unused3) {
                y0();
                if (this.f21826y0) {
                    D0();
                }
                return z10;
            }
        } else {
            z10 = false;
            c cVar2 = this.L;
            ByteBuffer byteBuffer3 = this.f21799i0;
            int i11 = this.f21798h0;
            MediaCodec.BufferInfo bufferInfo5 = this.f21825y;
            zZ0 = z0(j10, j11, cVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f21800j0, this.f21801k0, this.D);
        }
        if (zZ0) {
            v0(this.f21825y.presentationTimeUs);
            boolean z11 = (this.f21825y.flags & 4) != 0 ? true : z10;
            I0();
            if (!z11) {
                return true;
            }
            y0();
        }
        return z10;
    }

    public final boolean O0(long j10) {
        return this.I == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.I;
    }

    public final boolean P(d dVar, m mVar, @Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) throws ExoPlaybackException {
        r rVarB0;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 == null || drmSession == null || !drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid()) || m0.f79487a < 23) {
            return true;
        }
        UUID uuid = d6.c.f59585e;
        if (uuid.equals(drmSession.getSchemeUuid()) || uuid.equals(drmSession2.getSchemeUuid()) || (rVarB0 = b0(drmSession2)) == null) {
            return true;
        }
        return !dVar.f21860g && (rVarB0.f63008c ? false : drmSession2.requiresSecureDecoder(mVar.f21751m));
    }

    public boolean P0(d dVar) {
        return true;
    }

    public final boolean Q() throws ExoPlaybackException {
        int i10;
        if (this.L == null || (i10 = this.f21810q0) == 2 || this.f21824x0) {
            return false;
        }
        if (i10 == 0 && Q0()) {
            M();
        }
        if (this.f21797g0 < 0) {
            int iDequeueInputBufferIndex = this.L.dequeueInputBufferIndex();
            this.f21797g0 = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.f21815t.f21430d = this.L.getInputBuffer(iDequeueInputBufferIndex);
            this.f21815t.b();
        }
        if (this.f21810q0 == 1) {
            if (!this.f21794d0) {
                this.f21816t0 = true;
                this.L.queueInputBuffer(this.f21797g0, 0, 0, 0L, 4);
                H0();
            }
            this.f21810q0 = 2;
            return false;
        }
        if (this.f21792b0) {
            this.f21792b0 = false;
            ByteBuffer byteBuffer = this.f21815t.f21430d;
            byte[] bArr = G0;
            byteBuffer.put(bArr);
            this.L.queueInputBuffer(this.f21797g0, 0, bArr.length, 0L, 0);
            H0();
            this.f21814s0 = true;
            return true;
        }
        if (this.f21808p0 == 1) {
            for (int i11 = 0; i11 < this.M.f21753o.size(); i11++) {
                this.f21815t.f21430d.put(this.M.f21753o.get(i11));
            }
            this.f21808p0 = 2;
        }
        int iPosition = this.f21815t.f21430d.position();
        z0 z0VarI = i();
        try {
            int iU = u(z0VarI, this.f21815t, 0);
            if (hasReadStreamToEnd()) {
                this.f21822w0 = this.f21820v0;
            }
            if (iU == -3) {
                return false;
            }
            if (iU == -5) {
                if (this.f21808p0 == 2) {
                    this.f21815t.b();
                    this.f21808p0 = 1;
                }
                s0(z0VarI);
                return true;
            }
            if (this.f21815t.g()) {
                if (this.f21808p0 == 2) {
                    this.f21815t.b();
                    this.f21808p0 = 1;
                }
                this.f21824x0 = true;
                if (!this.f21814s0) {
                    y0();
                    return false;
                }
                try {
                    if (!this.f21794d0) {
                        this.f21816t0 = true;
                        this.L.queueInputBuffer(this.f21797g0, 0, 0, 0L, 4);
                        H0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw f(e10, this.C, m0.P(e10.getErrorCode()));
                }
            }
            if (!this.f21814s0 && !this.f21815t.j()) {
                this.f21815t.b();
                if (this.f21808p0 == 2) {
                    this.f21808p0 = 1;
                }
                return true;
            }
            boolean zO = this.f21815t.o();
            if (zO) {
                this.f21815t.f21429c.b(iPosition);
            }
            if (this.U && !zO) {
                v.b(this.f21815t.f21430d);
                if (this.f21815t.f21430d.position() == 0) {
                    return true;
                }
                this.U = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.f21815t;
            long jD = decoderInputBuffer.f21432f;
            h hVar = this.f21795e0;
            if (hVar != null) {
                jD = hVar.d(this.C, decoderInputBuffer);
                this.f21820v0 = Math.max(this.f21820v0, this.f21795e0.b(this.C));
            }
            long j10 = jD;
            if (this.f21815t.f()) {
                this.f21823x.add(Long.valueOf(j10));
            }
            if (this.f21828z0) {
                this.f21821w.a(j10, this.C);
                this.f21828z0 = false;
            }
            this.f21820v0 = Math.max(this.f21820v0, j10);
            this.f21815t.n();
            if (this.f21815t.e()) {
                f0(this.f21815t);
            }
            x0(this.f21815t);
            try {
                if (zO) {
                    this.L.b(this.f21797g0, 0, this.f21815t.f21429c, j10, 0);
                } else {
                    this.L.queueInputBuffer(this.f21797g0, 0, this.f21815t.f21430d.limit(), j10, 0);
                }
                H0();
                this.f21814s0 = true;
                this.f21808p0 = 0;
                this.C0.f62098c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw f(e11, this.C, m0.P(e11.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e12) {
            p0(e12);
            B0(0);
            R();
            return true;
        }
    }

    public boolean Q0() {
        return false;
    }

    public final void R() {
        try {
            this.L.flush();
        } finally {
            F0();
        }
    }

    public boolean R0(m mVar) {
        return false;
    }

    public final boolean S() throws ExoPlaybackException {
        boolean zT = T();
        if (zT) {
            n0();
        }
        return zT;
    }

    public abstract int S0(e eVar, m mVar) throws MediaCodecUtil.DecoderQueryException;

    public boolean T() {
        if (this.L == null) {
            return false;
        }
        int i10 = this.f21812r0;
        if (i10 == 3 || this.V || ((this.W && !this.f21818u0) || (this.X && this.f21816t0))) {
            D0();
            return true;
        }
        if (i10 == 2) {
            int i11 = m0.f79487a;
            s7.a.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    V0();
                } catch (ExoPlaybackException e10) {
                    q.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    D0();
                    return true;
                }
            }
        }
        R();
        return false;
    }

    public final List<d> U(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        List<d> listA0 = a0(this.f21807p, this.C, z10);
        if (listA0.isEmpty() && z10) {
            listA0 = a0(this.f21807p, this.C, false);
            if (!listA0.isEmpty()) {
                q.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.C.f21751m + ", but no secure decoder available. Trying to proceed with " + listA0 + ".");
            }
        }
        return listA0;
    }

    public final boolean U0(m mVar) throws ExoPlaybackException {
        if (m0.f79487a >= 23 && this.L != null && this.f21812r0 != 3 && getState() != 0) {
            float fY = Y(this.K, mVar, l());
            float f10 = this.P;
            if (f10 == fY) {
                return true;
            }
            if (fY == -1.0f) {
                M();
                return false;
            }
            if (f10 == -1.0f && fY <= this.f21811r) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fY);
            this.L.setParameters(bundle);
            this.P = fY;
        }
        return true;
    }

    @Nullable
    public final c V() {
        return this.L;
    }

    @RequiresApi(23)
    public final void V0() throws ExoPlaybackException {
        try {
            this.G.setMediaDrmSession(b0(this.F).f63007b);
            J0(this.F);
            this.f21810q0 = 0;
            this.f21812r0 = 0;
        } catch (MediaCryptoException e10) {
            throw f(e10, this.C, 6006);
        }
    }

    @Nullable
    public final d W() {
        return this.S;
    }

    public final void W0(long j10) throws ExoPlaybackException {
        boolean z10;
        m mVarJ = this.f21821w.j(j10);
        if (mVarJ == null && this.O) {
            mVarJ = this.f21821w.i();
        }
        if (mVarJ != null) {
            this.D = mVarJ;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.O && this.D != null)) {
            t0(this.D, this.N);
            this.O = false;
        }
    }

    public boolean X() {
        return false;
    }

    public abstract float Y(float f10, m mVar, m[] mVarArr);

    @Nullable
    public final MediaFormat Z() {
        return this.N;
    }

    @Override // d6.u1
    public final int a(m mVar) throws ExoPlaybackException {
        try {
            return S0(this.f21807p, mVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw f(e10, mVar, 4002);
        }
    }

    public abstract List<d> a0(e eVar, m mVar, boolean z10) throws MediaCodecUtil.DecoderQueryException;

    @Nullable
    public final r b0(DrmSession drmSession) throws ExoPlaybackException {
        g6.b cryptoConfig = drmSession.getCryptoConfig();
        if (cryptoConfig == null || (cryptoConfig instanceof r)) {
            return (r) cryptoConfig;
        }
        throw f(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + cryptoConfig), this.C, 6001);
    }

    public abstract c.a c0(d dVar, m mVar, @Nullable MediaCrypto mediaCrypto, float f10);

    public final long d0() {
        return this.E0;
    }

    public float e0() {
        return this.J;
    }

    public void f0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    public final boolean g0() {
        return this.f21798h0 >= 0;
    }

    public final void h0(m mVar) {
        K();
        String str = mVar.f21751m;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f21819v.x(32);
        } else {
            this.f21819v.x(1);
        }
        this.f21802l0 = true;
    }

    public final void i0(d dVar, MediaCrypto mediaCrypto) throws Exception {
        String str = dVar.f21854a;
        int i10 = m0.f79487a;
        float fY = i10 < 23 ? -1.0f : Y(this.K, this.C, l());
        float f10 = fY > this.f21811r ? fY : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c.a aVarC0 = c0(dVar, this.C, mediaCrypto, f10);
        if (i10 >= 31) {
            a.a(aVarC0, k());
        }
        try {
            k0.a("createCodec:" + str);
            this.L = this.f21805o.a(aVarC0);
            k0.c();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.S = dVar;
            this.P = f10;
            this.M = this.C;
            this.T = A(str);
            this.U = B(str, this.M);
            this.V = G(str);
            this.W = I(str);
            this.X = D(str);
            this.Y = E(str);
            this.Z = C(str);
            this.f21791a0 = H(str, this.M);
            this.f21794d0 = F(dVar) || X();
            if (this.L.needsReconfiguration()) {
                this.f21806o0 = true;
                this.f21808p0 = 1;
                this.f21792b0 = this.T != 0;
            }
            if ("c2.android.mp3.decoder".equals(dVar.f21854a)) {
                this.f21795e0 = new h();
            }
            if (getState() == 2) {
                this.f21796f0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.C0.f62096a++;
            q0(str, aVarC0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            k0.c();
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.y
    public boolean isEnded() {
        return this.f21826y0;
    }

    @Override // com.google.android.exoplayer2.y
    public boolean isReady() {
        return this.C != null && (m() || g0() || (this.f21796f0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f21796f0));
    }

    public final boolean j0(long j10) {
        int size = this.f21823x.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f21823x.get(i10).longValue() == j10) {
                this.f21823x.remove(i10);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.e
    public void n() {
        this.C = null;
        this.D0 = -9223372036854775807L;
        K0(-9223372036854775807L);
        this.F0 = 0;
        T();
    }

    public final void n0() throws ExoPlaybackException {
        m mVar;
        if (this.L != null || this.f21802l0 || (mVar = this.C) == null) {
            return;
        }
        if (this.F == null && R0(mVar)) {
            h0(this.C);
            return;
        }
        J0(this.F);
        String str = this.C.f21751m;
        DrmSession drmSession = this.E;
        if (drmSession != null) {
            if (this.G == null) {
                r rVarB0 = b0(drmSession);
                if (rVarB0 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(rVarB0.f63006a, rVarB0.f63007b);
                        this.G = mediaCrypto;
                        this.H = !rVarB0.f63008c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw f(e10, this.C, 6006);
                    }
                } else if (this.E.getError() == null) {
                    return;
                }
            }
            if (r.f63005d) {
                int state = this.E.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) s7.a.e(this.E.getError());
                    throw f(drmSessionException, this.C, drmSessionException.errorCode);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            o0(this.G, this.H);
        } catch (DecoderInitializationException e11) {
            throw f(e11, this.C, 4001);
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void o(boolean z10, boolean z11) throws ExoPlaybackException {
        this.C0 = new g6.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(android.media.MediaCrypto r8, boolean r9) throws com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException {
        /*
            r7 = this;
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.d> r0 = r7.Q
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.U(r9)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r2.<init>()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r7.Q = r2     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            boolean r3 = r7.f21809q     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.d> r2 = r7.Q     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            com.google.android.exoplayer2.mediacodec.d r0 = (com.google.android.exoplayer2.mediacodec.d) r0     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            r2.add(r0)     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
        L2a:
            r7.R = r1     // Catch: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException -> L2d
            goto L39
        L2d:
            r8 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.m r1 = r7.C
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L39:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.d> r0 = r7.Q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.d> r0 = r7.Q
            java.lang.Object r0 = r0.peekFirst()
            com.google.android.exoplayer2.mediacodec.d r0 = (com.google.android.exoplayer2.mediacodec.d) r0
        L49:
            com.google.android.exoplayer2.mediacodec.c r2 = r7.L
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.d> r2 = r7.Q
            java.lang.Object r2 = r2.peekFirst()
            com.google.android.exoplayer2.mediacodec.d r2 = (com.google.android.exoplayer2.mediacodec.d) r2
            boolean r3 = r7.P0(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.i0(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            s7.q.i(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.i0(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            s7.q.j(r4, r5, r3)
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.d> r4 = r7.Q
            r4.removeFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r4 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.m r5 = r7.C
            r4.<init>(r5, r3, r9, r2)
            r7.p0(r4)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = r7.R
            if (r2 != 0) goto L9f
            r7.R = r4
            goto La5
        L9f:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.access$000(r2, r4)
            r7.R = r2
        La5:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.d> r2 = r7.Q
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = r7.R
            throw r8
        Lb1:
            r7.Q = r1
            return
        Lb4:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r8 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            com.google.android.exoplayer2.m r0 = r7.C
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.o0(android.media.MediaCrypto, boolean):void");
    }

    @Override // com.google.android.exoplayer2.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        this.f21824x0 = false;
        this.f21826y0 = false;
        this.A0 = false;
        if (this.f21802l0) {
            this.f21819v.b();
            this.f21817u.b();
            this.f21803m0 = false;
        } else {
            S();
        }
        if (this.f21821w.l() > 0) {
            this.f21828z0 = true;
        }
        this.f21821w.c();
        int i10 = this.F0;
        if (i10 != 0) {
            K0(this.A[i10 - 1]);
            this.D0 = this.f21827z[this.F0 - 1];
            this.F0 = 0;
        }
    }

    public abstract void p0(Exception exc);

    @Override // com.google.android.exoplayer2.e
    public void q() {
        try {
            K();
            D0();
        } finally {
            N0(null);
        }
    }

    public abstract void q0(String str, c.a aVar, long j10, long j11);

    @Override // com.google.android.exoplayer2.e
    public void r() {
    }

    public abstract void r0(String str);

    @Override // com.google.android.exoplayer2.y
    public void render(long j10, long j11) throws ExoPlaybackException {
        boolean z10 = false;
        if (this.A0) {
            this.A0 = false;
            y0();
        }
        ExoPlaybackException exoPlaybackException = this.B0;
        if (exoPlaybackException != null) {
            this.B0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f21826y0) {
                E0();
                return;
            }
            if (this.C != null || B0(2)) {
                n0();
                if (this.f21802l0) {
                    k0.a("bypassRender");
                    while (y(j10, j11)) {
                    }
                    k0.c();
                } else if (this.L != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    k0.a("drainAndFeed");
                    while (O(j10, j11) && O0(jElapsedRealtime)) {
                    }
                    while (Q() && O0(jElapsedRealtime)) {
                    }
                    k0.c();
                } else {
                    this.C0.f62099d += w(j10);
                    B0(1);
                }
                this.C0.c();
            }
        } catch (IllegalStateException e10) {
            if (!k0(e10)) {
                throw e10;
            }
            p0(e10);
            if (m0.f79487a >= 21 && m0(e10)) {
                z10 = true;
            }
            if (z10) {
                D0();
            }
            throw g(J(e10, W()), this.C, z10, 4003);
        }
    }

    @Override // com.google.android.exoplayer2.e
    public void s() {
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g6.g s0(d6.z0 r12) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.s0(d6.z0):g6.g");
    }

    @Override // com.google.android.exoplayer2.y
    public void setPlaybackSpeed(float f10, float f11) throws ExoPlaybackException {
        this.J = f10;
        this.K = f11;
        U0(this.M);
    }

    @Override // com.google.android.exoplayer2.e, d6.u1
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    @Override // com.google.android.exoplayer2.e
    public void t(m[] mVarArr, long j10, long j11) throws ExoPlaybackException {
        if (this.E0 == -9223372036854775807L) {
            s7.a.g(this.D0 == -9223372036854775807L);
            this.D0 = j10;
            K0(j11);
            return;
        }
        int i10 = this.F0;
        if (i10 == this.A.length) {
            q.i("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.A[this.F0 - 1]);
        } else {
            this.F0 = i10 + 1;
        }
        long[] jArr = this.f21827z;
        int i11 = this.F0;
        jArr[i11 - 1] = j10;
        this.A[i11 - 1] = j11;
        this.B[i11 - 1] = this.f21820v0;
    }

    public abstract void t0(m mVar, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException;

    public void u0(long j10) {
    }

    @CallSuper
    public void v0(long j10) {
        while (this.F0 != 0 && j10 >= this.B[0]) {
            this.D0 = this.f21827z[0];
            K0(this.A[0]);
            int i10 = this.F0 - 1;
            this.F0 = i10;
            long[] jArr = this.f21827z;
            System.arraycopy(jArr, 1, jArr, 0, i10);
            long[] jArr2 = this.A;
            System.arraycopy(jArr2, 1, jArr2, 0, this.F0);
            long[] jArr3 = this.B;
            System.arraycopy(jArr3, 1, jArr3, 0, this.F0);
            w0();
        }
    }

    public void w0() {
    }

    public final void x() throws ExoPlaybackException {
        s7.a.g(!this.f21824x0);
        z0 z0VarI = i();
        this.f21817u.b();
        do {
            this.f21817u.b();
            int iU = u(z0VarI, this.f21817u, 0);
            if (iU == -5) {
                s0(z0VarI);
                return;
            }
            if (iU != -4) {
                if (iU != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f21817u.g()) {
                    this.f21824x0 = true;
                    return;
                }
                if (this.f21828z0) {
                    m mVar = (m) s7.a.e(this.C);
                    this.D = mVar;
                    t0(mVar, null);
                    this.f21828z0 = false;
                }
                this.f21817u.n();
            }
        } while (this.f21819v.r(this.f21817u));
        this.f21803m0 = true;
    }

    public abstract void x0(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    public final boolean y(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        s7.a.g(!this.f21826y0);
        if (this.f21819v.w()) {
            g gVar = this.f21819v;
            if (!z0(j10, j11, null, gVar.f21430d, this.f21798h0, 0, gVar.v(), this.f21819v.t(), this.f21819v.f(), this.f21819v.g(), this.D)) {
                return false;
            }
            v0(this.f21819v.u());
            this.f21819v.b();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.f21824x0) {
            this.f21826y0 = true;
            return z10;
        }
        if (this.f21803m0) {
            s7.a.g(this.f21819v.r(this.f21817u));
            this.f21803m0 = z10;
        }
        if (this.f21804n0) {
            if (this.f21819v.w()) {
                return true;
            }
            K();
            this.f21804n0 = z10;
            n0();
            if (!this.f21802l0) {
                return z10;
            }
        }
        x();
        if (this.f21819v.w()) {
            this.f21819v.n();
        }
        if (this.f21819v.w() || this.f21824x0 || this.f21804n0) {
            return true;
        }
        return z10;
    }

    @TargetApi(23)
    public final void y0() throws ExoPlaybackException {
        int i10 = this.f21812r0;
        if (i10 == 1) {
            R();
            return;
        }
        if (i10 == 2) {
            R();
            V0();
        } else if (i10 == 3) {
            C0();
        } else {
            this.f21826y0 = true;
            E0();
        }
    }

    public abstract g6.g z(d dVar, m mVar, m mVar2);

    public abstract boolean z0(long j10, long j11, @Nullable c cVar, @Nullable ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, m mVar) throws ExoPlaybackException;
}
