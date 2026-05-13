package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class cj extends bd {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1349 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1350 = -1920709221;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1351 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f1352 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1353 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1354 = 7074;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1355 = 54853;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1356 = 63179;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1357 = 17986;

    public cj(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m5622(InterstitialAd interstitialAd) {
        int i10 = f1351 + 29;
        f1349 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        AdInfo adInfoM5632 = m5632(interstitialAd);
        if (z10) {
            int i11 = 74 / 0;
        }
        return adInfoM5632;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static AdInfo m5623(RewardedAd rewardedAd) {
        int i10 = f1351 + 41;
        f1349 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'U' : 'L';
        AdInfo info = rewardedAd.getInfo();
        if (c10 == 'U') {
            int i11 = 72 / 0;
        }
        int i12 = f1349 + 33;
        f1351 = i12 % 128;
        int i13 = i12 % 2;
        return info;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5624(ImpressionData impressionData) {
        int i10 = f1351 + 53;
        f1349 = i10 % 128;
        int i11 = i10 % 2;
        String strM5641 = m5641(impressionData);
        int i12 = f1351 + 57;
        f1349 = i12 % 128;
        int i13 = i12 % 2;
        return strM5641;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5625(Reward reward) {
        int i10 = f1349 + 15;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        String type = reward.getType();
        int i12 = f1349 + 93;
        f1351 = i12 % 128;
        if (i12 % 2 == 0) {
            return type;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5626(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i10 = f1349 + 15;
        f1351 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 19 : 'B';
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        if (c10 == 'B') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5627(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i10 = f1349 + 47;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        int i12 = f1349 + 85;
        f1351 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 5 : (char) 19) == 19) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static MediaFile m5628(VideoAd videoAd) {
        int i10 = f1351 + 47;
        f1349 = i10 % 128;
        int i11 = i10 % 2;
        MediaFile mediaFile = videoAd.getMediaFile();
        int i12 = f1349 + 69;
        f1351 = i12 % 128;
        if (i12 % 2 == 0) {
            return mediaFile;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5629(AdInfo adInfo) {
        int i10 = f1351 + 57;
        f1349 = i10 % 128;
        int i11 = i10 % 2;
        String strM5640 = m5640(adInfo);
        int i12 = f1349 + 61;
        f1351 = i12 % 128;
        int i13 = i12 % 2;
        return strM5640;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5630(MediaFile mediaFile) {
        int i10 = f1351 + 123;
        f1349 = i10 % 128;
        int i11 = i10 % 2;
        String strM5642 = m5642(mediaFile);
        int i12 = f1349 + 13;
        f1351 = i12 % 128;
        if (i12 % 2 == 0) {
            return strM5642;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m5631(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i10 = f1351 + 113;
        f1349 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m5645(rewardedAd, rewardedAdEventListener);
        if (z10) {
            throw null;
        }
        int i11 = f1349 + 5;
        f1351 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static AdInfo m5632(InterstitialAd interstitialAd) {
        int i10 = f1349 + 17;
        f1351 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            interstitialAd.getInfo();
            throw null;
        }
        AdInfo info = interstitialAd.getInfo();
        int i11 = f1351 + 61;
        f1349 = i11 % 128;
        int i12 = i11 % 2;
        return info;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5633(Reward reward) {
        int i10 = f1351 + 101;
        f1349 = i10 % 128;
        if ((i10 % 2 == 0 ? ']' : 'O') == ']') {
            m5625(reward);
            throw null;
        }
        String strM5625 = m5625(reward);
        int i11 = f1351 + 13;
        f1349 = i11 % 128;
        int i12 = i11 % 2;
        return strM5625;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5634(VideoAd videoAd) {
        int i10 = f1349 + 41;
        f1351 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String info = videoAd.getInfo();
        if (!z10) {
            int i11 = 9 / 0;
        }
        int i12 = f1351 + 47;
        f1349 = i12 % 128;
        int i13 = i12 % 2;
        return info;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5635(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3014) {
            char[] cArr2 = new char[cArr.length];
            n.f3013 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f3013;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1355)) ^ ((c11 >>> 5) + f1356)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1357) ^ ((c12 + i12) ^ ((c12 << 4) + f1354))));
                        i12 -= 40503;
                    }
                    int i14 = n.f3013;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f3013 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m5636(VideoController videoController, VideoEventListener videoEventListener) {
        int i10 = f1349 + 47;
        f1351 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '?' : '\\';
        m5644(videoController, videoEventListener);
        if (c10 != '?') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m5637(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i10 = f1349 + 37;
        f1351 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '$' : '7';
        m5627(interstitialAd, interstitialAdEventListener);
        if (c10 == '$') {
            int i11 = 22 / 0;
        }
        int i12 = f1351 + 85;
        f1349 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m5638(Reward reward) {
        int i10 = f1349 + 23;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        int amount = reward.getAmount();
        int i12 = f1349 + 101;
        f1351 = i12 % 128;
        int i13 = i12 % 2;
        return amount;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ MediaFile m5639(VideoAd videoAd) {
        int i10 = f1351 + 75;
        f1349 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '7' : 'Z';
        MediaFile mediaFileM5628 = m5628(videoAd);
        if (c10 == '7') {
            int i11 = 59 / 0;
        }
        int i12 = f1349 + 15;
        f1351 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 0 : 'R') == 'R') {
            return mediaFileM5628;
        }
        int i13 = 83 / 0;
        return mediaFileM5628;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5640(AdInfo adInfo) {
        int i10 = f1349 + 11;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        String adUnitId = adInfo.getAdUnitId();
        int i12 = f1351 + 31;
        f1349 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return adUnitId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5641(ImpressionData impressionData) {
        int i10 = f1351 + 91;
        f1349 = i10 % 128;
        int i11 = i10 % 2;
        String rawData = impressionData.getRawData();
        int i12 = f1349 + 93;
        f1351 = i12 % 128;
        if ((i12 % 2 != 0 ? '\'' : 'A') == 'A') {
            return rawData;
        }
        int i13 = 85 / 0;
        return rawData;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5642(MediaFile mediaFile) {
        int i10 = f1349 + 3;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        String url = mediaFile.getUrl();
        int i12 = f1351 + 101;
        f1349 = i12 % 128;
        int i13 = i12 % 2;
        return url;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5643(String str, char c10, String str2, int i10, String str3) {
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
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f1353) ^ ((long) f1350)) ^ ((long) f1352));
                    j.f2697 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5644(VideoController videoController, VideoEventListener videoEventListener) {
        int i10 = f1349 + 43;
        f1351 = i10 % 128;
        int i11 = i10 % 2;
        videoController.setVideoEventListener(videoEventListener);
        int i12 = f1351 + 79;
        f1349 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return;
        }
        int i13 = 96 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5645(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i10 = f1351 + 81;
        f1349 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '_' : '6';
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        if (c10 != '6') {
            int i11 = 52 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ int m5646(Reward reward) {
        int i10 = f1351 + 123;
        f1349 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        int iM5638 = m5638(reward);
        if (!z10) {
            int i11 = 4 / 0;
        }
        int i12 = f1349 + 63;
        f1351 = i12 % 128;
        int i13 = i12 % 2;
        return iM5638;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m5647(RewardedAd rewardedAd) {
        int i10 = f1351 + 41;
        f1349 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        AdInfo adInfoM5623 = m5623(rewardedAd);
        if (z10) {
            int i11 = 39 / 0;
        }
        return adInfoM5623;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5648(VideoAd videoAd) {
        int i10 = f1349 + 33;
        f1351 = i10 % 128;
        if (i10 % 2 == 0) {
            return m5634(videoAd);
        }
        m5634(videoAd);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m5649(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i10 = f1351 + 71;
        f1349 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '4' : ';';
        m5626(bannerAdView, bannerAdEventListener);
        if (c10 == ';') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5635("û\uf420ሩ\uf750녢\ue12d븼\uf17f㭜㍴捴谛", 11 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cj.m5629((AdInfo) list.get(0));
            }
        });
        map.put(m5643("둞뫥緊蘏黡\ue083妱话ᅌ㯦", (char) TextUtils.getCapsMode("", 0, 0), "\u0000\u0000\u0000\u0000", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "䶴↢㘝\uf047").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cj.m5624((ImpressionData) list.get(0));
            }
        });
        map.put(m5635("\ufbce┸ⱌ쟆㻺럁ﮮ阮氩✎\u209f\uf294揾\uecde\uf0df\ua87a凷⾡꺱溎괧銠", 21 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                cj.m5636((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        map.put(m5643("䝮ၿ擪⯼\uea80\udb2f⅚组욂荭\u2e6a贋\ue75c쪽\udb35\ue206ﮤ\ue1e1\uf3ac亢", (char) View.getDefaultSize(0, 0), "\u0000\u0000\u0000\u0000", TextUtils.getOffsetBefore("", 0), "웥\ue32e砠陟").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cj.m5622((InterstitialAd) list.get(0));
            }
        });
        map.put(m5643("鱸팾\uf057ﮑᱨ\uf48c䃠헏켪\uedeb볣瞵龲湦솳", (char) (52744 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", (-1368179779) - Gravity.getAbsoluteGravity(0, 0), "뷫猻ޮ췎").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return Integer.valueOf(cj.m5646((Reward) list.get(0)));
            }
        });
        map.put(m5643("ニॢ㡰㨓呐䷂롻\u0e67缎姾뷶洅\uf7c2", (char) (40636 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0000\u0000\u0000\u0000", TextUtils.indexOf("", "", 0) + 324816441, "㦝屎밓㮞").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cj.m5633((Reward) list.get(0));
            }
        });
        map.put(m5643("提ኑ≫ˢ絙쬝ⴿʱ숭꿡\ua635ⳃꎎﷂ枉青梴", (char) (19273 - (ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2105121537, "Ǔ禛䥽왋").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cj.m5647((RewardedAd) list.get(0));
            }
        });
        map.put(m5643("卙險ᅍ\udc8dꌗ栁ᭇ\u31ea㻔籔햽⮼\uee7f蕀ؓ\ue35d▞툛剕㣙⒊冗樊\ue2c6\uf4ba㜏", (char) (52911 - Color.argb(0, 0, 0, 0)), "\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString(""), "\u0ffeĈ꿪\u1cce").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                cj.m5631((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m5635("\ufbce┸㭜㍴᭫穾\uf6a9휙ꐊ\ueb1b盦떝荜\ue603̭\u1bf9⊥\ue5fc饇Ƴ᭫穾权豕ꐊ\ueb1b\u209f\uf294\uf6a9휙", Color.argb(0, 0, 0, 0) + 30).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                cj.m5637((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m5643("Η콚ꖹﵝ朘瞧폇文巉돾蔛绥를揔僥", (char) (475 - (Process.myPid() >> 22)), "\u0000\u0000\u0000\u0000", (-1061888820) - TextUtils.lastIndexOf("", '0', 0, 0), "쵉드\udbc0\uf701").intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cj.m5630((MediaFile) list.get(0));
            }
        });
        map.put(m5635("û\uf420ⱌ쟆㻺럁ﮮ阮軜ླ铍㚨嶶\uf2fa奾攳\u0a0e꧘徵⅐", KeyEvent.normalizeMetaState(0) + 19).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cj.m5639((VideoAd) list.get(0));
            }
        });
        map.put(m5635("û\uf420ⱌ쟆㻺럁ﮮ阮軜ླ\ue2b0\u0e80쵐钖", ExpandableListView.getPackedPositionChild(0L) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cj.m5648((VideoAd) list.get(0));
            }
        });
        map.put(m5635("\ufbce┸쥙꩗\udd94緿꺱溎쮣ḕ⊥\ue5fc饇Ƴ᭫穾权豕ꐊ\ueb1b\u209f\uf294\uf6a9휙", (ViewConfiguration.getJumpTapTimeout() >> 16) + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                cj.m5649((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i10 = f1351 + 79;
        f1349 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return map;
        }
        int i11 = 72 / 0;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        String libraryVersion;
        int i10 = f1351 + 77;
        f1349 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 17 : 'B') != 'B') {
            libraryVersion = MobileAds.getLibraryVersion();
            int i11 = 67 / 0;
        } else {
            libraryVersion = MobileAds.getLibraryVersion();
        }
        int i12 = f1349 + 35;
        f1351 = i12 % 128;
        if ((i12 % 2 != 0 ? 'D' : (char) 31) == 31) {
            return libraryVersion;
        }
        int i13 = 85 / 0;
        return libraryVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0349  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cj.mo4814(java.lang.String):java.lang.Class");
    }
}
