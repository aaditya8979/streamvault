package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.jz;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ds {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f1866 = true;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1867 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1868 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f1869 = true;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1870 = 49;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1871 = {146, 163, 152, 164, 147, 160, 149, 170, 'v', 'Q', 161, 154, 159, 158, 150, 165, 153, '~', 166, 157, 169, 148, 167};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String[] f1872;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fr f1873;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1874;

    public ds(String str, String str2, JSONObject jSONObject) {
        this.f1874 = dz.m6209(str2);
        List listM6881 = jz.m6881(jSONObject.optJSONArray(m6172(null, Color.green(0) + 127, null, "\u0084\u0083\u0082\u0081").intern()), new jz.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.4
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ String mo4626(JSONArray jSONArray, int i10) {
                return dz.m6209(jSONArray.optString(i10));
            }
        });
        String[] strArr = new String[listM6881.size()];
        this.f1872 = strArr;
        listM6881.toArray(strArr);
        try {
            this.f1873 = new dq(str, str2).m6154(dt.m6175(str, str2, jSONObject.optString(m6172(null, 127 - TextUtils.getTrimmedLength(""), null, "\u0088\u0087\u0086\u0085").intern())));
        } catch (Throwable th2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6172(null, (ViewConfiguration.getTapTimeout() >> 16) + 127, null, "\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a\u0083\u008d\u008c\u0084\u0082\u0081\u008b\u008a\u0082\u0086\u0082\u0082\u0089").intern());
            sb2.append(this.f1874);
            co.m5699(str, sb2.toString(), th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r8.size() != r9.size()) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r7 = r7.m5759();
        r0 = new java.lang.StringBuilder();
        r0.append(r6.f1874);
        r0.append(m6172(null, 127 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), null, "\u008a\u0087\u008f\u0090\u0096\u008f\u008b\u0095\u008f\u008a\u0087\u0086\u0091\u0090\u008f\u008e\u008a").intern());
        r0.append(r9.size());
        r0.append(m6172(null, 127 - android.view.View.resolveSizeAndState(0, 0, 0), null, "\u008a\u0087\u008f\u0097\u008c\u008f\u0096\u008f\u0082\u008a\u0090\u0093\u0085\u008a\u0084\u0090\u008d\u008f\u008e\u0093\u0083\u0082\u0081\u008a").intern());
        r0.append(r8.size());
        com.ironsource.adqualitysdk.sdk.i.co.m5699(r7, r0.toString(), null);
        r7 = com.ironsource.adqualitysdk.sdk.i.ds.f1867 + 47;
        com.ironsource.adqualitysdk.sdk.i.ds.f1868 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if ((r7 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        r7 = 59 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        r7 = new java.util.HashMap();
        r0 = com.ironsource.adqualitysdk.sdk.i.ds.f1868 + 43;
        com.ironsource.adqualitysdk.sdk.i.ds.f1867 = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r3 >= r8.size()) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        r0 = 'S';
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        r0 = 'a';
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a6, code lost:
    
        if (r0 == 'a') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        r0 = com.ironsource.adqualitysdk.sdk.i.ds.f1867 + 55;
        com.ironsource.adqualitysdk.sdk.i.ds.f1868 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if ((r0 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b5, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        r0 = 'R';
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r0 == 6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        r7.put(r9.get(r3), r8.get(r3));
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c9, code lost:
    
        r7.put(r9.get(r3), r8.get(r3));
        r3 = r3 + 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8.size() != r9.size()) goto L14;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.Object> m6171(com.ironsource.adqualitysdk.sdk.i.cq r7, java.util.List<java.lang.Object> r8, java.util.List<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ds.m6171(com.ironsource.adqualitysdk.sdk.i.cq, java.util.List, java.util.List):java.util.Map");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6172(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1871;
            int i11 = f1870;
            if (f1866) {
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
            if (f1869) {
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
    public final dr m6173(du duVar, cq cqVar, List<Object> list) {
        du duVar2 = new du(m6171(cqVar, list, Arrays.asList(this.f1872)), duVar.m6186());
        fr frVar = this.f1873;
        if (!(frVar != null)) {
            String strM5759 = cqVar.m5759();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6172(null, 127 - TextUtils.indexOf("", "", 0), null, "\u008a\u0087\u0086\u0091\u0090\u008f\u0092").intern());
            sb2.append(this.f1874);
            sb2.append(m6172(null, 127 - Color.argb(0, 0, 0, 0), null, "\u0088\u0087\u0086\u0085\u008a\u0094\u0094\u0093\u008d\u008a\u0084\u0081\u0091\u008a").intern());
            co.m5699(strM5759, sb2.toString(), null);
            return null;
        }
        int i10 = f1868 + 117;
        f1867 = i10 % 128;
        int i11 = i10 % 2;
        dr drVarMo6263 = frVar.mo6263(duVar2, cqVar);
        int i12 = f1867 + 109;
        f1868 = i12 % 128;
        if ((i12 % 2 == 0 ? '_' : (char) 25) != '_') {
            return drVarMo6263;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6174() {
        int i10 = f1868;
        int i11 = i10 + 97;
        f1867 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1874;
        int i13 = i10 + 41;
        f1867 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }
}
