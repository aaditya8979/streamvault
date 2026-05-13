package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class am {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f327 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f328 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f332 = 6;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f335;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final at f336;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f334 = {'I', 'r', 'o', 'n', 'S', 'u', 'c', 'e', 'C', 's', 't', 'm', 'M', 'd', 'i', 'a', 'R', 'v', '\'', ' ', ':', 'g', 'w', 'k', 'p', 'y', 'l', ',', 'f', 'b', 'h', 'J', 'K', 'L', 'N', 'O'};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f330 = true;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f329 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f331 = 34;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f333 = {'e', 131, 144, 'I', 150, 'B', 149, 135, 134, 133, 151, 145, 143, 139, 148, 152, '\\', 138, 142, 132, 'O', 137, 146, 136};

    public am(at atVar) {
        this.f336 = atVar;
        jj.m6752().m6755(new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.am.3
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                t.m7071(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.am.3.5

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static short[] f345 = null;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static int f346 = 0;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f347 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f348 = 19;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static byte[] f349 = {5, 17, 19, -27, -2, -5, 1, -2, 50, -43, 13, -4, -7, 9, 53, -64, -1, 6, -11, 19, -8, 5, -1, -8};

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f350 = -1794348690;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f351 = -1534066878;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m4529(int i10, short s10, int i11, byte b10, int i12) {
                        String string;
                        synchronized (o.f3015) {
                            StringBuilder sb2 = new StringBuilder();
                            int i13 = f348;
                            int i14 = i12 + i13;
                            boolean z10 = i14 == -1;
                            if (z10) {
                                byte[] bArr = f349;
                                i14 = bArr != null ? (byte) (bArr[f351 + i10] + i13) : (short) (f345[f351 + i10] + i13);
                            }
                            if (i14 > 0) {
                                o.f3016 = ((i10 + i14) - 2) + f351 + (z10 ? 1 : 0);
                                o.f3017 = b10;
                                char c10 = (char) (i11 + f350);
                                o.f3019 = c10;
                                sb2.append(c10);
                                o.f3018 = o.f3019;
                                o.f3020 = 1;
                                while (o.f3020 < i14) {
                                    byte[] bArr2 = f349;
                                    if (bArr2 != null) {
                                        int i15 = o.f3016;
                                        o.f3016 = i15 - 1;
                                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                                    } else {
                                        short[] sArr = f345;
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() throws Exception {
                        if ((am.m4523(am.this) ? 'H' : ')') != 'H') {
                            return;
                        }
                        int i10 = f346 + 89;
                        f347 = i10 % 128;
                        int i11 = i10 % 2;
                        am.m4518(am.this).m4705(m4529((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1534066878, (short) ExpandableListView.getPackedPositionType(0L), 1794348799 - (ViewConfiguration.getTapTimeout() >> 16), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-20) - KeyEvent.normalizeMetaState(0)).intern());
                        am.m4520(am.this, false);
                        int i12 = f346 + 105;
                        f347 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m4516(ISAdQualityAdType iSAdQualityAdType) {
        int i10 = f328 + 99;
        f327 = i10 % 128;
        int i11 = i10 % 2;
        if (iSAdQualityAdType != ISAdQualityAdType.INTERSTITIAL && iSAdQualityAdType != ISAdQualityAdType.VIDEO) {
            int i12 = f328 + 113;
            f327 = i12 % 128;
            if ((i12 % 2 != 0 ? 'Y' : '6') == 'Y') {
                ISAdQualityAdType iSAdQualityAdType2 = ISAdQualityAdType.UNKNOWN;
                throw null;
            }
            if (iSAdQualityAdType != ISAdQualityAdType.REWARDED_VIDEO) {
                int i13 = f328 + 67;
                f327 = i13 % 128;
                if (i13 % 2 != 0) {
                    ISAdQualityAdType iSAdQualityAdType3 = ISAdQualityAdType.UNKNOWN;
                    throw null;
                }
                if ((iSAdQualityAdType == ISAdQualityAdType.REWARDED ? (char) 3 : (char) 22) == 22) {
                    return false;
                }
            }
        }
        int i14 = f328 + 51;
        f327 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m4517(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        int i10 = f327 + 11;
        f328 = i10 % 128;
        int i11 = i10 % 2;
        if ((iSAdQualityMediationNetwork != null ? 'Y' : (char) 28) == 'Y') {
            if (!TextUtils.isEmpty(m4521(iSAdQualityMediationNetwork))) {
                int i12 = f328 + 107;
                f327 = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ at m4518(am amVar) {
        int i10 = f328 + 113;
        f327 = i10 % 128;
        char c10 = i10 % 2 != 0 ? 'R' : '+';
        at atVar = amVar.f336;
        if (c10 == '+') {
            return atVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m4519(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i10 = f328 + 33;
        f327 = i10 % 128;
        int i11 = i10 % 2;
        if (iSAdQualityCustomMediationRevenue != null) {
            if (iSAdQualityCustomMediationRevenue.getRevenue() >= 0.0d) {
                if (!m4517(iSAdQualityCustomMediationRevenue.getMediationNetwork())) {
                    k.m6890(m4522("\u0001\u0002\u0003\u0004\u0005\u0003\u0000\u0002\u0007\b\u000b\u0002\n\u000b\u0005\b\r\u0006\u000e\u000f\u0010\t\u0014\b\u0004\u000f\u000b\r\t\u0001\u0001\u000b", 33 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (100 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), m4522("\t\u000e\u0000\u0015\u0007\u0016\n\b\u0001\u000f\u0012\u0007\u0003\u000b\b\u0004\u0007\u0017\u0006\b\u000e\u000f\u0010\t\u0014\b\u0001\u0015\u0007\r\r\u000b\u0004\u0000\b\u0013\u0017\u0007\u000f\b\b\u000f\t\u001b\u0017\u0007\r\u0013\u000f\u0010\b\u0010\u0003\u0004\u0015\u0001\b\u000b\u0014\u0004\u0005\u0013", 62 - (ViewConfiguration.getTouchSlop() >> 8), (byte) (85 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern());
                    return false;
                }
                if ((!m4516(iSAdQualityCustomMediationRevenue.getAdType()) ? 'G' : 'S') != 'G') {
                    return true;
                }
                k.m6890(m4522("\u0001\u0002\u0003\u0004\u0005\u0003\u0000\u0002\u0007\b\u000b\u0002\n\u000b\u0005\b\r\u0006\u000e\u000f\u0010\t\u0014\b\u0004\u000f\u000b\r\t\u0001\u0001\u000b", 31 - TextUtils.lastIndexOf("", '0', 0), (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 100)).intern(), m4522("\t\u000e\u0000\u0015\u0007\u0016\n\b\u0001\u000f\u0012\u0007\u0003\u000b\b\u0004\u0007\u0017\u0006\b\u000e\u000f\u0010\t\u0014\b\u0001\u0015\u0007\r\r\u000b\u0004\u0000\b\u0013\u0015\u0007\u0000\u001d\u001a\u0000\u0004\u0007\r\u0013\u0015\r\u0013\u0019\u0007\u001c\u0019\u0006\u0007\u0015\r\u0003\r\u0019\u000f\u0002\u000b\b\u0003\u0007\b\u0010\b\u0010\u000e\u001b\u0019\u0015\f\u000f\u0013\r\u0003\u001a\u0019\u0007\n\u0013\r\u0003\u0013\r\u0013\u0019\f\u000f\u0013\r\u0001\u0014\u0015\t\u0013\u0019\u0007\r\u0015\u0010\u0007\u0013\r\u0013", TextUtils.indexOf("", "", 0, 0) + 108, (byte) (18 - View.MeasureSpec.getMode(0))).intern());
                return false;
            }
            int i12 = f327 + 23;
            f328 = i12 % 128;
            int i13 = i12 % 2;
            k.m6890(m4522("\u0001\u0002\u0003\u0004\u0005\u0003\u0000\u0002\u0007\b\u000b\u0002\n\u000b\u0005\b\r\u0006\u000e\u000f\u0010\t\u0014\b\u0004\u000f\u000b\r\t\u0001\u0001\u000b", 32 - KeyEvent.normalizeMetaState(0), (byte) ((Process.myPid() >> 22) + 100)).intern(), m4524(null, TextUtils.getCapsMode("", 0, 0) + 127, null, "\u0088\u0090\u008e\u0085\u0082\u0096\u0088\u0083\u0095\u0083\u008c\u0083\u0086\u0088\u0094\u0086\u0089\u0093\u008b\u008c\u0092\u0087\u0086\u0088\u008b\u0083\u0088\u0090\u0088\u008f\u0086\u0091\u0088\u008b\u0083\u0088\u0090\u0088\u008f\u0086\u0083\u008c\u008e\u0085\u0082\u008e\u0089\u0088\u008d\u0086\u008d\u008c\u0085\u0087\u008b\u008a\u0086\u0089\u0083\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4520(am amVar, boolean z10) {
        int i10 = f327 + 43;
        f328 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '\'' : 'U';
        amVar.f335 = z10;
        if (c10 == 'U') {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4521(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            return m4524(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0094\u008c\u008d\u0089\u0082").intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            return m4522("\u001b\u0010\r\u0002\u001a\u0011\u009a", 7 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 54)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return m4524(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u008d\u008b\u008e\u0093\u0088\u0092").intern();
        }
        if (!(iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.LEVEL_PLAY)) {
            String strIntern = m4524(null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, "\u008a\u008e\u0083\u008c\u0087\u008f\u0088\u0097\u008b\u0087").intern();
            int i10 = f328 + 13;
            f327 = i10 % 128;
            int i11 = i10 % 2;
            return strIntern;
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
            return m4522("\f\u001b\u0019\u001b\u0005\u000e\u000f\u0002", ExpandableListView.getPackedPositionGroup(0L) + 8, (byte) (20 - View.combineMeasuredStates(0, 0))).intern();
        }
        if (!(iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.UNITY)) {
            return m4522("\u0000\u0004\u0010\b\u001b\r\u000f\u0007", TextUtils.getCapsMode("", 0, 0) + 8, (byte) (35 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern();
        }
        if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.SELF_MEDIATED) {
            return iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.OTHER ? m4522("\u0004\b\u001f\u0006Ö", 4 - Process.getGidForName(""), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 100)).intern() : "";
        }
        int i12 = f328 + 9;
        f327 = i12 % 128;
        int i13 = i12 % 2;
        String strIntern2 = m4524(null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0089\u0088\u0085\u0082\u008e\u0089\u0088\u008d\u0098\u0093\u0088\u0087").intern();
        int i14 = f327 + 7;
        f328 = i14 % 128;
        int i15 = i14 % 2;
        return strIntern2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m4522(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f334;
            char c10 = f332;
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m4523(am amVar) {
        int i10 = f327;
        int i11 = i10 + 47;
        f328 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        boolean z11 = amVar.f335;
        if (z10) {
            int i12 = 21 / 0;
        }
        int i13 = i10 + 61;
        f328 = i13 % 128;
        if (i13 % 2 != 0) {
            return z11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4524(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f3010) {
            char[] cArr2 = f333;
            int i11 = f331;
            if (f329) {
                int length = bArr.length;
                m.f3012 = length;
                char[] cArr3 = new char[length];
                m.f3011 = 0;
                while (m.f3011 < m.f3012) {
                    int i12 = m.f3011;
                    int i13 = m.f3012 - 1;
                    int i14 = m.f3011;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f3011 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f330) {
                int length2 = cArr.length;
                m.f3012 = length2;
                char[] cArr4 = new char[length2];
                m.f3011 = 0;
                while (m.f3011 < m.f3012) {
                    int i15 = m.f3011;
                    int i16 = m.f3012 - 1;
                    int i17 = m.f3011;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f3011 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f3012 = length3;
            char[] cArr5 = new char[length3];
            m.f3011 = 0;
            while (m.f3011 < m.f3012) {
                int i18 = m.f3011;
                int i19 = m.f3012 - 1;
                int i20 = m.f3011;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f3011 = i20 + 1;
            }
            return new String(cArr5);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m4525(am amVar, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i10 = f327 + 125;
        f328 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM4526 = m4526(iSAdQualityCustomMediationRevenue);
        int i12 = f328 + 95;
        f327 = i12 % 128;
        int i13 = i12 % 2;
        return jSONObjectM4526;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m4526(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        dj djVar = new dj();
        djVar.m6039(true);
        djVar.m6040(Double.valueOf(iSAdQualityCustomMediationRevenue.getRevenue()));
        djVar.m6038(m4521(iSAdQualityCustomMediationRevenue.getMediationNetwork()));
        djVar.m6041(iSAdQualityCustomMediationRevenue.getPlacement());
        JSONObject jSONObjectM6042 = djVar.m6042();
        int i10 = f328 + 115;
        f327 = i10 % 128;
        if ((i10 % 2 != 0 ? ')' : 'B') != ')') {
            return jSONObjectM6042;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m4527(@NonNull final ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i10 = f327 + 45;
        f328 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 1 : '+') != '+') {
            int i11 = 49 / 0;
            if (!m4519(iSAdQualityCustomMediationRevenue)) {
                return;
            }
        } else if (!m4519(iSAdQualityCustomMediationRevenue)) {
            return;
        }
        t.m7072(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.am.2

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f337 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f338 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f339 = -1881073527;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f340;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f341;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m4528(String str, char c10, String str2, int i12, String str3) {
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
                    cArr5[2] = (char) (cArr5[2] + ((char) i12));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    j.f2697 = 0;
                    while (true) {
                        int i13 = j.f2697;
                        if (i13 < length) {
                            int i14 = (i13 + 2) % 4;
                            int i15 = (i13 + 3) % 4;
                            int i16 = cArr4[i13 % 4] * 32718;
                            char c11 = cArr5[i14];
                            char c12 = (char) ((i16 + c11) % 65535);
                            j.f2696 = c12;
                            cArr5[i15] = (char) (((cArr4[i15] * 32718) + c11) / 65535);
                            cArr4[i15] = c12;
                            int i17 = j.f2697;
                            cArr6[i17] = (char) (((((long) (c12 ^ cArr3[i17])) ^ f341) ^ ((long) f339)) ^ ((long) f340));
                            j.f2697 = i17 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                }
                return str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                int i12 = f338 + 49;
                f337 = i12 % 128;
                int i13 = i12 % 2;
                am.m4518(am.this).m4702(m4528("瘯嬼ޱ䣻ʓ㿽㱳格薑扣姝蜵掓⥛仪\ude3eⴐ膏ㄴꌷ‒", (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\u0000\u0000\u0000", View.MeasureSpec.makeMeasureSpec(0, 0) - 1418129141, "ଉ礑溫妆").intern(), Collections.singletonList(am.m4525(am.this, iSAdQualityCustomMediationRevenue)));
                am.m4520(am.this, true);
                int i14 = f338 + 63;
                f337 = i14 % 128;
                int i15 = i14 % 2;
            }
        }, ar.m4559().mo4578());
        int i12 = f328 + 7;
        f327 = i12 % 128;
        int i13 = i12 % 2;
    }
}
