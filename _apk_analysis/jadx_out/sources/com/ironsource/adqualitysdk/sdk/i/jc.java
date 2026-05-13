package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public class jc {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2741 = {'\'', 23, '2', 'i', 'g', '*', 'n', 137, 138, 146, 151, 148, 143, 145, '2', 'J', 'R', 'r'};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2742 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2743 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2744;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2745;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f2746;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2747;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2748;

    public static class b extends d {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private final String f2749;

        public b(String str, String str2, String str3) {
            super(str, str2);
            this.f2749 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jc
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6685() {
            return m6681(this.f2749);
        }
    }

    public static class c extends e {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final String f2750;

        public c(String str, String str2, String str3) {
            super(str, str2);
            this.f2750 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jc
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6685() {
            return m6681(this.f2750);
        }
    }

    public static class d extends jc {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static short[] f2751 = null;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static byte[] f2752 = {-107, -8, -1, 12, -103, -11, 9, 55, -64, -1, -4, 9};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2753 = 123424552;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2754 = 111;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2755 = -29444390;

        public d(String str, String str2) {
            super(str, m6686((-123424552) - TextUtils.getTrimmedLength(""), (short) View.getDefaultSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 29444489, (byte) TextUtils.getCapsMode("", 0, 0), (-112) - View.resolveSize(0, 0)).intern(), str2, m6686(KeyEvent.getDeadChar(0, 0) - 123424548, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 29444497, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (KeyEvent.getMaxKeyCode() >> 16) - 112).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m6686(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f3015) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2754;
                int i14 = i12 + i13;
                boolean z10 = i14 == -1;
                if (z10) {
                    byte[] bArr = f2752;
                    i14 = bArr != null ? (byte) (bArr[f2753 + i10] + i13) : (short) (f2751[f2753 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f3016 = ((i10 + i14) - 2) + f2753 + (z10 ? 1 : 0);
                    o.f3017 = b10;
                    char c10 = (char) (i11 + f2755);
                    o.f3019 = c10;
                    sb2.append(c10);
                    o.f3018 = o.f3019;
                    o.f3020 = 1;
                    while (o.f3020 < i14) {
                        byte[] bArr2 = f2752;
                        if (bArr2 != null) {
                            int i15 = o.f3016;
                            o.f3016 = i15 - 1;
                            o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                        } else {
                            short[] sArr = f2751;
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
    }

    public static class e extends jc {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2756 = 7164907263120509370L;

        public e(String str, String str2) {
            super(str, m6687("\u09d9躾܂龕", 34667 - Color.argb(0, 0, 0, 0)).intern(), str2, m6687("\u09d0㠤樏鰓츠\uf07e≚咢", 12780 - ImageFormat.getBitsPerPixel(0)).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m6687(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f2041) {
                f.f2039 = i10;
                char[] cArr2 = new char[cArr.length];
                f.f2040 = 0;
                while (true) {
                    int i11 = f.f2040;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f2756);
                        f.f2040++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            }
            return str2;
        }
    }

    private jc(String str, String str2, String str3, String str4) {
        this.f2746 = str;
        this.f2744 = str2;
        this.f2747 = str3;
        this.f2745 = str4;
        this.f2748 = true;
    }

    public /* synthetic */ jc(String str, String str2, String str3, String str4, byte b10) {
        this(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m6675() {
        int i10 = f2742 + 13;
        f2743 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            ar.m4559().mo4574();
            throw null;
        }
        String strMo4574 = ar.m4559().mo4574();
        int i11 = f2742 + 97;
        f2743 = i11 % 128;
        if ((i11 % 2 == 0 ? '#' : '$') != '#') {
            return strMo4574;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m6676() {
        int i10 = f2743 + 33;
        f2742 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6679(new int[]{5, 9, 38, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001", true).intern();
        String strM6675 = m6675();
        if ((this.f2748 ? 'P' : (char) 4) == 4) {
            return strIntern;
        }
        int i12 = f2742 + 11;
        f2743 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            TextUtils.isEmpty(strM6675);
            throw null;
        }
        if (TextUtils.isEmpty(strM6675)) {
            return strIntern;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strIntern);
        sb2.append(m6679(new int[]{14, 4, 0, 1}, "\u0001\u0000\u0001\u0000", true).intern());
        sb2.append(strM6675);
        sb2.append(m6679(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m6677() {
        int i10 = f2742 + 81;
        int i11 = i10 % 128;
        f2743 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f2745;
        int i12 = i11 + 59;
        f2742 = i12 % 128;
        int i13 = i12 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m6678() {
        String str;
        int i10 = f2742 + 65;
        int i11 = i10 % 128;
        f2743 = i11;
        if (i10 % 2 != 0) {
            str = this.f2744;
        } else {
            str = this.f2744;
            int i12 = 73 / 0;
        }
        int i13 = i11 + 115;
        f2742 = i13 % 128;
        if ((i13 % 2 != 0 ? 'E' : ')') != 'E') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6679(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f2741, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m6680() {
        int i10 = f2743;
        int i11 = i10 + 41;
        f2742 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f2746;
        int i13 = i10 + 21;
        f2742 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m6681(String str) {
        String strM6676 = m6676();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM6676);
        sb2.append(m6680());
        sb2.append(m6679(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        sb2.append(m6679(new int[]{2, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        sb2.append(m6679(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        sb2.append(str);
        sb2.append(m6679(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        sb2.append(m6678());
        sb2.append(m6679(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(m6679(new int[]{2, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        sb2.append(m6679(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(m6683());
        sb2.append(m6679(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(m6677());
        String string = sb2.toString();
        int i10 = f2742 + 47;
        f2743 = i10 % 128;
        if (i10 % 2 != 0) {
            return string;
        }
        int i11 = 1 / 0;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6682() {
        int i10 = f2743 + 67;
        f2742 = i10 % 128;
        int i11 = i10 % 2;
        String strReplace = mo6685().replace(m6679(new int[]{0, 1, 31, 0}, "\u0000", false).intern(), m6679(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        int i12 = f2743 + 21;
        f2742 = i12 % 128;
        int i13 = i12 % 2;
        return strReplace;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m6683() {
        int i10 = f2743;
        int i11 = i10 + 79;
        f2742 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f2747;
        int i13 = i10 + 23;
        f2742 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m6684() {
        int i10 = f2743 + 111;
        f2742 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            this.f2748 = true;
        } else {
            this.f2748 = false;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public String mo6685() {
        String strM6676 = m6676();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM6676);
        sb2.append(this.f2746);
        sb2.append(m6679(new int[]{0, 1, 31, 0}, "\u0000", false).intern());
        sb2.append(this.f2744);
        sb2.append(m6679(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(m6679(new int[]{2, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        sb2.append(m6679(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(this.f2747);
        sb2.append(m6679(new int[]{1, 1, 0, 1}, "\u0000", true).intern());
        sb2.append(this.f2745);
        String string = sb2.toString();
        int i10 = f2742 + 3;
        f2743 = i10 % 128;
        if ((i10 % 2 == 0 ? ')' : 'C') != ')') {
            return string;
        }
        int i11 = 20 / 0;
        return string;
    }
}
