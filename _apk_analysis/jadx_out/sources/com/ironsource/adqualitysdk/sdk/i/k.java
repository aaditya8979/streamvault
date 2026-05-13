package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2959 = {'\n', 57064, 17315, 58414, 1695, 43826, 52734, 28276, 37059, 13634, 22068, 63713, 7472, 49029, 8256, 17140, 59216, 2509, 43704, 53045, 29064, 37467, 13489};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2960 = -7004983622510535312L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2961 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2962;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static void m6884(String str, String str2) {
        int i10 = f2962 + 77;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        m6888(str, str, str2);
        int i12 = f2962 + 57;
        f2961 = i12 % 128;
        if ((i12 % 2 == 0 ? 'J' : (char) 26) != 'J') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static void m6885(String str, String str2) {
        int i10 = f2961 + 121;
        f2962 = i10 % 128;
        int i11 = i10 % 2;
        m6898(str, str2, (Object) null);
        int i12 = f2962 + 101;
        f2961 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m6886(String str, String str2) {
        int i10 = f2962 + 87;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        m6906(str, str2, null);
        int i12 = f2961 + 13;
        f2962 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m6887(String str, String str2, Object obj) {
        int i10 = f2962 + 7;
        f2961 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m6902(str, str, str2, obj);
        if (z10) {
            throw null;
        }
        int i11 = f2962 + 113;
        f2961 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (m6893() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        android.util.Log.v(m6896(r3), r5);
        r3 = com.ironsource.adqualitysdk.sdk.i.k.f2961 + 117;
        com.ironsource.adqualitysdk.sdk.i.k.f2962 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (m6894().shouldPrintLog(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r3 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r3 = '\'';
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r3 == 7) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        r3 = com.ironsource.adqualitysdk.sdk.i.k.f2961 + 87;
        com.ironsource.adqualitysdk.sdk.i.k.f2962 = r3 % 128;
        r3 = r3 % 2;
        android.util.Log.v(m6896(r4), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if ((m6893()) != false) goto L14;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m6888(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.k.f2962
            int r0 = r0 + 115
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2961 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L1c
            boolean r0 = m6893()
            r1 = 15
            r2 = 0
            int r1 = r1 / r2
            if (r0 == 0) goto L17
            r2 = 1
        L17:
            if (r2 == 0) goto L34
            goto L22
        L1a:
            r3 = move-exception
            throw r3
        L1c:
            boolean r0 = m6893()
            if (r0 == 0) goto L34
        L22:
            java.lang.String r3 = m6896(r3)
            android.util.Log.v(r3, r5)
            int r3 = com.ironsource.adqualitysdk.sdk.i.k.f2961
            int r3 = r3 + 117
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2962 = r4
            int r3 = r3 % 2
            return
        L34:
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r3 = m6894()
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r0 = com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE
            boolean r3 = r3.shouldPrintLog(r0)
            r0 = 7
            if (r3 == 0) goto L43
            r3 = r0
            goto L45
        L43:
            r3 = 39
        L45:
            if (r3 == r0) goto L48
            goto L59
        L48:
            int r3 = com.ironsource.adqualitysdk.sdk.i.k.f2961
            int r3 = r3 + 87
            int r0 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2962 = r0
            int r3 = r3 % 2
            java.lang.String r3 = m6896(r4)
            android.util.Log.v(r3, r5)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.k.m6888(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if ((m6893() ? '\'' : '9') != '9') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (m6893() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        android.util.Log.e(m6896(r3), r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        r7 = 'D';
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r7 = '!';
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r7 == 'D') goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (m6894().shouldPrintLog(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.ERROR) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r3 = com.ironsource.adqualitysdk.sdk.i.k.f2962 + 67;
        com.ironsource.adqualitysdk.sdk.i.k.f2961 = r3 % 128;
        r3 = r3 % 2;
        android.util.Log.e(m6896(r4), r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r3 = com.ironsource.adqualitysdk.sdk.i.k.f2962 + 13;
        com.ironsource.adqualitysdk.sdk.i.k.f2961 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if ((r3 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m6889(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Throwable r6, boolean r7) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.k.f2961
            int r0 = r0 + 11
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2962 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L21
            boolean r0 = m6893()
            r1 = 57
            if (r0 == 0) goto L1d
            r0 = 39
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 == r1) goto L32
            goto L2a
        L21:
            boolean r0 = m6893()
            r2 = 65
            int r2 = r2 / r1
            if (r0 == 0) goto L32
        L2a:
            java.lang.String r3 = m6896(r3)
            android.util.Log.e(r3, r5, r6)
            return
        L32:
            r3 = 68
            if (r7 == 0) goto L38
            r7 = r3
            goto L3a
        L38:
            r7 = 33
        L3a:
            if (r7 == r3) goto L3d
            goto L5a
        L3d:
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r3 = m6894()
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r7 = com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.ERROR
            boolean r3 = r3.shouldPrintLog(r7)
            if (r3 == 0) goto L5a
            int r3 = com.ironsource.adqualitysdk.sdk.i.k.f2962
            int r3 = r3 + 67
            int r7 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2961 = r7
            int r3 = r3 % 2
            java.lang.String r3 = m6896(r4)
            android.util.Log.e(r3, r5, r6)
        L5a:
            int r3 = com.ironsource.adqualitysdk.sdk.i.k.f2962
            int r3 = r3 + 13
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2961 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L67
            return
        L67:
            r3 = 0
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            throw r3
        L6b:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.k.m6889(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable, boolean):void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6890(String str, String str2) {
        int i10 = f2962 + 91;
        f2961 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m6892(str, str2, null);
        if (z10) {
            int i11 = 47 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6891(String str, String str2, String str3, boolean z10) {
        int i10 = f2962 + 85;
        f2961 = i10 % 128;
        boolean z11 = i10 % 2 != 0;
        m6889(str, str2, str3, null, z10);
        if (z11) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6892(String str, String str2, Throwable th2) {
        int i10 = f2962 + 41;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        m6889(str, str, str2, th2, true);
        int i12 = f2962 + 103;
        f2961 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m6893() {
        int i10 = f2962 + 21;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM7055 = s.m7027().m7055();
        int i12 = f2961 + 121;
        f2962 = i12 % 128;
        if ((i12 % 2 != 0 ? 'D' : ']') != 'D') {
            return zM7055;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static ISAdQualityLogLevel m6894() {
        int i10 = f2961 + 25;
        f2962 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 5 : ':') == ':') {
            return s.m7027().m7056();
        }
        s.m7027().m7056();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6895(char c10, int i10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2959[i10 + i12]) ^ (((long) i12) * f2960)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6896(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6895((char) (56993 - View.resolveSize(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, 22 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        sb2.append(str);
        String string = sb2.toString();
        int i10 = f2962 + 101;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6897(String str, String str2) {
        int i10 = f2961 + 59;
        f2962 = i10 % 128;
        int i11 = i10 % 2;
        m6903(str, str, str2, true);
        int i12 = f2961 + 125;
        f2962 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 28 : '\n') != 28) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6898(String str, String str2, Object obj) {
        int i10 = f2961 + 111;
        f2962 = i10 % 128;
        int i11 = i10 % 2;
        m6899(str, str, str2, obj, false);
        int i12 = f2961 + 73;
        f2962 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6899(String str, String str2, String str3, Object obj, boolean z10) {
        int i10 = f2962 + 33;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        if (obj != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m6895((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            sb2.append(obj.toString());
            str3 = sb2.toString();
        }
        if (m6893()) {
            Log.d(m6896(str), str3);
            return;
        }
        if ((z10 ? '5' : (char) 26) != '5') {
            return;
        }
        int i12 = f2962 + 47;
        f2961 = i12 % 128;
        int i13 = i12 % 2;
        if (m6894().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
            Log.d(m6896(str2), str3);
            int i14 = f2962 + 91;
            f2961 = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6900(String str, String str2, Throwable th2, boolean z10) {
        int i10 = f2962 + 79;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        m6889(str, str, str2, th2, z10);
        int i12 = f2961 + 53;
        f2962 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m6901(String str, String str2) {
        int i10 = f2962 + 123;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        m6902(str, str, str2, (Object) null);
        int i12 = f2961 + 109;
        f2962 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m6902(String str, String str2, String str3, Object obj) {
        int i10 = f2962 + 81;
        f2961 = i10 % 128;
        m6899(str, str2, str3, obj, (i10 % 2 == 0 ? '*' : '1') != '*');
        int i11 = f2962 + 47;
        f2961 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m6903(String str, String str2, String str3, boolean z10) {
        if (!(!m6893())) {
            int i10 = f2961 + 21;
            f2962 = i10 % 128;
            char c10 = i10 % 2 != 0 ? 'G' : '$';
            Log.i(m6896(str), str3);
            if (c10 != 'G') {
                return;
            } else {
                throw null;
            }
        }
        if ((z10) && m6894().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            int i11 = f2962 + 41;
            f2961 = i11 % 128;
            int i12 = i11 % 2;
            Log.i(m6896(str2), str3);
        }
        int i13 = f2961 + 9;
        f2962 = i13 % 128;
        if (i13 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m6904(String str, String str2, boolean z10) {
        int i10 = f2961 + 17;
        f2962 = i10 % 128;
        int i11 = i10 % 2;
        m6891(str, str, str2, z10);
        int i12 = f2961 + 25;
        f2962 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m6905(String str, String str2) {
        int i10 = f2962 + 3;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        m6903(str, str, str2, false);
        int i12 = f2961 + 93;
        f2962 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m6906(String str, String str2, Throwable th2) {
        int i10 = f2962 + 101;
        f2961 = i10 % 128;
        int i11 = i10 % 2;
        m6889(str, str, str2, th2, false);
        int i12 = f2962 + 43;
        f2961 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 20 : 'D') != 20) {
        } else {
            throw null;
        }
    }
}
