package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class br extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1014 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1015 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1016 = -7017710411839432555L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1017 = 6795495270814316623L;

    public br(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static String m5165(ImpressionData impressionData) {
        int i10 = f1015 + 55;
        f1014 = i10 % 128;
        int i11 = i10 % 2;
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i12 = f1015 + 59;
        f1014 = i12 % 128;
        if ((i12 % 2 == 0 ? 'O' : (char) 31) == 31) {
            return advertiserDomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static String m5166(ImpressionData impressionData) {
        int i10 = f1015 + 75;
        f1014 = i10 % 128;
        int i11 = i10 % 2;
        String campaignId = impressionData.getCampaignId();
        int i12 = f1015 + 117;
        f1014 = i12 % 128;
        int i13 = i12 % 2;
        return campaignId;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static String m5167(ImpressionData impressionData) {
        int i10 = f1014 + 37;
        f1015 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String creativeId = impressionData.getCreativeId();
        if (z10) {
            int i11 = 61 / 0;
        }
        int i12 = f1014 + 125;
        f1015 = i12 % 128;
        int i13 = i12 % 2;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static double m5168(ImpressionData impressionData) {
        int i10 = f1014 + 9;
        f1015 = i10 % 128;
        int i11 = i10 % 2;
        double netPayout = impressionData.getNetPayout();
        int i12 = f1014 + 29;
        f1015 = i12 % 128;
        int i13 = i12 % 2;
        return netPayout;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static MediationManager m5169() {
        MediationManager companion;
        int i10 = f1015 + 73;
        f1014 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            companion = MediationManager.Companion.getInstance();
            int i11 = 31 / 0;
        } else {
            companion = MediationManager.Companion.getInstance();
        }
        int i12 = f1014 + 73;
        f1015 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return companion;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m5170(ImpressionData impressionData) {
        int i10 = f1015 + 87;
        f1014 = i10 % 128;
        int i11 = i10 % 2;
        String demandSource = impressionData.getDemandSource();
        int i12 = f1014 + 27;
        f1015 = i12 % 128;
        int i13 = i12 % 2;
        return demandSource;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m5171(ImpressionData impressionData) {
        int i10 = f1014 + 81;
        f1015 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String variantId = impressionData.getVariantId();
        if (!z10) {
            int i11 = 19 / 0;
        }
        return variantId;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean m5172() {
        int i10 = f1015 + 67;
        f1014 = i10 % 128;
        int i11 = i10 % 2;
        boolean zAssertStarted = FairBid.assertStarted();
        int i12 = f1015 + 125;
        f1014 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 7 : '\\') == '\\') {
            return zAssertStarted;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m5173(ImpressionData impressionData) {
        int i10 = f1015 + 117;
        f1014 = i10 % 128;
        if ((i10 % 2 == 0 ? '`' : (char) 19) != '`') {
            return impressionData.getRenderingSdkVersion();
        }
        impressionData.getRenderingSdkVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m5174(ImpressionData impressionData) {
        int i10 = f1015 + 115;
        f1014 = i10 % 128;
        if ((i10 % 2 == 0 ? ' ' : 'J') != ' ') {
            return impressionData.getRenderingSdk();
        }
        impressionData.getRenderingSdk();
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ MediationManager m5175() {
        int i10 = f1014 + 97;
        f1015 = i10 % 128;
        int i11 = i10 % 2;
        MediationManager mediationManagerM5169 = m5169();
        int i12 = f1015 + 67;
        f1014 = i12 % 128;
        int i13 = i12 % 2;
        return mediationManagerM5169;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m5176(ImpressionData impressionData) {
        int i10 = f1015 + 75;
        f1014 = i10 % 128;
        int i11 = i10 % 2;
        String strM5165 = m5165(impressionData);
        int i12 = f1014 + 41;
        f1015 = i12 % 128;
        int i13 = i12 % 2;
        return strM5165;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ double m5177(ImpressionData impressionData) {
        int i10 = f1015 + 13;
        f1014 = i10 % 128;
        if ((i10 % 2 == 0 ? '?' : (char) 4) == 4) {
            return m5168(impressionData);
        }
        m5168(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m5178() {
        int i10 = f1015 + 119;
        f1014 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM5172 = m5172();
        int i12 = f1015 + 121;
        f1014 = i12 % 128;
        if (i12 % 2 != 0) {
            return zM5172;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ String m5179(ImpressionData impressionData) {
        int i10 = f1014 + 87;
        f1015 = i10 % 128;
        int i11 = i10 % 2;
        String strM5166 = m5166(impressionData);
        int i12 = f1015 + 5;
        f1014 = i12 % 128;
        int i13 = i12 % 2;
        return strM5166;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ String m5180(ImpressionData impressionData) {
        int i10 = f1014 + 47;
        f1015 = i10 % 128;
        int i11 = i10 % 2;
        String strM5167 = m5167(impressionData);
        int i12 = f1014 + 63;
        f1015 = i12 % 128;
        int i13 = i12 % 2;
        return strM5167;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static PlacementType m5181(ImpressionData impressionData) {
        int i10 = f1015 + 33;
        f1014 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getPlacementType();
        }
        impressionData.getPlacementType();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Constants.AdType m5182(String str) {
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1372958932:
                if (str.equals(m5206("ﵓﴚ䬔叏붯賑槸\u2002齕ㆮ⺅豘㦯陠䠼⸩", '1' - AndroidCharacter.getMirror('0')).intern())) {
                    int i10 = f1015 + 29;
                    f1014 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 2 : (byte) 5;
                }
                break;
            case 433141802:
                if ((str.equals(m5185("\uf81a緌\uf39e楦\uef34攙\udacf", Color.rgb(0, 0, 0) + 16811469).intern()) ? 'H' : 'O') == 'H') {
                    b10 = 0;
                }
                break;
            case 543046670:
                if (str.equals(m5185("\uf81d႙⤾䆷婑狔譸ꐎ", 59539 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b10 = 3;
                }
                break;
            case 1951953708:
                if ((str.equals(m5185("\uf80d뛵旷ᓰ쏦狺", 20219 - TextUtils.indexOf("", "")).intern()) ? ']' : '1') == ']') {
                    int i11 = f1014 + 51;
                    f1015 = i11 % 128;
                    int i12 = i11 % 2;
                    b10 = 1;
                }
                break;
        }
        if (b10 == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (b10 == 1) {
            return Constants.AdType.BANNER;
        }
        if (b10 != 2) {
            if (b10 != 3) {
                return null;
            }
            return Constants.AdType.REWARDED;
        }
        Constants.AdType adType = Constants.AdType.INTERSTITIAL;
        int i13 = f1014 + 111;
        f1015 = i13 % 128;
        if (i13 % 2 == 0) {
            return adType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Constants.AdType m5183(Placement placement) {
        int i10 = f1014 + 41;
        f1015 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Constants.AdType adType = placement.getAdType();
        if (z10) {
            int i11 = 38 / 0;
        }
        return adType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5184(ImpressionData impressionData) {
        int i10 = f1014 + 25;
        f1015 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return m5171(impressionData);
        }
        m5171(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5185(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2041) {
            f.f2039 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2040 = 0;
            while (true) {
                int i11 = f.f2040;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f1017);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5186(InterstitialListener interstitialListener) {
        int i10 = f1014 + 13;
        f1015 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Interstitial.setInterstitialListener(interstitialListener);
        if (!z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m5187(RewardedListener rewardedListener) {
        int i10 = f1014 + 93;
        f1015 = i10 % 128;
        int i11 = i10 % 2;
        m5208(rewardedListener);
        int i12 = f1015 + 111;
        f1014 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m5188(Placement placement) {
        int i10 = f1015 + 17;
        f1014 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Constants.AdType adTypeM5183 = m5183(placement);
        if (!z10) {
            int i11 = 54 / 0;
        }
        int i12 = f1015 + 95;
        f1014 = i12 % 128;
        int i13 = i12 % 2;
        return adTypeM5183;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m5189(String str) {
        int i10 = f1014 + 45;
        f1015 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        Constants.AdType adTypeM5182 = m5182(str);
        if (!z10) {
            int i11 = 0 / 0;
        }
        return adTypeM5182;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5190(FairBid.AdsConfig adsConfig) {
        int i10 = f1014 + 11;
        f1015 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5194(adsConfig);
        }
        m5194(adsConfig);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5191(ImpressionData impressionData) {
        int i10 = f1015 + 51;
        f1014 = i10 % 128;
        if ((i10 % 2 == 0 ? 'T' : ')') == ')') {
            return m5170(impressionData);
        }
        m5170(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m5192(ImpressionData impressionData) {
        int i10 = f1015 + 121;
        f1014 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 16 : 'L') == 16) {
            m5181(impressionData);
            throw null;
        }
        PlacementType placementTypeM5181 = m5181(impressionData);
        int i11 = f1015 + 71;
        f1014 = i11 % 128;
        int i12 = i11 % 2;
        return placementTypeM5181;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PlacementsHandler m5193(MediationManager mediationManager) {
        int i10 = f1014 + 105;
        f1015 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            mediationManager.getPlacementsHandler();
            throw null;
        }
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        int i11 = f1015 + 29;
        f1014 = i11 % 128;
        int i12 = i11 % 2;
        return placementsHandler;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5194(FairBid.AdsConfig adsConfig) {
        int i10 = f1014 + 101;
        f1015 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '\n' : 'A';
        String str = adsConfig.store;
        if (c10 == '\n') {
            int i11 = 63 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5195(Placement placement) {
        int i10 = f1015 + 47;
        f1014 = i10 % 128;
        int i11 = i10 % 2;
        String name = placement.getName();
        int i12 = f1014 + 87;
        f1015 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return name;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m5196(MediationConfig mediationConfig) {
        int i10 = f1015 + 85;
        f1014 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '%' : 'D';
        List<AdapterConfiguration> listM5207 = m5207(mediationConfig);
        if (c10 != 'D') {
            int i11 = 12 / 0;
        }
        int i12 = f1015 + 31;
        f1014 = i12 % 128;
        if (i12 % 2 != 0) {
            return listM5207;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m5197(InterstitialListener interstitialListener) {
        int i10 = f1015 + 73;
        f1014 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m5186(interstitialListener);
        if (z10) {
            int i11 = 52 / 0;
        }
        int i12 = f1015 + 71;
        f1014 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m5198(Constants.AdType adType) {
        int i10 = f1014 + 61;
        f1015 = i10 % 128;
        int i11 = i10 % 2;
        PlacementType placementTypeM5201 = m5201(adType);
        int i12 = f1015 + 51;
        f1014 = i12 % 128;
        int i13 = i12 % 2;
        return placementTypeM5201;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5199(FairBid.AdsConfig adsConfig) {
        int i10 = f1014 + 7;
        f1015 = i10 % 128;
        if ((i10 % 2 != 0 ? 'B' : 'D') != 'D') {
            m5203(adsConfig);
            throw null;
        }
        String strM5203 = m5203(adsConfig);
        int i11 = f1014 + 17;
        f1015 = i11 % 128;
        int i12 = i11 % 2;
        return strM5203;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5200(ImpressionData impressionData) {
        int i10 = f1014 + 95;
        f1015 = i10 % 128;
        int i11 = i10 % 2;
        String strM5173 = m5173(impressionData);
        int i12 = f1015 + 91;
        f1014 = i12 % 128;
        int i13 = i12 % 2;
        return strM5173;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static PlacementType m5201(Constants.AdType adType) {
        int i10 = f1015 + 103;
        f1014 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        PlacementType placementType = adType.getPlacementType();
        if (z10) {
            int i11 = 72 / 0;
        }
        return placementType;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ PlacementsHandler m5202(MediationManager mediationManager) {
        int i10 = f1015 + 119;
        f1014 = i10 % 128;
        int i11 = i10 % 2;
        PlacementsHandler placementsHandlerM5193 = m5193(mediationManager);
        int i12 = f1014 + 37;
        f1015 = i12 % 128;
        if ((i12 % 2 != 0 ? '.' : 'L') == 'L') {
            return placementsHandlerM5193;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5203(FairBid.AdsConfig adsConfig) {
        int i10 = f1014 + 55;
        f1015 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String str = adsConfig.appId;
        if (z10) {
            throw null;
        }
        int i11 = f1014 + 75;
        f1015 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            return str;
        }
        int i12 = 58 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5204(ImpressionData impressionData) {
        int i10 = f1014 + 77;
        f1015 = i10 % 128;
        int i11 = i10 % 2;
        String strM5174 = m5174(impressionData);
        int i12 = f1015 + 17;
        f1014 = i12 % 128;
        int i13 = i12 % 2;
        return strM5174;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5205(Placement placement) {
        int i10 = f1015 + 27;
        f1014 = i10 % 128;
        int i11 = i10 % 2;
        String strM5195 = m5195(placement);
        int i12 = f1015 + 97;
        f1014 = i12 % 128;
        if ((i12 % 2 == 0 ? 'C' : 'Q') != 'C') {
            return strM5195;
        }
        int i13 = 59 / 0;
        return strM5195;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5206(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f1016, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f1016));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<AdapterConfiguration> m5207(MediationConfig mediationConfig) {
        int i10 = f1015 + 1;
        f1014 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '8' : '4';
        List<AdapterConfiguration> adapterConfigurations = mediationConfig.getAdapterConfigurations();
        if (c10 != '4') {
            int i11 = 88 / 0;
        }
        return adapterConfigurations;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m5208(RewardedListener rewardedListener) {
        int i10 = f1014 + 25;
        f1015 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        Rewarded.setRewardedListener(rewardedListener);
        if (z10) {
            int i11 = 10 / 0;
        }
        int i12 = f1014 + 15;
        f1015 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5185("\uf828䬇鹡\ue185㒞蟊쬨ḕ慓뒳ߢ䫎鸞\ue167㑗融쫸ᷗ愗둑ޥ䪍鷥\ue125㐙蝉쪸", View.getDefaultSize(0, 0) + 45869).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5175();
            }
        });
        map.put(m5206("곜겻㠞⃮䬌穒㻆眸컬䊣\ud80b\udb5b树\ue573뺲社詃ߪፇߦ◢馏\uf122ꑎ䜈㱂", -TextUtils.indexOf((CharSequence) "", '0')).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5198((Constants.AdType) list.get(0));
            }
        });
        map.put(m5185("\uf828삳褉凍ᩆ\ue2c2ꮫ琅㳴՝췜隳弍⟎\ue070\ua8cc熾㨶ˡ쭵鏘岧┄\ued95뙹绊䞑\u0015좃酿", View.getDefaultSize(0, 0) + 14489).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5192((ImpressionData) list.get(0));
            }
        });
        map.put(m5206("ꅿꄘ斒絢㋽Σꦔ\ue062썆Ἃꇱ䰔斤룜읆\uee6a蟭婇檺邭⡎쐥裢㌃䪿懎⹁함\uece9\u0378䶌瞱ᅘ", -Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5204((ImpressionData) list.get(0));
            }
        });
        map.put(m5206("\uec0f\uec68趠镐㏠ʾ佟ک踶\uf739ꃬ꫟⣔僮왛ࢡ쪝뉵殧癦放Ⱇ觿허ߏ觼⽜㎣ꆙ\ueb4a䲑酺尨䔗틳ﳐﻜ\ua6fc灅媘", 1 - TextUtils.indexOf("", "", 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5200((ImpressionData) list.get(0));
            }
        });
        map.put(m5185("\uf828넩樽⌏\udc2e锰丯ܿ뀤椧∸\udb01鐅䴬\u0604뼖栞ℸ\uda1c錛䰒Ԟ빩睙\u2068\ud971鉳䭽Ѿ", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18691).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5191((ImpressionData) list.get(0));
            }
        });
        map.put(m5185("\uf828兕\uaac5ѻ州띄Ç婓도ോ曐끕\u09d5捸볜ᙊ濞륶ዀ汐엊ὅ棋쉒ᯮ界", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43391).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5184((ImpressionData) list.get(0));
            }
        });
        map.put(m5185("\uf828劕굅\uf83b勞궄\uf847匓귄\uf88b卐긕\uf8d5厸깜金叞꺮籠吖껳礪呜꼉戮咜", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43710).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Double.valueOf(br.m5177((ImpressionData) list.get(0)));
            }
        });
        map.put(m5206("旹斞䩇劷顖꤈Ꟃ\uee34߀マ\u0b5a䉂ꄢ霉淭\ue03c䍫疒쀑黻\uecc8\uebe1≞㵞踼上蓱\udb21⡤ⲃ\ue710", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.22
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5180((ImpressionData) list.get(0));
            }
        });
        map.put(m5185("\uf828픷ꈁ网䱖\u19ae\uf693쏡郔渹㬄ࠟ\ue57d뉲辸岈⧾ۣ퐡ꄞ繮䭜ᡅ\uf5bd슄鿿泏㨄ᜌ\ue46b녈躥宁", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11549).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5176((ImpressionData) list.get(0));
            }
        });
        map.put(m5206("馣駄귷딇\udd5b\uec05뤰\uf0c6ﮚ흮乗岰嵸点⣠ﻎ뼱鈢蔜耉႒\u0c51杀⎤牷ꦯ쇼엂퐵쬳ꈝ", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5179((ImpressionData) list.get(0));
            }
        });
        map.put(m5206("舮艉ᔻ\u0dcb\uea6c\udb32⸆柸\ue00a澢祛쮏", TextUtils.getOffsetBefore("", 0) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5199((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m5185("\uf828⣍姵誩뮧\ueca3ᵗ乻", 53479 - TextUtils.getCapsMode("", 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5190((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m5185("\uf828\u0df1ᎍᦟ⽇㕩㬝䃆囲岎抂桉繥萶觜鿽ꖊꮶ녈읺촺틗\ud8f3\uee91", 62939 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5196((MediationConfig) list.get(0));
            }
        });
        map.put(m5185("\uf828䱁郭\ue55e⦏縹슮ᛇ孺꿩\uf40f㢢贊텄◁橳뺏̱", 46187 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5188((Placement) list.get(0));
            }
        });
        map.put(m5185("\uf828۽֕ҚͿȝĦ࿋ບඥేଆਕࣅ០ᚳ", TextUtils.indexOf("", "", 0, 0) + 65239).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5205((Placement) list.get(0));
            }
        });
        map.put(m5185("\uf828\ueca7턡언ꨗ黯荢矱届䃟㖣ᨴຠ\uf32e\ue798챢냻ꕾ觀繊", 5261 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5202((MediationManager) list.get(0));
            }
        });
        map.put(m5185("\uf828쵏鋱堡\u2dbf\uf2e2롨跼匂ᢇ\uedd3덭碞", 13669 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return br.m5189((String) list.get(0));
            }
        });
        map.put(m5185("\uf83c楋\udaf9䰥붥⻞遬ƚ猴\ue452嗬윐⢪駃୭粬\uee36彍샩㈙ꎵᓟ虫", TextUtils.getCapsMode("", 0, 0) + 37217).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                br.m5197((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m5185("\uf83c弿똑ഢ摾뭑ቐ榮삃➗绹헤Ⳛ萭\udb1d㈑襱\ue04f䝇", View.MeasureSpec.getSize(0) + 42773).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                br.m5187((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m5185("\uf82e걯傚ӓꥱ嶤Ǯ뙾媶໖댅枻\u0bcf", 21587 - TextUtils.getTrimmedLength("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Boolean.valueOf(br.m5178());
            }
        });
        int i10 = f1015 + 97;
        f1014 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f1014 + 53;
        f1015 = i10 % 128;
        try {
            try {
                String str = (String) ((i10 % 2 != 0 ? '9' : 'B') != 'B' ? FairBid.class.getDeclaredField(m5185("\uf81c՚ʦ\u0fe3൝ટ\u17fbᔫ\u128eῙᴫ", 16842065 >>> Color.rgb(1, 1, 0)).intern()) : FairBid.class.getDeclaredField(m5185("\uf81c՚ʦ\u0fe3൝ટ\u17fbᔫ\u128eῙᴫ", Color.rgb(0, 0, 0) + 16842065).intern())).get(null);
                int i11 = f1014 + 103;
                f1015 = i11 % 128;
                if ((i11 % 2 != 0 ? '4' : '+') == '+') {
                    return str;
                }
                int i12 = 81 / 0;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return hu.m6425().m6427().m6527(FairBid.class, m5206("턩텷攡緯ࣥ㦓̠䫻댠ΰ鯀\ue6c6ᗜ롇ﵫ䓸\uf788媛傘㩮堤쒟닃馐㫐愳ᐏ", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0281  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.br.mo4814(java.lang.String):java.lang.Class");
    }
}
