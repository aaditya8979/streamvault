package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class bn extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f941 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f942 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f943 = 39776;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f944 = 50265;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f945 = -7618697074672581355L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f946 = 13662;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f947 = 30504;

    public class b extends WeakHashMap<View, WeakReference<Object>> implements hg<WeakHashMap<View, WeakReference<Object>>> {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f957 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f958 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static char f959 = 24654;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f960 = 58341;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f961 = 36148;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f962 = 22631;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ch f963;

        public b(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
            super(weakHashMap);
            this.f963 = chVar;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakHashMap<View, WeakReference<Object>> m5091() {
            int i10 = f958;
            int i11 = i10 + 123;
            f957 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 21;
            f957 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m5092(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f960)) ^ ((c11 >>> 5) + f959)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f961) ^ ((c12 + i12) ^ ((c12 << 4) + f962))));
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WeakReference<Object> m5093(View view, WeakReference<Object> weakReference) {
            int i10 = f957 + 13;
            f958 = i10 % 128;
            int i11 = i10 % 2;
            bn.this.m4894(this, this.f963, m5092("螔㠡㵼碗\uef04懒\uf58a뜜魮ꈹ\ueb96寀괬\ue4c1⇌됈ﻰଲᾢ㻵켅檫렋嶂", ExpandableListView.getPackedPositionChild(0L) + 24).intern(), view, weakReference);
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            int i12 = f958 + 105;
            f957 = i12 % 128;
            int i13 = i12 % 2;
            return weakReference2;
        }

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i10 = f958 + 31;
            f957 = i10 % 128;
            int i11 = i10 % 2;
            WeakReference<Object> weakReferenceM5093 = m5093((View) obj, (WeakReference<Object>) obj2);
            int i12 = f957 + 19;
            f958 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            return weakReferenceM5093;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo4818() {
            WeakHashMap<View, WeakReference<Object>> weakHashMapM5091;
            int i10 = f957 + 109;
            f958 = i10 % 128;
            if (i10 % 2 != 0) {
                weakHashMapM5091 = m5091();
                int i11 = 72 / 0;
            } else {
                weakHashMapM5091 = m5091();
            }
            int i12 = f958 + 49;
            f957 = i12 % 128;
            int i13 = i12 % 2;
            return weakHashMapM5091;
        }
    }

    public bn(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m5071() {
        int i10 = f942 + 43;
        f941 = i10 % 128;
        String strIntern = m5085("ᐚ㕨ކ톳◫㱕讘쌁疼晦薼왯ꢰ潌蹟㕩㝱䲌訔䘱靭ⷜ⻋⢕\uef13㩙ꢰ潌\udbd0ල钩\udade\u09c5ⴑ", i10 % 2 == 0 ? 33 - TextUtils.indexOf((CharSequence) "", '0', 0, 0) : 7 << TextUtils.indexOf((CharSequence) "", '\'', 1, 1)).intern();
        int i11 = f941 + 69;
        f942 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m5072() {
        int i10 = f942 + 1;
        f941 = i10 % 128;
        String strIntern = (i10 % 2 == 0 ? m5085("懖ᄭ쓭ࢲ恠侊屟䢮", 7 - TextUtils.indexOf((CharSequence) "", '0', 0)) : m5085("懖ᄭ쓭ࢲ恠侊屟䢮", 38 - TextUtils.indexOf((CharSequence) "", (char) 7, 1))).intern();
        int i11 = f942 + 117;
        f941 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        int i12 = 83 / 0;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static DynamicLoader m5073() {
        int i10 = f941 + 107;
        f942 = i10 % 128;
        if ((i10 % 2 == 0 ? 'Z' : '\b') == 'Z') {
            DynamicLoaderFactory.getDynamicLoader();
            throw null;
        }
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        int i11 = f941 + 111;
        f942 = i11 % 128;
        int i12 = i11 % 2;
        return dynamicLoader;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ DynamicLoader m5074() {
        int i10 = f942 + 115;
        f941 = i10 % 128;
        int i11 = i10 % 2;
        DynamicLoader dynamicLoaderM5073 = m5073();
        int i12 = f942 + 37;
        f941 = i12 % 128;
        int i13 = i12 % 2;
        return dynamicLoaderM5073;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m5075() {
        int i10 = f941 + 117;
        f942 = i10 % 128;
        int i11 = i10 % 2;
        String strM5071 = m5071();
        int i12 = f941 + 55;
        f942 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM5071;
        }
        int i13 = 33 / 0;
        return strM5071;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ String m5076() {
        int i10 = f941 + 113;
        f942 = i10 % 128;
        int i11 = i10 % 2;
        String strM5072 = m5072();
        int i12 = f941 + 91;
        f942 = i12 % 128;
        if ((i12 % 2 == 0 ? '\"' : ']') != '\"') {
            return strM5072;
        }
        int i13 = 41 / 0;
        return strM5072;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5077(AdView adView) {
        int i10 = f941 + 47;
        f942 = i10 % 128;
        int i11 = i10 % 2;
        String strM5090 = m5090(adView);
        int i12 = f942 + 123;
        f941 = i12 % 128;
        if (i12 % 2 == 0) {
            return strM5090;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private WeakHashMap<View, WeakReference<Object>> m5078(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
        b bVar = new b(weakHashMap, chVar);
        int i10 = f941 + 109;
        f942 = i10 % 128;
        if ((i10 % 2 == 0 ? '2' : '#') == '#') {
            return bVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static AdPlacementType m5079(AdAdapter adAdapter) {
        int i10 = f941 + 107;
        f942 = i10 % 128;
        int i11 = i10 % 2;
        AdPlacementType placementType = adAdapter.getPlacementType();
        int i12 = f942 + 87;
        f941 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 26 : (char) 14) != 26) {
            return placementType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5080(Ad ad2) {
        int i10 = f942 + 99;
        f941 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String placementId = ad2.getPlacementId();
        if (z10) {
            int i11 = 48 / 0;
        }
        return placementId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m5081(AdView adView, AdListener adListener) {
        int i10 = f942 + 115;
        f941 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'I' : (char) 22;
        m5087(adView, adListener);
        if (c10 != 'I') {
            return;
        }
        int i11 = 75 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m5082(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i10 = f941 + 29;
        f942 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m5088(interstitialAd, interstitialAdListener);
        if (!z10) {
            return;
        }
        int i11 = 77 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ AdPlacementType m5083(AdAdapter adAdapter) {
        int i10 = f941 + 23;
        f942 = i10 % 128;
        int i11 = i10 % 2;
        AdPlacementType adPlacementTypeM5079 = m5079(adAdapter);
        int i12 = f942 + 103;
        f941 = i12 % 128;
        int i13 = i12 % 2;
        return adPlacementTypeM5079;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5084(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f945, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f945));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5085(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f947)) ^ ((c11 >>> 5) + f944)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f943) ^ ((c12 + i12) ^ ((c12 << 4) + f946))));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ WeakHashMap m5086(bn bnVar, WeakHashMap weakHashMap, ch chVar) {
        int i10 = f942 + 5;
        f941 = i10 % 128;
        if ((i10 % 2 != 0 ? '=' : '+') != '=') {
            return bnVar.m5078((WeakHashMap<View, WeakReference<Object>>) weakHashMap, chVar);
        }
        bnVar.m5078((WeakHashMap<View, WeakReference<Object>>) weakHashMap, chVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5087(AdView adView, AdListener adListener) {
        int i10 = f942 + 109;
        f941 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '\"' : ':';
        adView.setAdListener(adListener);
        if (c10 != ':') {
            throw null;
        }
        int i11 = f941 + 21;
        f942 = i11 % 128;
        if ((i11 % 2 == 0 ? 'V' : 'U') == 'U') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5088(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i10 = f941 + 115;
        f942 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        interstitialAd.setAdListener(interstitialAdListener);
        if (z10) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5089(Ad ad2) {
        int i10 = f941 + 79;
        f942 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return m5080(ad2);
        }
        m5080(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5090(AdView adView) {
        int i10 = f941 + 23;
        f942 = i10 % 128;
        int i11 = i10 % 2;
        String placementId = adView.getPlacementId();
        int i12 = f941 + 53;
        f942 = i12 % 128;
        int i13 = i12 % 2;
        return placementId;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5084("뉔눳\ue5bdꃍ\uee29摷皎Ꙭ맡벵瀴娗骑补岕乲軡柈⥉떨\ue36b玵㔒養\ud7a6佭Ƃ赵", 1 - View.combineMeasuredStates(0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bn.m5077((AdView) list.get(0));
            }
        });
        map.put(m5085("톅衫ཽ\uda82\ua7e0Րކ톳풚᧥꣒\ue110ꣁ뭦쿚鍽ᧂ⺖ÞᲫ", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bn.m5089((Ad) list.get(0));
            }
        });
        map.put(m5085("㕷\ueb21豫鏤⦋㋭\ue4a4漢透䚂㙽\uf322됣\ueb2c", View.combineMeasuredStates(0, 0) + 13).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bn.m5081((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        map.put(m5084("鴳鵔ῥ媕❸괦\udbd9褒ᒧ䛨륯\uf751뗵爻闏\ue30eꆪ鶀\ue029ᣳ찑觫ﱃ㑋\uf8e3딵죀\u202d\ue4bfꂑ⌌巹ጚ쳳㽚䥕㿣\uf835௹攝⮾", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bn.m5076();
            }
        });
        map.put(m5084("獇猠蕝쀭\ue001機\ue787杦⣹\udc50縖쬏宁\ue883劶\udf50俞ܸ❐⒭≥ፓ㬺ࠕᚗ⾍ྐྵᱳો㨩\ue466憠ﵯ噿\uf816甀톃报첪奔엘礡ꅯ꺁롪镹", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bn.m5075();
            }
        });
        map.put(m5085("㕷\ueb21ᤨ䧬꣒\ue110嚊霽킢艨戞릎䃽ꩾÞᲫ辎啘킢艨ె馌嚊霽", KeyEvent.keyCodeFromString("") + 24).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                bn.m5082((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5084("湣渄॥䰕䍒줌䑰穎謋偢\udd4d棵䚢撻\uf1cc粃勾謐萑蝂", -ExpandableListView.getPackedPositionChild(0L)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bn.m5074();
            }
        });
        map.put(m5084("蛬蚋\uea6a꼚\ue684泚飈鋔垧덢碙둑긩螲吸ꀴ멄栂⇒对", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bn.m5083((AdAdapter) list.get(0));
            }
        });
        map.put(m5084("즄짧⺳比\ue2b4棻ᘷ\udda4\ud969瞿粞㪸\ue162䍯倒⻧\uf50e곇◓픶颃뢳㦯轢걨葫ഉ\uede2뀱釟\ue6e6", -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return bn.m5086(bn.this, (WeakHashMap) list.get(0), chVar);
            }
        });
        int i10 = f942 + 65;
        f941 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 14 : 'B') != 14) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f942 + 79;
        f941 = i10 % 128;
        int i11 = i10 % 2;
        try {
            try {
                try {
                    String str = (String) hu.m6425().m6428().m6376(AdSdkVersion.class, String.class).get(null);
                    int i12 = f941 + 107;
                    f942 = i12 % 128;
                    int i13 = i12 % 2;
                    return str;
                } catch (Throwable unused) {
                    return hu.m6425().m6427().m6527(BuildConfig.class, m5084("\udc8f\udcd1珗㚞쟃䶍腘좇丼⫚妓귲\uf40cṄ画", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (Throwable unused3) {
            return (String) hu.m6425().m6428().m6376(AdSdkVersion.class, String.class).get(null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0217  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.bn.mo4814(java.lang.String):java.lang.Class");
    }
}
