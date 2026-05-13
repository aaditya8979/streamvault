package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.qq.e.ads.ADActivity;
import com.qq.e.ads.DialogActivity;
import com.qq.e.ads.LandscapeADActivity;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.PortraitADActivity;
import com.qq.e.ads.RewardvideoLandscapeADActivity;
import com.qq.e.ads.RewardvideoPortraitADActivity;
import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.pi.ACTD;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class cf extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1323 = {30, 'U', 'p', 'y', '^', 'E', 'P', 'P', '`', 'y', '|', '}', '}', '|', 132, '|', 'w', '|', '[', ']', 127, ']', 'W', ' ', 'R', 'k', 'n', 'o', 'o', 'n', 'v', '^', 'V', 'e', 'f', 'm', 'k', '4', 'V', '9', 'P', 'k', 'b', 'G', 'I', 'I', 'O', 'q', 'O', 'M', 'n', 'i', 'n', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'T', 'k', 'm', 'f', 'l', 199, 183, 183, 200, 223, 221, 215, 224, 224, 222, 220, 203, 215, 235, 227, 228, 228, 227, '9', 's', 's', 'i', 'e', 'n', 'Z', 'B', 'B', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'n', 'i', 'n', 'M', 'O', 'q', 'O', 'I', 'I', 'G', 'b', 'k', 'P', '?', '_', 304, 291, 270, 305, 295, 294, 299, 312, 294, 308, 291, 313, 295, 276, 315, 310, 299, 312, 299, 310, 293, 259, 262, 259, 295, 306, 291, 293, 309, 294, 'G', 140, 160, 176, 175, 184, 184, 184, 189, 188, 181, 182, 187, 165, 160, 174, 177, 177, 177, 181, 171, ')', '[', 'n', 'l', 'i', 'k', ']', '_', 'f', 'd', 'j', 'X', 'B', '&', ']', 'h', 'b', 'R', 'R', 'Z', 'X', 'i', 'i', 'g', 'p', '*', 'a', 'k', 'g', 'g', 'g', 'd', 'S', 'Q', 'g', 'n', 'i', 'k', 'd', '_', 'g', 'n', '2', 'i', 'i', 'l', 's', 'n', 'Z', 'H', 'B', 'Y', 'k', 'i', 'n', 'g', 'Q', 'S', 'd', 'g', 'g', 'g', 'k', 'a', 'c', '1', 'c', 'l', '[', 'C', 'I', '[', 'o', 'm', 'T', 'R', 'k', 't', 't', '9', 'k', 'i', 'i', 'l', 's', 'n', 'Z', 'H', 'B', 'U', 170, 176, 161, 137, 144, 142, 150, 156, 155, 171, 174, 170, 175, '3', 'f', 'l', 'Z', 'X', 'p', '\\', 'V', '<', 'v', 's', 'i', 'U', '[', 'j', 'j', 'k', 'f', 'l', '\\', '8', 'u', 127, 'q', 'g', ']', ']', 'v', 't', 'w', 'y', 'f', 'n', 'w', 'q'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1324 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1325 = 2149923499359415332L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1326;

    public cf(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static IGDTAdManager m5588() {
        int i10 = f1326 + 89;
        f1324 = i10 % 128;
        int i11 = i10 % 2;
        IGDTAdManager gDTAdManger = GDTAdSdk.getGDTAdManger();
        int i12 = f1324 + 105;
        f1326 = i12 % 128;
        if (i12 % 2 == 0) {
            return gDTAdManger;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ IGDTAdManager m5589() {
        IGDTAdManager iGDTAdManagerM5588;
        int i10 = f1324 + 63;
        f1326 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 24 : (char) 26) != 24) {
            iGDTAdManagerM5588 = m5588();
        } else {
            iGDTAdManagerM5588 = m5588();
            int i11 = 23 / 0;
        }
        int i12 = f1324 + 59;
        f1326 = i12 % 128;
        int i13 = i12 % 2;
        return iGDTAdManagerM5588;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5590(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2470) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f1323, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2469 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2469;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2469 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2469 = 0;
                while (true) {
                    int i16 = i.f2469;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2469 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2469 = 0;
                while (true) {
                    int i17 = i.f2469;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2469 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map m5591(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i10 = f1326 + 57;
        f1324 = i10 % 128;
        int i11 = i10 % 2;
        Map ext = unifiedInterstitialAD.getExt();
        int i12 = f1324 + 15;
        f1326 = i12 % 128;
        if (i12 % 2 == 0) {
            return ext;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, String> m5592(RewardVideoAD rewardVideoAD) {
        int i10 = f1324 + 3;
        f1326 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        Map<String, String> exts = rewardVideoAD.getExts();
        if (!z10) {
            int i11 = 37 / 0;
        }
        int i12 = f1324 + 63;
        f1326 = i12 % 128;
        if ((i12 % 2 != 0 ? ')' : 'Z') != ')') {
            return exts;
        }
        int i13 = 42 / 0;
        return exts;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5593(String str, int i10) {
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
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f1325);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m5594(RewardVideoAD rewardVideoAD) {
        int i10 = f1326 + 39;
        f1324 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> mapM5592 = m5592(rewardVideoAD);
        int i12 = f1324 + 27;
        f1326 = i12 % 128;
        int i13 = i12 % 2;
        return mapM5592;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ int m5595(RewardVideoAD rewardVideoAD) {
        int i10 = f1324 + 31;
        f1326 = i10 % 128;
        int i11 = i10 % 2;
        int iM5598 = m5598(rewardVideoAD);
        int i12 = f1326 + 77;
        f1324 = i12 % 128;
        int i13 = i12 % 2;
        return iM5598;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5596(APPStatus aPPStatus) {
        int i10 = f1326 + 17;
        f1324 = i10 % 128;
        int i11 = i10 % 2;
        String strM5600 = m5600(aPPStatus);
        int i12 = f1326 + 1;
        f1324 = i12 % 128;
        int i13 = i12 % 2;
        return strM5600;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Map<String, Object> m5597(LiteAbstractAD liteAbstractAD) {
        int i10 = f1326 + 61;
        f1324 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, Object> extraInfo = liteAbstractAD.getExtraInfo();
        int i12 = f1326 + 109;
        f1324 = i12 % 128;
        int i13 = i12 % 2;
        return extraInfo;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m5598(RewardVideoAD rewardVideoAD) {
        int i10 = f1324 + 123;
        f1326 = i10 % 128;
        int i11 = i10 % 2;
        int rewardAdType = rewardVideoAD.getRewardAdType();
        int i12 = f1324 + 69;
        f1326 = i12 % 128;
        int i13 = i12 % 2;
        return rewardAdType;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Map m5599(LiteAbstractAD liteAbstractAD) {
        int i10 = f1324 + 49;
        f1326 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, Object> mapM5597 = m5597(liteAbstractAD);
        int i12 = f1326 + 45;
        f1324 = i12 % 128;
        int i13 = i12 % 2;
        return mapM5597;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5600(APPStatus aPPStatus) {
        int i10 = f1326 + 87;
        f1324 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return aPPStatus.getAPPID();
        }
        aPPStatus.getAPPID();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m5601(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i10 = f1324 + 35;
        f1326 = i10 % 128;
        int i11 = i10 % 2;
        Map mapM5591 = m5591(unifiedInterstitialAD);
        int i12 = f1324 + 39;
        f1326 = i12 % 128;
        int i13 = i12 % 2;
        return mapM5591;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5590(new int[]{254, 14, 68, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cf.m5589();
            }
        });
        map.put(m5590(new int[]{268, 8, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cf.m5596((APPStatus) list.get(0));
            }
        });
        map.put(m5590(new int[]{276, 12, 0, 8}, "\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001", false).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cf.m5599((LiteAbstractAD) list.get(0));
            }
        });
        map.put(m5590(new int[]{288, 15, 11, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000", true).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Integer.valueOf(cf.m5595((RewardVideoAD) list.get(0)));
            }
        });
        map.put(m5593("ⱃ귚⽦ꢧ⨭ꑔ◧ꝫₘꈲ㱎뷈㼘뢏㨭", 33179 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cf.m5594((RewardVideoAD) list.get(0));
            }
        });
        map.put(m5593("ⱃ⢼▪⊚㾾㒡ㆯຽிµᶯ\u1a8fទ沜榞暲掌碝", ExpandableListView.getPackedPositionGroup(0L) + 1277).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cf.m5601((UnifiedInterstitialAD) list.get(0));
            }
        });
        int i10 = f1324 + 99;
        f1326 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 22 : '0') == '0') {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f1326 + 27;
        f1324 = i10 % 128;
        int i11 = i10 % 2;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        int i12 = f1324 + 121;
        f1326 = i12 % 128;
        int i13 = i12 % 2;
        return integrationSDKVersion;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo4814(String str) {
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1950656211:
                if (str.equals(m5590(new int[]{64, 19, 117, 13}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", true).intern())) {
                    b10 = 5;
                }
                break;
            case -1537668511:
                if (str.equals(m5590(new int[]{144, 21, 74, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true).intern())) {
                    b10 = 13;
                }
                break;
            case -1192770783:
                if (str.equals(m5590(new int[]{114, 30, 194, 14}, (String) null, true).intern())) {
                    b10 = 9;
                }
                break;
            case -1125491209:
                if (!(str.equals(m5590(new int[]{244, 10, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", true).intern()) ? false : true)) {
                    b10 = 25;
                }
                break;
            case -1040623465:
                if (!(str.equals(m5590(new int[]{23, 14, 0, 8}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000", false).intern()) ? false : true)) {
                    b10 = 3;
                }
                break;
            case -839956733:
                if (str.equals(m5590(new int[]{190, 17, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000", false).intern())) {
                    b10 = 18;
                }
                break;
            case -570955421:
                if (str.equals(m5593("ⱶ뒺ᶥ\ue6b4侺킧릐ʐ\ueb98䲒햅뺬ޤ\ue8d7燷\udae2ꏠӪ\uedec盠\udfca", 39162 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    int i10 = f1324 + 93;
                    f1326 = i10 % 128;
                    b10 = i10 % 2 == 0 ? (byte) 16 : (byte) 64;
                }
                break;
            case -427681737:
                if (str.equals(m5593("ⱥ\u17fb字麃숭ٍ䧲", KeyEvent.keyCodeFromString("") + 15259).intern())) {
                    b10 = 20;
                }
                break;
            case -358530385:
                if (str.equals(m5590(new int[]{178, 12, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000", false).intern())) {
                    b10 = 17;
                }
                break;
            case -311779863:
                if (str.equals(m5593("ⱇⱢⰛⱱ⳱Ⲙ⳼ⵞⵂⴴⷚⶔⷦ\u2e63\u2e7f⸴⻕⻯⺢⽙⽹⼝⿇\u2fe4⾰⡄⡠⠓⠫⣢⢋⢣⥡⤬⤒⧾⦃⦽⩛⩭⨥⫁⫧", TextUtils.lastIndexOf("", '0', 0, 0) + 42).intern())) {
                    b10 = 10;
                }
                break;
            case -301299368:
                if (str.equals(m5593("ⱥ\u085d搒䃺벣饡\uf52f퇡ඩ橳䘇ꋟ麙כֿ휆㏒澆", 9277 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    int i11 = f1326 + 11;
                    f1324 = i11 % 128;
                    int i12 = i11 % 2;
                    b10 = 22;
                }
                break;
            case -287046183:
                if (str.equals(m5593("ⱶ\uf426鲝ꕰ䷊ᙃ㸸욜\uef78럞塍怙࢟텭鱗艟ꨵ犚᭮⏀쑬\uec16뒝崑日\u0e5d혻ﺍ蜙", 55399 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    b10 = 11;
                }
                break;
            case -207731435:
                if (!(str.equals(m5590(new int[]{83, 31, 0, 16}, "\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", false).intern()) ? false : true)) {
                    b10 = 8;
                }
                break;
            case 2003474:
                if (str.equals(m5593("ⱥ䠨\ue4ee\u008d", TextUtils.lastIndexOf("", '0', 0) + 25680).intern())) {
                    b10 = 23;
                }
                break;
            case 167349330:
                if (str.equals(m5593("ⱥ꣫╳ꇦ㹼뫺㜐뎀ࠈ蒾", 33931 - View.MeasureSpec.getSize(0)).intern())) {
                    int i13 = f1326 + 1;
                    f1324 = i13 % 128;
                    int i14 = i13 % 2;
                    b10 = 1;
                }
                break;
            case 555831221:
                if (!(str.equals(m5590(new int[]{207, 23, 0, 22}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", true).intern()) ? false : true)) {
                    b10 = 19;
                }
                break;
            case 796884557:
                if (str.equals(m5593("ⱴ哪\udd14䖳컒睠ﾋ怷\ue96dᇉ騯ʬ诜ౠ뒜㴢Ꙁ⻬", 30881 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    b10 = 7;
                }
                break;
            case 814717722:
                if (str.equals(m5590(new int[]{0, 23, 14, 15}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001", false).intern())) {
                    b10 = 2;
                }
                break;
            case 937653587:
                if (str.equals(m5593("ⱥ쫵\ue176鿴뙔곀䭖懖ᡟ", 59009 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b10 = 21;
                }
                break;
            case 1265986405:
                if (str.equals(m5593("ⱇᰶ䲳뵽\ueda1\ude24\u0ee4缪꿢頠좢㤈槖娱誓\ufb19⮐ᐚ䒍딂\ue590혀ۛ睛\ua7dd遲샢ㅢ懾剤苶\uf37e", 12413 - View.resolveSize(0, 0)).intern())) {
                    b10 = 6;
                }
                break;
            case 1305853839:
                if (str.equals(m5590(new int[]{165, 13, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001", false).intern())) {
                    b10 = 15;
                }
                break;
            case 1336889139:
                if (str.equals(m5590(new int[]{230, 14, 1, 5}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", false).intern())) {
                    int i15 = f1326 + 5;
                    f1324 = i15 % 128;
                    int i16 = i15 % 2;
                    b10 = 24;
                }
                break;
            case 1773421109:
                if (str.equals(m5593("ⱱ\ud90d웃\uf397陋\ue622鏪颜虲댯뢇ꙛ匃壋䖯獹砽旲\u12b6ᠠ\u05ec㊻㡗┶틸\udfae야\uf23cﾒ", 62791 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    b10 = 14;
                }
                break;
            case 1874129984:
                if (str.equals(m5593("Ᵽ껡⥲ꯦ♄ꃲ⍆뷈", 33409 - View.resolveSize(0, 0)).intern())) {
                    b10 = 0;
                }
                break;
            case 1958130193:
                if (str.equals(m5593("ⱇ轂橛씑ꁱ\u0378︼奾㑂霔爚ⴴ衦欃옿ꇔ᳕ￏ嫢㗹郹珽⺇覄撬잪ꊼᶣ\uf8aa呀㝃鉇䵅⡉譗晼섔밀ἄ晴唸〬", 41737 - Color.alpha(0)).intern())) {
                    b10 = 12;
                }
                break;
            case 2111488863:
                if (str.equals(m5590(new int[]{37, 27, 0, 15}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", true).intern())) {
                    b10 = 4;
                }
                break;
        }
        switch (b10) {
            case 0:
                return GDTAdSdk.class;
            case 1:
            case 2:
                return ADActivity.class;
            case 3:
            case 4:
                return DialogActivity.class;
            case 5:
            case 6:
                return LandscapeADActivity.class;
            case 7:
            case 8:
                return PortraitADActivity.class;
            case 9:
            case 10:
                int i17 = f1326 + 113;
                f1324 = i17 % 128;
                int i18 = i17 % 2;
                return RewardvideoLandscapeADActivity.class;
            case 11:
            case 12:
                return RewardvideoPortraitADActivity.class;
            case 13:
                return UnifiedInterstitialAD.class;
            case 14:
                return UnifiedInterstitialADListener.class;
            case 15:
                return RewardVideoAD.class;
            case 16:
                return RewardVideoADListener.class;
            case 17:
                return LoadAdParams.class;
            case 18:
                return UnifiedBannerView.class;
            case 19:
                return UnifiedBannerADListener.class;
            case 20:
                return ADEvent.class;
            case 21:
                return APPStatus.class;
            case 22:
                return RewardVideoAD.ADListenerAdapter.class;
            case 23:
                return ACTD.class;
            case 24:
                return LiteAbstractAD.class;
            case 25:
                return ADListener.class;
            default:
                return null;
        }
    }
}
