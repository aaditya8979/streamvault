package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.adqualitysdk.sdk.i.bd;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementData;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPlacementVideoListener;
import com.tapjoy.TJSplitWebView;
import com.tapjoy.Tapjoy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class cg extends bd {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1333 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1335 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1336 = 219010939;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1337 = 51;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f1338 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1339 = -561393916;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1340 = {5, 11, -13, 13, -11, 17, 34, -51, 11, -5, 25, -15, 35, -9, -10, 5, 11, -13, 13, -11, 17, 34, -51, 6, 9, -15, 6, -1, 44, -7, -10, 13, -7, 8, -10, 13, 25, -38, -1, 6, -11, 17, 34, 13, -7, 8, -10, 13, 25, -38, -1, 6, -11, 17, 34, 19, -73, 18, -4, -13, 72, -54, -5, 8, -17, 5, 63, -75, 10, 5, -6, 15, -19, 70, -63, -2, 12, 13, -14, -4, 8, -3, 48, 13, -14, -4, 8, -3, 48, 20, -73, 18, -4, -13, 72, -54, -5, 8, -17, 5, 63, -75, 10, 5, -6, 15, -19, 70, -63, -2, 12, 18, -4, 19, -14, -5, 8, -17, 37, 18, -4, 19, -12, -3, 14, 13, -10, 13, -9, 9, -15, 1, 10, 29, -35, 10, 1, -5, 19, 12, -10, 13, -9, 9, -15, 1, 10, 29, -43, 18, -4, 19, -12, -3, 14, -29, 11, -5, 25, -15, 35, -9, -10, 13, -9, 9, -15, 1, 10, 29, -35, 10, 1, -5, 19, -30, 11, -5, 25, -15, 35, -9, -10, 13, -9, 9, -15, 1, 10, 29, -35, 10, 1, -5, 19, -30, 6, 9, -8, 8, 2, 2, -11, 28, 6, -10, -2, 3, -5, -9, 48, -17, 9, -42, 11, -5, 25, -15, 35, -9, -10, 22, -11, 9, -13, 0, -3, 50, -7, -10, 6, 9, -8, 8, 2, 2, -11, 28, 6, -10, 18, -4, 19, -12, -3, 14, -29, 11, -3, -4, 29, 9, -10, -8, 12, 19, -38, 6, 9, -8, 8, 2, 2, -11, 28, -36, 15, -2, 13, -9, 9, -15, 1, 10, 29, -40, 15, -2, 13, -9, 9, -15, 1, 10, 29, -35, 10, 1, -5, 19, -30, 15, -2, -6, 29, ExifInterface.MARKER_APP1, 1, 18, 21, -40, 15, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int[] f1334 = {-1432428120, 1280577410, -107498678, 997033691, -930604812, -1387762407, -736079987, 282835398, -325445394, -224666713, -614510409, -1510484538, -879457680, 250479336, -2004751562, -44591585, 1884384770, -1870984509};

    public cg(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static TJPlacementVideoListener m5602(TJPlacement tJPlacement) {
        int i10 = f1335 + 57;
        f1333 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        TJPlacementVideoListener videoListener = tJPlacement.getVideoListener();
        if (!z10) {
            int i11 = 31 / 0;
        }
        int i12 = f1333 + 37;
        f1335 = i12 % 128;
        int i13 = i12 % 2;
        return videoListener;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m5603(TJPlacementData tJPlacementData) {
        int i10 = f1333 + 21;
        f1335 = i10 % 128;
        int i11 = i10 % 2;
        String httpResponse = tJPlacementData.getHttpResponse();
        int i12 = f1335 + 41;
        f1333 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return httpResponse;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5604(TJPlacement tJPlacement) {
        int i10 = f1335 + 93;
        f1333 = i10 % 128;
        int i11 = i10 % 2;
        String name = tJPlacement.getName();
        int i12 = f1333 + 17;
        f1335 = i12 % 128;
        int i13 = i12 % 2;
        return name;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5605(TJPlacementData tJPlacementData) {
        int i10 = f1335 + 115;
        f1333 = i10 % 128;
        int i11 = i10 % 2;
        String url = tJPlacementData.getUrl();
        int i12 = f1333 + 9;
        f1335 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return url;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m5606(TJSplitWebView tJSplitWebView) {
        int i10 = f1335 + 85;
        f1333 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String strM5612 = m5612(tJSplitWebView);
        if (z10) {
            int i11 = 21 / 0;
        }
        return strM5612;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m5607(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i10 = f1333 + 111;
        f1335 = i10 % 128;
        int i11 = i10 % 2;
        m5615(tJPlacement, tJPlacementVideoListener);
        int i12 = f1333 + 61;
        f1335 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static TJPlacementListener m5608(TJPlacement tJPlacement) {
        int i10 = f1335 + 95;
        f1333 = i10 % 128;
        int i11 = i10 % 2;
        TJPlacementListener listener = tJPlacement.getListener();
        int i12 = f1335 + 69;
        f1333 = i12 % 128;
        int i13 = i12 % 2;
        return listener;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5609(TJPlacementData tJPlacementData) {
        int i10 = f1335 + 121;
        f1333 = i10 % 128;
        int i11 = i10 % 2;
        String placementName = tJPlacementData.getPlacementName();
        int i12 = f1333 + 37;
        f1335 = i12 % 128;
        if ((i12 % 2 != 0 ? '+' : ')') != '+') {
            return placementName;
        }
        int i13 = 14 / 0;
        return placementName;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementVideoListener m5610(TJPlacement tJPlacement) {
        int i10 = f1333 + 29;
        f1335 = i10 % 128;
        int i11 = i10 % 2;
        TJPlacementVideoListener tJPlacementVideoListenerM5602 = m5602(tJPlacement);
        int i12 = f1333 + 1;
        f1335 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 22 : '\n') == '\n') {
            return tJPlacementVideoListenerM5602;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m5611(TJPlacementData tJPlacementData) {
        int i10 = f1335 + 97;
        f1333 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String strM5609 = m5609(tJPlacementData);
        if (!z10) {
            int i11 = 4 / 0;
        }
        return strM5609;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5612(TJSplitWebView tJSplitWebView) {
        int i10 = f1333 + 7;
        f1335 = i10 % 128;
        int i11 = i10 % 2;
        String lastUrl = tJSplitWebView.getLastUrl();
        int i12 = f1333 + 103;
        f1335 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return lastUrl;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5613(TJPlacement tJPlacement) {
        int i10 = f1335 + 111;
        f1333 = i10 % 128;
        int i11 = i10 % 2;
        String strM5604 = m5604(tJPlacement);
        int i12 = f1333 + 47;
        f1335 = i12 % 128;
        int i13 = i12 % 2;
        return strM5604;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m5614(TJPlacementData tJPlacementData) {
        int i10 = f1335 + 25;
        f1333 = i10 % 128;
        int i11 = i10 % 2;
        String strM5605 = m5605(tJPlacementData);
        int i12 = f1333 + 53;
        f1335 = i12 % 128;
        if ((i12 % 2 != 0 ? '>' : '!') != '>') {
            return strM5605;
        }
        int i13 = 19 / 0;
        return strM5605;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m5615(TJPlacement tJPlacement, TJPlacementVideoListener tJPlacementVideoListener) {
        int i10 = f1335 + 73;
        f1333 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        tJPlacement.setVideoListener(tJPlacementVideoListener);
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ TJPlacementListener m5616(TJPlacement tJPlacement) {
        int i10 = f1333 + 107;
        f1335 = i10 % 128;
        int i11 = i10 % 2;
        TJPlacementListener tJPlacementListenerM5608 = m5608(tJPlacement);
        int i12 = f1333 + 51;
        f1335 = i12 % 128;
        if (i12 % 2 == 0) {
            return tJPlacementListenerM5608;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5617(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1337;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1340;
                i14 = bArr != null ? (byte) (bArr[f1336 + i10] + i13) : (short) (f1338[f1336 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f1336 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f1339);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f1340;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f1338;
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m5618(TJPlacementData tJPlacementData) {
        int i10 = f1333 + 65;
        f1335 = i10 % 128;
        if ((i10 % 2 != 0 ? 'b' : 'M') == 'b') {
            m5603(tJPlacementData);
            throw null;
        }
        String strM5603 = m5603(tJPlacementData);
        int i11 = f1335 + 47;
        f1333 = i11 % 128;
        int i12 = i11 % 2;
        return strM5603;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5619(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1334.clone();
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        map.put(m5617((ViewConfiguration.getEdgeSlop() >> 16) - 219010686, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 561394018 - ImageFormat.getBitsPerPixel(0), (byte) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-35) - Color.alpha(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cg.m5611((TJPlacementData) list.get(0));
            }
        });
        map.put(m5619(new int[]{-1958801393, 1536172740, -1552717910, -419449448}, TextUtils.indexOf("", "", 0) + 6).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cg.m5614((TJPlacementData) list.get(0));
            }
        });
        map.put(m5619(new int[]{347814129, 1202057100, 1999056273, 1158179549, -1225331947, 429344231, 1204208215, -1379957247}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cg.m5618((TJPlacementData) list.get(0));
            }
        });
        map.put(m5619(new int[]{592326598, -1191627709, 961209126, 2091488041}, 7 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cg.m5613((TJPlacement) list.get(0));
            }
        });
        map.put(m5617((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 219010671, (short) View.combineMeasuredStates(0, 0), 561394019 - View.resolveSizeAndState(0, 0, 0), (byte) (ViewConfiguration.getEdgeSlop() >> 16), Color.red(0) - 40).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cg.m5616((TJPlacement) list.get(0));
            }
        });
        map.put(m5617((-219010661) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) TextUtils.getCapsMode("", 0, 0), 561394019 - KeyEvent.getDeadChar(0, 0), (byte) KeyEvent.getDeadChar(0, 0), (-35) - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cg.m5610((TJPlacement) list.get(0));
            }
        });
        map.put(m5619(new int[]{396982242, 1913312082, -2005820419, 1074999625, 1079795563, 14035280, 2007860748, -41227398}, Color.green(0) + 16).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                cg.m5607((TJPlacement) list.get(0), (TJPlacementVideoListener) list.get(1));
                return null;
            }
        });
        map.put(m5617((-219010646) - TextUtils.indexOf("", ""), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 561394019, (byte) ((-1) - TextUtils.lastIndexOf("", '0')), (-41) - KeyEvent.normalizeMetaState(0)).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo4815(List<Object> list, ch chVar) {
                return cg.m5606((TJSplitWebView) list.get(0));
            }
        });
        int i10 = f1333 + 3;
        f1335 = i10 % 128;
        if ((i10 % 2 != 0 ? 'N' : '4') != 'N') {
            return map;
        }
        int i11 = 36 / 0;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        String version;
        int i10 = f1333 + 51;
        f1335 = i10 % 128;
        if (i10 % 2 == 0) {
            version = Tapjoy.getVersion();
        } else {
            version = Tapjoy.getVersion();
            int i11 = 58 / 0;
        }
        int i12 = f1333 + 1;
        f1335 = i12 % 128;
        if ((i12 % 2 != 0 ? '(' : (char) 26) == 26) {
            return version;
        }
        int i13 = 80 / 0;
        return version;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x02f2  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class mo4814(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cg.mo4814(java.lang.String):java.lang.Class");
    }
}
