package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bo extends bd {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f965 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f968;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f969 = {1822570755, 561632285, -736641796, 1725186181, -1046851615, 181372043, 76972103, -1511596420, 857250591, 205748874, 1401158660, 1879072045, 744993969, -1676703876, -2009151104, -268656751, 328320185, -287828179};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f970 = -3305206215475391646L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f967 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f966 = 0;

    public bo(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Enum m5094(String str) {
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode == 556003820) {
            if ((str.equals(m5114(new int[]{-533401839, -2077724314, -866858875, -1900723453, -1397141540, -46887536, -379821116, 155711183, -835834685, 1240962130, -1078183858, 1702363360}, 22 - Process.getGidForName("")).intern()) ? (char) 17 : '^') != '^') {
                int i10 = f965 + 33;
                f968 = i10 % 128;
                int i11 = i10 % 2;
                b10 = 0;
            }
        } else if (iHashCode != 556062505) {
            if (iHashCode == 1382961856 && str.equals(m5114(new int[]{-533401839, -2077724314, -866858875, -1900723453, -1397141540, -46887536, -1279621191, 1196219640, -1029793204, 195985504, 654384059, 1572571030}, TextUtils.indexOf("", "") + 22).intern())) {
                b10 = 2;
            }
        } else if (str.equals(m5114(new int[]{-533401839, -2077724314, -866858875, -1900723453, -1397141540, -46887536, -379821116, 155711183, 519211770, 1159879649, 1462259363, -1116500272}, 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
            int i12 = f968 + 37;
            f965 = i12 % 128;
            int i13 = i12 % 2;
            b10 = 1;
        }
        if (b10 == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (b10 == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (b10 != 2) {
            return null;
        }
        return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Enum m5095(String str) {
        byte b10 = -1;
        int iHashCode = str.hashCode();
        if (iHashCode == -1097819034) {
            if (!(str.equals(m5114(new int[]{1102338735, 534718331, -204734387, 1529807113, 832435028, 459668408, -2097949543, -1843881562, 1918117154, -1962707943, 31598433, -1919389046, -1438694206, 1262262860}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25).intern()) ? false : true)) {
                int i10 = f965 + 75;
                f968 = i10 % 128;
                int i11 = i10 % 2;
                b10 = 1;
            }
        } else if (iHashCode == 1554700484) {
            if ((str.equals(m5114(new int[]{1102338735, 534718331, -204734387, 1529807113, 832435028, 459668408, -379821116, 155711183, -681195772, -1914989498, -1576867718, -323308626}, 22 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) ? 'K' : (char) 20) == 'K') {
                int i12 = f968 + 71;
                f965 = i12 % 128;
                int i13 = i12 % 2;
                b10 = 0;
            }
        }
        if (b10 == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (b10 != 1) {
            return null;
        }
        return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Object m5096(Ad ad2) {
        int i10 = f965 + 25;
        f968 = i10 % 128;
        int i11 = i10 % 2;
        String webVast = ad2.getWebVast();
        int i12 = f968 + 71;
        f965 = i12 % 128;
        if ((i12 % 2 == 0 ? '4' : '(') != '4') {
            return webVast;
        }
        int i13 = 50 / 0;
        return webVast;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ Enum m5097(String str) {
        int i10 = f968 + 37;
        f965 = i10 % 128;
        int i11 = i10 % 2;
        Enum enumM5098 = m5098(str);
        int i12 = f965 + 123;
        f968 = i12 % 128;
        if (i12 % 2 == 0) {
            return enumM5098;
        }
        int i13 = 23 / 0;
        return enumM5098;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Enum m5098(String str) {
        int i10 = f968 + 61;
        f965 = i10 % 128;
        if (i10 % 2 == 0) {
            str.hashCode();
            throw null;
        }
        int iHashCode = str.hashCode();
        byte b10 = -1;
        if (iHashCode == -2102692847) {
            if (str.equals(m5114(new int[]{-849780843, 820159304, 652968498, -1366426546, -1958649305, -852406639, 438079687, 2100759176, 1488503172, 861283917, -186541523, -1279779442}, View.combineMeasuredStates(0, 0) + 24).intern())) {
                int i11 = f968 + 39;
                f965 = i11 % 128;
                b10 = i11 % 2 == 0 ? (byte) 5 : (byte) 2;
            }
        } else if (iHashCode == -1357644918) {
            if (!(str.equals(m5114(new int[]{-849780843, 820159304, 652968498, -1366426546, -1958649305, -852406639, 438079687, 2100759176, 1006716680, -396084949, -2077871020, 81795541}, (ViewConfiguration.getScrollBarSize() >> 8) + 22).intern()) ? false : true)) {
                b10 = 1;
            }
        } else if (iHashCode == 235669401) {
            if (!(!str.equals(m5114(new int[]{-849780843, 820159304, 652968498, -1366426546, -1958649305, -852406639, 438079687, 2100759176, -886459857, -1351455131, -1557625610, 1566162114}, 24 - KeyEvent.keyCodeFromString("")).intern()))) {
                b10 = 0;
            }
        }
        if (b10 == 0) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
        }
        if (b10 == 1) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
        }
        if (b10 == 2) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
        }
        int i12 = f968 + 75;
        f965 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Object m5099(Ad ad2) {
        int i10 = f968 + 113;
        f965 = i10 % 128;
        int i11 = i10 % 2;
        String creativeId = ad2.getCreativeId();
        int i12 = f968 + 107;
        f965 = i12 % 128;
        int i13 = i12 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ Enum m5100(String str) {
        int i10 = f968 + 63;
        f965 = i10 % 128;
        int i11 = i10 % 2;
        Enum enumM5094 = m5094(str);
        int i12 = f968 + 35;
        f965 = i12 % 128;
        if (i12 % 2 != 0) {
            return enumM5094;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Object m5101(Ad ad2) {
        int i10 = f965 + 17;
        f968 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '@' : '$';
        Map<String, String> rewards = ad2.getRewards();
        if (c10 == '@') {
            int i11 = 55 / 0;
        }
        int i12 = f965 + 23;
        f968 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return rewards;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m5102(AdContainer adContainer) {
        int i10 = f968 + 41;
        f965 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5115 = m5115(adContainer);
        int i12 = f968 + 39;
        f965 = i12 % 128;
        int i13 = i12 % 2;
        return objM5115;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m5103(Ad ad2) {
        int i10 = f968 + 109;
        f965 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5107 = m5107(ad2);
        int i12 = f965 + 9;
        f968 = i12 % 128;
        int i13 = i12 % 2;
        return objM5107;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Object m5104(AdResponse adResponse) {
        int i10 = f965 + 107;
        f968 = i10 % 128;
        int i11 = i10 % 2;
        List<AdSet> adSets = adResponse.getAdSets();
        int i12 = f968 + 27;
        f965 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return adSets;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m5105(ContextData contextData) {
        int i10 = f968 + 115;
        f965 = i10 % 128;
        if ((i10 % 2 == 0 ? '9' : '(') == '(') {
            return m5118(contextData);
        }
        m5118(contextData);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Enum m5106(String str) {
        int i10 = f965 + 63;
        f968 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '6' : (char) 11;
        Enum enumM5095 = m5095(str);
        if (c10 != 11) {
            int i11 = 32 / 0;
        }
        int i12 = f965 + 89;
        f968 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 20 : 'P') != 20) {
            return enumM5095;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m5107(Ad ad2) {
        int i10 = f965 + 79;
        f968 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            ad2.getContextData();
            throw null;
        }
        ContextData contextData = ad2.getContextData();
        int i11 = f968 + 111;
        f965 = i11 % 128;
        if (i11 % 2 != 0) {
            return contextData;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m5108(AdResponse adResponse) {
        int i10 = f968 + 11;
        f965 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5120 = m5120(adResponse);
        int i12 = f968 + 121;
        f965 = i12 % 128;
        int i13 = i12 % 2;
        return objM5120;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m5109(AdSet adSet) {
        int i10 = f968 + 33;
        f965 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5112 = m5112(adSet);
        int i12 = f968 + 123;
        f965 = i12 % 128;
        int i13 = i12 % 2;
        return objM5112;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m5110(Ad ad2) {
        int i10 = f965 + 89;
        f968 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'M' : (char) 31;
        Object objM5096 = m5096(ad2);
        if (c10 == 'M') {
            int i11 = 1 / 0;
        }
        return objM5096;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m5111(AdResponse adResponse) {
        int i10 = f968 + 103;
        f965 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5104 = m5104(adResponse);
        int i12 = f965 + 55;
        f968 = i12 % 128;
        int i13 = i12 % 2;
        return objM5104;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Object m5112(AdSet adSet) {
        int i10 = f968 + 111;
        f965 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'a' : (char) 21;
        Boolean boolValueOf = Boolean.valueOf(adSet.isRewarded());
        if (c10 != 21) {
            int i11 = 61 / 0;
        }
        return boolValueOf;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5113(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2695) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2697 = 0;
            while (true) {
                int i11 = j.f2697;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2696 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2697;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f970) ^ ((long) f967)) ^ ((long) f966));
                    j.f2697 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5114(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f969.clone();
            e.f1935 = 0;
            while (true) {
                int i11 = e.f1935;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1937 = (c10 << 16) + c11;
                    e.f1936 = (c12 << 16) + c13;
                    e.m6211(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1937 ^ iArr2[i13];
                        e.f1937 = i14;
                        e.f1936 = e.m6210(i14) ^ e.f1936;
                        int i15 = e.f1937;
                        e.f1937 = e.f1936;
                        e.f1936 = i15;
                    }
                    int i16 = e.f1937;
                    e.f1937 = e.f1936;
                    e.f1936 = i16;
                    e.f1936 = i16 ^ iArr2[16];
                    e.f1937 ^= iArr2[17];
                    int i17 = e.f1935;
                    int i18 = e.f1937;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1936;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m6211(iArr2);
                    int i20 = e.f1935;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1935 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m5115(AdContainer adContainer) {
        int i10 = f968 + 81;
        f965 = i10 % 128;
        int i11 = i10 % 2;
        Object dataModel = adContainer.getDataModel();
        int i12 = f965 + 85;
        f968 = i12 % 128;
        int i13 = i12 % 2;
        return dataModel;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m5116(Ad ad2) {
        int i10 = f968 + 113;
        f965 = i10 % 128;
        if ((i10 % 2 == 0 ? '/' : (char) 27) != 27) {
            m5101(ad2);
            throw null;
        }
        Object objM5101 = m5101(ad2);
        int i11 = f968 + 81;
        f965 = i11 % 128;
        int i12 = i11 % 2;
        return objM5101;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m5117(AdSet adSet) {
        int i10 = f968 + 25;
        f965 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'C' : (char) 2;
        Object objM5121 = m5121(adSet);
        if (c10 == 'C') {
            int i11 = 28 / 0;
        }
        int i12 = f965 + 85;
        f968 = i12 % 128;
        if ((i12 % 2 != 0 ? '*' : ' ') == ' ') {
            return objM5121;
        }
        int i13 = 75 / 0;
        return objM5121;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m5118(ContextData contextData) {
        int i10 = f965 + 43;
        f968 = i10 % 128;
        if ((i10 % 2 != 0 ? ';' : 'B') != 'B') {
            contextData.getAdvertisedContent();
            throw null;
        }
        String advertisedContent = contextData.getAdvertisedContent();
        int i11 = f965 + 19;
        f968 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 15 : 'N') != 15) {
            return advertisedContent;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m5119(Ad ad2) {
        int i10 = f965 + 11;
        f968 = i10 % 128;
        int i11 = i10 % 2;
        Object objM5099 = m5099(ad2);
        int i12 = f968 + 13;
        f965 = i12 % 128;
        if (i12 % 2 != 0) {
            return objM5099;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m5120(AdResponse adResponse) {
        int i10 = f968 + 91;
        f965 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            adResponse.getPlacementId();
            throw null;
        }
        Long lValueOf = Long.valueOf(adResponse.getPlacementId());
        int i11 = f965 + 31;
        f968 = i11 % 128;
        if ((i11 % 2 != 0 ? '_' : '5') == '5') {
            return lValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m5121(AdSet adSet) {
        int i10 = f965 + 21;
        f968 = i10 % 128;
        if (i10 % 2 == 0) {
            return adSet.getAds();
        }
        adSet.getAds();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5113("\udb3c홵룾່Ꮇ㕻薷ꄊ趴켊㚂ૠ开\u1f58篔䕇㻘\uf0a2䮹\udc79", (char) ((Process.getThreadPriority(0) + 20) >> 6), "።焭豵툡", ViewConfiguration.getEdgeSlop() >> 16, "䱞ꪏ峹肦").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5106((String) list.get(0));
            }
        });
        map.put(m5114(new int[]{-1725793521, -730295222, 1516941440, -713607251, 789143033, 1596857308, 1725840726, 1318708095, -480786985, -2072795879}, 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5100((String) list.get(0));
            }
        });
        map.put(m5114(new int[]{1528012993, -984151626, -235226750, -1619835214, 646132679, -1699319494}, (-16777204) - Color.rgb(0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5102((AdContainer) list.get(0));
            }
        });
        map.put(m5113("삃蕿향凝啌滶䗥\ud8d1彄솰쟁\uf88b릆Ꮻ䪥\ue13b\ud9e1", (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 22973), "።焭豵툡", (-2142027376) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "輾十부彙").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5097((String) list.get(0));
            }
        });
        map.put(m5113("廹䫆\uf4e6ୠ纼廙毮⻌\ued62䝲ꜝ餍夂㺟", (char) (10641 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), "።焭豵툡", ImageFormat.getBitsPerPixel(0) + 1, "ₔ奙酢䄩").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5108((AdResponse) list.get(0));
            }
        });
        map.put(m5113("逡\ue9ecꔠ룙次ᛔ⽊豀ꄂ", (char) Color.red(0), "።焭豵툡", TextUtils.indexOf("", "") - 233891051, "ᕬ༛鱗춝").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5111((AdResponse) list.get(0));
            }
        });
        map.put(m5114(new int[]{-597077963, -1031637315, 919882452, -1324736608, 1721267046, -1545526047}, View.MeasureSpec.getMode(0) + 10).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5109((AdSet) list.get(0));
            }
        });
        map.put(m5114(new int[]{-1725793521, -730295222, -1912473807, -354177865}, (ViewConfiguration.getPressedStateDuration() >> 16) + 6).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5117((AdSet) list.get(0));
            }
        });
        map.put(m5113("ﮦ⮅呔턃プ뿟腫⟢曧ⶈ裐\ueb9c\uedd8ƻ", (char) (56609 - TextUtils.lastIndexOf("", '0')), "።焭豵툡", ExpandableListView.getPackedPositionType(0L), "ᴱ篘∝嗝").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5103((Ad) list.get(0));
            }
        });
        map.put(m5113("\ue51f⺫ቭ\udc1aⱑꊁ̀튟Ȫ鐖", (char) View.getDefaultSize(0, 0), "።焭豵툡", TextUtils.getOffsetBefore("", 0), "㐫쬑塪̼").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5116((Ad) list.get(0));
            }
        });
        map.put(m5114(new int[]{1752849683, 1688297142, 1224009197, -2053678699, 688876440, 1077574284}, 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5110((Ad) list.get(0));
            }
        });
        map.put(m5114(new int[]{1860770838, -478187289, -1596450849, 37691170, 794507622, 1934799711, 203279309, -367153691}, Color.blue(0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5119((Ad) list.get(0));
            }
        });
        map.put(m5113("뒖砼㥼⍷Ϩ㌶칆\udc34\uf290팽ᅽ쇧⿒\ueb95詰ⴧ䅟\ue393\ue5c1\uf065", (char) (KeyEvent.getMaxKeyCode() >> 16), "።焭豵툡", View.MeasureSpec.makeMeasureSpec(0, 0), "\ueac3⻔験\uf2e1").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bo.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bo.m5105((ContextData) list.get(0));
            }
        });
        int i10 = f968 + 75;
        f965 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f968 + 21;
        f965 = i10 % 128;
        if ((i10 % 2 == 0 ? '\"' : (char) 28) == 28) {
            return InMobiSdk.getVersion();
        }
        InMobiSdk.getVersion();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c4 A[PHI: r9
      0x03c4: PHI (r9v13 byte) = 
      (r9v1 byte)
      (r9v2 byte)
      (r9v3 byte)
      (r9v4 byte)
      (r9v5 byte)
      (r9v6 byte)
      (r9v7 byte)
      (r9v8 byte)
      (r9v9 byte)
      (r9v10 byte)
      (r9v11 byte)
      (r9v12 byte)
      (r9v14 byte)
     binds: [B:105:0x03c0, B:101:0x03a2, B:96:0x0379, B:93:0x035d, B:90:0x033e, B:84:0x0312, B:81:0x02f2, B:78:0x02d1, B:74:0x02a8, B:67:0x027c, B:64:0x025a, B:61:0x0238, B:4:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 1536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bo.mo4814(java.lang.String):java.lang.Class");
    }
}
