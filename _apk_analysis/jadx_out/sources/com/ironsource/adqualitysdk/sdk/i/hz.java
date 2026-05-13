package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.i.hy;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes10.dex */
public final class hz {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2462 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2463 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2464 = 200;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2466 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2467 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<hy.a, ht> f2468;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2465 = {279, 298, 306, 301, 299, 316, 270, 305, 310, 300, 314, 232, 321, 312, 302, 311, 309, 315, 244, 269, 303, 308, 297, 304, 320, 267, 277, 318};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f2461 = {1026070196, -1497733472, 1007237320, 748579486, 709667319, 1802634736, 1645467311, 2040079237, 902973595, 162566763, 917144358, 78795934, 1736430505, -1215225542, 1366241589, -1802646025, -217124763, 1964028701};

    public hz() {
        m6522((String) null, Gravity.getAbsoluteGravity(0, 0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        this.f2468 = new HashMap();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hv<T> m6506(Object obj, Object obj2, hv hvVar) {
        if ((obj != null ? (char) 5 : '-') != '-') {
            int i10 = f2463 + 117;
            f2462 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 6 : G5.T) == 6) {
                boolean z10 = obj instanceof Collection;
                throw null;
            }
            if (obj instanceof Collection) {
                return new hx((Collection) obj, obj2, hvVar);
            }
            if (obj instanceof Map) {
                return new hx((Map) obj, obj2, hvVar);
            }
            if (obj.getClass().isArray()) {
                hx hxVar = new hx(new ArrayList(Arrays.asList(obj)), obj2, hvVar);
                int i11 = f2462 + 101;
                f2463 = i11 % 128;
                int i12 = i11 % 2;
                return hxVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List m6507(Object obj, hy hyVar, int i10) {
        int i11 = f2462 + 67;
        f2463 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            m6515(obj, hyVar.m6454(i10), hyVar.m6456(i10), hyVar.m6460(i10));
            throw null;
        }
        List listM6515 = m6515(obj, hyVar.m6454(i10), hyVar.m6456(i10), hyVar.m6460(i10));
        int i12 = f2463 + 101;
        f2462 = i12 % 128;
        int i13 = i12 % 2;
        return listM6515;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m6508(Object obj, List<String> list) {
        if ((obj != null ? '`' : 'F') != '`') {
            return false;
        }
        int i10 = f2462 + 47;
        f2463 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM6921 = kb.m6921(obj.getClass(), list);
        int i12 = f2462 + 83;
        f2463 = i12 % 128;
        int i13 = i12 % 2;
        return zM6921;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m6509(Class cls) {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                return (Field[]) arrayList.toArray(new Field[0]);
            }
            int i11 = f2463 + 47;
            f2462 = i11 % 128;
            if (!(i11 % 2 == 0)) {
                declaredFields[i10].getType().equals(String.class);
                throw null;
            }
            Field field = declaredFields[i10];
            if ((field.getType().equals(String.class) ? 'H' : '5') == 'H') {
                int i12 = f2462 + 85;
                f2463 = i12 % 128;
                if (i12 % 2 == 0) {
                    arrayList.add(field);
                    throw null;
                }
                arrayList.add(field);
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        return r0;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Field[] m6510(java.lang.Class r5, int r6) {
        /*
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            r1 = 0
            r2 = r1
        L6:
            r3 = 89
            if (r5 == 0) goto Ld
            r4 = 94
            goto Le
        Ld:
            r4 = r3
        Le:
            if (r4 == r3) goto L4e
            if (r2 == r6) goto L14
            r3 = r1
            goto L15
        L14:
            r3 = 1
        L15:
            if (r3 == 0) goto L18
            goto L4e
        L18:
            int r3 = com.ironsource.adqualitysdk.sdk.i.hz.f2462
            int r3 = r3 + 35
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.hz.f2463 = r4
            int r3 = r3 % 2
            r4 = 53
            if (r3 != 0) goto L29
            r3 = 12
            goto L2a
        L29:
            r3 = r4
        L2a:
            if (r3 != r4) goto L47
            java.lang.Class r5 = r5.getSuperclass()
            if (r5 == 0) goto L44
            java.lang.reflect.Field[] r3 = r5.getDeclaredFields()
            java.lang.reflect.Field[] r0 = com.ironsource.adqualitysdk.sdk.i.kb.m6923(r0, r3)
            int r3 = com.ironsource.adqualitysdk.sdk.i.hz.f2462
            int r3 = r3 + 77
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.hz.f2463 = r4
            int r3 = r3 % 2
        L44:
            int r2 = r2 + 1
            goto L6
        L47:
            r5.getSuperclass()
            r5 = 0
            throw r5     // Catch: java.lang.Throwable -> L4c
        L4c:
            r5 = move-exception
            throw r5
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hz.m6510(java.lang.Class, int):java.lang.reflect.Field[]");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private <T> hv<T> m6511(Object obj, ht htVar) {
        int i10 = f2463 + 107;
        f2462 = i10 % 128;
        int i11 = i10 % 2;
        try {
            hv<T> hvVarM6516 = m6516(m6519(obj, htVar.m6420().get(0), (hv) null), htVar, 1);
            int i12 = f2463 + 115;
            f2462 = i12 % 128;
            int i13 = i12 % 2;
            return hvVarM6516;
        } catch (Exception e10) {
            k.m6906(m6522((String) null, (ViewConfiguration.getTapTimeout() >> 16) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m6522((String) null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), (int[]) null, "\u0098\u0086\u0097\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0096\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008c\u0095\u0089\u0088\u0086\u0086\u0084\u0095\u008c\u008b\u0090\u008b\u008b\u0094").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hv<T> m6512(Field field, Object obj, hv hvVar) {
        hx hxVar = new hx(field, obj, hvVar);
        int i10 = f2462 + 77;
        f2463 = i10 % 128;
        int i11 = i10 % 2;
        return hxVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6513(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2461.clone();
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List m6514(Object obj) {
        int i10 = f2462 + 125;
        f2463 = i10 % 128;
        List listM6515 = (i10 % 2 == 0 ? (char) 24 : '0') != 24 ? m6515(obj, true, true, true) : m6515(obj, false, true, true);
        int i11 = f2463 + 87;
        f2462 = i11 % 128;
        if ((i11 % 2 != 0 ? 'K' : '*') != 'K') {
            return listM6515;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List m6515(Object obj, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList;
        int i10;
        int i11 = f2462 + 7;
        int i12 = i11 % 128;
        f2463 = i12;
        int i13 = i11 % 2;
        if (obj == null) {
            arrayList = null;
        } else {
            int i14 = i12 + 103;
            f2462 = i14 % 128;
            int i15 = i14 % 2;
            if ((obj instanceof Collection ? '[' : '4') == '[' && z10) {
                arrayList = new ArrayList((Collection) obj);
                i10 = f2462 + 121;
            } else {
                if ((obj.getClass().isArray() ? '?' : '\r') == '\r' || !z12) {
                    if ((obj instanceof Map) && z11) {
                        Map map = (Map) obj;
                        arrayList = new ArrayList(map.values());
                        arrayList.addAll(map.keySet());
                        i10 = f2462 + 67;
                    }
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(Arrays.asList(obj));
                }
            }
            f2463 = i10 % 128;
            int i16 = i10 % 2;
        }
        int i17 = f2463 + 25;
        f2462 = i17 % 128;
        if (i17 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> hv<T> m6516(hv hvVar, ht htVar, int i10) {
        if (i10 >= htVar.m6420().size()) {
            return hvVar;
        }
        List<Field> list = htVar.m6420().get(i10);
        Object objMo6430 = hvVar.mo6430();
        List listM6514 = m6514(objMo6430);
        if (listM6514 == null) {
            String strIntern = m6522((String) null, 127 - Color.alpha(0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6522((String) null, TextUtils.lastIndexOf("", '0') + 128, (int[]) null, "\u008c\u008a\u0084\u009c\u0088\u0084\u0085\u0084\u008b\u008c\u0093\u008e\u0097\u009b\u008c\u008b\u0090\u008c\u0089\u0090\u0088\u0086\u0085\u0084\u0096\u0096\u0090\u009a\u008c\u008a\u0084\u0086\u0085\u0084\u008e\u0099\u0094").intern());
            sb2.append(objMo6430.getClass());
            k.m6886(strIntern, sb2.toString());
            return null;
        }
        Iterator it = listM6514.iterator();
        while (true) {
            if (!it.hasNext()) {
                int i11 = f2462 + 99;
                f2463 = i11 % 128;
                if ((i11 % 2 == 0 ? (char) 5 : (char) 19) != 5) {
                    return null;
                }
                throw null;
            }
            int i12 = f2462 + 107;
            f2463 = i12 % 128;
            int i13 = i12 % 2;
            Object next = it.next();
            try {
                hv hvVarM6519 = m6519(next, list, m6506(objMo6430, next, hvVar));
                if (hvVarM6519 != null) {
                    return m6516(hvVarM6519, htVar, i10 + 1);
                }
                int i14 = f2462 + 19;
                f2463 = i14 % 128;
                int i15 = i14 % 2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hv m6517(hv hvVar, hw hwVar, int i10) {
        Object objMo6430 = hvVar.mo6430();
        if (hwVar.m6438().contains(objMo6430) || hwVar.m6432().contains(objMo6430)) {
            return null;
        }
        if (hwVar.m6439().m6463(i10) && m6524(hwVar.m6439().m6455(), hvVar)) {
            int i11 = f2463 + 65;
            f2462 = i11 % 128;
            int i12 = i11 % 2;
            if (hwVar.m6437()) {
                int i13 = f2463 + 13;
                f2462 = i13 % 128;
                int i14 = i13 % 2;
                hwVar.m6434(hvVar);
                hwVar.m6435(objMo6430);
            }
            return hvVar;
        }
        if (objMo6430 instanceof WeakReference) {
            WeakReference weakReference = (WeakReference) objMo6430;
            if (weakReference.get() != null && hwVar.m6439().m6465(i10)) {
                int i15 = f2462 + 33;
                f2463 = i15 % 128;
                int i16 = i15 % 2;
                if ((m6508(weakReference.get(), hwVar.m6439().m6459()) ? 'G' : 'U') == 'G') {
                    int i17 = f2463 + 77;
                    f2462 = i17 % 128;
                    int i18 = i17 % 2;
                    return m6518(weakReference.get(), hwVar, i10 + 1, hvVar);
                }
            }
        }
        if (!(!m6508(objMo6430, hwVar.m6439().m6459()))) {
            return m6518(objMo6430, hwVar, i10 + 1, hvVar);
        }
        if (hwVar.m6439().m6458()) {
            int i19 = f2463;
            int i20 = i19 + 13;
            f2462 = i20 % 128;
            int i21 = i20 % 2;
            if (objMo6430 != null) {
                int i22 = i19 + 25;
                f2462 = i22 % 128;
                if ((i22 % 2 != 0 ? (char) 7 : '2') != '2') {
                    hwVar.m6438().add(objMo6430);
                    throw null;
                }
                hwVar.m6438().add(objMo6430);
            }
        }
        List listM6507 = m6507(objMo6430, hwVar.m6439(), i10);
        ht htVarM6436 = hwVar.m6436();
        if (listM6507 == null) {
            return null;
        }
        Iterator it = listM6507.iterator();
        hv hvVarM6517 = null;
        while (it.hasNext()) {
            hv hvVarM6506 = m6506(objMo6430, it.next(), hvVar);
            htVarM6436.m6422();
            hvVarM6517 = m6517(hvVarM6506, hwVar, i10);
            if (hvVarM6517 != null) {
                int i23 = f2462 + 59;
                f2463 = i23 % 128;
                if (i23 % 2 == 0) {
                    hwVar.m6437();
                    throw null;
                }
                if (!hwVar.m6437()) {
                    int i24 = f2462 + 11;
                    f2463 = i24 % 128;
                    int i25 = i24 % 2;
                    return hvVarM6517;
                }
            }
            htVarM6436.m6424();
        }
        return hvVarM6517;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> hv<T> m6518(Object obj, hw<T> hwVar, int i10, hv hvVar) {
        int i11 = f2463 + 91;
        f2462 = i11 % 128;
        if (i11 % 2 != 0) {
            hwVar.m6439().m6461();
            throw null;
        }
        if (i10 != hwVar.m6439().m6461()) {
            int i12 = f2462;
            int i13 = i12 + 17;
            f2463 = i13 % 128;
            int i14 = i13 % 2;
            if (obj != null) {
                int i15 = i12 + 39;
                f2463 = i15 % 128;
                int i16 = i15 % 2;
                if (!(hwVar.m6438().contains(obj))) {
                    int i17 = f2463 + 15;
                    f2462 = i17 % 128;
                    int i18 = i17 % 2;
                    if (i10 <= 0 || !(obj instanceof Activity)) {
                        hwVar.m6438().add(obj);
                        try {
                            Field[] fieldArrMo6340 = hwVar.m6439().m6464() != null ? hwVar.m6439().m6464().mo6340(obj) : m6510(obj.getClass(), hwVar.m6439().m6457(i10));
                            ht htVarM6436 = hwVar.m6436();
                            for (Field field : fieldArrMo6340) {
                                field.setAccessible(true);
                                htVarM6436.m6423(field);
                                hv<T> hvVarM6517 = m6517(m6512(field, obj, hvVar), hwVar, i10);
                                if (hvVarM6517 != null) {
                                    if ((!hwVar.m6437() ? 'R' : '(') != '(') {
                                        return hvVarM6517;
                                    }
                                }
                                htVarM6436.m6421(field);
                            }
                            int i19 = f2462 + 1;
                            f2463 = i19 % 128;
                            int i20 = i19 % 2;
                        } catch (Throwable th2) {
                            k.m6906(m6522((String) null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m6513(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1082011640, 1374541143, 437445677, -1579277629, -1379548377, -2010087012, -1753696167, 1477608565}, ExpandableListView.getPackedPositionChild(0L) + 26).intern(), th2);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> hv<T> m6519(Object obj, List<Field> list, hv hvVar) throws IllegalAccessException {
        Object obj2;
        int i10 = f2463 + 69;
        f2462 = i10 % 128;
        if (i10 % 2 != 0) {
            list.iterator();
            throw null;
        }
        int i11 = f2463 + 51;
        f2462 = i11 % 128;
        int i12 = i11 % 2;
        for (Field field : list) {
            if ((WeakReference.class.isAssignableFrom(field.getType()) ? '4' : 'D') != 'D') {
                int i13 = f2463 + 47;
                f2462 = i13 % 128;
                int i14 = i13 % 2;
                obj2 = ((WeakReference) field.get(obj)).get();
            } else {
                obj2 = field.get(obj);
            }
            hvVar = m6512(field, obj, hvVar);
            obj = obj2;
        }
        int i15 = f2463 + 113;
        f2462 = i15 % 128;
        if ((i15 % 2 != 0 ? (char) 14 : '\n') == '\n') {
            return hvVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> T m6520(Class cls, Object obj, ho hoVar, T t10) {
        int i10 = f2462 + 113;
        f2463 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Field fieldM6375 = hu.m6425().m6428().m6375(cls, hoVar);
            if (fieldM6375 == null) {
                return t10;
            }
            T t11 = (T) fieldM6375.get(obj);
            int i12 = f2463 + 41;
            f2462 = i12 % 128;
            if ((i12 % 2 != 0 ? '\f' : 'X') != '\f') {
                return t11;
            }
            throw null;
        } catch (Throwable unused) {
            String strIntern = m6522((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6513(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1597475101, -188208045}, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
            sb2.append(hoVar.m6351());
            sb2.append(m6522((String) null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m6513(new int[]{-1227658563, -1190981675, 49833950, 35684323}, 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
            k.m6886(strIntern, sb2.toString());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m6521(java.lang.Object r9, java.lang.Class r10, java.lang.String r11) {
        /*
            r8 = this;
        L0:
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            r3 = 0
            if (r2 == 0) goto Lb
            goto L1b
        Lb:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r10.equals(r2)
            r4 = 54
            if (r2 != 0) goto L17
            r2 = r4
            goto L19
        L17:
            r2 = 66
        L19:
            if (r2 == r4) goto L1c
        L1b:
            return r3
        L1c:
            java.lang.reflect.Field[] r2 = m6509(r10)
            int r4 = r2.length
            r5 = r0
        L22:
            if (r5 >= r4) goto L71
            r6 = r2[r5]
            r6.setAccessible(r1)
            java.lang.Object r6 = r6.get(r9)     // Catch: java.lang.Exception -> L64
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L64
            if (r6 == 0) goto L33
            r7 = r1
            goto L34
        L33:
            r7 = r0
        L34:
            if (r7 == 0) goto L64
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r11)     // Catch: java.lang.Exception -> L64
            java.util.regex.Matcher r7 = r7.matcher(r6)     // Catch: java.lang.Exception -> L64
            boolean r7 = r7.matches()     // Catch: java.lang.Exception -> L64
            if (r7 == 0) goto L64
            int r9 = com.ironsource.adqualitysdk.sdk.i.hz.f2462
            int r9 = r9 + 29
            int r10 = r9 % 128
            com.ironsource.adqualitysdk.sdk.i.hz.f2463 = r10
            int r9 = r9 % 2
            int r10 = r10 + 25
            int r9 = r10 % 128
            com.ironsource.adqualitysdk.sdk.i.hz.f2462 = r9
            int r10 = r10 % 2
            r9 = 38
            if (r10 == 0) goto L5c
            r10 = r9
            goto L5e
        L5c:
            r10 = 8
        L5e:
            if (r10 == r9) goto L61
            return r6
        L61:
            throw r3     // Catch: java.lang.Throwable -> L62
        L62:
            r9 = move-exception
            throw r9
        L64:
            int r5 = r5 + 1
            int r6 = com.ironsource.adqualitysdk.sdk.i.hz.f2462
            int r6 = r6 + 63
            int r7 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.hz.f2463 = r7
            int r6 = r6 % 2
            goto L22
        L71:
            java.lang.Class r10 = r10.getSuperclass()
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hz.m6521(java.lang.Object, java.lang.Class, java.lang.String):java.lang.String");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6522(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2465;
            int i11 = f2464;
            if (f2466) {
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
            if (f2467) {
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Object> m6523(Class cls, Object obj, ho hoVar) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = hu.m6425().m6428().m6377(cls, hoVar).iterator();
            int i10 = f2463 + 87;
            f2462 = i10 % 128;
            int i11 = i10 % 2;
            while (true) {
                if (!(it.hasNext())) {
                    break;
                }
                int i12 = f2463 + 5;
                f2462 = i12 % 128;
                int i13 = i12 % 2;
                arrayList.add(it.next().get(obj));
            }
        } catch (Throwable unused) {
            String strIntern = m6522((String) null, 127 - TextUtils.indexOf("", "", 0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6513(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1597475101, -188208045}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14).intern());
            sb2.append(hoVar.m6351());
            sb2.append(m6522((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m6513(new int[]{-1227658563, -1190981675, 49833950, 35684323}, MotionEvent.axisFromString("") + 7).intern());
            k.m6886(strIntern, sb2.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m6524(ia iaVar, hv hvVar) {
        int i10 = f2463 + 95;
        f2462 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                iaVar.mo5942(hvVar);
                throw null;
            }
            boolean zMo5942 = iaVar.mo5942(hvVar);
            int i11 = f2462 + 65;
            f2463 = i11 % 128;
            if (i11 % 2 != 0) {
                return zMo5942;
            }
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m6525(hv hvVar, Object obj, String str) {
        int i10 = f2463 + 91;
        f2462 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 4 : (char) 18) != 18) {
            throw null;
        }
        if (hvVar == null) {
            String strIntern = m6522((String) null, Color.alpha(0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(m6513(new int[]{1984592391, 1232721020}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern());
            sb2.append(str);
            k.m6885(strIntern, sb2.toString());
            return;
        }
        String strIntern2 = m6522((String) null, TextUtils.indexOf((CharSequence) "", '0') + 128, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(m6513(new int[]{1984592391, 1232721020}, 2 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb3.append(str);
        sb3.append(m6513(new int[]{545079718, -884987865, -272923517, 535263954}, (ViewConfiguration.getLongPressTimeout() >> 16) + 8).intern());
        sb3.append(hvVar.mo6430());
        k.m6885(strIntern2, sb3.toString());
        int i11 = f2462 + 101;
        f2463 = i11 % 128;
        if ((i11 % 2 == 0 ? 'V' : '-') == '-') {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (m6524(r19.m6455(), r6) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (m6524(r19.m6455(), r6) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r2 = new java.lang.StringBuilder();
        r2.append(m6513(new int[]{1857419887, -1178320534, -2102558973, 301600277, 1729643396, -1474478369, -853871098, -1916766595, 1862184034, 486974620}, android.graphics.Color.rgb(0, 0, 0) + 16777235).intern());
        r2.append(java.lang.System.currentTimeMillis() - r3);
        r2.append(m6513(new int[]{191332316, 1435805943}, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern());
        m6525(r6, r18, r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        return r6;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.ironsource.adqualitysdk.sdk.i.hv<T> m6526(java.lang.Object r18, com.ironsource.adqualitysdk.sdk.i.hy r19) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hz.m6526(java.lang.Object, com.ironsource.adqualitysdk.sdk.i.hy):com.ironsource.adqualitysdk.sdk.i.hv");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6527(Class cls, String str) {
        int i10 = f2462 + 93;
        f2463 = i10 % 128;
        if ((i10 % 2 == 0 ? '\f' : ')') == ')') {
            return m6521((Object) null, cls, str);
        }
        m6521((Object) null, cls, str);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final <T> hv<T> m6528(Object obj, ia iaVar, hm hmVar, List<String> list, int i10) {
        hv<T> hvVarM6526 = m6526(obj, new hy.c().m6503(true).m6496(iaVar, hmVar, list, i10));
        int i11 = f2463 + 45;
        f2462 = i11 % 128;
        int i12 = i11 % 2;
        return hvVarM6526;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<hv> m6529(Object obj, hy hyVar) {
        hw hwVar = new hw(hyVar);
        hwVar.m6433();
        m6518(obj, hwVar, 0, (hv) null);
        ArrayList arrayList = new ArrayList(hwVar.m6431());
        int i10 = f2462 + 55;
        f2463 = i10 % 128;
        int i11 = i10 % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m6530(Object obj, List<String> list, int i10) {
        hw hwVar = new hw(new hy.c().m6500(true).m6505(true).m6498(true).m6493(-1).m6501(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.hz.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo5942(hv hvVar) {
                return hvVar.mo6430() instanceof String;
            }
        }, list, i10));
        hwVar.m6433();
        m6518(obj, hwVar, 0, (hv) null);
        ArrayList arrayList = new ArrayList(hwVar.m6432());
        int i11 = f2462 + 117;
        f2463 = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6531(Object obj, String str) {
        int i10 = f2463 + 63;
        f2462 = i10 % 128;
        if (i10 % 2 != 0) {
            m6521(obj, obj.getClass(), str);
            throw null;
        }
        String strM6521 = m6521(obj, obj.getClass(), str);
        int i11 = f2462 + 69;
        f2463 = i11 % 128;
        int i12 = i11 % 2;
        return strM6521;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6532(Object obj, JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int i10 = f2463 + 89;
        int i11 = i10 % 128;
        f2462 = i11;
        int i12 = i10 % 2;
        int i13 = 0;
        int i14 = i11 + 83;
        f2463 = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            if ((i13 < jSONArray.length() ? '\\' : 'Q') != '\\') {
                return null;
            }
            String strM6531 = m6531(obj, jSONArray.optString(i13));
            if ((strM6531 != null ? '7' : 'Z') == '7') {
                return strM6531;
            }
            i13++;
        }
    }
}
