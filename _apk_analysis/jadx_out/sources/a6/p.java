package a6;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;

/* JADX INFO: compiled from: MimeTypes.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f3592a = new ArrayList<>();

    /* JADX INFO: compiled from: MimeTypes.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3594b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3595c;
    }

    public static boolean a(@Nullable String str) {
        if (str == null) {
            return false;
        }
        switch (str) {
        }
        return false;
    }

    @Nullable
    public static String b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : k0.F0(str)) {
            String strE = e(str2);
            if (strE != null && l(strE)) {
                return strE;
            }
        }
        return null;
    }

    @Nullable
    public static String c(String str) {
        int size = f3592a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f3592a.get(i10);
            if (str.startsWith(aVar.f3594b)) {
                return aVar.f3593a;
            }
        }
        return null;
    }

    public static int d(String str) {
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    @Nullable
    public static String e(@Nullable String str) {
        String strF = null;
        if (str == null) {
            return null;
        }
        String strK0 = k0.K0(str.trim());
        if (strK0.startsWith("avc1") || strK0.startsWith("avc3")) {
            return "video/avc";
        }
        if (strK0.startsWith("hev1") || strK0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strK0.startsWith("dvav") || strK0.startsWith("dva1") || strK0.startsWith("dvhe") || strK0.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strK0.startsWith("av01")) {
            return "video/av01";
        }
        if (strK0.startsWith("vp9") || strK0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strK0.startsWith("vp8") || strK0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!strK0.startsWith("mp4a")) {
            return (strK0.startsWith("ac-3") || strK0.startsWith("dac3")) ? "audio/ac3" : (strK0.startsWith("ec-3") || strK0.startsWith("dec3")) ? "audio/eac3" : strK0.startsWith("ec+3") ? "audio/eac3-joc" : (strK0.startsWith("ac-4") || strK0.startsWith("dac4")) ? "audio/ac4" : (strK0.startsWith("dtsc") || strK0.startsWith("dtse")) ? "audio/vnd.dts" : (strK0.startsWith("dtsh") || strK0.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strK0.startsWith("opus") ? "audio/opus" : strK0.startsWith("vorbis") ? "audio/vorbis" : strK0.startsWith("flac") ? "audio/flac" : strK0.startsWith("stpp") ? "application/ttml+xml" : strK0.startsWith("wvtt") ? "text/vtt" : c(strK0);
        }
        if (strK0.startsWith("mp4a.")) {
            String strSubstring = strK0.substring(5);
            if (strSubstring.length() >= 2) {
                try {
                    strF = f(Integer.parseInt(k0.M0(strSubstring.substring(0, 2)), 16));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return strF == null ? "audio/mp4a-latm" : strF;
    }

    @Nullable
    public static String f(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173 /* 173 */:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    @Nullable
    public static String g(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (l(str)) {
            return 1;
        }
        if (n(str)) {
            return 2;
        }
        if (m(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        return i(str);
    }

    public static int i(String str) {
        int size = f3592a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f3592a.get(i10);
            if (str.equals(aVar.f3593a)) {
                return aVar.f3595c;
            }
        }
        return -1;
    }

    public static int j(String str) {
        return h(e(str));
    }

    @Nullable
    public static String k(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : k0.F0(str)) {
            String strE = e(str2);
            if (strE != null && n(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean l(@Nullable String str) {
        return "audio".equals(g(str));
    }

    public static boolean m(@Nullable String str) {
        return "text".equals(g(str));
    }

    public static boolean n(@Nullable String str) {
        return "video".equals(g(str));
    }
}
