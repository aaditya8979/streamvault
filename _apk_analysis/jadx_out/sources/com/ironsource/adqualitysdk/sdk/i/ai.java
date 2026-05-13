package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class ai implements Comparable<ai> {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f306 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f307 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f308 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f309 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f310 = 244;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f311 = {360, 359, 345, 354, 356, 352, 347, 361, 349, 344};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jb f312;

    public ai(jb jbVar) {
        this.f312 = jbVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private long m4485() {
        JSONObject jSONObjectM4492;
        int i10;
        int i11 = f306 + 21;
        f307 = i11 % 128;
        if (i11 % 2 == 0) {
            jSONObjectM4492 = m4492();
            i10 = 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        } else {
            jSONObjectM4492 = m4492();
            i10 = 109 << (TypedValue.complexToFraction(0, 2.0f, 2.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 2.0f) == 0.0f ? 0 : -1));
        }
        long jOptInt = jSONObjectM4492.optInt(m4488(null, i10, null, "\u0084\u0083").intern());
        int i12 = f307 + 119;
        f306 = i12 % 128;
        int i13 = i12 % 2;
        return jOptInt;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m4486() {
        int i10 = f307 + 95;
        f306 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 16 : ' ') != 16) {
            return this.f312.m6672();
        }
        this.f312.m6672();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private long m4487() {
        int i10 = f307 + 75;
        f306 = i10 % 128;
        int i11 = i10 % 2;
        long jOptLong = m4492().optLong(m4488(null, View.MeasureSpec.getSize(0) + 127, null, "\u0082\u0081").intern());
        int i12 = f306 + 79;
        f307 = i12 % 128;
        int i13 = i12 % 2;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4488(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f311;
            int i11 = f310;
            if (f309) {
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
            if (f308) {
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<String> m4489() {
        List<String> listAsList;
        int i10 = f307 + 113;
        f306 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 18 : 'a') != 'a') {
            String[] strArr = new String[0];
            strArr[0] = ih.f2528;
            listAsList = Arrays.asList(strArr);
        } else {
            listAsList = Arrays.asList(ih.f2528);
        }
        int i11 = f307 + 51;
        f306 = i11 % 128;
        int i12 = i11 % 2;
        return listAsList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int m4490(ai aiVar) {
        long jM4485 = m4485();
        long jM44852 = aiVar.m4485();
        if (jM4485 < jM44852) {
            int i10 = f306 + 111;
            f307 = i10 % 128;
            if (i10 % 2 == 0) {
                return -1;
            }
            int i11 = 73 / 0;
            return -1;
        }
        if (jM4485 != jM44852) {
            return 1;
        }
        int i12 = f306 + 19;
        f307 = i12 % 128;
        int i13 = i12 % 2;
        return 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int m4491(ai aiVar) {
        int i10 = f306 + 91;
        f307 = i10 % 128;
        int i11 = i10 % 2;
        long jM4487 = m4487();
        long jM44872 = aiVar.m4487();
        if (jM4487 >= jM44872) {
            if ((jM4487 == jM44872 ? ';' : 'Z') != ';') {
                return 1;
            }
            return m4490(aiVar);
        }
        int i12 = f306 + 57;
        f307 = i12 % 128;
        int i13 = i12 % 2;
        return -1;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ai aiVar) {
        int i10 = f306 + 85;
        f307 = i10 % 128;
        int i11 = i10 % 2;
        int iM4491 = m4491(aiVar);
        int i12 = f307 + 115;
        f306 = i12 % 128;
        int i13 = i12 % 2;
        return iM4491;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if ((r4 == r5 ? 22 : 27) != 27) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if (r5 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ai.class == r5.getClass()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0038, code lost:
    
        if (r2 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        r5 = com.ironsource.adqualitysdk.sdk.i.ai.f306 + 55;
        com.ironsource.adqualitysdk.sdk.i.ai.f307 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        return m4486().equals(((com.ironsource.adqualitysdk.sdk.i.ai) r5).m4486());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r4 == r5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ai.f307
            int r0 = r0 + 75
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ai.f306 = r1
            int r0 = r0 % 2
            r1 = 93
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = 6
        L11:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L18
            if (r4 != r5) goto L26
            goto L25
        L18:
            r0 = 14
            int r0 = r0 / r3
            r0 = 27
            if (r4 != r5) goto L22
            r1 = 22
            goto L23
        L22:
            r1 = r0
        L23:
            if (r1 == r0) goto L26
        L25:
            return r2
        L26:
            if (r5 == 0) goto L2a
            r0 = r3
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L2e
            goto L3a
        L2e:
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.ai> r0 = com.ironsource.adqualitysdk.sdk.i.ai.class
            java.lang.Class r1 = r5.getClass()
            if (r0 == r1) goto L37
            goto L38
        L37:
            r2 = r3
        L38:
            if (r2 == 0) goto L45
        L3a:
            int r5 = com.ironsource.adqualitysdk.sdk.i.ai.f306
            int r5 = r5 + 55
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.ai.f307 = r0
            int r5 = r5 % 2
            return r3
        L45:
            com.ironsource.adqualitysdk.sdk.i.ai r5 = (com.ironsource.adqualitysdk.sdk.i.ai) r5
            java.lang.String r0 = r4.m4486()
            java.lang.String r5 = r5.m4486()
            boolean r5 = r0.equals(r5)
            return r5
        L54:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ai.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (!(m4492() != null)) {
            int i10 = f307 + 113;
            f306 = i10 % 128;
            int i11 = i10 % 2;
            return 0;
        }
        int i12 = f306 + 111;
        f307 = i12 % 128;
        int i13 = i12 % 2;
        int iHashCode = m4492().hashCode();
        int i14 = f307 + 73;
        f306 = i14 % 128;
        if (i14 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i10 = f307 + 45;
        f306 = i10 % 128;
        int i11 = i10 % 2;
        String string = m4492().toString();
        int i12 = f306 + 79;
        f307 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return string;
        }
        int i13 = 16 / 0;
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized JSONObject m4492() {
        JSONObject jSONObjectM6673;
        int i10 = f306 + 91;
        f307 = i10 % 128;
        int i11 = i10 % 2;
        jSONObjectM6673 = this.f312.m6673();
        int i12 = f306 + 81;
        f307 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return jSONObjectM6673;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m4493(int i10) {
        int i11 = f307 + 51;
        f306 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = false;
        if (!(this.f312.m6673() == null)) {
            int i13 = f306 + 19;
            f307 = i13 % 128;
            if (i13 % 2 == 0) {
                z10 = true;
            }
            if (!z10) {
                jz.m6874(this.f312.m6673(), i10, m4489());
                throw null;
            }
            jz.m6874(this.f312.m6673(), i10, m4489());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m4494() {
        JSONObject jSONObjectM4492;
        int iIndexOf;
        int i10 = f307 + 37;
        f306 = i10 % 128;
        if ((i10 % 2 == 0 ? 'J' : '-') != '-') {
            jSONObjectM4492 = m4492();
            iIndexOf = 113 << TextUtils.indexOf("", "", 0, 0);
        } else {
            jSONObjectM4492 = m4492();
            iIndexOf = TextUtils.indexOf("", "", 0, 0) + 127;
        }
        return jSONObjectM4492.optString(m4488(null, iIndexOf, null, "\u0084\u0087\u0086\u0085").intern());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m4495(String str) throws UnsupportedEncodingException {
        JSONObject jSONObjectM4492;
        String strM4488;
        int i10 = f307 + 29;
        f306 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? (char) 1 : '(') != '(') {
                jSONObjectM4492 = m4492();
                strM4488 = m4488(null, 25768 - (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), null, "\u008a\u0089\u0088");
            } else {
                jSONObjectM4492 = m4492();
                strM4488 = m4488(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u008a\u0089\u0088");
            }
            jSONObjectM4492.put(strM4488.intern(), str);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m4496() {
        int i10 = f307 + 87;
        f306 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = m4492().optString(m4488(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u008a\u0089\u0088").intern(), null);
        int i12 = f306 + 15;
        f307 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return strOptString;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final jb m4497() {
        int i10 = f306;
        int i11 = i10 + 69;
        f307 = i11 % 128;
        int i12 = i11 % 2;
        jb jbVar = this.f312;
        int i13 = i10 + 17;
        f307 = i13 % 128;
        int i14 = i13 % 2;
        return jbVar;
    }
}
