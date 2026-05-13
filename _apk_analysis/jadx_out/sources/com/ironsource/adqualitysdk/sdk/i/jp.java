package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class jp {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2879 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2880 = {'$', '^', '^', '`', 'n', 'g', '_', '\\', 'c', '^', 'd', 'p', 'q', 'k', 'd', 'g', 'l', 17, '/', 'Z', 'p', 'i', 'a', '^', 'e', 'p', 'M', 'I', 's', 'L', 'K', 'p', 'G', 'E', 'l', 'm', 'p', 'm', 'f', 'i', 'n', 'm', 'F', 'K', 'r', 'r', 't', ']', 'Y', 178, 166, 158, 156, 156, 171, 173, 158, 160, 175, 174, 160, 153, 156, 161, 160, 167, 176, 'S', 166, 154, 148, 153, 152, 153, 153, 161, 159, 153, 163, 168, ';', 'w', 'l', 'j', 'r', 'o', 'e', 'l', 'p', 'j', 't', 'y', 'w', 239, 227, 221, 226, 226, 221, 216, 223, 229, 228, 236, 232, 226, 236, 241, 'v', 259, 282, 280, 280, 241, 236, 275, 239, 235, 270, 276, 263, 262, 267, 265, 260, 259, 276, 271, 268, 275, 255, 213};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static dp f2881;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2882;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f2883;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final boolean f2884;

    public jp(String str, boolean z10) {
        this.f2883 = str;
        this.f2884 = z10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m6781() {
        String strM6544;
        int i10 = f2879 + 33;
        f2882 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            strM6544 = ie.m6544(m6785().getBytes());
            int i11 = 39 / 0;
        } else {
            strM6544 = ie.m6544(m6785().getBytes());
        }
        int i12 = f2882 + 49;
        f2879 = i12 % 128;
        if ((i12 % 2 == 0 ? '9' : '\n') == '\n') {
            return strM6544;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m6782(jp jpVar) {
        int i10 = f2882 + 45;
        f2879 = i10 % 128;
        int i11 = i10 % 2;
        String strM6781 = jpVar.m6781();
        int i12 = f2879 + 33;
        f2882 = i12 % 128;
        int i13 = i12 % 2;
        return strM6781;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6783(dp dpVar) {
        int i10 = f2879;
        int i11 = i10 + 11;
        f2882 = i11 % 128;
        int i12 = i11 % 2;
        f2881 = dpVar;
        int i13 = i10 + 77;
        f2882 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6784(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f2880, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m6785() {
        String strReplace;
        String strIntern;
        String strM6107;
        String strM6110 = f2881.m6110();
        try {
            String strReplace2 = strM6110.replace(m6784(new int[]{48, 19, 85, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000", true).intern(), m6786()).replace(m6784(new int[]{67, 13, 75, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000", false).intern(), f2881.m6108());
            if (this.f2884) {
                int i10 = f2882 + 97;
                f2879 = i10 % 128;
                if ((i10 % 2 == 0 ? 'L' : '\\') != '\\') {
                    strIntern = m6784(new int[]{80, 12, 28, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000", true).intern();
                    strM6107 = f2881.m6107();
                } else {
                    strIntern = m6784(new int[]{80, 12, 28, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000", false).intern();
                    strM6107 = f2881.m6107();
                }
                strReplace = strReplace2.replace(strIntern, strM6107);
            } else {
                strReplace = strReplace2.replace(m6784(new int[]{80, 12, 28, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000", false).intern(), "");
            }
            strM6110 = strReplace.replace(m6784(new int[]{92, 16, 148, 0}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", false).intern(), this.f2883);
            int i11 = f2879 + 57;
            f2882 = i11 % 128;
            int i12 = i11 % 2;
        } catch (Throwable th2) {
            String strIntern2 = m6784(new int[]{0, 17, 0, 10}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6784(new int[]{108, 24, 168, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", false).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m6886(strIntern2, sb2.toString());
        }
        int i13 = f2879 + 61;
        f2882 = i13 % 128;
        int i14 = i13 % 2;
        return strM6110;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6786() {
        int i10 = f2879 + 45;
        f2882 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 7 : 'G') != 7) {
            return ar.m4559().mo4573().m4557();
        }
        int i11 = 59 / 0;
        return ar.m4559().mo4573().m4557();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6787(final WebView webView) {
        try {
            t.m7067(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.5
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo4352() {
                    final String strM6782 = jp.m6782(jp.this);
                    t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jp.5.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo4352() {
                            ki.m6978(webView, strM6782);
                        }
                    });
                }
            });
            int i10 = f2882 + 95;
            f2879 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 3 : (char) 4) != 3) {
            } else {
                throw null;
            }
        } catch (Exception e10) {
            String strIntern = m6784(new int[]{0, 17, 0, 10}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6784(new int[]{17, 31, 2, 0}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true).intern());
            sb2.append(e10.getLocalizedMessage());
            k.m6886(strIntern, sb2.toString());
        }
    }
}
