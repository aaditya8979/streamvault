package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class dg extends cz implements cl {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1710 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1711 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f1717 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hl f1719;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1720;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1721;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1722;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1716 = {'g', 'e', 't', 'A', 'd', 'v', 'r', 'i', 's', 'I', 'T', 'y', 'p', 'D', 'U', 'l', 'F', 'n', 'a', 'S', 'o', 'u', 'c', 'J', 'h'};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1713 = 13929;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1714 = 61044;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1712 = 12544;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f1715 = 50637;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final JSONObject f1723 = IronSourceVideoBridge.jsonObjectInit();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private final List<String> f1718 = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object m5962() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f1721
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4d
            int r0 = com.ironsource.adqualitysdk.sdk.i.dg.f1710
            int r0 = r0 + 39
            int r4 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dg.f1711 = r4
            int r0 = r0 % 2
            java.lang.String r0 = r5.f1720
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L4d
            java.lang.String r0 = r5.f1722
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L27
            r0 = r3
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 == r3) goto L2b
            goto L4d
        L2b:
            int r0 = com.ironsource.adqualitysdk.sdk.i.dg.f1710
            int r0 = r0 + 65
            int r4 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dg.f1711 = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L45
            java.util.List<java.lang.String> r0 = r5.f1718
            int r0 = r0.size()
            if (r0 <= 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r3
        L42:
            if (r0 == 0) goto L4d
            goto L4e
        L45:
            java.util.List<java.lang.String> r0 = r5.f1718
            r0.size()
            throw r1     // Catch: java.lang.Throwable -> L4b
        L4b:
            r0 = move-exception
            throw r0
        L4d:
            r2 = r3
        L4e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            int r2 = com.ironsource.adqualitysdk.sdk.i.dg.f1710
            int r2 = r2 + 105
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.dg.f1711 = r3
            int r2 = r2 % 2
            r3 = 32
            if (r2 != 0) goto L62
            r2 = r3
            goto L64
        L62:
            r2 = 21
        L64:
            if (r2 == r3) goto L67
            return r0
        L67:
            throw r1     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dg.m5962():java.lang.Object");
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m5963() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            String str = this.f1721;
            if (str != null) {
                if ((this.f1719 != null ? (char) 4 : '[') == 4) {
                    int i10 = f1711 + 45;
                    f1710 = i10 % 128;
                    if (!(i10 % 2 == 0)) {
                        jSONObjectJsonObjectInit.putOpt(ih.f2552, str);
                        jSONObjectJsonObjectInit.putOpt(ih.f2554, Integer.valueOf(this.f1719.m6339()));
                        throw null;
                    }
                    jSONObjectJsonObjectInit.putOpt(ih.f2552, str);
                    jSONObjectJsonObjectInit.putOpt(ih.f2554, Integer.valueOf(this.f1719.m6339()));
                }
            }
            jSONObjectJsonObjectInit.putOpt(ih.f2547, this.f1720);
            jSONObjectJsonObjectInit.putOpt(ih.f2551, this.f1722);
            if (this.f1718.size() > 0) {
                jSONObjectJsonObjectInit.putOpt(ih.f2542, new JSONArray((Collection) this.f1718));
                int i11 = f1710 + 85;
                f1711 = i11 % 128;
                int i12 = i11 % 2;
            }
            if (this.f1723.length() > 0) {
                int i13 = f1710 + 115;
                f1711 = i13 % 128;
                int i14 = i13 % 2;
                jSONObjectJsonObjectInit.putOpt(ih.f2555, this.f1723.toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m5964() {
        int i10 = f1711 + 19;
        f1710 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1723.optString(ih.f2547);
        int i12 = f1711 + 39;
        f1710 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m5965(String str) {
        int i10 = f1710 + 23;
        f1711 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1723.put(ih.f2547, str);
            int i12 = f1710 + 41;
            f1711 = i12 % 128;
            if ((i12 % 2 == 0 ? (char) 30 : ';') == ';') {
            } else {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private JSONObject m5966() {
        JSONObject jSONObject;
        int i10 = f1711 + 113;
        int i11 = i10 % 128;
        f1710 = i11;
        if (!(i10 % 2 != 0)) {
            jSONObject = this.f1723;
        } else {
            jSONObject = this.f1723;
            int i12 = 69 / 0;
        }
        int i13 = i11 + 61;
        f1711 = i13 % 128;
        int i14 = i13 % 2;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m5967(String str) {
        int i10 = f1711 + 87;
        f1710 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1723.put(ih.f2542, str);
            int i12 = f1710 + 25;
            f1711 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 7 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m5968() {
        int i10 = f1710 + 1;
        f1711 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1723.optString(ih.f2542);
        int i12 = f1710 + 71;
        f1711 = i12 % 128;
        if (i12 % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m5969(String str) {
        int i10 = f1711 + 109;
        f1710 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1723.put(ih.f2551, str);
            int i12 = f1711 + 117;
            f1710 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m5970() {
        int i10 = f1710 + 75;
        f1711 = i10 % 128;
        if ((i10 % 2 == 0 ? '4' : '/') == '/') {
            return this.f1723.optString(ih.f2552);
        }
        int i11 = 73 / 0;
        return this.f1723.optString(ih.f2552);
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Object m5971() {
        int i10 = f1710 + 3;
        f1711 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1723.optString(ih.f2551);
        int i12 = f1711 + 35;
        f1710 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m5972() {
        int i10 = f1711;
        int i11 = i10 + 63;
        f1710 = i11 % 128;
        if ((i11 % 2 != 0 ? 'A' : (char) 6) != 6) {
            throw null;
        }
        List<String> list = this.f1718;
        int i12 = i10 + 67;
        f1710 = i12 % 128;
        int i13 = i12 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m5973(String str) {
        int i10 = f1711;
        int i11 = i10 + 109;
        f1710 = i11 % 128;
        int i12 = i11 % 2;
        this.f1722 = str;
        int i13 = i10 + 21;
        f1710 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m5974() {
        String str;
        int i10 = f1711 + 23;
        int i11 = i10 % 128;
        f1710 = i11;
        if (!(i10 % 2 == 0)) {
            str = this.f1720;
            int i12 = 19 / 0;
        } else {
            str = this.f1720;
        }
        int i13 = i11 + 51;
        f1711 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m5975(String str) {
        int i10 = f1710 + 73;
        int i11 = i10 % 128;
        f1711 = i11;
        char c10 = i10 % 2 == 0 ? '9' : 'B';
        this.f1721 = str;
        if (c10 != 'B') {
            throw null;
        }
        int i12 = i11 + 107;
        f1710 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m5976() {
        int i10 = f1710;
        int i11 = i10 + 43;
        f1711 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1721;
        int i13 = i10 + 45;
        f1711 = i13 % 128;
        if ((i13 % 2 == 0 ? 'I' : 'a') == 'a') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m5977(hl hlVar) {
        int i10 = f1711;
        int i11 = i10 + 83;
        f1710 = i11 % 128;
        int i12 = i11 % 2;
        this.f1719 = hlVar;
        int i13 = i10 + 5;
        f1710 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m5978(String str) {
        int i10 = f1710 + 23;
        f1711 = i10 % 128;
        int i11 = i10 % 2;
        if ((!TextUtils.isEmpty(str) ? '9' : (char) 7) != '9') {
            return;
        }
        if ((!this.f1718.contains(str) ? (char) 21 : 'Q') != 21) {
            return;
        }
        int i12 = f1711 + 11;
        f1710 = i12 % 128;
        if (i12 % 2 == 0) {
            this.f1718.add(str);
        } else {
            this.f1718.add(str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m5979(List<String> list) {
        int i10 = f1710 + 41;
        f1711 = i10 % 128;
        if (i10 % 2 == 0) {
            list.iterator();
            throw null;
        }
        Iterator<String> it = list.iterator();
        while (true) {
            if (!(it.hasNext())) {
                break;
            }
            int i11 = f1711 + 123;
            f1710 = i11 % 128;
            int i12 = i11 % 2;
            m5978(it.next());
        }
        int i13 = f1710 + 63;
        f1711 = i13 % 128;
        if ((i13 % 2 == 0 ? '.' : '?') != '.') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m5980() {
        int i10 = f1710;
        int i11 = i10 + 61;
        f1711 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 24 : (char) 2) == 24) {
            throw null;
        }
        String str = this.f1722;
        int i12 = i10 + 27;
        f1711 = i12 % 128;
        if ((i12 % 2 == 0 ? '(' : (char) 21) == 21) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5981(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f1716;
            char c10 = f1717;
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m5982(String str) {
        int i10 = f1711;
        int i11 = i10 + 45;
        f1710 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        this.f1720 = str;
        if (!z10) {
            throw null;
        }
        int i12 = i10 + 41;
        f1710 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private hl m5983() {
        int i10 = f1711 + 21;
        int i11 = i10 % 128;
        f1710 = i11;
        int i12 = i10 % 2;
        hl hlVar = this.f1719;
        int i13 = i11 + 29;
        f1711 = i13 % 128;
        int i14 = i13 % 2;
        return hlVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5984(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1713)) ^ ((c11 >>> 5) + f1712)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1714) ^ ((c12 + i12) ^ ((c12 << 4) + f1715))));
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m5985(String str) {
        int i10 = f1711 + 41;
        f1710 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1723.put(ih.f2552, str);
            int i12 = f1710 + 15;
            f1711 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0323  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4888(java.lang.String r22, java.util.List<java.lang.Object> r23, com.ironsource.adqualitysdk.sdk.i.ch r24) {
        /*
            Method dump skipped, instruction units count: 1156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dg.mo4888(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }
}
