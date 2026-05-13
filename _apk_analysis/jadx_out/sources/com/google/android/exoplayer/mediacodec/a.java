package com.google.android.exoplayer.mediacodec;

import a6.k0;
import a6.m;
import a6.p;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.mediacodec.MediaCodecUtil;
import com.ironsource.C3978d4;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: MediaCodecInfo.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f20205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f20206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f20207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f20213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f20214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20215l;

    public a(String str, @Nullable String str2, @Nullable String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f20204a = (String) a6.a.e(str);
        this.f20205b = str2;
        this.f20206c = str3;
        this.f20207d = codecCapabilities;
        this.f20211h = z10;
        this.f20212i = z11;
        this.f20213j = z12;
        this.f20214k = z13;
        boolean z16 = true;
        this.f20208e = (z14 || codecCapabilities == null || !g(codecCapabilities)) ? false : true;
        this.f20209f = codecCapabilities != null && r(codecCapabilities);
        if (!z15 && (codecCapabilities == null || !p(codecCapabilities))) {
            z16 = false;
        }
        this.f20210g = z16;
        this.f20215l = p.n(str2);
    }

    public static int a(String str, String str2, int i10) {
        if (i10 > 1 || ((k0.f3574a >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        int i11 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        m.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + C3978d4.j.f31385e);
        return i11;
    }

    @TargetApi(21)
    public static Point c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(k0.k(i10, widthAlignment) * widthAlignment, k0.k(i11, heightAlignment) * heightAlignment);
    }

    @TargetApi(21)
    public static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointC = c(videoCapabilities, i10, i11);
        int i12 = pointC.x;
        int i13 = pointC.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    public static final boolean e(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(k0.f3575b)) ? false : true;
    }

    public static boolean g(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f3574a >= 19 && h(codecCapabilities);
    }

    @TargetApi(19)
    public static boolean h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f3574a >= 21 && q(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return k0.f3574a >= 21 && s(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static a w(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new a(str, str2, str3, codecCapabilities, false, z10, z11, z12, z13, z14);
    }

    public static a x(String str) {
        return new a(str, null, null, null, true, false, true, false, false, false);
    }

    @TargetApi(21)
    public Point b(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return c(videoCapabilities, i10, i11);
    }

    public MediaCodecInfo.CodecProfileLevel[] f() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    public boolean i(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207d;
        if (codecCapabilities == null) {
            v("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("channelCount.aCaps");
            return false;
        }
        if (a(this.f20204a, this.f20205b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        v("channelCount.support, " + i10);
        return false;
    }

    @TargetApi(21)
    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207d;
        if (codecCapabilities == null) {
            v("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            v("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        v("sampleRate.support, " + i10);
        return false;
    }

    public boolean k(Format format) {
        String strE;
        String str = format.f19924g;
        if (str == null || this.f20205b == null || (strE = p.e(str)) == null) {
            return true;
        }
        if (!this.f20205b.equals(strE)) {
            v("codec.mime " + format.f19924g + ", " + strE);
            return false;
        }
        Pair<Integer, Integer> pairL = MediaCodecUtil.l(format);
        if (pairL == null) {
            return true;
        }
        int iIntValue = ((Integer) pairL.first).intValue();
        int iIntValue2 = ((Integer) pairL.second).intValue();
        if (!this.f20215l && iIntValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        v("codec.profileLevel, " + format.f19924g + ", " + strE);
        return false;
    }

    public boolean l(Format format) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        if (!k(format)) {
            return false;
        }
        if (!this.f20215l) {
            if (k0.f3574a >= 21) {
                int i11 = format.f19941x;
                if (i11 != -1 && !j(i11)) {
                    return false;
                }
                int i12 = format.f19940w;
                if (i12 != -1 && !i(i12)) {
                    return false;
                }
            }
            return true;
        }
        int i13 = format.f19932o;
        if (i13 <= 0 || (i10 = format.f19933p) <= 0) {
            return true;
        }
        if (k0.f3574a >= 21) {
            return t(i13, i10, format.f19934q);
        }
        boolean z10 = i13 * i10 <= MediaCodecUtil.H();
        if (!z10) {
            v("legacyFrameSize, " + format.f19932o + VastAttributes.HORIZONTAL_POSITION + format.f19933p);
        }
        return z10;
    }

    public boolean m() {
        if (k0.f3574a >= 29 && "video/x-vnd.on2.vp9".equals(this.f20205b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean n(Format format) {
        if (this.f20215l) {
            return this.f20208e;
        }
        Pair<Integer, Integer> pairL = MediaCodecUtil.l(format);
        return pairL != null && ((Integer) pairL.first).intValue() == 42;
    }

    public boolean o(Format format, Format format2, boolean z10) {
        if (this.f20215l) {
            return format.f19927j.equals(format2.f19927j) && format.f19935r == format2.f19935r && (this.f20208e || (format.f19932o == format2.f19932o && format.f19933p == format2.f19933p)) && ((!z10 && format2.f19939v == null) || k0.c(format.f19939v, format2.f19939v));
        }
        if ("audio/mp4a-latm".equals(this.f20205b) && format.f19927j.equals(format2.f19927j) && format.f19940w == format2.f19940w && format.f19941x == format2.f19941x) {
            Pair<Integer, Integer> pairL = MediaCodecUtil.l(format);
            Pair<Integer, Integer> pairL2 = MediaCodecUtil.l(format2);
            if (pairL != null && pairL2 != null) {
                return ((Integer) pairL.first).intValue() == 42 && ((Integer) pairL2.first).intValue() == 42;
            }
        }
        return false;
    }

    @TargetApi(21)
    public boolean t(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20207d;
        if (codecCapabilities == null) {
            v("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            v("sizeAndRate.vCaps");
            return false;
        }
        if (d(videoCapabilities, i10, i11, d10)) {
            return true;
        }
        if (i10 < i11 && e(this.f20204a) && d(videoCapabilities, i11, i10, d10)) {
            u("sizeAndRate.rotated, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10);
            return true;
        }
        v("sizeAndRate.support, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10);
        return false;
    }

    public String toString() {
        return this.f20204a;
    }

    public final void u(String str) {
        m.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f20204a + ", " + this.f20205b + "] [" + k0.f3578e + C3978d4.j.f31385e);
    }

    public final void v(String str) {
        m.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f20204a + ", " + this.f20205b + "] [" + k0.f3578e + C3978d4.j.f31385e);
    }
}
