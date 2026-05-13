package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class kc {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2985 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2986 = {'[', 51818, 37976, 24241, 10473, 62250, 48485, '\\', 51738, 7151, 53726, 36792, 17664, 13083, 59636, 42660, 40071, 18977, 'H', 64896, 43984, 25067, 24369, 48877, '^', 51823, 37940, 24303, 10380, 62295, 48485, 34630, '$', 46431, 32620, 8479, 60356, 40327, 18013, 2070, 3809, 50388, 39578, 20485, 9820};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2987 = 6849758736906832436L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2988 = 1;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d8, code lost:
    
        if ((r0 < r7.length ? 22 : '>') != 22) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        if ((r0 < r7.length ? 'A' : 25) != 25) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fd, code lost:
    
        return java.lang.Integer.signum(java.lang.Integer.valueOf(r6[r0]).compareTo(java.lang.Integer.valueOf(r7[r0])));
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m6935(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kc.m6935(java.lang.String, java.lang.String):int");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m6936(String str) {
        if (str != null) {
            if (!(t.m7073())) {
                int i10 = f2985 + 73;
                f2988 = i10 % 128;
                int i11 = i10 % 2;
                if (m6942(str)) {
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        new ByteArrayOutputStream();
                        byte[] bArr = new byte[8192];
                        int i12 = f2988 + 117;
                        f2985 = i12 % 128;
                        int i13 = i12 % 2;
                        int i14 = 0;
                        while (true) {
                            int i15 = gZIPInputStream.read(bArr, i14, 8192 - i14);
                            if ((i15 != -1 ? 'c' : '0') != 'c') {
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                return new String(bArr, m6945(ExpandableListView.getPackedPositionGroup(0L) + 40, (char) (TextUtils.indexOf("", "", 0, 0) + 3764), ((Process.getThreadPriority(0) + 20) >> 6) + 5).intern());
                            }
                            int i16 = f2985 + 81;
                            f2988 = i16 % 128;
                            int i17 = i16 % 2;
                            i14 += i15;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m6937(String str, String str2, boolean z10) {
        if ((z10 ? 'M' : '\f') != '\f') {
            int i10 = f2985 + 83;
            f2988 = i10 % 128;
            if (i10 % 2 == 0) {
                m6939(str2);
                throw null;
            }
            str2 = m6939(str2);
        }
        List<String> listM6941 = m6941(str, str2, true);
        if ((listM6941.size() > 0 ? (char) 3 : '4') == '4') {
            return null;
        }
        int i11 = f2985 + 79;
        f2988 = i11 % 128;
        return i11 % 2 == 0 ? listM6941.get(1) : listM6941.get(0);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m6938(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            int i11 = f2985 + 55;
            f2988 = i11 % 128;
            int i12 = i11 % 2;
            if (str.length() > 0) {
                if (!(str.length() > i10)) {
                    int i13 = f2988 + 45;
                    f2985 = i13 % 128;
                    int i14 = i13 % 2;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6939(String str) {
        int i10 = f2985 + 19;
        f2988 = i10 % 128;
        int i11 = i10 % 2;
        if ((!TextUtils.isEmpty(str) ? (char) 6 : '@') == '@') {
            return str;
        }
        if (!str.startsWith(m6945(KeyEvent.getDeadChar(0, 0) + 23, (char) (ExpandableListView.getPackedPositionChild(0L) + 48820), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6945(KeyEvent.getDeadChar(0, 0) + 24, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "") + 8).intern());
            sb2.append(str);
            str = sb2.toString();
        }
        if (str.endsWith(m6945(32 - View.MeasureSpec.getMode(0), (char) View.resolveSize(0, 0), TextUtils.getOffsetBefore("", 0) + 1).intern())) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(m6945((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, (char) (TextUtils.lastIndexOf("", '0', 0) + 46341), View.MeasureSpec.getMode(0) + 7).intern());
        String string = sb3.toString();
        int i12 = f2988 + 15;
        f2985 = i12 % 128;
        int i13 = i12 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m6940(String str, String str2) {
        int i10 = f2988 + 107;
        f2985 = i10 % 128;
        return i10 % 2 == 0 ? str.substring(0, str.length() - str2.length()) : str.substring(1, str.length() % str2.length());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<String> m6941(String str, String str2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int i10 = f2988 + 45;
        f2985 = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            if (!matcher.find()) {
                int i12 = f2988 + 107;
                f2985 = i12 % 128;
                if ((i12 % 2 == 0 ? 0 : 1) == 0) {
                    return arrayList;
                }
                throw null;
            }
            if ((matcher.groupCount() == 0 ? (char) 2 : 'Z') != 2) {
                while (i <= matcher.groupCount()) {
                    int i13 = f2988 + 65;
                    f2985 = i13 % 128;
                    int i14 = i13 % 2;
                    arrayList.add(matcher.group(i));
                    if (z10) {
                        int i15 = f2988 + 27;
                        f2985 = i15 % 128;
                        int i16 = i15 % 2;
                        return arrayList;
                    }
                    i++;
                }
            } else {
                int i17 = f2988 + 41;
                f2985 = i17 % 128;
                int i18 = i17 % 2;
                arrayList.add(matcher.group());
                if (z10) {
                    int i19 = f2985 + 63;
                    f2988 = i19 % 128;
                    int i20 = i19 % 2;
                    return arrayList;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m6942(String str) {
        int i10 = f2988 + 105;
        f2985 = i10 % 128;
        int i11 = i10 % 2;
        if ((t.m7073() ? (char) 24 : ',') == 24) {
            int i12 = f2988 + 61;
            f2985 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        try {
            new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            int i14 = f2988 + 45;
            f2985 = i14 % 128;
            int i15 = i14 % 2;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m6943(String str, String str2) {
        int i10 = f2985 + 105;
        f2988 = i10 % 128;
        if (i10 % 2 == 0) {
        }
        return m6941(str, str2, false);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m6944(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i10 = f2988 + 89;
        f2985 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            if ((i12 < jSONArray.length() ? '3' : '>') != '3') {
                return arrayList;
            }
            int i13 = f2985 + 109;
            f2988 = i13 % 128;
            int i14 = i13 % 2;
            arrayList.addAll(m6941(str, jSONArray.optString(i12), false));
            i12++;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6945(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2986[i10 + i12]) ^ (((long) i12) * f2987)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m6946(String str, JSONArray jSONArray, boolean z10) {
        int i10 = f2985;
        int i11 = i10 + 81;
        f2988 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        int i14 = i10 + 111;
        f2988 = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            if ((i13 < jSONArray.length() ? '\b' : ':') == ':') {
                return null;
            }
            int i16 = f2988 + 3;
            f2985 = i16 % 128;
            int i17 = i16 % 2;
            String strM6937 = m6937(str, jSONArray.optString(i13), z10);
            if ((strM6937 != null ? '@' : '+') != '+') {
                return strM6937;
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m6947(String str) {
        int i10 = f2985 + 101;
        f2988 = i10 % 128;
        int i11 = i10 % 2;
        if ((TextUtils.isEmpty(str) ? '0' : (char) 0) == 0) {
            return str.matches(m6945(8 - ImageFormat.getBitsPerPixel(0), (char) (7089 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14).intern());
        }
        int i12 = f2988 + 31;
        f2985 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }
}
