package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoAd;

/* JADX INFO: loaded from: classes9.dex */
public final class cc extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1267 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1268 = {'I', 'V', 'i', 'd', 'e', 'o', 'P', 'l', 'a', 'y', 'r', 'L', 's', 't', 'n', 'S', 'A', 'C', 'c', 'k', 'w', 'u', 'm', 'W', 'b', 'T', 'M', 'R', 'p', 'f', 'B', 'E', 'v', 'J', 'K', 'N'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1269 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1270 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1271;

    public cc(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static SAInterface m5527() {
        int i10 = f1267 + 13;
        f1271 = i10 % 128;
        if ((i10 % 2 != 0 ? '\f' : (char) 20) != '\f') {
            return SAVideoAd.getListener();
        }
        SAVideoAd.getListener();
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ SAInterface m5528() {
        int i10 = f1267 + 89;
        f1271 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 31 : (char) 21) == 21) {
            return m5527();
        }
        m5527();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5529(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f728) {
            char[] cArr2 = new char[i10];
            b.f726 = 0;
            while (true) {
                int i13 = b.f726;
                if (i13 >= i10) {
                    break;
                }
                b.f727 = cArr[i13];
                cArr2[b.f726] = (char) (b.f727 + i12);
                int i14 = b.f726;
                cArr2[i14] = (char) (cArr2[i14] - f1269);
                b.f726 = i14 + 1;
            }
            if (i11 > 0) {
                b.f729 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f729;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f729;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f726 = 0;
                while (true) {
                    int i17 = b.f726;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f726 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5530(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f1268;
            char c10 = f1270;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2156 = 0;
                while (true) {
                    int i11 = g.f2156;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2155 = cArr[i11];
                    g.f2153 = cArr[g.f2156 + 1];
                    if (g.f2155 == g.f2153) {
                        cArr3[g.f2156] = (char) (g.f2155 - b10);
                        cArr3[g.f2156 + 1] = (char) (g.f2153 - b10);
                    } else {
                        g.f2154 = g.f2155 / c10;
                        g.f2152 = g.f2155 % c10;
                        g.f2157 = g.f2153 / c10;
                        g.f2150 = g.f2153 % c10;
                        if (g.f2152 == g.f2150) {
                            g.f2154 = ((g.f2154 + c10) - 1) % c10;
                            g.f2157 = ((g.f2157 + c10) - 1) % c10;
                            int i12 = (g.f2154 * c10) + g.f2152;
                            int i13 = (g.f2157 * c10) + g.f2150;
                            int i14 = g.f2156;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2154 == g.f2157) {
                            g.f2152 = ((g.f2152 + c10) - 1) % c10;
                            g.f2150 = ((g.f2150 + c10) - 1) % c10;
                            int i15 = (g.f2154 * c10) + g.f2152;
                            int i16 = (g.f2157 * c10) + g.f2150;
                            int i17 = g.f2156;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2154 * c10) + g.f2150;
                            int i19 = (g.f2157 * c10) + g.f2152;
                            int i20 = g.f2156;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2156 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m5531(SAAd sAAd) {
        int i10 = f1271 + 13;
        f1267 = i10 % 128;
        if ((i10 % 2 == 0 ? '5' : (char) 17) != '5') {
            return m5532(sAAd);
        }
        m5532(sAAd);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m5532(SAAd sAAd) {
        int i10 = f1271 + 11;
        f1267 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectWriteToJson = sAAd.writeToJson();
        int i12 = f1271 + 17;
        f1267 = i12 % 128;
        int i13 = i12 % 2;
        return jSONObjectWriteToJson;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m5533(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i10 = f1271 + 63;
        f1267 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'T' : 'O';
        m5534(sABannerAd, sAInterface);
        if (c10 == 'T') {
            int i11 = 30 / 0;
        }
        int i12 = f1267 + 63;
        f1271 = i12 % 128;
        if ((i12 % 2 != 0 ? '[' : (char) 5) != '[') {
            return;
        }
        int i13 = 3 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5534(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i10 = f1267 + 97;
        f1271 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        sABannerAd.setListener(sAInterface);
        if (!z10) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5530("\t\u0002\u0016\u000b\u0001\u000e\u0001\u001c\u0003#\u0011\u0000\u009e", 12 - ExpandableListView.getPackedPositionChild(0L), (byte) (47 - ExpandableListView.getPackedPositionChild(0L))).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cc.m5531((SAAd) list.get(0));
            }
        });
        map.put(m5529("\u0002\u0000\u000f\ufff1\u0004\uffff\u0000\nￜ\uffff\uffe7\u0004\u000e\u000f\u0000\t\u0000\r", 19 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), false, View.MeasureSpec.makeMeasureSpec(0, 0) + 18, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 105).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cc.m5528();
            }
        });
        map.put(m5529("\u000b\f�\u0006�\n\u000b�\fￚ\ufff9\u0006\u0006�\n￤\u0001", KeyEvent.getDeadChar(0, 0) + 17, false, View.resolveSizeAndState(0, 0, 0) + 6, KeyEvent.keyCodeFromString("") + 109).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cc.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                cc.m5533((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        int i10 = f1271 + 25;
        f1267 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        String sDKVersionNumber;
        int i10 = f1271 + 109;
        f1267 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                sDKVersionNumber = SAVersion.getSDKVersionNumber();
                int i11 = 82 / 0;
            } else {
                sDKVersionNumber = SAVersion.getSDKVersionNumber();
            }
            int i12 = f1271 + 81;
            f1267 = i12 % 128;
            if ((i12 % 2 == 0 ? 'H' : 'A') == 'A') {
                return sDKVersionNumber;
            }
            int i13 = 53 / 0;
            return sDKVersionNumber;
        } catch (Throwable unused) {
            return hu.m6425().m6427().m6527(SAVersion.class, m5529("\uffdd\fￚ\u000b\u0013ￓ\r\u000b\u0013\n\u000b\u0013", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, false, 6 - (ViewConfiguration.getTouchSlop() >> 8), 85 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ce  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 1886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cc.mo4814(java.lang.String):java.lang.Class");
    }
}
