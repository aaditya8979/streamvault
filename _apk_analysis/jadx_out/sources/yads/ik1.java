package yads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.C3978d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public final class ik1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f90864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f90865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f90866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f90868h;

    public ik1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        this.f90861a = (String) ni.a((Object) str);
        this.f90862b = str2;
        this.f90863c = str3;
        this.f90864d = codecCapabilities;
        this.f90867g = z10;
        this.f90865e = z11;
        this.f90866f = z12;
        this.f90868h = ht1.f(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yads.ik1 a(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            yads.ik1 r13 = new yads.ik1
            r14 = 1
            r0 = 0
            if (r11 == 0) goto L63
            int r1 = yads.ib3.f90737a
            r2 = 19
            if (r1 < r2) goto L63
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L63
            r2 = 22
            if (r1 > r2) goto L61
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "T0RST0lELVhVMw=="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            java.nio.charset.Charset r3 = bo.c.f5639b
            r1.<init>(r2, r3)
            java.lang.String r2 = yads.ib3.f90740d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L3e
            java.lang.String r1 = new java.lang.String
            java.lang.String r4 = "TmV4dXMgMTA="
            byte[] r4 = android.util.Base64.decode(r4, r0)
            r1.<init>(r4, r3)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L61
        L3e:
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "T01YLkV4eW5vcy5BVkMuRGVjb2Rlcg=="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            r1.<init>(r2, r3)
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L63
            java.lang.String r1 = new java.lang.String
            java.lang.String r2 = "T01YLkV4eW5vcy5BVkMuRGVjb2Rlci5zZWN1cmU="
            byte[] r2 = android.util.Base64.decode(r2, r0)
            r1.<init>(r2, r3)
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L61
            goto L63
        L61:
            r6 = r14
            goto L64
        L63:
            r6 = r0
        L64:
            r1 = 21
            if (r11 == 0) goto L71
            int r2 = yads.ib3.f90737a
            if (r2 < r1) goto L71
            java.lang.String r2 = "tunneled-playback"
            r11.isFeatureSupported(r2)
        L71:
            if (r15 != 0) goto L84
            if (r11 == 0) goto L82
            int r15 = yads.ib3.f90737a
            if (r15 < r1) goto L82
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L82
            goto L84
        L82:
            r7 = r0
            goto L85
        L84:
            r7 = r14
        L85:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ik1.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):yads.ik1");
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f90864d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = ib3.f90737a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final va0 a(mx0 mx0Var, mx0 mx0Var2) {
        int i10 = !ib3.a(mx0Var.f92610m, mx0Var2.f92610m) ? 8 : 0;
        if (this.f90868h) {
            if (mx0Var.f92618u != mx0Var2.f92618u) {
                i10 |= 1024;
            }
            if (!this.f90865e && (mx0Var.f92615r != mx0Var2.f92615r || mx0Var.f92616s != mx0Var2.f92616s)) {
                i10 |= 512;
            }
            if (!ib3.a(mx0Var.f92622y, mx0Var2.f92622y)) {
                i10 |= 2048;
            }
            String str = this.f90861a;
            String str2 = ib3.f90740d;
            jk1 jk1Var = pk2.f93621c;
            if (str2.startsWith(jk1Var.b()) && jk1Var.a().equals(str) && !mx0Var.a(mx0Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new va0(this.f90861a, mx0Var, mx0Var2, mx0Var.a(mx0Var2) ? 3 : 2, 0);
            }
        } else {
            if (mx0Var.f92623z != mx0Var2.f92623z) {
                i10 |= 4096;
            }
            if (mx0Var.A != mx0Var2.A) {
                i10 |= 8192;
            }
            if (mx0Var.B != mx0Var2.B) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f90862b)) {
                Pair pairB = wk1.b(mx0Var);
                Pair pairB2 = wk1.b(mx0Var2);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new va0(this.f90861a, mx0Var, mx0Var2, 3, 0);
                    }
                }
            }
            if (!mx0Var.a(mx0Var2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f90862b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new va0(this.f90861a, mx0Var, mx0Var2, 1, 0);
            }
        }
        return new va0(this.f90861a, mx0Var, mx0Var2, 0, i10);
    }

    public final void a(String str) {
        ih1.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f90861a + ", " + this.f90862b + "] [" + ib3.f90741e + C3978d4.j.f31385e);
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (ib3.f90737a >= 29 && "video/x-vnd.on2.vp9".equals(this.f90862b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f90864d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f90864d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = ib3.f90737a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (!((d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i13, i14) : videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10)))) {
            if (i10 < i11) {
                String str = this.f90861a;
                byte[] bArrDecode = Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkhFVkM=", 0);
                Charset charset = bo.c.f5639b;
                if (!new String(bArrDecode, charset).equals(str) || !new String(Base64.decode("bWN2NWE=", 0), charset).equals(ib3.f90738b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i11 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i10 + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i15 = point2.x;
                    int i16 = point2.y;
                    if ((d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i15, i16) : videoCapabilities.areSizeAndRateSupported(i15, i16, Math.floor(d10))) {
                        ih1.a("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10) + "] [" + this.f90861a + ", " + this.f90862b + "] [" + ib3.f90741e + C3978d4.j.f31385e);
                    }
                }
            }
            a("sizeAndRate.support, " + i10 + VastAttributes.HORIZONTAL_POSITION + i11 + VastAttributes.HORIZONTAL_POSITION + d10);
            return false;
        }
        return true;
    }

    public final boolean a(mx0 mx0Var) {
        int i10;
        Pair pairB;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.f90862b.equals(mx0Var.f92610m) && !this.f90862b.equals(wk1.a(mx0Var))) {
            return false;
        }
        int i11 = 16;
        if (mx0Var.f92607j != null && (pairB = wk1.b(mx0Var)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            int iIntValue2 = ((Integer) pairB.second).intValue();
            int i12 = 8;
            if ("video/dolby-vision".equals(mx0Var.f92610m)) {
                if ("video/avc".equals(this.f90862b)) {
                    iIntValue2 = 0;
                    iIntValue = 8;
                } else if ("video/hevc".equals(this.f90862b)) {
                    iIntValue2 = 0;
                    iIntValue = 2;
                }
            }
            if (this.f90868h || iIntValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f90864d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (ib3.f90737a <= 23 && "video/x-vnd.on2.vp9".equals(this.f90862b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f90864d;
                    int iIntValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    if (iIntValue3 >= 180000000) {
                        i12 = 1024;
                    } else if (iIntValue3 >= 120000000) {
                        i12 = 512;
                    } else if (iIntValue3 >= 60000000) {
                        i12 = 256;
                    } else if (iIntValue3 >= 30000000) {
                        i12 = 128;
                    } else if (iIntValue3 >= 18000000) {
                        i12 = 64;
                    } else if (iIntValue3 >= 12000000) {
                        i12 = 32;
                    } else if (iIntValue3 >= 7200000) {
                        i12 = 16;
                    } else if (iIntValue3 < 3600000) {
                        i12 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i12;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == iIntValue && codecProfileLevel2.level >= iIntValue2) {
                        if ("video/hevc".equals(this.f90862b) && 2 == iIntValue) {
                            byte[] bArrDecode = Base64.decode("c2FpbGZpc2g=", 0);
                            Charset charset = bo.c.f5639b;
                            String str = new String(bArrDecode, charset);
                            String str2 = ib3.f90738b;
                            if (str.equals(str2) || new String(Base64.decode("bWFybGlu", 0), charset).equals(str2)) {
                            }
                        }
                    }
                }
                a("codec.profileLevel, " + mx0Var.f92607j + ", " + this.f90863c);
                return false;
            }
        }
        if (this.f90868h) {
            int i13 = mx0Var.f92615r;
            if (i13 <= 0 || (i10 = mx0Var.f92616s) <= 0) {
                return true;
            }
            if (ib3.f90737a >= 21) {
                return a(i13, i10, mx0Var.f92617t);
            }
            boolean z10 = i13 * i10 <= wk1.a();
            if (!z10) {
                a("legacyFrameSize, " + mx0Var.f92615r + VastAttributes.HORIZONTAL_POSITION + mx0Var.f92616s);
            }
            return z10;
        }
        int i14 = ib3.f90737a;
        if (i14 >= 21) {
            int i15 = mx0Var.A;
            if (i15 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f90864d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                if (audioCapabilities == null) {
                    a("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i15)) {
                    a("sampleRate.support, " + i15);
                    return false;
                }
            }
            int i16 = mx0Var.f92623z;
            if (i16 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.f90864d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    a("channelCount.aCaps");
                    return false;
                }
                String str3 = this.f90861a;
                String str4 = this.f90862b;
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i14 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                    if ("audio/ac3".equals(str4)) {
                        i11 = 6;
                    } else if (!"audio/eac3".equals(str4)) {
                        i11 = 30;
                    }
                    ih1.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i11 + C3978d4.j.f31385e);
                    maxInputChannelCount = i11;
                }
                if (maxInputChannelCount < i16) {
                    a("channelCount.support, " + i16);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean b(mx0 mx0Var) {
        if (this.f90868h) {
            return this.f90865e;
        }
        Pair pairB = wk1.b(mx0Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    public final String toString() {
        return this.f90861a;
    }
}
