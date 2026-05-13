package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.BidMachine;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bl extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f880 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f881 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f882 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f883;

    static {
        char[] cArr = new char[1179];
        ByteBuffer.wrap("Q^\u001esÏ:¼ÖmàÚ\u008f\u008a4{\u0014(S\u0099ûF²6!\u0000AOK\u009e\u001díâ<Ò\u008b\u009fÛ\u007f*'y\fÈó\u0017¯gu¶QêÜ¥Öt\u0087\u0007yÖRa\u00061ëÀµ\u0093\u009c\u0000AOK\u009e\bíä<Ø\u008b\u008eÛuvB9Hè\u001b\u009bûJÓý\u0084\u00adJ\\)\u000f\t¾Áa°\u0011hÀ{s\t\"âÕ¶\u0084\u00964rç(\u0096\f\u0000AOK\u009e\u0012íä<Ï\u008b\u009fÛ\u007f*'y\u001dÈÕØA\u0097KF\f5èäÍS\u009e\u0003\u007fò:¡\f#!l+½lÎ\u0088\u001f\u00ad¨þø\u001f\tZZlë\u00974×D\u0017\u00955&nw\u0097\u0080ÕÑõa\r²]\u0000AOK\u009e-íÙ<Å\u008b\u009bÛ\u007f\u0000AOK\u009e\bíä<Ù\u008b\u009c\u0000BON\u009e0íã<Ù\u008b\u0099ÛV* y\u000bÈÓ\u0017³gk¶Q\u0005\u0011ù;¶7gI\u0014\u009aÅ rà\"5ÓY\u0080d1©\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTð£ ò\u009eBq\u0091+à\u000f/\u0082~\u0099Îk\u001dWl\u0006»ò\n´Y£©Mø6Gõ\u0000BOF\u009e:íÀ<Ý\u008b\u0088Ûr* y\u0016ÈÂÂ«\u008d¯\\Ó/)þ4Ia\u0019\u009bèÉ»ÿ\n+Õ~¥\u0088o¥ »ñÝ\u0082\nS.äd´\u008aEÊ\u0016Ø§.xB\b\u008eÙ³jñoã èñ\u0095\u0082@Ssä\u0005´ÑE\u0097\u0016³\u0000IOA\u009e*íè<Î\u008b\u0098Ûn* y\fÈÎ\u0017·gi¶u\u0005\u0007ð£¿«nÀ\u001d\u0002Ì${r+\u0084ÚÊ\u0089æ8$ç]\u0097\u0083F\u0092õà¤\u000bS_\u0002\u007f²\u009baÁ\u0010å\u0000FOZ\u009e2íá<ï\u008b\u0088Ûh*,y\u001dÈÉ\u0017\u0097gac¯,¨ýØ\u008e\u0006_?èH¸\u008bIØ\u001aÿ«1t`\u0004\u009eÕ¦fäÒÄ\u009dÃL³?mîTY4\túø¥«\u0086\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTü£ ò\u0084Bv\u00918à\u0018/Í~¿Î$\u001dOl\u0001»ò\n±YÛ©iø6Gæ\u0096Øå\u00815Y\u0084WÓ\b\"ë\u0000NON\u009e*íä<Ê\u008b\u008eÛ[*-\u0000NON\u009e*íä<Ê\u008b\u008eÛV* y\u000bÈÓ\u0017³gk¶Q\u0005\u0011zª5ªäÎ\u0097\u0000F.ñj¡³PÈ\u0003ø²*mS\u001d·Ì¹\u007fâ.\u0001&ZiB¸!Ëä\u001aÆ\u00ad\u0087ýw\f%_1îËè\\§Dv'\u0005âÔÀc\u00813qÂ#\u0091: Àÿ«\u008f\u007f^_í\u0003¼ùK½¿\u0014ð\u0000!{R£\u0083·4Èd8\u0095fÆ_w\u00ad¨ùØ0\t\u0006º@ëº\u001câMÄ\u0000ROF\u009e=íå<ñ\u008b\u008eÛ~* y\u0019Èñ\u0017¿g`¶C\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTà£¨ò\u0093Bw\u0091#à\u0018/È~²Îk\u001d\u0017l:»þ\n¥Y\u009d©iø6Gæ\u0096Øå\u00815Y\u0084WÓ\b\"ëCC\fSÝ/®ý\u007fÆÈ®\u0098ci=:\u0014\u008b×T±$QõBF\u0002\u0017îà¢±\u008c\u0001~Ò\"\u0000iO@\u009epíï<Õ\u008b\u008fÛw*(y\u001bÈÏ\u0017¿gk¶Q\u0005MTü£ ò\u0084Bv\u00918à\u0018/Í~¿Î$\u001dOl\u0001»ò\n±YÛ©rø:Gæ\u0096Ôå\u008f5_\u0084RÓ\f\"åq®À\u0088\u0010h_;®óýßL\u0093\u009c}ë7:\u000b\t¯F¥\u008b%Ä5\u0015Wf\u008c·°\u0000ÂP\u0011¡UòyC¹\u009c×ì\u0019=%\u0000cO@\u009e3í£<Ù\u008b\u0093Ûj*%y\u0017ÈÕ\u0017³gv¶@\u0005\u0002Tñ£ªòÞBv\u0091/à\u001f/\u0082~¶Îx\u001dXl\u0001»ó\nèY¸©Vø2Gë\u0096Õå¡5l\u0084JÓ\u0004\"êq¢À\u008e\u0010P\u0000MO]\u009e?íä<Ø\u008b¯Ûs*(y\u0014ÈÈ\u0017±gD¶W\u0005\u0017Tû£·ò\u0099Bk\u00917¼óóÐ\"£Q3\u0080I7\u0003gú\u0096µÅ\u0087tE«#Ûæ\nÐ¹\u0092èa\u001f:NNþæ-¿\\\u008f\u0093\u0012Â&rè¡ÈÐ\u0091\u0007c¶xå(\u0015ÆD¢û{*EY4\u0089ö8Ïo\u0091\u009ecÍ<|+¬Úã¼\u0012~APð\u001c ðWª\u0000MO]\u009e?íä<Ø\u008b¢Ût*=y\u001dÈÕ\u0017¥gq¶]\u0005\u0017Tû£ ò\u009c\u0000MO]\u009e?íä<Ø\u008b¢Ût*=y\u001dÈÕ\u0017¥gq¶]\u0005\u0017Tû£ ò\u009cBS\u0091'à\u000e/Ø~¾Îd\u001d\\l\u001a\u0000MO]\u009e?íä<Ø\u008b½Ûs*,y\u000f\u0000cO@\u009e3í£<Ù\u008b\u0093Ûj*%y\u0017ÈÕ\u0017³gv¶@\u0005\u0002Tñ£ªòÞBv\u0091/à\u001f/\u0082~¶Îx\u001dXl\u0001»ó\nèY¸©Vø2Gë\u0096Õå¶5f\u0084[Ó\u001a@?\u000f/ÞM\u00ad\u0096|ªËÏ\u009b\u0001j^9}\u0088\u0099WÍ'\u0004ö2Et\u0014\u008eãÖ²ðpD?\\î?\u009dëLïû\u009a«|Z2\t\u001c¸Üg°\u0017n\u001dURv\u0083\u0005ð\u0095!ï\u0096¥Æ\\7\u0013d!Õã\n\u0085z@«v\u00184IÇ¾\u009cïè_@\u008c\u0019ý)2´c\u009bÓ]\u0000|q*¦\u008f\u0017\u0091D ´få\fZÂ\u008bîø¢(@\u0099&Î\r?Ël\u008eÝ¸\r^B\r³ÅàéQ¥\u0081Kö\u0001'=(Ïg×¶´Å`\u0014s£\u001bóæ\u0002§\u0084\u009cË¿\u001aÌi\\¸&\u000fl_\u0095®ÚýèL*\u0093Lã\u00892¿\u0081ýÐ\u000e'Uv!Æ\u0089\u0015Ðdà«}úRJ\u0094\u0099µèã?F\u008eXÝi-¯|ÅÃ\u000b\u0012'ak±\u0089\u0000ïWÄ¦\u0002õGDq\u0094\u0080ÛÎ*\u001dy>kÁ$Ñõ³\u0086hWTà&°òA\u0093\u0012\u009d£N|-\u0000cO@\u009e3í£<Ù\u008b\u0093Ûj*%y\u0017ÈÕ\u0017³gv¶@\u0005\u0002Tñ£ªòÞBv\u0091/à\u001f/\u0082~¶Îx\u001dXl\u0001»ó\nèY¸©Vø2Gë\u0096Õå¡5k\u0084hÓ\u0004\"ùq¼ù°¶¨gË\u0014\u001fÅ\frd\"\u0099ÓØ\u0080Ò1(îC\u009e\u0097O·üë\u00ad\u0011ZU\u0000ROJ\u009e/íø<Ù\u008b\u0098Ûn*\fy\u0000ÈÓ\u0017³gk¶G\u0005\nTý£¯¡\u0097îº?ÚL9\u009d%*hz\u009a\u008bÕØéi.¶gÆ\u0091\u0017©\u0000gOJ\u009e*íÛ<Õ\u008b\u008fÛ\u007f*&y9ÈÃ\u0017»\u0000gOJ\u009e*íÏ<É\u008b\u0085Û~*%y\u001d¥\u0013ê>;^H½\u0099¡.ì~\u001e\u008fQÜmmª\u0000gOJ\u009e*íÉ<Õ\u008b\u0098Ûj*%y\u0019ÈÞ\u0017\u0094gd¶Z\u0005\rT÷£³\u0000gOJ\u009e*íÏ<Ý\u008b\u0085Ût*,y\nÈâ\u0017®gq¶d\u0005\u0011Tý£µò\u009fBS\u0091'à\u000e/Ø\u0000gOJ\u009e*íÛ<Õ\u008b\u008fÛ\u007f*&#]lp½\u0010Îö\u001fâ¨¾øM\t\u0012Z+ëó\u0019\u0084V©\u0087Éô-%-\u0092mÂ\u00983Þ`òÑ2\u000eP~¯¯³\u0000gOJ\u009e*íÝ<Ð\u008b\u008aÛy*,y\u0015ÈÂ\u0017¸gq¶}\u0005\u0007\u0019îVÃ\u0087£ôE%Q\u00926Âê3°`\u0094\u000f§@\u008a\u0091êâ\u001e3\u0019\u0084GÔ¶%ìvÊÇ.\u0018r\u0000sOJ\u009e*íÄ<Ò\u008b\u009fÛ\u007f*;y\u000bÈÓ\u0017¿gq¶]\u0005\u0002Tþ£\u008dò\u0099Bl\u0091:à\u0018/Â~¾ÎxÎ\u009d\u0081¤PÄ#1ò7Er\u0015\u0095äÕ·ò\u0006,Ù\\©§x³Ëþ\u009a\bmJ<p\u008c\u0094_ÒÿO°va\u0016\u0012óÃát¹$HÕ\u0010\u008667×è\u0083\u0098JI|ú:«À\\\u0098\r¾\u0097 Ø\r\tmz\u008f«\u0083\u001cØL\r½|îP_\u0094\u0080þð\u000e!\u001a\u0092WÃ¡\u0000gOJ\u009e*íÏ<Å\u008b\u009fÛ\u007f*\u001ay\fÈÕ\u0017¿gk¶S\u00ad\u0012â&3Z@\u0098\u0091\u009f&ïv\u0018\u0087PÔfe°ºòÊ\u001a\u001b\u0017¨gù\u0090\u000eØ_îï\b".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1179);
        f883 = cArr;
        f880 = -1616313329768902865L;
    }

    public bl(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m4982(Ad ad2) {
        int i10 = f882 + 25;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String id2 = ad2.getId();
        int i12 = f881 + 41;
        f882 = i12 % 128;
        if (i12 % 2 != 0) {
            return id2;
        }
        int i13 = 39 / 0;
        return id2;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Ad.Video m4983(Ad ad2) {
        int i10 = f881 + 21;
        f882 = i10 % 128;
        if (i10 % 2 != 0) {
            return ad2.getVideo();
        }
        ad2.getVideo();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static List<Any> m4984(Ad ad2) {
        int i10 = f882 + 25;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        List<Any> extProtoList = ad2.getExtProtoList();
        int i12 = f882 + 95;
        f881 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 17 : (char) 24) == 24) {
            return extProtoList;
        }
        int i13 = 62 / 0;
        return extProtoList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Ad.Display m4985(Ad ad2) {
        int i10 = f882 + 105;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Display display = ad2.getDisplay();
        int i12 = f881 + 105;
        f882 = i12 % 128;
        if ((i12 % 2 == 0 ? 'B' : 'N') == 'N') {
            return display;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4986(Ad.Display display) {
        int i10 = f882 + 23;
        f881 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 11 : 'R') == 'R') {
            return display.getAdm();
        }
        display.getAdm();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m4987(Ad ad2, int i10) {
        int i11 = f881 + 61;
        f882 = i11 % 128;
        int i12 = i11 % 2;
        String strM5015 = m5015(ad2, i10);
        int i13 = f882 + 115;
        f881 = i13 % 128;
        if (i13 % 2 == 0) {
            return strM5015;
        }
        int i14 = 17 / 0;
        return strM5015;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4988(AdRequestParameters adRequestParameters) {
        int i10 = f882 + 59;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String name = adRequestParameters.getAdsType().getName();
        int i12 = f881 + 51;
        f882 = i12 % 128;
        if (i12 % 2 != 0) {
            return name;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m4989(BannerView bannerView, BannerListener bannerListener) {
        int i10 = f881 + 83;
        f882 = i10 % 128;
        int i11 = i10 % 2;
        bannerView.setListener(bannerListener);
        int i12 = f882 + 87;
        f881 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m4990(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i10 = f882 + 69;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        m4997(interstitialAd, interstitialListener);
        int i12 = f882 + 121;
        f881 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m4991(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i10 = f882 + 113;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        rewardedAd.setListener(rewardedListener);
        int i12 = f881 + 37;
        f882 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static ByteString m4992(Any any) {
        int i10 = f882 + 19;
        f881 = i10 % 128;
        if ((i10 % 2 != 0 ? '6' : 'K') == '6') {
            any.getValue();
            throw null;
        }
        ByteString value = any.getValue();
        int i11 = f881 + 91;
        f882 = i11 % 128;
        if ((i11 % 2 == 0 ? 'V' : '`') != 'V') {
            return value;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m4993(Ad ad2) {
        int i10 = f882 + 9;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String strM4982 = m4982(ad2);
        int i12 = f882 + 75;
        f881 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 17 : (char) 18) == 18) {
            return strM4982;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m4994(AdRequestParameters adRequestParameters) {
        int i10 = f881 + 23;
        f882 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 3 : '[') != '[') {
            m5010(adRequestParameters);
            throw null;
        }
        String strM5010 = m5010(adRequestParameters);
        int i11 = f882 + 113;
        f881 = i11 % 128;
        int i12 = i11 % 2;
        return strM5010;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m4995(RequestExtension requestExtension) {
        int i10 = f881 + 63;
        f882 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '@' : 'L';
        String sellerId = requestExtension.getSellerId();
        if (c10 != 'L') {
            int i11 = 43 / 0;
        }
        return sellerId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m4996(BannerView bannerView, BannerListener bannerListener) {
        int i10 = f881 + 99;
        f882 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m4989(bannerView, bannerListener);
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m4997(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i10 = f882 + 25;
        f881 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '^' : (char) 7;
        interstitialAd.setListener(interstitialListener);
        if (c10 == 7) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4998(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f883[i10 + i12]) ^ (((long) i12) * f880)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4999(ByteString byteString) {
        int i10 = f882 + 55;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String stringUtf8 = byteString.toStringUtf8();
        int i12 = f882 + 91;
        f881 = i12 % 128;
        if (i12 % 2 == 0) {
            return stringUtf8;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5000(Ad.Display display) {
        int i10 = f882 + 91;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String strM4986 = m4986(display);
        int i12 = f882 + 39;
        f881 = i12 % 128;
        if (i12 % 2 == 0) {
            return strM4986;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5001(Ad ad2, int i10) {
        int i11 = f881 + 107;
        f882 = i11 % 128;
        char c10 = i11 % 2 == 0 ? '6' : (char) 25;
        String strM5009 = m5009(ad2, i10);
        if (c10 != 25) {
            int i12 = 4 / 0;
        }
        return strM5009;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m5002(Ad ad2) {
        int i10 = f881 + 75;
        f882 = i10 % 128;
        int i11 = i10 % 2;
        List<Any> listM4984 = m4984(ad2);
        int i12 = f882 + 47;
        f881 = i12 % 128;
        int i13 = i12 % 2;
        return listM4984;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m5003(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i10 = f881 + 11;
        f882 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m4991(rewardedAd, rewardedListener);
        if (!z10) {
            return;
        }
        int i11 = 35 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ByteString m5004(Any any) {
        int i10 = f881 + 97;
        f882 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        ByteString byteStringM4992 = m4992(any);
        if (!z10) {
            int i11 = 6 / 0;
        }
        int i12 = f881 + 7;
        f882 = i12 % 128;
        int i13 = i12 % 2;
        return byteStringM4992;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Ad.Display.Banner m5005(Ad.Display display) {
        int i10 = f881 + 53;
        f882 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Display.Banner banner = display.getBanner();
        int i12 = f881 + 109;
        f882 = i12 % 128;
        int i13 = i12 % 2;
        return banner;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display m5006(Ad ad2) {
        int i10 = f882 + 5;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Display displayM4985 = m4985(ad2);
        int i12 = f882 + 55;
        f881 = i12 % 128;
        if (i12 % 2 == 0) {
            return displayM4985;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5007(ByteString byteString) {
        int i10 = f882 + 3;
        f881 = i10 % 128;
        if (i10 % 2 == 0) {
            return m4999(byteString);
        }
        m4999(byteString);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5008(Ad.Video video) {
        int i10 = f882 + 67;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String strM5014 = m5014(video);
        int i12 = f881 + 35;
        f882 = i12 % 128;
        int i13 = i12 % 2;
        return strM5014;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5009(Ad ad2, int i10) {
        int i11 = f882 + 31;
        f881 = i11 % 128;
        int i12 = i11 % 2;
        String adomain = ad2.getAdomain(i10);
        int i13 = f882 + 21;
        f881 = i13 % 128;
        if ((i13 % 2 != 0 ? 'H' : (char) 14) != 'H') {
            return adomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5010(AdRequestParameters adRequestParameters) {
        int i10 = f881 + 103;
        f882 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 27 : 'M';
        String placementId = adRequestParameters.getPlacementId();
        if (c10 != 'M') {
            int i11 = 79 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m5011(Ad.Display.Banner banner) {
        int i10 = f882 + 39;
        f881 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        List<Any> listM5018 = m5018(banner);
        if (!z10) {
            int i11 = 34 / 0;
        }
        return listM5018;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Display.Banner m5012(Ad.Display display) {
        int i10 = f881 + 29;
        f882 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Display.Banner bannerM5005 = m5005(display);
        int i12 = f882 + 93;
        f881 = i12 % 128;
        int i13 = i12 % 2;
        return bannerM5005;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Ad.Video m5013(Ad ad2) {
        int i10 = f881 + 27;
        f882 = i10 % 128;
        int i11 = i10 % 2;
        Ad.Video videoM4983 = m4983(ad2);
        int i12 = f881 + 19;
        f882 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return videoM4983;
        }
        int i13 = 30 / 0;
        return videoM4983;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5014(Ad.Video video) {
        int i10 = f881 + 95;
        f882 = i10 % 128;
        if ((i10 % 2 == 0 ? '6' : 'Z') != '6') {
            return video.getAdm();
        }
        video.getAdm();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5015(Ad ad2, int i10) {
        int i11 = f882 + 99;
        f881 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            ad2.getBundle(i10);
            throw null;
        }
        String bundle = ad2.getBundle(i10);
        int i12 = f882 + 41;
        f881 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return bundle;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5016(AdRequestParameters adRequestParameters) {
        int i10 = f882 + 25;
        f881 = i10 % 128;
        int i11 = i10 % 2;
        String strM4988 = m4988(adRequestParameters);
        int i12 = f881 + 99;
        f882 = i12 % 128;
        int i13 = i12 % 2;
        return strM4988;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5017(RequestExtension requestExtension) {
        int i10 = f882 + 123;
        f881 = i10 % 128;
        if (i10 % 2 != 0) {
            m4995(requestExtension);
            throw null;
        }
        String strM4995 = m4995(requestExtension);
        int i11 = f881 + 101;
        f882 = i11 % 128;
        int i12 = i11 % 2;
        return strM4995;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<Any> m5018(Ad.Display.Banner banner) {
        int i10 = f882 + 41;
        f881 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 26 : 'R';
        List<Any> extProtoList = banner.getExtProtoList();
        if (c10 != 'R') {
            int i11 = 7 / 0;
        }
        int i12 = f882 + 45;
        f881 = i12 % 128;
        int i13 = i12 % 2;
        return extProtoList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m4998((ViewConfiguration.getEdgeSlop() >> 16) + 929, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41455), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5000((Ad.Display) list.get(0));
            }
        });
        map.put(m4998(KeyEvent.keyCodeFromString("") + 942, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSizeAndState(0, 0, 0) + 11).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5008((Ad.Video) list.get(0));
            }
        });
        map.put(m4998(953 - TextUtils.getCapsMode("", 0, 0), (char) View.combineMeasuredStates(0, 0), 9 - Color.green(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m4987((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m4998((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 962, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42356), TextUtils.getOffsetBefore("", 0) + 10).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5006((Ad) list.get(0));
            }
        });
        map.put(m4998(972 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5012((Ad.Display) list.get(0));
            }
        });
        map.put(m4998(View.getDefaultSize(0, 0) + 988, (char) ExpandableListView.getPackedPositionGroup(0L), 21 - KeyEvent.keyCodeFromString("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5011((Ad.Display.Banner) list.get(0));
            }
        });
        map.put(m4998(1009 - Color.green(0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 8 - KeyEvent.keyCodeFromString("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5013((Ad) list.get(0));
            }
        });
        map.put(m4998(KeyEvent.getDeadChar(0, 0) + 1017, (char) (9018 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5001((Ad) list.get(0), ((Integer) list.get(1)).intValue());
            }
        });
        map.put(m4998(1028 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6627), Process.getGidForName("") + 14).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m4993((Ad) list.get(0));
            }
        });
        map.put(m4998((Process.myTid() >> 22) + IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, (char) TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m4994((AdRequestParameters) list.get(0));
            }
        });
        map.put(m4998((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1053, (char) (6537 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5016((AdRequestParameters) list.get(0));
            }
        });
        map.put(m4998(MotionEvent.axisFromString("") + 1064, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4032), 11 - Color.argb(0, 0, 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5017((RequestExtension) list.get(0));
            }
        });
        map.put(m4998(Drawable.resolveOpacity(0, 0) + 1074, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 22 - Process.getGidForName("")).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bl.m4990((InterstitialAd) list.get(0), (InterstitialListener) list.get(1));
                return null;
            }
        });
        map.put(m4998(1097 - View.resolveSize(0, 0), (char) (Drawable.resolveOpacity(0, 0) + 52974), TextUtils.indexOf((CharSequence) "", '0') + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bl.m5003((RewardedAd) list.get(0), (RewardedListener) list.get(1));
                return null;
            }
        });
        map.put(m4998(1116 - TextUtils.indexOf("", "", 0, 0), (char) (65340 - (ViewConfiguration.getFadingEdgeLength() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) + 18).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bl.m4996((BannerView) list.get(0), (BannerListener) list.get(1));
                return null;
            }
        });
        map.put(m4998(1132 - ExpandableListView.getPackedPositionChild(0L), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 38727), 15 - Gravity.getAbsoluteGravity(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5002((Ad) list.get(0));
            }
        });
        map.put(m4998(1149 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), View.MeasureSpec.getSize(0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5004((Any) list.get(0));
            }
        });
        map.put(m4998(1161 - TextUtils.getOffsetBefore("", 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 44400), 17 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bl.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bl.m5007((ByteString) list.get(0));
            }
        });
        int i10 = f881 + 83;
        f882 = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        hz hzVarM6427;
        String strM4998;
        int i10 = f882 + 31;
        f881 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? (char) 21 : '[') != '[') {
                hzVarM6427 = hu.m6425().m6427();
                strM4998 = m4998(0 % (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1)), (char) (22158 % (ViewConfiguration.getPressedStateDuration() >> 20)), 47 / (ViewConfiguration.getJumpTapTimeout() - 43));
            } else {
                hzVarM6427 = hu.m6425().m6427();
                strM4998 = m4998(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 20736), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12);
            }
            return hzVarM6427.m6527(BidMachine.class, strM4998.intern());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[PHI: r6
      0x0097: PHI (r6v39 byte) = (r6v8 byte), (r6v14 byte), (r6v0 byte) binds: [B:179:0x0771, B:141:0x05cd, B:12:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 2626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bl.mo4814(java.lang.String):java.lang.Class");
    }
}
