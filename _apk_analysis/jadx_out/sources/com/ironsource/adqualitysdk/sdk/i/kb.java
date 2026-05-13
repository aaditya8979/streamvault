package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class kb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2974 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2975;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2976;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<a, Method> f2977;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2978;

    public static class a {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2979 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2980 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2981 = 5943164199102125346L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2982;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f2983;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private List<Class> f2984;

        public a(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f2982 = (Class) obj;
            } else {
                this.f2982 = obj.getClass();
            }
            this.f2983 = str;
            this.f2984 = list;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m6934(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2306) {
                char[] cArrM6319 = h.m6319(f2981, cArr, i10);
                h.f2307 = 4;
                while (true) {
                    int i11 = h.f2307;
                    if (i11 < cArrM6319.length) {
                        h.f2305 = i11 - 4;
                        cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f2981));
                        h.f2307++;
                    } else {
                        str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                    }
                }
            }
            return str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                int i10 = f2979 + 63;
                f2980 = i10 % 128;
                int i11 = i10 % 2;
                if (a.class == obj.getClass()) {
                    a aVar = (a) obj;
                    if (!this.f2982.equals(aVar.f2982)) {
                        int i12 = f2979 + 7;
                        f2980 = i12 % 128;
                        return (i12 % 2 != 0 ? 'F' : 'C') == 'F';
                    }
                    if (this.f2983.equals(aVar.f2983)) {
                        return this.f2984.equals(aVar.f2984);
                    }
                    int i13 = f2980 + 89;
                    f2979 = i13 % 128;
                    int i14 = i13 % 2;
                    return false;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i10 = f2979 + 39;
            f2980 = i10 % 128;
            int i11 = i10 % 2;
            int iHashCode = (((this.f2982.hashCode() * 31) + this.f2983.hashCode()) * 31) + this.f2984.hashCode();
            int i12 = f2980 + 35;
            f2979 = i12 % 128;
            if ((i12 % 2 == 0 ? 'S' : '[') != 'S') {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(m6934("\udd4c\udd01馏\ue908姛賈쌸曕覫\uf041鞀쩐琺⟔㨲뇄₠譜캻敋輗", ViewConfiguration.getTouchSlop() >> 8).intern());
            sb2.append(m6934("텒턿四捵寨䎶䥓擤薿㼒᷍졅砮\ue888끒돭\u2cf7", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern());
            sb2.append(this.f2982);
            sb2.append(m6934("笀第럺᭜膧ꋸㅵ뺌\u2fed\ude24旸ሦ퉴আ졩榼蛽ꕽ㲧", Process.getGidForName("") + 1).intern());
            sb2.append(this.f2983);
            sb2.append('\'');
            sb2.append(m6934("ᦴᦘ朩昿厴爫䰖沓䵎\u0ee4ᢰ쀶냅\ud968딘뮧\ue45f疮", ViewConfiguration.getWindowTouchSlop() >> 8).intern());
            sb2.append(this.f2984);
            sb2.append('}');
            String string = sb2.toString();
            int i10 = f2980 + 69;
            f2979 = i10 % 128;
            int i11 = i10 % 2;
            return string;
        }
    }

    static {
        m6928();
        f2977 = new ConcurrentHashMap();
        int i10 = f2976 + 123;
        f2974 = i10 % 128;
        if (i10 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Method m6915(Class cls, String str, List<Object> list, boolean z10) {
        Method method;
        int i10 = f2974 + 71;
        f2976 = i10 % 128;
        int i11 = i10 % 2;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i12 = f2974 + 9;
        f2976 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                return null;
            }
            method = methods[i14];
            if ((method.getName().equals(str) ? ',' : (char) 24) == ',') {
                int i15 = f2976 + 95;
                f2974 = i15 % 128;
                int i16 = i15 % 2;
                if (method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z10) {
                    int i17 = f2976 + 123;
                    f2974 = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = 35 / 0;
                        if ((m6929(method, list) ? (char) 31 : (char) 24) != 24) {
                            break;
                        }
                    } else if (m6929(method, list)) {
                        break;
                    }
                }
            }
            i14++;
        }
        int i19 = f2974 + 49;
        f2976 = i19 % 128;
        int i20 = i19 % 2;
        return method;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Method m6916(Object obj, String str, List<Object> list) {
        int i10 = f2974 + 59;
        f2976 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        Class<?> cls = obj.getClass();
        return !z10 ? m6915(cls, str, list, true) : m6915(cls, str, list, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m6917(java.lang.Class r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kb.m6917(java.lang.Class, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m6918(java.lang.Class[] r6, java.util.List<java.lang.Object> r7) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.kb.f2974
            int r0 = r0 + 61
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.kb.f2976 = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == r2) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r3 = r6.length
            if (r0 >= r3) goto L4d
            java.lang.Object r3 = r7.get(r0)
            r4 = 50
            if (r3 != 0) goto L24
            r5 = 53
            goto L25
        L24:
            r5 = r4
        L25:
            if (r5 == r4) goto L36
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r5 = r6[r0]
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 == 0) goto L33
            r4 = r1
            goto L34
        L33:
            r4 = r2
        L34:
            if (r4 == r2) goto L49
        L36:
            if (r3 == 0) goto L4a
            r4 = r6[r0]
            boolean r3 = m6917(r4, r3)
            r4 = 16
            if (r3 != 0) goto L44
            r3 = r4
            goto L46
        L44:
            r3 = 27
        L46:
            if (r3 == r4) goto L49
            goto L4a
        L49:
            return r1
        L4a:
            int r0 = r0 + 1
            goto L16
        L4d:
            int r6 = com.ironsource.adqualitysdk.sdk.i.kb.f2976
            int r6 = r6 + 37
            int r7 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.kb.f2974 = r7
            int r6 = r6 % 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kb.m6918(java.lang.Class[], java.util.List):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Method m6919(Object obj, String str, List<Object> list) {
        Method methodM6916;
        a aVar = new a(obj, str, m6920(list));
        Method method = f2977.get(aVar);
        if ((method != null ? 'L' : '%') != '%') {
            if (m6918(method.getParameterTypes(), list)) {
                int i10 = f2974 + 7;
                f2976 = i10 % 128;
                int i11 = i10 % 2;
                return method;
            }
            String strIntern = m6927(ViewConfiguration.getLongPressTimeout() >> 16, (char) (View.MeasureSpec.getMode(0) + 48731), TextUtils.getTrimmedLength("") + 15).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6927((Process.myTid() >> 22) + 31, (char) (ExpandableListView.getPackedPositionType(0L) + 58399), MotionEvent.axisFromString("") + 29).intern());
            sb2.append(aVar);
            co.m5699(strIntern, sb2.toString(), null);
            int i12 = f2974 + 81;
            f2976 = i12 % 128;
            int i13 = i12 % 2;
        }
        if ((obj instanceof Class ? (char) 7 : (char) 15) != 15) {
            int i14 = f2976 + 41;
            f2974 = i14 % 128;
            int i15 = i14 % 2;
            methodM6916 = m6915((Class) obj, str, list, true);
            if (methodM6916 == null) {
                int i16 = f2974 + 55;
                f2976 = i16 % 128;
                int i17 = i16 % 2;
                methodM6916 = m6916(Class.class, str, list);
            }
        } else {
            methodM6916 = m6916(obj, str, list);
        }
        if (methodM6916 != null) {
            int i18 = f2974 + 9;
            f2976 = i18 % 128;
            if (i18 % 2 != 0) {
                f2977.put(aVar, methodM6916);
                int i19 = 86 / 0;
            } else {
                f2977.put(aVar, methodM6916);
            }
        }
        return methodM6916;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<Class> m6920(List<Object> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (true) {
            if ((it.hasNext() ? '\r' : (char) 1) != '\r') {
                return arrayList;
            }
            int i10 = f2974 + 33;
            f2976 = i10 % 128;
            if (i10 % 2 == 0) {
                next = it.next();
                if (next != null) {
                    arrayList.add(next.getClass());
                    int i11 = f2976 + 93;
                    f2974 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    arrayList.add(Object.class);
                }
            } else {
                next = it.next();
                int i13 = 68 / 0;
                if (next != null) {
                    arrayList.add(next.getClass());
                    int i112 = f2976 + 93;
                    f2974 = i112 % 128;
                    int i122 = i112 % 2;
                } else {
                    arrayList.add(Object.class);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6921(java.lang.Class r9, java.util.List<java.lang.String> r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kb.m6921(java.lang.Class, java.util.List):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m6922(Constructor constructor, List<Object> list) {
        int i10 = f2976 + 125;
        f2974 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'L' : 'N';
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (c10 != 'L') {
            return m6918(parameterTypes, list);
        }
        boolean zM6918 = m6918(parameterTypes, list);
        int i11 = 30 / 0;
        return zM6918;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field[] m6923(Field[] fieldArr, Field[] fieldArr2) {
        int i10 = f2974 + 119;
        f2976 = i10 % 128;
        int i11 = i10 % 2;
        int length = fieldArr.length;
        int length2 = fieldArr2.length;
        Field[] fieldArr3 = new Field[length + length2];
        System.arraycopy(fieldArr, 0, fieldArr3, 0, length);
        System.arraycopy(fieldArr2, 0, fieldArr3, length, length2);
        int i12 = f2976 + 71;
        f2974 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return fieldArr3;
        }
        int i13 = 28 / 0;
        return fieldArr3;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Class m6924(String str, boolean z10) {
        try {
            Class<?> cls = Class.forName(str);
            int i10 = f2976 + 81;
            f2974 = i10 % 128;
            int i11 = i10 % 2;
            return cls;
        } catch (Throwable th2) {
            if (z10) {
                String strIntern = m6927(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (48731 - (ViewConfiguration.getTouchSlop() >> 8)), 15 - (ViewConfiguration.getTapTimeout() >> 16)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6927(16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (33366 - Gravity.getAbsoluteGravity(0, 0)), 6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
                sb2.append(str);
                sb2.append(m6927(21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9).intern());
                co.m5699(strIntern, sb2.toString(), th2);
            }
            int i12 = f2974 + 69;
            f2976 = i12 % 128;
            int i13 = i12 % 2;
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m6925(Class cls, List<Object> list) throws Exception {
        int i10 = f2974 + 23;
        f2976 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 27 : 'K';
        Constructor constructorM6933 = m6933(cls, list);
        Object[] array = list.toArray();
        if (c10 == 27) {
            constructorM6933.newInstance(array);
            throw null;
        }
        Object objNewInstance = constructorM6933.newInstance(array);
        int i11 = f2974 + 23;
        f2976 = i11 % 128;
        int i12 = i11 % 2;
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Method m6926(Object obj, String str, List<Class> list) {
        int i10 = f2974 + 31;
        f2976 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? '`' : 'P') != 'P') {
                m6930(list);
                boolean z10 = obj instanceof Class;
                throw null;
            }
            Class<?>[] clsArrM6930 = m6930(list);
            if (!(obj instanceof Class)) {
                Method method = obj.getClass().getMethod(str, clsArrM6930);
                int i11 = f2974 + 1;
                f2976 = i11 % 128;
                int i12 = i11 % 2;
                return method;
            }
            try {
                obj = ((Class) obj).getMethod(str, clsArrM6930);
                int i13 = f2974 + 111;
                f2976 = i13 % 128;
                if (i13 % 2 == 0) {
                    return obj;
                }
                throw null;
            } catch (NoSuchMethodException unused) {
                return Class.class.getMethod(str, clsArrM6930);
            }
        } catch (NoSuchMethodException e10) {
            String strIntern = m6927(TextUtils.lastIndexOf("", '0') + 1, (char) (ExpandableListView.getPackedPositionChild(0L) + 48732), 15 - KeyEvent.keyCodeFromString("")).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m6927((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 26168), TextUtils.indexOf("", "", 0) + 4).intern());
            sb2.append(str);
            sb2.append(m6927((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 60671), TextUtils.getTrimmedLength("") + 19).intern());
            sb2.append(obj);
            co.m5699(strIntern, sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6927(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2978[i10 + i12]) ^ (((long) i12) * f2975)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m6928() {
        f2978 = new char[]{48649, 6069, 60715, 17046, 6162, 61839, 18285, 7423, 62060, 19414, 8544, 63190, 19638, 8760, 64434, 33301, 11185, 53537, 32388, 9225, 52673, ' ', 43493, 21369, 64725, 42508, 20433, 63789, 41656, 19510, 62855, 58458, 19942, 46971, 6353, 16961, 43912, 7482, 18103, 43059, 4488, 31512, 44168, 5884, 30768, 41446, 2907, 31948, 42572, 4028, 28970, 56035, 3093, 30088, 57110, 383, 27363, 56421, 1430, 26230, 53212, 13582, 39614, 60633, 17749, 49029, 4154, 19110, 41761, 5587, 20055, 41094, 6523, 29695, 42098, 7700, 28821, 43332, 957, 29729, 44727, 1816, 'c', 43492, 21371, 64655, 42565, 20421, 63789, 41635, 19499, 62860, 40731, 18571, 62183, 40042, 17844, 61252, 39124, 16970, 60339, 38192, 16048, 59406, 37254, 15108};
        f2975 = -4185486480735295093L;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m6929(Method method, List<Object> list) {
        int i10 = f2974 + 85;
        f2976 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM6918 = m6918(method.getParameterTypes(), list);
        int i12 = f2976 + 109;
        f2974 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 3 : '>') != 3) {
            return zM6918;
        }
        int i13 = 40 / 0;
        return zM6918;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Class[] m6930(List<Class> list) {
        Class[] clsArr;
        int i10;
        int i11 = f2974 + 51;
        f2976 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            clsArr = new Class[list.size()];
            i10 = 0;
        } else {
            clsArr = new Class[list.size()];
            i10 = 1;
        }
        while (true) {
            if (i10 >= list.size()) {
                return clsArr;
            }
            int i12 = f2976 + 49;
            f2974 = i12 % 128;
            int i13 = i12 % 2;
            clsArr[i10] = list.get(i10);
            i10++;
            int i14 = f2974 + 91;
            f2976 = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Method[] m6931(Method[] methodArr, Method[] methodArr2) {
        int i10 = f2974 + 109;
        f2976 = i10 % 128;
        int i11 = i10 % 2;
        int length = methodArr.length;
        int length2 = methodArr2.length;
        Method[] methodArr3 = new Method[length + length2];
        System.arraycopy(methodArr, 0, methodArr3, 0, length);
        System.arraycopy(methodArr2, 0, methodArr3, length, length2);
        int i12 = f2976 + 65;
        f2974 = i12 % 128;
        if ((i12 % 2 == 0 ? '\\' : (char) 3) == 3) {
            return methodArr3;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m6932(Class cls, List<Object> list, Class... clsArr) throws Exception {
        int i10 = f2976 + 83;
        f2974 = i10 % 128;
        int i11 = i10 % 2;
        Object objNewInstance = cls.getConstructor(clsArr).newInstance(list.toArray());
        int i12 = f2976 + 19;
        f2974 = i12 % 128;
        int i13 = i12 % 2;
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Constructor m6933(Class cls, List<Object> list) {
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i10 = 0;
        while (true) {
            if (!(i10 < length)) {
                int i11 = f2974 + 21;
                f2976 = i11 % 128;
                int i12 = i11 % 2;
                return null;
            }
            int i13 = f2974 + 67;
            f2976 = i13 % 128;
            int i14 = i13 % 2;
            Constructor<?> constructor = constructors[i10];
            if (constructor.getParameterTypes().length == list.size()) {
                int i15 = f2976 + 3;
                f2974 = i15 % 128;
                if (!(i15 % 2 != 0)) {
                    m6922(constructor, list);
                    throw null;
                }
                if ((m6922(constructor, list) ? '(' : '\'') == '(') {
                    return constructor;
                }
            }
            i10++;
        }
    }
}
