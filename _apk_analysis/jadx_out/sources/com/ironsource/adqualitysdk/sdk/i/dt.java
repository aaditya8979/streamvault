package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class dt {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f1875 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f1876;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1877;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f1878;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1879;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f1880;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1881;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static final Pattern f1882;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static final List<String> f1883;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static final Pattern f1884;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f1885;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f1886;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f1887;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f1888;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f1889;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f1890;

    static {
        m6179();
        f1889 = Pattern.compile(m6180("薶콞蟓꺕\u0ee0쥗䶴ɤ৯䦲誥栯蟓꺕\u0ee0쥗䶴ɤ믓霌併鯚驳\ud9e1Ꮧগ", 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        f1890 = Pattern.compile(m6180("쑸⇕ᕺ몚鵫ꇯ\ue30c夃쌢겛쑸⇕\ue2e9\ue9e1\uf47d煆", 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        f1887 = Pattern.compile(m6180("ᔄѪᕺ몚鵫ꇯ㌇ؚ쌢겛ᔄѪ\ue2e9\ue9e1儁鶼", 15 - ImageFormat.getBitsPerPixel(0)).intern());
        f1886 = Pattern.compile(m6180("薶콞믓霌뤑韼煊ৌ\u1ae5턎믓霌뤑韼햍ే", 15 - View.resolveSize(0, 0)).intern());
        f1888 = Pattern.compile(m6180("薶콞믓霌뤑韼햍ే", 7 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        f1882 = Pattern.compile(m6178(new int[]{63, 33, 0, 3}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false).intern());
        f1885 = Pattern.compile(m6180("帡娘軧ྟ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3).intern());
        f1884 = Pattern.compile(m6178(new int[]{96, 5, 0, 0}, "\u0000\u0000\u0000\u0000\u0000", false).intern());
        f1883 = Arrays.asList(m6180("ᛟ⌅", KeyEvent.normalizeMetaState(0) + 2).intern(), m6180("ꦮ⒒ᩘ쐎", 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m6180("砲㾹졊㍵", 4 - View.resolveSize(0, 0)).intern(), m6180("鐐\u0ee8⠧픋ུ갪", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5).intern(), m6180("∐ᄎ㤉қＫ䔧", 5 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m6180("寬롦ێ⇓", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2).intern(), m6180("\uebe8凌䖫敤瀦ꚺ", 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        int i10 = f1875 + 85;
        f1877 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0347 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126 A[PHI: r8 r10
      0x0126: PHI (r8v31 com.ironsource.adqualitysdk.sdk.i.dy$d) = (r8v30 com.ironsource.adqualitysdk.sdk.i.dy$d), (r8v46 com.ironsource.adqualitysdk.sdk.i.dy$d) binds: [B:41:0x008b, B:43:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x0126: PHI (r10v13 java.lang.String) = (r10v12 java.lang.String), (r10v26 java.lang.String) binds: [B:41:0x008b, B:43:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.ironsource.adqualitysdk.sdk.i.dy> m6175(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dt.m6175(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6176(String str) {
        int i10 = f1875 + 9;
        f1877 = i10 % 128;
        int i11 = i10 % 2;
        String strSubstring = str.substring(1, str.length() - 1);
        int i12 = f1875 + 115;
        f1877 = i12 % 128;
        int i13 = i12 % 2;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6177(Pattern pattern, String str) {
        int i10 = f1877 + 101;
        f1875 = i10 % 128;
        int i11 = i10 % 2;
        Matcher matcher = pattern.matcher(str);
        if ((matcher.find() ? '^' : '#') != '^') {
            return null;
        }
        String strSubstring = str.substring(matcher.start(), matcher.end());
        int i12 = f1875 + 47;
        f1877 = i12 % 128;
        if ((i12 % 2 != 0 ? '^' : (char) 15) != '^') {
            return strSubstring;
        }
        int i13 = 33 / 0;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6178(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f1880, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6179() {
        f1878 = (char) 58808;
        f1879 = (char) 17955;
        f1876 = (char) 21237;
        f1881 = (char) 483;
        f1880 = new char[]{22, '-', '.', 'i', 127, 127, '|', 'a', 16, 'C', 'j', 'k', 'm', 's', 's', 'I', 'C', 'j', 'k', 'n', 'r', 'i', 'h', 'H', 'I', 'p', 'p', 'r', '[', '2', 'G', 'n', 'l', 'n', 'n', 'n', 'q', 'o', 'H', 'J', 'j', 'O', 194, 233, 197, '3', 'c', 'f', 'o', 'l', 16, 'G', 'n', 'l', 'n', 'n', 'n', 'q', 'o', 'H', 'J', 'j', '@', '0', 'j', 's', 'h', '\\', '^', 'G', 'S', ']', '7', 'C', '?', 'A', '^', '\\', '^', 'G', 'S', ']', '7', 'C', 'E', '.', '3', '.', 'A', 'F', 'E', 'C', 'C', 'E', 'H', 'g', '/', ']', 'l', 'l', 'l'};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6180(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1878)) ^ ((c11 >>> 5) + f1876)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1879) ^ ((c12 + i12) ^ ((c12 << 4) + f1881))));
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
}
