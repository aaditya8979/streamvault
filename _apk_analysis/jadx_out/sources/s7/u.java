package s7;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: MimeTypes.java */
/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f79524a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f79525b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: compiled from: MimeTypes.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f79527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f79528c;
    }

    /* JADX INFO: compiled from: MimeTypes.java */
    @VisibleForTesting
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79530b;

        public b(int i10, int i11) {
            this.f79529a = i10;
            this.f79530b = i11;
        }

        public int a() {
            int i10 = this.f79530b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    public static boolean a(@Nullable String str, @Nullable String str2) {
        b bVarG;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (bVarG = g(str2)) != null && (iA = bVarG.a()) != 0 && iA != 16) {
                    break;
                }
                break;
        }
        return false;
    }

    @Nullable
    public static String b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : m0.J0(str)) {
            String strE = e(str2);
            if (strE != null && l(strE)) {
                return strE;
            }
        }
        return null;
    }

    @Nullable
    public static String c(String str) {
        int size = f79524a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f79524a.get(i10);
            if (str.startsWith(aVar.f79527b)) {
                return aVar.f79526a;
            }
        }
        return null;
    }

    public static int d(String str, @Nullable String str2) {
        b bVarG;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarG = g(str2)) == null) {
                    return 0;
                }
                return bVarG.a();
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
        b bVarG;
        String strF = null;
        if (str == null) {
            return null;
        }
        String strE = y7.a.e(str.trim());
        if (strE.startsWith("avc1") || strE.startsWith("avc3")) {
            return "video/avc";
        }
        if (strE.startsWith("hev1") || strE.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strE.startsWith("dvav") || strE.startsWith("dva1") || strE.startsWith("dvhe") || strE.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strE.startsWith("av01")) {
            return "video/av01";
        }
        if (strE.startsWith("vp9") || strE.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strE.startsWith("vp8") || strE.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!strE.startsWith("mp4a")) {
            return strE.startsWith("mha1") ? "audio/mha1" : strE.startsWith("mhm1") ? "audio/mhm1" : (strE.startsWith("ac-3") || strE.startsWith("dac3")) ? "audio/ac3" : (strE.startsWith("ec-3") || strE.startsWith("dec3")) ? "audio/eac3" : strE.startsWith("ec+3") ? "audio/eac3-joc" : (strE.startsWith("ac-4") || strE.startsWith("dac4")) ? "audio/ac4" : strE.startsWith("dtsc") ? "audio/vnd.dts" : strE.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (strE.startsWith("dtsh") || strE.startsWith("dtsl")) ? "audio/vnd.dts.hd" : strE.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : strE.startsWith("opus") ? "audio/opus" : strE.startsWith("vorbis") ? "audio/vorbis" : strE.startsWith("flac") ? "audio/flac" : strE.startsWith("stpp") ? "application/ttml+xml" : strE.startsWith("wvtt") ? "text/vtt" : strE.contains("cea708") ? "application/cea-708" : (strE.contains("eia608") || strE.contains("cea608")) ? "application/cea-608" : c(strE);
        }
        if (strE.startsWith("mp4a.") && (bVarG = g(strE)) != null) {
            strF = f(bVarG.f79529a);
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
    @VisibleForTesting
    public static b g(String str) {
        Matcher matcher = f79525b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) s7.a.e(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    public static String h(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int i(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (l(str)) {
            return 1;
        }
        if (o(str)) {
            return 2;
        }
        if (n(str)) {
            return 3;
        }
        if (m(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return j(str);
    }

    public static int j(String str) {
        int size = f79524a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f79524a.get(i10);
            if (str.equals(aVar.f79526a)) {
                return aVar.f79528c;
            }
        }
        return -1;
    }

    @Nullable
    public static String k(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : m0.J0(str)) {
            String strE = e(str2);
            if (strE != null && o(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean l(@Nullable String str) {
        return "audio".equals(h(str));
    }

    public static boolean m(@Nullable String str) {
        return "image".equals(h(str));
    }

    public static boolean n(@Nullable String str) {
        return "text".equals(h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean o(@Nullable String str) {
        return "video".equals(h(str));
    }

    public static String p(String str) {
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
