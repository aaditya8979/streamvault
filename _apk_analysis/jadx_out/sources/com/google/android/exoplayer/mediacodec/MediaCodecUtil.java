package com.google.android.exoplayer.mediacodec;

import a6.k0;
import a6.m;
import a6.p;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer.video.ColorInfo;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseIntArray f20189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SparseIntArray f20190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f20191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final SparseIntArray f20192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map<String, Integer> f20193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map<String, Integer> f20194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map<String, Integer> f20195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final SparseIntArray f20196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final SparseIntArray f20197k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f20187a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<b, List<com.google.android.exoplayer.mediacodec.a>> f20188b = new HashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f20198l = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th2) {
            super("Failed to query underlying media codecs", th2);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20201c;

        public b(String str, boolean z10, boolean z11) {
            this.f20199a = str;
            this.f20200b = z10;
            this.f20201c = z11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.f20199a, bVar.f20199a) && this.f20200b == bVar.f20200b && this.f20201c == bVar.f20201c;
        }

        public int hashCode() {
            return ((((this.f20199a.hashCode() + 31) * 31) + (this.f20200b ? 1231 : 1237)) * 31) + (this.f20201c ? 1231 : 1237);
        }
    }

    public interface c {
        int getCodecCount();

        MediaCodecInfo getCodecInfoAt(int i10);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    public static final class d implements c {
        public d() {
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo getCodecInfoAt(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    @TargetApi(21)
    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public MediaCodecInfo[] f20203b;

        public e(boolean z10, boolean z11) {
            this.f20202a = (z10 || z11) ? 1 : 0;
        }

        public final void a() {
            if (this.f20203b == null) {
                this.f20203b = new MediaCodecList(this.f20202a).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public int getCodecCount() {
            a();
            return this.f20203b.length;
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public MediaCodecInfo getCodecInfoAt(int i10) {
            a();
            return this.f20203b[i10];
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.c
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    public interface f<T> {
        int getScore(T t10);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20189c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        sparseIntArray.put(110, 16);
        sparseIntArray.put(122, 32);
        sparseIntArray.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f20190d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f20191e = sparseIntArray3;
        sparseIntArray3.put(0, 1);
        sparseIntArray3.put(1, 2);
        sparseIntArray3.put(2, 4);
        sparseIntArray3.put(3, 8);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f20192f = sparseIntArray4;
        sparseIntArray4.put(10, 1);
        sparseIntArray4.put(11, 2);
        sparseIntArray4.put(20, 4);
        sparseIntArray4.put(21, 8);
        sparseIntArray4.put(30, 16);
        sparseIntArray4.put(31, 32);
        sparseIntArray4.put(40, 64);
        sparseIntArray4.put(41, 128);
        sparseIntArray4.put(50, 256);
        sparseIntArray4.put(51, 512);
        sparseIntArray4.put(60, 2048);
        sparseIntArray4.put(61, 4096);
        sparseIntArray4.put(62, 8192);
        HashMap map = new HashMap();
        f20193g = map;
        map.put("L30", 1);
        map.put("L60", 4);
        map.put("L63", 16);
        map.put("L90", 64);
        map.put("L93", 256);
        map.put("L120", 1024);
        map.put("L123", 4096);
        map.put("L150", 16384);
        map.put("L153", 65536);
        map.put("L156", 262144);
        map.put("L180", 1048576);
        map.put("L183", 4194304);
        map.put("L186", 16777216);
        map.put("H30", 2);
        map.put("H60", 8);
        map.put("H63", 32);
        map.put("H90", 128);
        map.put("H93", 512);
        map.put("H120", 2048);
        map.put("H123", 8192);
        map.put("H150", 32768);
        map.put("H153", 131072);
        map.put("H156", 524288);
        map.put("H180", 2097152);
        map.put("H183", 8388608);
        map.put("H186", 33554432);
        HashMap map2 = new HashMap();
        f20194h = map2;
        map2.put("00", 1);
        map2.put("01", 2);
        map2.put("02", 4);
        map2.put("03", 8);
        map2.put("04", 16);
        map2.put("05", 32);
        map2.put("06", 64);
        map2.put("07", 128);
        map2.put("08", 256);
        map2.put("09", 512);
        HashMap map3 = new HashMap();
        f20195i = map3;
        map3.put("01", 1);
        map3.put("02", 2);
        map3.put("03", 4);
        map3.put("04", 8);
        map3.put("05", 16);
        map3.put("06", 32);
        map3.put("07", 64);
        map3.put("08", 128);
        map3.put("09", 256);
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        f20196j = sparseIntArray5;
        sparseIntArray5.put(0, 1);
        sparseIntArray5.put(1, 2);
        sparseIntArray5.put(2, 4);
        sparseIntArray5.put(3, 8);
        sparseIntArray5.put(4, 16);
        sparseIntArray5.put(5, 32);
        sparseIntArray5.put(6, 64);
        sparseIntArray5.put(7, 128);
        sparseIntArray5.put(8, 256);
        sparseIntArray5.put(9, 512);
        sparseIntArray5.put(10, 1024);
        sparseIntArray5.put(11, 2048);
        sparseIntArray5.put(12, 4096);
        sparseIntArray5.put(13, 8192);
        sparseIntArray5.put(14, 16384);
        sparseIntArray5.put(15, 32768);
        sparseIntArray5.put(16, 65536);
        sparseIntArray5.put(17, 131072);
        sparseIntArray5.put(18, 262144);
        sparseIntArray5.put(19, 524288);
        sparseIntArray5.put(20, 1048576);
        sparseIntArray5.put(21, 2097152);
        sparseIntArray5.put(22, 4194304);
        sparseIntArray5.put(23, 8388608);
        SparseIntArray sparseIntArray6 = new SparseIntArray();
        f20197k = sparseIntArray6;
        sparseIntArray6.put(1, 1);
        sparseIntArray6.put(2, 2);
        sparseIntArray6.put(3, 3);
        sparseIntArray6.put(4, 4);
        sparseIntArray6.put(5, 5);
        sparseIntArray6.put(6, 6);
        sparseIntArray6.put(17, 17);
        sparseIntArray6.put(20, 20);
        sparseIntArray6.put(23, 23);
        sparseIntArray6.put(29, 29);
        sparseIntArray6.put(39, 39);
        sparseIntArray6.put(42, 42);
    }

    @TargetApi(29)
    public static boolean A(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static boolean B(MediaCodecInfo mediaCodecInfo) {
        if (k0.f3574a >= 29) {
            return C(mediaCodecInfo);
        }
        String strK0 = k0.K0(mediaCodecInfo.getName());
        return (strK0.startsWith("omx.google.") || strK0.startsWith("c2.android.") || strK0.startsWith("c2.google.")) ? false : true;
    }

    @TargetApi(29)
    public static boolean C(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* synthetic */ int D(com.google.android.exoplayer.mediacodec.a aVar) {
        String str = aVar.f20204a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (k0.f3574a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int E(com.google.android.exoplayer.mediacodec.a aVar) {
        return aVar.f20204a.startsWith("OMX.google") ? 1 : 0;
    }

    public static /* synthetic */ int F(Format format, com.google.android.exoplayer.mediacodec.a aVar) {
        try {
            return aVar.l(format) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    public static /* synthetic */ int G(f fVar, Object obj, Object obj2) {
        return fVar.getScore(obj2) - fVar.getScore(obj);
    }

    public static int H() throws DecoderQueryException {
        if (f20198l == -1) {
            int iMax = 0;
            com.google.android.exoplayer.mediacodec.a aVarM = m("video/avc", false, false);
            if (aVarM != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrF = aVarM.f();
                int length = codecProfileLevelArrF.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(f(codecProfileLevelArrF[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, k0.f3574a >= 21 ? 345600 : AdConfig.DEFAULT_PING_V2_EXPIRY_HIGH);
            }
            f20198l = iMax;
        }
        return f20198l;
    }

    public static <T> void I(List<T> list, final f<T> fVar) {
        Collections.sort(list, new Comparator() { // from class: v4.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.G(fVar, obj, obj2);
            }
        });
    }

    public static void e(String str, List<com.google.android.exoplayer.mediacodec.a> list) {
        if ("audio/raw".equals(str)) {
            if (k0.f3574a < 26 && k0.f3575b.equals("R9") && list.size() == 1 && list.get(0).f20204a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(com.google.android.exoplayer.mediacodec.a.w("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            I(list, new f() { // from class: v4.b
                @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.f
                public final int getScore(Object obj) {
                    return MediaCodecUtil.D((com.google.android.exoplayer.mediacodec.a) obj);
                }
            });
        }
        int i10 = k0.f3574a;
        if (i10 < 21 && list.size() > 1) {
            String str2 = list.get(0).f20204a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                I(list, new f() { // from class: v4.c
                    @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.f
                    public final int getScore(Object obj) {
                        return MediaCodecUtil.E((com.google.android.exoplayer.mediacodec.a) obj);
                    }
                });
            }
        }
        if (i10 >= 30 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f20204a)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static int f(int i10) {
        if (i10 == 1 || i10 == 2) {
            return 25344;
        }
        switch (i10) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    public static boolean g(String str) {
        if (k0.f3574a <= 22) {
            String str2 = k0.f3577d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static Pair<Integer, Integer> h(String str, String[] strArr) {
        if (strArr.length != 3) {
            m.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(p.f(Integer.parseInt(strArr[1], 16)))) {
                int i10 = f20197k.get(Integer.parseInt(strArr[2]), -1);
                if (i10 != -1) {
                    return new Pair<>(Integer.valueOf(i10), 0);
                }
            }
        } catch (NumberFormatException unused) {
            m.h("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> i(String str, String[] strArr, @Nullable ColorInfo colorInfo) {
        int i10;
        if (strArr.length < 4) {
            m.h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2].substring(0, 2));
            int i13 = Integer.parseInt(strArr[3]);
            if (i11 != 0) {
                m.h("MediaCodecUtil", "Unknown AV1 profile: " + i11);
                return null;
            }
            if (i13 != 8 && i13 != 10) {
                m.h("MediaCodecUtil", "Unknown AV1 bit depth: " + i13);
                return null;
            }
            int i14 = i13 != 8 ? (colorInfo == null || !(colorInfo.f21166e != null || (i10 = colorInfo.f21165d) == 7 || i10 == 6)) ? 2 : 4096 : 1;
            int i15 = f20196j.get(i12, -1);
            if (i15 != -1) {
                return new Pair<>(Integer.valueOf(i14), Integer.valueOf(i15));
            }
            m.h("MediaCodecUtil", "Unknown AV1 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            m.h("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @Nullable
    public static Pair<Integer, Integer> j(String str, String[] strArr) {
        int i10;
        int i11;
        if (strArr.length < 2) {
            m.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i10 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    m.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i12 = Integer.parseInt(strArr[1]);
                i10 = Integer.parseInt(strArr[2]);
                i11 = i12;
            }
            int i13 = f20189c.get(i11, -1);
            if (i13 == -1) {
                m.h("MediaCodecUtil", "Unknown AVC profile: " + i11);
                return null;
            }
            int i14 = f20190d.get(i10, -1);
            if (i14 != -1) {
                return new Pair<>(Integer.valueOf(i13), Integer.valueOf(i14));
            }
            m.h("MediaCodecUtil", "Unknown AVC level: " + i10);
            return null;
        } catch (NumberFormatException unused) {
            m.h("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @Nullable
    public static String k(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> l(Format format) {
        String str = format.f19924g;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(format.f19927j)) {
            return q(format.f19924g, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2) {
            case "av01":
                return i(format.f19924g, strArrSplit, format.f19939v);
            case "avc1":
            case "avc2":
                return j(format.f19924g, strArrSplit);
            case "hev1":
            case "hvc1":
                return r(format.f19924g, strArrSplit);
            case "mp4a":
                return h(format.f19924g, strArrSplit);
            case "vp09":
                return t(format.f19924g, strArrSplit);
            default:
                return null;
        }
    }

    @Nullable
    public static com.google.android.exoplayer.mediacodec.a m(String str, boolean z10, boolean z11) throws DecoderQueryException {
        List<com.google.android.exoplayer.mediacodec.a> listN = n(str, z10, z11);
        if (listN.isEmpty()) {
            return null;
        }
        return listN.get(0);
    }

    public static synchronized List<com.google.android.exoplayer.mediacodec.a> n(String str, boolean z10, boolean z11) throws DecoderQueryException {
        b bVar = new b(str, z10, z11);
        HashMap<b, List<com.google.android.exoplayer.mediacodec.a>> map = f20188b;
        List<com.google.android.exoplayer.mediacodec.a> list = map.get(bVar);
        if (list != null) {
            return list;
        }
        int i10 = k0.f3574a;
        ArrayList<com.google.android.exoplayer.mediacodec.a> arrayListO = o(bVar, i10 >= 21 ? new e(z10, z11) : new d());
        if (z10 && arrayListO.isEmpty() && 21 <= i10 && i10 <= 23) {
            arrayListO = o(bVar, new d());
            if (!arrayListO.isEmpty()) {
                m.h("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListO.get(0).f20204a);
            }
        }
        e(str, arrayListO);
        List<com.google.android.exoplayer.mediacodec.a> listUnmodifiableList = Collections.unmodifiableList(arrayListO);
        map.put(bVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104 A[Catch: Exception -> 0x0152, TRY_ENTER, TryCatch #5 {Exception -> 0x0152, blocks: (B:3:0x0008, B:5:0x001b, B:60:0x0123, B:8:0x002d, B:11:0x0038, B:54:0x00fc, B:57:0x0104, B:59:0x010a, B:61:0x012d, B:62:0x0150), top: B:77:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.google.android.exoplayer.mediacodec.a> o(com.google.android.exoplayer.mediacodec.MediaCodecUtil.b r25, com.google.android.exoplayer.mediacodec.MediaCodecUtil.c r26) throws com.google.android.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.mediacodec.MediaCodecUtil.o(com.google.android.exoplayer.mediacodec.MediaCodecUtil$b, com.google.android.exoplayer.mediacodec.MediaCodecUtil$c):java.util.ArrayList");
    }

    @CheckResult
    public static List<com.google.android.exoplayer.mediacodec.a> p(List<com.google.android.exoplayer.mediacodec.a> list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        I(arrayList, new f() { // from class: v4.a
            @Override // com.google.android.exoplayer.mediacodec.MediaCodecUtil.f
            public final int getScore(Object obj) {
                return MediaCodecUtil.F(format, (com.google.android.exoplayer.mediacodec.a) obj);
            }
        });
        return arrayList;
    }

    @Nullable
    public static Pair<Integer, Integer> q(String str, String[] strArr) {
        if (strArr.length < 3) {
            m.h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f20187a.matcher(strArr[1]);
        if (!matcher.matches()) {
            m.h("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer num = f20194h.get(strGroup);
        if (num == null) {
            m.h("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer num2 = f20195i.get(str2);
        if (num2 != null) {
            return new Pair<>(num, num2);
        }
        m.h("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> r(String str, String[] strArr) {
        if (strArr.length < 4) {
            m.h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f20187a.matcher(strArr[1]);
        if (!matcher.matches()) {
            m.h("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                m.h("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i10 = 2;
        }
        String str2 = strArr[3];
        Integer num = f20193g.get(str2);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i10), num);
        }
        m.h("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    @Nullable
    public static com.google.android.exoplayer.mediacodec.a s() throws DecoderQueryException {
        com.google.android.exoplayer.mediacodec.a aVarM = m("audio/raw", false, false);
        if (aVarM == null) {
            return null;
        }
        return com.google.android.exoplayer.mediacodec.a.x(aVarM.f20204a);
    }

    @Nullable
    public static Pair<Integer, Integer> t(String str, String[] strArr) {
        if (strArr.length < 3) {
            m.h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArr[1]);
            int i11 = Integer.parseInt(strArr[2]);
            int i12 = f20191e.get(i10, -1);
            if (i12 == -1) {
                m.h("MediaCodecUtil", "Unknown VP9 profile: " + i10);
                return null;
            }
            int i13 = f20192f.get(i11, -1);
            if (i13 != -1) {
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i13));
            }
            m.h("MediaCodecUtil", "Unknown VP9 level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            m.h("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    public static boolean u(MediaCodecInfo mediaCodecInfo) {
        return k0.f3574a >= 29 && v(mediaCodecInfo);
    }

    @RequiresApi(29)
    public static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static boolean w(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = k0.f3574a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = k0.f3575b;
            if ("a70".equals(str3) || ("Xiaomi".equals(k0.f3576c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = k0.f3575b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = k0.f3575b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(k0.f3576c))) {
            String str6 = k0.f3575b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(k0.f3576c)) {
            String str7 = k0.f3575b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && k0.f3575b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean x(MediaCodecInfo mediaCodecInfo) {
        return k0.f3574a >= 29 ? y(mediaCodecInfo) : !z(mediaCodecInfo);
    }

    @TargetApi(29)
    public static boolean y(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean z(MediaCodecInfo mediaCodecInfo) {
        if (k0.f3574a >= 29) {
            return A(mediaCodecInfo);
        }
        String strK0 = k0.K0(mediaCodecInfo.getName());
        if (strK0.startsWith("arc.")) {
            return false;
        }
        return strK0.startsWith("omx.google.") || strK0.startsWith("omx.ffmpeg.") || (strK0.startsWith("omx.sec.") && strK0.contains(".sw.")) || strK0.equals("omx.qcom.video.decoder.hevcswvdec") || strK0.startsWith("c2.android.") || strK0.startsWith("c2.google.") || !(strK0.startsWith("omx.") || strK0.startsWith("c2."));
    }
}
