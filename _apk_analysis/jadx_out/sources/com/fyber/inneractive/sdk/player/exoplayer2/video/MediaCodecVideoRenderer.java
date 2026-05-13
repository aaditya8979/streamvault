package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.ironsource.C3978d4;
import com.unity3d.services.core.di.ServiceProvider;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(16)
public class MediaCodecVideoRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int[] f18835q0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final h P;
    public final VideoRendererEventListener.EventDispatcher Q;
    public final long R;
    public final int S;
    public final boolean T;
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] U;
    public e V;
    public Surface W;
    public int X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f18836a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f18837b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f18838c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f18839d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f18840e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f18841f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f18842g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f18843h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f18844i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f18845j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f18846k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f18847l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f18848m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f18849n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f18850o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public f f18851p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecVideoRenderer(Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, false);
        boolean z10 = false;
        this.R = 5000L;
        this.S = -1;
        this.P = new h();
        this.Q = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        if (z.f18822a <= 22 && "foster".equals(z.f18823b) && "NVIDIA".equals(z.f18824c)) {
            z10 = true;
        }
        this.T = z10;
        this.Z = -9223372036854775807L;
        this.f18841f0 = -1;
        this.f18842g0 = -1;
        this.f18844i0 = -1.0f;
        this.f18840e0 = -1.0f;
        this.X = 1;
        this.f18845j0 = -1;
        this.f18846k0 = -1;
        this.f18848m0 = -1.0f;
        this.f18847l0 = -1;
    }

    public static int a(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.getClass();
        i12 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i13 = i11 * i10;
                i12 = 2;
                break;
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i13 = i11 * i10;
                break;
            case "video/avc":
                if (!"BRAVIA 4K 2015".equals(z.f18825d)) {
                    i13 = ((i11 + 15) / 16) * ((i10 + 15) / 16) * 256;
                    i12 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    public static boolean b(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (!oVar.f18453f.equals(oVar2.f18453f)) {
            return false;
        }
        int i10 = oVar.f18460m;
        if (i10 == -1) {
            i10 = 0;
        }
        int i11 = oVar2.f18460m;
        if (i11 == -1) {
            i11 = 0;
        }
        if (i10 == i11) {
            return z10 || (oVar.f18457j == oVar2.f18457j && oVar.f18458k == oVar2.f18458k);
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i10, Object obj) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (i10 != 1) {
            if (i10 == 4) {
                int iIntValue = ((Integer) obj).intValue();
                this.X = iIntValue;
                MediaCodec mediaCodec = this.f18389o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.W == surface) {
            if (surface != null) {
                int i11 = this.f18845j0;
                if (i11 != -1 || this.f18846k0 != -1) {
                    this.Q.videoSizeChanged(i11, this.f18846k0, this.f18847l0, this.f18848m0);
                }
                if (this.Y) {
                    this.Q.renderedFirstFrame(this.W);
                    return;
                }
                return;
            }
            return;
        }
        this.W = surface;
        int i12 = this.f17235c;
        if (i12 == 1 || i12 == 2) {
            MediaCodec mediaCodec2 = this.f18389o;
            if (z.f18822a < 23 || mediaCodec2 == null || surface == null) {
                o();
                l();
            } else {
                mediaCodec2.setOutputSurface(surface);
            }
        }
        if (surface == null) {
            this.f18845j0 = -1;
            this.f18846k0 = -1;
            this.f18848m0 = -1.0f;
            this.f18847l0 = -1;
            r();
            return;
        }
        int i13 = this.f18845j0;
        if (i13 != -1 || this.f18846k0 != -1) {
            this.Q.videoSizeChanged(i13, this.f18846k0, this.f18847l0, this.f18848m0);
        }
        r();
        if (i12 == 2) {
            this.Z = this.R > 0 ? SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.f18841f0 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f18842g0 = integer;
        float f10 = this.f18840e0;
        this.f18844i0 = f10;
        if (z.f18822a >= 21) {
            int i10 = this.f18839d0;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f18841f0;
                this.f18841f0 = integer;
                this.f18842g0 = i11;
                this.f18844i0 = 1.0f / f10;
            }
        } else {
            this.f18843h0 = this.f18839d0;
        }
        mediaCodec.setVideoScalingMode(this.X);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        e eVar;
        String str;
        Point point;
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.U;
        int iMax = oVar.f18457j;
        int iMax2 = oVar.f18458k;
        int iMax3 = oVar.f18454g;
        if (iMax3 == -1) {
            iMax3 = a(oVar.f18453f, iMax, iMax2);
        }
        if (oVarArr.length == 1) {
            eVar = new e(iMax, iMax2, iMax3);
        } else {
            boolean z10 = false;
            for (com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 : oVarArr) {
                if (b(aVar.f18378b, oVar, oVar2)) {
                    int i11 = oVar2.f18457j;
                    z10 |= i11 == -1 || oVar2.f18458k == -1;
                    iMax = Math.max(iMax, i11);
                    iMax2 = Math.max(iMax2, oVar2.f18458k);
                    int iA = oVar2.f18454g;
                    if (iA == -1) {
                        iA = a(oVar2.f18453f, oVar2.f18457j, oVar2.f18458k);
                    }
                    iMax3 = Math.max(iMax3, iA);
                }
            }
            if (z10) {
                String str2 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
                int i12 = oVar.f18458k;
                int i13 = oVar.f18457j;
                boolean z11 = i12 > i13;
                int i14 = z11 ? i12 : i13;
                if (z11) {
                    i12 = i13;
                }
                float f10 = i12 / i14;
                int[] iArr = f18835q0;
                int i15 = 0;
                for (int i16 = 9; i15 < i16; i16 = 9) {
                    int i17 = iArr[i15];
                    int[] iArr2 = iArr;
                    int i18 = (int) (i17 * f10);
                    if (i17 <= i14 || i18 <= i12) {
                        break;
                    }
                    int i19 = i12;
                    float f11 = f10;
                    if (z.f18822a >= 21) {
                        int i20 = z11 ? i18 : i17;
                        if (!z11) {
                            i17 = i18;
                        }
                        point = aVar.a(i20, i17);
                        str = str2;
                        if (aVar.a(point.x, point.y, oVar.f18459l)) {
                            break;
                        }
                        i15++;
                        iArr = iArr2;
                        i12 = i19;
                        f10 = f11;
                        str2 = str;
                    } else {
                        str = str2;
                        int i21 = ((i17 + 15) / 16) * 16;
                        int i22 = ((i18 + 15) / 16) * 16;
                        if (i21 * i22 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a()) {
                            int i23 = z11 ? i22 : i21;
                            if (!z11) {
                                i21 = i22;
                            }
                            point = new Point(i23, i21);
                        } else {
                            i15++;
                            iArr = iArr2;
                            i12 = i19;
                            f10 = f11;
                            str2 = str;
                        }
                    }
                }
                str = str2;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iMax3 = Math.max(iMax3, a(oVar.f18453f, iMax, iMax2));
                    Log.w(str, "Codec max resolution adjusted to: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
                }
            }
            eVar = new e(iMax, iMax2, iMax3);
        }
        this.V = eVar;
        boolean z12 = this.T;
        int i24 = this.f18850o0;
        MediaFormat mediaFormatA = oVar.a();
        mediaFormatA.setInteger("max-width", eVar.f18864a);
        mediaFormatA.setInteger("max-height", eVar.f18865b);
        int i25 = eVar.f18866c;
        if (i25 != -1) {
            mediaFormatA.setInteger("max-input-size", i25);
        }
        if (z12) {
            i10 = 0;
            mediaFormatA.setInteger("auto-frc", 0);
        } else {
            i10 = 0;
        }
        if (i24 != 0) {
            mediaFormatA.setFeatureEnabled("tunneled-playback", true);
            mediaFormatA.setInteger("audio-session-id", i24);
        }
        mediaCodec.configure(mediaFormatA, this.W, (MediaCrypto) null, i10);
        if (z.f18822a < 23 || !this.f18849n0) {
            return;
        }
        this.f18851p0 = new f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(oVar);
        this.Q.inputFormatChanged(oVar);
        float f10 = oVar.f18461n;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.f18840e0 = f10;
        int i10 = oVar.f18460m;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f18839d0 = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(String str, long j10, long j11) {
        this.Q.decoderInitialized(str, j10, j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(z10, j10);
        r();
        this.f18838c0 = 0;
        if (z10) {
            this.Z = this.R > 0 ? SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
        } else {
            this.Z = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr) {
        this.U = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j12, boolean z10) {
        long j13;
        long j14;
        long j15;
        if (z10) {
            w.a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i10, false);
            w.a();
            this.N.skippedOutputBufferCount++;
            return true;
        }
        if (!this.Y) {
            if (z.f18822a >= 21) {
                long jNanoTime = System.nanoTime();
                s();
                w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i10, jNanoTime);
                w.a();
                this.N.renderedOutputBufferCount++;
                this.f18838c0 = 0;
                if (!this.Y) {
                    this.Y = true;
                    this.Q.renderedFirstFrame(this.W);
                }
            } else {
                s();
                w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i10, true);
                w.a();
                this.N.renderedOutputBufferCount++;
                this.f18838c0 = 0;
                if (!this.Y) {
                    this.Y = true;
                    this.Q.renderedFirstFrame(this.W);
                }
            }
            return true;
        }
        if (this.f17235c != 2) {
            return false;
        }
        long jElapsedRealtime = (j12 - j10) - ((SystemClock.elapsedRealtime() * 1000) - j11);
        long jNanoTime2 = System.nanoTime();
        long j16 = (jElapsedRealtime * 1000) + jNanoTime2;
        h hVar = this.P;
        long j17 = j12 * 1000;
        if (hVar.f18880h) {
            if (j12 != hVar.f18877e) {
                hVar.f18883k++;
                hVar.f18878f = hVar.f18879g;
            }
            long j18 = hVar.f18883k;
            if (j18 >= 6) {
                long j19 = hVar.f18882j;
                j13 = hVar.f18878f + ((j17 - j19) / j18);
                if (Math.abs((j16 - hVar.f18881i) - (j13 - j19)) > 20000000) {
                    hVar.f18880h = false;
                } else {
                    j14 = (hVar.f18881i + j13) - hVar.f18882j;
                }
            } else {
                if (Math.abs((j16 - hVar.f18881i) - (j17 - hVar.f18882j)) > 20000000) {
                    hVar.f18880h = false;
                }
            }
            j13 = j17;
            j14 = j16;
        } else {
            j13 = j17;
            j14 = j16;
        }
        if (!hVar.f18880h) {
            hVar.f18882j = j17;
            hVar.f18881i = j16;
            hVar.f18883k = 0L;
            hVar.f18880h = true;
        }
        hVar.f18877e = j12;
        hVar.f18879g = j13;
        g gVar = hVar.f18873a;
        if (gVar != null && gVar.f18869a != 0) {
            long j20 = hVar.f18873a.f18869a;
            long j21 = hVar.f18875c;
            long j22 = (((j14 - j20) / j21) * j21) + j20;
            if (j14 <= j22) {
                j15 = j22 - j21;
            } else {
                j15 = j22;
                j22 = j21 + j22;
            }
            if (j22 - j14 >= j14 - j15) {
                j22 = j15;
            }
            j14 = j22 - hVar.f18876d;
        }
        long j23 = (j14 - jNanoTime2) / 1000;
        if (j23 < -30000) {
            w.a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i10, false);
            w.a();
            DecoderCounters decoderCounters = this.N;
            decoderCounters.droppedOutputBufferCount++;
            this.f18837b0++;
            int i11 = this.f18838c0 + 1;
            this.f18838c0 = i11;
            decoderCounters.maxConsecutiveDroppedOutputBufferCount = Math.max(i11, decoderCounters.maxConsecutiveDroppedOutputBufferCount);
            int i12 = this.f18837b0;
            if (i12 != this.S || i12 <= 0) {
                return true;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.Q.droppedFrames(this.f18837b0, jElapsedRealtime2 - this.f18836a0);
            this.f18837b0 = 0;
            this.f18836a0 = jElapsedRealtime2;
            return true;
        }
        if (z.f18822a >= 21) {
            if (j23 >= ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                return false;
            }
            s();
            w.a("releaseOutputBuffer");
            mediaCodec.releaseOutputBuffer(i10, j14);
            w.a();
            this.N.renderedOutputBufferCount++;
            this.f18838c0 = 0;
            if (!this.Y) {
                this.Y = true;
                this.Q.renderedFirstFrame(this.W);
            }
            return true;
        }
        if (j23 >= 30000) {
            return false;
        }
        if (j23 > 11000) {
            try {
                Thread.sleep((j23 - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        s();
        w.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        w.a();
        this.N.renderedOutputBufferCount++;
        this.f18838c0 = 0;
        if (!this.Y) {
            this.Y = true;
            this.Q.renderedFirstFrame(this.W);
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (b(z10, oVar, oVar2)) {
            int i10 = oVar2.f18457j;
            e eVar = this.V;
            if (i10 <= eVar.f18864a && oVar2.f18458k <= eVar.f18865b && oVar2.f18454g <= eVar.f18866c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        int i10;
        int i11;
        String str = oVar.f18453f;
        if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar2 = oVar.f18456i;
        if (dVar2 != null) {
            z10 = false;
            for (int i12 = 0; i12 < dVar2.f17391c; i12++) {
                z10 |= dVar2.f17389a[i12].f17388e;
            }
        } else {
            z10 = false;
        }
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(z10, str);
        if (aVarA == null) {
            return 1;
        }
        boolean zA = aVarA.a(oVar.f18450c);
        if (zA && (i10 = oVar.f18457j) > 0 && (i11 = oVar.f18458k) > 0) {
            if (z.f18822a >= 21) {
                zA = aVarA.a(i10, i11, oVar.f18459l);
            } else {
                boolean z11 = i10 * i11 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a();
                if (!z11) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + oVar.f18457j + VastAttributes.HORIZONTAL_POSITION + oVar.f18458k + "] [" + z.f18826e + C3978d4.j.f31385e);
                }
                zA = z11;
            }
        }
        return (zA ? 3 : 2) | (aVarA.f18378b ? 8 : 4) | (aVarA.f18379c ? 16 : 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        if ((this.Y || super.q()) && super.f()) {
            this.Z = -9223372036854775807L;
            return true;
        }
        if (this.Z == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Z) {
            return true;
        }
        this.Z = -9223372036854775807L;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        this.f18841f0 = -1;
        this.f18842g0 = -1;
        this.f18844i0 = -1.0f;
        this.f18840e0 = -1.0f;
        this.f18845j0 = -1;
        this.f18846k0 = -1;
        this.f18848m0 = -1.0f;
        this.f18847l0 = -1;
        r();
        h hVar = this.P;
        if (hVar.f18874b) {
            hVar.f18873a.f18870b.sendEmptyMessage(2);
        }
        this.f18851p0 = null;
        try {
            this.f18388n = null;
            o();
        } finally {
            this.N.ensureUpdated();
            this.Q.disabled(this.N);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.N = decoderCounters;
        int i10 = this.f17234b.f18581a;
        this.f18850o0 = i10;
        this.f18849n0 = i10 != 0;
        this.Q.enabled(decoderCounters);
        h hVar = this.P;
        hVar.f18880h = false;
        if (hVar.f18874b) {
            hVar.f18873a.f18870b.sendEmptyMessage(1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.f18837b0 = 0;
        this.f18836a0 = SystemClock.elapsedRealtime();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        this.Z = -9223372036854775807L;
        if (this.f18837b0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.Q.droppedFrames(this.f18837b0, jElapsedRealtime - this.f18836a0);
            this.f18837b0 = 0;
            this.f18836a0 = jElapsedRealtime;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void m() {
        if (z.f18822a >= 23 || !this.f18849n0 || this.Y) {
            return;
        }
        this.Y = true;
        this.Q.renderedFirstFrame(this.W);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean q() {
        Surface surface;
        return super.q() && (surface = this.W) != null && surface.isValid();
    }

    public final void r() {
        MediaCodec mediaCodec;
        this.Y = false;
        if (z.f18822a < 23 || !this.f18849n0 || (mediaCodec = this.f18389o) == null) {
            return;
        }
        this.f18851p0 = new f(this, mediaCodec);
    }

    public final void s() {
        int i10 = this.f18841f0;
        if (i10 == -1 && this.f18842g0 == -1) {
            return;
        }
        if (this.f18845j0 == i10 && this.f18846k0 == this.f18842g0 && this.f18847l0 == this.f18843h0 && this.f18848m0 == this.f18844i0) {
            return;
        }
        this.Q.videoSizeChanged(i10, this.f18842g0, this.f18843h0, this.f18844i0);
        this.f18845j0 = this.f18841f0;
        this.f18846k0 = this.f18842g0;
        this.f18847l0 = this.f18843h0;
        this.f18848m0 = this.f18844i0;
    }
}
