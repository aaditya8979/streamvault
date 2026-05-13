package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.sdk.Ogury;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class by extends bd {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1190 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1191 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f1192 = {-78, -68, 68, -70, 66, -90, -107, 98, -68, 79, 66, -68, 66, -74, -74, -70, 70, -79, -110, 83, -91, 123, -120, -123, 123, -123, 113, 113, 125, -127, 118, 85, -96, 119, -115, 126, 104, 71, -67, 67, -69, 75, 64, 87, -94, 105, -97, 65, -78, -65, 65, -65, 75, 75, 71, -69, 76, 111, -102, 77, -73, 68, 82, -107, 107, 73, -73, 68, -89, 92, -92, -91, 111, -79, 75, -72, -82, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1193 = -1192899773;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f1194 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1195 = 121;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1196 = 24841;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1197 = 1693;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1198 = 5365;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1199 = 19646;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1200 = -780611821;

    public by(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5431(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i10 = f1190 + 5;
        f1191 = i10 % 128;
        int i11 = i10 % 2;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        int i12 = f1191 + 91;
        f1190 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m5432(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i10 = f1191 + 71;
        f1190 = i10 % 128;
        int i11 = i10 % 2;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        int i12 = f1191 + 3;
        f1190 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5433(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1195;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1192;
                i14 = bArr != null ? (byte) (bArr[f1200 + i10] + i13) : (short) (f1194[f1200 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f1200 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f1193);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f1192;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f1194;
                        int i16 = o.f3016;
                        o.f3016 = i16 - 1;
                        o.f3019 = (char) (o.f3018 + (((short) (sArr[i16] + s10)) ^ o.f3017));
                    }
                    sb2.append(o.f3019);
                    o.f3018 = o.f3019;
                    o.f3020++;
                }
            }
            string = sb2.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5434(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1199)) ^ ((c11 >>> 5) + f1196)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1197) ^ ((c12 + i12) ^ ((c12 << 4) + f1198))));
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
    public static /* synthetic */ void m5435(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i10 = f1191 + 67;
        f1190 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m5431(oguryInterstitialAd, oguryInterstitialAdListener);
        if (!z10) {
            throw null;
        }
        int i11 = f1191 + 69;
        f1190 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m5436(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i10 = f1190 + 39;
        f1191 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m5432(oguryRewardedAd, oguryRewardedAdListener);
        if (z10) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5434("ㆽ쮋셖렴犱哩ৌ耧컥ɯ蜕귭㛪磇제ቹ\u18af놤\u0cf4垨뤪᭸䭃\ue1a0ൈំ", View.getDefaultSize(0, 0) + 25).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                by.m5435((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m5434("ㆽ쮋빺稸ﻱӎ靂职愖ꓛ搗鈐\u18af놤\u0cf4垨뤪᭸䭃\ue1a0ൈំ", View.resolveSize(0, 0) + 21).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                by.m5436((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        int i10 = f1190 + 47;
        f1191 = i10 % 128;
        if ((i10 % 2 != 0 ? 'K' : (char) 16) == 16) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f1190 + 55;
        f1191 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                return Ogury.getSdkVersion();
            }
            Ogury.getSdkVersion();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0137  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.by.mo4814(java.lang.String):java.lang.Class");
    }
}
