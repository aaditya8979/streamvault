package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.jz;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class dh {

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1724 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1727;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private Map<String, dn> f1729;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private dp f1730;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1731;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private du f1732;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1733;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1734;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private du f1735;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject f1736;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1737;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1738;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1739;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1726 = {'@', 'y', 'y', '{', '2', 'i', 'g', 'W', 'c', 'm', 'f', 'n', 'q', 'n', 'f', '6', 'k', 'k', '`', '[', 'g', '9', 's', 's', 'p', 'n', 'Y', 'W', 'f', 'a', 'h', 'm', 'i', '2', 'c', '\\', '_', 'g', 'n', '`', '^', 'u', '9', 'k', 'i', 'i', 'l', 's', 'n', 'j', 'o'};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f1728 = {29873, 5452, 46953, 20862, 62230, 40206, 16189, 5511, 29797, 54862, 12403, 37430, 64551, 'E', 24988, 50094, 9637, 34762, 59782, 19447, 44528, 3861, 28991, 54072, 13651, 38726, 63857, 23332, 48273, 7823, 32928, 58066, 17615, 42747, 2290, 27163, 52240, 11888, 36957, 62019, 21620, 46702, 6047, 31107, 34882, 59808, 19347, 44440, 4077, 25076, 'm', 24971, 50097, 9640, 34781, 59860, 19431, 's', 24970, 50103, 9630, 34775, 59879, 19443, 44519, 3870, 28970, 54042, 13663, 38746, 63845, 23405, 48285, 7822, 32957};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static long f1725 = 5635646060697444846L;

    public dh(String str, du duVar) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            this.f1736 = jSONObjectJsonObjectInit;
            this.f1735 = duVar;
            this.f1738 = jSONObjectJsonObjectInit.optString(m5988(new int[]{0, 4, 18, 0}, "\u0000\u0001\u0000\u0000", false).intern());
            this.f1737 = this.f1736.optString(m5988(new int[]{4, 11, 0, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", true).intern());
            this.f1739 = this.f1736.optString(m5986(ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (29895 - (Process.myPid() >> 22)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7).intern());
            this.f1733 = this.f1736.optString(m5988(new int[]{15, 6, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001", false).intern());
            this.f1731 = this.f1736.optString(m5986(7 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.getOffsetAfter("", 0) + 5610), View.MeasureSpec.getMode(0) + 6).intern());
            if (this.f1736.has(m5988(new int[]{21, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true).intern())) {
                m5989(this.f1736.optJSONObject(m5988(new int[]{21, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true).intern()));
            }
        } catch (Throwable th2) {
            co.m5699(this.f1738, m5986(ExpandableListView.getPackedPositionGroup(0L) + 13, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m5986(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1728[i10 + i12]) ^ (((long) i12) * f1725)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m5987(dh dhVar) {
        int i10 = f1724;
        int i11 = i10 + 59;
        f1727 = i11 % 128;
        int i12 = i11 % 2;
        String str = dhVar.f1738;
        int i13 = i10 + 31;
        f1727 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m5988(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f1726, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m5989(JSONObject jSONObject) {
        int i10 = f1727 + 21;
        f1724 = i10 % 128;
        if ((i10 % 2 == 0 ? '>' : '*') == '>') {
            jSONObject.keys();
            throw null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!(itKeys.hasNext())) {
                return;
            }
            int i11 = f1727 + 9;
            f1724 = i11 % 128;
            if (i11 % 2 == 0) {
                String next = itKeys.next();
                this.f1735.m6185(next, jSONObject.opt(next));
                throw null;
            }
            String next2 = itKeys.next();
            this.f1735.m6185(next2, jSONObject.opt(next2));
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Map<String, dn> m5990() {
        int i10 = f1724 + 31;
        f1727 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f1729 == null) {
            this.f1729 = jz.m6873(this.f1736.optJSONObject(m5988(new int[]{42, 9, 0, 8}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", true).intern()), new jz.c<dn>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.1
                @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                /* JADX INFO: renamed from: ﻛ */
                public final /* synthetic */ dn mo4625(JSONObject jSONObject, String str) {
                    return new dn(dh.m5987(dh.this), str, jSONObject.optJSONObject(str));
                }
            });
        }
        Map<String, dn> map = this.f1729;
        int i12 = f1727 + 17;
        f1724 = i12 % 128;
        int i13 = i12 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final du m5991() {
        int i10 = f1724 + 81;
        f1727 = i10 % 128;
        if ((i10 % 2 != 0 ? '\f' : '\r') != '\r') {
            throw null;
        }
        if (this.f1732 == null) {
            du duVar = new du(jz.m6873(this.f1736.optJSONObject(m5986((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 43, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34850), 6 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()), new jz.c<Object>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.2

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f1741 = 1;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char[] f1742 = {'q', '>', 't', 'u', '~', 'z', 'w', 'v', 'O', '>', 'g', '~', '|', '|', 'U', '9', 'p', 'n', 'i', 'A', ' ', '-', 'W'};

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f1743;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m5999(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
                    String str2;
                    Object bytes = str;
                    if (str != null) {
                        bytes = str.getBytes("ISO-8859-1");
                    }
                    byte[] bArr = (byte[]) bytes;
                    synchronized (i.f2470) {
                        int i11 = iArr[0];
                        int i12 = iArr[1];
                        int i13 = iArr[2];
                        int i14 = iArr[3];
                        char[] cArr = new char[i12];
                        System.arraycopy(f1742, i11, cArr, 0, i12);
                        if (bArr != null) {
                            char[] cArr2 = new char[i12];
                            i.f2469 = 0;
                            char c10 = 0;
                            while (true) {
                                int i15 = i.f2469;
                                if (i15 >= i12) {
                                    break;
                                }
                                if (bArr[i15] == 1) {
                                    cArr2[i15] = (char) (((cArr[i15] << 1) + 1) - c10);
                                } else {
                                    cArr2[i15] = (char) ((cArr[i15] << 1) - c10);
                                }
                                c10 = cArr2[i15];
                                i.f2469 = i15 + 1;
                            }
                            cArr = cArr2;
                        }
                        if (i14 > 0) {
                            char[] cArr3 = new char[i12];
                            System.arraycopy(cArr, 0, cArr3, 0, i12);
                            int i16 = i12 - i14;
                            System.arraycopy(cArr3, 0, cArr, i16, i14);
                            System.arraycopy(cArr3, i14, cArr, 0, i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i12];
                            i.f2469 = 0;
                            while (true) {
                                int i17 = i.f2469;
                                if (i17 >= i12) {
                                    break;
                                }
                                cArr4[i17] = cArr[(i12 - i17) - 1];
                                i.f2469 = i17 + 1;
                            }
                            cArr = cArr4;
                        }
                        if (i13 > 0) {
                            i.f2469 = 0;
                            while (true) {
                                int i18 = i.f2469;
                                if (i18 >= i12) {
                                    break;
                                }
                                cArr[i18] = (char) (cArr[i18] - iArr[2]);
                                i.f2469 = i18 + 1;
                            }
                        }
                        str2 = new String(cArr);
                    }
                    return str2;
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
                /* JADX INFO: renamed from: ﻛ */
                public final Object mo4625(JSONObject jSONObject, String str) {
                    int i11 = f1741 + 71;
                    f1743 = i11 % 128;
                    int i12 = i11 % 2;
                    try {
                        String strOptString = jSONObject.optString(str);
                        if (jSONObject.opt(str) instanceof String) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m5999(new int[]{0, 1, 193, 0}, "\u0001", true).intern());
                            sb2.append(strOptString);
                            sb2.append(m5999(new int[]{0, 1, 193, 0}, "\u0001", true).intern());
                            strOptString = sb2.toString();
                            int i13 = f1743 + 47;
                            f1741 = i13 % 128;
                            int i14 = i13 % 2;
                        }
                        String strM5987 = dh.m5987(dh.this);
                        return new dq(strM5987, strOptString).m6155(dt.m6175(strM5987, strOptString, strOptString));
                    } catch (Throwable th2) {
                        String strM59872 = dh.m5987(dh.this);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m5999(new int[]{1, 14, 12, 8}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000", false).intern());
                        sb3.append(str);
                        sb3.append(m5999(new int[]{15, 8, 0, 5}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000", true).intern());
                        sb3.append(jSONObject.optString(str));
                        co.m5699(strM59872, sb3.toString(), th2);
                        return null;
                    }
                }
            }), this.f1735, true);
            this.f1732 = duVar;
            duVar.m6183(jz.m6881(this.f1736.optJSONArray(m5986(50 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) View.resolveSizeAndState(0, 0, 0), (Process.myTid() >> 22) + 7).intern()), new jz.b<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.4
                @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
                /* JADX INFO: renamed from: ﾒ */
                public final /* synthetic */ String mo4626(JSONArray jSONArray, int i11) {
                    return dz.m6209(jSONArray.optString(i11));
                }
            }));
            int i11 = f1727 + 57;
            f1724 = i11 % 128;
            int i12 = i11 % 2;
        }
        return this.f1732;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ironsource.adqualitysdk.sdk.i.dp m5992() {
        /*
            r6 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.dh.f1724
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dh.f1727 = r1
            int r0 = r0 % 2
            r1 = 67
            if (r0 == 0) goto L10
            r0 = 6
            goto L11
        L10:
            r0 = r1
        L11:
            r2 = 0
            if (r0 == r1) goto L1e
            com.ironsource.adqualitysdk.sdk.i.dp r0 = r6.f1730
            r3 = 60
            int r3 = r3 / r2
            if (r0 != 0) goto L48
            goto L22
        L1c:
            r0 = move-exception
            throw r0
        L1e:
            com.ironsource.adqualitysdk.sdk.i.dp r0 = r6.f1730
            if (r0 != 0) goto L48
        L22:
            com.ironsource.adqualitysdk.sdk.i.dp r0 = new com.ironsource.adqualitysdk.sdk.i.dp
            org.json.JSONObject r3 = r6.f1736
            r4 = 4
            int[] r4 = new int[r4]
            r4 = {x004c: FILL_ARRAY_DATA , data: [33, 9, 0, 8} // fill-array
            java.lang.String r5 = "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000"
            java.lang.String r2 = m5988(r4, r5, r2)
            java.lang.String r2 = r2.intern()
            org.json.JSONObject r2 = r3.optJSONObject(r2)
            r0.<init>(r2)
            r6.f1730 = r0
            int r0 = com.ironsource.adqualitysdk.sdk.i.dh.f1727
            int r0 = r0 + r1
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.dh.f1724 = r1
            int r0 = r0 % 2
        L48:
            com.ironsource.adqualitysdk.sdk.i.dp r0 = r6.f1730
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dh.m5992():com.ironsource.adqualitysdk.sdk.i.dp");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m5993() {
        int i10 = f1727;
        int i11 = i10 + 57;
        f1724 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1733;
        int i13 = i10 + 87;
        f1724 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 11 : '@') != 11) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m5994() {
        int i10 = f1724 + 1;
        f1727 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1731;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m5995() {
        int i10 = f1727 + 43;
        int i11 = i10 % 128;
        f1724 = i11;
        int i12 = i10 % 2;
        String str = this.f1737;
        int i13 = i11 + 107;
        f1727 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return str;
        }
        int i14 = 50 / 0;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m5996() {
        int i10 = f1727;
        int i11 = i10 + 125;
        f1724 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1738;
        int i13 = i10 + 53;
        f1724 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 11 : '4') == '4') {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m5997(String str) {
        Map<String, String> mapM6878;
        int i10 = f1727 + 101;
        f1724 = i10 % 128;
        int i11 = i10 % 2;
        if ((this.f1734 == null ? '(' : '+') != '+' && (mapM6878 = jz.m6878(this.f1736.optJSONObject(m5986(TextUtils.lastIndexOf("", '0', 0, 0) + 58, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 18 - Color.green(0)).intern()))) != null) {
            ArrayList arrayList = new ArrayList(mapM6878.keySet());
            Collections.sort(arrayList, new Comparator<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dh.5
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(String str2, String str3) {
                    return kc.m6935(str2, str3);
                }
            });
            String str2 = null;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!(it.hasNext())) {
                    break;
                }
                String str3 = (String) it.next();
                if (kc.m6935(str, str3) >= 0) {
                    int i12 = f1724 + 39;
                    f1727 = i12 % 128;
                    int i13 = i12 % 2;
                    str2 = mapM6878.get(str3);
                    int i14 = f1727 + 123;
                    f1724 = i14 % 128;
                    int i15 = i14 % 2;
                }
                int i16 = f1724 + 103;
                f1727 = i16 % 128;
                int i17 = i16 % 2;
            }
            this.f1734 = str2;
        }
        return this.f1734;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m5998() {
        int i10 = f1724 + 117;
        f1727 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 2 : 'Z') != 2) {
            return this.f1739;
        }
        throw null;
    }
}
