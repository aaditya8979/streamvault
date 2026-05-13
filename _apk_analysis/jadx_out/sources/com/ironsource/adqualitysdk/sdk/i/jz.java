package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class jz {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2953 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2954 = {261, 270, 266, 265, 272, 303, 292, 295, 302, 256, 301, 298, 219, 305, 284, 287, 297, 290, 293, 233, 227, 304, 286, 288, 228, 307, 308, 271, 291};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2955 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2956 = 187;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2957 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2958 = true;

    public interface b<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo4626(JSONArray jSONArray, int i10);
    }

    public interface c<T> {
        /* JADX INFO: renamed from: ﻛ */
        T mo4625(JSONObject jSONObject, String str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m6866(JSONArray jSONArray) {
        int i10 = f2955;
        int i11 = i10 + 21;
        f2953 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            throw null;
        }
        if ((jSONArray == null ? '4' : 'N') == 'N') {
            return m6876(jSONArray);
        }
        int i12 = i10 + 79;
        f2953 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m6867(JSONArray jSONArray, int i10, int i11) throws JSONException {
        String strM6872;
        int i12 = f2953 + 111;
        f2955 = i12 % 128;
        if (i12 % 2 != 0) {
            strM6872 = m6872(jSONArray.opt(i10), i11);
            int i13 = 33 / 0;
            if (strM6872 == null) {
                return;
            }
        } else {
            strM6872 = m6872(jSONArray.opt(i10), i11);
            if ((strM6872 != null ? '8' : 'X') != '8') {
                return;
            }
        }
        jSONArray.put(i10, strM6872);
        int i14 = f2953 + 85;
        f2955 = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m6868(JSONObject jSONObject, int i10) {
        int i11 = f2955 + 21;
        f2953 = i11 % 128;
        int i12 = i11 % 2;
        m6874(jSONObject, i10, null);
        int i13 = f2953 + 29;
        f2955 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m6869(JSONObject jSONObject, JSONObject jSONObject2, boolean z10) {
        int i10 = f2953 + 125;
        int i11 = i10 % 128;
        f2955 = i11;
        if (i10 % 2 != 0) {
            int i12 = 89 / 0;
            if ((jSONObject != null ? (char) 27 : (char) 20) == 20) {
                return;
            }
        } else {
            if ((jSONObject != null ? (char) 25 : (char) 21) == 21) {
                return;
            }
        }
        int i13 = i11 + 71;
        f2953 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 54 / 0;
            if (jSONObject2 == null) {
                return;
            }
        } else if (jSONObject2 == null) {
            return;
        }
        int i15 = i11 + 81;
        f2953 = i15 % 128;
        if ((i15 % 2 == 0 ? 'R' : '&') != '&') {
            jSONObject2.keys();
            throw null;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (true) {
            if ((itKeys.hasNext() ? (char) 19 : '\b') != 19) {
                break;
            }
            String next = itKeys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z10) {
            int i16 = f2955 + 125;
            f2953 = i16 % 128;
            int i17 = i16 % 2;
            jSONObject.remove(ih.f2557);
            int i18 = f2955 + 101;
            f2953 = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m6870(JSONObject jSONObject) {
        int i10 = f2953 + 97;
        f2955 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        return m6882(jSONObject, false);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m6871(JSONObject jSONObject, JSONObject jSONObject2) {
        int i10 = f2953 + 3;
        f2955 = i10 % 128;
        int i11 = i10 % 2;
        m6869(jSONObject, jSONObject2, false);
        int i12 = f2955 + 105;
        f2953 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 83 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6872(Object obj, int i10) throws JSONException {
        int i11 = f2953 + 13;
        int i12 = i11 % 128;
        f2955 = i12;
        if (i11 % 2 != 0) {
            boolean z10 = obj instanceof JSONObject;
            throw null;
        }
        if (obj instanceof JSONObject) {
            m6868((JSONObject) obj, i10);
        } else {
            if ((obj instanceof JSONArray ? 'T' : 'a') != 'a') {
                int i13 = i12 + 83;
                f2953 = i13 % 128;
                boolean z11 = i13 % 2 == 0;
                m6883((JSONArray) obj, i10);
                if (z11) {
                    int i14 = 67 / 0;
                }
            } else {
                if (!(!(obj instanceof String))) {
                    String str = (String) obj;
                    if (str.length() > i10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str.substring(0, i10));
                        sb2.append(m6875((String) null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, (int[]) null, "\u0099\u0090\u0098\u0086\u008f\u0097\u0091\u0096\u008b\u0086\u0095\u0094\u0094\u0094").intern());
                        return sb2.toString();
                    }
                    int i15 = f2953 + 43;
                    f2955 = i15 % 128;
                    int i16 = i15 % 2;
                    return str;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> Map<String, T> m6873(JSONObject jSONObject, c<T> cVar) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!(itKeys.hasNext())) {
                return map;
            }
            int i10 = f2953 + 71;
            f2955 = i10 % 128;
            if ((i10 % 2 != 0 ? '.' : '\"') == '.') {
                String next = itKeys.next();
                map.put(next, cVar.mo4625(jSONObject, next));
                throw null;
            }
            String next2 = itKeys.next();
            map.put(next2, cVar.mo4625(jSONObject, next2));
            int i11 = f2953 + 69;
            f2955 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: JSONException -> 0x0059, TryCatch #0 {JSONException -> 0x0059, blocks: (B:8:0x0013, B:11:0x0023, B:19:0x003c, B:22:0x004c, B:25:0x0055, B:24:0x0052, B:29:0x005b), top: B:35:0x0011 }] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6874(org.json.JSONObject r6, int r7, java.util.List<java.lang.String> r8) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.jz.f2953
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2955 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = r1
        L10:
            r2 = 0
            if (r0 != 0) goto L5b
            org.json.JSONArray r0 = r6.names()     // Catch: org.json.JSONException -> L59
            if (r0 == 0) goto L58
            int r3 = com.ironsource.adqualitysdk.sdk.i.jz.f2953
            int r3 = r3 + 121
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2955 = r4
            int r3 = r3 % 2
        L23:
            int r3 = r0.length()     // Catch: org.json.JSONException -> L59
            r4 = 61
            if (r1 >= r3) goto L2d
            r3 = r4
            goto L2f
        L2d:
            r3 = 76
        L2f:
            if (r3 == r4) goto L32
            goto L58
        L32:
            int r3 = com.ironsource.adqualitysdk.sdk.i.jz.f2953
            int r3 = r3 + 119
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2955 = r4
            int r3 = r3 % 2
            java.lang.String r3 = r0.optString(r1)     // Catch: org.json.JSONException -> L59
            if (r8 == 0) goto L52
            int r4 = com.ironsource.adqualitysdk.sdk.i.jz.f2953
            int r4 = r4 + 69
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2955 = r5
            int r4 = r4 % 2
            boolean r4 = r8.contains(r3)     // Catch: org.json.JSONException -> L59
            if (r4 != 0) goto L55
        L52:
            m6880(r6, r3, r7)     // Catch: org.json.JSONException -> L59
        L55:
            int r1 = r1 + 1
            goto L23
        L58:
            return
        L59:
            r6 = move-exception
            goto L61
        L5b:
            r6.names()     // Catch: org.json.JSONException -> L59
            throw r2     // Catch: java.lang.Throwable -> L5f
        L5f:
            r6 = move-exception
            throw r6
        L61:
            int r7 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r7 = r7 >> 24
            int r7 = 127 - r7
            java.lang.String r8 = "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"
            java.lang.String r7 = m6875(r2, r7, r2, r8)
            java.lang.String r7 = r7.intern()
            java.lang.String r8 = ""
            int r8 = android.os.Process.getGidForName(r8)
            int r8 = 126 - r8
            java.lang.String r0 = "\u0091\u008c\u0089\u0093\u008d\u0092\u0091\u0087\u0086\u008f\u0090\u0087\u0088\u008f\u008e\u008d\u008b\u008c\u008b\u008b\u008a"
            java.lang.String r8 = m6875(r2, r8, r2, r0)
            java.lang.String r8 = r8.intern()
            com.ironsource.adqualitysdk.sdk.i.k.m6906(r7, r8, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m6874(org.json.JSONObject, int, java.util.List):void");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6875(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2954;
            int i11 = f2956;
            if (f2958) {
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
            if (f2957) {
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <T> List<T> m6876(JSONArray jSONArray) {
        List<T> listM6881 = m6881(jSONArray, new b<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final T mo4626(JSONArray jSONArray2, int i10) {
                return (T) jSONArray2.opt(i10);
            }
        });
        int i10 = f2955 + 113;
        f2953 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return listM6881;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m6877(JSONObject jSONObject, String str, List<String> list) {
        int i10 = f2955 + 71;
        f2953 = i10 % 128;
        int i11 = i10 % 2;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if ((jSONArrayOptJSONArray == null ? 'U' : (char) 23) != 'U') {
            return m6866(jSONArrayOptJSONArray);
        }
        int i12 = f2953;
        int i13 = i12 + 31;
        f2955 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i12 + 39;
        f2955 = i15 % 128;
        if (i15 % 2 == 0) {
            return list;
        }
        int i16 = 55 / 0;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Map<String, String> m6878(JSONObject jSONObject) {
        Map<String, String> mapM6873 = m6873(jSONObject, new c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.3
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ String mo4625(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i10 = f2953 + 11;
        f2955 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return mapM6873;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m6879(int i10, int i11, long j10, long j11) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            if ((j10 > -1 ? (char) 15 : ']') != ']') {
                int i12 = f2953 + 117;
                f2955 = i12 % 128;
                int i13 = i12 % 2;
                jSONObjectJsonObjectInit.put(m6875((String) null, Color.alpha(0) + 127, (int[]) null, "\u009a").intern(), i10);
                jSONObjectJsonObjectInit.put(m6875((String) null, 127 - ExpandableListView.getPackedPositionType(0L), (int[]) null, "\u009b").intern(), i11);
                jSONObjectJsonObjectInit.put(m6875((String) null, Color.argb(0, 0, 0, 0) + 127, (int[]) null, "\u0086").intern(), j10);
                jSONObjectJsonObjectInit.put(m6875((String) null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), (int[]) null, "\u0096").intern(), j11);
                int i14 = f2953 + 15;
                f2955 = i14 % 128;
                int i15 = i14 % 2;
            } else {
                jSONObjectJsonObjectInit.put(m6875((String) null, 127 - Color.alpha(0), (int[]) null, "\u009a").intern(), -1);
                jSONObjectJsonObjectInit.put(m6875((String) null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), (int[]) null, "\u009b").intern(), -1);
                jSONObjectJsonObjectInit.put(m6875((String) null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (int[]) null, "\u0086").intern(), -1);
                jSONObjectJsonObjectInit.put(m6875((String) null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, (int[]) null, "\u0096").intern(), -1);
            }
        } catch (JSONException e10) {
            k.m6906(m6875((String) null, 127 - (KeyEvent.getMaxKeyCode() >> 16), (int[]) null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m6875((String) null, ExpandableListView.getPackedPositionChild(0L) + 128, (int[]) null, "\u0091\u008c\u0089\u0093\u008d\u009d\u0097\u0096\u008c\u009c\u0086\u0089\u008f\u0088\u008d\u0092\u0091\u0087\u0086\u008f\u0098\u008b\u0097\u008d\u008b\u008c\u008b\u008b\u008a").intern(), e10);
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m6880(org.json.JSONObject r6, java.lang.String r7, int r8) throws org.json.JSONException {
        /*
            java.lang.Object r0 = r6.opt(r7)
            java.lang.String r8 = m6872(r0, r8)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto Le
            r2 = r1
            goto Lf
        Le:
            r2 = r0
        Lf:
            r3 = 0
            if (r2 == r1) goto L13
            goto L4b
        L13:
            int r2 = com.ironsource.adqualitysdk.sdk.i.jz.f2955
            int r2 = r2 + 79
            int r4 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2953 = r4
            int r2 = r2 % 2
            r4 = 66
            if (r2 != 0) goto L23
            r2 = r4
            goto L25
        L23:
            r2 = 99
        L25:
            java.lang.String r5 = ""
            if (r2 == r4) goto L30
            boolean r0 = r8.equals(r5)
            if (r0 == 0) goto L48
            goto L3d
        L30:
            boolean r2 = r8.equals(r5)
            r4 = 25
            int r4 = r4 / r0
            if (r2 == 0) goto L3a
            goto L3b
        L3a:
            r0 = r1
        L3b:
            if (r0 == r1) goto L48
        L3d:
            int r8 = com.ironsource.adqualitysdk.sdk.i.jz.f2955
            int r8 = r8 + 19
            int r0 = r8 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2953 = r0
            int r8 = r8 % 2
            r8 = r3
        L48:
            r6.put(r7, r8)
        L4b:
            int r6 = com.ironsource.adqualitysdk.sdk.i.jz.f2955
            int r6 = r6 + 63
            int r7 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2953 = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L58
            return
        L58:
            throw r3     // Catch: java.lang.Throwable -> L59
        L59:
            r6 = move-exception
            throw r6
        L5b:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m6880(org.json.JSONObject, java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[PHI: r3
      0x003b: PHI (r3v5 T) = (r3v4 T), (r3v6 T) binds: [B:22:0x0038, B:14:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.util.List<T> m6881(org.json.JSONArray r6, com.ironsource.adqualitysdk.sdk.i.jz.b<T> r7) {
        /*
            if (r6 == 0) goto L4c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L9:
            int r3 = r6.length()
            if (r2 >= r3) goto L4b
            int r3 = com.ironsource.adqualitysdk.sdk.i.jz.f2955
            int r3 = r3 + 83
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2953 = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L2e
            java.lang.Object r3 = r7.mo4626(r6, r2)
            r4 = 4
            int r4 = r4 / r1
            r4 = 98
            if (r3 == 0) goto L27
            r5 = r4
            goto L29
        L27:
            r5 = 45
        L29:
            if (r5 == r4) goto L3b
            goto L48
        L2c:
            r6 = move-exception
            throw r6
        L2e:
            java.lang.Object r3 = r7.mo4626(r6, r2)
            r4 = 1
            if (r3 == 0) goto L37
            r5 = r4
            goto L38
        L37:
            r5 = r1
        L38:
            if (r5 == r4) goto L3b
            goto L48
        L3b:
            int r4 = com.ironsource.adqualitysdk.sdk.i.jz.f2955
            int r4 = r4 + 9
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.jz.f2953 = r5
            int r4 = r4 % 2
            r0.add(r3)
        L48:
            int r2 = r2 + 1
            goto L9
        L4b:
            return r0
        L4c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jz.m6881(org.json.JSONArray, com.ironsource.adqualitysdk.sdk.i.jz$b):java.util.List");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m6882(JSONObject jSONObject, boolean z10) {
        int i10 = f2955 + 47;
        f2953 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
                if ((z10 ? 'D' : (char) 26) != 26) {
                    int i11 = f2955 + 41;
                    f2953 = i11 % 128;
                    if ((i11 % 2 == 0 ? 'a' : '.') == 'a') {
                        jSONObjectJsonObjectInit.remove(ih.f2557);
                        throw null;
                    }
                    jSONObjectJsonObjectInit.remove(ih.f2557);
                }
                return jSONObjectJsonObjectInit;
            } catch (JSONException unused) {
            }
        }
        return IronSourceVideoBridge.jsonObjectInit();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m6883(JSONArray jSONArray, int i10) throws JSONException {
        int i11 = f2955 + 115;
        f2953 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (true) {
            if ((i13 < jSONArray.length() ? (char) 22 : (char) 21) != 22) {
                return;
            }
            int i14 = f2955 + 59;
            f2953 = i14 % 128;
            int i15 = i14 % 2;
            m6867(jSONArray, i13, i10);
            i13++;
        }
    }
}
