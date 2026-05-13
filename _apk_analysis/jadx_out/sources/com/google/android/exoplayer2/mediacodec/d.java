package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.ironsource.C3978d4;
import g6.g;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import s7.m0;
import s7.q;
import s7.u;

/* JADX INFO: compiled from: MediaCodecInfo.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f21857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f21863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21864k;

    /* JADX INFO: compiled from: MediaCodecInfo.java */
    @RequiresApi(29)
    public static final class a {
        @DoNotInline
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            MediaCodecInfo$VideoCapabilities$PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint = new MediaCodecInfo$VideoCapabilities$PerformancePoint(i10, i11, (int) d10);
            for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                if (((MediaCodecInfo$VideoCapabilities$PerformancePoint) supportedPerformancePoints.get(i12)).covers(mediaCodecInfo$VideoCapabilities$PerformancePoint)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    @VisibleForTesting
    public d(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f21854a = (String) s7.a.e(str);
        this.f21855b = str2;
        this.f21856c = str3;
        this.f21857d = codecCapabilities;
        this.f21861h = z10;
        this.f21862i = z11;
        this.f21863j = z12;
        this.f21858e = z13;
        this.f21859f = z14;
        this.f21860g = z15;
        this.f21864k = u.o(str2);
    }

    public static boolean A(String str, int i10) {
        if ("video/hevc".equals(str) && 2 == i10) {
            String str2 = m0.f79488b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean B(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(m0.f79488b)) ? false : true;
    }

    public static d C(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new d(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !h(codecCapabilities) || z(str)) ? false : true, codecCapabilities != null && s(codecCapabilities), z14 || (codecCapabilities != null && q(codecCapabilities)));
    }

    public static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((m0.f79487a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        q.i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + C3978d4.j.f31385e);
        return i11;
    }

    @RequiresApi(21)
    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(m0.l(i10, widthAlignment) * widthAlignment, m0.l(i11, heightAlignment) * heightAlignment);
    }

    @RequiresApi(21)
    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointC = c(videoCapabilities, i10, i11);
        int i12 = pointC.x;
        int i13 = pointC.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    public static MediaCodecInfo.CodecProfileLevel[] f(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i10 = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i10;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f79487a >= 19 && i(codecCapabilities);
    }

    @RequiresApi(19)
    public static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f79487a >= 21 && r(codecCapabilities);
    }

    @RequiresApi(21)
    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return m0.f79487a >= 21 && t(codecCapabilities);
    }

    @RequiresApi(21)
    public static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static boolean x(String str) {
        return "audio/opus".equals(str);
    }

    public static boolean y(String str) {
        return m0.f79490d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean z(String str) {
        if (m0.f79487a <= 22) {
            String str2 = m0.f79490d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    @RequiresApi(21)
    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21857d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public g e(m mVar, m mVar2) {
        int i10 = !m0.c(mVar.f21751m, mVar2.f21751m) ? 8 : 0;
        if (this.f21864k) {
            if (mVar.f21759u != mVar2.f21759u) {
                i10 |= 1024;
            }
            if (!this.f21858e && (mVar.f21756r != mVar2.f21756r || mVar.f21757s != mVar2.f21757s)) {
                i10 |= 512;
            }
            if (!m0.c(mVar.f21763y, mVar2.f21763y)) {
                i10 |= 2048;
            }
            if (y(this.f21854a) && !mVar.g(mVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new g(this.f21854a, mVar, mVar2, mVar.g(mVar2) ? 3 : 2, 0);
            }
        } else {
            if (mVar.f21764z != mVar2.f21764z) {
                i10 |= 4096;
            }
            if (mVar.A != mVar2.A) {
                i10 |= 8192;
            }
            if (mVar.B != mVar2.B) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f21855b)) {
                Pair<Integer, Integer> pairQ = MediaCodecUtil.q(mVar);
                Pair<Integer, Integer> pairQ2 = MediaCodecUtil.q(mVar2);
                if (pairQ != null && pairQ2 != null) {
                    int iIntValue = ((Integer) pairQ.first).intValue();
                    int iIntValue2 = ((Integer) pairQ2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new g(this.f21854a, mVar, mVar2, 3, 0);
                    }
                }
            }
            if (!mVar.g(mVar2)) {
                i10 |= 32;
            }
            if (x(this.f21855b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new g(this.f21854a, mVar, mVar2, 1, 0);
            }
        }
        return new g(this.f21854a, mVar, mVar2, 0, i10);
    }

    public MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21857d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @RequiresApi(21)
    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21857d;
        if (codecCapabilities == null) {
            w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("channelCount.aCaps");
            return false;
        }
        if (a(this.f21854a, this.f21855b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        w("channelCount.support, " + i10);
        return false;
    }

    @RequiresApi(21)
    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21857d;
        if (codecCapabilities == null) {
            w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            w("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        w("sampleRate.support, " + i10);
        return false;
    }

    public final boolean l(m mVar) {
        Pair<Integer, Integer> pairQ;
        if (mVar.f21748j == null || (pairQ = MediaCodecUtil.q(mVar)) == null) {
            return true;
        }
        int iIntValue = ((Integer) pairQ.first).intValue();
        int iIntValue2 = ((Integer) pairQ.second).intValue();
        if ("video/dolby-vision".equals(mVar.f21751m)) {
            if (!"video/avc".equals(this.f21855b)) {
                iIntValue = "video/hevc".equals(this.f21855b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f21864k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrG = g();
        if (m0.f79487a <= 23 && "video/x-vnd.on2.vp9".equals(this.f21855b) && codecProfileLevelArrG.length == 0) {
            codecProfileLevelArrG = f(this.f21857d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrG) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2 && !A(this.f21855b, iIntValue)) {
                return true;
            }
        }
        w("codec.profileLevel, " + mVar.f21748j + ", " + this.f21856c);
        return false;
    }

    public boolean m(m mVar) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        if (!o(mVar) || !l(mVar)) {
            return false;
        }
        if (!this.f21864k) {
            if (m0.f79487a >= 21) {
                int i11 = mVar.A;
                if (i11 != -1 && !k(i11)) {
                    return false;
                }
                int i12 = mVar.f21764z;
                if (i12 != -1 && !j(i12)) {
                    return false;
                }
            }
            return true;
        }
        int i13 = mVar.f21756r;
        if (i13 <= 0 || (i10 = mVar.f21757s) <= 0) {
            return true;
        }
        if (m0.f79487a >= 21) {
            return u(i13, i10, mVar.f21758t);
        }
        boolean z10 = i13 * i10 <= MediaCodecUtil.N();
        if (!z10) {
            w("legacyFrameSize, " + mVar.f21756r + VastAttributes.HORIZONTAL_POSITION + mVar.f21757s);
        }
        return z10;
    }

    public boolean n() {
        if (m0.f79487a >= 29 && "video/x-vnd.on2.vp9".equals(this.f21855b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o(m mVar) {
        return this.f21855b.equals(mVar.f21751m) || this.f21855b.equals(MediaCodecUtil.m(mVar));
    }

    public boolean p(m mVar) {
        if (this.f21864k) {
            return this.f21858e;
        }
        Pair<Integer, Integer> pairQ = MediaCodecUtil.q(mVar);
        return pairQ != null && ((Integer) pairQ.first).intValue() == 42;
    }

    public String toString() {
        return this.f21854a;
    }

    @RequiresApi(21)
    public boolean u(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f21857d;
        if (codecCapabilities == null) {
            w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            w("sizeAndRate.vCaps");
            return false;
        }
        if (m0.f79487a >= 29) {
            int iA = a.a(videoCapabilities, i10, i11, d10);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                w("sizeAndRate.cover, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !B(this.f21854a) || !d(videoCapabilities, i11, i10, d10)) {
                w("sizeAndRate.support, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + "@" + d10);
                return false;
            }
            v("sizeAndRate.rotated, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + "@" + d10);
        }
        return true;
    }

    public final void v(String str) {
        q.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f21854a + ", " + this.f21855b + "] [" + m0.f79491e + C3978d4.j.f31385e);
    }

    public final void w(String str) {
        q.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f21854a + ", " + this.f21855b + "] [" + m0.f79491e + C3978d4.j.f31385e);
    }
}
