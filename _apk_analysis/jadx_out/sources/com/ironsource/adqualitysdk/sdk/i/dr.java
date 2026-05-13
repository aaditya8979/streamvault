package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class dr {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1859 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1860 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1861 = {17};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1862;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f1863;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object f1864;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1865;

    public dr(Object obj) {
        this.f1864 = obj;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6161(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f1861, i10, cArr, 0, i11);
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

    public final String toString() {
        int i10 = f1859 + 41;
        f1860 = i10 % 128;
        if (i10 % 2 == 0) {
            boolean z10 = this.f1864 instanceof String;
            throw null;
        }
        if (this.f1864 instanceof String) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6161(new int[]{0, 1, 0, 1}, "\u0000", true).intern());
            sb2.append(this.f1864);
            sb2.append(m6161(new int[]{0, 1, 0, 1}, "\u0000", true).intern());
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f1864);
        String string = sb3.toString();
        int i11 = f1860 + 55;
        f1859 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            return string;
        }
        int i12 = 46 / 0;
        return string;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m6162() {
        int i10 = f1860 + 87;
        int i11 = i10 % 128;
        f1859 = i11;
        int i12 = i10 % 2;
        boolean z10 = this.f1865;
        int i13 = i11 + 41;
        f1860 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final dr m6163() {
        int i10 = f1860 + 17;
        f1859 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1865 = true;
        } else {
            this.f1865 = false;
        }
        return this;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final dr m6164() {
        int i10 = f1860 + 73;
        int i11 = i10 % 128;
        f1859 = i11;
        if (i10 % 2 != 0) {
            this.f1863 = false;
        } else {
            this.f1863 = true;
        }
        int i12 = i11 + 85;
        f1860 = i12 % 128;
        if ((i12 % 2 == 0 ? '\'' : 'Y') != '\'') {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m6165() {
        int i10 = f1860;
        int i11 = i10 + 119;
        f1859 = i11 % 128;
        int i12 = i11 % 2;
        Object obj = this.f1864;
        int i13 = i10 + 93;
        f1859 = i13 % 128;
        int i14 = i13 % 2;
        return obj;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Number m6166() {
        Object obj = this.f1864;
        if ((obj instanceof Integer ? 'H' : 'C') != 'C') {
            Integer num = (Integer) obj;
            int i10 = f1860 + 39;
            f1859 = i10 % 128;
            int i11 = i10 % 2;
            return num;
        }
        if (obj instanceof Long) {
            int i12 = f1859 + 103;
            f1860 = i12 % 128;
            int i13 = i12 % 2;
            return (Long) obj;
        }
        if ((obj instanceof Double ? '4' : 'W') == '4') {
            int i14 = f1859 + 9;
            f1860 = i14 % 128;
            int i15 = i14 % 2;
            return (Double) obj;
        }
        int i16 = f1860 + 33;
        f1859 = i16 % 128;
        if ((i16 % 2 != 0 ? ':' : 'X') != ':') {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6167() {
        Object obj = this.f1864;
        if (obj == null) {
            return false;
        }
        if ((obj instanceof Boolean ? '-' : '[') == '-') {
            return ((Boolean) obj).booleanValue();
        }
        if (!(!(obj instanceof Integer))) {
            if (((Integer) obj).intValue() != 0) {
                return true;
            }
            int i10 = f1859 + 35;
            f1860 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0;
        }
        if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return false;
            }
            int i12 = f1860 + 3;
            f1859 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        if (obj instanceof String) {
            return (!TextUtils.isEmpty((String) obj) ? '9' : (char) 15) != 15;
        }
        int i14 = f1859 + 97;
        f1860 = i14 % 128;
        int i15 = i14 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final dr m6168(boolean z10) {
        int i10 = f1860;
        int i11 = i10 + 115;
        f1859 = i11 % 128;
        if (i11 % 2 != 0) {
            this.f1862 = z10;
            throw null;
        }
        this.f1862 = z10;
        int i12 = i10 + 89;
        f1859 = i12 % 128;
        if ((i12 % 2 != 0 ? 'B' : (char) 22) != 'B') {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m6169() {
        int i10 = f1859;
        int i11 = i10 + 91;
        f1860 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.f1862;
        int i13 = i10 + 43;
        f1860 = i13 % 128;
        if ((i13 % 2 == 0 ? '\t' : '#') == '#') {
            return z10;
        }
        int i14 = 44 / 0;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m6170() {
        int i10 = f1859;
        int i11 = i10 + 71;
        f1860 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.f1863;
        int i13 = i10 + 35;
        f1860 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }
}
