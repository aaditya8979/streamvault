package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class dk extends cz implements cl {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1775 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1776 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1778 = 1310500565;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f1780 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1781 = 103;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1782 = 1435268900;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hn f1783;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private hn f1785;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f1779 = {40, 93, 62, 83, 37, 82, 94, 41, 63, -128, 48, 97, 2, 53, 28, 47, 57, 1, 51, -29, 84, 10, 57, -128, -126, 48, 122, 122, 24, -128, 30, -121, 126, 58, 106, 125, 28, 41, 106, -127, 52, 92, 26, -119, -67, 74, -93, 80, -62, 79, 67, -66, -92, 85, -64, -63, -97, 4, -88, -89, 8, 3, -62, -85, -16, -72, 25, 22, 118, -109, 89, 113, -124, -106, 91, -128, 125, -113, -115, 63, -123, -123, 103, -113, 105, -106, -119, 69, -91, 101, -120, 84, 3, -9, 80, 86, -15, -4, 87, 2, 84, 3, -9, 80, 86, 25, 73, 4, -123, 120, -124, -119, -93, 106, 125, -92, 119, -127, -119, 123, -85, 92, -110, 117, -15, -32, -28, -19, 3, -50, -23, 4, -33, -27, -19, -37, 11, -68, -10, -27, 97, 78, 82, 93, 115, 60, 89, 114, 61, 105, 94, 88, 112, 65, 100, 81, 69, -72, -60, 73, 99, -86, -67, 100, -87, 77, 72, -66, 86, -91, 82, -63, -43, 4, 0, ExifInterface.MARKER_EOI, -33, -6, -3, -32, -6, 2, -49, -35, 40, -46, 5, -90, 121, -123, -86, -92, -117, 126, -91, -117, -125, -76, -98, 93, -77, -126, -22, 55, 67, -18, -28, 77, 66, -29, 55, 58, -41, -26, 37, 62, 15, 23, -11, 58, -67, -64, 11, -57, 34, -77, -65, 38, 32, -50, -51, 47, -73, 17, -64, -79, 13, -19, 45, -66, -48, -47, -122, -76, -44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int[] f1777 = {72526405, 498935741, 1850971941, 1462439246, -2132092223, 1708160554, -395663865, 1925863166, 681729306, 1944994731, 1568739955, -1563559347, -1507877317, 2004252735, 1293346952, -1201631360, 458925985, 1781078698};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f1788 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f1787 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f1786 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f1789 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f1790 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject f1784 = IronSourceVideoBridge.jsonObjectInit();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private JSONObject m6043() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            hn hnVar = this.f1783;
            if (hnVar != null) {
                int i10 = f1775 + 33;
                f1776 = i10 % 128;
                int i11 = i10 % 2;
                jSONObjectJsonObjectInit.put(ih.f2550, hnVar.m6344());
            }
            hn hnVar2 = this.f1785;
            if (hnVar2 != null) {
                int i12 = f1776 + 89;
                f1775 = i12 % 128;
                int i13 = i12 % 2;
                jSONObjectJsonObjectInit.put(ih.f2544, hnVar2.m6344());
            }
            if (this.f1788.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2542, new JSONArray((Collection) this.f1788));
                int i14 = f1776 + 87;
                f1775 = i14 % 128;
                int i15 = i14 % 2;
            }
            if (this.f1787.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2538, new JSONArray((Collection) this.f1787));
            }
            if (this.f1786.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2537, new JSONArray((Collection) this.f1786));
                int i16 = f1775 + 19;
                f1776 = i16 % 128;
                int i17 = i16 % 2;
            }
            if (this.f1789.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2545, new JSONArray((Collection) this.f1789));
            }
            if (this.f1790.size() > 0) {
                jSONObjectJsonObjectInit.put(ih.f2546, new JSONArray((Collection) this.f1790));
            }
            if (this.f1784.length() > 0) {
                int i18 = f1775 + 41;
                f1776 = i18 % 128;
                if (!(i18 % 2 != 0)) {
                    jSONObjectJsonObjectInit.putOpt(ih.f2543, this.f1784.toString());
                } else {
                    jSONObjectJsonObjectInit.putOpt(ih.f2543, this.f1784.toString());
                    int i19 = 30 / 0;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String m6044() {
        int i10 = f1775 + 91;
        f1776 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            this.f1784.optString(ih.f2533);
            throw null;
        }
        String strOptString = this.f1784.optString(ih.f2533);
        int i11 = f1776 + 23;
        f1775 = i11 % 128;
        int i12 = i11 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private String m6045() {
        int i10 = f1775 + 87;
        f1776 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1784.optString(ih.f2545);
        int i12 = f1776 + 47;
        f1775 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private JSONObject m6046() {
        int i10 = f1775 + 53;
        f1776 = i10 % 128;
        if ((i10 % 2 != 0 ? 'V' : '#') != 'V') {
            return this.f1784;
        }
        int i11 = 38 / 0;
        return this.f1784;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String m6047() {
        int i10 = f1775 + 53;
        f1776 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1784.optString(ih.f2537);
        int i12 = f1776 + 33;
        f1775 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return strOptString;
        }
        int i13 = 10 / 0;
        return strOptString;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object m6048() {
        /*
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.f1788
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 > 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == r2) goto L10
            goto L44
        L10:
            int r0 = com.ironsource.adqualitysdk.sdk.i.dk.f1776
            int r0 = r0 + 11
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dk.f1775 = r3
            int r0 = r0 % 2
            java.util.List<java.lang.String> r0 = r4.f1787
            int r0 = r0.size()
            if (r0 > 0) goto L44
            int r0 = com.ironsource.adqualitysdk.sdk.i.dk.f1775
            int r0 = r0 + 109
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dk.f1776 = r3
            int r0 = r0 % 2
            java.util.List<java.lang.String> r0 = r4.f1790
            int r0 = r0.size()
            if (r0 <= 0) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 == r2) goto L44
            int r0 = com.ironsource.adqualitysdk.sdk.i.dk.f1775
            int r0 = r0 + 119
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dk.f1776 = r2
            int r0 = r0 % 2
            goto L45
        L44:
            r1 = r2
        L45:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dk.m6048():java.lang.Object");
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m6049(String str) {
        int i10 = f1775 + 19;
        f1776 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1784.put(ih.f2533, str);
            int i12 = f1775 + 101;
            f1776 = i12 % 128;
            if ((i12 % 2 != 0 ? '\r' : 'X') != '\r') {
            } else {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hn m6050() {
        int i10 = f1775;
        int i11 = i10 + 117;
        f1776 = i11 % 128;
        int i12 = i11 % 2;
        hn hnVar = this.f1783;
        int i13 = i10 + 15;
        f1776 = i13 % 128;
        int i14 = i13 % 2;
        return hnVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m6051(String str) {
        int i10 = f1775 + 113;
        f1776 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? (char) 14 : 'E') == 14) {
                this.f1784.put(ih.f2537, str);
                throw null;
            }
            this.f1784.put(ih.f2537, str);
            int i11 = f1776 + 7;
            f1775 = i11 % 128;
            int i12 = i11 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m6052() {
        String strOptString;
        int i10 = f1775 + 47;
        f1776 = i10 % 128;
        if ((i10 % 2 != 0 ? '`' : '#') != '`') {
            strOptString = this.f1784.optString(ih.f2546);
        } else {
            strOptString = this.f1784.optString(ih.f2546);
            int i11 = 42 / 0;
        }
        int i12 = f1776 + 73;
        f1775 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m6053(String str) {
        int i10 = f1775 + 27;
        f1776 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1784.put(ih.f2538, str);
            int i12 = f1776 + 17;
            f1775 = i12 % 128;
            if ((i12 % 2 == 0 ? '0' : '\f') == '\f') {
            } else {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m6054() {
        int i10 = f1776 + 109;
        f1775 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1784.optString(ih.f2542);
        int i12 = f1776 + 69;
        f1775 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m6055(String str) {
        int i10 = f1775 + 89;
        f1776 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                this.f1784.put(ih.f2542, str);
            } else {
                this.f1784.put(ih.f2542, str);
                int i11 = 5 / 0;
            }
            int i12 = f1775 + 33;
            f1776 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private hn m6056() {
        int i10 = f1776 + 1;
        int i11 = i10 % 128;
        f1775 = i11;
        if (!(i10 % 2 != 0)) {
            throw null;
        }
        hn hnVar = this.f1785;
        int i12 = i11 + 81;
        f1776 = i12 % 128;
        int i13 = i12 % 2;
        return hnVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m6057(String str) {
        int i10 = f1776 + 57;
        f1775 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1784.put(ih.f2546, str);
            int i12 = f1776 + 125;
            f1775 = i12 % 128;
            if ((i12 % 2 == 0 ? (char) 22 : 'L') != 22) {
                return;
            }
            int i13 = 80 / 0;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m6058() {
        int i10 = f1776 + 57;
        f1775 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = this.f1784.optString(ih.f2538);
        int i12 = f1775 + 73;
        f1776 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m6059(String str) {
        int i10 = f1776 + 59;
        f1775 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f1784.put(ih.f2545, str);
            int i12 = f1775 + 15;
            f1776 = i12 % 128;
            if (i12 % 2 == 0) {
            } else {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6060(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1781;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1779;
                i14 = bArr != null ? (byte) (bArr[f1782 + i10] + i13) : (short) (f1780[f1782 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f1782 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f1778);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f1779;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f1780;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m6061() {
        int i10 = f1775 + 45;
        f1776 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return this.f1789;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6062(String str) {
        int i10 = f1775 + 55;
        f1776 = i10 % 128;
        int i11 = i10 % 2;
        m6063(str, this.f1789);
        int i12 = f1775 + 9;
        f1776 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m6063(String str, List<String> list) {
        if ((list != null ? (char) 30 : '?') != '?') {
            if (!(!TextUtils.isEmpty(str))) {
                return;
            }
            if (!(list.contains(str))) {
                int i10 = f1776 + 117;
                f1775 = i10 % 128;
                int i11 = i10 % 2;
                list.add(str);
                int i12 = f1775 + 49;
                f1776 = i12 % 128;
                int i13 = i12 % 2;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m6064(List<String> list) {
        int i10 = f1776 + 29;
        f1775 = i10 % 128;
        if (i10 % 2 != 0) {
            m6069(list, this.f1787);
        } else {
            m6069(list, this.f1787);
            int i11 = 78 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m6065() {
        int i10 = f1775;
        int i11 = i10 + 77;
        f1776 = i11 % 128;
        if ((i11 % 2 != 0 ? '\\' : 'Z') == '\\') {
            throw null;
        }
        List<String> list = this.f1786;
        int i12 = i10 + 15;
        f1776 = i12 % 128;
        int i13 = i12 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6066(hn hnVar) {
        if (!(hnVar == null)) {
            this.f1783 = hnVar;
            int i10 = f1775 + 13;
            f1776 = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = f1775 + 53;
        f1776 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6067(String str) {
        int i10 = f1775 + 9;
        f1776 = i10 % 128;
        int i11 = i10 % 2;
        m6063(str, this.f1786);
        int i12 = f1775 + 101;
        f1776 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 5 : ']') != 5) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6068(List<String> list) {
        int i10 = f1775 + 121;
        f1776 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 29 : 'B') != 29) {
            m6069(list, this.f1789);
        } else {
            m6069(list, this.f1789);
            int i11 = 25 / 0;
        }
        int i12 = f1775 + 89;
        f1776 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m6069(List<String> list, List<String> list2) {
        if ((list != null ? (char) 22 : '<') == '<') {
            return;
        }
        int i10 = f1776 + 105;
        f1775 = i10 % 128;
        int i11 = i10 % 2;
        Iterator<String> it = list.iterator();
        while (true) {
            if (!(it.hasNext())) {
                return;
            }
            int i12 = f1775 + 65;
            f1776 = i12 % 128;
            int i13 = i12 % 2;
            m6063(it.next(), list2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6070(JSONObject jSONObject) {
        int i10 = f1776 + 57;
        f1775 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        this.f1784 = jz.m6870(jSONObject);
        if (z10) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> m6071() {
        int i10 = f1775 + 33;
        int i11 = i10 % 128;
        f1776 = i11;
        int i12 = i10 % 2;
        List<String> list = this.f1790;
        int i13 = i11 + 33;
        f1775 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6072(hn hnVar) {
        int i10 = f1775 + 9;
        int i11 = i10 % 128;
        f1776 = i11;
        int i12 = i10 % 2;
        if (hnVar == null) {
            return;
        }
        int i13 = i11 + 67;
        f1775 = i13 % 128;
        int i14 = i13 % 2;
        this.f1785 = hnVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6073(String str) {
        int i10 = f1776 + 47;
        f1775 = i10 % 128;
        int i11 = i10 % 2;
        m6063(str, this.f1790);
        int i12 = f1776 + 45;
        f1775 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m6074(List<String> list) {
        int i10 = f1776 + 27;
        f1775 = i10 % 128;
        if ((i10 % 2 == 0 ? '6' : 'D') != '6') {
            m6069(list, this.f1790);
        } else {
            m6069(list, this.f1790);
            int i11 = 43 / 0;
        }
        int i12 = f1775 + 125;
        f1776 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6075(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1777.clone();
            e.f1935 = 0;
            while (true) {
                int i11 = e.f1935;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1937 = (c10 << 16) + c11;
                    e.f1936 = (c12 << 16) + c13;
                    e.m6211(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1937 ^ iArr2[i13];
                        e.f1937 = i14;
                        e.f1936 = e.m6210(i14) ^ e.f1936;
                        int i15 = e.f1937;
                        e.f1937 = e.f1936;
                        e.f1936 = i15;
                    }
                    int i16 = e.f1937;
                    e.f1937 = e.f1936;
                    e.f1936 = i16;
                    e.f1936 = i16 ^ iArr2[16];
                    e.f1937 ^= iArr2[17];
                    int i17 = e.f1935;
                    int i18 = e.f1937;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1936;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m6211(iArr2);
                    int i20 = e.f1935;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1935 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m6076() {
        int i10 = f1775 + 117;
        f1776 = i10 % 128;
        if ((i10 % 2 != 0 ? '\r' : '7') != '\r') {
            return this.f1788;
        }
        int i11 = 84 / 0;
        return this.f1788;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6077(String str) {
        int i10 = f1776 + 67;
        f1775 = i10 % 128;
        if ((i10 % 2 == 0 ? 'O' : '^') != '^') {
            m6063(str, this.f1787);
            throw null;
        }
        m6063(str, this.f1787);
        int i11 = f1775 + 3;
        f1776 = i11 % 128;
        if ((i11 % 2 != 0 ? 'H' : (char) 24) != 'H') {
            return;
        }
        int i12 = 5 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6078(List<String> list) {
        int i10 = f1776 + 39;
        f1775 = i10 % 128;
        int i11 = i10 % 2;
        m6069(list, this.f1786);
        int i12 = f1775 + 61;
        f1776 = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        int i13 = 81 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m6079() {
        int i10 = f1776;
        int i11 = i10 + 87;
        f1775 = i11 % 128;
        int i12 = i11 % 2;
        List<String> list = this.f1787;
        int i13 = i10 + 27;
        f1775 = i13 % 128;
        if (i13 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6080(String str) {
        int i10 = f1776 + 61;
        f1775 = i10 % 128;
        int i11 = i10 % 2;
        m6063(str, this.f1788);
        int i12 = f1776 + 113;
        f1775 = i12 % 128;
        if ((i12 % 2 == 0 ? '3' : '7') != '3') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6081(List<String> list) {
        int i10 = f1776 + 69;
        f1775 = i10 % 128;
        int i11 = i10 % 2;
        m6069(list, this.f1788);
        int i12 = f1775 + 103;
        f1776 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 16 : '>') == '>') {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0128  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4888(java.lang.String r21, java.util.List<java.lang.Object> r22, com.ironsource.adqualitysdk.sdk.i.ch r23) {
        /*
            Method dump skipped, instruction units count: 2664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dk.mo4888(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }
}
